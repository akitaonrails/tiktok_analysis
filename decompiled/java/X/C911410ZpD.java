package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService;

/* JADX INFO: renamed from: X.0ZpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService", f = "IMCameraBridgeService.kt", l = {113}, m = "uploadAvatarFileStandalone-gIAlu-s")
public final class C911410ZpD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMCameraBridgeService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911410ZpD(IMCameraBridgeService iMCameraBridgeService, InterfaceC1364105Vn<? super C911410ZpD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMCameraBridgeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCameraBridgeService@a6bf.uploadAvatarFileStandalone$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLJJLI.LJJIL(null, this);
        if (objLJJIL == C099R.LJFF()) {
            C1C7U.LIZIZ("IMCameraBridgeService@a6bf.uploadAvatarFileStandalone$1");
            return objLJJIL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJIL);
        C1C7U.LIZIZ("IMCameraBridgeService@a6bf.uploadAvatarFileStandalone$1");
        return c189200o6M1boximpl;
    }
}
