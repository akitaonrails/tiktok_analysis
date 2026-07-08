package X;

/* JADX INFO: renamed from: X.05zG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.storage.dao.DBApiImpl", f = "DBApiImpl.kt", l = {16}, m = "init")
public final class C1532405zG extends AbstractC23140094w {
    public C1532505zH LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1532505zH LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532405zG(C1532505zH c1532505zH, InterfaceC1364105Vn<? super C1532405zG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1532505zH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DBApiImpl@1996.init$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("DBApiImpl@1996.init$1");
        return objLIZ;
    }
}
