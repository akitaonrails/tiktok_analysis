package X;

/* JADX INFO: renamed from: X.11Mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19488911Mp<T> extends C11J7<T, T> {
    public final long LLILLJJLI;

    public C19488911Mp(C11NZ c11nz) {
        super(c11nz);
        this.LLILLJJLI = Long.MAX_VALUE;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        C19484811La c19484811La = new C19484811La();
        interfaceC626120Oh8.onSubscribe(c19484811La);
        long j = this.LLILLJJLI;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new C19488811Mo(interfaceC626120Oh8, j2, c19484811La, this.LL).LIZ();
    }
}
