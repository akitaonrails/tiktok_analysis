package X;

import android.os.Build;

/* JADX INFO: renamed from: X.1AoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190551AoH {
    public static InterfaceC2190701AoW LIZ(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C2190541AoG(str);
        }
        return new C2192801Aru(str);
    }
}
