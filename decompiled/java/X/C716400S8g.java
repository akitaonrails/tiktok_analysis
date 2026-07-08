package X;

import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.AILivePhotoAnchorMaker$videoPlayWithAnchor$1", f = "AILivePhotoAnchorMaker.kt", l = {124}, m = "invokeSuspend")
public final class C716400S8g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1399210mVz LLILLJJLI;
    public final /* synthetic */ AIAliveInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716400S8g(C1399210mVz c1399210mVz, AIAliveInfo aIAliveInfo, InterfaceC1364105Vn<? super C716400S8g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1399210mVz;
        this.LLILLL = aIAliveInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C716400S8g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String text;
        C1C7U.LIZ("AILivePhotoAnchorMaker@9718.videoPlayWithAnchor$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IAILiveService iAILiveServiceLJJIJIIJI = this.LLILLJJLI.LJJIJIIJI();
            AIAliveInfo aIAliveInfo = this.LLILLL;
            if (aIAliveInfo != null) {
                text = aIAliveInfo.getText();
            } else {
                text = null;
            }
            this.LL = 1;
            if (iAILiveServiceLJJIJIIJI.translateAnchorText(text, this) == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoAnchorMaker@9718.videoPlayWithAnchor$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoAnchorMaker@9718.videoPlayWithAnchor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
