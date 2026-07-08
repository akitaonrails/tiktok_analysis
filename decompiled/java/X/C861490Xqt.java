package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.conflict.TakoAIVideoVoiceCallConflictHandler$updateAudioFocusState$1", f = "TakoAIVideoVoiceCallConflictHandler.kt", l = {}, m = "invokeSuspend")
public final class C861490Xqt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C861500Xqu LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861490Xqt(C861500Xqu c861500Xqu, boolean z, InterfaceC1364105Vn<? super C861490Xqt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c861500Xqu;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861490Xqt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoVoiceCallConflictHandler@e340.updateAudioFocusState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZ.isAdded()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoVoiceCallConflictHandler@e340.updateAudioFocusState$1");
            return unit;
        }
        if (this.LLILLJJLI) {
            this.LL.LIZIZ.LIZJ();
        } else {
            this.LL.LIZIZ.LIZIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoVoiceCallConflictHandler@e340.updateAudioFocusState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
