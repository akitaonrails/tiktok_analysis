package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserInfoUpdateEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897670ZJl {
    public Function1<? super User, Unit> LIZ;

    @C14EU
    public final void onUserInfoUpdateEvent(UserInfoUpdateEvent userInfoUpdateEvent) {
        Function1<? super User, Unit> function1 = this.LIZ;
        if (function1 != null) {
            function1.invoke(userInfoUpdateEvent.user);
        }
    }
}
