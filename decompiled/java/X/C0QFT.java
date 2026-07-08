package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0QFT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFT implements C0QFL {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @Override // X.C0QFL
    public final WeakReference<?> getHost() {
        return (WeakReference) this.LIZJ.getValue();
    }

    @Override // X.C0QFL
    public final C807360Vlm getPageInfo() {
        return (C807360Vlm) this.LIZ.getValue();
    }

    @Override // X.C0QFL
    public final C0QFL getPrev() {
        return (C0QFL) this.LIZIZ.getValue();
    }

    public C0QFT(C2211641BhC c2211641BhC) {
        this.LIZ = C452501pT.LIZIZ(new C0QFU(c2211641BhC));
        this.LIZIZ = C452501pT.LIZIZ(new C0QFV(c2211641BhC));
        this.LIZJ = C452501pT.LIZIZ(new C0QFW(c2211641BhC));
    }
}
