package X;

import com.bytedance.android.live.broadcast.api.CloseLiveHostSettingSheet;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;

/* JADX INFO: renamed from: X.0Uld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet$onViewCreated$2", f = "LiveHostSettingFragmentSheet.kt", l = {}, m = "invokeSuspend")
public final class C781790Uld extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveHostSettingFragmentSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C781790Uld(LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, InterfaceC1364105Vn<? super C781790Uld> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveHostSettingFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C781790Uld(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = this.LL;
        DataChannel dataChannel = liveHostSettingFragmentSheet.LLJZ;
        if (dataChannel != null) {
            dataChannel.BQ2(liveHostSettingFragmentSheet, CloseLiveHostSettingSheet.class, new AwS591S0100000_12(liveHostSettingFragmentSheet, 452));
        }
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet2 = this.LL;
        DataChannel dataChannel2 = liveHostSettingFragmentSheet2.LLJZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(liveHostSettingFragmentSheet2, DismissToolbarPopEvent.class, new AwS591S0100000_12(liveHostSettingFragmentSheet2, 453));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
