package X;

import Y.AObserverS215S0100000_11;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem$onViewCreated$1", f = "LiveNoticeCTAButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C706320RnC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveNoticeCTAButtonAssem LL;
    public final /* synthetic */ LiveNoticeCTAButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C706320RnC(LiveNoticeCTAButtonAssem liveNoticeCTAButtonAssem, LiveNoticeCTAButtonAssem liveNoticeCTAButtonAssem2, InterfaceC1364105Vn<? super C706320RnC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveNoticeCTAButtonAssem;
        this.LLILLJJLI = liveNoticeCTAButtonAssem2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C706320RnC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNoticeCTAButtonAssem@2d4.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C707370Rot.LIZ.LIZ("video_download_status").observe(this.LL, new AObserverS215S0100000_11(this.LLILLJJLI, 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNoticeCTAButtonAssem@2d4.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
