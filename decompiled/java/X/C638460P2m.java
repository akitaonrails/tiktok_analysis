package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0P2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638460P2m extends LinearLayout {
    public boolean LL;

    public C638460P2m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TuxTextView tuxTextView;
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 2 && !this.LL) {
            C08QU c08quLJIIIZ = C09RB.LJIIIZ(new C09RD(this), AFwS240S0000000_9.get$arr$(511));
            if (C09RB.LJFF(c08quLJIIIZ) == 2) {
                C08QT c08qt = new C08QT(c08quLJIIIZ);
                Object next = null;
                if (c08qt.hasNext()) {
                    next = c08qt.next();
                    if (c08qt.hasNext()) {
                        float textSize = ((TextView) ((View) next)).getTextSize();
                        do {
                            Object next2 = c08qt.next();
                            float textSize2 = ((TextView) ((View) next2)).getTextSize();
                            if (Float.compare(textSize, textSize2) > 0) {
                                next = next2;
                                textSize = textSize2;
                            }
                        } while (c08qt.hasNext());
                    }
                }
                View view = (View) next;
                if (view != null) {
                    C08QT c08qt2 = new C08QT(C09RB.LJIIIZ(c08quLJIIIZ, new AwS375S0200000_9(view, view, 65)));
                    while (c08qt2.hasNext()) {
                        View view2 = (View) c08qt2.next();
                        this.LL = true;
                        if ((view2 instanceof C197039127h) && (tuxTextView = (TuxTextView) view2) != null) {
                            tuxTextView.LJJJJI(C0HCL.LIZIZ(((TextView) view).getTextSize(), view.getContext()));
                        }
                    }
                }
            }
        }
    }
}
