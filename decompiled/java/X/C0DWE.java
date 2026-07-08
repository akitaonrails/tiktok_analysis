package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notification.common.bar.NotificationTabBarCell;

/* JADX INFO: renamed from: X.0DWE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWE extends ViewOnAttachStateChangeListenerC20604515jv {
    public C0DWE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LJIILJJIL(NotificationTabBarCell.class);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        final boolean zLIZJ = C444960Hcc.LIZJ(context);
        addItemDecoration(new C0DXR(zLIZJ) { // from class: X.03Il
            public final boolean LL;

            {
                this.LL = zLIZJ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (!this.LL) {
                    if (childAdapterPosition == 0) {
                        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    if (childAdapterPosition == 0) {
                        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            }
        });
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
