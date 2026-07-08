package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1247460iZE extends C2217421BqW implements Function0<Integer> {
    public C1247460iZE(User user) {
        super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((User) this.receiver).getFansCount());
    }
}
