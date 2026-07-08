package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0rLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585010rLf extends ConstraintLayout implements InterfaceC1571760r0I {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LLIZ = (int) C0I7Z.LIZ(28);
    public static final int LLIZLLLIL = (int) C0I7Z.LIZ(24);
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public View LL;
    public TuxIconView LLILLJJLI;
    public C426770GoN LLILLL;
    public ToolBarIconModel LLILZ;
    public View LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private final void setCustomizedView(ToolBarIconModel toolBarIconModel) {
        ViewGroup viewGroup;
        View view = toolBarIconModel.customizedView;
        if (view != null) {
            if (view.getParent() == null) {
                addView(view, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    C19ME c19me = (C19ME) layoutParams;
                    c19me.startToStart = 0;
                    c19me.endToEnd = 0;
                    C786410Ut5.W5(view, c19me);
                    if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                        viewGroup.setClipChildren(false);
                    }
                    C339190DRl.LIZLLL(view);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        } else {
            view = null;
        }
        this.LLILZIL = view;
        C339190DRl.LIZIZ(this.LLILLJJLI);
        C339190DRl.LIZIZ(this.LLILLL);
    }

    private final void setIconViewByModel(ToolBarIconModel toolBarIconModel) {
        int i;
        Integer numLIZJ;
        if (toolBarIconModel.customizedView != null) {
            setCustomizedView(toolBarIconModel);
            return;
        }
        C339190DRl.LIZLLL(this.LLILLJJLI);
        if (toolBarIconModel.type == EnumC1583310rIv.SEARCH) {
            i = LLIZLLLIL;
        } else {
            i = LLIZ;
        }
        if (toolBarIconModel.useTuxIcon) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = toolBarIconModel.iconRes;
                c419910GdJ.LJ = Integer.valueOf(toolBarIconModel.tintColor);
                c419910GdJ.LIZIZ = i;
                c419910GdJ.LIZJ = i;
                c419910GdJ.LJFF = true;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
        } else {
            TuxIconView tuxIconView2 = this.LLILLJJLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageResource(toolBarIconModel.iconRes);
            }
        }
        if (toolBarIconModel.type == EnumC1583310rIv.PROFILE) {
            TuxIconView tuxIconView3 = this.LLILLJJLI;
            int iIntValue = 0;
            if (tuxIconView3 != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView3.getLayoutParams();
                int i2 = LLIZ;
                layoutParams.height = i2;
                layoutParams.width = i2;
                C786410Ut5.M6(tuxIconView3, layoutParams);
                int i3 = LLJ;
                C426750GoL.LJIIIZ(tuxIconView3, Integer.valueOf(i3), Integer.valueOf(i3), 0, 0, false, 16);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.uh4);
            int i4 = LLILZLL;
            C786410Ut5.X5(new C19ME(i4, i4), viewGroup);
            View view = this.LL;
            if (view != null) {
                C426750GoL.LJIIIZ(view, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, false, 16);
            }
            Context context = getContext();
            String str = toolBarIconModel.imageUrl;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJIIZ(R.raw.icon_color_default_avatar);
                ToolBarIconModel toolBarIconModel2 = this.LLILZ;
                if (toolBarIconModel2 != null && toolBarIconModel2.isCycle()) {
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LIZ = true;
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context)) != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    c1331750klB.LIZJ = iIntValue;
                    c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
                    c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                }
                c1331670kl3LJIIIZ.LJJI(this.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        Integer num = toolBarIconModel.heatSize;
        if (num != null) {
            int iIntValue2 = num.intValue();
            TuxIconView tuxIconView4 = this.LLILLJJLI;
            if (tuxIconView4 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView4.getLayoutParams();
                layoutParams2.height = iIntValue2;
                layoutParams2.width = iIntValue2;
                C786410Ut5.M6(tuxIconView4, layoutParams2);
            }
        }
    }

    @Override // X.InterfaceC1571760r0I
    public final void LLLLLJIL(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    @Override // X.InterfaceC1571760r0I
    public void setIconModel(ToolBarIconModel toolBarIconModel) {
        if (toolBarIconModel == null) {
            return;
        }
        this.LLILZ = toolBarIconModel;
        setIconViewByModel(toolBarIconModel);
        setContentDescription(toolBarIconModel.contentDescription);
        ToolBarIconModel toolBarIconModel2 = this.LLILZ;
        if (toolBarIconModel2 != null && toolBarIconModel2.onClick != null) {
            View.OnClickListener aCListenerS158S0100000_24 = new ACListenerS158S0100000_24(this, 64);
            if (C1848410yCV.LIZ) {
                aCListenerS158S0100000_24 = new f(aCListenerS158S0100000_24);
            }
            a aVar = new a(aCListenerS158S0100000_24);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
        if (!toolBarIconModel.hasDot) {
            View view = this.LL;
            if (view != null) {
                C339190DRl.LIZIZ(view);
            }
            C426770GoN c426770GoN = this.LLILLL;
            if (c426770GoN != null) {
                C339190DRl.LIZIZ(c426770GoN);
            }
        }
    }

    public C1585010rLf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = LLILZLL;
        C786410Ut5.Sd(R.layout.f_0, C786410Ut5.ne(context), this);
        this.LL = findViewById(R.id.k05);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.jzy);
        this.LLILLL = (C426770GoN) findViewById(R.id.bq0);
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }
}
