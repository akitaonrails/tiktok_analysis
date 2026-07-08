package X;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0rzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609520rzC extends FrameLayout {
    public C1609520rzC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public C1609520rzC(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0rzD
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setOval(0, (view.getHeight() - view.getWidth()) / 2, view.getWidth(), ((view.getHeight() - view.getWidth()) / 2) + view.getWidth());
            }
        });
        setClipToOutline(true);
        setClipChildren(true);
    }
}
