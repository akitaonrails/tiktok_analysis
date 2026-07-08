package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.experiment.LsComplianceGlobalConfig;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.compliance.PoiComplianceToastManager$checkToastInner$1", f = "PoiComplianceToastManager.kt", l = {64, 68, 75}, m = "invokeSuspend")
public final class C481201u6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ LsComplianceGlobalConfig LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C481201u6(LsComplianceGlobalConfig lsComplianceGlobalConfig, String str, Map<String, String> map, Object obj, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C481201u6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lsComplianceGlobalConfig;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = obj;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C481201u6(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("PoiComplianceToastManager@7490.checkToastInner$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Function1<Boolean, Unit> function1 = this.LLIZ;
            obj2 = th;
            if (function1 != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C481101u5 c481101u5 = new C481101u5(function1, null);
                this.LL = th;
                this.LLILLJJLI = 3;
                obj2 = th;
                if (C23250099c.LJI(this, abstractC2238408pq, c481101u5) == objLJFF) {
                    C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
                    return objLJFF;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Object obj3 = this.LL;
                        C155000ia.LIZIZ(obj);
                        obj2 = obj3;
                        Objects.toString(obj2);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1202430hOb c1202430hOb = C1202430hOb.LIZ;
            LsComplianceGlobalConfig lsComplianceGlobalConfig = this.LLILLL;
            String str = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            Object obj4 = this.LLILZLL;
            Function1<Boolean, Unit> function12 = this.LLIZ;
            this.LLILLJJLI = 1;
            obj = c1202430hOb.LIZ(lsComplianceGlobalConfig, str, map, obj4, function12, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            int i2 = C1202430hOb.LIZIZ;
            if (i2 < Integer.MAX_VALUE) {
                C1202430hOb.LIZIZ = i2 + 1;
            }
            Function1<Boolean, Unit> function13 = this.LLIZ;
            if (function13 != null) {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C481001u4 c481001u4 = new C481001u4(function13, null);
                this.LLILLJJLI = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c481001u4) == objLJFF) {
                    C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
                    return objLJFF;
                }
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("PoiComplianceToastManager@7490.checkToastInner$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
