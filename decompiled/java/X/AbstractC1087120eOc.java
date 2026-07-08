package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0eOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1087120eOc extends C19MX {
    public boolean LL;
    public boolean LLILLJJLI;

    public void LJ(C21530419Nu c21530419Nu, int i, int i2) {
    }

    @Override // X.C19MX, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.LL || this.LLILLJJLI) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                View viewById = constraintLayout.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.LL) {
                        C786410Ut5.LJLLLLLL(visibility, viewById);
                    }
                    if (this.LLILLJJLI && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // X.C19MX
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.LL = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.LLILLJJLI = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    public AbstractC1087120eOc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
