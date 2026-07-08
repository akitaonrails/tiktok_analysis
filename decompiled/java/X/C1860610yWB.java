package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem$onBotEnter$1", f = "TakoBotBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C1860610yWB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoBotBarAssem LL;
    public final /* synthetic */ TakoActiveBotItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860610yWB(TakoBotBarAssem takoBotBarAssem, TakoActiveBotItem takoActiveBotItem, InterfaceC1364105Vn<? super C1860610yWB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoBotBarAssem;
        this.LLILLJJLI = takoActiveBotItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860610yWB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C1C7U.LIZ("TakoBotBarAssem@53a1.onBotEnter$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            TakoActiveBotItem takoActiveBotItem = this.LLILLJJLI;
            TakoBotInfo takoBotInfo = takoActiveBotItem.bot;
            iTakoContextAbility.PG0(new C144T(takoBotInfo.botSource, takoBotInfo.botName, takoBotInfo.botAvatar, takoBotInfo.botId, takoActiveBotItem.enterMethod, takoActiveBotItem.processId));
        }
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ITakoContextAbility.class, null);
        if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            TakoActiveBotItem takoActiveBotItem2 = this.LLILLJJLI;
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = c1863850ybP.LLILZIL;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            C1862330yYx.LJJJJZI(c1862330yYx, str, str2, str3, takoActiveBotItem2.bot.botId, c1863850ybP.LLJILLL, takoActiveBotItem2.enterMethod, takoActiveBotItem2.processId, str4, c1863850ybP.LLIZ);
        }
        if (!this.LLILLJJLI.bot.disableHistory) {
            C1860520yW2.LIZ.getClass();
            TakoActiveBotHistory takoActiveBotHistoryLIZIZ = C1860520yW2.LIZIZ();
            takoActiveBotHistoryLIZIZ.items.add(this.LLILLJJLI);
            C1860520yW2.LJIJJLI(takoActiveBotHistoryLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotBarAssem@53a1.onBotEnter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
