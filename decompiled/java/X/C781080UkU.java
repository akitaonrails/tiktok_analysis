package X;

import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C781080UkU extends C2217421BqW implements Function1<RemindMessage, Unit> {
    public C781080UkU(C780990UkL c780990UkL) {
        super(1, c780990UkL, C780990UkL.class, "handleCopyrightViolation", "handleCopyrightViolation(Lcom/bytedance/android/livesdk/model/message/RemindMessage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RemindMessage remindMessage) {
        ((C780990UkL) this.receiver).LLILLJJLI.EP(remindMessage);
        return Unit.LIZ;
    }
}
