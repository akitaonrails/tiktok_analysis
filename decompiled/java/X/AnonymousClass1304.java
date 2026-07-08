package X;

/* JADX INFO: renamed from: X.1304, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1304 extends AbstractC19939512zx {
    public final C132J LLILLJJLI;
    public final String LLILLL;
    public final AnonymousClass1305 LLILZ;

    @Override // X.AbstractC19939512zx
    public final AnonymousClass1302 LJI() {
        return this.LLILZ.LLILZ;
    }

    @Override // X.AbstractC19939512zx
    public final String LJIIIZ() {
        return this.LLILLJJLI.getName();
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

    public AnonymousClass1304(C132J c132j, AnonymousClass1305 anonymousClass1305) {
        this.LLILLJJLI = c132j;
        this.LLILZ = anonymousClass1305;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(anonymousClass1305.LLILLL);
        sbLIZ.append('.');
        sbLIZ.append(c132j.getName());
        this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        anonymousClass1305.LLILZ.LLJ.LIZIZ(this);
    }
}
