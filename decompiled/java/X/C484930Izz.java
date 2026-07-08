package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Izz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484930Izz extends C0J00 {
    @Override // X.AbstractC484810Izn
    public final ViewGroup.LayoutParams i0() {
        int iLIZ = C439101nJ.LIZ(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMarginStart(C439101nJ.LIZ(12));
        marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
        marginLayoutParams.bottomMargin = iLIZ;
        return marginLayoutParams;
    }

    public /* synthetic */ C484930Izz(Context context) {
        this(context, null, 0);
    }

    @Override // X.AbstractC484810Izn
    public final void h0(int i) {
        C0J09 c0j09 = C0J09.LIVE_SURVEY_CARD;
        if (C0J07.LIZLLL(c0j09)) {
            setBackground(C0J07.LIZIZ(c0j09, getContext(), C418440Gaw.LIZIZ(12), R.attr.zh));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.8f);
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    public C484930Izz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dez, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e5, context);
        if (numLIZJ != null) {
            h0(numLIZJ.intValue());
        }
    }
}
