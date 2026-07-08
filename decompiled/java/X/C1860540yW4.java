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

/* JADX INFO: renamed from: X.0yW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$innerAskQuestion$3$1", f = "MessageViewModel.kt", l = {3100}, m = "invokeSuspend")
public final class C1860540yW4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ TakoActiveActionItem LLILLL;
    public final /* synthetic */ TakoActiveBotItem LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ ExtraRequestInfo LLJILLL;
    public final /* synthetic */ TakoReferenceAskInfo LLJJ;
    public final /* synthetic */ TakoEditAskInfo LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860540yW4(MessageViewModel messageViewModel, TakoActiveActionItem takoActiveActionItem, TakoActiveBotItem takoActiveBotItem, String str, String str2, boolean z, Map<String, String> map, String str3, int i, Integer num, int i2, int i3, ExtraRequestInfo extraRequestInfo, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, InterfaceC1364105Vn<? super C1860540yW4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = takoActiveActionItem;
        this.LLILZ = takoActiveBotItem;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = map;
        this.LLJ = str3;
        this.LLJI = i;
        this.LLJIJIL = num;
        this.LLJILJIL = i2;
        this.LLJILJILJ = i3;
        this.LLJILLL = extraRequestInfo;
        this.LLJJ = takoReferenceAskInfo;
        this.LLJJI = takoEditAskInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860540yW4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e9 A[PHI: r8 r16
      0x02e9: PHI (r8v11 java.lang.String) = (r8v9 java.lang.String), (r8v10 java.lang.String), (r8v10 java.lang.String), (r8v18 java.lang.String) binds: [B:91:0x02ca, B:103:0x02e6, B:101:0x02e2, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r16v5 java.lang.Long) = (r16v3 java.lang.Long), (r16v4 java.lang.Long), (r16v4 java.lang.Long), (r16v7 java.lang.Long) binds: [B:91:0x02ca, B:103:0x02e6, B:101:0x02e2, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r124) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1860540yW4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
