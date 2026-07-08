package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R30, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem$onBind$6$1", f = "TakoAnswerBaseAssem.kt", l = {}, m = "invokeSuspend")
public final class C0R30 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoAnswerBaseAssem<T> LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R30(TakoAnswerBaseAssem<T> takoAnswerBaseAssem, long j, InterfaceC1364105Vn<? super C0R30> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoAnswerBaseAssem;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0R30(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj2;
        Object obj3;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        C13LC<C1863850ybP> c13lcT713;
        C1863850ybP c1863850ybP3;
        C13LC<C1863850ybP> c13lcT714;
        C1863850ybP c1863850ybP4;
        C13LC<C1863850ybP> c13lcT715;
        C1863850ybP c1863850ybP5;
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.onBind$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LL;
        long j = this.LLILLJJLI;
        String str6 = takoAnswerBaseAssem.LLLLLJLJLL;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbilityZp = takoAnswerBaseAssem.zp();
        String string = null;
        if (iTakoContextAbilityZp != null && (c13lcT715 = iTakoContextAbilityZp.T71()) != null && (c1863850ybP5 = (C1863850ybP) c13lcT715.LIZIZ()) != null) {
            str = c1863850ybP5.LL;
        } else {
            str = null;
        }
        ITakoContextAbility iTakoContextAbilityZp2 = takoAnswerBaseAssem.zp();
        if (iTakoContextAbilityZp2 != null && (c13lcT714 = iTakoContextAbilityZp2.T71()) != null && (c1863850ybP4 = (C1863850ybP) c13lcT714.LIZIZ()) != null) {
            str2 = c1863850ybP4.LLILLJJLI;
        } else {
            str2 = null;
        }
        ITakoContextAbility iTakoContextAbilityZp3 = takoAnswerBaseAssem.zp();
        if (iTakoContextAbilityZp3 != null && (c13lcT713 = iTakoContextAbilityZp3.T71()) != null && (c1863850ybP3 = (C1863850ybP) c13lcT713.LIZIZ()) != null) {
            str3 = c1863850ybP3.LLILZIL;
        } else {
            str3 = null;
        }
        ITakoContextAbility iTakoContextAbilityZp4 = takoAnswerBaseAssem.zp();
        if (iTakoContextAbilityZp4 == null || (c13lcT712 = iTakoContextAbilityZp4.T71()) == null || (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) == null || (str4 = c1863850ybP2.LLILZLL) == null) {
            str4 = "";
        }
        ITakoContextAbility iTakoContextAbilityZp5 = takoAnswerBaseAssem.zp();
        if (iTakoContextAbilityZp5 != null && (c13lcT71 = iTakoContextAbilityZp5.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str5 = c1863850ybP.LLIZ;
        } else {
            str5 = null;
        }
        C724270Sb3 c724270Sb3 = takoAnswerBaseAssem.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        String str7 = ((C1858660yT2) obj2).LL.LLILLL.uuid;
        if (c724270Sb3 != null) {
            obj3 = c724270Sb3.LL;
        } else {
            obj3 = null;
        }
        TakoMixFeed takoMixFeedLJIIIZ = ((C1858660yT2) obj3).LL.LLILLL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
        }
        String strValueOf = String.valueOf(takoAnswerBaseAssem.t70());
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_answer_render_time", C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str7), new Pair("card_type", string), new Pair("duration", String.valueOf(j)), new Pair("is_nimble", strValueOf), new Pair("new_message", str6), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5)));
        this.LL.LLLLLJLJLL = CardStruct.IStatusCode.DEFAULT;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.onBind$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
