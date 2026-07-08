package X;

/* JADX INFO: renamed from: X.1305, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1305 extends AbstractC19939512zx {
    public final C132I LLILLJJLI;
    public final String LLILLL;
    public final AnonymousClass1302 LLILZ;
    public final AnonymousClass1304[] LLILZIL;

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLJJLI.getName();
    }

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19939512zx
    public final String LJII() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19939512zx
    public final AbstractC19939512zx LJIIJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19939512zx
    public final /* bridge */ /* synthetic */ InterfaceC19930912yZ LJIILJJIL() {
        return this.LLILLJJLI;
    }

    public AnonymousClass1305(C132I c132i, AnonymousClass1302 anonymousClass1302) {
        this.LLILLJJLI = c132i;
        this.LLILLL = AnonymousClass1303.LIZIZ(anonymousClass1302, null, c132i.getName());
        this.LLILZ = anonymousClass1302;
        this.LLILZIL = new AnonymousClass1304[c132i.getMethodCount()];
        for (int i = 0; i < c132i.getMethodCount(); i++) {
            this.LLILZIL[i] = new AnonymousClass1304(c132i.getMethod(i), this);
        }
        anonymousClass1302.LLJ.LIZIZ(this);
    }
}
