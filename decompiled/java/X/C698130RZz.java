package X;

import Y.AgS201S0200000_11;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2$onBind$2", f = "AutoDubbingConsumptionLabelAssemV2.kt", l = {145}, m = "invokeSuspend")
public final class C698130RZz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AutoDubbingConsumptionLabelAssemV2 LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698130RZz(AutoDubbingConsumptionLabelAssemV2 autoDubbingConsumptionLabelAssemV2, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C698130RZz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoDubbingConsumptionLabelAssemV2;
        this.LLILLL = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C698130RZz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C23127094j c23127094jLJJII;
        C1C7U.LIZ("AutoDubbingConsumptionLabelAssemV2@f3e9.onBind$2");
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
            if (C299190Bo5.LIZ() && ((Boolean) C265480Aao.LIZ.getValue()).booleanValue()) {
                c23127094jLJJII = C09IC.LJJII(C161N.LIZIZ.LJJJJJ(), C1839820xye.LIZ().LIZIZ(), C746760TRa.LIZ().LJJLIL(), C746760TRa.LIZ().LJLJJI());
            } else if (C299190Bo5.LIZ()) {
                c23127094jLJJII = C09IC.LJJII(C161N.LIZIZ.LJJJJJ(), C1839820xye.LIZ().LIZIZ(), C746760TRa.LIZ().LJJLIL());
            } else if (((Boolean) C265480Aao.LIZ.getValue()).booleanValue()) {
                c23127094jLJJII = C09IC.LJJII(C161N.LIZIZ.LJJJJJ(), C746760TRa.LIZ().LJJLIL(), C746760TRa.LIZ().LJLJJI());
            } else {
                c23127094jLJJII = C09IC.LJJII(C161N.LIZIZ.LJJJJJ(), C746760TRa.LIZ().LJJLIL());
            }
            AgS201S0200000_11 agS201S0200000_11 = new AgS201S0200000_11(this.LLILLJJLI, this.LLILLL, 0);
            this.LL = 1;
            if (c23127094jLJJII.collect(agS201S0200000_11, this) == objLJFF) {
                C1C7U.LIZIZ("AutoDubbingConsumptionLabelAssemV2@f3e9.onBind$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoDubbingConsumptionLabelAssemV2@f3e9.onBind$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
