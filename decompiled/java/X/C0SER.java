package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SER, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SER extends C09AY implements Function2<BubbleListAssem, C291001Au<? extends View>, Unit> {
    public C0SER() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(BubbleListAssem bubbleListAssem, C291001Au<? extends View> c291001Au) {
        View view;
        BubbleListAssem bubbleListAssem2 = bubbleListAssem;
        C291001Au<? extends View> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (view = (View) c291001Au2.LIZ) != null && bubbleListAssem2.LLJLL == null) {
            bubbleListAssem2.LLJLL = view;
            bubbleListAssem2.mp();
        }
        return Unit.LIZ;
    }
}
