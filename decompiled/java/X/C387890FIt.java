package X;

import Y.ACListenerS109S0200000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.0FIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387890FIt extends FrameLayout {
    public final HashSet<TextFontStyleData> LL;
    public InterfaceC387930FIx LLILLJJLI;
    public C0FIA LLILLL;
    public final List<C387880FIs> LLILZ;
    public String LLILZIL;
    public C0FJ1 LLILZLL;
    public LinearLayout LLIZ;
    public final HashSet<String> LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public C387900FIu LLJIJIL;
    public C0FJ4 LLJILJIL;
    public C0FIT LLJILJILJ;

    public final void LIZ() {
        if (getVisibility() != 0 || getParent() == null) {
            return;
        }
        for (C387880FIs c387880FIs : (ArrayList) this.LLILZ) {
            if (c387880FIs != null && c387880FIs.getFontData() != null) {
                String str = c387880FIs.getFontData().fontName;
                String panel = c387880FIs.getFontData().LJ != null ? c387880FIs.getFontData().LJ.getPanel() : "";
                if (!this.LLIZLLLIL.contains(str) && Boolean.valueOf(c387880FIs.getGlobalVisibleRect(new Rect())).booleanValue()) {
                    if (this.LLJILJILJ != null) {
                        this.LLIZLLLIL.add(str);
                        this.LLJILJILJ.LIZ(str, panel);
                    }
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_font_list_ui_optimize", true, false) && C0FIC.LIZ() != 4) {
                        c387880FIs.LJIIIZ();
                    }
                }
            }
        }
    }

    public HashSet<TextFontStyleData> getFontTypeSet() {
        return this.LL;
    }

    public final void LIZJ(boolean z) {
        ImageView imageView;
        C387900FIu c387900FIu = this.LLJIJIL;
        if (z && (imageView = c387900FIu.LLILLJJLI) != null && imageView.getDrawable() != null) {
            View view = c387900FIu.LLILLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view2 = c387900FIu.LLILLL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }

    public final void LIZLLL(List<TextFontStyleData> list) {
        if (LJFF(list)) {
            return;
        }
        if (C580130Mp9.LIZ(list)) {
            C0FI2.LJIJJ().LJJIL(getContext(), Boolean.valueOf(!C298130BmN.LIZ()));
        } else {
            LJI(list);
        }
    }

    public final void LJ(List<TextFontStyleData> list) {
        if (LJFF(list)) {
            return;
        }
        if (C580130Mp9.LIZ(list)) {
            C0FI2.LJIJJLI("textfont").LJJIL(getContext(), Boolean.valueOf(!C298130BmN.LIZ()));
        } else {
            LJI(list);
        }
    }

    public final boolean LJFF(List<TextFontStyleData> list) {
        if (this.LL.isEmpty() || this.LL.size() != list.size() || !this.LL.contains(ListProtector.get(list, 0))) {
            return false;
        }
        return true;
    }

    public final void LJI(List<TextFontStyleData> list) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        TextFontStyleData textFontStyleData;
        TextFontStyleData textFontStyleData2;
        this.LL.clear();
        ((ArrayList) this.LLILZ).clear();
        C786410Ut5.LJJJJJL(this.LLIZ);
        for (int i = 0; i < list.size(); i++) {
            Object obj = ListProtector.get(list, i);
            if (obj != null && !this.LL.contains(obj)) {
                TextFontStyleData textFontStyleData3 = (TextFontStyleData) ListProtector.get(list, i);
                C387880FIs c387880FIs = new C387880FIs(getContext());
                c387880FIs.setFontTypeLayoutConfig(this.LLJILJIL);
                c387880FIs.LJIIIIZZ(textFontStyleData3);
                c387880FIs.setBackground(0);
                if ("default".equals(C0FI2.LJIJJ().LJIIJJI(this.LLJ))) {
                    if (i == 0 && textFontStyleData3 != null && (textFontStyleData2 = c387880FIs.LLILZLL) != null && textFontStyleData2.LIZIZ()) {
                        C0FI2.LJIJJ().LJJJIL(this.LLJ, textFontStyleData3.fileName);
                        c387880FIs.setBackground(1);
                    }
                } else {
                    String strLJIIJJI = C0FI2.LJIJJ().LJIIJJI(this.LLJ);
                    if (!TextUtils.isEmpty(strLJIIJJI) && strLJIIJJI.equals(textFontStyleData3.fileName) && (textFontStyleData = c387880FIs.LLILZLL) != null && textFontStyleData.LIZIZ()) {
                        c387880FIs.setBackground(1);
                    }
                }
                c387880FIs.setTag(textFontStyleData3.fileName);
                View.OnClickListener aCListenerS109S0200000_5 = new ACListenerS109S0200000_5(this, c387880FIs, 2);
                if (C1848410yCV.LIZ) {
                    aCListenerS109S0200000_5 = new f(aCListenerS109S0200000_5);
                }
                a aVar = new a(aCListenerS109S0200000_5);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c387880FIs);
                }
                c387880FIs.setOnClickListener(aVar);
                c387880FIs.setDownloadCallback(new C0FID() { // from class: X.0FIv
                    @Override // X.C0FID
                    public final void LIZJ() {
                    }

                    @Override // X.C0FID
                    public final void LIZLLL(TextFontStyleData textFontStyleData4, boolean z) {
                        if (z && textFontStyleData4 != null && !TextUtils.isEmpty(textFontStyleData4.fileName) && textFontStyleData4.fileName.equals(this.LL.LLILZIL)) {
                            C387890FIt c387890FIt = this.LL;
                            InterfaceC387930FIx interfaceC387930FIx = c387890FIt.LLILLJJLI;
                            if (interfaceC387930FIx != null) {
                                interfaceC387930FIx.LIZ(textFontStyleData4);
                            }
                            c387890FIt.LJII(false);
                        }
                    }
                });
                c387880FIs.setTextMotionCallback(this.LLILLL);
                ((ArrayList) this.LLILZ).add(c387880FIs);
                this.LLIZ.addView(c387880FIs);
            }
        }
        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextEditFontListAbility -> TextSelectFontStyleLayout ->initData -> list size = ");
        sbLIZ.append(list.size());
        sbLIZ.append("; mFontTextViewList.size = ");
        sbLIZ.append(((ArrayList) this.LLILZ).size());
        C201955140j.LIZJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
        C0FJ4 c0fj4 = this.LLJILJIL;
        if (c0fj4 != null && c0fj4.LIZIZ) {
            C387900FIu c387900FIu = this.LLJIJIL;
            View view = c387900FIu.LLILLL;
            if (view != null && (layoutParams2 = view.getLayoutParams()) != null) {
                layoutParams2.height = (int) C11VU.LIZIZ(56.0f, c387900FIu.getContext());
            }
            C387900FIu c387900FIu2 = this.LLJIJIL;
            ImageView imageView = c387900FIu2.LLILLJJLI;
            if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                layoutParams.height = (int) C11VU.LIZIZ(32.0f, c387900FIu2.getContext());
            }
        }
        this.LLIZ.addView(this.LLJIJIL, 0);
        this.LL.addAll(list);
        HandlerHook.viewPost(this, new ARunnableS105S0100000_5(this, 10));
    }

    public final void LJII(boolean z) {
        String strLJIIJJI;
        String str = this.LLJI;
        if (str != null && !str.isEmpty()) {
            strLJIIJJI = this.LLJI;
        } else {
            strLJIIJJI = C0FI2.LJIJJ().LJIIJJI(this.LLJ);
        }
        for (C387880FIs c387880FIs : (ArrayList) this.LLILZ) {
            if (!TextUtils.isEmpty(strLJIIJJI) && strLJIIJJI.equals(c387880FIs.getTag()) && !z) {
                TextFontStyleData textFontStyleData = c387880FIs.LLILZLL;
                if (textFontStyleData != null && textFontStyleData.LIZIZ()) {
                    c387880FIs.setBackground(1);
                    c387880FIs.LJFF();
                    if (c387880FIs.getLeft() == 0 && c387880FIs.getRight() == 0) {
                        HandlerHook.viewPostDelay(this.LLILZLL, new ARunnableS74S0200000_5(this, c387880FIs, 8), 50L);
                    } else {
                        this.LLILZLL.LIZ(c387880FIs);
                    }
                    TextFontStyleData textFontStyleData2 = c387880FIs.LLILZLL;
                    if (textFontStyleData2 == null || TextUtils.isEmpty(textFontStyleData2.LIZJ.LIZ) || !c387880FIs.LLILZLL.LIZJ.LIZ()) {
                        c387880FIs.LJI();
                    }
                } else {
                    c387880FIs.LJIIIZ();
                }
            } else {
                c387880FIs.setBackground(0);
            }
        }
    }

    public void setClickFontStyleListener(InterfaceC387930FIx interfaceC387930FIx) {
        this.LLILLJJLI = interfaceC387930FIx;
    }

    public void setFontTypeLayoutConfig(C0FJ4 c0fj4) {
        this.LLJILJIL = c0fj4;
    }

    public void setMotionDownloadCallback(C0FIA c0fia) {
        this.LLILLL = c0fia;
    }

    public void setOnFontShowListener(C0FIT c0fit) {
        this.LLJILJILJ = c0fit;
    }

    public void setPinStickerListener(C0FJ6 c0fj6) {
        C387900FIu c387900FIu = this.LLJIJIL;
        if (c387900FIu != null) {
            c387900FIu.setPinFirstClickListener(c0fj6);
        }
    }

    public void setSelectedFontType(String str) {
        this.LLJI = str;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            HandlerHook.viewPost(this, new ARunnableS105S0100000_5(this, 10));
        } else {
            this.LLIZLLLIL.clear();
        }
    }

    public C387890FIt(Context context, int i) {
        super(context, null);
        this.LL = new HashSet<>();
        this.LLILZ = new ArrayList();
        this.LLIZLLLIL = new HashSet<>();
        this.LLJ = i;
        this.LLIZ = new LinearLayout(getContext());
        this.LLJIJIL = new C387900FIu(getContext());
        this.LLILZLL = new C0FJ1(getContext(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LLIZ.setPadding((int) C11VU.LIZIZ(12.0f, getContext()), 0, 0, 0);
        this.LLILZLL.addView(this.LLIZ, layoutParams);
        this.LLILZLL.setHorizontalScrollBarEnabled(false);
        addView(this.LLILZLL, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZLL.setupScrollListenerWithApiCheck(new C387950FIz(this));
    }

    public static C387890FIt LIZIZ(int i, Context context) {
        C387890FIt c387890FIt = new C387890FIt(context, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c387890FIt);
        c387890FIt.setLayoutParams(layoutParams);
        return c387890FIt;
    }
}
