package X;

import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BJC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJC {
    public static final C2202841BJi LIZIZ = new C2202841BJi();
    public static final HashMap<String, String> LIZJ = new HashMap<>();
    public StringBuilder LIZ;

    public static final void LIZIZ() {
        synchronized (FacebookSdk.LIZ) {
        }
    }

    public final void LIZ() {
        this.LIZ.getClass();
        synchronized (FacebookSdk.LIZ) {
        }
        this.LIZ = new StringBuilder();
    }

    public C1BJC(C1BJT c1bjt) {
        C0W7K.LJ("Request", "tag");
        Intrinsics.LJIIJJI("Request", "FacebookSDK.");
        this.LIZ = new StringBuilder();
    }
}
