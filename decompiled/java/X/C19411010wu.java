package X;

import Y.ACListenerS61S0101000_29;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19411010wu extends RelativeLayout {
    public static final /* synthetic */ int LLJ = 0;
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public ImageView LLILLL;
    public View LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public TuxTextView LLIZLLLIL;

    private int getTabIndicatorWidth() {
        int i = this.LLIZ;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("tabWidth not initialized, can't get tab indicator width");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.ne6);
        this.LL = (LinearLayout) findViewById(R.id.wxb);
        this.LLILLL = (ImageView) findViewById(R.id.lli);
        this.LLILZ = findViewById(R.id.fz3);
    }

    public View getDividerView() {
        return this.LLILZ;
    }

    public ImageView getTabIndicator() {
        return this.LLILLL;
    }

    public void setPageSelected(int i) {
        TuxTextView tuxTextView = (TuxTextView) this.LL.getChildAt(i).findViewById(R.id.tv_tab_title);
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setSelected(false);
            this.LLIZLLLIL.setTuxFont(42);
        }
        if (tuxTextView != null) {
            tuxTextView.setSelected(true);
            tuxTextView.setTuxFont(43);
            this.LLIZLLLIL = tuxTextView;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        viewPager.getClass();
        viewPager.getAdapter().getClass();
        PagerAdapter adapter = viewPager.getAdapter();
        this.LLIZ = C12ES.LJIIJ(getContext()) / adapter.getCount();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
        layoutParams.width = this.LLIZ;
        C786410Ut5.d6(this.LLILLJJLI, layoutParams);
        C786410Ut5.LJJJJJL(this.LL);
        C786410Ut5.Mc(this.LLILLJJLI, LIZ(this.LLILZIL, this.LLILZLL));
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i_6, this.LL, false);
            TuxTextView tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.tv_tab_title);
            if (i == 0) {
                this.LLIZLLLIL = tuxTextView;
                tuxTextView.setSelected(true);
                tuxTextView.setTuxFont(43);
            }
            CharSequence charSequenceLJIJJLI = adapter.LJIJJLI(i);
            if (charSequenceLJIJJLI != null && !TextUtils.isEmpty(charSequenceLJIJJLI)) {
                tuxTextView.setText(charSequenceLJIJJLI);
            }
            C786410Ut5.S7(relativeLayout, new ACListenerS61S0101000_29(viewPager, i, 7));
            this.LL.addView(relativeLayout);
        }
        viewPager.addOnPageChangeListener(new C19774712Yn(this, 2));
    }

    public C19411010wu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float LIZ(float f, int i) {
        float tabIndicatorWidth = getTabIndicatorWidth() * (i + f);
        if (C1388580mEq.LIZIZ(getContext())) {
            return -tabIndicatorWidth;
        }
        return tabIndicatorWidth;
    }
}
