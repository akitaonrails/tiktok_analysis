package X;

import Y.AComparatorS45S0000000_26;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0uIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698570uIp {
    public C1699070uJd LJII;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final /* synthetic */ LiveLoggerService LJIILL;
    public final List<C1699020uJY> LIZ = new ArrayList();
    public final List<C1699020uJY> LIZIZ = new ArrayList();
    public final List<C1699020uJY> LIZJ = new ArrayList();
    public final List<C1699020uJY> LIZLLL = new ArrayList();
    public final List<C1699020uJY> LJ = new ArrayList();
    public final List<C1699010uJX> LJFF = new ArrayList();
    public final List<C1699010uJX> LJI = new ArrayList();
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;

    public final long LJIIIIZZ() {
        C1698490uIh c1698490uIh;
        LiveLoggerService liveLoggerService = this.LJIILL;
        long j = liveLoggerService.LLLZZIL;
        if (j <= 0) {
            j = liveLoggerService.LLLZZ;
        }
        if (j <= 0 && (c1698490uIh = liveLoggerService.LLILLL) != null) {
            j = c1698490uIh.LJIIZILJ;
            if (j <= 0) {
                j = c1698490uIh.LJIJ;
            }
        }
        return Math.max(j, 0L);
    }

    public final void LJIIJ() {
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZJ).clear();
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LJ).clear();
        ((ArrayList) this.LJFF).clear();
        ((ArrayList) this.LJI).clear();
        this.LJII = null;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
    }

    public C1698570uIp(LiveLoggerService liveLoggerService) {
        this.LJIILL = liveLoggerService;
    }

    public static List LJ(List list) {
        ArrayList<C1699020uJY> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return list;
        }
        Collections.sort(list, new AComparatorS45S0000000_26(3));
        ArrayList arrayList2 = new ArrayList();
        for (C1699020uJY c1699020uJY : arrayList) {
            if (c1699020uJY.LIZIZ > c1699020uJY.LIZ) {
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new C1699020uJY(c1699020uJY.LIZ, c1699020uJY.LIZIZ, c1699020uJY.LIZJ));
                } else {
                    boolean z = true;
                    C1699020uJY c1699020uJY2 = (C1699020uJY) ListProtector.get(arrayList2, arrayList2.size() - 1);
                    long j = c1699020uJY.LIZ;
                    if (j == c1699020uJY2.LIZ && c1699020uJY.LIZIZ == c1699020uJY2.LIZIZ) {
                        if (!c1699020uJY2.LIZJ && !c1699020uJY.LIZJ) {
                            z = false;
                        }
                        c1699020uJY2.LIZJ = z;
                    } else {
                        arrayList2.add(new C1699020uJY(j, c1699020uJY.LIZIZ, c1699020uJY.LIZJ));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final void LJI(long j) {
        if (this.LJIILIIL) {
            ((ArrayList) this.LIZIZ).clear();
        } else {
            LJFF(j, this.LIZIZ, this.LIZLLL);
        }
    }

    public final void LJII(long j) {
        if (this.LJIIL) {
            ((ArrayList) this.LIZ).clear();
        } else {
            LJFF(j, this.LIZ, this.LIZJ);
        }
    }

    public final void LIZ(String str, boolean z) {
        List<C1699020uJY> list;
        boolean z2;
        if (!TextUtils.isEmpty(str) && !"none".equals(str)) {
            if (z) {
                list = this.LIZ;
            } else {
                list = this.LIZIZ;
            }
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    C1699020uJY c1699020uJY = (C1699020uJY) ListProtector.get(list, i);
                    if (c1699020uJY != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("{");
                        sbLIZ.append(c1699020uJY.LIZ);
                        sbLIZ.append(":");
                        sbLIZ.append(c1699020uJY.LIZIZ);
                        sbLIZ.append(",snapshot=");
                        sbLIZ.append(c1699020uJY.LIZJ);
                        sbLIZ.append("}");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            for (String str2 : str.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    String[] strArrSplit = str2.split(":");
                    if (strArrSplit.length >= 2) {
                        try {
                            long j = CastLongProtector.parseLong(strArrSplit[0].trim());
                            long j2 = CastLongProtector.parseLong(strArrSplit[1].trim());
                            if (j2 > 0) {
                                long j3 = j2 + j;
                                if (strArrSplit.length >= 3 && TextUtils.equals(strArrSplit[2].trim(), "truncated")) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (j3 > j) {
                                    list.add(new C1699020uJY(j, j3, z2));
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        }
    }

    public static void LJFF(long j, List list, List list2) {
        boolean z;
        ArrayList<C1699020uJY> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C1699020uJY c1699020uJY : arrayList) {
            long jMin = Math.min(c1699020uJY.LIZIZ, j);
            long j2 = c1699020uJY.LIZ;
            if (jMin > j2) {
                if (!c1699020uJY.LIZJ && c1699020uJY.LIZIZ <= j) {
                    z = false;
                } else {
                    z = true;
                }
                ((ArrayList) list2).add(new C1699020uJY(j2, jMin, z));
            }
        }
        arrayList.clear();
    }

    public static void LIZJ(List list, List list2, long j, long j2) {
        for (C1699020uJY c1699020uJY : (ArrayList) list) {
            long jMax = Math.max(c1699020uJY.LIZ, j);
            long jMin = Math.min(c1699020uJY.LIZIZ, j2);
            if (jMin > jMax) {
                ((ArrayList) list2).add(new C1699020uJY(jMax, jMin, c1699020uJY.LIZJ));
            }
        }
    }

    public static void LJIIIZ(JSONObject jSONObject, boolean z, List list, long j) {
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(e3.e);
        for (int i = 0; i < list.size(); i++) {
            C1699020uJY c1699020uJY = (C1699020uJY) ListProtector.get(list, i);
            if (i > 0) {
                sb.append(',');
            }
            long jMax = Math.max(0L, c1699020uJY.LIZ - j);
            long j2 = c1699020uJY.LIZIZ - c1699020uJY.LIZ;
            sb.append(jMax);
            sb.append(':');
            sb.append(j2);
        }
        sb.append(']');
        try {
            if (z) {
                jSONObject.put("new_video_render_stall_series", sb.toString());
            } else {
                jSONObject.put("new_audio_render_stall_series", sb.toString());
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(List list, long j, long j2, boolean z) {
        for (C1699020uJY c1699020uJY : (ArrayList) this.LJ) {
            LIZIZ(c1699020uJY.LIZ, c1699020uJY.LIZIZ, c1699020uJY.LIZJ, z, j, j2, list);
        }
        C1699070uJd c1699070uJd = this.LJII;
        if (c1699070uJd != null) {
            LIZIZ(c1699070uJd.LIZ, j2, true, z, j, j2, list);
        }
    }

    public final void LIZIZ(long j, long j2, boolean z, boolean z2, long j3, long j4, List<C1699020uJY> list) {
        long jMax = Math.max(j, j3);
        long jMin = Math.min(j2, j4);
        if (jMin <= jMax) {
            return;
        }
        if (!z2) {
            ArrayList<C1699010uJX> arrayList = new ArrayList();
            for (C1699010uJX c1699010uJX : (ArrayList) this.LJI) {
                long jMax2 = Math.max(jMax, c1699010uJX.LIZ);
                long jMin2 = Math.min(jMin, c1699010uJX.LIZIZ);
                if (jMin2 > jMax2) {
                    arrayList.add(new C1699010uJX(jMax2, jMin2));
                }
            }
            if (this.LJIILIIL) {
                long j5 = this.LJIIIZ;
                if (j5 >= 0) {
                    long jMax3 = Math.max(jMax, j5);
                    if (jMin > jMax3) {
                        arrayList.add(new C1699010uJX(jMax3, jMin));
                    }
                }
            }
            Collections.sort(arrayList, new AComparatorS45S0000000_26(5));
            for (C1699010uJX c1699010uJX2 : arrayList) {
                long j6 = c1699010uJX2.LIZ;
                if (j6 > jMax) {
                    ((ArrayList) list).add(new C1699020uJY(jMax, Math.min(j6, jMin), z));
                }
                jMax = Math.max(jMax, c1699010uJX2.LIZIZ);
                if (jMax >= jMin) {
                    break;
                }
            }
            if (jMax < jMin) {
                ((ArrayList) list).add(new C1699020uJY(jMax, jMin, z));
                return;
            }
            return;
        }
        ArrayList<C1699010uJX> arrayList2 = new ArrayList();
        for (C1699010uJX c1699010uJX3 : (ArrayList) this.LJFF) {
            long jMax4 = Math.max(jMax, c1699010uJX3.LIZ);
            long jMin3 = Math.min(jMin, c1699010uJX3.LIZIZ);
            if (jMin3 > jMax4) {
                arrayList2.add(new C1699010uJX(jMax4, jMin3));
            }
        }
        if (this.LJIIL) {
            long j7 = this.LJIIIIZZ;
            if (j7 >= 0) {
                long jMax5 = Math.max(jMax, j7);
                if (jMin > jMax5) {
                    arrayList2.add(new C1699010uJX(jMax5, jMin));
                }
            }
        }
        Collections.sort(arrayList2, new AComparatorS45S0000000_26(4));
        for (C1699010uJX c1699010uJX4 : arrayList2) {
            long j8 = c1699010uJX4.LIZ;
            if (j8 > jMax) {
                ((ArrayList) list).add(new C1699020uJY(jMax, Math.min(j8, jMin), z));
            }
            jMax = Math.max(jMax, c1699010uJX4.LIZIZ);
            if (jMax >= jMin) {
                break;
            }
        }
        if (jMax < jMin) {
            ((ArrayList) list).add(new C1699020uJY(jMax, jMin, z));
        }
    }
}
