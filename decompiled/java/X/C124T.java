package X;

import Y.ACListenerS163S0100000_29;
import Y.ACListenerS173S0000000_29;
import Y.ALAdapterS24S0100000_29;
import Y.ALAdapterS3S0200000_6;
import Y.AObjectS111S0000000_8;
import Y.AObjectS403S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS74S0200000_5;
import Y.ARunnableS98S0200000_29;
import Y.ATListenerS166S0000000_29;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.editSticker.text.view.TextStickerInputLayout$3;
import com.ss.android.ugc.bytebench.EditorStickerDowngradeServiceImpl;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: renamed from: X.124T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C124T extends FrameLayout {
    public static final /* synthetic */ int LLLLJ = 0;
    public final Context LL;
    public View LLILLJJLI;
    public C124Q LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public C427660Gpo LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public C0FRI LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public ImageView LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final InputMethodManager LLJJIJI;
    public C124A LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public View LLJJJIL;
    public C387890FIt LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C196925122x LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C0HZQ LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public LinearLayout LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public final boolean LLJZ;
    public InterfaceC387610FHr LLJZIJLIL;
    public C124O LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C124Z LLLI;
    public final ALAdapterS24S0100000_29 LLLII;
    public final HashMap<Integer, String> LLLIIII;
    public C124P LLLIIIIL;
    public List<InteractTextStructWrap> LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public LinearLayout LLLIZZ;
    public C196964124k LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public InterfaceC196958124e LLLLII;
    public String LLLLIIIILLL;
    public boolean LLLLIIL;
    public C0P0T LLLLIILL;
    public int LLLLIILLL;
    public long LLLLIL;
    public InterfaceC196961124h LLLLILI;

    public void LIZ() {
    }

    public void LIZJ(TextFontStyleData textFontStyleData) {
    }

    public int LJI() {
        return 2;
    }

    public void LJIILLIIL(View view) {
    }

    public final void LJIJI() {
        LJIJJ(true);
        View view = this.LLIZLLLIL;
        if (view != null) {
            if (view.getLayoutParams() != null) {
                this.LLIZLLLIL.getLayoutParams().width = C341940Daq.LIZ(10.0d);
                View view2 = this.LLIZLLLIL;
                C786410Ut5.W5(view2, view2.getLayoutParams());
            }
            C786410Ut5.LJLLLLLL(4, this.LLIZLLLIL);
        }
        LJJI(false);
        setTtsBubbleText(null);
    }

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.LLJJJIL.getLocationOnScreen(iArr);
        Point point = new Point(this.LLJJJIL.getWidth() / 2, this.LLJJJIL.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public List<InlineRichTextStyleData> getInlineTextStyleDatas() {
        return null;
    }

    public int getLayoutRes() {
        return R.layout.c52;
    }

    public int getSafeAreaHeight() {
        return 0;
    }

    public int getScene() {
        return 0;
    }

    public void setBgColorChangeListener(InterfaceC196971124r interfaceC196971124r) {
    }

    public void setColorPickerClickListener(InterfaceC196963124j interfaceC196963124j) {
    }

    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public void setSafeAreaHeight(int i) {
    }

    static {
        C341940Daq.LIZ(6.0d);
    }

    private int getEditTextLength() {
        if (C2204961BRm.LLZILL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnXgDISgpmXvF/07", null)) != null) {
            return C2204961BRm.LLZILL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnXgDISgpmXvF/07", null)).length();
        }
        return 0;
    }

    public void LJ() {
        this.LLJJJJ.LJII(false);
        this.LLJILJILJ = 1;
        this.LLJILLL = -1;
        this.LLJJI = C124X.LIZIZ().LIZ().LIZIZ;
        this.LLJJ = LJI();
        this.LLILLL.LJIILJJIL(this.LLJILJILJ, this.LLJJI);
        this.LLILLL.LJIILL(0, "");
    }

    public final void LJFF() {
        boolean z = !this.LLJLIL.isChecked();
        this.LLLILZJ = z;
        this.LLJLIL.setChecked(z);
        new C0EKG().LIZIZ(this.LLLILZJ);
    }

    public final void LJII() {
        ImageView imageView = this.LLJILJIL;
        if (imageView == null) {
            return;
        }
        imageView.setClickable(false);
        C786410Ut5.V4(this.LLJILJIL, 0.5f);
        this.LLJILJIL.setImageResource(R.drawable.c8c);
    }

    public void LJIILJJIL() {
        InputMethodManager inputMethodManager;
        C124Q c124q = this.LLILLL;
        if (c124q == null || (inputMethodManager = this.LLJJIJI) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(c124q.getWindowToken(), 0);
    }

    public void LJIILL() {
        C124Q c124q = this.LLILLL;
        if (c124q != null) {
            c124q.setAutoSizeChangedListener(new C196959124f(this));
        }
    }

    public void LJIJ() {
        if (this.LLLJIL) {
            if (this.LLLILZLLLI) {
                return;
            }
            Pair<Integer, Integer> pairLIZ = C2000807sc.LIZ();
            this.LLLJ.LJIIIIZZ(28, pairLIZ.getFirst(), pairLIZ.getSecond());
            this.LLILLL.setDefaultTextSize(28);
            return;
        }
        if (this.LLLILZLLLI) {
            Pair<Integer, Integer> pairLIZ2 = C2000807sc.LIZ();
            this.LLLJ.LJIIIIZZ(22, pairLIZ2.getFirst(), pairLIZ2.getSecond());
            this.LLILLL.setDefaultTextSize(22);
        }
    }

    public final void LJIJJLI() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (this.LLJILJILJ == 3) {
            c419910GdJ.LIZ = R.raw.icon_color_text_transparent;
        } else {
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            int i = this.LLJILJILJ;
            if (i == 1) {
                c419910GdJ.LIZ = R.raw.icon_text_stroke;
            } else if (i == 2) {
                c419910GdJ.LIZ = R.raw.icon_text_background;
            } else if (i == 4) {
                c419910GdJ.LIZ = R.raw.icon_text_outline;
            } else if (i == 5) {
                c419910GdJ.LIZ = R.raw.icon_text_stroke;
            }
        }
        this.LLJI.setTuxIcon(c419910GdJ);
    }

    public final void LJJ() {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZJ(Long.valueOf(System.currentTimeMillis() - this.LLLLIL), "click_show_duration");
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            C2341909Fp.LIZIZ("tool_performance_enter_text_sticker_tab", jSONObjectLJ);
        } else {
            final ALAdapterS24S0100000_29 aLAdapterS24S0100000_29 = this.LLLII;
            final long j = this.LLLLIL;
            C786410Ut5.LJLLLLLL(0, this);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.124W
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C786410Ut5.LJLLLLLL(0, this);
                    if (j > 0) {
                        C543670LTx c543670LTx2 = new C543670LTx();
                        c543670LTx2.LIZJ(Long.valueOf(System.currentTimeMillis() - j), "click_show_duration");
                        C2341909Fp.LIZIZ("tool_performance_enter_text_sticker_tab", c543670LTx2.LJ());
                    }
                    Animator.AnimatorListener animatorListener = aLAdapterS24S0100000_29;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                    super.onAnimationEnd(animator);
                }
            });
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        C124A c124a = this.LLJJIJIIJIL;
        if (c124a != null) {
            c124a.show();
        }
        if (C2401009ay.LIZ(C0FI2.LJIJJ().LJIJ())) {
            C123O.LIZLLL().LIZIZ(2131830071, getContext());
        }
        if (this.LLLJ != null) {
            LJIJ();
            if (this.LLLFFI) {
                C196964124k c196964124k = this.LLLJ;
                C124Q c124q = this.LLILLL;
                c196964124k.LLIZLLLIL.LIZIZ(c124q);
                c196964124k.LLJ = c124q;
                C196964124k c196964124k2 = this.LLLJ;
                HandlerHook.viewPostDelay(c196964124k2, c196964124k2.LLILZLL, 100L);
            }
            C196925122x c196925122x = this.LLJJJJLIIL;
            this.LLILLL.setUseAutoTextSize((c196925122x == null || c196925122x.getData() == null) ? true : this.LLJJJJLIIL.getData().isUseAutoTextSize());
        }
        if (this.LLLLII != null && !this.LLLLIIIILLL.equals("")) {
            this.LLLLII.LIZIZ(this.LLLLIIIILLL);
        }
        this.LLJJIII = false;
    }

    public void LJJIII() {
        if (this.LLILLL == null || this.LLJJIJI == null) {
            return;
        }
        this.LLLL = true;
        HandlerHook.viewPost(this.LLILLL, new ARunnableS129S0100000_29(this, 31));
    }

    public void LJJIIJ() {
        HandlerHook.viewPostDelay(this, new ARunnableS74S0200000_5(C391040FUw.LIZ, this, 9), 0L);
    }

    public final void LJJIIJZLJL() {
        int i;
        String strLJIIJ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        int i2 = this.LLJJ;
        if (i2 == 2) {
            c419910GdJ.LIZ = R.raw.icon_lines_center_aligned;
            i = 2131823164;
        } else if (i2 == 1) {
            c419910GdJ.LIZ = R.raw.icon_lines_left_aligned;
            i = 2131823166;
        } else if (i2 == 3) {
            c419910GdJ.LIZ = R.raw.icon_lines_right_aligned;
            i = 2131823168;
        } else {
            i = 0;
        }
        this.LLJIJIL.setTuxIcon(c419910GdJ);
        if (i == 0 || (strLJIIJ = LJIIJ(i)) == null) {
            return;
        }
        q0.LJJIFFI(this.LLJIJIL, strLJIIJ);
    }

    public final void LJJIIZ() {
        int i = this.LLJILJILJ;
        String strLJIIJ = LJIIJ(i != 2 ? i != 3 ? i != 4 ? 2131823165 : 2131823167 : 2131823169 : 2131823163);
        if (strLJIIJ != null) {
            q0.LJJIFFI(this.LLJI, strLJIIJ);
        }
    }

    public Point getEditInputCenterPoint() {
        return new Point(C0JAI.LIZJ(this.LL) / 2, ((int) C0JAI.LIZ(52.0f, this.LL)) + (this.LLJJJIL.getHeight() / 2));
    }

    public Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public String getEditTextStr() {
        return C2204961BRm.LLZILL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnXgDISgpmXvF/07", null)) != null ? C2204961BRm.LLZILL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLu2R3O+n8cVWk5ayiP5u68QnXgDISgpmXvF/07", null)).toString() : "";
    }

    public Point getReadIconPosition() {
        ImageView imageView = this.LLJILJIL;
        if (imageView == null || imageView.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        this.LLJILJIL.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (this.LLJILJIL.getWidth() / 2);
        return new Point(iArr[0], iArr[1]);
    }

    public TextStickerTextWrap getTextWrap() {
        return C123P.LIZ(this.LLILLL, this.LLLIIIL);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    public final void LJIIIIZZ() {
        C0FI2.LJIJJ().LJIIIIZZ = null;
        C0P0T c0p0t = this.LLLLIILL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        if (this.LLJJIII) {
            return;
        }
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else if (getVisibility() != 8) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(this, 25));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        this.LLJJIII = true;
        C124A c124a = this.LLJJIJIIJIL;
        if (c124a != null) {
            c124a.dismiss();
        }
        C196964124k c196964124k = this.LLLJ;
        if (c196964124k == null || !this.LLLFFI) {
            return;
        }
        c196964124k.LJI();
        this.LLLJIL = this.LLLILZLLLI;
    }

    public final boolean LJIILIIL() {
        return !TextUtils.isEmpty(getEditTextStr());
    }

    public void LJIIZILJ() {
        if (C0CHJ.LIZ()) {
            C196964124k c196964124k = (C196964124k) this.LLILLJJLI.findViewById(R.id.xqd);
            this.LLLJ = c196964124k;
            c196964124k.setOnTextSizeChangedListener(new C0FM5() { // from class: X.124d
                @Override // X.C0FM5
                public final void LIZ() {
                    C124T c124t = this.LIZ;
                    c124t.LLILLL.LLJL = false;
                    c124t.LLLJL = true;
                }
            });
            this.LLLJ.setOnAdjustTextRollbarListener(new AObjectS403S0100000_29(this, 1));
            Pair<Integer, Integer> pairLIZ = C2000807sc.LIZ();
            this.LLLJ.LJIIIIZZ(28, pairLIZ.getFirst(), pairLIZ.getSecond());
            this.LLILLL.setMinTextSize(pairLIZ.getFirst().intValue());
        }
    }

    public int getTopMargin() {
        return C0JAI.LIZLLL(getContext());
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !C297910Bm1.LIZ();
    }

    public int getAlignTxt() {
        return this.LLJJ;
    }

    public int getCurColor() {
        return this.LLJJI;
    }

    public int getCurTxtMode() {
        return this.LLJILJILJ;
    }

    public EditText getEditText() {
        return this.LLILLL;
    }

    public boolean getHasFontSizeChanged() {
        return this.LLLJL;
    }

    public C124P getVisibleController() {
        return this.LLLIIIIL;
    }

    public void LIZIZ(int i) {
        this.LLILLL.LJIILJJIL(this.LLJILJILJ, i);
        this.LLJJI = i;
    }

    public int LIZLLL(int i) {
        int iLJI = LJI();
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 3) {
            return iLJI;
        }
        return 2;
    }

    public final void LJIIIZ(boolean z) {
        float f;
        View view = this.LLILZ;
        if (view != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.T4(view, f);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            view2.setClickable(z);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            view3.setClickable(z);
        }
    }

    public final String LJIIJ(int i) {
        Context context;
        String str = this.LLLIIII.get(Integer.valueOf(i));
        if (str == null && (context = this.LL) != null) {
            String string = context.getString(i);
            this.LLLIIII.put(Integer.valueOf(i), string);
            return string;
        }
        return str;
    }

    public final int LJIIJJI(int i) {
        C124Q c124q = this.LLILLL;
        if (c124q != null && c124q.getEditFontSize() > 0) {
            return this.LLILLL.getEditFontSize();
        }
        return i;
    }

    public String LJIIL(List<TextStickerTextWrap> list) {
        return C123P.LJFF(list);
    }

    public final void LJIJJ(boolean z) {
        int i;
        C427660Gpo c427660Gpo = this.LLILZLL;
        if (c427660Gpo != null && c427660Gpo.getLayoutParams() != null) {
            this.LLILZLL.getLayoutParams().height = C341940Daq.LIZ(16.0d);
            this.LLILZLL.getLayoutParams().width = C341940Daq.LIZ(16.0d);
            C427660Gpo c427660Gpo2 = this.LLILZLL;
            C786410Ut5.H6(c427660Gpo2, c427660Gpo2.getLayoutParams());
        }
        C427660Gpo c427660Gpo3 = this.LLILZLL;
        if (c427660Gpo3 != null) {
            if (z) {
                i = R.drawable.ffr;
            } else {
                i = R.drawable.ffq;
            }
            c427660Gpo3.LJIIJ(Integer.valueOf(i));
        }
    }

    public final void LJJI(boolean z) {
        C1331100kk8 c1331100kk8;
        C427660Gpo c427660Gpo = this.LLILZLL;
        if (c427660Gpo == null) {
            return;
        }
        if (z) {
            if (c427660Gpo.getHierarchy() == null || (c1331100kk8 = this.LLILZLL.getHierarchy().LIZJ) == null) {
                c1331100kk8 = new C1331100kk8();
            }
            c1331100kk8.LJFF(C341940Daq.LIZ(1.0d));
            c1331100kk8.LJFF = -1;
            if (this.LLILZLL.getHierarchy() != null) {
                this.LLILZLL.getHierarchy().LJJIII(c1331100kk8);
                return;
            }
            return;
        }
        if (c427660Gpo.getHierarchy() == null) {
            return;
        }
        this.LLILZLL.getHierarchy().LJJIII(null);
    }

    public final void LJJIIZI(TextFontStyleData textFontStyleData) {
        boolean z;
        if (textFontStyleData == null) {
            return;
        }
        int i = 1;
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.LLJILLL == -1 || this.LLJILJILJ != 1) {
                this.LLJILLL = this.LLJILJILJ;
                this.LLJILJILJ = 1;
            }
            if (textFontStyleData.LIZ()) {
                int i2 = this.LLJILLL;
                if (i2 != 5) {
                    i = i2;
                }
                this.LLJILLL = i;
                this.LLJILJILJ = 5;
            }
            C786410Ut5.x5(this.LLJI, 0.34f);
            this.LLJI.setClickable(false);
            this.LLJI.setTag(Boolean.FALSE);
            return;
        }
        int i3 = this.LLJILLL;
        if (i3 != -1) {
            this.LLJILJILJ = i3;
        }
        C786410Ut5.x5(this.LLJI, 1.0f);
        this.LLJI.setClickable(true);
        this.LLJI.setTag(Boolean.TRUE);
    }

    public void setCurrentClickTime(long j) {
        this.LLLLIL = j;
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.LLJILJILJ = bgMode;
        this.LLJJI = color;
        this.LLJJ = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C0FI2.LJIJJ().LJJJIL(getScene(), textStickerData.getFontType());
        }
    }

    public void setInputLayoutShowListener(C124A c124a) {
        this.LLJJIJIIJIL = c124a;
    }

    public void setOnReadTextClickListener(InterfaceC196958124e interfaceC196958124e) {
        this.LLLLII = interfaceC196958124e;
    }

    public void setReadTextIcon(boolean z) {
        ImageView imageView = this.LLJILJIL;
        if (imageView == null) {
            return;
        }
        imageView.setClickable(true);
        C786410Ut5.V4(this.LLJILJIL, 1.0f);
        this.LLLILZ = z;
        if (z) {
            this.LLJILJIL.setImageResource(R.drawable.c8b);
        } else {
            this.LLJILJIL.setImageResource(R.drawable.c8c);
        }
    }

    public void setTextStickerInputMobListener(InterfaceC387610FHr interfaceC387610FHr) {
        this.LLJZIJLIL = interfaceC387610FHr;
    }

    public void setTextStickerUpdateListener(InterfaceC196961124h interfaceC196961124h) {
        this.LLLLILI = interfaceC196961124h;
    }

    public void setTextStickerView(C196925122x c196925122x) {
        this.LLJJJJLIIL = c196925122x;
    }

    public void setTtsBubbleIcon(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C196909122h.LIZIZ().LIZIZ.LJFF) {
            LJIJJ(false);
            LJJI(false);
        } else {
            C427660Gpo c427660Gpo = this.LLILZLL;
            if (c427660Gpo != null && c427660Gpo.getLayoutParams() != null) {
                this.LLILZLL.getLayoutParams().height = C341940Daq.LIZ(20.0d);
                this.LLILZLL.getLayoutParams().width = C341940Daq.LIZ(20.0d);
                C427660Gpo c427660Gpo2 = this.LLILZLL;
                C786410Ut5.H6(c427660Gpo2, c427660Gpo2.getLayoutParams());
            }
            C427660Gpo c427660Gpo3 = this.LLILZLL;
            if (c427660Gpo3 != null) {
                c427660Gpo3.LJIIJ(str);
            }
            LJJI(true);
        }
        View view = this.LLIZLLLIL;
        if (view != null && view.getLayoutParams() != null) {
            this.LLIZLLLIL.getLayoutParams().width = C341940Daq.LIZ(26.0d);
            View view2 = this.LLIZLLLIL;
            C786410Ut5.W5(view2, view2.getLayoutParams());
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
    }

    public void setTtsBubbleText(String str) {
        if (this.LLIZ == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.LLIZ.setText(2131829877);
        } else {
            this.LLIZ.setText(str);
        }
    }

    public void setVisibleController(C124P c124p) {
        this.LLLIIIIL = c124p;
    }

    public void setWikiTextStickerMob(C124O c124o) {
        this.LLL = c124o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.124Z] */
    public C124T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJILJ = 1;
        this.LLJILLL = -1;
        this.LLJJ = LJI();
        this.LLJJI = -1;
        this.LLJJIII = true;
        this.LLJZ = true;
        this.LLLF = false;
        this.LLLFF = false;
        this.LLLFFI = true;
        this.LLLFZ = false;
        this.LLLI = new ViewTreeObserver.OnDrawListener() { // from class: X.124Z
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                C124T c124t = this.LL;
                if (c124t.LLILZ == null || c124t.LLILLL == null || c124t.LLILLJJLI == null) {
                    return;
                }
                HandlerHook.viewPost(c124t.LLILLL, new ARunnableS129S0100000_29(c124t, 30));
            }
        };
        this.LLLII = new ALAdapterS24S0100000_29(this, 3);
        this.LLLIIII = new HashMap<>();
        this.LLLIIIL = new ArrayList();
        this.LLLIIL = 0;
        this.LLLIILIL = true;
        this.LLLIL = false;
        this.LLLILZ = false;
        this.LLLILZJ = new C0EKG().LIZ();
        this.LLLILZLLLI = false;
        this.LLLJIL = false;
        this.LLLJL = false;
        this.LLLL = false;
        this.LLLLII = null;
        this.LLLLIIIILLL = "";
        this.LLLLIIL = false;
        this.LLLLIILL = null;
        this.LLLLIILLL = 1;
        this.LLLLIL = -1L;
        this.LL = context;
        this.LLJJIJI = (InputMethodManager) C786410Ut5.H2(context, "input_method");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TextStickerInputLayout);
            this.LLLLIILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TextStickerInputLayout_iconStyle, 1);
            typedArrayObtainStyledAttributes.recycle();
        }
        View viewSd = C786410Ut5.Sd(getLayoutRes(), C786410Ut5.ne(context), null);
        this.LLILLJJLI = viewSd;
        this.LLJJJ = viewSd.findViewById(R.id.eug);
        this.LLJJJIL = this.LLILLJJLI.findViewById(R.id.krx);
        this.LLILLL = (C124Q) this.LLILLJJLI.findViewById(R.id.hd7);
        this.LLJI = (TuxIconView) this.LLILLJJLI.findViewById(R.id.uxm);
        ViewGroup viewGroup = (ViewGroup) this.LLILLJJLI.findViewById(R.id.ih4);
        this.LLJJJJ = C387890FIt.LIZIZ(getScene(), context);
        this.LLJJJJ.LIZLLL(C0FI2.LJIJJ().LJIJ());
        C0FI2.LJIJJ().LJIIIIZZ = new C0FIB() { // from class: X.124b
            @Override // X.C0FIB
            public final void accept(Object obj) {
                C124T c124t = this.LIZ;
                List list = (List) obj;
                if (c124t.LLJJJJ != null) {
                    HandlerHook.viewPost(c124t.LLJJJJ, new ARunnableS98S0200000_29(c124t, list, 14));
                }
            }
        };
        C1205850hU7.LIZ(getContext(), C1201120hMU.LIZ().leakOptCreativeTools, new TextStickerInputLayout$3(), new AObjectS111S0000000_8(0));
        viewGroup.addView(this.LLJJJJ);
        this.LLJIJIL = (TuxIconView) this.LLILLJJLI.findViewById(R.id.awo);
        if (C196909122h.LIZIZ().LIZIZ.LIZLLL) {
            ImageView imageView = (ImageView) this.LLILLJJLI.findViewById(R.id.yx5);
            this.LLJILJIL = imageView;
            this.LLLLIIIILLL = "text_edit_panel";
            C786410Ut5.Q7(imageView, new AkS95S0100000_29(this, 6));
            C786410Ut5.LJZI(0, this.LLJILJIL);
        }
        if (C196909122h.LIZIZ().LIZIZ.LIZJ && (C196909122h.LIZIZ().LIZIZ.LJ || C196909122h.LIZIZ().LIZIZ.LJFF)) {
            View viewFindViewById = this.LLILLJJLI.findViewById(R.id.hdr);
            this.LLILZ = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.w3(this.LLILLL.getViewTreeObserver(), this.LLLI);
                C786410Ut5.LJLLLLLL(0, this.LLILZ);
                View viewFindViewById2 = this.LLILZ.findViewById(R.id.dt1);
                this.LLILZIL = viewFindViewById2;
                this.LLLLIIIILLL = "small_icon";
                viewFindViewById2.setClickable(false);
                this.LLILZLL = (C427660Gpo) this.LLILZ.findViewById(R.id.dt3);
                this.LLIZ = (TuxTextView) this.LLILZ.findViewById(R.id.tv_tts_text);
                View viewFindViewById3 = this.LLILZ.findViewById(R.id.yx_);
                this.LLIZLLLIL = viewFindViewById3;
                viewFindViewById3.setClickable(false);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                c384050F3z.LIZJ = Float.valueOf(C0JAI.LIZ(20.0f, context));
                this.LLILZ.setBackground(c384050F3z.LIZ(context));
                LJIJI();
                C786410Ut5.I7(new AkS95S0100000_29(this, 7), this.LLILZIL);
                C786410Ut5.I7(new AkS95S0100000_29(this, 8), this.LLIZLLLIL);
            }
        }
        this.LLILLL.addTextChangedListener(new C19773412Ya(this, 5));
        LJIILL();
        C786410Ut5.a9(this.LLJIJIL, new ACListenerS163S0100000_29(this, 39));
        C0FRI c0fri = (C0FRI) this.LLILLJJLI.findViewById(R.id.e8b);
        this.LLJ = c0fri;
        c0fri.setColorChangeListener(new C0FRK() { // from class: X.124a
            @Override // X.C0FRK
            public final void LIZ(int i) {
                String str;
                C124T c124t = this.LIZ;
                c124t.LIZIZ(i);
                c124t.LLLF = false;
                InterfaceC387610FHr interfaceC387610FHr = c124t.LLJZIJLIL;
                if (interfaceC387610FHr != null) {
                    if (c124t.LLLILZLLLI) {
                        str = "caption";
                    } else {
                        str = "text";
                    }
                    interfaceC387610FHr.LJFF(str, i, null, null, 0, null);
                }
            }
        });
        this.LLJJJJ.setClickFontStyleListener(new InterfaceC387930FIx() { // from class: X.124V
            @Override // X.InterfaceC387930FIx
            public final void LIZ(TextFontStyleData textFontStyleData) {
                String str;
                int i;
                C124T c124t = this.LIZ;
                if (textFontStyleData == null) {
                    c124t.getClass();
                    return;
                }
                c124t.LJJIIZI(textFontStyleData);
                C0FI2.LJIJJ().LJJJIL(c124t.getScene(), textFontStyleData.fileName);
                c124t.LLILLL.setFontType(C0FI2.LJIJJ().LJIIIZ(c124t.getScene()));
                c124t.LLILLL.LJIILJJIL(c124t.LLJILJILJ, c124t.LLJJI);
                if (c124t.getScene() == 0 && !c124t.LLLJL) {
                    int i2 = textFontStyleData.fontSize;
                    if (i2 > 0) {
                        c124t.LLILLL.setFontSize(i2);
                    } else {
                        C124Q c124q = c124t.LLILLL;
                        if (c124t.LLLILZLLLI) {
                            i = 22;
                        } else {
                            i = 28;
                        }
                        c124q.setFontSize(i);
                    }
                }
                InterfaceC387610FHr interfaceC387610FHr = c124t.LLJZIJLIL;
                if (interfaceC387610FHr != null) {
                    if (c124t.LLLILZLLLI) {
                        str = "caption";
                    } else {
                        str = "text";
                    }
                    interfaceC387610FHr.LJIIIIZZ(textFontStyleData, 0, str, null, false, null, null, "trending");
                }
                c124t.LIZJ(textFontStyleData);
            }
        });
        C786410Ut5.a9(this.LLJI, new AkS95S0100000_29(this, 9));
        LJJIIZ();
        this.LLJJJJJIL = (LinearLayout) this.LLILLJJLI.findViewById(R.id.nir);
        View viewFindViewById4 = this.LLILLJJLI.findViewById(R.id.wpw);
        View viewFindViewById5 = this.LLILLJJLI.findViewById(R.id.tv_sure);
        if (this.LLLLIILLL == 0) {
            this.LLJJIJIL = viewFindViewById4;
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
        } else {
            this.LLJJIJIL = viewFindViewById5;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(viewFindViewById5, c1397760mTe.LIZ());
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 40), this.LLJJIJIL);
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 34), this.LLILLJJLI);
        this.LLJI.setImageResource(R.drawable.c3b);
        LJIIZILJ();
        LJIILLIIL(this.LLILLJJLI);
        addView(this.LLILLJJLI);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        C786410Ut5.W5(this.LLILLJJLI, layoutParams);
        C786410Ut5.I7(new ACListenerS173S0000000_29(1), findViewById(R.id.pm1));
        this.LLJJLIIIJLLLLLLLZ = this.LLILLJJLI.findViewById(R.id.bws);
        this.LLJJL = this.LLILLJJLI.findViewById(R.id.bwr);
        View viewFindViewById6 = this.LLILLJJLI.findViewById(R.id.ul9);
        this.LLJL = viewFindViewById6;
        C786410Ut5.LJLLLLLL(8, viewFindViewById6);
        this.LLJJLIIIJLLLLLLLZ.setBackground(C426580Go4.LIZJ(-1, 16777215, (int) C0JAI.LIZ(2.0f, getContext()), (int) C0JAI.LIZ(4.0f, getContext())));
        this.LLJJL.setBackground(C426580Go4.LIZIZ(C124X.LIZIZ().LIZ().LIZ));
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 35), this.LLJL);
        AnonymousClass1250.LIZJ(this.LLJL);
        this.LLJI.setOnTouchListener(new ATListenerS166S0000000_29(3));
        AnonymousClass1250.LIZIZ(this.LLJJIJIL);
        AnonymousClass1250.LIZJ(this.LLJIJIL);
        this.LLJLL = (LinearLayout) findViewById(R.id.nis);
        LIZ();
        this.LLLIZZ = (LinearLayout) findViewById(R.id.nat);
        this.LLJLIL = (C0HZQ) findViewById(R.id.dq2);
        this.LLJLILLLLZIIL = (TuxTextView) findViewById(R.id.z9x);
        C786410Ut5.R7(this.LLLIZZ, new ACListenerS163S0100000_29(this, 36));
        C786410Ut5.b9(this.LLJLIL, new ACListenerS163S0100000_29(this, 37));
        C786410Ut5.h9(this.LLJLILLLLZIIL, new ACListenerS163S0100000_29(this, 38));
        C391040FUw.LIZ.getClass();
        this.LLLIILIL = C391040FUw.LJI();
    }

    public final void LJJIFFI(int i, String str, Integer num) {
        LJJII(C123P.LIZLLL(""), null, 0, -1, 0, "", true, 28, i, str, num, false, false);
    }

    public void LJIL(List<TextStickerTextWrap> list, List<InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, Integer num, boolean z2, boolean z3) {
        int iLJII;
        this.LLJILLL = -1;
        if (this.LLJJJJ != null) {
            this.LLJJJJ.LIZLLL(C0FI2.LJIJJ().LJIJ());
        }
        C1360870lW9.LIZJ(this.LLILLL);
        this.LLILLL.setTextSize(i4);
        this.LLILLL.setEditFontSize(i4);
        C0FRI c0fri = this.LLJ;
        c0fri.LIZIZ();
        if (z) {
            c0fri.setSelectColorView(i2);
        }
        String strLJIIL = LJIIL(list);
        if (this.LLJLLL == null) {
            this.LLJLLL = strLJIIL;
        }
        List<InteractTextStructWrap> listLJI = C123P.LJI(list);
        this.LLLIIIL = listLJI;
        this.LLLIIL = i5 - listLJI.size();
        this.LLILLL.setTextStructWrapList(this.LLLIIIL);
        boolean z4 = false;
        if (z) {
            this.LLJJJJ.setSelectedFontType(null);
            C0FI2.LJIJJ().LJJJJ(getScene());
            LJ();
            if (getScene() == 0 && (iLJII = C0FI2.LJIJJ().LJII()) > 0) {
                this.LLILLL.setFontSize(iLJII);
            }
            this.LLLF = false;
            this.LLLFF = false;
        } else {
            this.LLILLL.LJIILL(strLJIIL.length(), strLJIIL);
            this.LLJ.setSelectColorView(i2);
            this.LLJILJILJ = i;
            this.LLJJ = i3;
            this.LLJJI = i2;
            C0FI2.LJIJJ().LJJJIL(getScene(), str);
            this.LLLF = z2;
            this.LLLFF = z3;
        }
        LJIJJLI();
        this.LLILLL.setFontType(C0FI2.LJIJJ().LJIIIZ(getScene()));
        this.LLILLL.LJIILJJIL(i, i2);
        this.LLILLL.setAligin(this.LLJJ);
        this.LLJJJJ.LJII(false);
        LJJIIJZLJL();
        LJJIIZI(C0FI2.LJIJJ().LJIIJ(getScene()));
        if (!this.LLJZ) {
            this.LLJJL.setBackground(C426580Go4.LIZIZ(C124X.LIZIZ().LIZ().LIZ));
        }
        if (num != null) {
            LIZIZ(num.intValue());
            this.LLJ.setColorPickerColor(num);
            this.LLLF = true;
        }
        if (C0CHJ.LIZ()) {
            if (num == null) {
                z4 = true;
            }
            this.LLLFFI = z4;
        }
    }

    public void LJJII(List<TextStickerTextWrap> list, List<InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        boolean z4;
        this.LLJLLIL = str2;
        if (this.LLLIL) {
            setEffectText(list);
        } else {
            LJIL(list, list2, i, i2, i3, str, z, i4, i5, num, z2, z3);
        }
        if (this.LLJJIII || z) {
            this.LLLFZ = true;
            if (!this.LLLL) {
                LJJIII();
            }
        }
        C196925122x c196925122x = this.LLJJJJLIIL;
        if (c196925122x != null && c196925122x.getData() != null) {
            setReadTextIcon(this.LLJJJJLIIL.getData().getHasReadTextAudio());
        }
        if (this.LLLLIIL) {
            ImageView imageView = this.LLJILJIL;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            ImageView imageView2 = this.LLJILJIL;
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
            View view2 = this.LLILZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        C196925122x c196925122x2 = this.LLJJJJLIIL;
        if (c196925122x2 != null && c196925122x2.getData().getType().equals("type_inline_caption")) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLLILZLLLI = z4;
        if (z4) {
            ImageView imageView3 = this.LLJILJIL;
            if (imageView3 != null) {
                C786410Ut5.LJZI(8, imageView3);
            }
            View view3 = this.LLILZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            C786410Ut5.LLLLLZ(this.LLJLIL, 0);
            C786410Ut5.LLLLZLL(this.LLJLILLLLZIIL, 0);
            boolean zLIZ = new C0EKG().LIZ();
            this.LLLILZJ = zLIZ;
            this.LLJLIL.setChecked(zLIZ);
        } else {
            C786410Ut5.LLLLLZ(this.LLJLIL, 8);
            C786410Ut5.LLLLZLL(this.LLJLILLLLZIIL, 8);
        }
        this.LLLFFI = true;
    }
}
