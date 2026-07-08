package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.topeffect.LiveTopStickerEffectWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import njp.a;

/* JADX INFO: renamed from: X.0Uo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.topeffect.LiveTopStickerEffectWidget$playEffect$1", f = "LiveTopStickerEffectWidget.kt", l = {66}, m = "invokeSuspend")
public final class C783260Uo0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PrivilegeDynamicEffectMessage.StickerEffectModel LLILLJJLI;
    public final /* synthetic */ LiveTopStickerEffectWidget LLILLL;
    public final /* synthetic */ PrivilegeDynamicEffectMessage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783260Uo0(PrivilegeDynamicEffectMessage.StickerEffectModel stickerEffectModel, LiveTopStickerEffectWidget liveTopStickerEffectWidget, PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage, InterfaceC1364105Vn<? super C783260Uo0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectModel;
        this.LLILLL = liveTopStickerEffectWidget;
        this.LLILZ = privilegeDynamicEffectMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783260Uo0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = obj;
        C1C7U.LIZ("LiveTopStickerEffectWidget@b002.playEffect$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
            PrivilegeDynamicEffectMessage.StickerEffectModel stickerEffectModel = this.LLILLJJLI;
            String str = stickerEffectModel.resourceId;
            String str2 = stickerEffectModel.panelType;
            AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(this.LLILLL, stickerEffectModel, 117);
            AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(544);
            this.LL = 1;
            objLJFF = liveEffectController.LJFF(str, str2, "", this, aFwS199S0000000_12, awS378S0200000_12, null, true, false);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("LiveTopStickerEffectWidget@b002.playEffect$1");
                return objLJFF2;
            }
        }
        if (((Boolean) objLJFF).booleanValue()) {
            this.LLILLL.x1(this.LLILZ);
            Message messageObtainMessage = this.LLILLL.LL.obtainMessage(1001);
            PrivilegeDynamicEffectMessage.StickerEffectModel stickerEffectModel2 = this.LLILLJJLI;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("panel_name", stickerEffectModel2.panelType, bundle);
            messageObtainMessage.setData(bundle);
            Boolean.valueOf(this.LLILLL.LL.sendMessageDelayed(messageObtainMessage, this.LLILLJJLI.duration));
        } else {
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveTopStickerEffectWidget@b002.playEffect$1");
        return unit;
    }
}
