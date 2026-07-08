package X;

import java.util.List;

/* JADX INFO: renamed from: X.0m20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380620m20 implements InterfaceC1380530m1r {
    public final InterfaceC1380640m22 LIZ;
    public List<? extends InterfaceC1380660m24> LIZIZ;

    @Override // X.InterfaceC1380530m1r
    public final List<InterfaceC1380660m24> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1380530m1r
    public final InterfaceC1380640m22 LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1380530m1r
    public final void LIZ(List<? extends InterfaceC1380660m24> list) {
        this.LIZIZ = list;
    }

    public C1380620m20(InterfaceC1380640m22 interfaceC1380640m22, List<? extends InterfaceC1380660m24> list) {
        this.LIZ = interfaceC1380640m22;
        this.LIZIZ = list;
    }
}
