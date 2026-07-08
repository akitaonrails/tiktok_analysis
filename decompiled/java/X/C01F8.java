package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01F8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01F8 extends C09AY implements Function1<User, Unit> {
    public final /* synthetic */ UserFanTicket LL;
    public final /* synthetic */ C01IS LLILLJJLI;
    public final /* synthetic */ User LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01F8(UserFanTicket userFanTicket, C01IS c01is, User user) {
        super(1);
        this.LL = userFanTicket;
        this.LLILLJJLI = c01is;
        this.LLILLL = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) {
        UserPlayInfo userPlayInfo = this.LL.playInfo;
        if (userPlayInfo != null && userPlayInfo.score > 0) {
            this.LLILLJJLI.LJFF = this.LLILLL;
        } else {
            this.LLILLJJLI.LJFF = null;
        }
        return Unit.LIZ;
    }
}
