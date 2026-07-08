package X;

import com.bytedance.im.core.proto.MessageBody;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;

/* JADX INFO: renamed from: X.0YJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {OppoPermissionPopupMaskDelayExp.DEFAULT}, m = "handleMessageBody")
public final class C872280YJu extends AbstractC23140094w {
    public MessageBody LL;
    public C0YKD LLILLJJLI;
    public C0YFV LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C872150YJh LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872280YJu(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C872280YJu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.handleMessageBody$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLJI.LJI(null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.handleMessageBody$1");
        return objLJI;
    }
}
