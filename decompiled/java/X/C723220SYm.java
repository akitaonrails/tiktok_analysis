package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723220SYm extends C09AY implements Function2<FeedAvatarAssemWrap, C291001Au<? extends Integer>, Unit> {
    public C723220SYm() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedAvatarAssemWrap feedAvatarAssemWrap, C291001Au<? extends Integer> c291001Au) {
        final FeedAvatarAssemWrap feedAvatarAssemWrap2 = feedAvatarAssemWrap;
        if (c291001Au != null) {
            C0CAU.LIZIZ(new Runnable() { // from class: X.0SYz
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    View view;
                    C1C7U.LIZ("FeedAvatarAssemWrap@5094.onViewCreated$8$1");
                    try {
                        C0SZ0 c0sz0 = feedAvatarAssemWrap2.LLJZ;
                        if (c0sz0 != null && C20586815h4.LIZ() && (view = c0sz0.LIZJ) != null) {
                            HandlerHook.viewPostDelay(view, new RunnableC723340SYy(c0sz0), C300480BqA.LIZ());
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedAvatarAssemWrap@5094.onViewCreated$8$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
