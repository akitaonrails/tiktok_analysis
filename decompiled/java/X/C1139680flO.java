package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftUseCompositionRenderConfig;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0flO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.RenderRequestHelper$startCompositionRender$1", f = "RenderRequestHelper.kt", l = {180}, m = "invokeSuspend")
public final class C1139680flO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1135280feI LLILLJJLI;
    public final /* synthetic */ C1136280ffu LLILLL;
    public final /* synthetic */ GiftMessage LLILZ;
    public final /* synthetic */ AssetsModel LLILZIL;
    public final /* synthetic */ InterfaceC1139410fkx LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139680flO(AssetsModel assetsModel, C1136280ffu c1136280ffu, C1135280feI c1135280feI, GiftMessage giftMessage, InterfaceC1139410fkx interfaceC1139410fkx, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1135280feI;
        this.LLILLL = c1136280ffu;
        this.LLILZ = giftMessage;
        this.LLILZIL = assetsModel;
        this.LLILZLL = interfaceC1139410fkx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1135280feI c1135280feI = this.LLILLJJLI;
        return new C1139680flO(this.LLILZIL, this.LLILLL, c1135280feI, this.LLILZ, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1140120fm6 abstractC1140120fm6;
        InterfaceC1138060fim interfaceC1138060fim;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Integer numLIZIZ;
        int iIntValue;
        C1C7U.LIZ("RenderRequestHelper@639c.startCompositionRender$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String strLIZIZ = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long compositionTimeOutInMs = GiftUseCompositionRenderConfig.INSTANCE.getCompositionTimeOutInMs();
                C1139690flP c1139690flP = new C1139690flP(this.LLILZIL, this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZLL, null);
                this.LL = 1;
                obj = C099A.LIZIZ(compositionTimeOutInMs, c1139690flP, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RenderRequestHelper@639c.startCompositionRender$1");
                    return objLJFF;
                }
            }
            abstractC1140120fm6 = (AbstractC1140120fm6) obj;
            e = null;
        } catch (C094W e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("RenderRequestHelper_ttlive_gift_render", "startComposition TimeoutCancellationException");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("msg_id", String.valueOf(this.LLILLJJLI.LJ));
            linkedHashMap.put("effect_id", String.valueOf(this.LLILLJJLI.LJFF));
            linkedHashMap.put("gift_id", String.valueOf(this.LLILLJJLI.LJIIL));
            linkedHashMap.put("is_local", String.valueOf(this.LLILLJJLI.LJIILJJIL ? 1 : 0));
            linkedHashMap.put("is_background", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
            C1136500fgG.LIZ("gift_effect_composition_play_start_timeout", linkedHashMap, e, false);
            abstractC1140120fm6 = null;
        }
        if (e == null) {
            if (abstractC1140120fm6 != null) {
                e = abstractC1140120fm6.LIZ();
            } else {
                e = null;
            }
        }
        C1136280ffu c1136280ffu = this.LLILLL;
        if (abstractC1140120fm6 != null) {
            interfaceC1138060fim = (InterfaceC1138060fim) abstractC1140120fm6.LIZJ();
        } else {
            interfaceC1138060fim = null;
        }
        c1136280ffu.LJII = interfaceC1138060fim;
        if (this.LLILLL.LJII == null) {
            StringBuilder sb = new StringBuilder("startCompositionRender error, isSkip:");
            if (abstractC1140120fm6 != null) {
                boolValueOf = Boolean.valueOf(abstractC1140120fm6 instanceof C1140240fmI);
            } else {
                boolValueOf = null;
            }
            sb.append(boolValueOf);
            sb.append(", isFail:");
            if (abstractC1140120fm6 != null) {
                boolValueOf2 = Boolean.valueOf(abstractC1140120fm6 instanceof C1140190fmD);
            } else {
                boolValueOf2 = null;
            }
            sb.append(boolValueOf2);
            sb.append(", giftId:");
            sb.append(this.LLILZ.giftId);
            sb.append(", effectId:");
            sb.append(this.LLILLJJLI.LJFF);
            sb.append(", errorCode:");
            if (abstractC1140120fm6 != null) {
                Map<Integer, String> map = C1138350fjF.LIZ;
                numLIZIZ = C1138350fjF.LIZIZ(abstractC1140120fm6.LIZ());
            } else {
                numLIZIZ = null;
            }
            sb.append(numLIZIZ);
            sb.append(", errorMsg:");
            if (abstractC1140120fm6 != null) {
                strLIZIZ = abstractC1140120fm6.LIZIZ();
            }
            sb.append(strLIZIZ);
            C20441214yg.LJFF("RenderRequestHelper_ttlive_gift_render", sb.toString(), e);
            C1136280ffu c1136280ffu2 = this.LLILLL;
            GiftMessage giftMessage = this.LLILZ;
            C1135280feI c1135280feI = this.LLILLJJLI;
            Integer numLIZIZ2 = C1138350fjF.LIZIZ(e);
            if (numLIZIZ2 != null) {
                iIntValue = numLIZIZ2.intValue();
            } else {
                iIntValue = -1;
            }
            c1136280ffu2.LIZ(giftMessage, c1135280feI, iIntValue, C1138350fjF.LIZJ(e));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RenderRequestHelper@639c.startCompositionRender$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
