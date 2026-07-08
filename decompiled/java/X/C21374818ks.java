package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS166S0100000_32;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21374818ks extends RelativeLayout {
    public static final /* synthetic */ int LLILLL = 0;
    public ImageView LL;
    public ImageView LLILLJJLI;

    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS134S0200000_32(this, onClickListener, 17));
        }
    }

    public void setFlashLightClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, onClickListener);
        }
    }

    public void setPhotoPickerListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, onClickListener);
        }
    }

    public void setShowFlashLight(int i) {
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(i, imageView);
        }
    }

    public void setTorch(boolean z) {
        int i;
        ImageView imageView = this.LLILLJJLI;
        if (z) {
            i = R.drawable.bzp;
        } else {
            i = R.drawable.bzo;
        }
        imageView.setBackgroundResource(i);
    }

    public C21374818ks(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.f904fta, C786410Ut5.ne(getContext()), this);
        this.LL = (ImageView) viewSd.findViewById(R.id.z_x);
        this.LLILLJJLI = (ImageView) viewSd.findViewById(R.id.tv_photo_picker);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OcrTitleView);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.OcrTitleView_can_back, true) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.OcrTitleView_back_img, 0)) != 0) {
                this.LL.setBackgroundResource(resourceId);
            }
            ImageView imageView = this.LLILLJJLI;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.c0p);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        C786410Ut5.Q7(this.LL, new ACListenerS166S0100000_32(this, 83));
    }
}
