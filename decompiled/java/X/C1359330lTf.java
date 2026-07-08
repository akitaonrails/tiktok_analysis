package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionLikeRegistry;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359330lTf extends LinearLayout {
    public final boolean LL;
    public Aweme LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public RepostReplyStruct LLILZIL;
    public InterfaceC1359530lTz LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final LinearLayout LLJ;
    public final LinearLayout LLJI;
    public final TuxIconView LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public C11JL LLJJIJIIJIL;
    public final AwS635S0100000_21 LLJJIJIL;
    public final AwS635S0100000_21 LLJJJ;

    public final void LIZ() {
        TuxTextView tuxTextView;
        LinearLayout linearLayout;
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView == null || (tuxTextView = this.LLJILJIL) == null || (linearLayout = this.LLJ) == null) {
            return;
        }
        if (this.LLJJIII) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(getContext().getString(2131845759));
            LJI(tuxTextView, 0, 0);
            LJ(linearLayout, 8, 2, 8, 2);
            if (this.LL) {
                LIZLLL(24, linearLayout);
                tuxTextView.setTuxFont(71);
                LJI(tuxTextView, 0, 0);
                LJ(linearLayout, 8, 0, 8, 0);
                return;
            }
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        tuxTextView.setText(getContext().getString(2131845758));
        LIZLLL(22, linearLayout);
        if (!this.LL) {
            tuxTextView.setTuxFont(72);
            LJI(tuxTextView, 2, 0);
            LJ(linearLayout, 5, 0, 6, 0);
            return;
        }
        LIZLLL(24, linearLayout);
        tuxTextView.setTuxFont(71);
        LJI(tuxTextView, 4, 0);
        LJ(linearLayout, 8, 0, 8, 0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_message;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        LJFF(tuxIconView);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        RepostQuickActionRepliedRegistry repostQuickActionRepliedRegistry = RepostQuickActionRepliedRegistry.LL;
        AwS635S0100000_21 awS635S0100000_21 = this.LLJJIJIL;
        synchronized (repostQuickActionRepliedRegistry) {
            repostQuickActionRepliedRegistry.LIZJ();
            RepostQuickActionRepliedRegistry.LLILLL.add(awS635S0100000_21);
        }
        RepostQuickActionLikeRegistry repostQuickActionLikeRegistry = RepostQuickActionLikeRegistry.LL;
        repostQuickActionLikeRegistry.LIZ(this.LLJJJ);
        RepostReplyStruct repostReplyStruct = this.LLILZIL;
        if (repostReplyStruct == null || (str = repostReplyStruct.replyId) == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        boolean zLJ = repostQuickActionRepliedRegistry.LJ(str);
        String strLIZLLL = repostQuickActionRepliedRegistry.LIZLLL(str);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        if (zLJ != this.LLJJIII || !Intrinsics.LJFF(strLIZLLL, this.LLJJIJI)) {
            this.LLJJIII = zLJ;
            this.LLJJIJI = strLIZLLL;
            LIZ();
        }
        C1359430lTp c1359430lTpLIZLLL = repostQuickActionLikeRegistry.LIZLLL(str);
        if (c1359430lTpLIZLLL != null) {
            boolean z = c1359430lTpLIZLLL.LIZ;
            if (z == this.LLJJ && c1359430lTpLIZLLL.LIZIZ == this.LLJJI) {
                return;
            }
            this.LLJJ = z;
            this.LLJJI = c1359430lTpLIZLLL.LIZIZ;
            LIZJ(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RepostQuickActionRepliedRegistry repostQuickActionRepliedRegistry = RepostQuickActionRepliedRegistry.LL;
        AwS635S0100000_21 awS635S0100000_21 = this.LLJJIJIL;
        synchronized (repostQuickActionRepliedRegistry) {
            RepostQuickActionRepliedRegistry.LLILLL.remove(awS635S0100000_21);
        }
        RepostQuickActionLikeRegistry.LL.LJI(this.LLJJJ);
        C11JL c11jl = this.LLJJIJIIJIL;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LLJJIJIIJIL = null;
    }

    public C1359330lTf(Context context) {
        super(context, null, 0);
        this.LL = true;
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLJJIJI = "";
        this.LLJJIJIL = new AwS635S0100000_21(this, 118);
        this.LLJJJ = new AwS635S0100000_21(this, 91);
        setOrientation(0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i6v, this, true);
        this.LLIZ = findViewById(R.id.slm);
        this.LLIZLLLIL = findViewById(R.id.sli);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sll);
        this.LLJ = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.slh);
        this.LLJI = linearLayout2;
        this.LLJIJIL = (TuxIconView) findViewById(R.id.sln);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.slo);
        this.LLJILJILJ = (TuxIconView) findViewById(R.id.slj);
        this.LLJILLL = (TuxTextView) findViewById(R.id.slk);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(36));
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        if (linearLayout2 != null) {
            linearLayout2.setBackground(drawableLIZ);
        }
        if (linearLayout != null) {
            Drawable.ConstantState constantState = drawableLIZ.getConstantState();
            linearLayout.setBackground(constantState != null ? constantState.newDrawable() : null);
        }
    }

    public final int LIZIZ(Number number) {
        return (int) (number.floatValue() * getResources().getDisplayMetrics().density);
    }

    public final void LIZJ(boolean z) {
        TuxIconView tuxIconView;
        int i;
        int i2;
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            if (this.LLJJ) {
                i2 = R.raw.icon_heart_fill;
            } else {
                i2 = R.raw.icon_heart;
            }
            tuxIconView2.setIconRes(i2);
        }
        TuxIconView tuxIconView3 = this.LLJILJILJ;
        if (tuxIconView3 != null) {
            if (this.LLJJ) {
                i = R.attr.a04;
            } else {
                i = R.attr.a1j;
            }
            tuxIconView3.setTintColorRes(i);
        }
        if (z && (tuxIconView = this.LLJILJILJ) != null) {
            tuxIconView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS121S0100000_21(tuxIconView, 87)).start();
        }
    }

    public final void LJFF(TuxIconView tuxIconView) {
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LIZIZ(13);
            layoutParams.height = LIZIZ(13);
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }

    public final void LIZLLL(int i, LinearLayout linearLayout) {
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LIZIZ(Integer.valueOf(i));
            C786410Ut5.d6(linearLayout, layoutParams);
        }
    }

    public final void LJI(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMargins(LIZIZ(Integer.valueOf(i)), LIZIZ(0), LIZIZ(Integer.valueOf(i2)), LIZIZ(0));
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void LJ(LinearLayout linearLayout, int i, int i2, int i3, int i4) {
        linearLayout.setPadding(LIZIZ(Integer.valueOf(i)), LIZIZ(Integer.valueOf(i2)), LIZIZ(Integer.valueOf(i3)), LIZIZ(Integer.valueOf(i4)));
    }
}
