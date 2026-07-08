package X;

import com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VLU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VLU extends C09AY implements Function0<InterfaceC804960Vhu> {
    public C0VLU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC804960Vhu invoke() {
        FollowingFeedBusinessDatabase value = FollowingFeedBusinessDatabase.LLILZ.getValue();
        if (value != null) {
            return value.LIZJ();
        }
        return null;
    }
}
