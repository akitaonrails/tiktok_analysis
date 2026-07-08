package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707780RpY extends C09AY implements Function1<Lifecycle, C707770RpX> {
    public C707780RpY() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RpX] */
    @Override // kotlin.jvm.functions.Function1
    public final C707770RpX invoke(Lifecycle lifecycle) {
        final Lifecycle lifecycle2 = lifecycle;
        return new AbstractC616030OEf<VideoItemParams>(lifecycle2) { // from class: X.0RpX
            public final Lifecycle LLILZIL;

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return this.LLILZIL;
            }

            {
                super("bottom_button_user_suggestion");
                this.LLILZIL = lifecycle2;
            }
        };
    }
}
