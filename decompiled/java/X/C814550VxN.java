package X;

import com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver;

/* JADX INFO: renamed from: X.0VxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver", f = "PushQuickActionReceiver.kt", l = {77}, m = "replyToMessage")
public final class C814550VxN extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PushQuickActionReceiver LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C814550VxN(PushQuickActionReceiver pushQuickActionReceiver, InterfaceC1364105Vn<? super C814550VxN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = pushQuickActionReceiver;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushQuickActionReceiver@bef3.replyToMessage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("PushQuickActionReceiver@bef3.replyToMessage$1");
        return objLIZ;
    }
}
