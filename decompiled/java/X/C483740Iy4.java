package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0010000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Iy4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setKeywordAutoReplyUI$1$1", f = "BaMessageSettingActivity.kt", l = {}, m = "invokeSuspend")
public final class C483740Iy4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaMessageSettingActivity LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483740Iy4(BaMessageSettingActivity baMessageSettingActivity, boolean z, String str, String str2, InterfaceC1364105Vn<? super C483740Iy4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baMessageSettingActivity;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483740Iy4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19292910dr c19292910dr = this.LL.LLJI;
        C1238760iLC c1238760iLC = null;
        if (c19292910dr == null) {
            c19292910dr = null;
        }
        c19292910dr.LJI(new AwS22S0010000_7(this.LLILLJJLI, 5));
        C1238760iLC c1238760iLC2 = this.LL.LLJILJILJ;
        if (c1238760iLC2 != null) {
            c1238760iLC = c1238760iLC2;
        }
        c1238760iLC.LJI(new C483750Iy5(this.LLILLL, this.LLILZ, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaMessageSettingActivity@5e22.setKeywordAutoReplyUI$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
