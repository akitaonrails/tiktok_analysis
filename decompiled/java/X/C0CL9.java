package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0CL9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CL9 {
    public static final SharedPreferences LIZ;
    public static final C0CLA LIZIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CLA] */
    static {
        C844470XAv.LIZ.getClass();
        LIZ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "sp_settings_request_v1");
        LIZIZ = new C2230608oa<String>() { // from class: X.0CLA
            @Override // X.C2230608oa
            public final SharedPreferences LIZJ() {
                return C0CL9.LIZ;
            }
        };
    }

    public static String LIZ() {
        String strLIZ = LIZIZ.LIZ();
        return strLIZ == null ? "" : strLIZ;
    }

    public static void LIZIZ(String str) {
        LIZIZ.LJ(str);
    }
}
