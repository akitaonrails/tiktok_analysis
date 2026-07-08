package X;

import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ulc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet$onViewCreated$1$1", f = "LiveHostSettingFragmentSheet.kt", l = {}, m = "invokeSuspend")
public final class C781780Ulc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveHostSettingFragmentSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C781780Ulc(LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, InterfaceC1364105Vn<? super C781780Ulc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveHostSettingFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C781780Ulc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = this.LL;
        C500260Jjc.LJJJJJ(liveHostSettingFragmentSheet, null, new C781760Ula(liveHostSettingFragmentSheet, null), 3);
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet2 = this.LL;
        C500260Jjc.LJJJJJ(liveHostSettingFragmentSheet2, null, new C781750UlZ(liveHostSettingFragmentSheet2, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
