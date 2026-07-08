package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0yaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotHelper$exitBotMode$1$1", f = "TakoBotHelper.kt", l = {}, m = "invokeSuspend")
public final class C1863250yaR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ TakoActiveBotItem LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863250yaR(InterfaceC665370Q7z interfaceC665370Q7z, Context context, TakoActiveBotItem takoActiveBotItem, Function0<Unit> function0, InterfaceC1364105Vn<? super C1863250yaR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = context;
        this.LLILLL = takoActiveBotItem;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863250yaR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoBotHelper@93ed.exitBotMode$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1863710ybB c1863710ybB = C1863710ybB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        c1863710ybB.getClass();
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        if (takoChatUIAbility != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM();
            C436650HAh c436650HAhFm0 = takoChatUIAbility.fm0();
            if (c436650HAhFm0 != null && !c436650HAhFm0.LLILZIL) {
                C436650HAh.LIZIZ(viewOnAttachStateChangeListenerC20604515jvCM, new AwS372S0200000_6(c436650HAhFm0, viewOnAttachStateChangeListenerC20604515jvCM, 54));
            }
        }
        Context context = this.LLILLJJLI;
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LL;
        TakoActiveBotItem takoActiveBotItem = this.LLILLL;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IMessageAbility.class, null);
        if (iMessageAbility != null) {
            TakoActiveBotItem takoActiveBotItem2 = new TakoActiveBotItem(new TakoBotInfo(1L, 1, null, null, 0, 0, null, null, false, false, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 67108860, null), "", "", "", 0L);
            if (Intrinsics.LJFF(takoActiveBotItem.enterMethod, "click_see_conversation") && !iMessageAbility.DD2(takoActiveBotItem.processId)) {
                z = false;
            } else {
                z = true;
            }
            iMessageAbility.YM(context, takoActiveBotItem2, true);
            iMessageAbility.QB0(null);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863360yac(iMessageAbility, takoActiveBotItem2, takoActiveBotItem, z, null), 3);
            C1860520yW2.LIZ.getClass();
            TakoActiveBotHistory takoActiveBotHistoryLIZIZ = C1860520yW2.LIZIZ();
            C1863830ybN.LIZ(takoActiveBotHistoryLIZIZ.items, new AwS606S0100000_27(takoActiveBotItem, 374));
            C1860520yW2.LJIJJLI(takoActiveBotHistoryLIZIZ);
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotHelper@93ed.exitBotMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
