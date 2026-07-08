package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212171Bi3 {
    public static volatile C2212171Bi3 LJ;
    public volatile long LIZ;
    public int LIZJ;
    public long LIZIZ = 20000;
    public boolean LIZLLL = true;

    public static C2212171Bi3 LJ() {
        if (LJ == null) {
            synchronized (C2212171Bi3.class) {
                try {
                    if (LJ == null) {
                        LJ = new C2212171Bi3();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212171Bi3.LJIIIZ():void");
    }

    public static boolean LIZIZ(C2212201Bi6 c2212201Bi6) {
        String str;
        C2212321BiI c2212321BiI = c2212201Bi6.LL;
        C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
        if (c2212321BiI != null && c2212321BiI.LIZJ() && C2212161Bi2.LJIJ(c2212321BiI.LIZLLL, c2212141Bi0LJIIIIZZ)) {
            C2212381BiO.LJ(c2212201Bi6.LLJI, "The image ad data is illegal or the resource already exists and will not be downloaded anymore");
            LJIIJJI(0, c2212201Bi6);
            return false;
        }
        HashMap<String, Object> map = new HashMap<>(1);
        if (c2212201Bi6.LJIIIIZZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_topview", str);
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "splash_start_download", null, map);
        return true;
    }

    public static void LJIIJ(C2212201Bi6 c2212201Bi6) {
        long j;
        String strLIZJ = C2212061Bhs.LIZIZ().LIZJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2212201Bi6 != null) {
            j = c2212201Bi6.LLJI;
            strLIZJ = c2212201Bi6.LLJJIJI;
            jCurrentTimeMillis = c2212201Bi6.LLILLJJLI;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", strLIZJ);
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(jCurrentTimeMillis));
            C2212051Bhr.LIZJ().LJFF("splash_ad", "launch_covered", jSONObject, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILL(List list) {
        if (!C804410Vh1.LIZIZ(C2212231Bi9.LJIILL) || C2212081Bhu.LIZ(list) || C2212231Bi9.LIZJ == null) {
            return;
        }
        try {
            if (C804410Vh1.LIZ(C2212231Bi9.LJIILL) == 0) {
                return;
            }
            for (C2212201Bi6 c2212201Bi6 : (ArrayList) list) {
                if (c2212201Bi6 != null && c2212201Bi6.LJIIJJI()) {
                    int i = c2212201Bi6.LLJL;
                    if (i != 0 && i != 1) {
                        if (i == 2) {
                            LJIILJJIL(2, c2212201Bi6);
                        }
                    } else {
                        LJIILJJIL(1, c2212201Bi6);
                        if (!C2212081Bhu.LIZ(c2212201Bi6.LLJJJJLIIL)) {
                            for (C2212201Bi6 c2212201Bi62 : (ArrayList) c2212201Bi6.LLJJJJLIIL) {
                                if (c2212201Bi62 != null && c2212201Bi62.LJIIJJI()) {
                                    LJIILJJIL(1, c2212201Bi62);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LJIILLIIL(C2212201Bi6 c2212201Bi6) {
        int i;
        C2212321BiI c2212321BiI = c2212201Bi6.LL;
        if (c2212321BiI == null || !c2212321BiI.LIZJ()) {
            return false;
        }
        if (!LIZIZ(c2212201Bi6)) {
            LIZLLL(c2212321BiI, c2212201Bi6);
            return false;
        }
        LIZLLL(c2212321BiI, c2212201Bi6);
        if (TextUtils.isEmpty(c2212321BiI.LJ)) {
            i = 1;
        } else {
            i = 3;
        }
        return LIZJ(c2212201Bi6, i, c2212321BiI.LIZLLL, c2212321BiI.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212171Bi3.LJIIZILJ(java.util.List):void");
    }

    public static void LIZ(long j, String str) {
        JSONArray jSONArray;
        try {
            if (!C2211541Bh2.LIZ(str) && j > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
                synchronized (C2212141Bi0.class) {
                    try {
                        String strLIZLLL = C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("splash_ad_local_cache_data");
                        if (C2211541Bh2.LIZ(strLIZLLL)) {
                            jSONArray = new JSONArray();
                        } else {
                            jSONArray = new JSONArray(strLIZLLL);
                        }
                        jSONArray.put(jSONObject);
                        C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
                        c2212141Bi0LJIIIIZZ.LIZJ.LJI("splash_ad_local_cache_data", jSONArray.toString());
                        c2212141Bi0LJIIIIZZ.LIZJ();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Exception th) {
        }
    }

    public static void LIZLLL(C2212321BiI c2212321BiI, C2212201Bi6 c2212201Bi6) {
        if (c2212321BiI.LIZIZ() && !C2212161Bi2.LJIJ(c2212321BiI.LJFF, C2212141Bi0.LJIIIIZZ()) && LIZJ(c2212201Bi6, 1, c2212321BiI.LJFF, c2212321BiI.LJI)) {
            C2212141Bi0.LJIIIIZZ().LJIJ(c2212321BiI.LJFF);
        }
    }

    public static void LJFF(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(C1293980jmG.LIZJ(str)));
            C2212291BiF.LIZLLL().LJII("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            C2212291BiF.LIZLLL().LJII("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static C2212611Bil LJIIIIZZ(C2212201Bi6 c2212201Bi6, boolean z) {
        C2212711Biv c2212711Biv = new C2212711Biv();
        c2212711Biv.LIZ = c2212201Bi6.LLJI;
        c2212711Biv.LIZIZ = c2212201Bi6.LLJJIJI;
        return new C2212611Bil(c2212711Biv);
    }

    public static void LJIIJJI(int i, C2212201Bi6 c2212201Bi6) {
        String str;
        HashMap<String, Object> map = new HashMap<>();
        map.put("reason", Integer.valueOf(i));
        if (C2212161Bi2.LJIJI(c2212201Bi6)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_topview", str);
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "splash_no_download", null, map);
    }

    public static void LJIILIIL(C2212201Bi6 c2212201Bi6, C2212201Bi6 c2212201Bi62) {
        if (c2212201Bi6 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", c2212201Bi6.LLJJIJI).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(c2212201Bi6.LLILLJJLI));
                if (c2212201Bi62 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(c2212201Bi62.LLJI));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                C2212051Bhr.LIZJ().LJFF("splash_ad", "boarding", jSONObject, c2212201Bi6.LLJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (c2212201Bi62 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", c2212201Bi62.LLJJIJI).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(c2212201Bi62.LLILLJJLI));
            if (c2212201Bi6 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(c2212201Bi6.LLJI));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", "covered", jSONObject3, c2212201Bi62.LLJI);
        }
    }

    public static void LJIILJJIL(int i, C2212201Bi6 c2212201Bi6) {
        new C2212711Biv();
        C2212231Bi9.LIZJ.getClass();
    }

    public static void LJII(String str, boolean z, boolean z2) {
        C2212121Bhy c2212121Bhy = C2212141Bi0.LJIIIIZZ().LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bda_splash");
        sbLIZ.append(str);
        int iLIZIZ = c2212121Bhy.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        long jLIZJ = C1293980jmG.LIZJ(str);
        int i = !z2 ? 1 : 0;
        if (z2) {
            C2212121Bhy c2212121Bhy2 = C2212141Bi0.LJIIIIZZ().LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bda_splash");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C2212111Bhx c2212111Bhx = c2212121Bhy2.LIZ;
            if (strLIZIZ == null) {
                c2212111Bhx.getClass();
            } else {
                c2212111Bhx.LIZIZ.remove(strLIZIZ);
            }
            c2212121Bhy2.LIZ();
        }
        C2212441BiU.LIZ().getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resource_type", z ? 1 : 0);
            jSONObject.put("resource_size", jLIZJ);
            jSONObject.put("download_count", iLIZIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2212291BiF.LIZLLL().LJII("bda_splash_download", i, jSONObject, null);
    }

    public static boolean LIZJ(C2212201Bi6 c2212201Bi6, int i, String str, List list) {
        boolean z;
        String str2;
        String strLJIILIIL = C2212161Bi2.LJIILIIL(str);
        if (TextUtils.isEmpty(strLJIILIIL)) {
            return false;
        }
        C2212141Bi0.LJIIIIZZ().LIZIZ(strLJIILIIL);
        if (C2212081Bhu.LIZIZ(list)) {
            C2212611Bil c2212611BilLJIIIIZZ = LJIIIIZZ(c2212201Bi6, false);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try to download images，url: ");
                if (str3 == null) {
                    str2 = "";
                } else {
                    str2 = str3;
                }
                sbLIZ.append(str2);
                C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str3 != null && !str3.isEmpty() && C2212231Bi9.LIZJ != null) {
                    try {
                        if (C2212331BiJ.LIZ(c2212611BilLJIIIIZZ, str3, strLJIILIIL)) {
                            LJI(1, System.currentTimeMillis() - jCurrentTimeMillis);
                            z = true;
                            break;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to download image, error: ");
                        sbLIZ2.append(e.getMessage());
                        C2212381BiO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        long j = c2212201Bi6.LLJI;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("whether the download is successful：");
        sbLIZ3.append(z);
        C2212381BiO.LJ(j, C2188811AlT.LIZIZ(sbLIZ3));
        if (z) {
            LIZ(c2212201Bi6.LJFF(), strLJIILIIL);
            LJIIL(c2212201Bi6, 0, false, i);
            LJFF(0, strLJIILIIL);
            LJII(strLJIILIIL, false, true);
            return z;
        }
        LJIIL(c2212201Bi6, 1, false, i);
        LJII(strLJIILIIL, false, false);
        return z;
    }

    public static void LJIIL(C2212201Bi6 c2212201Bi6, int i, boolean z, int i2) {
        String strLJIIJJI;
        String str;
        Object obj;
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map2 = new HashMap<>();
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 16) {
                        if (i != 17) {
                            strLJIIJJI = "";
                            str = "";
                        } else {
                            strLJIIJJI = C2212161Bi2.LJIIZILJ(c2212201Bi6.LLJLIL);
                            str = "download_video_failed";
                        }
                    } else {
                        strLJIIJJI = C2212161Bi2.LJIIZILJ(c2212201Bi6.LLJLIL);
                        str = "download_video_succeed";
                    }
                } else {
                    strLJIIJJI = C2212161Bi2.LJIIJJI(c2212201Bi6.LL);
                    str = "download_image_failed";
                    map2.put("image_mode", Integer.valueOf(c2212201Bi6.LLJJJIL));
                }
            } else {
                strLJIIJJI = C2212161Bi2.LJIIJJI(c2212201Bi6.LL);
                str = "download_image_succeed";
                map2.put("image_mode", Integer.valueOf(c2212201Bi6.LLJJJIL));
            }
            if (i2 != -1) {
                map2.put("position", Integer.valueOf(i2));
            }
            map2.put("url", strLJIIJJI);
            String str2 = "1";
            if (C2212161Bi2.LJIJI(c2212201Bi6)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_topview", obj);
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_async", str2);
            C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, str, map, map2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
