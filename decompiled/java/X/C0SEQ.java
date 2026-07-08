package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SEQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SEQ extends C09AY implements Function2<BubbleListAssem, C291001Au<? extends C0R9E>, Unit> {
    public C0SEQ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(BubbleListAssem bubbleListAssem, C291001Au<? extends C0R9E> c291001Au) {
        ViewTreeObserver viewTreeObserver;
        BubbleListAssem bubbleListAssem2 = bubbleListAssem;
        if (c291001Au != null) {
            C0SEP c0sep = bubbleListAssem2.LLJLILLLLZIIL;
            if (c0sep != null) {
                c0sep.LJJIII();
            }
            View view = bubbleListAssem2.LLJLL;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                C0SEO c0seo = bubbleListAssem2.LLLFZ;
                viewTreeObserver.removeOnGlobalLayoutListener(c0seo);
                C2187701Ajg.LIZIZ(viewTreeObserver, c0seo, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            bubbleListAssem2.LLJLLL = false;
        }
        return Unit.LIZ;
    }
}
