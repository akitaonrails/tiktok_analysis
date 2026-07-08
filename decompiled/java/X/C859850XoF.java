package X;

/* JADX INFO: renamed from: X.0XoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl", f = "AnimSeqShowMgrImpl.kt", l = {229, 232}, m = "launchDoAnimLoop")
public final class C859850XoF extends AbstractC23140094w {
    public C013C LL;
    public C859820XoC LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C859810XoB LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859850XoF(C859810XoB c859810XoB, InterfaceC1364105Vn<? super C859850XoF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c859810XoB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.launchDoAnimLoop$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(this);
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.launchDoAnimLoop$1");
        return objLIZLLL;
    }
}
