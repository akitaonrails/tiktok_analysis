package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.11Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19517811Xs extends RecyclerView {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public C19773212Xy LLILZLL;

    public C19517811Xs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void LIZJ() {
        C0DXR c0dxr = this.LLILZLL;
        if (c0dxr != null) {
            removeItemDecoration(c0dxr);
        }
        if (this.LLILZIL) {
            int i = this.LL;
            if (i > 0) {
                this.LL = i - (this.LLILZ * 2);
            }
            int i2 = this.LLILLJJLI;
            if (i2 > 0) {
                this.LLILLJJLI = i2 - this.LLILZ;
            }
            int i3 = this.LLILLL;
            if (i3 > 0) {
                this.LLILLL = i3 - this.LLILZ;
            }
        }
        if (this.LL == 0 && this.LLILLJJLI == 0 && this.LLILLL == 0) {
            return;
        }
        C19773212Xy c19773212Xy = new C19773212Xy(this, 1);
        addItemDecoration(c19773212Xy);
        this.LLILZLL = c19773212Xy;
    }

    public final void setItemMargin(int i) {
        this.LL = i;
        LIZJ();
    }

    public final void setItemShowBorder(boolean z) {
        this.LLILZIL = z;
        LIZJ();
    }

    public C19517811Xs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = (int) C11VU.LIZIZ(2.0f, context);
        this.LLILZIL = true;
        GradientDrawable gradientDrawableLIZIZ = C19734012Iw.LIZIZ(context, attributeSet, false);
        if (gradientDrawableLIZIZ != null) {
            setBackground(gradientDrawableLIZIZ);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            this.LL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_item_margin, 0.0f);
            this.LLILLJJLI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_first_item_margin, 0.0f);
            this.LLILLL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_last_item_margin, 0.0f);
            this.LLILZ = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_margin_tax, C11VU.LIZIZ(2.0f, context));
            this.LLILZIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_item_show_border, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        LIZJ();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public /* synthetic */ C19517811Xs(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
