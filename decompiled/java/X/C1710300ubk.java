package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ubk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1710300ubk extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public C1710310ubl LLILLL;

    public final TuxIconView getNoticeIconViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pcx);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getNoticeInfoViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pcy);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ(C1710310ubl c1710310ubl) {
        if (!Intrinsics.LJFF(this.LLILLL, c1710310ubl)) {
            this.LLILLL = c1710310ubl;
            getNoticeInfoViewFromXml().setText(c1710310ubl.LIZ);
            TuxTextView noticeInfoViewFromXml = getNoticeInfoViewFromXml();
            C1711340udQ c1711340udQ = C1711340udQ.LIZ;
            Context context = getContext();
            String str = c1710310ubl.LIZIZ;
            String str2 = c1710310ubl.LIZJ;
            c1711340udQ.getClass();
            noticeInfoViewFromXml.setTextColor(C1711340udQ.LIZLLL(C1711340udQ.LIZIZ(context, str, str2), "#A6000000"));
            String strLIZ = C1711340udQ.LIZ(getContext(), c1710310ubl.LJFF, c1710310ubl.LJI);
            if (strLIZ == null) {
                strLIZ = " ";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LJIIIZ.LJJI(getNoticeIconViewFromXml());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C1722120uuo.LIZ(8));
            gradientDrawable.setColor(C1711340udQ.LIZLLL(C1711340udQ.LIZIZ(getContext(), c1710310ubl.LIZLLL, c1710310ubl.LJ), "#0D000000"));
            if (getChildCount() > 0) {
                getChildAt(0).setBackground(gradientDrawable);
            }
        }
    }

    public final void setNoticeIconViewFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setNoticeInfoViewFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C1710300ubk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1710300ubk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dw2, this, true);
    }
}
