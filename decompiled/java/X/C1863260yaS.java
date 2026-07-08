package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import defpackage.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0yaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotHelper$enterBotMode$1$1", f = "TakoBotHelper.kt", l = {}, m = "invokeSuspend")
public final class C1863260yaS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ TakoActiveBotItem LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863260yaS(InterfaceC665370Q7z interfaceC665370Q7z, Context context, TakoActiveBotItem takoActiveBotItem, boolean z, boolean z2, InterfaceC1364105Vn<? super C1863260yaS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = context;
        this.LLILLL = takoActiveBotItem;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863260yaS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotHelper@93ed.enterBotMode$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1863710ybB c1863710ybB = C1863710ybB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        c1863710ybB.getClass();
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        if (takoChatUIAbility != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM();
            C436650HAh c436650HAhFm0 = takoChatUIAbility.fm0();
            if (c436650HAhFm0 != null && c436650HAhFm0.LLILZIL) {
                C436650HAh.LIZIZ(viewOnAttachStateChangeListenerC20604515jvCM, new AwS372S0200000_6(c436650HAhFm0, viewOnAttachStateChangeListenerC20604515jvCM, 53));
            }
        }
        Context context = this.LLILLJJLI;
        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LL;
        TakoActiveBotItem takoActiveBotItem = this.LLILLL;
        boolean z = this.LLILZ;
        boolean z2 = this.LLILZIL;
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IMessageAbility.class, null);
        if (iMessageAbility != null) {
            C1863420yai c1863420yai = C1863380yae.LJJII;
            c1863420yai.LJII(Integer.valueOf(takoActiveBotItem.bot.botSource), Long.valueOf(takoActiveBotItem.bot.botId), null);
            w2 w2VarLJI = c1863420yai.LJI(Integer.valueOf(takoActiveBotItem.bot.botSource), Long.valueOf(takoActiveBotItem.bot.botId), null);
            iMessageAbility.YM(context, takoActiveBotItem, true);
            iMessageAbility.QB0(takoActiveBotItem);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863350yab(iMessageAbility, z2, takoActiveBotItem, z, w2VarLJI, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotHelper@93ed.enterBotMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
