package X;

/* JADX INFO: renamed from: X.0Tjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755060Tjc extends C0JSV<InterfaceC755080Tje> {
    public C11JL LL;

    @Override // X.C0JSV
    public final void detachView() {
        super.detachView();
        C11JL c11jl = this.LL;
        if (c11jl != null) {
            c11jl.dispose();
        }
    }
}
