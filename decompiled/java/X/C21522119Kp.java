package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21522119Kp extends FrameLayout {
    public final ImageView LL;
    public final ImageView LLILLJJLI;
    public final View LLILLL;
    public final ImageView LLILZ;

    public final View getBodyFrame() {
        return this.LLILLL;
    }

    public final ImageView getBottomArrow() {
        return this.LLILLJJLI;
    }

    public final ImageView getTopArrow() {
        return this.LL;
    }

    public final ImageView getXOut() {
        return this.LLILZ;
    }

    public C21522119Kp(Context context) {
        super(context);
        C786410Ut5.Sd(R.layout.ago, C786410Ut5.ne(context), this);
        View viewFindViewById = findViewById(R.id.e96);
        if (viewFindViewById != null) {
            this.LL = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.e94);
            if (viewFindViewById2 != null) {
                this.LLILLJJLI = (ImageView) viewFindViewById2;
                this.LLILLL = findViewById(R.id.e8x);
                View viewFindViewById3 = findViewById(R.id.e8y);
                if (viewFindViewById3 != null) {
                    this.LLILZ = (ImageView) viewFindViewById3;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
