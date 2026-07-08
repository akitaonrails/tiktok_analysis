package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0DQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339000DQs extends FrameLayout {
    public TuxTextView LL;
    public C1203320hQ2 LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;

    private final View getDividerFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.srl);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    private final C1203320hQ2 getRatingBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srg);
            this.LLILLJJLI = (C1203320hQ2) callbackFindViewById;
        }
        return (C1203320hQ2) callbackFindViewById;
    }

    private final TuxTextView getRatingScoreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srw);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getSoldCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vol);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZIZ() {
        int i = 0;
        boolean z = getRatingScoreFromXml().getVisibility() == 0;
        boolean z2 = getSoldCountFromXml().getVisibility() == 0;
        C786410Ut5.LJLLLLLL((z && z2) ? 0 : 8, getDividerFromXml());
        if (!z && !z2) {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    private final void setRate(float f) {
        boolean z;
        int i;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView ratingScoreFromXml = getRatingScoreFromXml();
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, ratingScoreFromXml);
        C1203320hQ2 ratingBarFromXml = getRatingBarFromXml();
        if (z) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, ratingBarFromXml);
        if (z) {
            getRatingScoreFromXml().setText(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
            getRatingBarFromXml().setValue(f);
        }
        LIZIZ();
    }

    private final void setSales(long j) {
        if (j > 0) {
            String string = getContext().getString(2131832578, C1843510y4b.LIZ(j));
            C786410Ut5.LJLLLLLL(0, getSoldCountFromXml());
            getSoldCountFromXml().setText(string);
        } else {
            C786410Ut5.LLLLZLL(getSoldCountFromXml(), 8);
            getSoldCountFromXml().setText("");
        }
        LIZIZ();
    }

    public C339000DQs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.auj, this, true);
    }

    public final void LIZ(Float f, Integer num) {
        float fFloatValue;
        long jIntValue;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        setRate(fFloatValue);
        if (num != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = 0;
        }
        setSales(jIntValue);
    }
}
