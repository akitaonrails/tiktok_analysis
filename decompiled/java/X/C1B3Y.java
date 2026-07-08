package X;

/* JADX INFO: renamed from: X.1B3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3Y {
    public static final /* synthetic */ int LIZ = 0;

    public static C1B3O LIZIZ(int i, EnumC2193681AtK enumC2193681AtK, String str) {
        String str2 = str;
        C1B3O c1b3o = new C1B3O(null, null, null, enumC2193681AtK.getValue(), str2, null, 487);
        c1b3o.errorCode = i;
        if (str2 == null) {
            str2 = c1b3o.LIZLLL;
        }
        c1b3o.errorMsg = str2;
        return c1b3o;
    }

    public static C1B3O LIZ(int i, String str, String str2, String str3) {
        C1B3O c1b3o = new C1B3O(null, null, null, str, str2, null, 487);
        c1b3o.errorCode = i;
        c1b3o.errorMsg = str3;
        return c1b3o;
    }

    public static C1B3O LIZJ(String str, String str2, String str3, String str4, int i) {
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        if ((i & 1) != 0) {
            str7 = "";
        }
        String str8 = null;
        if ((i & 2) != 0) {
            str6 = null;
        }
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) == 0) {
            str8 = str4;
        }
        return new C1B3O(str7, str5, str6, null, null, str8, 472);
    }
}
