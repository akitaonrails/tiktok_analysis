package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0XaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851250XaN extends C0XZT {
    public final WeakReference<InterfaceC851260XaO> LIZJ;

    public C851250XaN(InterfaceC851260XaO interfaceC851260XaO) {
        this.LIZJ = new WeakReference<>(interfaceC851260XaO);
    }

    @Override // X.C0XZT
    public final void LIZIZ(C0XZV c0xzv) {
        if (this.LIZJ.get() != null) {
            this.LIZJ.get().LJJLJLI(c0xzv.LIZLLL, c0xzv.LJFF, c0xzv.LJIILIIL, c0xzv);
        }
    }

    @Override // X.C0XZT
    public final void LIZLLL(C0XZV c0xzv) {
        if (this.LIZJ.get() != null) {
            this.LIZJ.get().LLLLIILL(c0xzv.LJIIIZ);
        }
    }

    @Override // X.C0XZT
    public final void LIZJ(C0XZV c0xzv, String str, String str2) {
        if (this.LIZJ.get() != null) {
            this.LIZJ.get().LJJLJLI(c0xzv.LIZLLL, c0xzv.LJFF, c0xzv.LJIILIIL, c0xzv);
        }
    }
}
