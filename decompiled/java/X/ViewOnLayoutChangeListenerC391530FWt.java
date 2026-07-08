package X;

import Y.AAListenerS316S0100000_5;
import Y.ARunnableS105S0100000_5;
import Y.ATListenerS439S0100000_5;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0FWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class ViewOnLayoutChangeListenerC391530FWt implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                onLayoutChange$14(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                onLayoutChange$15(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 16:
                onLayoutChange$16(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onLayoutChange$17(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onLayoutChange$18(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 19:
                onLayoutChange$19(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onLayoutChange$20(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC391530FWt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        C0EJZ c0ejzLLLLLLLLL = ((C360890ECx) viewOnLayoutChangeListenerC391530FWt.l0).LLLLLLLLL();
        if (c0ejzLLLLLLLLL != null) {
            c0ejzLLLLLLLLL.LJ(((C360890ECx) viewOnLayoutChangeListenerC391530FWt.l0).LLLLLLIL(), true);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C362630EJp) viewOnLayoutChangeListenerC391530FWt.l0).LLLLLILLIL();
        C214799194j c214799194j = ((C362630EJp) viewOnLayoutChangeListenerC391530FWt.l0).LLJJ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C386950FFd) viewOnLayoutChangeListenerC391530FWt.l0).getClass();
        ((C386950FFd) viewOnLayoutChangeListenerC391530FWt.l0).LIZIZ();
    }

    public static final void onLayoutChange$11(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C386950FFd) viewOnLayoutChangeListenerC391530FWt.l0).LJ();
    }

    public static final void onLayoutChange$12(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        }
        C0FO1 c0fo1 = ((C389250FNz) viewOnLayoutChangeListenerC391530FWt.l0).LLJJLIIIJLLLLLLLZ;
        if (c0fo1 != null) {
            c0fo1.LJJIJIIJIL();
        }
    }

    public static final void onLayoutChange$13(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C0F8L) viewOnLayoutChangeListenerC391530FWt.l0).LJIILJJIL();
    }

    public static final void onLayoutChange$14(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        C361100EDs resourceListAdapter;
        RecyclerView recyclerView;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        CurveSpeedFragment curveSpeedFragment = (CurveSpeedFragment) viewOnLayoutChangeListenerC391530FWt.l0;
        curveSpeedFragment.bS(curveSpeedFragment.LL);
        C0EDF c0edfVR = ((CurveSpeedFragment) viewOnLayoutChangeListenerC391530FWt.l0).VR();
        if (c0edfVR != null && (recyclerView = c0edfVR.getRecyclerView()) != null) {
            layoutManager = recyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            IntRange intRange = new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
            C0EDF c0edfVR2 = ((CurveSpeedFragment) viewOnLayoutChangeListenerC391530FWt.l0).VR();
            if (c0edfVR2 != null && (resourceListAdapter = c0edfVR2.getResourceListAdapter()) != null) {
                int i9 = 0;
                for (Object obj : (ArrayList) resourceListAdapter.LLLFZ()) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        ResourceItem resourceItem = (ResourceItem) obj;
                        int i11 = intRange.LL;
                        if (i9 <= intRange.LLILLJJLI && i11 <= i9) {
                            ((CurveSpeedFragment) viewOnLayoutChangeListenerC391530FWt.l0).ZR(resourceItem);
                        }
                        i9 = i10;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$15(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0FM2 c0fm2 = (C0FM2) viewOnLayoutChangeListenerC391530FWt.l0;
        float fLIZLLL = c0fm2.LIZLLL() / c0fm2.LIZJ();
        if (fLIZLLL != c0fm2.LIZLLL) {
            c0fm2.LIZJ.invoke(Float.valueOf(fLIZLLL));
            c0fm2.LIZLLL = fLIZLLL;
        }
    }

    public static final void onLayoutChange$16(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int lineCount;
        TextPaint paint;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        Layout layout = ((TuxTextView) viewOnLayoutChangeListenerC391530FWt.l0).getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0) {
            int i9 = lineCount - 1;
            Iterator<Integer> it2 = new IntRange(0, i9).iterator();
            if (it2.hasNext()) {
                AbstractC2098408Jy abstractC2098408Jy = (AbstractC2098408Jy) it2;
                float lineLeft = layout.getLineLeft(abstractC2098408Jy.nextInt());
                while (it2.hasNext()) {
                    lineLeft = Math.min(lineLeft, layout.getLineLeft(abstractC2098408Jy.nextInt()));
                }
                Iterator<Integer> it3 = new IntRange(0, i9).iterator();
                if (it3.hasNext()) {
                    AbstractC2098408Jy abstractC2098408Jy2 = (AbstractC2098408Jy) it3;
                    float lineRight = layout.getLineRight(abstractC2098408Jy2.nextInt());
                    while (it3.hasNext()) {
                        lineRight = Math.max(lineRight, layout.getLineRight(abstractC2098408Jy2.nextInt()));
                    }
                    if (lineRight > lineLeft && (paint = ((TuxTextView) viewOnLayoutChangeListenerC391530FWt.l0).getPaint()) != null) {
                        paint.setShader(new LinearGradient(lineLeft, 0.0f, lineRight, 0.0f, new int[]{ColorProtector.parseColor("#D59544"), ColorProtector.parseColor("#CE6D00"), ColorProtector.parseColor("#FFCC85")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                        return;
                    }
                    return;
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        }
    }

    public static final void onLayoutChange$17(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0FBI c0fbi = (C0FBI) viewOnLayoutChangeListenerC391530FWt.l0;
        C0FEW c0few = c0fbi.LLJJJIL;
        if (c0few == null) {
            return;
        }
        c0fbi.LLLLIL().LJIJI.invoke(new Size(c0few.getMeasuredWidth(), c0few.getMeasuredHeight()));
    }

    public static final void onLayoutChange$18(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C0EN5) viewOnLayoutChangeListenerC391530FWt.l0).LJIILIIL();
        super/*X.0ERI*/.LIZIZ();
    }

    public static final void onLayoutChange$19(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1664680tQA<TextStickerModel> c1664680tQA = ((C388170FJv) viewOnLayoutChangeListenerC391530FWt.l0).LLLFZ;
        C1664680tQA<TextStickerModel> c1664680tQA2 = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.isVERenderSticker()) {
            C1664680tQA<TextStickerModel> c1664680tQA3 = ((C388170FJv) viewOnLayoutChangeListenerC391530FWt.l0).LLLFZ;
            if (c1664680tQA3 != null) {
                c1664680tQA2 = c1664680tQA3;
            }
            if (!c1664680tQA2.LIZ.getAutoAdaptCanvas()) {
                HandlerHook.viewPost(((C388170FJv) viewOnLayoutChangeListenerC391530FWt.l0).getTextStickerView(), new ARunnableS105S0100000_5((C388170FJv) viewOnLayoutChangeListenerC391530FWt.l0, 136));
            }
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        RecyclerView recyclerView = ((C383320F1e) viewOnLayoutChangeListenerC391530FWt.l0).LLJJJIL;
        if (recyclerView == null) {
            return;
        }
        boolean z = false;
        int i11 = 0;
        int i12 = 0;
        for (View view2 : new C09RD(recyclerView)) {
            int height = view2.getHeight();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i9 = marginLayoutParams2.topMargin;
            } else {
                i9 = 0;
            }
            int i13 = height + i9;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i10 = marginLayoutParams.bottomMargin;
            } else {
                i10 = 0;
            }
            i12 += i13 + i10;
            i11++;
        }
        if (((C383320F1e) viewOnLayoutChangeListenerC391530FWt.l0).LLLLILI().LIZ.LIZIZ.size() > i11 || i12 > recyclerView.getHeight() - recyclerView.getPaddingTop()) {
            z = true;
        }
        C383320F1e c383320F1e = (C383320F1e) viewOnLayoutChangeListenerC391530FWt.l0;
        if (z != c383320F1e.LLJJJJLIIL) {
            c383320F1e.LLJJJJLIIL = z;
            if (z) {
                C371550EhV c371550EhV = c383320F1e.LLJJJJJIL;
                if (c371550EhV != null) {
                    c371550EhV.LIZJ(0.0f, C418440Gaw.LIZIZ(14), 0.0f, C418440Gaw.LIZIZ(32));
                    return;
                }
                return;
            }
            C371550EhV c371550EhV2 = c383320F1e.LLJJJJJIL;
            if (c371550EhV2 == null) {
                return;
            }
            c371550EhV2.LIZJ(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static final void onLayoutChange$20(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long j;
        View view2;
        int i9;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        C360090E9v c360090E9v = ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).LLJJIJIIJIL;
        if (c360090E9v != null) {
            C354270Duj.LIZJ(50L, new AwS549S0100000_5(c360090E9v.LIZ, 1294));
        }
        if (((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).BS()) {
            Context context = view.getContext();
            if (context != null) {
                if (C357780E0y.LIZ()) {
                    i9 = 20;
                } else {
                    i9 = 12;
                }
                float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i9));
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
                c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
                c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
                view.setBackground(c384050F3z.LIZ(context));
            }
            if (((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).SR() && (view2 = ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).getView()) != null) {
                view2.setOnTouchListener(new ATListenerS439S0100000_5((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0, 11));
            }
        }
        ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).LLJLILLLLZIIL = view.getHeight();
        ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).ES(true);
        ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).getClass();
        ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).qS();
        if (((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).kS()) {
            C786410Ut5.ed(view, ((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).LLJLILLLLZIIL);
            ViewPropertyAnimator viewPropertyAnimatorTranslationYBy = view.animate().translationYBy(-((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0).LLJLILLLLZIIL);
            DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0;
            if (dTResourcePanelFragment.LLJJJJ.contains(dTResourcePanelFragment.qS())) {
                j = 250;
            } else if (dTResourcePanelFragment.LLJJJJJIL.contains(dTResourcePanelFragment.qS())) {
                j = 300;
            } else {
                j = 350;
            }
            viewPropertyAnimatorTranslationYBy.setDuration(j).setInterpolator(C1619980sG4.LJIILIIL()).setListener(new AAListenerS316S0100000_5((DTResourcePanelFragment) viewOnLayoutChangeListenerC391530FWt.l0, 10));
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        C0EV3 c0ev3 = (C0EV3) viewOnLayoutChangeListenerC391530FWt.l0;
        C425240Glu c425240Glu = c0ev3.LLJJJJ;
        if (c425240Glu != null) {
            HandlerHook.viewPost(c425240Glu, new ARunnableS105S0100000_5(c0ev3, 56));
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C364510EQv) viewOnLayoutChangeListenerC391530FWt.l0).LLLLLIL();
        C214799194j c214799194j = ((C364510EQv) viewOnLayoutChangeListenerC391530FWt.l0).LLJJ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C0ERB) viewOnLayoutChangeListenerC391530FWt.l0).LLLLL();
        C214799194j c214799194j = ((C0ERB) viewOnLayoutChangeListenerC391530FWt.l0).LLJJ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iLIZIZ;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C385880FBa) viewOnLayoutChangeListenerC391530FWt.l0).LLLLLLLLL();
        C385910FBd c385910FBd = ((C385880FBa) viewOnLayoutChangeListenerC391530FWt.l0).LLJJJIL;
        if (c385910FBd != null) {
            iLIZIZ = c385910FBd.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        C385880FBa c385880FBa = (C385880FBa) viewOnLayoutChangeListenerC391530FWt.l0;
        c385880FBa.LLLLLJIL(iLIZIZ, new AwS549S0100000_5(c385880FBa, 668));
        View view2 = ((C385880FBa) viewOnLayoutChangeListenerC391530FWt.l0).mView;
        if (view2 != null && (tuxIconView2 = (TuxIconView) view2.findViewById(R.id.gsk)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
        View view3 = ((C385880FBa) viewOnLayoutChangeListenerC391530FWt.l0).mView;
        if (view3 != null && (tuxIconView = (TuxIconView) view3.findViewById(R.id.gq6)) != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        ((C0EFO) viewOnLayoutChangeListenerC391530FWt.l0).LLLLIL().LIZ.invoke(Integer.valueOf(view.getHeight()));
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        float height = view.getHeight();
        ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).LLJJIJI = Float.valueOf(height);
        C0EB6 c0eb6O2 = ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).o2();
        if (c0eb6O2 != null) {
            c0eb6O2.LJIIJJI(true);
        }
        C0EB6 c0eb6O22 = ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).o2();
        if (c0eb6O22 != null) {
            c0eb6O22.LJIIIZ(new C0E2C(height, ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).getPanelName(), true));
        }
        ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).H2(true);
        ((C375800EoM) viewOnLayoutChangeListenerC391530FWt.l0).LLJJI.LJIIJ(Unit.LIZ);
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC391530FWt viewOnLayoutChangeListenerC391530FWt, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391530FWt);
        if (((C0ETK) viewOnLayoutChangeListenerC391530FWt.l0).oI1()) {
            Context context = view.getContext();
            if (context != null && !((C0ETK) viewOnLayoutChangeListenerC391530FWt.l0).FZ0()) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
                view.setBackground(c384050F3z.LIZ(context));
            }
            if (((C0ETK) viewOnLayoutChangeListenerC391530FWt.l0).LLIZ.LIZ.invoke().booleanValue()) {
                view.setOnTouchListener(new ATListenerS439S0100000_5((C0ETK) viewOnLayoutChangeListenerC391530FWt.l0, 6));
            }
        }
    }
}
