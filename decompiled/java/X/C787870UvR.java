package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787870UvR extends FrameLayout {
    public ImageView LL;
    public TextView LLILLJJLI;
    public Button LLILLL;

    public final ImageView getBannerIv() {
        return this.LL;
    }

    public final Button getButton() {
        return this.LLILLL;
    }

    public final TextView getMessageTv() {
        return this.LLILLJJLI;
    }

    public C787870UvR(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_f, this, true);
        this.LL = (ImageView) findViewById(R.id.brw);
        this.LLILLJJLI = (TextView) findViewById(R.id.message_tv);
        this.LLILLL = (Button) findViewById(R.id.d6g);
    }

    public final void setBannerIv(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setButton(Button button) {
        this.LLILLL = button;
    }

    public final void setMessageTv(TextView textView) {
        this.LLILLJJLI = textView;
    }

    public final void setRetryClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.L7(this.LLILLL, onClickListener);
    }
}
