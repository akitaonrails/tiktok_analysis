package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.LastUsedStickerAutoRestoreManager$restoreLastUsedSticker$1$1$2$1", f = "LastUsedStickerAutoRestoreManager.kt", l = {}, m = "invokeSuspend")
public final class C408401iM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEffect LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C408401iM(LiveEffect liveEffect, InterfaceC1364105Vn<? super C408401iM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C408401iM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LastUsedStickerAutoRestoreManager@16c1.restoreLastUsedSticker$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0UA1.LIZ().LJIIIIZZ(this.LL, C0UD4.LIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LastUsedStickerAutoRestoreManager@16c1.restoreLastUsedSticker$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
