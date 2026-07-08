package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195590hDZ extends LinearLayout {
    public final C1203290hPz LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C1195600hDa LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZIL.LIZ();
    }

    public final void LIZ(EnumC1195610hDb enumC1195610hDb) {
        int i;
        int i2;
        int i3;
        C1203290hPz c1203290hPz = this.LL;
        int i4 = 8;
        if (enumC1195610hDb != EnumC1195610hDb.LLILLJJLI && enumC1195610hDb != EnumC1195610hDb.LLILLL) {
            i = 8;
        } else {
            i = 0;
        }
        int visibility = c1203290hPz.getVisibility();
        c1203290hPz.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1203290hPz);
        TuxIconView tuxIconView = this.LLILLJJLI;
        EnumC1195610hDb enumC1195610hDb2 = EnumC1195610hDb.LLILZ;
        if (enumC1195610hDb != enumC1195610hDb2 && enumC1195610hDb != EnumC1195610hDb.LLILZIL && enumC1195610hDb != EnumC1195610hDb.LLILZLL && enumC1195610hDb != EnumC1195610hDb.LLIZ) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i2);
        TuxTextView tuxTextView = this.LLILLL;
        EnumC1195610hDb enumC1195610hDb3 = EnumC1195610hDb.LLILLL;
        if (enumC1195610hDb != enumC1195610hDb3 && enumC1195610hDb != enumC1195610hDb2 && enumC1195610hDb != EnumC1195610hDb.LLILZIL && enumC1195610hDb != EnumC1195610hDb.LLILZLL) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i3);
        TuxTextView tuxTextView2 = this.LLILZ;
        if (enumC1195610hDb == enumC1195610hDb3 || enumC1195610hDb == enumC1195610hDb2 || enumC1195610hDb == EnumC1195610hDb.LLILZIL || enumC1195610hDb == EnumC1195610hDb.LLIZ) {
            i4 = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i4);
        if (enumC1195610hDb == EnumC1195610hDb.LLIZ) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ != null) {
                this.LLILZ.setTextColor(numLIZJ.intValue());
            }
            this.LLILLJJLI.setTintColorRes(R.attr.a02);
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, getContext());
        if (numLIZJ2 != null) {
            this.LLILZ.setTextColor(numLIZJ2.intValue());
        }
        this.LLILLJJLI.setTintColorRes(R.attr.ny);
    }

    public final void setTrackParams(C1174900ggC c1174900ggC) {
        C1195600hDa c1195600hDa = this.LLILZIL;
        c1195600hDa.LIZLLL = c1174900ggC;
        c1195600hDa.LIZ();
    }

    public C1195590hDZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = new C1195600hDa(this, EnumC1195620hDc.RATING_BAR, null);
        setOrientation(0);
        setGravity(16);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.djw, this, true);
        this.LL = (C1203290hPz) findViewById(R.id.nst);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.nsu);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.nsw);
        this.LLILLL = tuxTextView;
        tuxTextView.setTextDirection(3);
        this.LLILZ = (TuxTextView) findViewById(R.id.nss);
        LIZ(EnumC1195610hDb.LL);
    }
}
