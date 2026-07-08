package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import kotlin.Unit;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.04IB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.creatorvideo.PdpCreatorVideoManager$fetchCreatorVideoList$1$1$1", f = "PdpCreatorVideoManager.kt", l = {}, m = "invokeSuspend")
public final class C04IB extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Response<RecommendListResponse>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C04BG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04IB(C04BG c04bg, InterfaceC1364105Vn<? super C04IB> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c04bg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        this.LLILLJJLI.LJFF = true;
        this.LLILLJJLI.LJI = "error";
        C04BG c04bg = this.LLILLJJLI;
        c04bg.LIZ.setState(new AwS580S0100000_1(c04bg, 16));
        C1AF0.LJFF(th, "fetchCreatorVideoList");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpCreatorVideoManager@4329.fetchCreatorVideoList$1$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Response<RecommendListResponse>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C04IB c04ib = new C04IB(this.LLILLJJLI, interfaceC1364105Vn);
        c04ib.LL = th;
        return c04ib.invokeSuspend(Unit.LIZ);
    }
}
