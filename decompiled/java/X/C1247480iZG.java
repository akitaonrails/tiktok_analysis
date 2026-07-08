package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1247480iZG extends C2217421BqW implements Function0<Integer> {
    public C1247480iZG(User user) {
        super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((User) this.receiver).getFansCount());
    }
}
