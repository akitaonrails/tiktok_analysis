package X;

import Y.ACListenerS71S0300000_4;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DGH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGH extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final ImageView LL;
    public final TextView LLILLJJLI;
    public final CardView LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final /* synthetic */ C0DGF LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DGH(C0DGF c0dgf, View view) {
        super(view);
        this.LLILZLL = c0dgf;
        this.LL = (ImageView) view.findViewById(R.id.lch);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zeg);
        this.LLILLL = (CardView) view.findViewById(R.id.fep);
        this.LLILZ = view.findViewById(R.id.v_disabled_mask);
        this.LLILZIL = view.findViewById(R.id.v_disabled_overlay);
    }

    public final void I5(C0D5D c0d5d, boolean z, List<String> list) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        float f;
        int i2;
        int i3;
        int iLIZ;
        this.LLILLJJLI.setText(c0d5d.LIZ);
        int i4 = 0;
        if (!list.isEmpty() && !list.contains("image")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!list.isEmpty() && !list.contains("selection")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!list.isEmpty() && !list.contains("availability")) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z2) {
            Object tag = this.LL.getTag(R.id.ucp_image_model_url);
            if (!(tag instanceof String)) {
                tag = null;
            }
            if (c0d5d.LIZIZ.length() > 0) {
                if (!Intrinsics.LJFF(tag, c0d5d.LIZIZ)) {
                    this.LL.setBackgroundColor(0);
                    this.LL.setTag(R.id.ucp_image_model_url, c0d5d.LIZIZ);
                    C0D8X.LIZ().LIZ(c0d5d.LIZIZ, this.LL, 0.0f, null);
                }
            } else {
                if (tag != null) {
                    this.LL.setTag(R.id.ucp_image_model_url, null);
                    this.LL.setImageDrawable(null);
                }
                TypedValue typedValue = new TypedValue();
                this.itemView.getContext().getTheme().resolveAttribute(R.attr.a03, typedValue, true);
                int i5 = typedValue.type;
                if (28 <= i5 && i5 < 32) {
                    iLIZ = typedValue.data;
                } else {
                    iLIZ = C446980Hfs.LIZ(this.itemView.getContext(), typedValue.resourceId);
                }
                this.LL.setBackgroundColor(iLIZ);
            }
        }
        float f2 = 0.4f;
        if (z3 || z4) {
            C786410Ut5.b5(this.LLILLL, 1.0f);
            View view = this.LLILZ;
            if (view != null) {
                if (c0d5d.LIZJ) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                C786410Ut5.LJLLLLLL(i3, view);
            }
            View view2 = this.LLILZIL;
            if (c0d5d.LIZJ) {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, view2);
            C786410Ut5.V4(this.LL, 1.0f);
            View view3 = this.itemView;
            if (z) {
                i = R.drawable.fh3;
            } else if (!c0d5d.LIZJ) {
                i = R.drawable.fh2;
            } else {
                i = R.drawable.fh4;
            }
            view3.setBackgroundResource(i);
            Drawable background = this.itemView.getBackground();
            if (background != null) {
                if (c0d5d.LIZJ) {
                    i2 = 255;
                } else {
                    i2 = 102;
                }
                background.setAlpha(i2);
            }
            TextView textView = this.LLILLJJLI;
            if (c0d5d.LIZJ) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.S4(f, textView);
            this.LLILZLL.LLLI(this, z);
        }
        View view4 = this.itemView;
        if (!this.LLILZLL.LLILLL || z) {
            f2 = 1.0f;
        }
        C786410Ut5.T4(view4, f2);
        C786410Ut5.I7(new ACListenerS71S0300000_4(c0d5d, this, this.LLILZLL, 7), this.itemView);
    }
}
