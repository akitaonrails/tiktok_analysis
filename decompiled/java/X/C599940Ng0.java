package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ng0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.instantfeed.TimeWindowFrequencyRule$validationRule$1", f = "ValidationChain.kt", l = {}, m = "invokeSuspend")
public final class C599940Ng0 extends C09AX implements Function2<AbstractC1566610qrz, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C599950Ng1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599940Ng0(C599950Ng1 c599950Ng1, InterfaceC1364105Vn<? super C599940Ng0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c599950Ng1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599940Ng0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TimeWindowFrequencyRule@e898.validationRule$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C599950Ng1 c599950Ng1 = this.LL;
        c599950Ng1.getClass();
        boolean z = false;
        if ((System.currentTimeMillis() - ((InterfaceC625970Ogt) c599950Ng1.LIZ.getValue()).getLong("key_last_trigger_timestamp", 0L)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > ((Number) c599950Ng1.LIZJ.getValue()).intValue()) {
            ((InterfaceC625970Ogt) c599950Ng1.LIZ.getValue()).LIZJ("key_frequency_counter", 0);
        } else {
            if (((InterfaceC625970Ogt) c599950Ng1.LIZ.getValue()).getInt("key_frequency_counter", 0) < ((Number) c599950Ng1.LIZIZ.getValue()).intValue()) {
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("TimeWindowFrequencyRule@e898.validationRule$1");
            return boolValueOf;
        }
        z = true;
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("TimeWindowFrequencyRule@e898.validationRule$1");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1566610qrz abstractC1566610qrz, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(abstractC1566610qrz, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
