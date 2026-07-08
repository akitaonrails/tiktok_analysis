package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0ZiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C907200ZiQ extends ViewOnAttachStateChangeListenerC20604515jv {
    @Override // androidx.recyclerview.widget.RecyclerView
    public final void addOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        if (abstractC1585810rMx == null) {
            C1AF0.LIZJ("Adding null addOnScrollListener");
        } else {
            super.addOnScrollListener(abstractC1585810rMx);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        super.setOnScrollListener(abstractC1585810rMx);
    }

    public C907200ZiQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        if (Build.VERSION.SDK_INT == 28) {
            removeOnScrollListener(null);
        }
    }

    public C907200ZiQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
