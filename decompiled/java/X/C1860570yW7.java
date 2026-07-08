package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$askQuestion$1", f = "MessageViewModel.kt", l = {3025}, m = "invokeSuspend")
public final class C1860570yW7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC1858090yS7 LLILLL;
    public final /* synthetic */ MessageViewModel LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ TakoActiveActionItem LLIZLLLIL;
    public final /* synthetic */ TakoActiveBotItem LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ ExtraRequestInfo LLJJ;
    public final /* synthetic */ TakoReferenceAskInfo LLJJI;
    public final /* synthetic */ TakoEditAskInfo LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860570yW7(String str, EnumC1858090yS7 enumC1858090yS7, MessageViewModel messageViewModel, Map<String, String> map, boolean z, String str2, TakoActiveActionItem takoActiveActionItem, TakoActiveBotItem takoActiveBotItem, String str3, int i, Integer num, int i2, int i3, ExtraRequestInfo extraRequestInfo, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, InterfaceC1364105Vn<? super C1860570yW7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = enumC1858090yS7;
        this.LLILZ = messageViewModel;
        this.LLILZIL = map;
        this.LLILZLL = z;
        this.LLIZ = str2;
        this.LLIZLLLIL = takoActiveActionItem;
        this.LLJ = takoActiveBotItem;
        this.LLJI = str3;
        this.LLJIJIL = i;
        this.LLJILJIL = num;
        this.LLJILJILJ = i2;
        this.LLJILLL = i3;
        this.LLJJ = extraRequestInfo;
        this.LLJJI = takoReferenceAskInfo;
        this.LLJJIII = takoEditAskInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860570yW7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860570yW7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
