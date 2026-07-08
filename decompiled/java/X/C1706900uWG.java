package X;

/* JADX INFO: renamed from: X.0uWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler", f = "NetworkHandler.kt", l = {367}, m = "getPage-gIAlu-s")
public final class C1706900uWG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1713530ugx LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706900uWG(C1713530ugx c1713530ugx, InterfaceC1364105Vn<? super C1706900uWG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1713530ugx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NetworkHandler@fac6.getPage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("NetworkHandler@fac6.getPage$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("NetworkHandler@fac6.getPage$1");
        return c189200o6M1boximpl;
    }
}
