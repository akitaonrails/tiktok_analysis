package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* JADX INFO: renamed from: X.13ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20101013ku {
    public final C20100813ks LIZ;

    public C20101013ku() {
        this.LIZ = Build.VERSION.SDK_INT >= 28 ? new C20101113kv() { // from class: X.13kt
            @Override // X.C20100813ks
            public final Signature[] LIZIZ(PackageManager packageManager, String str) {
                return C786410Ut5.Y3(packageManager, str, 64).signatures;
            }
        } : new C20101113kv();
    }
}
