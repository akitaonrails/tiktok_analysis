package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0SvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736970SvX extends LinearLayout {
    public static boolean LLILLL;
    public ScrollView LL;
    public RelativeLayout LLILLJJLI;

    static {
        C844470XAv.LIZ.getClass();
        LLILLL = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "aweme_debug_repo", 1).getBoolean("debug_info_visibility", false);
    }

    public final boolean getDebugInfoVisibility() {
        return LLILLL;
    }

    @C14EU
    public final void onEvent(C736980SvY c736980SvY) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContent(String str) {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C844470XAv.LIZ.getClass();
            if (C2093608Ic.LIZJ(C844470XAv.LJIILL, "lark_inhouse")) {
                C19259110Wf c19259110Wf = C746350TPl.LIZ;
                if (c19259110Wf.LJIJJ == null) {
                    c19259110Wf.LJIJJ = new C2230608oa<>("debug_text", Boolean.TRUE);
                }
                if (c19259110Wf.LJIJJ.LIZ().booleanValue()) {
                    C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bba, this, true);
                    this.LL = (ScrollView) findViewById(R.id.wrr);
                    this.LLILLJJLI = (RelativeLayout) findViewById(R.id.to4);
                    EventBus.LIZLLL().LJIJJ(this);
                    RelativeLayout relativeLayout = this.LLILLJJLI;
                    ScrollView scrollView = null;
                    Object[] objArr = 0;
                    if (relativeLayout == null) {
                        relativeLayout = null;
                    }
                    int i = 0;
                    C786410Ut5.LLIIL(relativeLayout, 0);
                    if (LLILLL) {
                        ScrollView scrollView2 = this.LL;
                        if (scrollView2 == null) {
                            scrollView2 = null;
                        }
                        C786410Ut5.LLIILII(scrollView2, 0);
                    } else {
                        ScrollView scrollView3 = this.LL;
                        if (scrollView3 == null) {
                            scrollView3 = null;
                        }
                        C786410Ut5.LLIILII(scrollView3, 8);
                    }
                    TuxTextView tuxTextView = new TuxTextView(getContext(), objArr == true ? 1 : 0, 6, i);
                    tuxTextView.setText(str);
                    tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ef, getContext()));
                    tuxTextView.setGravity(getLeft());
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setLineSpacing(0.0f, 1.5f);
                    tuxTextView.setTextDirection(5);
                    ScrollView scrollView4 = this.LL;
                    if (scrollView4 == null) {
                        scrollView4 = null;
                    }
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(scrollView4, null);
                    scrollView4.removeAllViews();
                    ScrollView scrollView5 = this.LL;
                    if (scrollView5 != null) {
                        scrollView = scrollView5;
                    }
                    scrollView.addView(tuxTextView);
                }
            }
        }
    }

    public C736970SvX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
