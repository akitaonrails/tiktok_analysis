package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem$toastOnBotEnter$1$1", f = "TakoBotBarAssem.kt", l = {182}, m = "invokeSuspend")
public final class C1855850yOV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoBotBarAssem LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ TakoActiveBotItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855850yOV(TakoBotBarAssem takoBotBarAssem, C19EG c19eg, TakoActiveBotItem takoActiveBotItem, InterfaceC1364105Vn<? super C1855850yOV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoBotBarAssem;
        this.LLILLL = c19eg;
        this.LLILZ = takoActiveBotItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1855850yOV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotBarAssem@53a1.toastOnBotEnter$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoBotBarAssem@53a1.toastOnBotEnter$1$1");
                return objLJFF;
            }
        }
        TakoBotBarAssem takoBotBarAssem = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        TakoActiveBotItem takoActiveBotItem = this.LLILZ;
        takoBotBarAssem.getClass();
        if (C07I8.LIZIZ) {
            C0DQF.LJ(takoBotBarAssem.getContentView(), C786410Ut5.j4(c19eg.getString(2131849800), Arrays.copyOf(new Object[]{takoActiveBotItem.bot.botName}, 1)), null, null, false, 28);
        } else if (C1857690yRT.LJIIJJI(c19eg)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(C786410Ut5.j4(c19eg.getString(2131849800), Arrays.copyOf(new Object[]{takoActiveBotItem.bot.botName}, 1)));
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotBarAssem@53a1.toastOnBotEnter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
