package X;

/* JADX INFO: renamed from: X.0h33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189070h33 extends AbstractC1196150hET {
    public static final C1189070h33 LIZ = new C1189070h33();
    public static final String LIZIZ = "poi_detail_claim";

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }

    public static void LIZLLL(C1189070h33 c1189070h33, String str, boolean z, String str2, String str3, int i) {
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = null;
        }
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        c1189070h33.getClass();
        c1189070h33.LIZJ("load_lynx_result", new C1188780h2a(str6, null, str5, z, str4));
    }
}
