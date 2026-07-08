package X;

/* JADX INFO: renamed from: X.0V86, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V86 implements C0V89 {
    public volatile boolean LL;
    public final C0V89 LLILLJJLI;

    public C0V86() {
        if (C792420V6q.LJIILJJIL()) {
            this.LLILLJJLI = new C0V81();
        } else {
            this.LLILLJJLI = new C0V8T();
        }
    }

    @Override // X.C0V89
    public final synchronized void LIZ(C792560V7e c792560V7e) {
        this.LLILLJJLI.LIZ(c792560V7e);
    }

    @Override // X.C0V89
    public final synchronized void LJJIJLIJ(String str) {
        this.LLILLJJLI.LJJIJLIJ(str);
    }

    @Override // X.C0V89
    public final void LIZIZ(boolean z, boolean z2) {
        if (this.LL) {
            return;
        }
        this.LL = true;
        this.LLILLJJLI.LIZIZ(z, z2);
    }

    @Override // X.C0V89
    public final synchronized void LJJLJLI(String str, boolean z) {
        this.LLILLJJLI.LJJLJLI(str, z);
    }
}
