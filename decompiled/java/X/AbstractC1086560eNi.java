package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1086560eNi extends ViewOnAttachStateChangeListenerC20604515jv {
    public final boolean LJJI(View view) {
        while (true) {
            if (view != null && !Intrinsics.LJFF(view, this)) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                    break;
                }
            } else {
                break;
            }
        }
        return Intrinsics.LJFF(view, this);
    }

    public AbstractC1086560eNi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC1086560eNi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
