package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.127K, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127K extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final ConstraintLayout LLILZ;
    public final TuxIconView LLILZIL;
    public final C1754770vlT LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;
    public CharSequence LLJ;
    public int LLJI;
    public int LLJIJIL;
    public C127M LLJILJIL;
    public boolean LLJILJILJ;
    public EnumC1216650hlX LLJILLL;
    public CharSequence LLJJ;
    public CharSequence LLJJI;
    public CharSequence LLJJIII;
    public boolean LLJJIJI;
    public EnumC1216700hlc LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final C127N LLJJJ;
    public boolean LLJJJIL;
    public Function1<? super Boolean, Unit> LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public boolean LLJLL;
    public Boolean LLJLLIL;
    public Boolean LLJLLL;

    public C127K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        int iLIZIZ;
        if (this.LLJJIJIL) {
            TuxTextView tuxTextView = this.LL;
            if (this.LLJLL) {
                iLIZIZ = this.LLJJJJJIL;
                if (iLIZIZ <= 0) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            } else {
                iLIZIZ = 0;
            }
            int iLIZIZ2 = this.LLJJJJLIIL;
            if (iLIZIZ2 <= 0) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
            }
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ2), null, Integer.valueOf(getSubtitleIsShow() ? 0 : iLIZIZ2), false, 20);
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            if (getSubtitleIsShow() && tuxTextView2 != null) {
                int i = this.LLJJL;
                if (i > 0) {
                    C426750GoL.LJIIIZ(tuxTextView2, null, Integer.valueOf(i), null, null, false, 29);
                } else {
                    C127M c127m = this.LLJILJIL;
                    C127C c127cLIZ = c127m != null ? c127m.LIZ() : null;
                    C426750GoL.LJIIIZ(tuxTextView2, null, Integer.valueOf((Intrinsics.LJFF(c127cLIZ, C127B.LIZIZ) || Intrinsics.LJFF(c127cLIZ, C1077070e8P.LIZIZ)) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
                }
            }
            C127M c127m2 = this.LLJILJIL;
            if (c127m2 != null) {
                c127m2.LJIIJ();
            }
        }
    }

    @Override // android.view.View
    @InterfaceC1294060jmO
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    private final SpannableString getAlertBadgeString() {
        return (SpannableString) this.LLIZ.getValue();
    }

    private final boolean getSubtitleIsShow() {
        return this.LLILLJJLI.getVisibility() == 0;
    }

    public final void LIZLLL() {
        CharSequence charSequenceLJJLIIIJ;
        CharSequence charSequence;
        CharSequence charSequenceLJ;
        CharSequence charSequence2;
        ConstraintLayout constraintLayout = this.LLILZ;
        CharSequence charSequence3 = this.LLJJIII;
        if (charSequence3 == null || charSequence3.length() == 0) {
            ArrayList arrayList = new ArrayList();
            if (this.LLJLL && (charSequence2 = this.LLJJI) != null && charSequence2.length() != 0) {
                arrayList.add(this.LLJJI);
            }
            CharSequence charSequence4 = this.LLJ;
            if (charSequence4 != null && charSequence4.length() != 0) {
                arrayList.add(this.LLJ);
            }
            CharSequence subtitle = getSubtitle();
            if (subtitle != null && subtitle.length() != 0) {
                arrayList.add(getSubtitle());
            }
            C127M c127m = this.LLJILJIL;
            if (c127m != null && (charSequenceLJ = c127m.LJ()) != null && charSequenceLJ.length() != 0) {
                arrayList.add(charSequenceLJ);
            }
            if (this.LLIZLLLIL && (charSequence = this.LLJJ) != null && charSequence.length() != 0) {
                arrayList.add(this.LLJJ);
            }
            charSequenceLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", "", null, 0, null, null, 60);
        } else {
            charSequenceLJJLIIIJ = this.LLJJIII;
        }
        constraintLayout.setContentDescription(charSequenceLJJLIIIJ);
    }

    public final void LJFF() {
        C127M c127m;
        View viewLJFF;
        if (!this.LLJJIJI || (c127m = this.LLJILJIL) == null || !c127m.LIZLLL()) {
            this.LLILZ.setForeground(null);
            return;
        }
        C427690Gpr.LJ(this.LLILZ, 0.0f);
        C127M c127m2 = this.LLJILJIL;
        if ((c127m2 instanceof C11GO) || c127m2 == null || (viewLJFF = c127m2.LJFF()) == null) {
            return;
        }
        viewLJFF.setClickable(false);
    }

    public final CharSequence getSubtitle() {
        return this.LLILLJJLI.getText();
    }

    public final C127M getAccessory() {
        return this.LLJILJIL;
    }

    public final CharSequence getAlertBadgeDescription() {
        return this.LLJJ;
    }

    public final boolean getCellEnabled() {
        return this.LLJJIJI;
    }

    public final CharSequence getCustomContentDescription() {
        return this.LLJJIII;
    }

    public final CharSequence getIconDescription() {
        return this.LLJJI;
    }

    public final EnumC1216650hlX getInset() {
        return this.LLJILLL;
    }

    public final boolean getShowAlertBadge() {
        return this.LLIZLLLIL;
    }

    public final int getSubTitleMaxLines() {
        return this.LLJIJIL;
    }

    public final CharSequence getTitle() {
        return this.LLJ;
    }

    public final int getTitleMaxLines() {
        return this.LLJI;
    }

    public final EnumC1216700hlc getVariant() {
        return this.LLJJIJIIJIL;
    }

    public final boolean getWithSeparator() {
        return this.LLJILJILJ;
    }

    private final void setViewEnable(boolean z) {
        int iLIZIZ;
        int i;
        TuxTextView tuxTextView = this.LL;
        if (z) {
            iLIZIZ = LIZIZ(this.LLJJIJIIJIL);
        } else {
            iLIZIZ = this.LLJJJ.LJFF;
        }
        tuxTextView.setTextColor(iLIZIZ);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        C127N c127n = this.LLJJJ;
        if (z) {
            i = c127n.LIZJ;
        } else {
            i = c127n.LJFF;
        }
        tuxTextView2.setTextColor(i);
        LJI(z);
        C127M c127m = this.LLJILJIL;
        if (c127m != null) {
            c127m.LJIIIZ(z);
        }
        LJFF();
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.LLJLL = z;
        TuxIconView tuxIconView = this.LLILZIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        LIZ();
    }

    public final int LIZIZ(EnumC1216700hlc enumC1216700hlc) {
        int i = C1214870hif.LIZ[enumC1216700hlc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.LLJJJ.LIZIZ;
            }
            throw new C1954807lC();
        }
        return this.LLJJJ.LIZ;
    }

    public final void LJI(boolean z) {
        int i;
        if (!this.LLJJJIL) {
            TuxIconView tuxIconView = this.LLILZIL;
            if (z) {
                int i2 = C1214870hif.LIZ[this.LLJJIJIIJIL.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.LLJJJ.LJ;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = this.LLJJJ.LIZLLL;
                }
            } else {
                i = this.LLJJJ.LJFF;
            }
            tuxIconView.setTintColor(i);
        }
    }

    public final void setAccessory(C127M c127m) {
        View view;
        ViewGroup viewGroup;
        C127M c127m2 = this.LLJILJIL;
        if (c127m2 != null) {
            int i = C1913907eb.LIZ;
            ConstraintLayout constraintLayout = this.LLILZ;
            View viewLJFF = c127m2.LJFF();
            TuxTextView tuxTextView = this.LL;
            C786410Ut5.LJJLI(viewLJFF, constraintLayout);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJFF(viewLJFF.getId());
            c19mb.LJIIIIZZ(tuxTextView.getId(), 7, constraintLayout.getId(), 7);
            c19mb.LIZIZ(constraintLayout);
            C1754770vlT c1754770vlT = this.LLILZLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1754770vlT, null);
            c1754770vlT.removeAllViews();
            c127m2.LIZJ();
        }
        if (c127m != null) {
            int i2 = C1913907eb.LIZ;
            ConstraintLayout constraintLayout2 = this.LLILZ;
            View viewLJFF2 = c127m.LJFF();
            TuxTextView tuxTextView2 = this.LL;
            ViewParent parent = viewLJFF2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewLJFF2, viewGroup);
            }
            viewLJFF2.setId(R.id.z1d);
            constraintLayout2.addView(viewLJFF2);
            int id = viewLJFF2.getId();
            int id2 = tuxTextView2.getId();
            int id3 = constraintLayout2.getId();
            C19MB c19mb2 = new C19MB();
            c19mb2.LJII(constraintLayout2);
            c19mb2.LJIIIIZZ(id, 3, id3, 3);
            c19mb2.LJIIIIZZ(id, 7, id3, 7);
            c19mb2.LJIIIIZZ(id2, 7, id, 6);
            c19mb2.LJJII(0.0f, id2);
            c19mb2.LJIIIIZZ(id, 6, id2, 7);
            c19mb2.LJJII(1.0f, id);
            c19mb2.LJJIII(id2, 1);
            c19mb2.LIZIZ(constraintLayout2);
            C426750GoL.LJIIIZ(viewLJFF2, Integer.valueOf(C1913907eb.LIZIZ), null, null, null, false, 30);
            c127m.LJIIIZ(this.LLILZ.isEnabled());
            if (Intrinsics.LJFF(c127m.LIZ(), C127E.LIZIZ) && (view = ((C127P) c127m).LIZIZ) != null) {
                C1754770vlT c1754770vlT2 = this.LLILZLL;
                int visibility = c1754770vlT2.getVisibility();
                c1754770vlT2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1754770vlT2);
                c1754770vlT2.addView(view);
            }
        }
        this.LLJILJIL = c127m;
        LIZLLL();
        int i3 = C20094413jq.LJIIZILJ;
        ConstraintLayout constraintLayout3 = this.LLILZ;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJIIIZ = new AwS608S0100000_29(this, 633);
        q0.LJIJ(constraintLayout3, c1397760mTe.LIZ());
        LJFF();
        LIZ();
    }

    public final void setAlertBadgeDescription(CharSequence charSequence) {
        this.LLJJ = charSequence;
        LIZLLL();
    }

    public final void setCellEnabled(boolean z) {
        this.LLJJIJI = z;
        setViewEnable(z);
    }

    public final void setCustomContentDescription(CharSequence charSequence) {
        this.LLJJIII = charSequence;
        LIZLLL();
    }

    @Override // android.view.View
    @InterfaceC1294060jmO
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.LLJJIJIL) {
            this.LLILZ.setEnabled(z);
            setViewEnable(z);
        }
    }

    public final void setIcon(C419910GdJ c419910GdJ) {
        boolean z = false;
        if (c419910GdJ != null) {
            this.LLILZIL.setIconRes(c419910GdJ.LIZ);
            this.LLJJJIL = false;
            Integer num = c419910GdJ.LIZLLL;
            if (num != null) {
                this.LLILZIL.setTintColor(num.intValue());
                this.LLJJJIL = true;
            }
            Integer num2 = c419910GdJ.LJ;
            if (num2 != null) {
                this.LLILZIL.setTintColorRes(num2.intValue());
                this.LLJJJIL = true;
            }
            LJI(this.LLJJIJI);
            z = true;
        }
        setWithIcon(z);
    }

    public final void setIconDescription(CharSequence charSequence) {
        this.LLJJI = charSequence;
        LIZLLL();
    }

    public final void setIconEnableColor(int i) {
        boolean z;
        this.LLJJJ.LIZLLL = i;
        if (isEnabled() && this.LLJJIJI) {
            z = true;
        } else {
            z = false;
        }
        LJI(z);
    }

    public final void setInset(EnumC1216650hlX enumC1216650hlX) {
        this.LLJILLL = enumC1216650hlX;
        if (enumC1216650hlX != null) {
            int px = enumC1216650hlX.toPx();
            C426750GoL.LJIIL(this.LLILZ, Integer.valueOf(px), null, Integer.valueOf(px), null, 26);
        }
    }

    public final void setLoading(boolean z) {
        C127M c127m = this.LLJILJIL;
        if (c127m != null) {
            c127m.LJIIJJI(z);
        }
    }

    public final void setOnClickListener(Function1<? super Boolean, Unit> function1) {
        if (!isClickable()) {
            setClickable(true);
        }
        this.LLJJJJ = function1;
    }

    public final void setShowAlertBadge(boolean z) {
        this.LLIZLLLIL = z;
        CharSequence charSequence = this.LLJ;
        if (charSequence != null) {
            setTitle(charSequence);
        }
    }

    public final void setSubTitleMaxLines(int i) {
        this.LLJIJIL = i;
        this.LLILLJJLI.setMaxLines(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int visibility = this.LLILLJJLI.getVisibility();
        if (charSequence != null && charSequence.length() != 0) {
            this.LLILLJJLI.setText(charSequence);
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            if (!(charSequence instanceof String)) {
                this.LLILLJJLI.setMovementMethod(C431260Gvc.LIZ);
                this.LLILLJJLI.setClickable(false);
                this.LLILLJJLI.setLongClickable(false);
            } else {
                this.LLILLJJLI.setMovementMethod(null);
            }
        } else {
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
        }
        LIZLLL();
        if (visibility != this.LLILLJJLI.getVisibility()) {
            LIZ();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLJ = charSequence;
        if (this.LLIZLLLIL) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) getAlertBadgeString());
            this.LL.setText(spannableStringBuilder);
        } else {
            this.LL.setText(charSequence);
        }
        LIZLLL();
    }

    public final void setTitleMaxLines(int i) {
        this.LLJI = i;
        this.LL.setMaxLines(i);
    }

    public final void setVariant(EnumC1216700hlc enumC1216700hlc) {
        this.LLJJIJIIJIL = enumC1216700hlc;
        this.LL.setTextColor(LIZIZ(enumC1216700hlc));
    }

    public final void setWithSeparator(boolean z) {
        int i;
        this.LLJILJILJ = z;
        View view = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void setIcon(Function1<? super ImageView, Unit> function1) {
        function1.invoke(this.LLILZIL);
        setWithIcon(true);
    }

    public final void LIZJ(EnumC1216650hlX enumC1216650hlX, EnumC1216650hlX enumC1216650hlX2) {
        if (enumC1216650hlX == enumC1216650hlX2) {
            setInset(enumC1216650hlX);
            return;
        }
        setInset(null);
        C426750GoL.LJIIL(this.LLILZ, Integer.valueOf(enumC1216650hlX.toPx()), null, Integer.valueOf(enumC1216650hlX2.toPx()), null, 26);
    }

    public final void LJ(boolean z, boolean z2) {
        int i;
        int i2;
        if (Intrinsics.LJFF(this.LLJLLIL, Boolean.valueOf(z)) && Intrinsics.LJFF(this.LLJLLL, Boolean.valueOf(z2))) {
            return;
        }
        this.LLJLLIL = Boolean.valueOf(z);
        this.LLJLLL = Boolean.valueOf(z2);
        int i3 = 0;
        if (this.LLJL >= 0) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(this.LLJJLIIIJLLLLLLLZ);
            if (z) {
                c384050F3z.LJIIIIZZ = Float.valueOf(this.LLJL);
                c384050F3z.LJIIIZ = Float.valueOf(this.LLJL);
            }
            if (z2) {
                c384050F3z.LJIIJ = Float.valueOf(this.LLJL);
                c384050F3z.LJIIJJI = Float.valueOf(this.LLJL);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(getContext())});
            int i4 = this.LLJLILLLLZIIL;
            layerDrawable.setLayerInset(0, i4, 0, i4, 0);
            setBackground(layerDrawable);
        }
        int i5 = this.LLJLILLLLZIIL;
        if (i5 > 0 && (i = this.LLJLIL) > 0) {
            if (z) {
                i2 = i;
            } else {
                i2 = 0;
            }
            if (z2) {
                i3 = i;
            }
            C426750GoL.LJIIL(this, Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(this.LLJLILLLLZIIL), Integer.valueOf(i3), 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127K.onMeasure(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C127K(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        C127C c127c;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z2;
        } else {
            i2 = 0;
        }
        super(context, attributeSet2, i2);
        this.LLIZ = C452501pT.LIZIZ(new C426740GoK(context));
        this.LLJI = Integer.MAX_VALUE;
        this.LLJIJIL = Integer.MAX_VALUE;
        EnumC1216650hlX enumC1216650hlX = EnumC1216650hlX.PADDING_16;
        this.LLJILLL = enumC1216650hlX;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = EnumC1216700hlc.NORMAL;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gs, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.y3j);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.wmy);
        this.LLILLJJLI = tuxTextView2;
        View viewFindViewById = findViewById(R.id.uqb);
        this.LLILLL = viewFindViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dlh);
        this.LLILZ = constraintLayout;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k1_);
        this.LLILZIL = tuxIconView;
        this.LLILZLL = (C1754770vlT) findViewById(R.id.hgf);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.TuxTextCell, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTitleColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTitleDestructiveColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellSubtitleColor, 0);
        C127N c127n = new C127N(color, color2, color3, typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell_tux_textCellIconColor, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellIconDestructiveColor, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTextDisableColor, 0));
        this.LLJJJ = c127n;
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconTitleMargin, -1);
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellTitleTopAndBottomMargin, -1);
        this.LLJJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellFixedAccessoryTopMargin, -1);
        this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellBackgroundColor, -1);
        this.LLJL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundRadius, -1);
        this.LLJLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingTopBottom, -1);
        this.LLJLILLLLZIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingStartEnd, -1);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellTitleFont, 0);
        setTitle(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_title));
        tuxTextView.setTuxFont(i3);
        tuxTextView.setTextColor(color);
        setTitleMaxLines(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell_tux_titleMaxLines, Integer.MAX_VALUE));
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellSubtitleFont, 0);
        setSubtitle(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_subtitle));
        tuxTextView2.setTuxFont(i4);
        tuxTextView2.setTextColor(color3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell_tux_icon, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconSize, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconLayoutSize, -1);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = Integer.valueOf(c127n.LIZLLL);
        setIcon(c419910GdJ);
        if (dimensionPixelSize2 > 0) {
            tuxIconView.getLayoutParams().height = dimensionPixelSize2;
            tuxIconView.getLayoutParams().width = dimensionPixelSize2;
        }
        if (dimensionPixelSize > 0) {
            tuxIconView.setIconWidth(dimensionPixelSize);
            tuxIconView.setIconHeight(dimensionPixelSize);
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellSubtitleBottomMargin, -1);
        if (dimensionPixelSize3 > 0) {
            C426750GoL.LJIIIZ(tuxTextView2, null, null, null, Integer.valueOf(dimensionPixelSize3), false, 23);
        }
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
        viewFindViewById.findViewById(R.id.uqb).setBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellSeparatorColor, 0));
        setWithSeparator(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextCell_tux_separator, false));
        setInset(enumC1216650hlX);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TuxTextCell_tux_cellAccessory)) {
            switch (typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell_tux_cellAccessory, -1)) {
                case 0:
                    c127c = C19320310iH.LIZIZ;
                    break;
                case 1:
                    c127c = C11G5.LIZIZ;
                    break;
                case 2:
                    c127c = C127B.LIZIZ;
                    break;
                case 3:
                    c127c = AnonymousClass1279.LIZIZ;
                    break;
                case 4:
                    c127c = AnonymousClass1277.LIZIZ;
                    break;
                case 5:
                    c127c = C127E.LIZIZ;
                    break;
                case 6:
                    c127c = C1077070e8P.LIZIZ;
                    break;
                default:
                    throw new IllegalArgumentException("unsupported text cell accessory");
            }
            setAccessory(c127c.LIZ(getContext(), attributeSet2));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJIJIL = true;
        setViewEnable(true);
        LIZ();
        C786410Ut5.Y7(constraintLayout, new ACListenerS163S0100000_29(this, 22));
    }
}
