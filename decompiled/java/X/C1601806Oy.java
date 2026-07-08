package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem;

/* JADX INFO: renamed from: X.06Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.CommonChatNoticeAssem", f = "CommonChatNoticeAssem.kt", l = {470}, m = "isPeerBusinessOrCreatorAccount")
public final class C1601806Oy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommonChatNoticeAssem LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601806Oy(CommonChatNoticeAssem commonChatNoticeAssem, InterfaceC1364105Vn<? super C1601806Oy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = commonChatNoticeAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonChatNoticeAssem@3038.isPeerBusinessOrCreatorAccount$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOp = this.LLILLJJLI.op(this);
        C1C7U.LIZIZ("CommonChatNoticeAssem@3038.isPeerBusinessOrCreatorAccount$1");
        return objOp;
    }
}
