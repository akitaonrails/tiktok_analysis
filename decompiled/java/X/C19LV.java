package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.19LV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LV implements View.OnLayoutChangeListener {
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
        }
    }

    public C19LV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RecyclerView recyclerView;
        view.removeOnLayoutChangeListener(c19lv);
        ((FavoriteVideoTabRootFragment) c19lv.l0).cS();
        C1260280itu c1260280ituPR = ((FavoriteVideoTabRootFragment) c19lv.l0).PR();
        if (c1260280ituPR != null && !c1260280ituPR.LIZLLL()) {
            View viewLJJLIIIJILLIZJL = ((FavoriteVideoTabRootFragment) c19lv.l0).LJJLIIIJILLIZJL();
            if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    public static final void onLayoutChange$1(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c19lv);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c19lv.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void onLayoutChange$10(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("windowParentView layout changed (was=(");
            sbLIZ.append(i5);
            sbLIZ.append(',');
            sbLIZ.append(i6);
            sbLIZ.append(',');
            sbLIZ.append(i7);
            sbLIZ.append(',');
            sbLIZ.append(i8);
            sbLIZ.append(") now=(");
            sbLIZ.append(i);
            sbLIZ.append(',');
            sbLIZ.append(i2);
            sbLIZ.append(',');
            sbLIZ.append(i3);
            sbLIZ.append(',');
            sbLIZ.append(i4);
            sbLIZ.append(")) → re-applyLayout to correct stale getLocationOnScreen()");
            C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
            List<C955080axe> list = ((C214827195l) c19lv.l0).LJFF;
            if (list != null) {
                ((C214827195l) c19lv.l0).LIZ(list);
            }
        }
    }

    public static final void onLayoutChange$2(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            AnonymousClass1855 anonymousClass1855 = (AnonymousClass1855) c19lv.l0;
            anonymousClass1855.LJIIIZ = null;
            TuxTextView tuxTextView = anonymousClass1855.LJII;
            if (tuxTextView != null) {
                SpannableStringBuilder spannableStringBuilder = anonymousClass1855.LJIIIIZZ;
                if (spannableStringBuilder != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder2).append((CharSequence) "…").append((CharSequence) "888:888");
                    boolean z = false;
                    while (C20588115hH.LIZLLL(tuxTextView, spannableStringBuilderAppend, new C444890HcV(), tuxTextView.getMeasuredWidth(), null, true).getLineCount() > 2 && spannableStringBuilder2.length() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, spannableStringBuilder2.length() - 1));
                        spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder3).append((CharSequence) "…").append((CharSequence) "888:888");
                        spannableStringBuilder2 = spannableStringBuilder3;
                        z = true;
                    }
                    if (z) {
                        spannableStringBuilder2 = spannableStringBuilder2.append((CharSequence) "…");
                    }
                    anonymousClass1855.LJIIIZ = spannableStringBuilder2;
                }
                String str = anonymousClass1855.LJIIL;
                if (str != null) {
                    anonymousClass1855.LJJ(str);
                }
                HandlerHook.viewPost(tuxTextView, new RunnableC514801zW(tuxTextView, 91));
            }
        }
    }

    public static final void onLayoutChange$3(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("layout changed");
            AnonymousClass1858 anonymousClass1858 = (AnonymousClass1858) c19lv.l0;
            anonymousClass1858.LJIIIZ = null;
            TuxTextView tuxTextView = anonymousClass1858.LJFF;
            if (tuxTextView != null) {
                SpannableStringBuilder spannableStringBuilder = anonymousClass1858.LJIIIIZZ;
                if (spannableStringBuilder != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder2).append((CharSequence) "…").append((CharSequence) anonymousClass1858.LJIIJ);
                    boolean z = false;
                    while (C20588115hH.LIZLLL(tuxTextView, spannableStringBuilderAppend, new C444890HcV(), tuxTextView.getMeasuredWidth(), null, true).getLineCount() > 2 && spannableStringBuilder2.length() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, spannableStringBuilder2.length() - 1));
                        spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder3).append((CharSequence) "…").append((CharSequence) anonymousClass1858.LJIIJ);
                        spannableStringBuilder2 = spannableStringBuilder3;
                        z = true;
                    }
                    if (z) {
                        anonymousClass1858.LJIIIZ = spannableStringBuilder2.append((CharSequence) "…");
                    } else {
                        anonymousClass1858.LJIIIZ = spannableStringBuilder2;
                    }
                }
                String str = anonymousClass1858.LJIILIIL;
                if (str != null) {
                    anonymousClass1858.LJIILIIL(str);
                }
                HandlerHook.viewPost(tuxTextView, new RunnableC514801zW(tuxTextView, 110));
            }
        }
    }

    public static final void onLayoutChange$4(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LynxView lynxView;
        View view2;
        if (i != i5 || i3 != i7) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C1AF3) c19lv.l0).LJIIL;
            Object kitView = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                C1AF3 c1af3 = (C1AF3) c19lv.l0;
                Object parent = view.getParent();
                if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                    marginLayoutParams.leftMargin = view.getLeft();
                    marginLayoutParams.rightMargin = (view2.getWidth() - view.getWidth()) - view.getLeft();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layoutChangedListener: leftMargin=");
                sbLIZ.append(marginLayoutParams.leftMargin);
                sbLIZ.append(" rightMargin=");
                sbLIZ.append(marginLayoutParams.rightMargin);
                C20441214yg.LIZIZ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1af3.LJIIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView();
                }
                if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                    lynxView.updateScreenMetrics(view.getWidth(), view.getHeight());
                }
                c1af3.LJJIII("layoutChanged");
            }
        }
    }

    public static final void onLayoutChange$5(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        if (i9 != i7 - i5) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("layout changed:");
            sbLIZ.append(i9);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            C212228183m c212228183m = (C212228183m) c19lv.l0;
            c212228183m.LJIIJ = null;
            TuxTextView tuxTextView = c212228183m.LJI;
            if (tuxTextView != null) {
                SpannableStringBuilder spannableStringBuilder = c212228183m.LJIIIZ;
                if (spannableStringBuilder != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder2).append((CharSequence) "…").append((CharSequence) c212228183m.LJIIJJI);
                    int width = tuxTextView.getWidth();
                    if (width <= 0) {
                        c212228183m.LJIIJ = spannableStringBuilder2;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("textView.measuredWidth:");
                        sbLIZ2.append(tuxTextView.getMeasuredWidth());
                        sbLIZ2.append(",width:");
                        sbLIZ2.append(width);
                        sbLIZ2.append(",container:");
                        sbLIZ2.append(c212228183m.LIZ.getMeasuredWidth());
                        C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        boolean z = false;
                        while (C20588115hH.LIZLLL(tuxTextView, spannableStringBuilderAppend, new C444890HcV(), width, null, true).getLineCount() > 2 && spannableStringBuilder2.length() > 0) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, spannableStringBuilder2.length() - 1));
                            spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder3).append((CharSequence) "…").append((CharSequence) c212228183m.LJIIJJI);
                            spannableStringBuilder2 = spannableStringBuilder3;
                            z = true;
                        }
                        if (z) {
                            c212228183m.LJIIJ = spannableStringBuilder2.append((CharSequence) "…");
                        } else {
                            c212228183m.LJIIJ = spannableStringBuilder2;
                        }
                    }
                }
                String str = c212228183m.LJIILJJIL;
                if (str != null) {
                    c212228183m.LJIILL(str);
                }
                HandlerHook.viewPost(tuxTextView, new RunnableC514801zW(tuxTextView, 134));
            }
        }
    }

    public static final void onLayoutChange$6(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i7 - i5 != i3 - i) {
            ((C184R) c19lv.l0).LJIJ(false);
        }
    }

    public static final void onLayoutChange$7(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i7 - i5;
        if (i4 - i2 == i8 - i6 && i9 == i10) {
            return;
        }
        InterfaceC21327318dD interfaceC21327318dD = ((C21326518d5) c19lv.l0).LJI;
        if (interfaceC21327318dD != null) {
            interfaceC21327318dD.LIZLLL();
        }
        C21326518d5 c21326518d5 = (C21326518d5) c19lv.l0;
        c21326518d5.LJII = null;
        c21326518d5.LJIIIIZZ = null;
        c21326518d5.LJI = null;
        c21326518d5.LIZIZ.removeOnLayoutChangeListener((View.OnLayoutChangeListener) c21326518d5.LJIIL.getValue());
    }

    public static final void onLayoutChange$8(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((AnonymousClass1814) c19lv.l0).LLILZLL.getLineCount() > ((AnonymousClass1814) c19lv.l0).LLILZLL.getMaxLines()) {
            ((AnonymousClass1814) c19lv.l0).LLIZLLLIL.setIsTransparent(true);
        } else {
            ((AnonymousClass1814) c19lv.l0).LLIZLLLIL.setIsTransparent(false);
        }
    }

    public static final void onLayoutChange$9(C19LV c19lv, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        List<C955080axe> list;
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 > 0 && i10 > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("container layout changed to non-zero (");
                sbLIZ.append(i);
                sbLIZ.append(',');
                sbLIZ.append(i2);
                sbLIZ.append(',');
                sbLIZ.append(i3);
                sbLIZ.append(',');
                sbLIZ.append(i4);
                sbLIZ.append(") size=(");
                sbLIZ.append(i9);
                sbLIZ.append('x');
                sbLIZ.append(i10);
                sbLIZ.append(") → retry pending commit");
                C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ));
                C214827195l c214827195l = (C214827195l) c19lv.l0;
                if (c214827195l.LIZJ != null && !c214827195l.LJII && (list = c214827195l.LJFF) != null) {
                    c214827195l.LIZ(list);
                }
            }
        }
    }
}
