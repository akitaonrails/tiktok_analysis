package X;

import Y.ACListenerS130S0200000_28;
import Y.ARunnableS104S0100000_4;
import Y.ATListenerS347S0200000_28;
import Y.ATListenerS460S0100000_28;
import android.content.Context;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914550zvB extends AbstractC1914480zv4 {
    public C1914560zvC LJ;
    public ConstraintLayout LJFF;
    public final Set<String> LJI;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1914480zv4
    public final FrameLayout LIZ() {
        View viewLJ;
        int i;
        this.LIZLLL = "block";
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.agp, frameLayout, false);
        frameLayout.addView(viewTd);
        int i2 = R.id.a21;
        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.a21, viewTd);
        if (linearLayout != null) {
            i2 = R.id.a4e;
            FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.a4e, viewTd);
            if (frameLayout2 != null) {
                i2 = R.id.a4z;
                FrameLayout frameLayout3 = (FrameLayout) C1616006Uk.LIZ(R.id.a4z, viewTd);
                if (frameLayout3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                    i2 = R.id.eus;
                    FrameLayout frameLayout4 = (FrameLayout) C1616006Uk.LIZ(R.id.eus, viewTd);
                    if (frameLayout4 != null) {
                        i2 = R.id.eww;
                        FrameLayout frameLayout5 = (FrameLayout) C1616006Uk.LIZ(R.id.eww, viewTd);
                        if (frameLayout5 != null) {
                            i2 = R.id.ewx;
                            FrameLayout frameLayout6 = (FrameLayout) C1616006Uk.LIZ(R.id.ewx, viewTd);
                            if (frameLayout6 != null) {
                                i2 = R.id.jrm;
                                if (C1616006Uk.LIZ(R.id.jrm, viewTd) != null) {
                                    i2 = R.id.jrn;
                                    if (C1616006Uk.LIZ(R.id.jrn, viewTd) != null) {
                                        i2 = R.id.vs0;
                                        FrameLayout frameLayout7 = (FrameLayout) C1616006Uk.LIZ(R.id.vs0, viewTd);
                                        if (frameLayout7 != null) {
                                            this.LJ = new C1914560zvC(constraintLayout, linearLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, frameLayout7);
                                            this.LJFF = constraintLayout;
                                            constraintLayout.setAddStatesFromChildren(true);
                                            boolean z = this.LIZJ.action != null;
                                            constraintLayout.setClickable(z);
                                            constraintLayout.setFocusable(z);
                                            if (z) {
                                                C1914170zuZ.LIZ.getClass();
                                                if (!Intrinsics.LJFF(C1914170zuZ.LIZJ.get("universal_popup_disable_ripple"), "1")) {
                                                    Context context = this.LIZ;
                                                    TypedValue typedValue = new TypedValue();
                                                    try {
                                                        constraintLayout.setForeground((!context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true) || (i = typedValue.resourceId) == 0) ? null : C800330VaR.LIZIZ(context, i));
                                                    } catch (NoSuchMethodError e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        e.printStackTrace();
                                                    }
                                                }
                                            }
                                            for (Map.Entry<String, UniversalPopupBlockElement> entry : this.LIZJ.elements.entrySet()) {
                                                String key = entry.getKey();
                                                switch (key.hashCode()) {
                                                    case -1242588667:
                                                        if (key.equals("content_top_center")) {
                                                            UniversalPopupBlockElement value = entry.getValue();
                                                            C1914560zvC c1914560zvC = this.LJ;
                                                            if (c1914560zvC == null) {
                                                                c1914560zvC = null;
                                                            }
                                                            LJ(value, c1914560zvC.LLILZLL);
                                                        }
                                                        break;
                                                    case -760800841:
                                                        if (key.equals("content_top_left")) {
                                                            if (Intrinsics.LJFF(entry.getValue().subtype, "icon") || Intrinsics.LJFF(entry.getValue().subtype, "image")) {
                                                                UniversalPopupBlockElement value2 = entry.getValue();
                                                                C1914170zuZ.LIZ.getClass();
                                                                AbstractC1914420zuy abstractC1914420zuy = C1914170zuZ.LJII;
                                                                if (abstractC1914420zuy == null || (viewLJ = abstractC1914420zuy.LIZLLL(value2, this.LIZ, "block")) == null) {
                                                                    viewLJ = C1914170zuZ.LJII != null ? AbstractC1914420zuy.LJ(value2, null, this.LIZ, "block") : null;
                                                                }
                                                                if (viewLJ != null) {
                                                                    C1914560zvC c1914560zvC2 = this.LJ;
                                                                    if (c1914560zvC2 == null) {
                                                                        c1914560zvC2 = null;
                                                                    }
                                                                    c1914560zvC2.LLIZ.addView(viewLJ);
                                                                    if (Intrinsics.LJFF(value2.subtype, "bullet")) {
                                                                        C1914560zvC c1914560zvC3 = this.LJ;
                                                                        if (c1914560zvC3 == null) {
                                                                            c1914560zvC3 = null;
                                                                        }
                                                                        FrameLayout frameLayout8 = c1914560zvC3.LLIZ;
                                                                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                                                                        if (frameLayout8.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout8.getLayoutParams();
                                                                            marginLayoutParams.setMarginEnd(iLIZIZ);
                                                                            C786410Ut5.W5(frameLayout8, marginLayoutParams);
                                                                        }
                                                                    }
                                                                    C1914560zvC c1914560zvC4 = this.LJ;
                                                                    if (c1914560zvC4 == null) {
                                                                        c1914560zvC4 = null;
                                                                    }
                                                                    C786410Ut5.LJZ(0, c1914560zvC4.LLIZ);
                                                                    C1914560zvC c1914560zvC5 = this.LJ;
                                                                    if (c1914560zvC5 == null) {
                                                                        c1914560zvC5 = null;
                                                                    }
                                                                    C786410Ut5.x3(c1914560zvC5.LLIZ.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 12));
                                                                }
                                                            } else {
                                                                UniversalPopupBlockElement value3 = entry.getValue();
                                                                C1914560zvC c1914560zvC6 = this.LJ;
                                                                if (c1914560zvC6 == null) {
                                                                    c1914560zvC6 = null;
                                                                }
                                                                LIZLLL(value3, c1914560zvC6.LLIZ);
                                                            }
                                                        }
                                                        break;
                                                    case 35080923:
                                                        if (key.equals("content_center")) {
                                                            UniversalPopupBlockElement value4 = entry.getValue();
                                                            C1914560zvC c1914560zvC7 = this.LJ;
                                                            if (c1914560zvC7 == null) {
                                                                c1914560zvC7 = null;
                                                            }
                                                            LJ(value4, c1914560zvC7.LLILZIL);
                                                        }
                                                        break;
                                                    case 1048825940:
                                                        if (key.equals("action_bottom")) {
                                                            UniversalPopupBlockElement value5 = entry.getValue();
                                                            if (Intrinsics.LJFF(value5.subtype, "borderless") || Intrinsics.LJFF(value5.subtype, "destructive")) {
                                                                C1914170zuZ.LIZ.getClass();
                                                                View viewLIZJ = C1914170zuZ.LJII != null ? AbstractC1914420zuy.LIZJ(this.LIZ) : null;
                                                                if (viewLIZJ != null) {
                                                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                                                                    layoutParams.setMargins(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                                                                    C786410Ut5.W5(viewLIZJ, layoutParams);
                                                                }
                                                                C1914560zvC c1914560zvC8 = this.LJ;
                                                                if (c1914560zvC8 == null) {
                                                                    c1914560zvC8 = null;
                                                                }
                                                                c1914560zvC8.LLILLJJLI.addView(viewLIZJ);
                                                            }
                                                            UniversalPopupBlockElement value6 = entry.getValue();
                                                            C1914560zvC c1914560zvC9 = this.LJ;
                                                            if (c1914560zvC9 == null) {
                                                                c1914560zvC9 = null;
                                                            }
                                                            LIZLLL(value6, c1914560zvC9.LLILLJJLI);
                                                        }
                                                        break;
                                                    case 1658552297:
                                                        if (key.equals("action_top_right")) {
                                                            UniversalPopupBlockElement value7 = entry.getValue();
                                                            C1914560zvC c1914560zvC10 = this.LJ;
                                                            if (c1914560zvC10 == null) {
                                                                c1914560zvC10 = null;
                                                            }
                                                            LIZLLL(value7, c1914560zvC10.LLILZ);
                                                        }
                                                        break;
                                                    case 1849533139:
                                                        if (key.equals("action_right")) {
                                                            UniversalPopupBlockElement value8 = entry.getValue();
                                                            C1914560zvC c1914560zvC11 = this.LJ;
                                                            if (c1914560zvC11 == null) {
                                                                c1914560zvC11 = null;
                                                            }
                                                            LIZLLL(value8, c1914560zvC11.LLILLL);
                                                        }
                                                        break;
                                                }
                                            }
                                            UniversalPopupAction universalPopupAction = this.LIZJ.action;
                                            if (universalPopupAction != null) {
                                                C786410Ut5.Y7(constraintLayout, new ACListenerS130S0200000_28(this, universalPopupAction, 59));
                                                constraintLayout.setOnTouchListener(new ATListenerS460S0100000_28(this, 6));
                                            }
                                            C1914170zuZ.LIZ.getClass();
                                            if (C1914170zuZ.LJII != null) {
                                                Context context2 = this.LIZ;
                                                UniversalPopupBlockFormat universalPopupBlockFormat = this.LIZJ.format;
                                                C1914560zvC c1914560zvC12 = this.LJ;
                                                AbstractC1914420zuy.LJII(context2, universalPopupBlockFormat, (c1914560zvC12 != null ? c1914560zvC12 : null).LL);
                                            }
                                            return frameLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
    }

    @Override // X.AbstractC1914480zv4
    public final List<String> LIZIZ() {
        List<String> listLLIIII = C13LP.LLIIII(this.LJI);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        for (String str : listLLIIII) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZJ.id);
            sbLIZ.append('_');
            sbLIZ.append(str);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return arrayList;
    }

    @Override // X.AbstractC1914480zv4
    public final void LIZJ(boolean z) {
        this.LJI.clear();
        C1914560zvC c1914560zvC = this.LJ;
        C1914560zvC c1914560zvC2 = null;
        if (c1914560zvC == null) {
            c1914560zvC = null;
        }
        C1841350y17 c1841350y17 = (C1841350y17) c1914560zvC.LLILLL.findViewWithTag("radio");
        if (c1841350y17 != null) {
            c1841350y17.setChecked(false);
        }
        C1914560zvC c1914560zvC3 = this.LJ;
        if (c1914560zvC3 != null) {
            c1914560zvC2 = c1914560zvC3;
        }
        C1841350y17 c1841350y172 = (C1841350y17) c1914560zvC2.LLILZ.findViewWithTag("radio");
        if (c1841350y172 != null) {
            c1841350y172.setChecked(false);
        }
    }

    public static void LJFF(MotionEvent motionEvent, View view) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 3) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(view, 133));
            return;
        }
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0y17, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0HZQ] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.18qq] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement r15, android.view.ViewGroup r16) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1914550zvB.LIZLLL(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement, android.view.ViewGroup):void");
    }

    public final void LJ(UniversalPopupBlockElement universalPopupBlockElement, ViewGroup viewGroup) {
        TuxTextView tuxTextViewLJFF;
        C1914170zuZ.LIZ.getClass();
        AbstractC1914420zuy abstractC1914420zuy = C1914170zuZ.LJII;
        if (abstractC1914420zuy != null && (tuxTextViewLJFF = abstractC1914420zuy.LJFF(universalPopupBlockElement, this.LIZ, this.LIZIZ)) != null) {
            viewGroup.addView(tuxTextViewLJFF);
            C786410Ut5.LJLZ(0, viewGroup);
            UniversalPopupAction universalPopupAction = this.LIZJ.action;
            if (universalPopupAction != null) {
                C786410Ut5.R6(tuxTextViewLJFF, new FrameLayout.LayoutParams(-1, -2, 8388627));
                ConstraintLayout constraintLayout = this.LJFF;
                if (constraintLayout != null) {
                    tuxTextViewLJFF.setOnTouchListener(new ATListenerS347S0200000_28(this, constraintLayout, 1));
                }
                C786410Ut5.h9(tuxTextViewLJFF, new ACListenerS130S0200000_28(this, universalPopupAction, 61));
            }
        }
    }

    public C1914550zvB(Context context, InterfaceC1914580zvE interfaceC1914580zvE, UniversalPopupBlock universalPopupBlock) {
        super(context, interfaceC1914580zvE, universalPopupBlock);
        this.LJI = new LinkedHashSet();
    }
}
