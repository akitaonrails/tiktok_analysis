package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatActivity$attachChatFragmentWithLoading$5", f = "TakoChatActivity.kt", l = {559, 562, 575, 586}, m = "invokeSuspend")
public final class C324860CoO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C1863380yae LLILLJJLI;
    public AnonymousClass0957 LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ TakoChatActivity LLJ;
    public final /* synthetic */ SubConversationEntranceInfo LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ C013C LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324860CoO(TakoChatActivity takoChatActivity, SubConversationEntranceInfo subConversationEntranceInfo, boolean z, long j, C013C c013c, InterfaceC1364105Vn<? super C324860CoO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = takoChatActivity;
        this.LLJI = subConversationEntranceInfo;
        this.LLJIJIL = z;
        this.LLJILJIL = j;
        this.LLJILJILJ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324860CoO c324860CoO = new C324860CoO(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c324860CoO.LLIZLLLIL = obj;
        return c324860CoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C324860CoO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
