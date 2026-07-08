package X;

import Y.ACListenerS56S0400000_21;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.ITabletBottomControlBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395870mQb {
    public final C1591930rWp LIZ;
    public final Function0<ITabletBottomControlBar> LIZIZ;
    public InterfaceC1395860mQa LIZJ;
    public C0P0T LIZLLL;

    public final int LIZLLL() {
        Integer numValueOf = Integer.valueOf(this.LIZ.getMeasuredHeight());
        if (numValueOf.intValue() <= 0 && 0 == 0) {
            numValueOf = Integer.valueOf(this.LIZ.getHeight());
            if (numValueOf.intValue() <= 0) {
                ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
                if (layoutParams != null) {
                    Integer numValueOf2 = Integer.valueOf(layoutParams.height);
                    if (numValueOf2.intValue() > 0) {
                        return numValueOf2.intValue();
                    }
                }
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
            }
        }
        return numValueOf.intValue();
    }

    public final void LJ() {
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LIZLLL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LIZLLL) != null) {
            c0p0t.dismiss();
        }
        this.LIZLLL = null;
    }

    public final void LIZIZ() {
        LJ();
        LJ();
        C1592370rXX c1592370rXXLIZ = C1395900mQe.LIZ(this.LIZ);
        if (c1592370rXXLIZ != null) {
            c1592370rXXLIZ.LLILZLL = null;
            c1592370rXXLIZ.LLIZ = null;
            C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILLL);
            C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILZ);
            C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILLL);
            C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILZ);
        }
        InterfaceC1395860mQa interfaceC1395860mQa = this.LIZJ;
        if (interfaceC1395860mQa != null) {
            interfaceC1395860mQa.stop();
        }
        this.LIZJ = null;
    }

    public static int LJFF(View view) {
        ViewGroup viewGroup;
        int iLIZIZ;
        LinearLayout.LayoutParams layoutParams;
        if (view instanceof LinearLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return 0;
        }
        int childCount = viewGroup.getChildCount();
        int iLIZIZ2 = 0;
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getChildAt(i).getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                iLIZIZ = layoutParams.width;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            }
            iLIZIZ2 += iLIZIZ;
            if (i > 0) {
                iLIZIZ2 += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
        }
        return iLIZIZ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1395870mQb(C1591930rWp c1591930rWp, Function0<? extends ITabletBottomControlBar> function0) {
        this.LIZ = c1591930rWp;
        this.LIZIZ = function0;
    }

    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    public final View LIZ(EnumC429500Gsm enumC429500Gsm, InterfaceC1177904jB interfaceC1177904jB, InterfaceC1395860mQa interfaceC1395860mQa) {
        int i;
        int iIntValue;
        boolean z;
        int iIntValue2;
        View view;
        float f;
        int iLIZLLL;
        ?? r1 = 0;
        if (!Intrinsics.LJFF(interfaceC1177904jB, C050W.LIZ)) {
            if (interfaceC1177904jB instanceof C1177804jA) {
                C1177804jA c1177804jA = (C1177804jA) interfaceC1177904jB;
                if (!c1177804jA.LIZ.isEmpty()) {
                    if (enumC429500Gsm == EnumC429500Gsm.LEFT) {
                        i = 8388627;
                    } else {
                        i = 8388629;
                    }
                    LinearLayout linearLayout = new LinearLayout(this.LIZ.getContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(i);
                    int i2 = 0;
                    for (C1395890mQd c1395890mQd : c1177804jA.LIZ) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C1395890mQd c1395890mQd2 = c1395890mQd;
                            Context context = this.LIZ.getContext();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            if (Intrinsics.LJFF(c1395890mQd2.LIZ, "auto_scroll") && c1395890mQd2.LJFF) {
                                z = true;
                                iIntValue = -16777216;
                            } else {
                                z = false;
                            }
                            if (c1395890mQd2.LJ != null) {
                                TuxTextView tuxTextView = new TuxTextView(context, r1, 6, 0);
                                tuxTextView.setBackground(LIZJ(context, true, c1395890mQd2.LJFF, z));
                                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                                tuxTextView.setGravity(17);
                                tuxTextView.setTextColor(iIntValue);
                                tuxTextView.setMaxLines(1);
                                tuxTextView.setMinTextSize(8.0f);
                                tuxTextView.setText(c1395890mQd2.LJ);
                                view = tuxTextView;
                            } else {
                                Integer num = c1395890mQd2.LIZIZ;
                                if (num != null) {
                                    int iIntValue3 = num.intValue();
                                    int iLIZLLL2 = LIZLLL();
                                    Integer num2 = c1395890mQd2.LIZJ;
                                    if (num2 != null) {
                                        iIntValue2 = num2.intValue();
                                    } else {
                                        iIntValue2 = 24;
                                    }
                                    int iLIZIZ = (iLIZLLL2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)))) / 2;
                                    if (iLIZIZ < 0) {
                                        iLIZIZ = 0;
                                    }
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                                    tuxIconView.setBackground(LIZJ(context, false, c1395890mQd2.LJFF, z));
                                    tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                                    tuxIconView.setIconRes(iIntValue3);
                                    tuxIconView.setTintColor(iIntValue);
                                    frameLayout.addView(tuxIconView, new FrameLayout.LayoutParams(iLIZLLL2, iLIZLLL2, 17));
                                    view = frameLayout;
                                } else {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("TabletBottomControlBarControl(");
                                    sbLIZ.append(c1395890mQd2.LIZ);
                                    sbLIZ.append(") has neither iconRes nor displayText");
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    strLIZIZ.toString();
                                    throw new IllegalStateException(strLIZIZ);
                                }
                            }
                            view.setEnabled(c1395890mQd2.LJI);
                            view.setClickable(c1395890mQd2.LJI);
                            view.setFocusable(c1395890mQd2.LJI);
                            if (c1395890mQd2.LJI) {
                                f = 1.0f;
                            } else {
                                f = 0.4f;
                            }
                            C786410Ut5.T4(view, f);
                            CharSequence charSequence = c1395890mQd2.LIZLLL;
                            if (charSequence == null) {
                                charSequence = c1395890mQd2.LIZ;
                            }
                            view.setContentDescription(charSequence);
                            if (c1395890mQd2.LJI) {
                                C786410Ut5.I7(new ACListenerS56S0400000_21(c1395890mQd2, interfaceC1395860mQa, this, view, 0), view);
                            }
                            if (Intrinsics.LJFF(c1395890mQd2.LIZ, "speed")) {
                                iLIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                            } else {
                                iLIZLLL = LIZLLL();
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZLLL, LIZLLL());
                            if (i2 > 0) {
                                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                            }
                            C786410Ut5.W5(view, layoutParams);
                            linearLayout.addView(view);
                            i2 = i3;
                            r1 = 0;
                        } else {
                            C1697810uHb.LJIJI();
                            throw r1;
                        }
                    }
                    return linearLayout;
                }
            } else {
                throw new C1954807lC();
            }
        }
        return null;
    }

    public static GradientDrawable LIZJ(Context context, boolean z, boolean z2, boolean z3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iLJIIL = 0;
        if (z) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(26));
        } else {
            gradientDrawable.setShape(1);
        }
        if (z2) {
            if (z3) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                if (numLIZJ != null) {
                    iLJIIL = numLIZJ.intValue();
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, context);
                if (numLIZJ2 != null) {
                    iLJIIL = numLIZJ2.intValue();
                }
            }
        } else {
            iLJIIL = C2441009hQ.LJIIL(5066061, C814420VxA.LIZIZ(127.5f));
        }
        gradientDrawable.setColor(iLJIIL);
        return gradientDrawable;
    }
}
