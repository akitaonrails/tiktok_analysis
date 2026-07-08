package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13MX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MX extends C20004613Oy {
    public static C1798710wuL LJIIL;
    public static C1798710wuL LJIILIIL;
    public static String LJIILJJIL;
    public static List<String> LJIILL;
    public static final C13MS LJIILLIIL = new C13SP() { // from class: X.13MS
        public final List<String> LIZ = C1697810uHb.LJIIJJI("52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781");
        public final List<String> LIZIZ = C1697810uHb.LJIIJJI("52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226");

        public static boolean LIZIZ(String str) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cleaneffect: isCountry:");
            sbLIZ.append(str);
            sbLIZ.append(" now:");
            sbLIZ.append(C13MX.LJIILJJIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("EffectDiskLruCache", strLIZIZ);
            if (!C504670Jqj.LIZIZ(str) && Intrinsics.LJFF(str, C13MX.LJIILJJIL)) {
                return true;
            }
            return false;
        }

        @Override // X.C13SP
        public final boolean LIZ(String str) {
            if (C504670Jqj.LIZIZ(str)) {
                return false;
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cleaneffect: allowlist：");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("EffectDiskLruCache", strLIZIZ);
            C1798710wuL c1798710wuL = C13MX.LJIIL;
            if (c1798710wuL != null) {
                String str2 = "";
                String string = c1798710wuL.LIZ.getString(str, "");
                if (string != null) {
                    str2 = string;
                }
                if (LIZIZ("BR") && this.LIZ.contains(str2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cleaneffect: allowlist：BR, key: ");
                    sbLIZ2.append(str);
                    C13SS.LIZ("EffectDiskLruCache", C2188811AlT.LIZIZ(sbLIZ2));
                    return true;
                }
                if (LIZIZ("RU") && this.LIZIZ.contains(str2)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("cleaneffect: allowlist：RU, key: ");
                    sbLIZ3.append(str);
                    C13SS.LIZ("EffectDiskLruCache", C2188811AlT.LIZIZ(sbLIZ3));
                    return true;
                }
                List<String> list = C13MX.LJIILL;
                if (list != null && list.contains(str)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cleaneffect: allowlist：draft, key: ");
                    sbLIZ4.append(str);
                    C13SS.LIZ("EffectDiskLruCache", C2188811AlT.LIZIZ(sbLIZ4));
                    return true;
                }
            }
            return false;
        }
    };
    public static final C19997013Ma LJIIZILJ = new C13SO() { // from class: X.13Ma
        @Override // X.C13SO
        public final boolean LIZ() {
            return C19997713Mh.LIZLLL.LJ;
        }

        @Override // X.C13SO
        public final long LIZJ() {
            return C19997713Mh.LIZLLL.LIZLLL;
        }

        @Override // X.C13SO
        public final long LIZLLL() {
            return C19997713Mh.LIZLLL.LIZJ;
        }

        @Override // X.C13SO
        public final long LJ() {
            return C19997713Mh.LIZLLL.LJFF;
        }

        @Override // X.C13SO
        public final boolean LIZIZ(String str) {
            boolean zContains = C19997713Mh.LIZLLL.LIZIZ.contains(str);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isGradingRequired: panel: ");
            sbLIZ.append(str);
            sbLIZ.append(", panel in allowList:");
            sbLIZ.append(zContains);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("EffectResourceLevelOpt", strLIZIZ);
            return zContains;
        }
    };
    public final C13RD LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final void clear() {
        super.clear();
        C1798710wuL c1798710wuL = LJIIL;
        if (c1798710wuL != null) {
            c1798710wuL.LIZ();
        }
        String strLIZIZ = "effectid_map";
        if (!C504670Jqj.LIZIZ("")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append("effectid_map");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        LJIIL = C1798720wuM.LIZ(this.LJIIIZ.LJJIIZI, strLIZIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public C13MX(C13RD c13rd) {
        boolean z;
        ?? arrayList;
        String str = c13rd.LJII;
        long j = c13rd.LJJIJLIJ;
        C13MS c13ms = LJIILLIIL;
        if (C19997713Mh.LIZLLL.LIZ && c13rd.LJJIL) {
            z = true;
        } else {
            z = false;
        }
        super(str, 0, j, c13ms, false, new Pair(Boolean.valueOf(z), LJIIZILJ), c13rd.LJIIIIZZ, 38);
        this.LJIIIZ = c13rd;
        String strLIZIZ = "effectid_map";
        if (!C504670Jqj.LIZIZ("")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append("effectid_map");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        LJIIL = C1798720wuM.LIZ(c13rd.LJJIIZI, strLIZIZ);
        LJIILIIL = C1798720wuM.LIZ(c13rd.LJJIIZI, "diff_effect_md5_sp");
        LJIILJJIL = c13rd.LJIIIZ;
        if (C19997713Mh.LIZJ) {
            List<String> list = c13rd.LJJIIZ;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    String strLJI = C13SB.LJI(it2.next());
                    if (strLJI == null) {
                        strLJI = "";
                    }
                    Regex regex = C13SG.LJJ;
                    arrayList.add(C13SJ.LIZJ(strLJI));
                }
            } else {
                arrayList = 0;
            }
        } else {
            arrayList = c13rd.LJJIIZ;
        }
        LJIILL = arrayList;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" draftDIRAllowList:");
        sbLIZ2.append(LJIILL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c13ss.getClass();
        C13SS.LIZ("EffectDiskLruCache", strLIZIZ2);
        this.LJIIJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(202));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(203));
    }

    @Override // X.C20004613Oy, X.InterfaceC20004513Ox
    public final void LJIIL(List<String> list) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftList: ");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("EffectDiskLruCache", strLIZIZ);
        if (C19997713Mh.LJFF) {
            if (C19997713Mh.LIZJ) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    String strLJI = C13SB.LJI(it2.next());
                    if (strLJI == null) {
                        strLJI = "";
                    }
                    Regex regex = C13SG.LJJ;
                    arrayList.add(C13SJ.LIZJ(strLJI));
                }
                list = arrayList;
            }
            super.LJIIL(list);
        } else {
            if (C19997713Mh.LIZJ) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it3 = list.iterator();
                while (it3.hasNext()) {
                    String strLJI2 = C13SB.LJI(it3.next());
                    if (strLJI2 == null) {
                        strLJI2 = "";
                    }
                    Regex regex2 = C13SG.LJJ;
                    arrayList2.add(C13SJ.LIZJ(strLJI2));
                }
                list = arrayList2;
            }
            LJIILL = list;
        }
        C13SS c13ss2 = C13SS.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("after updateDraftList: ");
        sbLIZ2.append(LJIILL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c13ss2.getClass();
        C13SS.LIZ("EffectDiskLruCache", strLIZIZ2);
    }

    public final void LJIJJLI(Effect effect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(effect.getId());
        sbLIZ.append(".zip");
        remove(C2188811AlT.LIZIZ(sbLIZ));
        String unzipPath = effect.getUnzipPath();
        if (unzipPath == null) {
            return;
        }
        try {
            String strLJI = C13SB.LJI(unzipPath);
            if (strLJI != null) {
                remove(strLJI);
            }
            C13SB.LJIIZILJ(unzipPath);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove effect failed! ");
            sbLIZ2.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ, null);
        }
    }

    public static Exception LJIJI(Effect effect, String str) {
        ArrayList arrayList;
        Integer numValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13M2.LIZ(str));
        sbLIZ.append("effect_platform_children.tag");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C13SB.LJIIZILJ(strLIZIZ);
        try {
            List listLJII = C13SB.LJII(str);
            if (listLJII != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
                Iterator it2 = listLJII.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJJJJZ(str, (String) it2.next()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                C13SB.LJJIII(strLIZIZ, C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("write effect: ");
            sbLIZ2.append(effect.getEffect_id());
            sbLIZ2.append(" children count: ");
            if (arrayList == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(arrayList.size());
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" time cost: ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ2.append(" ms");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZ("writeEffect", strLIZIZ2);
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("write effect: ");
            sbLIZ3.append(effect.getEffect_id());
            sbLIZ3.append(" children tag file failed!");
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss2.getClass();
            C13SS.LIZIZ("writeEffect", strLIZIZ3, e);
            C13SB.LJIIZILJ(strLIZIZ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("RebuildTagFailed:");
            sbLIZ4.append(e.getMessage());
            return new Exception(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LJIJJ(String str, String str2) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".zip");
            remove(C2188811AlT.LIZIZ(sbLIZ));
            String strLJI = C13SB.LJI(str2);
            if (strLJI != null) {
                remove(strLJI);
            }
            C13SB.LJIIZILJ(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove BaseEffect failed! ");
            sbLIZ2.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.13MY] */
    public final Exception LJIJ(Effect effect, String str, String str2) {
        String message;
        String uri;
        String uri2;
        C1798710wuL c1798710wuL;
        if (!C504670Jqj.LIZIZ(str) && !C504670Jqj.LIZIZ(str2)) {
            try {
                message = C13SB.LIZJ(new C0VSJ(str2).getAbsoluteFile(), new C0VSJ(str).getAbsoluteFile(), new Object() { // from class: X.13MY
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                message = e.getMessage();
                if (message == null) {
                    message = "unknown exception";
                }
            }
            if (message != null) {
                return new Exception(message);
            }
            if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
                C08RK.LIZ(str);
            } else {
                Exception excLJIJI = LJIJI(effect, str);
                if (excLJIJI != null) {
                    return excLJIJI;
                }
            }
            Regex regex = C13SG.LJJ;
            LJI(C13SJ.LIZJ(str), effect.getPanel());
            String strLJI = C13SB.LJI(str2);
            if (strLJI != null) {
                LJI(C13SJ.LIZJ(strLJI), effect.getPanel());
            }
            DiffEffect file_diff = effect.getFile_diff();
            if (file_diff != null && (uri = file_diff.getBase_url().getUri()) != null && (uri2 = file_diff.getDiff_url().getUri()) != null && (c1798710wuL = LJIILIIL) != null) {
                c1798710wuL.LIZIZ(uri2, uri);
                return null;
            }
            return null;
        }
        return new Exception("UnzipPath is empty!");
    }

    public final String LJIL(Effect effect, C20008713Qn c20008713Qn, String str, long j, boolean z, AwS644S0100000_30 awS644S0100000_30) throws Exception {
        C1798710wuL c1798710wuL;
        Regex regex = C13SG.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        String strLIZJ = C13SJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            Pair<String, Boolean> pairLJIIIZ = LJIIIZ(strLIZJ, c20008713Qn, str, j, effect.getPanel(), awS644S0100000_30);
            if (z) {
                if (pairLJIIIZ.getSecond().booleanValue() && (c1798710wuL = LJIIL) != null) {
                    c1798710wuL.LIZIZ(str, effect.getEffect_id());
                }
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effect ");
                sbLIZ2.append(effect.getEffect_id());
                sbLIZ2.append(", name: ");
                sbLIZ2.append(effect.getName());
                sbLIZ2.append(", key: ");
                sbLIZ2.append(strLIZJ);
                sbLIZ2.append(" end in disklrucache, result: ");
                sbLIZ2.append(pairLJIIIZ.getSecond().booleanValue());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZ("EffectDiskLruCache", strLIZIZ);
            }
            return pairLJIIIZ.getFirst();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (z) {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fetch effect: ");
                sbLIZ3.append(effect.getEffect_id());
                sbLIZ3.append(", name: ");
                sbLIZ3.append(effect.getName());
                sbLIZ3.append(" key: ");
                sbLIZ3.append(strLIZJ);
                sbLIZ3.append(" write to disk failed!");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ2, e);
            }
            if (!(e instanceof C19997413Me)) {
                remove(strLIZJ);
            }
            throw e;
        }
    }
}
