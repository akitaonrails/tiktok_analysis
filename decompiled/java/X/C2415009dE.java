package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger.EffectDebuggerComponent$handleCmdButtonClick$2$1$1", f = "EffectDebuggerComponent.kt", l = {}, m = "invokeSuspend")
public final class C2415009dE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Intent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415009dE(Context context, Intent intent, InterfaceC1364105Vn<? super C2415009dE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2415009dE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDebuggerComponent@97b3.handleCmdButtonClick$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        Intent intentCreateChooser = Intent.createChooser(this.LLILLJJLI, "share CMD zip file");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateChooser, "Context_startActivity_1");
        C1701330uNH.LIZ(intentCreateChooser, context);
        C2204961BRm.LJJJJJL(context, intentCreateChooser, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMncIYD/z91Lyo2/SmAnH9TZCEfHeahhf5imDltCoTyYC/EsxvyxloRg==", null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleCmdButtonClick$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
