package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService;

/* JADX INFO: renamed from: X.0ZpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService", f = "IMCameraBridgeService.kt", l = {387}, m = "uploadAvatarFileLegacy-gIAlu-s")
public final class C911390ZpB extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMCameraBridgeService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911390ZpB(IMCameraBridgeService iMCameraBridgeService, InterfaceC1364105Vn<? super C911390ZpB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iMCameraBridgeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCameraBridgeService@a6bf.uploadAvatarFileLegacy$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIJLIJ = this.LLILLL.LJJIJLIJ(null, this);
        if (objLJJIJLIJ == C099R.LJFF()) {
            C1C7U.LIZIZ("IMCameraBridgeService@a6bf.uploadAvatarFileLegacy$1");
            return objLJJIJLIJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJIJLIJ);
        C1C7U.LIZIZ("IMCameraBridgeService@a6bf.uploadAvatarFileLegacy$1");
        return c189200o6M1boximpl;
    }
}
