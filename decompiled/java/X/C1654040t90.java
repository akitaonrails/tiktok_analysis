package X;

import Y.AObjectS241S0100000_8;
import Y.ARunnableS36S0101000_25;
import Y.AfS194S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import bfk.b0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654040t90 extends AbstractC1664490tPr<C1654180t9E, C1654190t9F> {
    public final List<InterfaceC1654170t9D> LLJJJIL;
    public final C11NZ<List<InterfaceC1654170t9D>> LLJJJJ;
    public final C385670FAf<Boolean> LLJJJJJIL;
    public final C11SU<Pair<InterfaceC1654170t9D, Boolean>> LLJJJJLIIL;
    public TabHost LLJJL;
    public View LLJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 384));
    public List<? extends InterfaceC1654170t9D> LLJLIL = C13BV.INSTANCE;
    public final Map<Integer, Integer> LLJLILLLLZIIL = new LinkedHashMap();
    public final Map<String, C1170704i1> LLJLL = new LinkedHashMap();

    public final C0GUE LLLLLJIL() {
        return (C0GUE) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public final void LLLLLJLJLL(final int i) {
        b0 b0Var;
        final TextView textView;
        int iIntValue;
        TabHost tabHost = this.LLJJL;
        if (tabHost != null) {
            this.LLJLL.remove(tabHost.LIZ(i));
            HandlerHook.viewPostDelay(tabHost, new ARunnableS36S0101000_25(i, this, 1), 500L);
        }
        C0GUE c0gueLLLLLJIL = LLLLLJIL();
        if (c0gueLLLLLJIL != null) {
            int childCount = c0gueLLLLLJIL.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C0GUE c0gueLLLLLJIL2 = LLLLLJIL();
                View childAt = null;
                if (c0gueLLLLLJIL2 != null) {
                    childAt = c0gueLLLLLJIL2.getChildAt(i2);
                }
                if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null && (textView = b0Var.getTextView()) != null) {
                    if (i2 == i) {
                        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        Integer num = (Integer) ((LinkedHashMap) this.LLJLILLLLZIIL).get(Integer.valueOf(i));
                        if (num != null && num.intValue() > 0) {
                            LLLLLLJ(num.intValue());
                        } else if (textView.getWidth() > 0) {
                            LLLLLLJ(textView.getWidth());
                            this.LLJLILLLLZIIL.put(Integer.valueOf(i), Integer.valueOf(textView.getWidth()));
                        } else {
                            C786410Ut5.x3(textView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0t93
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    if (textView.getWidth() > 0) {
                                        this.LLLLLLJ(textView.getWidth());
                                        this.LLJLILLLLZIIL.put(Integer.valueOf(i), Integer.valueOf(textView.getWidth()));
                                        C786410Ut5.C3(textView.getViewTreeObserver(), this);
                                    }
                                }
                            });
                        }
                    } else {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.oj, textView.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        textView.setShadowLayer(5.0f, 0.0f, 1.0f, iIntValue);
                    }
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLLL(List<? extends InterfaceC1654170t9D> list) {
        int iIntValue;
        TuxTextView tuxTextView;
        this.LLJLIL = list;
        C0GUE c0gueLLLLLJIL = LLLLLJIL();
        if (c0gueLLLLLJIL != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0gueLLLLLJIL, null);
            c0gueLLLLLJIL.removeAllViews();
        }
        ((LinkedHashMap) this.LLJLL).clear();
        Iterator<? extends InterfaceC1654170t9D> it2 = list.iterator();
        while (true) {
            iIntValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1654170t9D next = it2.next();
            b0 b0Var = new b0(requireSceneContext(), 0);
            String strLIZ = next.LIZ();
            next.LJIIL();
            b0Var.setText(strLIZ);
            TextView textView = b0Var.getTextView();
            if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                tuxTextView.LJJJJI(16.0f);
            }
            b0Var.setEnabled(true);
            b0Var.setTag(next.LJIIJJI().getTag());
            b0Var.e0();
            C0GUE c0gueLLLLLJIL2 = LLLLLJIL();
            if (c0gueLLLLLJIL2 != null) {
                c0gueLLLLLJIL2.addView(b0Var);
            }
            C1170704i1 c1170704i1LIZIZ = next.LIZIZ();
            if (c1170704i1LIZIZ != null) {
                this.LLJLL.put(next.LJIIJJI().getTag(), c1170704i1LIZIZ);
            }
        }
        TabHost tabHost = this.LLJJL;
        if (tabHost != null) {
            Iterator<? extends InterfaceC1654170t9D> it3 = list.iterator();
            int i = 0;
            while (true) {
                if (it3.hasNext()) {
                    if (it3.next().isDefault()) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                iIntValue = numValueOf.intValue();
            }
            tabHost.LJFF(true, iIntValue, 0, false, true);
        }
    }

    public final void LLLLLLIL(boolean z) {
        TabHost tabHost = this.LLJJL;
        if (tabHost == null) {
            return;
        }
        if (z) {
            if (tabHost.getCurrentIndex() > 0) {
                tabHost.LIZLLL(tabHost.getCurrentIndex() - 1, 3, true);
            }
        } else {
            if (tabHost.getCurrentIndex() >= tabHost.getTabCount() - 1) {
                return;
            }
            tabHost.LIZLLL(tabHost.getCurrentIndex() + 1, 3, true);
        }
    }

    public final void LLLLLLJ(int i) {
        View view = this.LLJL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.width != i) {
                layoutParams.width = i;
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        super.onActivityCreated(bundle);
        TabHost tabHost = (TabHost) requireViewById(R.id.ens);
        this.LLJJL = tabHost;
        if (tabHost != null) {
            viewFindViewById = tabHost.findViewById(R.id.enr);
        } else {
            viewFindViewById = null;
        }
        this.LLJL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(C800330VaR.LIZIZ(requireActivity(), R.drawable.a_3));
        }
        C1428310nGv.LJII(this.LLJL, -1, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
        TabHost tabHost2 = this.LLJJL;
        if (tabHost2 != null) {
            tabHost2.setSelectedTextColor(R.attr.ej);
        }
        TabHost tabHost3 = this.LLJJL;
        if (tabHost3 != null) {
            tabHost3.setUnselectedTextColor(R.attr.ef);
        }
        TabHost tabHost4 = this.LLJJL;
        if (tabHost4 != null) {
            tabHost4.setTabHostGestureListener(new InterfaceC1653660t8O() { // from class: X.0sx5
                @Override // X.InterfaceC1653660t8O
                public final void LJI() {
                }

                @Override // X.InterfaceC1653660t8O
                public final void LIZ() {
                    try {
                        new C1351210lGZ(this.LIZ.requireSceneContext()).LIZIZ(50, 61);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.InterfaceC1653660t8O
                public final void LJII() {
                    b0 b0Var;
                    C0GUE c0gueLLLLLJIL = this.LIZ.LLLLLJIL();
                    if (c0gueLLLLLJIL == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int childCount = c0gueLLLLLJIL.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        C0GUE c0gueLLLLLJIL2 = this.LIZ.LLLLLJIL();
                        View childAt = c0gueLLLLLJIL2 != null ? c0gueLLLLLJIL2.getChildAt(i) : null;
                        if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                            int iAbs = Math.abs(C1428310nGv.LJ(this.LIZ.LLJL) - C1428310nGv.LJ(b0Var));
                            if (iAbs <= b0Var.getMeasuredWidth() / 2) {
                                TextView textView = b0Var.getTextView();
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ej, b0Var.getContext());
                                textView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, ((b0Var.getMeasuredWidth() - iAbs) * 2.0f) / b0Var.getMeasuredWidth());
                                b0Var.e0();
                            } else if (iAbs <= b0Var.getMeasuredWidth() / 2 || iAbs > b0Var.getMeasuredWidth()) {
                                TextView textView2 = b0Var.getTextView();
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, b0Var.getContext());
                                textView2.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
                                TextView textView3 = b0Var.getTextView();
                                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.oj, b0Var.getContext());
                                textView3.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ3 != null ? numLIZJ3.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, 1.0f);
                            } else {
                                TextView textView4 = b0Var.getTextView();
                                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ef, b0Var.getContext());
                                textView4.setTextColor(numLIZJ4 != null ? numLIZJ4.intValue() : -1);
                                TextView textView5 = b0Var.getTextView();
                                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.oj, b0Var.getContext());
                                textView5.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ5 != null ? numLIZJ5.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, ((iAbs - (b0Var.getMeasuredWidth() / 2)) * 2.0f) / b0Var.getMeasuredWidth());
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1653660t8O
                public final void LJIIIIZZ() {
                    b0 b0Var;
                    C0GUE c0gueLLLLLJIL = this.LIZ.LLLLLJIL();
                    if (c0gueLLLLLJIL == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int childCount = c0gueLLLLLJIL.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        C0GUE c0gueLLLLLJIL2 = this.LIZ.LLLLLJIL();
                        View childAt = c0gueLLLLLJIL2 != null ? c0gueLLLLLJIL2.getChildAt(i) : null;
                        if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                            C786410Ut5.e5(b0Var, 1.0f);
                        }
                    }
                }
            });
        }
        TabHost tabHost5 = this.LLJJL;
        if (tabHost5 != null) {
            tabHost5.setOnIndexChangedListener(new InterfaceC1653420t80() { // from class: X.0t95
                @Override // X.InterfaceC1653420t80
                public final void LIZ(int i, int i2, Object obj, boolean z, boolean z2) {
                    this.LIZ.LLLLIL().LIZ.invoke((InterfaceC1654170t9D) ListProtector.get(this.LIZ.LLJLIL, i), Integer.valueOf(i2));
                    this.LIZ.LLLLLJLJLL(i);
                }
            });
        }
        LLLLLL(this.LLJJJIL);
        this.LLJJJJ.LJJLJLI(new AfS194S0100000_25(this, 38));
        this.LLJJJJJIL.LIZ(this, new AObjectS241S0100000_8(this, 28));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t9H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1654180t9E) obj).LIZ;
            }
        }, new AwS604S0100000_25(this, 263));
        this.LLJJJJLIIL.LJJLJLI(new C09JN() { // from class: X.00P2
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ShootTopTabScene@8852.initObserver$4");
                C1C7U.LIZIZ("ShootTopTabScene@8852.initObserver$4");
            }
        });
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i94, viewGroup, false);
    }

    public C1654040t90(List list, C11PQ c11pq, C385670FAf c385670FAf, C11SU c11su) {
        this.LLJJJIL = list;
        this.LLJJJJ = c11pq;
        this.LLJJJJJIL = c385670FAf;
        this.LLJJJJLIIL = c11su;
    }
}
