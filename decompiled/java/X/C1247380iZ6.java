package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1247380iZ6 extends C2217421BqW implements Function1<Integer, Unit> {
    public C1247380iZ6(User user) {
        super(1, user, User.class, "setFansCount", "setFansCount(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((User) this.receiver).setFansCount(num.intValue());
        return Unit.LIZ;
    }
}
