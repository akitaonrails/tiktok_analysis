package X;

import com.ss.android.ugc.gamora.editorpro.startup.task.delay.CheckVoiceEffectResTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.delay.CheckVoiceEffectResTask$run$1", f = "CheckVoiceEffectResTask.kt", l = {}, m = "invokeSuspend")
public final class C353070Dsn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CheckVoiceEffectResTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353070Dsn(CheckVoiceEffectResTask checkVoiceEffectResTask, InterfaceC1364105Vn<? super C353070Dsn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = checkVoiceEffectResTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353070Dsn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckVoiceEffectResTask@ef6a.run$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C0FPW) this.LL.LL.getValue()).LJIIIIZZ(false, C0FXJ.get$arr$(0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckVoiceEffectResTask@ef6a.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
