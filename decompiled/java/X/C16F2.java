package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.a;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16F2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16F2 extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public final TuxTextView getDivider() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final TuxTextView getMaxScore() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final TuxTextView getScore() {
        return (TuxTextView) this.LL.getValue();
    }

    public final void setStyle(int i) {
        int iLIZ = C960203pA.LIZ(R.attr.a1k, getContext());
        getDivider().setTextColor(iLIZ);
        getMaxScore().setTextColor(iLIZ);
        switch (i) {
            case 1:
                getScore().setTextColor(iLIZ);
                getScore().setTuxFont(51);
                getDivider().setTuxFont(81);
                getMaxScore().setTuxFont(81);
                break;
            case 2:
                getScore().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
                getScore().setTuxFont(42);
                getDivider().setTuxFont(61);
                getMaxScore().setTuxFont(61);
                break;
            case 3:
                getScore().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
                getScore().setTuxFont(12);
                getDivider().setTuxFont(71);
                getMaxScore().setTuxFont(71);
                break;
            case 4:
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                if (numLIZJ != null) {
                    getScore().setTextColor(numLIZJ.intValue());
                }
                getScore().setTuxFont(13);
                getDivider().setTuxFont(51);
                getMaxScore().setTuxFont(51);
                break;
            case 5:
                getScore().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
                getMaxScore().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
                getDivider().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
                getScore().setTuxFont(62);
                getDivider().setTuxFont(61);
                getMaxScore().setTuxFont(62);
                break;
            case 6:
                getScore().setTextColor(a.LIZIZ(R.attr.a1j, getContext()));
                getMaxScore().setTextColor(a.LIZIZ(R.attr.a1j, getContext()));
                getDivider().setTextColor(a.LIZIZ(R.attr.a1j, getContext()));
                getScore().setTuxFont(71);
                getDivider().setTuxFont(71);
                getMaxScore().setTuxFont(71);
                break;
            case 7:
                getScore().setTextColor(a.LIZIZ(R.attr.a1h, getContext()));
                getMaxScore().setTextColor(a.LIZIZ(R.attr.a1h, getContext()));
                getDivider().setTextColor(a.LIZIZ(R.attr.a1h, getContext()));
                getScore().setTuxFont(72);
                getDivider().setTuxFont(72);
                getMaxScore().setTuxFont(72);
                break;
        }
    }

    public C16F2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.auv, this, true);
        this.LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 77));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 75));
        this.LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 76));
        setOrientation(0);
        getDivider().setText("/");
        getMaxScore().setText("5");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_RatingNumber);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_RatingNumber_commerce_style, 3);
        typedArrayObtainStyledAttributes.recycle();
        setStyle(i);
    }
}
