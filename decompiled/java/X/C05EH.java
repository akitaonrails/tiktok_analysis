package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerMusicChangeHandler$updateRecommendMusicControl$1$1", f = "RecordStickerMusicChangeHandler.kt", l = {}, m = "invokeSuspend")
public final class C05EH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1624310sN3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EH(C1624310sN3 c1624310sN3, InterfaceC1364105Vn<? super C05EH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1624310sN3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerMusicChangeHandler@4775.updateRecommendMusicControl$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1624370sN9 interfaceC1624370sN9LIZIZ = this.LL.LIZIZ();
        if (interfaceC1624370sN9LIZIZ != null) {
            interfaceC1624370sN9LIZIZ.ZS0(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerMusicChangeHandler@4775.updateRecommendMusicControl$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
