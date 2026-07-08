package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS489S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem$onBind$1", f = "TakoAnswerImageListItem.kt", l = {830}, m = "invokeSuspend")
public final class C1856760yPy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAnswerImageListItemAssem LLILLJJLI;
    public final /* synthetic */ C1856720yPu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856760yPy(TakoAnswerImageListItemAssem takoAnswerImageListItemAssem, C1856720yPu c1856720yPu, InterfaceC1364105Vn<? super C1856760yPy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAnswerImageListItemAssem;
        this.LLILLL = c1856720yPu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1856760yPy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAnswerImageListItemAssem@75b.onBind$1");
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
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                AwS489S0200000_27 awS489S0200000_27 = new AwS489S0200000_27(this.LLILLL, this.LLILLJJLI, 3);
                this.LL = 1;
                if (takoCardAbility.ly2(awS489S0200000_27, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoAnswerImageListItemAssem@75b.onBind$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAnswerImageListItemAssem@75b.onBind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
