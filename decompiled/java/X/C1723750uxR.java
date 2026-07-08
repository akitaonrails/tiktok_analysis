package X;

/* JADX INFO: renamed from: X.0uxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723750uxR {
    public static boolean LIZ;

    public static boolean LIZ() {
        C1717770unn.LIZJ().isDebug();
        if (!C1717770unn.LJFF().LJ() || !C1717770unn.LJFF().checkPluginInstalled("com.ss.android.ugc.aweme.df_pipo_external_payments")) {
            return false;
        }
        if (!LIZ) {
            C1717770unn.LJFF().LIZLLL().splitCompatInstall(C1717770unn.LIZJ().getApplicationContext());
            LIZ = true;
        }
        return LIZ;
    }
}
