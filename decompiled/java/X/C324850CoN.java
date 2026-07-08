package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment$attachChatFragmentWithLoading$4", f = "TakoChatRootFragment.kt", l = {346, 349, 361, 371}, m = "invokeSuspend")
public final class C324850CoN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public C1863380yae LLILLL;
    public AnonymousClass0957 LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ TakoChatRootFragment LLJI;
    public final /* synthetic */ SubConversationEntranceInfo LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ C013C LLJILLL;
    public final /* synthetic */ C013C LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324850CoN(TakoChatRootFragment takoChatRootFragment, SubConversationEntranceInfo subConversationEntranceInfo, boolean z, long j, C013C c013c, C013C c013c2, InterfaceC1364105Vn<? super C324850CoN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = takoChatRootFragment;
        this.LLJIJIL = subConversationEntranceInfo;
        this.LLJILJIL = z;
        this.LLJILJILJ = j;
        this.LLJILLL = c013c;
        this.LLJJ = c013c2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324850CoN c324850CoN = new C324850CoN(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c324850CoN.LLJ = obj;
        return c324850CoN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109 A[PHI: r8
      0x0109: PHI (r8v1 int) = (r8v0 int), (r8v4 int) binds: [B:50:0x0105, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0218  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324850CoN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
