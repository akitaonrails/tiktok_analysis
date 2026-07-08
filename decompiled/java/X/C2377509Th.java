package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$realFetchVoiceEffect$1$3", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2377509Th extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TTSFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377509Th(TTSFragment tTSFragment, InterfaceC1364105Vn<? super C2377509Th> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tTSFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377509Th(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG activity;
        C1C7U.LIZ("TTSFragment@b180.realFetchVoiceEffect$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getActivity() == null || ((activity = this.LL.getActivity()) != null && activity.isFinishing())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1$3");
            return unit;
        }
        C1749280vcc c1749280vcc = this.LL.LLLL;
        if (c1749280vcc != null) {
            C786410Ut5.LJLLLLLL(8, c1749280vcc);
        }
        this.LL.oT();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TTSFragment@b180.realFetchVoiceEffect$1$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
