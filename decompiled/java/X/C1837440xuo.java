package X;

/* JADX INFO: renamed from: X.0xuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837440xuo extends AbstractC1837350xuf {
    public final Throwable LLILZIL;
    public final InterfaceC1837460xuq LLILZLL;
    public final EnumC1837330xud LLIZ;

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        Throwable th = this.LLILZIL;
        if (th != null) {
            return C512240K7a.LIZ(th);
        }
        InterfaceC1837460xuq interfaceC1837460xuq = this.LLILZLL;
        if (interfaceC1837460xuq != null) {
            return interfaceC1837460xuq.LIZ();
        }
        return -999;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return this.LLIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1837440xuo(Throwable th, InterfaceC1837460xuq interfaceC1837460xuq, String str) {
        String strLIZIZ;
        if ((interfaceC1837460xuq == null || (strLIZIZ = interfaceC1837460xuq.getMessage()) == null) && (th == null || (strLIZIZ = C512240K7a.LIZIZ(th)) == null)) {
            strLIZIZ = "create contract api error";
        }
        super(strLIZIZ, str, null);
        this.LLILZIL = th;
        this.LLILZLL = interfaceC1837460xuq;
        this.LLIZ = EnumC1837330xud.BIZ_CREATE_ORDER;
    }
}
