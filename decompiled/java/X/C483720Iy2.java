package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0010000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Iy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setWelcomeMessageUI$1$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
public final class C483720Iy2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C484210Iyp LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483720Iy2(BaMessageSettingActivity baMessageSettingActivity, boolean z, C484210Iyp c484210Iyp, String str, InterfaceC1364105Vn<? super C483720Iy2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baMessageSettingActivity;
        this.LLILLJJLI = z;
        this.LLILLL = c484210Iyp;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483720Iy2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19292910dr c19292910dr = this.LL.LLJ;
        C1238760iLC c1238760iLC = null;
        if (c19292910dr == null) {
            c19292910dr = null;
        }
        c19292910dr.LJI(new AwS22S0010000_7(this.LLILLJJLI, 8));
        C1238760iLC c1238760iLC2 = this.LL.LLJILJIL;
        if (c1238760iLC2 != null) {
            c1238760iLC = c1238760iLC2;
        }
        c1238760iLC.LJI(new C483730Iy3(this.LLILLL, this.LLILZ, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setWelcomeMessageUI$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
