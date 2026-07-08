package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Iy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$onResume$2", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
public final class C483790Iy9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483790Iy9(BaMessageSettingActivity baMessageSettingActivity, InterfaceC1364105Vn<? super C483790Iy9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baMessageSettingActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483790Iy9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.onResume$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19292910dr c19292910dr = this.LL.LLJ;
        C1238760iLC c1238760iLC = null;
        if (c19292910dr == null) {
            c19292910dr = null;
        }
        c19292910dr.LJI(AFwS237S0000000_7.get$arr$(54));
        C1238760iLC c1238760iLC2 = this.LL.LLJILJIL;
        if (c1238760iLC2 == null) {
            c1238760iLC2 = null;
        }
        c1238760iLC2.LJI(AFwS237S0000000_7.get$arr$(55));
        C19292910dr c19292910dr2 = this.LL.LLJI;
        if (c19292910dr2 == null) {
            c19292910dr2 = null;
        }
        c19292910dr2.LJI(AFwS237S0000000_7.get$arr$(56));
        C1238760iLC c1238760iLC3 = this.LL.LLJILJILJ;
        if (c1238760iLC3 != null) {
            c1238760iLC = c1238760iLC3;
        }
        c1238760iLC.LJI(AFwS237S0000000_7.get$arr$(57));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.onResume$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
