package X;

import Y.AgS193S0200000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06P2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$liveCardMessageConfig$businessLogicConfig$2$3", f = "CommonMessageListConfig.kt", l = {1435}, m = "invokeSuspend")
public final class C06P2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C01GW<MessagePowerListAbility> LLILLJJLI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, LiveCardViewModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06P2(C01GW<? extends MessagePowerListAbility> c01gw, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AssemVMLazy<InterfaceC0148002o, LiveCardViewModel> assemVMLazy, InterfaceC1364105Vn<? super C06P2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01gw;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILZ = assemVMLazy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06P2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<List<InterfaceC1891350zJl>> c05ydB11;
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.liveCardMessageConfig$businessLogicConfig$2$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01GW<MessagePowerListAbility> c01gw = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0ZZ5.LIZ;
            MessagePowerListAbility value = c01gw.getValue();
            if (value != null && (c05ydB11 = value.B11()) != null) {
                AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLL, this.LLILZ, 8);
                this.LL = 1;
                if (c05ydB11.collect(agS193S0200000_2, this) == objLJFF) {
                    C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.liveCardMessageConfig$businessLogicConfig$2$3");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.liveCardMessageConfig$businessLogicConfig$2$3");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
