package X;

/* JADX INFO: renamed from: X.0MCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestRepository", f = "AILivePhotoRequestRepository.kt", l = {64}, m = "getAILivePhotoPrompts-0E7RQCE")
public final class C564660MCq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C564650MCp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564660MCq(C564650MCp c564650MCp, InterfaceC1364105Vn<? super C564660MCq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c564650MCp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$1");
        return c189200o6M1boximpl;
    }
}
