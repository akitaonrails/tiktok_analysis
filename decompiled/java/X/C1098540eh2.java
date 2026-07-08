package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.banner.view.NativeBannerViewImpl$expandBanner$2", f = "NativeBannerViewImpl.kt", l = {702}, m = "invokeSuspend")
public final class C1098540eh2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1098550eh3 LLILLJJLI;
    public final /* synthetic */ C1098290egd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098540eh2(C1098550eh3 c1098550eh3, C1098290egd c1098290egd, InterfaceC1364105Vn<? super C1098540eh2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1098550eh3;
        this.LLILLL = c1098290egd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098540eh2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativeBannerViewImpl@d53e.expandBanner$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("NativeBannerViewImpl@d53e.expandBanner$2");
                return objLJFF;
            }
        }
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILLJJLI.LLILZLL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.R1(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativeBannerViewImpl@d53e.expandBanner$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
