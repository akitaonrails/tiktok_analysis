package X;

import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C781070UkT extends C2217421BqW implements Function1<RemindMessage, Unit> {
    public C781070UkT(C780980UkK c780980UkK) {
        super(1, c780980UkK, C780980UkK.class, "handleCopyrightViolation", "handleCopyrightViolation(Lcom/bytedance/android/livesdk/model/message/RemindMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RemindMessage remindMessage) {
        ((C780980UkK) this.receiver).LLILLL.EP(remindMessage);
        return Unit.LIZ;
    }
}
