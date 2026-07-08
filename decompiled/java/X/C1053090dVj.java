package X;

/* JADX INFO: renamed from: X.0dVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileFeedModule", f = "CommerceProfileFeedModule.kt", l = {655}, m = "fetchNextAdBatch-hUnOzRk")
public final class C1053090dVj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1053070dVh LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053090dVj(C1053070dVh c1053070dVh, InterfaceC1364105Vn<? super C1053090dVj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1053070dVh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceProfileFeedModule@3ddb.fetchNextAdBatch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(0, 0, null, null, null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("CommerceProfileFeedModule@3ddb.fetchNextAdBatch$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("CommerceProfileFeedModule@3ddb.fetchNextAdBatch$1");
        return c189200o6M1boximpl;
    }
}
