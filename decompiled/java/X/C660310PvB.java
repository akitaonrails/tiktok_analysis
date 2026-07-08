package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660310PvB extends LinearLayout {
    public final ConstraintLayout LL;
    public final TextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final SmartImageView LLILZ;
    public final ImageView LLILZIL;
    public Product LLILZLL;

    public static void LIZIZ(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static void LIZJ(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public C660310PvB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.bp9, this);
        this.LL = (ConstraintLayout) findViewById(R.id.xlh);
        this.LLILLJJLI = (TextView) findViewById(R.id.video_anchor_text);
        this.LLILLL = (TuxIconView) findViewById(R.id.rxr);
        this.LLILZ = (SmartImageView) findViewById(R.id.rxs);
        this.LLILZIL = (ImageView) findViewById(R.id.video_anchor_arrow);
    }

    public static String LIZ(Product product, int i) {
        String str = null;
        if (i <= 0 || product == null || ((str = product.elasticTitle) != null && str.length() > 0)) {
            return str;
        }
        return product.title;
    }
}
