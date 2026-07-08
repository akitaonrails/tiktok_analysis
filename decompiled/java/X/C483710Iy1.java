package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Iy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$initSuggestedQuestion$3$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
public final class C483710Iy1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LL;
    public final /* synthetic */ C483830IyD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483710Iy1(BaMessageSettingActivity baMessageSettingActivity, C483830IyD c483830IyD, InterfaceC1364105Vn<? super C483710Iy1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baMessageSettingActivity;
        this.LLILLJJLI = c483830IyD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483710Iy1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaMessageSettingActivity baMessageSettingActivity = this.LL;
        C1238760iLC c1238760iLC = baMessageSettingActivity.LLJILLL;
        if (c1238760iLC == null) {
            c1238760iLC = null;
        }
        c1238760iLC.LJI(new AwS373S0200000_7(baMessageSettingActivity, this.LLILLJJLI, 81));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.initSuggestedQuestion$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
