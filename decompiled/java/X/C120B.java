package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.120B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120B extends FrameLayout {
    public C424650Gkx LL;
    public C424630Gkv LLILLJJLI;
    public C427660Gpo LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public TuxTag LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public C430490GuN LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public LinearLayout LLJILJIL;
    public SmartImageView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTag LLJJ;
    public LinearLayout LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public TextView LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View.OnClickListener LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final C01GW LLJLIL;

    private final Handler getUiHandler() {
        return (Handler) this.LLJLIL.getValue();
    }

    public final int LIZIZ() {
        C430490GuN c430490GuN = this.LLJ;
        if (c430490GuN == null) {
            c430490GuN = null;
        }
        if (c430490GuN.getVisibility() != 0) {
            return 0;
        }
        C430490GuN c430490GuN2 = this.LLJ;
        return C1428310nGv.LIZIZ(c430490GuN2 != null ? c430490GuN2 : null, this.LLJL).getLineCount();
    }

    public static int LIZJ(C120B c120b) {
        TuxTextView tuxTextView = c120b.LLJI;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        int lineCount = 0;
        if (tuxTextView.getVisibility() == 0) {
            TuxTextView tuxTextView3 = c120b.LLJI;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            lineCount = C1428310nGv.LIZIZ(tuxTextView3, c120b.LLJL).getLineCount();
        }
        TuxTextView tuxTextView4 = c120b.LLJI;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        if (lineCount > tuxTextView4.getMaxLines()) {
            TuxTextView tuxTextView5 = c120b.LLJI;
            if (tuxTextView5 != null) {
                tuxTextView2 = tuxTextView5;
            }
            return tuxTextView2.getMaxLines();
        }
        return lineCount;
    }

    public static void LIZLLL(TuxTag tuxTag) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.atk, tuxTag.getContext());
        if (numLIZJ != null) {
            tuxTag.setTagBackgroundColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.av2, tuxTag.getContext());
        if (numLIZJ2 != null) {
            tuxTag.setTagTextColor(numLIZJ2.intValue());
        }
        tuxTag.setIconTintColorRes(R.attr.av2);
    }

    public final void setSeeMoreClickListener(View.OnClickListener onClickListener) {
        this.LLJJLIIIJLLLLLLLZ = onClickListener;
    }

    public C120B(Context context, AttributeSet attributeSet) {
        int marginStart;
        super(context, attributeSet);
        this.LLJLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(613));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d5p, this, false);
        this.LLJJIII = viewTd;
        C424650Gkx c424650Gkx = (C424650Gkx) (viewTd == null ? null : viewTd).findViewById(R.id.user_avatar);
        this.LL = c424650Gkx;
        (c424650Gkx == null ? null : c424650Gkx).setBorderAttrColor(R.attr.ee);
        View view = this.LLJJIII;
        this.LLILLJJLI = (C424630Gkv) (view == null ? null : view).findViewById(R.id.otv);
        View view2 = this.LLJJIII;
        this.LLILLL = (C427660Gpo) (view2 == null ? null : view2).findViewById(R.id.ptd);
        View view3 = this.LLJJIII;
        this.LLILZ = (view3 == null ? null : view3).findViewById(R.id.sh1);
        View view4 = this.LLJJIII;
        this.LLILZIL = (TuxTextView) (view4 == null ? null : view4).findViewById(R.id.zym);
        View view5 = this.LLJJIII;
        this.LLILZLL = (TuxTag) (view5 == null ? null : view5).findViewById(R.id.vog);
        View view6 = this.LLJJIII;
        this.LLIZ = (TuxTextView) (view6 == null ? null : view6).findViewById(R.id.zy8);
        View view7 = this.LLJJIII;
        View viewFindViewById = (view7 == null ? null : view7).findViewById(R.id.m_z);
        this.LLIZLLLIL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 315), viewFindViewById == null ? null : viewFindViewById);
        View view8 = this.LLJJIII;
        this.LLJ = (C430490GuN) (view8 == null ? null : view8).findViewById(R.id.rq2);
        View view9 = this.LLJJIII;
        this.LLJI = (TuxTextView) (view9 == null ? null : view9).findViewById(R.id.rsg);
        View view10 = this.LLJJIII;
        this.LLJIJIL = (TuxTextView) (view10 == null ? null : view10).findViewById(R.id.tv_toggle);
        View view11 = this.LLJJIII;
        this.LLJILJIL = (LinearLayout) (view11 == null ? null : view11).findViewById(R.id.ros);
        View view12 = this.LLJJIII;
        this.LLJILJILJ = (SmartImageView) (view12 == null ? null : view12).findViewById(R.id.b0f);
        View view13 = this.LLJJIII;
        this.LLJILLL = (TuxTextView) (view13 == null ? null : view13).findViewById(R.id.b0_);
        View view14 = this.LLJJIII;
        this.LLJJ = (TuxTag) (view14 == null ? null : view14).findViewById(R.id.sh0);
        View view15 = this.LLJJIII;
        this.LLJJI = (LinearLayout) (view15 == null ? null : view15).findViewById(R.id.sgy);
        View view16 = this.LLJJIII;
        this.LLJJIJI = (view16 == null ? null : view16).findViewById(R.id.n0r);
        View view17 = this.LLJJIII;
        this.LLJJIJIIJIL = (view17 == null ? null : view17).findViewById(R.id.ydw);
        View view18 = this.LLJJIII;
        this.LLJJJ = (TextView) (view18 == null ? null : view18).findViewById(R.id.igs);
        View view19 = this.LLJJIII;
        this.LLJJIJIL = (TextView) (view19 == null ? null : view19).findViewById(R.id.ihx);
        int iLJ = (((C11VU.LJ(getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) / 2;
        TextView textView = this.LLJJJ;
        (textView == null ? null : textView).setMaxWidth(iLJ);
        TextView textView2 = this.LLJJIJIL;
        (textView2 == null ? null : textView2).setMaxWidth(iLJ);
        View view20 = this.LLJJIII;
        this.LLJJJIL = (view20 == null ? null : view20).findViewById(R.id.jqk);
        View view21 = this.LLJJIII;
        this.LLJJJJ = (view21 == null ? null : view21).findViewById(R.id.ilt);
        View view22 = this.LLJJIII;
        this.LLJJJJJIL = (view22 == null ? null : view22).findViewById(R.id.f7b);
        View view23 = this.LLJJIII;
        this.LLJJJJLIIL = (view23 == null ? null : view23).findViewById(R.id.kk5);
        View view24 = this.LLJJIII;
        this.LLJJL = (view24 == null ? null : view24).findViewById(R.id.s6c);
        int screenWidth = ScreenUtils.getScreenWidth(getContext());
        LinearLayout linearLayout = this.LLJJI;
        ViewGroup.LayoutParams layoutParams = (linearLayout == null ? null : linearLayout).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i = screenWidth - marginStart;
        LinearLayout linearLayout2 = this.LLJJI;
        ViewGroup.LayoutParams layoutParams2 = (linearLayout2 == null ? null : linearLayout2).getLayoutParams();
        this.LLJL = i - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        View view25 = this.LLJJIII;
        C337180DJs.LIZJ((view25 == null ? null : view25).findViewById(R.id.qdz));
        TuxTextView tuxTextView = this.LLJI;
        (tuxTextView == null ? null : tuxTextView).setTuxFont(43);
        View view26 = this.LLJJIII;
        C337180DJs.LIZ((view26 == null ? null : view26).findViewById(R.id.ott));
        C424650Gkx c424650Gkx2 = this.LL;
        c424650Gkx2 = c424650Gkx2 == null ? null : c424650Gkx2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424650Gkx2);
        c424650Gkx2.setAlpha(1.0f);
        View view27 = this.LLJJIII;
        view27 = view27 == null ? null : view27;
        C786410Ut5.T4(view27.findViewById(R.id.iea), 1.0f);
        C786410Ut5.T4(view27.findViewById(R.id.hko), 1.0f);
        C786410Ut5.T4(view27.findViewById(R.id.hk0), 1.0f);
        C786410Ut5.T4(view27.findViewById(R.id.hk3), 1.0f);
        C786410Ut5.T4(view27.findViewById(R.id.hky), 1.0f);
        C786410Ut5.T4(view27.findViewById(R.id.ou2), 1.0f);
        View view28 = this.LLJJIII;
        addView(view28 != null ? view28 : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r22, java.lang.String r23, com.ss.android.ugc.aweme.base.model.UrlModel r24, int r25) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120B.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int):void");
    }
}
