package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.VoiceBoxASRSpeechProcessor$finishTalking$1", f = "VoiceBoxASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1702730uPX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1767320w5i LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702730uPX(C1767320w5i c1767320w5i, InterfaceC1364105Vn<? super C1702730uPX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1767320w5i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702730uPX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceBoxASRSpeechProcessor@378b.finishTalking$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SpeechEngine speechEngine = this.LL.LIZJ;
        if (speechEngine != null) {
            C2286608xc.LJ(speechEngine.sendDirective(1100, ""));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceBoxASRSpeechProcessor@378b.finishTalking$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
