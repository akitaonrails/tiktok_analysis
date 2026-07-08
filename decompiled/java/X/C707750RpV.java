package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707750RpV extends C09AY implements Function1<Lifecycle, C707760RpW> {
    public C707750RpV() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RpW] */
    @Override // kotlin.jvm.functions.Function1
    public final C707760RpW invoke(Lifecycle lifecycle) {
        final Lifecycle lifecycle2 = lifecycle;
        return new AbstractC616030OEf<VideoItemParams>(lifecycle2) { // from class: X.0RpW
            public final Lifecycle LLILZIL;

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return this.LLILZIL;
            }

            {
                super("bottom_button_tako_prompt");
                this.LLILZIL = lifecycle2;
            }

            @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
            public final void rr(Object obj) {
                if (!C14FR.LIZ.LJIILIIL()) {
                    LJ(false);
                } else {
                    LJ(true);
                }
            }
        };
    }
}
