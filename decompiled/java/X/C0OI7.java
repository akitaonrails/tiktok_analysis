package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OI7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI7 {
    public final List<C0OI5<?>> LIZ = new ArrayList();

    public final <T> void LIZ(C0OIH<T> c0oih, T t) {
        ((ArrayList) this.LIZ).add(new C0OI5(c0oih, t, C0OI8.PROPOSE));
    }

    public final <T> void LIZIZ(C0OIH<T> c0oih, T t) {
        ((ArrayList) this.LIZ).add(new C0OI5(c0oih, t, C0OI8.SET));
    }
}
