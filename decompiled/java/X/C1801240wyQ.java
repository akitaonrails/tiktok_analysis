package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.TakoASRSpeechProcessor$startRecord$1", f = "TakoASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1801240wyQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1801310wyX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801240wyQ(C1801310wyX c1801310wyX, InterfaceC1364105Vn<? super C1801240wyQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1801310wyX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1801240wyQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoASRSpeechProcessor@5f13.startRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ().LIZJ.LIZ = System.currentTimeMillis();
        C1801310wyX c1801310wyX = this.LL;
        SpeechEngine speechEngine = c1801310wyX.LIZ;
        if (speechEngine == null) {
            C23250099c.LIZLLL(c1801310wyX.LIZJ, null, null, new C1851820yI0(c1801310wyX, true, null), 3);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoASRSpeechProcessor@5f13.startRecord$1");
            return unit;
        }
        C2286608xc.LJ(speechEngine.sendDirective(2001, ""));
        SpeechEngine speechEngine2 = this.LL.LIZ;
        if (speechEngine2 != null) {
            C2286608xc.LJ(speechEngine2.sendDirective(LSPassThroughRecordSizeConfig.DEFAULT, ""));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoASRSpeechProcessor@5f13.startRecord$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
