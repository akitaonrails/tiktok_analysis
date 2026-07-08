package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.VoiceBoxASRSpeechProcessor$startRecord$1", f = "VoiceBoxASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1702750uPZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1767320w5i LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702750uPZ(C1767320w5i c1767320w5i, InterfaceC1364105Vn<? super C1702750uPZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1767320w5i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702750uPZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceBoxASRSpeechProcessor@378b.startRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1767320w5i c1767320w5i = this.LL;
        SpeechEngine speechEngine = c1767320w5i.LIZJ;
        if (speechEngine == null) {
            C23250099c.LIZLLL(c1767320w5i.LIZLLL, null, null, new C1851840yI2(c1767320w5i, true, null), 3);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("VoiceBoxASRSpeechProcessor@378b.startRecord$1");
            return unit;
        }
        C2286608xc.LJ(speechEngine.sendDirective(2001, ""));
        SpeechEngine speechEngine2 = this.LL.LIZJ;
        if (speechEngine2 != null) {
            C2286608xc.LJ(speechEngine2.sendDirective(LSPassThroughRecordSizeConfig.DEFAULT, ""));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VoiceBoxASRSpeechProcessor@378b.startRecord$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
