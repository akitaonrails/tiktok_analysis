package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C454910Hsf extends C2217421BqW implements Function1<C454070HrJ, Unit> {
    public C454910Hsf(SendMessageVM sendMessageVM) {
        super(1, sendMessageVM, SendMessageVM.class, "fireSendStickerEvent", "fireSendStickerEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/sendmsg/SendStickerParam;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C454070HrJ c454070HrJ) {
        ((SendMessageVM) this.receiver).Up0(c454070HrJ);
        return Unit.LIZ;
    }
}
