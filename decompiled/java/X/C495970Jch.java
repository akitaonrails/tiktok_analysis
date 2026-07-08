package X;

import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.profile.service.LiveProfilePresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C495970Jch extends C2217421BqW implements Function1<UserProfileEvent, Unit> {
    public C495970Jch(Object obj) {
        super(1, obj, LiveProfilePresenter.class, "onEvent", "onEvent(Lcom/bytedance/android/livesdk/event/UserProfileEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserProfileEvent userProfileEvent) {
        ((LiveProfilePresenter) this.receiver).onEvent(userProfileEvent);
        return Unit.LIZ;
    }
}
