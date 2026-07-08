package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.model.BannerInRoom;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.banner.view.NativeBannerViewImpl$startMarqueeJob$1", f = "NativeBannerViewImpl.kt", l = {458}, m = "invokeSuspend")
public final class C1098530eh1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1098550eh3 LLILLJJLI;
    public final /* synthetic */ BannerInRoom LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098530eh1(C1098550eh3 c1098550eh3, BannerInRoom bannerInRoom, InterfaceC1364105Vn<? super C1098530eh1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1098550eh3;
        this.LLILLL = bannerInRoom;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098530eh1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativeBannerViewImpl@d53e.startMarqueeJob$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("NativeBannerViewImpl@d53e.startMarqueeJob$1");
                return objLJFF;
            }
        }
        C1098550eh3 c1098550eh3 = this.LLILLJJLI;
        BannerInRoom bannerInRoom = this.LLILLL;
        c1098550eh3.getClass();
        C1098290egd c1098290egdLJJ = C1098550eh3.LJJ(bannerInRoom, null);
        this.LLILLJJLI.LLJL.put(C2286608xc.LJ(this.LLILLL.hashCode()), c1098290egdLJJ.LIZ);
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILLJJLI.LLILZLL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.T1(c1098290egdLJJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativeBannerViewImpl@d53e.startMarqueeJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
