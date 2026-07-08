package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.metrics.sticker.StickerGiftTracker$interactionCrossScreenSeiListener$1$onBusinessExtraInfo$1$1", f = "StickerGiftTracker.kt", l = {}, m = "invokeSuspend")
public final class C444101o7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444101o7(Map<String, String> map, InterfaceC1364105Vn<? super C444101o7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444101o7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerGiftTracker@368d.interactionCrossScreenSeiListener$1$onBusinessExtraInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInteractionSeiUpdate: ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        Map<String, String> map = this.LL;
        c1136460fgC.getClass();
        C1136460fgC.LJIILL(map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerGiftTracker@368d.interactionCrossScreenSeiListener$1$onBusinessExtraInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
