package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$onSuccessWhenRequestNLE$1", f = "AutoCutComponent.kt", l = {1323}, m = "invokeSuspend")
public final class C0L4T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1418150n0X LLILLL;
    public final /* synthetic */ NLEModel LLILZ;
    public final /* synthetic */ C1418250n0h LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4T(long j, C1418150n0X c1418150n0X, NLEModel nLEModel, C1418250n0h c1418250n0h, Map<String, String> map, InterfaceC1364105Vn<? super C0L4T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1418150n0X;
        this.LLILZ = nLEModel;
        this.LLILZIL = c1418250n0h;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L4T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutComponent@2715.onSuccessWhenRequestNLE$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutComponent@2715.onSuccessWhenRequestNLE$1");
                return objLJFF;
            }
        }
        C1418150n0X c1418150n0X = this.LLILLL;
        if (c1418150n0X.LLIZ == null) {
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent onSuccessWhenRequestNLE: cancelled during delay");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutComponent@2715.onSuccessWhenRequestNLE$1");
            return unit;
        }
        c1418150n0X.W2(this.LLILZ, this.LLILZIL, this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.onSuccessWhenRequestNLE$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
