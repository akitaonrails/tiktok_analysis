package X;

import android.view.Window;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1AxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196211AxP {
    public boolean LIZ = true;

    public static void LJI() {
        int i = C2187451AjH.LIZ;
        C1543490qGh.LIZIZ(C1383160m66.class, null, 6);
        C1543490qGh.LIZIZ(C1048210dNr.class, null, 6);
        C1543490qGh.LIZIZ(C1048200dNq.class, null, 6);
        C1543490qGh.LIZIZ(C2195481AwE.class, null, 6);
        C1543490qGh.LIZIZ(C2195491AwF.class, null, 6);
        C1543490qGh.LIZIZ(C2195611AwR.class, null, 6);
        C1543490qGh.LIZIZ(C1801840wzO.class, null, 6);
        C1543490qGh.LIZIZ(C1392060mKS.class, null, 6);
        C1543490qGh.LIZIZ(C2195821Awm.class, null, 6);
        C1543490qGh.LIZIZ(C2195811Awl.class, null, 6);
        C1543490qGh.LIZIZ(C2195801Awk.class, null, 6);
        C1543490qGh.LIZIZ(C1389020mFY.class, null, 6);
        C1543490qGh.LIZIZ(C1801920wzW.class, null, 6);
        C1543490qGh.LIZIZ(C1392270mKn.class, null, 6);
        C1543490qGh.LIZIZ(C1389430mGD.class, null, 6);
        C1543490qGh.LIZIZ(C1800920wxu.class, null, 6);
        C1543490qGh.LIZIZ(C1877230ywz.class, null, 6);
        C1543490qGh.LIZIZ(C2196191AxN.class, null, 6);
        C1543490qGh.LIZIZ(C2195291Avv.class, null, 6);
        C1543490qGh.LIZIZ(C2196141AxI.class, null, 6);
        C1543490qGh.LIZIZ(C2196111AxF.class, null, 6);
        C1543490qGh.LIZIZ(C1397280mSs.class, null, 6);
        C1543490qGh.LIZIZ(C1397220mSm.class, null, 6);
        C1543490qGh.LIZIZ(C2196241AxS.class, null, 6);
        C1543490qGh.LIZIZ(C1801080wyA.class, null, 6);
    }

    public static boolean LIZIZ(SchemaParserData schemaParserData) {
        if (schemaParserData == null) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        if (schemaParserData.minisStage == EnumC2192711Arl.MINIS_STAGE_UNKNOWN) {
            int i2 = C2187451AjH.LIZ;
            return false;
        }
        String str = schemaParserData.clientKey;
        if (str == null || str.length() != 0) {
            return true;
        }
        int i3 = C2187451AjH.LIZ;
        return false;
    }

    public static String LJIIIIZZ(String str) {
        if (u.LJIIZILJ(str, "/", false)) {
            return a0.LJLJJI(str, '/');
        }
        return str;
    }

    public final C1153280g7K LIZJ(String str) {
        C1153280g7K c1153280g7K = new C1153280g7K(0);
        if (this.LIZ) {
            str = null;
        }
        c1153280g7K.LIZ = str;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMinisScreenProtectionReuseConfigOnDestroy, config:");
        sbLIZ.append(c1153280g7K);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1153280g7K;
    }

    public static String LIZ(String str, String str2) {
        if (u.LJJIIJZLJL(str2, "/", false)) {
            str = LJIIIIZZ(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2.length() > 0) {
            if (!u.LJJIIJZLJL(str2, "?", false) && !u.LJJIIJZLJL(str2, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(str2);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196211AxP.LIZLLL(com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel, java.lang.String):boolean");
    }

    public static boolean LJ(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isWebviewTitleDefaultWebUrl, currentWebLoadUrl:");
        sbLIZ.append(str);
        sbLIZ.append(", title:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        str2.toString();
        if (a0.LJJIIZI(str, str2, false)) {
            return true;
        }
        return false;
    }

    public final void LJFF(Window window, boolean z) {
        if (z) {
            if (window != null) {
                window.addFlags(8192);
            }
            this.LIZ = false;
        } else {
            if (window != null) {
                window.clearFlags(8192);
            }
            this.LIZ = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("makeScreenProtection, canRecordScreen:");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJII(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str) {
        SparkContext sparkContext;
        C1153280g7K c1153280g7K;
        String str2;
        SparkContext sparkContext2;
        C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
        c1547430qN3.getClass();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null && (c1153280g7K = (C1153280g7K) sparkContext.LJFF(C1153280g7K.class)) != null && (str2 = c1153280g7K.LIZ) != null) {
            if (str != null && str.equals(str2)) {
                this.LIZ = false;
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setScreenProtectionWhenSparkReuse, current url same with canRecordScreen:");
                sbLIZ.append(this.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            c1547430qN3.getClass();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                sparkContext2.LJJIII(C1153280g7K.class);
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setScreenProtectionWhenSparkReuse, current web url:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
