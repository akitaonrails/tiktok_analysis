package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;

/* JADX INFO: renamed from: X.0Zi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907010Zi7 extends C0DXR {
    public static final C907010Zi7 LL = new C907010Zi7();

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        InterfaceC907020Zi8 interfaceC907020Zi8;
        View backgroundView;
        double width;
        if (!c21673919s1.LJIIIIZZ && !c21673919s1.LJI) {
            int childCount = recyclerView.getChildCount();
            char c = 0;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                Object objFindContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                if (objFindContainingViewHolder != null && (objFindContainingViewHolder instanceof InterfaceC907020Zi8) && (backgroundView = (interfaceC907020Zi8 = (InterfaceC907020Zi8) objFindContainingViewHolder).getBackgroundView()) != null) {
                    double dLIZJ = C418440Gaw.LIZJ(childAt.getContext());
                    double dLIZLLL = C418440Gaw.LIZLLL(childAt.getContext());
                    int[] iArr = {0, 0};
                    backgroundView.getLocationOnScreen(iArr);
                    if (backgroundView.getLayoutDirection() == 1) {
                        width = (dLIZLLL - ((double) iArr[c])) - ((double) backgroundView.getWidth());
                        c = 0;
                    } else {
                        width = iArr[c];
                    }
                    interfaceC907020Zi8.LJLLL(dLIZJ);
                    IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                    if (iIMMessageBubbleService != null) {
                        iIMMessageBubbleService.LIZJ(backgroundView, dLIZJ, dLIZLLL, (int) width, iArr[1]);
                    }
                }
            }
        }
    }
}
