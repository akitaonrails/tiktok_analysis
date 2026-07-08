package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveBotItem;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ci9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$innerAskQuestion$3$1", f = "MessageViewModel.kt", l = {792}, m = "invokeSuspend")
public final class C320990Ci9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ CommerceAgentActiveActionItem LLILLL;
    public final /* synthetic */ CommerceAgentActiveBotItem LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ ExtraRequestInfo LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320990Ci9(int i, int i2, CommerceAgentActiveActionItem commerceAgentActiveActionItem, CommerceAgentActiveBotItem commerceAgentActiveBotItem, MessageViewModel messageViewModel, ExtraRequestInfo extraRequestInfo, String str, String str2, String str3, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = commerceAgentActiveActionItem;
        this.LLILZ = commerceAgentActiveBotItem;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = map;
        this.LLJ = str3;
        this.LLJI = i;
        this.LLJIJIL = i2;
        this.LLJILJIL = extraRequestInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        MessageViewModel messageViewModel = this.LLILLJJLI;
        CommerceAgentActiveActionItem commerceAgentActiveActionItem = this.LLILLL;
        CommerceAgentActiveBotItem commerceAgentActiveBotItem = this.LLILZ;
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        boolean z = this.LLIZ;
        Map<String, String> map = this.LLIZLLLIL;
        return new C320990Ci9(this.LLJI, this.LLJIJIL, commerceAgentActiveActionItem, commerceAgentActiveBotItem, messageViewModel, this.LLJILJIL, str, str2, this.LLJ, map, interfaceC1364105Vn, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2 A[PHI: r7 r16
      0x01f2: PHI (r7v14 java.lang.String) = (r7v12 java.lang.String), (r7v13 java.lang.String), (r7v13 java.lang.String), (r7v21 java.lang.String) binds: [B:77:0x01d3, B:89:0x01ef, B:87:0x01eb, B:40:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r16v5 java.lang.Long) = (r16v3 java.lang.Long), (r16v4 java.lang.Long), (r16v4 java.lang.Long), (r16v7 java.lang.Long) binds: [B:77:0x01d3, B:89:0x01ef, B:87:0x01eb, B:40:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r78) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320990Ci9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
