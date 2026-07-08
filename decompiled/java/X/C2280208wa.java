package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.task.HybridSdkInitLogger$reportLog$1$1", f = "HybridSdkInitLogger.kt", l = {}, m = "invokeSuspend")
public final class C2280208wa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2280208wa(String str, long j, long j2, InterfaceC1364105Vn<? super C2280208wa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2280208wa(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridSdkInitLogger@ac52.reportLog$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hybrid_sdk_init_log stage: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", duration: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", offset: ");
        sbLIZ.append(this.LLILLL);
        C1530030puz.LIZIZ("HybridSdkInitLogger", C2188811AlT.LIZIZ(sbLIZ), null);
        AppLogNewUtils.LJI("hybrid_sdk_init_log", C2097608Jq.LJIIIIZZ(new Pair("stage", this.LL), new Pair("duration", String.valueOf(this.LLILLJJLI)), new Pair("offset", String.valueOf(this.LLILLL))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridSdkInitLogger@ac52.reportLog$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
