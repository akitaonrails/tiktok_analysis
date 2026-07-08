package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0grC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.plugin.SlashSerialLoadPlugin$tryComponentTimeOut$job$1$2", f = "SlashSerialLoadPlugin.kt", l = {}, m = "invokeSuspend")
public final class C1181720grC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1181730grD LL;
    public final /* synthetic */ C1180920gpu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181720grC(C1180920gpu c1180920gpu, C1181730grD c1181730grD, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1181730grD;
        this.LLILLJJLI = c1180920gpu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1181720grC(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIIZI(this.LLILLJJLI.LIZ, EnumC1181780grI.LOAD_FINISH);
        this.LL.LJJIIJ();
        C1181730grD c1181730grD = this.LL;
        c1181730grD.LLILLL.invoke(c1181730grD.LLJ);
        this.LL.LJJIFFI(EnumC1181770grH.LOAD_COMPONENT_TIME_OUT, this.LLILLJJLI.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
