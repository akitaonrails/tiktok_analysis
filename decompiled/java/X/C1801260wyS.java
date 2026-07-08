package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.TakoASRSpeechProcessor$finishTalking$1", f = "TakoASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1801260wyS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1801310wyX LL;
    public final /* synthetic */ EnumC1801380wye LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801260wyS(C1801310wyX c1801310wyX, EnumC1801380wye enumC1801380wye, long j, InterfaceC1364105Vn<? super C1801260wyS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1801310wyX;
        this.LLILLJJLI = enumC1801380wye;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1801260wyS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoASRSpeechProcessor@5f13.finishTalking$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1801280wyU c1801280wyULJ = this.LL.LJ();
        EnumC1801380wye enumC1801380wye = this.LLILLJJLI;
        long j = this.LLILLL;
        C1801270wyT c1801270wyT = c1801280wyULJ.LIZJ;
        c1801270wyT.LIZJ = enumC1801380wye;
        c1801270wyT.LIZLLL = j;
        c1801270wyT.LIZIZ = System.currentTimeMillis();
        this.LL.LJ().LIZIZ.LIZ = System.currentTimeMillis();
        SpeechEngine speechEngine = this.LL.LIZ;
        if (speechEngine != null) {
            C2286608xc.LJ(speechEngine.sendDirective(1100, ""));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoASRSpeechProcessor@5f13.finishTalking$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
