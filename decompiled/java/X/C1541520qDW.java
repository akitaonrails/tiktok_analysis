package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0qDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1541520qDW {
    public final C1541530qDX LIZ = new C1541530qDX();

    public final void LIZ(Class cls) {
        this.LIZ.LIZ.add(cls);
    }

    public final void LIZIZ(Class cls, InterfaceC1541740qDs interfaceC1541740qDs) {
        if (cls == null) {
            return;
        }
        this.LIZ.LIZ.add(cls);
        C1541530qDX c1541530qDX = this.LIZ;
        if (c1541530qDX.LIZIZ == null) {
            c1541530qDX.LIZIZ = new HashMap<>();
        }
        this.LIZ.LIZIZ.put(cls, interfaceC1541740qDs);
    }
}
