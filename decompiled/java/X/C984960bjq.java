package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984960bjq extends FrameLayout {
    public static final C01BH LLIZLLLIL = new C01BH(0, 0, null);
    public static final C01BH LLJ = new C01BH(0, 0, null);
    public boolean LL;
    public final C1324720kZq LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C0GRS LLILZ;
    public boolean LLILZIL;
    public C01BH LLILZLL;
    public final C1324720kZq LLIZ;

    public final void getRingColor() {
        if (this.LLILZIL) {
            C0GRS c0grs = this.LLILZ;
            if (c0grs != null) {
                c0grs.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.es2, getContext()), C20736316Cj.LIZIZ(R.attr.es1, getContext())});
                return;
            }
            return;
        }
        C0GRS c0grs2 = this.LLILZ;
        if (c0grs2 != null) {
            c0grs2.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.eug, getContext()), C20736316Cj.LIZIZ(R.attr.euf, getContext())});
        }
    }

    public final C01BH getUserInfo() {
        return this.LLILZLL;
    }

    public final void setDefaultSeat(boolean z) {
        int i;
        this.LL = true;
        this.LLILZIL = z;
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null) {
            if (z) {
                i = R.drawable.fa_;
            } else {
                i = R.drawable.fa9;
            }
            c1324720kZq.setImageResource(i);
        }
        C1324720kZq c1324720kZq2 = this.LLILLJJLI;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        C1324720kZq c1324720kZq3 = this.LLILLL;
        if (c1324720kZq3 != null) {
            C786410Ut5.LLJJIII(c1324720kZq3, 8);
        }
        C0GRS c0grs = this.LLILZ;
        if (c0grs != null) {
            int visibility = c0grs.getVisibility();
            c0grs.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0grs);
        }
        C1324720kZq c1324720kZq4 = this.LLIZ;
        if (c1324720kZq4 != null) {
            C786410Ut5.LLJJIII(c1324720kZq4, 0);
        }
        C1324720kZq c1324720kZq5 = this.LLIZ;
        if (c1324720kZq5 != null) {
            C786410Ut5.h5(c1324720kZq5, 0.0f);
        }
        this.LLILZLL = null;
    }

    public C984960bjq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g31, this, true);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.oz1);
        this.LLILLL = (C1324720kZq) findViewById(R.id.oyy);
        this.LLILZ = (C0GRS) findViewById(R.id.user_stroke);
        this.LLIZ = (C1324720kZq) findViewById(R.id.oyt);
    }
}
