package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822590xWr extends C09AY implements Function0<User> {
    public C1822590xWr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final User invoke() {
        return UserService.getInstance().user().LJIJJLI();
    }
}
