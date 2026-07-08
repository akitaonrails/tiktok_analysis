package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.ECSurpriseSetAnimDebugInfo;
import java.util.List;

/* JADX INFO: renamed from: X.1879, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1879 extends FrameLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final int LLILLL;
    public List<String> LLILZ;
    public int LLILZIL;
    public final C054G LLILZLL;
    public AnonymousClass0956 LLIZ;
    public final long LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public final ECSurpriseSetAnimDebugInfo LLJIJIL;
    public final long LLJILJIL;

    public final void LIZ() {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            C786410Ut5.Od(tuxTextView2, 0.0f);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            C786410Ut5.B5(tuxTextView3, 0.0f);
        }
        TuxTextView tuxTextView4 = this.LLILLJJLI;
        if (tuxTextView4 != null) {
            C786410Ut5.wd(tuxTextView4, this.LLILLL);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2296808zG.LIZJ(this.LLILZLL, null);
    }

    public final void setDataAndStart(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LLILZ = list;
        this.LLILZIL = 0;
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LL.setText((CharSequence) ListProtector.get(this.LLILZ, this.LLILZIL));
        C786410Ut5.wd(this.LL, 0.0f);
        C03DZ.LIZJ(this.LL);
        C03DZ.LIZJ(this.LLILLJJLI);
        LIZ();
        this.LLJ = true;
        this.LLJI = null;
        this.LLIZ = C23250099c.LIZLLL(this.LLILZLL, null, null, new C187A(this, null), 3);
    }

    public final void setTuxTextFont(int i) {
        this.LL.setTuxFont(i);
        this.LLILLJJLI.setTuxFont(i);
    }

    public AnonymousClass1879(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLILZ = C13BV.INSTANCE;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZLL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLIZLLLIL = 480L;
        ECSurpriseSetAnimDebugInfo eCSurpriseSetAnimDebugInfoLIZ = AnonymousClass1876.LIZ();
        this.LLJIJIL = eCSurpriseSetAnimDebugInfoLIZ;
        this.LLJILJIL = eCSurpriseSetAnimDebugInfoLIZ.lotteryTotalDurationMs;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-1, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView2, new FrameLayout.LayoutParams(-1, -2));
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.Od(tuxTextView2, tuxTextView2.getHeight());
        this.LLILLJJLI = tuxTextView2;
        setTuxTextFont(33);
        addView(tuxTextView);
        addView(tuxTextView2);
    }
}
