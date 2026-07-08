package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.040i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10282040i extends LinearLayout implements InterfaceC10281040h {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;

    public abstract int getLayoutResId();

    public final TuxTextView getDiscountView() {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getOriginPriceView() {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getPrefixView() {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getRealPriceView() {
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void setDiscountView(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setOriginPriceView(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setPrefixView(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setRealPriceView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth > 0) {
            Iterator<View> it2 = new C09RD(this).iterator();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    int i7 = i5 + 1;
                    View view = (View) c09re.next();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    measureChild(view, i, i2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    if (marginLayoutParams != null) {
                        i3 = marginLayoutParams.leftMargin;
                    } else {
                        i3 = 0;
                    }
                    int i8 = measuredWidth2 + i3;
                    if (marginLayoutParams != null) {
                        i4 = marginLayoutParams.rightMargin;
                    } else {
                        i4 = 0;
                    }
                    i6 += i8 + i4;
                    if (i6 > measuredWidth && i5 >= 1) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    i5 = i7;
                } else {
                    return;
                }
            }
        }
    }

    public AbstractC10282040i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), getLayoutResId(), this, true);
        setPrefixView((TuxTextView) findViewById(R.id.q7o));
        setRealPriceView((TuxTextView) findViewById(R.id.q7p));
        setOriginPriceView((TuxTextView) findViewById(R.id.q7n));
        setDiscountView((TuxTextView) findViewById(R.id.q7m));
    }

    public static CharSequence LIZIZ(AbstractC10282040i abstractC10282040i, String str, String str2, int i, Pair pair, int i2, boolean z, int i3) {
        String str3;
        if ((i3 & 8) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i3 & 16) != 0) {
            pair = new Pair(72, 43);
        }
        if ((i3 & 32) != 0) {
            i2 = R.attr.a1j;
        }
        int i4 = 0;
        if ((i3 & 64) != 0) {
            z = false;
        }
        abstractC10282040i.getClass();
        C041W c041w = new C041W();
        if (i != 1) {
            i4 = 1;
        }
        c041w.LIZJ(i4, str, str2, str3);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        c041w.LJ = iIntValue;
        c041w.LJFF = iIntValue2;
        c041w.LJII = i2;
        c041w.LJIIIIZZ = z;
        return c041w.LIZIZ(abstractC10282040i.getContext());
    }
}
