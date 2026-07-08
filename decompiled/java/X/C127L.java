package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.127L, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127L extends ConstraintLayout implements InterfaceC1200240hL4 {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxIconView LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public View LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public LinearLayoutCompat LLJ;
    public TuxIconView LLJI;
    public LinearLayout LLJIJIL;
    public CharSequence LLJILJIL;
    public EnumC1216700hlc LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public EnumC1216650hlX LLJJIJI;
    public View LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final C127O LLJJJ;
    public boolean LLJJJIL;
    public final int LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;

    @Override // X.InterfaceC1200240hL4
    public final void LLJJJIL() {
    }

    @Override // X.InterfaceC1200240hL4
    public final void LLLLZLLIL() {
    }

    @Override // X.InterfaceC1200240hL4
    public View getProvideView() {
        return this;
    }

    public void setSubtitleContainer(View view) {
    }

    public void setSubtitleIcon(View view) {
    }

    public final void e0() {
        int iLIZIZ;
        int iLIZIZ2;
        if (this.LLJJIJIL) {
            LinearLayout titleContainerFromXml = getTitleContainerFromXml();
            int iLIZIZ3 = 0;
            if (this.LLJJ) {
                iLIZIZ = this.LLJJJJ;
                if (iLIZIZ <= 0) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            } else {
                iLIZIZ = 0;
            }
            int iLIZIZ4 = this.LLJJJJJIL;
            if (iLIZIZ4 <= 0) {
                iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            if (getSubtitleIsShow()) {
                C426750GoL.LJIIL(titleContainerFromXml, Integer.valueOf(iLIZIZ), 0, null, 0, 20);
                C426750GoL.LJIIIZ(titleContainerFromXml, 0, Integer.valueOf(iLIZIZ4), 0, 0, false, 16);
            } else {
                C426750GoL.LJIIIZ(titleContainerFromXml, 0, 0, 0, 0, false, 16);
                C426750GoL.LJIIL(titleContainerFromXml, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ4), null, Integer.valueOf(iLIZIZ4), 20);
            }
            TuxTextView subtitleTvFromXml = getSubtitleTvFromXml();
            if (getSubtitleIsShow() && subtitleTvFromXml != null) {
                if (this.LLJJ) {
                    iLIZIZ2 = this.LLJJJJ;
                    if (iLIZIZ2 <= 0) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                } else {
                    iLIZIZ2 = 0;
                }
                int i = this.LLJJJJLIIL;
                if (i > 0) {
                    C426750GoL.LJIIIZ(subtitleTvFromXml, null, Integer.valueOf(i), null, null, false, 29);
                } else {
                    C426750GoL.LJIIIZ(subtitleTvFromXml, Integer.valueOf(iLIZIZ2), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 28);
                }
            }
            TuxIconView subtitleInfoIconFromXml = getSubtitleInfoIconFromXml();
            if (!getSubtitleIsShow() || subtitleInfoIconFromXml == null) {
                return;
            }
            if (this.LLJJ && (iLIZIZ3 = this.LLJJJJ) <= 0) {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            int i2 = this.LLJJJJLIIL;
            if (i2 > 0) {
                C426750GoL.LJIIIZ(subtitleInfoIconFromXml, null, Integer.valueOf(i2), null, null, false, 29);
            } else {
                C426750GoL.LJIIIZ(subtitleInfoIconFromXml, Integer.valueOf(iLIZIZ3), null, null, null, false, 30);
            }
        }
    }

    public final LinearLayoutCompat getAccessoryContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a0g);
            this.LLJ = (LinearLayoutCompat) callbackFindViewById;
        }
        return (LinearLayoutCompat) callbackFindViewById;
    }

    public final TuxIconView getAccessoryFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a0e);
            this.LLJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ConstraintLayout getCellContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dlh);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getIconIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1_);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getInfoIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kmg);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getSeparatorFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.uqb);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final LinearLayout getSubtitleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wm4);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getSubtitleInfoIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wma);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getSubtitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wmy);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getTitleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y0w);
            this.LLJIJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3j);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final boolean getSubtitleIsShow() {
        return getSubtitleTvFromXml().getVisibility() == 0;
    }

    @Override // X.InterfaceC1200240hL4
    public final TuxIconView LLJLL() {
        return getAccessoryFromXml();
    }

    @Override // X.InterfaceC1200240hL4
    public View getCellContainer() {
        return getCellContainerFromXml();
    }

    @Override // X.InterfaceC1200240hL4
    public View getInfoIcon() {
        return getInfoIconFromXml();
    }

    @Override // X.InterfaceC1200240hL4
    public CharSequence getSubtitle() {
        return getSubtitleTvFromXml().getText();
    }

    @Override // X.InterfaceC1200240hL4
    public View getSubtitleContainer() {
        return getSubtitleContainerFromXml();
    }

    @Override // X.InterfaceC1200240hL4
    public View getSubtitleIcon() {
        return getSubtitleInfoIconFromXml();
    }

    @Override // X.InterfaceC1200240hL4
    public View getSubtitleTv() {
        return getSubtitleTvFromXml();
    }

    public boolean getCellEnabled() {
        return this.LLJILLL;
    }

    public View getCustomView() {
        return this.LLJJIJIIJIL;
    }

    public EnumC1216650hlX getInset() {
        return this.LLJJIJI;
    }

    public CharSequence getTitle() {
        return this.LLJILJIL;
    }

    public EnumC1216700hlc getVariant() {
        return this.LLJILJILJ;
    }

    public boolean getWithInfoIcon() {
        return this.LLJJI;
    }

    public boolean getWithSeparator() {
        return this.LLJJIII;
    }

    private final void setAccessory(C419910GdJ c419910GdJ) {
        if (c419910GdJ != null) {
            getAccessoryFromXml().setIconRes(c419910GdJ.LIZ);
            Integer num = c419910GdJ.LIZLLL;
            if (num != null) {
                getAccessoryFromXml().setTintColor(num.intValue());
            }
            Integer num2 = c419910GdJ.LJ;
            if (num2 != null) {
                getAccessoryFromXml().setTintColorRes(num2.intValue());
            }
        }
    }

    private final void setViewEnable(boolean z) {
        int iH0;
        int i;
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        if (z) {
            iH0 = h0(getVariant());
        } else {
            iH0 = this.LLJJJ.LJFF;
        }
        titleTvFromXml.setTextColor(iH0);
        TuxTextView subtitleTvFromXml = getSubtitleTvFromXml();
        C127O c127o = this.LLJJJ;
        if (z) {
            i = c127o.LIZJ;
        } else {
            i = c127o.LJFF;
        }
        subtitleTvFromXml.setTextColor(i);
        i0(z);
        TuxIconView accessoryFromXml = getAccessoryFromXml();
        if (z) {
            accessoryFromXml.setTintColor(this.LLJJL);
        } else {
            accessoryFromXml.setTintColor(this.LLJJJ.LJFF);
        }
        accessoryFromXml.setEnabled(z);
        if (getCellEnabled()) {
            C427690Gpr.LJ(getCellContainerFromXml(), 0.0f);
            getAccessoryFromXml().setClickable(false);
        } else {
            getCellContainerFromXml().setForeground(null);
        }
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.LLJJ = z;
        TuxIconView iconIvFromXml = getIconIvFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(iconIvFromXml, i);
        e0();
    }

    public final int h0(EnumC1216700hlc enumC1216700hlc) {
        int i = C1214880hig.LIZ[enumC1216700hlc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.LLJJJ.LIZIZ;
            }
            throw new C1954807lC();
        }
        return this.LLJJJ.LIZ;
    }

    public final void i0(boolean z) {
        int i;
        if (!this.LLJJJIL) {
            TuxIconView iconIvFromXml = getIconIvFromXml();
            if (z) {
                int i2 = C1214880hig.LIZ[getVariant().ordinal()];
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
            iconIvFromXml.setTintColor(i);
        }
    }

    public final void setAccessoryContainerFromXml(LinearLayoutCompat linearLayoutCompat) {
        this.LLJ = linearLayoutCompat;
    }

    public final void setAccessoryFromXml(TuxIconView tuxIconView) {
        this.LLJI = tuxIconView;
    }

    public final void setCellContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLIZLLLIL = constraintLayout;
    }

    public void setCellEnabled(boolean z) {
        this.LLJILLL = z;
        setViewEnable(z);
    }

    @Override // X.InterfaceC1200240hL4
    public void setCustomView(View view) {
        if (getCustomView() != null) {
            C786410Ut5.LJJLIIIJILLIZJL(getAccessoryContainerFromXml(), getCustomView());
        }
        int i = 0;
        if (view != null) {
            getAccessoryContainerFromXml().addView(view, 0);
        }
        this.LLJJIJIIJIL = view;
        TuxIconView accessoryFromXml = getAccessoryFromXml();
        if (view != null) {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(accessoryFromXml, i);
    }

    @Override // X.InterfaceC1200240hL4
    public void setIcon(C419910GdJ c419910GdJ) {
        boolean z = false;
        if (c419910GdJ != null) {
            getIconIvFromXml().setIconRes(c419910GdJ.LIZ);
            this.LLJJJIL = false;
            Integer num = c419910GdJ.LIZLLL;
            if (num != null) {
                getIconIvFromXml().setTintColor(num.intValue());
                this.LLJJJIL = true;
            }
            Integer num2 = c419910GdJ.LJ;
            if (num2 != null) {
                getIconIvFromXml().setTintColorRes(num2.intValue());
                this.LLJJJIL = true;
            }
            i0(getCellEnabled());
            z = true;
        }
        setWithIcon(z);
    }

    public final void setIconIvFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setInfoIcon(C419910GdJ c419910GdJ) {
        if (c419910GdJ != null) {
            getInfoIconFromXml().setIconRes(c419910GdJ.LIZ);
            Integer num = c419910GdJ.LIZLLL;
            if (num != null) {
                getAccessoryFromXml().setTintColor(num.intValue());
            }
            Integer num2 = c419910GdJ.LJ;
            if (num2 != null) {
                getInfoIconFromXml().setTintColorRes(num2.intValue());
            }
        }
    }

    public final void setInfoIconFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public void setInset(EnumC1216650hlX enumC1216650hlX) {
        this.LLJJIJI = enumC1216650hlX;
        int px = enumC1216650hlX.toPx();
        C426750GoL.LJIIL(getCellContainerFromXml(), Integer.valueOf(px), null, Integer.valueOf(px), null, 26);
    }

    public final void setSeparatorFromXml(View view) {
        this.LLIZ = view;
    }

    @Override // X.InterfaceC1200240hL4
    public void setShowArrow(boolean z) {
        int i;
        TuxIconView accessoryFromXml = getAccessoryFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(accessoryFromXml, i);
    }

    @Override // X.InterfaceC1200240hL4
    public void setSubtitle(CharSequence charSequence) {
        int visibility = getSubtitleTvFromXml().getVisibility();
        if (charSequence != null && charSequence.length() != 0) {
            getSubtitleTvFromXml().setText(charSequence);
            C786410Ut5.LLLLZLL(getSubtitleTvFromXml(), 0);
            C786410Ut5.LJZL(0, getSubtitleContainerFromXml());
            if (!(charSequence instanceof String)) {
                getSubtitleTvFromXml().setMovementMethod(C431260Gvc.LIZ);
                getSubtitleTvFromXml().setClickable(false);
                getSubtitleTvFromXml().setLongClickable(false);
            } else {
                getSubtitleTvFromXml().setMovementMethod(null);
                getSubtitleTvFromXml().setClickable(true);
            }
        } else {
            C786410Ut5.LLLLZLL(getSubtitleTvFromXml(), 8);
            C786410Ut5.LJZL(8, getSubtitleContainerFromXml());
            getSubtitleTvFromXml().setClickable(false);
        }
        if (visibility != getSubtitleTvFromXml().getVisibility()) {
            e0();
        }
    }

    public final void setSubtitleContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setSubtitleInfoIconFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setSubtitleTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    @Override // X.InterfaceC1200240hL4
    public void setTitle(CharSequence charSequence) {
        this.LLJILJIL = charSequence;
        getTitleTvFromXml().setText(charSequence);
    }

    public final void setTitleContainerFromXml(LinearLayout linearLayout) {
        this.LLJIJIL = linearLayout;
    }

    public final void setTitleTvFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public void setVariant(EnumC1216700hlc enumC1216700hlc) {
        this.LLJILJILJ = enumC1216700hlc;
        getTitleTvFromXml().setTextColor(h0(enumC1216700hlc));
    }

    public void setWithInfoIcon(boolean z) {
        int i;
        this.LLJJI = z;
        TuxIconView infoIconFromXml = getInfoIconFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(infoIconFromXml, i);
    }

    public void setWithSeparator(boolean z) {
        int i;
        this.LLJJIII = z;
        View separatorFromXml = getSeparatorFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, separatorFromXml);
    }

    public C127L(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.z2);
    }

    @Override // X.InterfaceC1200240hL4
    public final void LLJJIJIIJIL(String str, boolean z) {
        if (!getWithInfoIcon() && z) {
            C1185430gxB.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str == null) {
                str = "video_post_page";
            }
            linkedHashMap.put("enter_from", str);
            C20684815ws.LJIILLIIL("location_info_prompt_button_show", linkedHashMap);
        }
        setWithInfoIcon(z);
    }

    public C127L(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.LLJILJILJ = EnumC1216700hlc.NORMAL;
        this.LLJILLL = true;
        EnumC1216650hlX enumC1216650hlX = EnumC1216650hlX.PADDING_16;
        this.LLJJIJI = enumC1216650hlX;
        InjectLayoutInflater injectLayoutInflaterCreateInjectLayoutInflater = ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).createInjectLayoutInflater();
        if (injectLayoutInflaterCreateInjectLayoutInflater.isInjectionEnabled()) {
            injectLayoutInflaterCreateInjectLayoutInflater.setTag("PoiPublishExtensionCell#poi_publish_extension_cell");
            injectLayoutInflaterCreateInjectLayoutInflater.inflate(context, R.layout.e6b, this, true);
        } else {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e6b, this, true);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTitleColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTitleDestructiveColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellSubtitleColor, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell_tux_textCellIconColor, 0);
        this.LLJJJ = new C127O(color, color2, color3, color4, typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellIconDestructiveColor, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellTextDisableColor, 0));
        this.LLJJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconTitleMargin, -1);
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellTitleTopAndBottomMargin, -1);
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellFixedAccessoryTopMargin, -1);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellBackgroundColor, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundRadius, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingTopBottom, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingStartEnd, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellTitleFont, 0);
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        setTitle(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_title));
        titleTvFromXml.setTuxFont(i2);
        titleTvFromXml.setTextColor(color);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextCell__tux_textCellSubtitleFont, 0);
        TuxTextView subtitleTvFromXml = getSubtitleTvFromXml();
        setSubtitle(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell_tux_subtitle));
        subtitleTvFromXml.setTuxFont(i3);
        subtitleTvFromXml.setTextColor(color3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell_tux_icon, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconSize, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellIconLayoutSize, -1);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = Integer.valueOf(color4);
        setIcon(c419910GdJ);
        if (dimensionPixelSize2 > 0) {
            getIconIvFromXml().getLayoutParams().height = dimensionPixelSize2;
            getIconIvFromXml().getLayoutParams().width = dimensionPixelSize2;
        }
        if (dimensionPixelSize > 0) {
            getIconIvFromXml().setIconWidth(dimensionPixelSize);
            getIconIvFromXml().setIconHeight(dimensionPixelSize);
        }
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellSubtitleBottomMargin, -1);
        if (dimensionPixelSize3 > 0) {
            C426750GoL.LJIIIZ(getSubtitleTvFromXml(), null, null, null, Integer.valueOf(dimensionPixelSize3), false, 23);
        }
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
        View separatorFromXml = getSeparatorFromXml();
        separatorFromXml.findViewById(R.id.uqb).setBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellSeparatorColor, 0));
        setWithSeparator(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextCell_tux_separator, false));
        setInset(enumC1216650hlX);
        int color5 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellArrowColor, 0);
        this.LLJJL = color5;
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell__tux_textCellDisclosureIcon, 0);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = resourceId2;
        c419910GdJ2.LIZLLL = Integer.valueOf(color5);
        setAccessory(c419910GdJ2);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJIJIL = true;
        setViewEnable(true);
        e0();
        C786410Ut5.Y7(getCellContainerFromXml(), new ACListenerS163S0100000_29(this, 67));
    }
}
