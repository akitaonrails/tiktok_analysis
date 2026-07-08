package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01o9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.metrics.sticker.StickerGiftTracker$onPlayerSeiUpdate$1", f = "StickerGiftTracker.kt", l = {}, m = "invokeSuspend")
public final class C444301o9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444301o9(Object obj, InterfaceC1364105Vn<? super C444301o9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C444301o9 c444301o9 = new C444301o9(this.LLILLJJLI, interfaceC1364105Vn);
        c444301o9.LL = obj;
        return c444301o9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerGiftTracker@368d.onPlayerSeiUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            JSONObject jSONObject = new JSONObject((String) this.LLILLJJLI);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live_sticker_gift_sei");
            if (jSONObjectOptJSONObject != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayerSeiUpdate: STREAM_SEI_KEY_STICKER_GIFT ");
                sbLIZ.append(jSONObjectOptJSONObject);
                C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
                C1136460fgC.LIZ.getClass();
                C1136460fgC.LJIIZILJ(C1136460fgC.LJIL(jSONObjectOptJSONObject));
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("live_cross_screen_first_frame_sei");
            if (jSONObjectOptJSONObject2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPlayerSeiUpdate: CROSS_SCREEN_FIRST_FRAME_SEI_KEY ");
                sbLIZ2.append(jSONObjectOptJSONObject2);
                C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ2));
                C1136460fgC.LIZ.getClass();
                C1136460fgC.LJIILL(C1136460fgC.LJIL(jSONObjectOptJSONObject2));
            } else {
                jSONObjectOptJSONObject2 = null;
            }
            C189200o6.m2constructorimpl(jSONObjectOptJSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerGiftTracker@368d.onPlayerSeiUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
