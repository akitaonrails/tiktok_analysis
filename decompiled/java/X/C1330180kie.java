package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330180kie implements InterfaceC1327000kdW {
    public static volatile C1330180kie LIZ;

    @Override // X.InterfaceC1327000kdW
    public final void LIZ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJFF() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJI() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJII() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1327000kdW
    public final void LJIILIIL() {
    }

    public static C1330180kie LJIILJJIL() {
        if (LIZ == null) {
            synchronized (C1330180kie.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1330180kie();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
