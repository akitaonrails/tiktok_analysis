package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344100DeK extends FrameLayout {
    public TuxSpinner LL;
    public ImageView LLILLJJLI;

    public final ImageView getImageView() {
        return this.LLILLJJLI;
    }

    public final TuxSpinner getLoadingView() {
        return this.LL;
    }

    public final void setImageView(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setLoadingView(TuxSpinner tuxSpinner) {
        this.LL = tuxSpinner;
    }

    public C344100DeK(Context context, AttributeSet attributeSet) {
        TuxSpinner tuxSpinner;
        super(context, attributeSet, 0);
        View viewInflate = FrameLayout.inflate(context, R.layout.ddt, this);
        if (viewInflate != null) {
            tuxSpinner = (TuxSpinner) viewInflate.findViewById(R.id.nne);
        } else {
            tuxSpinner = null;
        }
        this.LL = tuxSpinner;
        this.LLILLJJLI = viewInflate != null ? (ImageView) viewInflate.findViewById(R.id.kb6) : null;
    }
}
