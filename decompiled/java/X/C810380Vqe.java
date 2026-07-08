package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0Vqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810380Vqe {
    public static final C810400Vqg LIZ = new C810410Vqh<SharedPreferences>() { // from class: X.0Vqg
        @Override // X.C810410Vqh
        public final SharedPreferences LIZIZ() {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getSharedPreferences("cold_boot_launch_protector", 0);
        }
    };
    public static final C810390Vqf LIZIZ = new C810410Vqh<SharedPreferences>() { // from class: X.0Vqf
        @Override // X.C810410Vqh
        public final SharedPreferences LIZIZ() {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getSharedPreferences("launch_protector_drill", 0);
        }
    };

    public static void LIZ(String str, boolean z) {
        LIZ.LIZ().edit().putBoolean(str, z).apply();
    }
}
