package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.15Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20483915Dh extends ConstraintLayout {
    public static final /* synthetic */ int LLJJJJ = 0;
    public C21546719Ub LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public LinearLayout LLILZ;
    public View LLILZIL;
    public LiveIconView LLILZLL;
    public LinearLayout LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public View LLJI;
    public C766440U4s LLJIJIL;
    public List<? extends C766430U4r> LLJILJIL;
    public List<C1826660xdQ> LLJILJILJ;
    public List<C1826660xdQ> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;

    public final void h0() {
        C011Z.LIZ.getClass();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nj0);
        linearLayout.setGravity(8388627);
        if (TextUtils.isEmpty(this.LLILLL.getText())) {
            linearLayout.setPadding(C418440Gaw.LIZ(4), getPaddingTop(), C418440Gaw.LIZ(4), getPaddingBottom());
            this.LLIZ.setPadding(getPaddingLeft(), getPaddingTop(), C418440Gaw.LIZ(8), getPaddingBottom());
        } else {
            linearLayout.setPadding(C418440Gaw.LIZ(4), C418440Gaw.LIZ(8), C418440Gaw.LIZ(4), getPaddingBottom());
            this.LLIZ.setPadding(getPaddingLeft(), C418440Gaw.LIZ(8), C418440Gaw.LIZ(8), getPaddingBottom());
            this.LLIZ.setGravity(48);
            C19MB c19mb = new C19MB();
            c19mb.LJII(this);
            c19mb.LJIIIZ(R.id.nj0, 3, 0, 3, this.LLJJJ);
            c19mb.LJI(R.id.nj0, 4);
            c19mb.LIZIZ(this);
            this.LLILLL.setTextSize(1, 15.0f);
            C21382118m3.LIZIZ(this.LLILLL, 10, 15, 1, 1);
            this.LLILLL.LJJJI(R.style.a8z);
            this.LLILLL.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
            C16F5 c16f5 = this.LLILLL;
            c16f5.setText(c16f5.getText());
        }
        this.LLJJI = true;
    }

    public final void i0() {
        if (this.LLILZ.getVisibility() == 0 || this.LLILZLL.getVisibility() == 0) {
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        }
        C19ME c19me = (C19ME) this.LL.getLayoutParams();
        if (this.LLILZ.getVisibility() == 8) {
            c19me.startToStart = 0;
            c19me.startToEnd = -1;
            c19me.setMarginStart(this.LLJJIJIL);
        } else {
            c19me.startToStart = -1;
            c19me.startToEnd = R.id.ner;
            c19me.setMarginStart(0);
        }
        C21546719Ub c21546719Ub = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546719Ub);
        c21546719Ub.setLayoutParams(c19me);
    }

    public ViewGroup getEndIconViewGroup() {
        return this.LLIZ;
    }

    public final void e0(boolean z) {
        if (this.LLJJ != z) {
            if (this.LLILZ != null && !C1841090y0h.LIZ(this.LLJILJILJ)) {
                setStartList(this.LLJILJILJ);
            }
            if (this.LLIZ != null && !C1841090y0h.LIZ(this.LLJILLL)) {
                setEndList(this.LLJILLL);
            }
        }
        this.LLJJ = z;
    }

    public void setEndList(List<? extends C1826660xdQ> list) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new ArrayList();
        }
        this.LLJILLL.clear();
        if (list != null) {
            this.LLJILLL.addAll(list);
        }
        if (this.LLIZ != null) {
            List<C1826660xdQ> list2 = this.LLJILLL;
            j0(this.LLJJIJI, this.LLIZ, list2);
        }
        C786410Ut5.LLJJJJ(this.LLJ, 8);
    }

    public void setEndTextButton(C751090TdD c751090TdD) {
        this.LLJ.setText(c751090TdD.LIZIZ);
        l0(this.LLJ, c751090TdD.LIZ);
        C1570050qxX.LIZ(c751090TdD.LIZLLL, this.LLJ);
        setEndTextButtonEnable(c751090TdD.LIZJ);
        C786410Ut5.LJZL(8, this.LLIZ);
        C786410Ut5.LLJJJJ(this.LLJ, 0);
    }

    public void setEndTextButtonEnable(boolean z) {
        this.LLJ.setEnabled(z);
    }

    public void setFadingEdgeEnabled(boolean z) {
        C21546719Ub c21546719Ub = this.LL;
        if (c21546719Ub != null) {
            c21546719Ub.setHorizontalFadingEdgeEnabled(z);
        }
        setClipChildren(z);
        setClipToPadding(z);
    }

    public void setMaxEndIconCount(int i) {
        if (i <= 3 && i >= 0) {
            if (this.LLJJIJI != i) {
                this.LLJJIJI = i;
                setEndList(this.LLJILLL);
                return;
            }
            return;
        }
        C011Z.LIZ.getClass();
    }

    public void setSingleIcon(C1826660xdQ c1826660xdQ) {
        if (c1826660xdQ == null) {
            C786410Ut5.LLJJIJIL(this.LLILZLL, 8);
        } else {
            if (c1826660xdQ instanceof C758170Tod) {
                this.LLILZLL.setIconAttr(c1826660xdQ.LIZ);
            } else {
                this.LLILZLL.setIcon(c1826660xdQ.LIZ);
            }
            if (c1826660xdQ.LJ) {
                this.LLILZLL.setIconTint(c1826660xdQ.LIZLLL);
            } else {
                this.LLILZLL.setIconTint(C20736316Cj.LIZIZ(R.attr.fy3, getContext()));
            }
            View.OnClickListener onClickListener = c1826660xdQ.LIZIZ;
            if (onClickListener != null) {
                C1570050qxX.LIZ(onClickListener, this.LLILZLL);
            }
            C786410Ut5.LLJJIJIL(this.LLILZLL, 0);
        }
        i0();
    }

    public void setSingleIconAlpha(float f) {
        C786410Ut5.i5(this.LLILZLL, f);
    }

    public void setSingleIconClickable(boolean z) {
        this.LLILZLL.setClickable(z);
    }

    public void setSingleIconRotation(float f) {
        C786410Ut5.Db(this.LLILZLL, f);
    }

    public void setStartIconOffset(float f) {
        if (this.LLILZ.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZ.getLayoutParams();
            int i = (int) (this.LLJJIJIIJIL * f);
            if (i != marginLayoutParams.getMarginStart()) {
                marginLayoutParams.setMarginStart(i);
                C786410Ut5.d6(this.LLILZ, marginLayoutParams);
                return;
            }
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LL.getLayoutParams();
        int i2 = (int) (this.LLJJIJIL + ((this.LLJJIJIIJIL - this.LLJJJ) * f));
        if (i2 == marginLayoutParams2.getMarginStart()) {
            return;
        }
        marginLayoutParams2.setMarginStart(i2);
        C21546719Ub c21546719Ub = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546719Ub);
        c21546719Ub.setLayoutParams(marginLayoutParams2);
    }

    public void setStartList(List<? extends C1826660xdQ> list) {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new ArrayList();
        }
        if (this.LLJJI) {
            C011Z.LIZ.getClass();
        }
        this.LLJILJILJ.clear();
        if (list != null) {
            this.LLJILJILJ.addAll(list);
        }
        if (this.LLILZ != null) {
            List<C1826660xdQ> list2 = this.LLJILJILJ;
            j0(this.LLJJIII, this.LLILZ, list2);
            i0();
        }
        C786410Ut5.LLJJJJ(this.LLIZLLLIL, 8);
    }

    public void setStartTextButton(C751090TdD c751090TdD) {
        this.LLIZLLLIL.setText(c751090TdD.LIZIZ);
        l0(this.LLIZLLLIL, c751090TdD.LIZ);
        C1570050qxX.LIZ(c751090TdD.LIZLLL, this.LLIZLLLIL);
        setStartTextButtonEnable(c751090TdD.LIZJ);
        C786410Ut5.LJZL(8, this.LLILZ);
        i0();
        C786410Ut5.LLJJJJ(this.LLIZLLLIL, 0);
    }

    public void setStartTextButtonEnable(boolean z) {
        this.LLIZLLLIL.setEnabled(z);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.LLILLJJLI.LJJJI(R.style.a91);
        this.LLILLL.setText(charSequence);
        if (!TextUtils.isEmpty(this.LLILLJJLI.getText())) {
            C786410Ut5.LLJJJJ(this.LLILLL, 0);
        }
        if (!this.LLJJI) {
            C21382118m3.LIZIZ(this.LLILLL, 10, 11, 1, 1);
        } else {
            h0();
        }
        C21546719Ub c21546719Ub = this.LL;
        int visibility = c21546719Ub.getVisibility();
        c21546719Ub.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21546719Ub);
        this.LLJILJIL = null;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.LLJJJIL = true;
        this.LLILLJJLI.setText(charSequence);
        C786410Ut5.LLJJJJ(this.LLILLJJLI, 0);
        if (!TextUtils.isEmpty(this.LLILLL.getText())) {
            C786410Ut5.LLJJJJ(this.LLILLL, 0);
        }
        C21546719Ub c21546719Ub = this.LL;
        int visibility = c21546719Ub.getVisibility();
        c21546719Ub.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21546719Ub);
        this.LLJILJIL = null;
    }

    public C20483915Dh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void l0(C16F5 c16f5, EnumC751100TdE enumC751100TdE) {
        if (enumC751100TdE == EnumC751100TdE.PRIMARY) {
            c16f5.setTextColor(C838410Wul.LIZIZ(R.color.a_y, getContext()));
        } else {
            c16f5.setTextColor(C838410Wul.LIZIZ(R.color.a_z, getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20483915Dh.onMeasure(int, int):void");
    }

    public C20483915Dh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLJJIII = 2;
        this.LLJJIJI = 2;
        this.LLJJJIL = true;
        ViewGroup.inflate(context, R.layout.di0, this);
        this.LLJJIJIL = getContext().getResources().getDimensionPixelSize(R.dimen.a5g);
        this.LLJJJ = getContext().getResources().getDimensionPixelSize(R.dimen.a5j);
        this.LLJJIJIIJIL = context.getResources().getDimensionPixelSize(R.dimen.a5v);
        this.LL = (C21546719Ub) findViewById(R.id.wya);
        this.LLILLJJLI = (C16F5) findViewById(R.id.tv_title);
        this.LLILLL = (C16F5) findViewById(R.id.tv_subtitle);
        this.LLILZ = (LinearLayout) findViewById(R.id.neq);
        this.LLILZIL = findViewById(R.id.ner);
        this.LLILZLL = (LiveIconView) findViewById(R.id.mkz);
        this.LLIZ = (LinearLayout) findViewById(R.id.nh6);
        this.LLIZLLLIL = (C16F5) findViewById(R.id.ztk);
        this.LLJ = (C16F5) findViewById(R.id.tv_right_button);
        this.LLJI = findViewById(R.id.view_separator_line);
        new AbstractC20736416Ck<C20483915Dh>(this) { // from class: X.15PQ
            @Override // X.AbstractC20736516Cl
            public final int[] LIZLLL() {
                return R$styleable.LiveTabBarLayout;
            }

            {
                super(this);
            }

            @Override // X.AbstractC20736416Ck
            public final void LJFF(TypedArray typedArray) {
                int i2;
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R$styleable.LiveTabBarLayout_showSeparator) {
                        Boolean boolValueOf = Boolean.valueOf(typedArray.getBoolean(index, false));
                        View view = ((C20483915Dh) this.LL).LLJI;
                        if (view != null) {
                            if (boolValueOf.booleanValue()) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i2, view);
                        }
                    }
                }
            }
        }.LJII(attributeSet, 0, R.style.a37);
        List<C1826660xdQ> list = this.LLJILJILJ;
        j0(this.LLJJIII, this.LLILZ, list);
        i0();
        List<C1826660xdQ> list2 = this.LLJILLL;
        j0(this.LLJJIJI, this.LLIZ, list2);
        int[] iArr = {R.id.ner, R.id.neq, R.id.ztk};
        View viewFindViewById = findViewById(R.id.btc);
        if (viewFindViewById instanceof C19MX) {
            ((C19MX) viewFindViewById).setReferencedIds(iArr);
        }
        int[] iArr2 = {R.id.nh6, R.id.tv_right_button};
        View viewFindViewById2 = findViewById(R.id.btj);
        if (viewFindViewById2 instanceof C19MX) {
            ((C19MX) viewFindViewById2).setReferencedIds(iArr2);
        }
        q0.LJIJI(this.LLILLJJLI, true);
    }

    public final void j0(int i, LinearLayout linearLayout, List list) {
        int dimensionPixelSize;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LJZL(0, linearLayout);
            for (int i2 = 0; i2 < list.size() && i2 < i; i2++) {
                C1826660xdQ c1826660xdQ = (C1826660xdQ) ListProtector.get(list, i2);
                LiveIconView liveIconView = new LiveIconView(getContext(), null);
                if (this.LLJJ) {
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.a5u);
                } else {
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.a5t);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 17;
                C786410Ut5.w6(liveIconView, layoutParams);
                if (c1826660xdQ instanceof C758170Tod) {
                    liveIconView.setIconAttr(c1826660xdQ.LIZ);
                } else {
                    liveIconView.setIcon(c1826660xdQ.LIZ);
                }
                if (c1826660xdQ.LJ) {
                    liveIconView.setIconTint(c1826660xdQ.LIZLLL);
                } else {
                    liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.fy3, getContext()));
                }
                if (this.LLJJ) {
                    liveIconView.setIconBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, getContext()));
                    liveIconView.setIconBackgroundAppearance(R.style.j9);
                    liveIconView.setIconWidthRatio(0.625f);
                    liveIconView.setIconHeightRatio(0.625f);
                } else {
                    liveIconView.setIconBackgroundColor(0);
                    liveIconView.setIconBackgroundAppearance(0);
                    liveIconView.setIconWidthRatio(1.0f);
                    liveIconView.setIconHeightRatio(1.0f);
                }
                FrameLayout frameLayout = new FrameLayout(getContext());
                int i3 = this.LLJJIJIIJIL;
                C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(i3, i3));
                frameLayout.addView(liveIconView);
                View.OnClickListener onClickListener = c1826660xdQ.LIZIZ;
                if (onClickListener != null) {
                    C1570050qxX.LIZ(onClickListener, frameLayout);
                }
                C20094413jq c20094413jq = c1826660xdQ.LIZJ;
                if (c20094413jq != null) {
                    C20094813ju.LIZ(frameLayout, c20094413jq);
                }
                linearLayout.addView(frameLayout);
            }
            return;
        }
        C786410Ut5.LJZL(8, linearLayout);
    }
}
