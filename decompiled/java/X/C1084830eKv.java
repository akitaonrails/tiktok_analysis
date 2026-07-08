package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0eKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084830eKv extends C19MX implements InterfaceC21527419Mq {
    public boolean LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public View[] LLILZ;

    @Override // X.InterfaceC21527419Mq
    public final void LIZ() {
    }

    @Override // X.InterfaceC21527419Mq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC21527419Mq
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC21527419Mq
    public final void LIZLLL() {
    }

    public float getProgress() {
        return this.LLILLL;
    }

    @Override // X.C19MX
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.MotionHelper_onShow) {
                    this.LL = typedArrayObtainStyledAttributes.getBoolean(index, this.LL);
                } else if (index == R$styleable.MotionHelper_onHide) {
                    this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(index, this.LLILLJJLI);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.LLILLL = f;
        int i = 0;
        if (this.mCount > 0) {
            this.LLILZ = getViews((ConstraintLayout) getParent());
            while (i < this.mCount) {
                i++;
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                viewGroup.getChildAt(i);
                i++;
            }
        }
    }
}
