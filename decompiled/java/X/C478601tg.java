package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.TPDivideCard;
import webcast.data.TPNormalText;
import webcast.data.TPSendGiftCard;
import webcast.data.TouchPointCardItem;

/* JADX INFO: renamed from: X.01tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.ConsumptionTaskContainerAssem$initTouchPointLayout$2$1", f = "ConsumptionTaskContainerAssem.kt", l = {82}, m = "invokeSuspend")
public final class C478601tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<TouchPointCardItem> LLILLJJLI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478601tg(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478601tg(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1891350zJl c224300tl;
        TPNormalText tPNormalText;
        C1C7U.LIZ("ConsumptionTaskContainerAssem@9187.initTouchPointLayout$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<TouchPointCardItem> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (TouchPointCardItem touchPointCardItem : list) {
                int i2 = touchPointCardItem.cardType;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3 && (tPNormalText = (TPNormalText) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), touchPointCardItem.cardData, TPNormalText.class)) != null) {
                            c224300tl = new C478701th(tPNormalText.background, tPNormalText.text);
                        }
                    } else {
                        TPDivideCard tPDivideCard = (TPDivideCard) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), touchPointCardItem.cardData, TPDivideCard.class);
                        c224300tl = new C224300tl(tPDivideCard.color, tPDivideCard.height);
                    }
                    arrayList.add(c224300tl);
                } else {
                    TPSendGiftCard tPSendGiftCard = (TPSendGiftCard) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), touchPointCardItem.cardData, TPSendGiftCard.class);
                    if (tPSendGiftCard != null) {
                        c224300tl = new C1146980fxA(tPSendGiftCard.giftId, tPSendGiftCard.background, tPSendGiftCard.button);
                        arrayList.add(c224300tl);
                    }
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C478501tf c478501tf = new C478501tf(this.LLILLL, arrayList, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c478501tf) == objLJFF) {
                C1C7U.LIZIZ("ConsumptionTaskContainerAssem@9187.initTouchPointLayout$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConsumptionTaskContainerAssem@9187.initTouchPointLayout$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
