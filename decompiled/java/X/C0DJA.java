package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0DJA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJA {
    public final C0DJ8 LIZ = new C0DJ8();

    public final void LIZ(Class cls, C0DJ9 c0dj9) {
        C0DJ8 c0dj8 = this.LIZ;
        c0dj8.LL.put(cls, c0dj9);
        if (!((ArrayList) c0dj8.LLILLJJLI).contains(cls)) {
            ((ArrayList) c0dj8.LLILLJJLI).add(cls);
        }
    }
}
