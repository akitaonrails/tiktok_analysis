package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: X.0lzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1379070lzV extends LinearLayout {
    public final ImageView LL;
    public final TextView LLILLJJLI;
    public final View LLILLL;

    public int getLayoutResource() {
        return R.layout.acf;
    }

    public ImageView getShareImageView() {
        return this.LL;
    }

    public TextView getShareTextView() {
        return this.LLILLJJLI;
    }

    public C1379070lzV(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(getLayoutResource(), C786410Ut5.ne(context), this);
        this.LL = (ImageView) findViewById(R.id.uy_);
        this.LLILLJJLI = (TextView) findViewById(R.id.uya);
        View viewFindViewById = findViewById(R.id.cgp);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
    }

    public void setIcon(int i) {
        ImageView imageView = this.LL;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setIconAlpha(float f) {
        if (this.LL != null) {
            C786410Ut5.V4(this.LL, f);
        }
    }

    public void setText(String str) {
        int i;
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            if (str.contains(" ")) {
                i = 2;
            } else {
                i = 1;
            }
            textView.setMaxLines(i);
            TextView textView2 = this.LLILLJJLI;
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
            StringBuilder sb = new StringBuilder();
            sb.append(stringTokenizer.nextToken());
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.length() >= 8) {
                    sb.append(" \n");
                    sb.append(strNextToken);
                } else {
                    sb.append(" ");
                    sb.append(strNextToken);
                }
            }
            textView2.setText(sb.toString());
        }
    }

    public void setTextAlpha(float f) {
        if (this.LLILLJJLI != null) {
            C786410Ut5.S4(f, this.LLILLJJLI);
        }
    }

    public void setTextColor(int i) {
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(i));
        }
    }

    public void setTextSize(float f) {
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = this.LL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setText(int i) {
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(i);
        }
    }
}
