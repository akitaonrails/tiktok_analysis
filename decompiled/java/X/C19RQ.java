package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: X.19RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19RQ implements C19RS {
    public Drawable LIZ;
    public final /* synthetic */ CardView LIZIZ;

    public C19RQ(CardView cardView) {
        this.LIZIZ = cardView;
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ.LLILZ.set(i, i2, i3, i4);
        CardView cardView = this.LIZIZ;
        Rect rect = cardView.LLILLL;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
