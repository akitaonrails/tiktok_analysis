package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.18lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21379118lZ extends RecyclerView {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C21379118lZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21379118lZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PanelRecycleView);
            this.LL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.PanelRecycleView_itemMargin, 0.0f);
            this.LLILLJJLI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.PanelRecycleView_firstItemMargin, 0.0f);
            this.LLILLL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.PanelRecycleView_lastItemMargin, 0.0f);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PanelRecycleView_itemShowBorder, true);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            if (z) {
                int i2 = this.LL;
                if (i2 > 0) {
                    this.LL = i2 - (iLIZIZ * 2);
                }
                int i3 = this.LLILLJJLI;
                if (i3 > 0) {
                    this.LLILLJJLI = i3 - iLIZIZ;
                }
                int i4 = this.LLILLL;
                if (i4 > 0) {
                    this.LLILLL = i4 - iLIZIZ;
                }
            }
            addItemDecoration(new C19LO(this, 1));
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
