package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SKL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKL implements InterfaceC690260R5s {
    public static final C0SKL LIZ = new C0SKL();

    public static boolean LIZ(int i) {
        return i == 150 || i == 501 || i == 40 || i == 24 || i == 14 || i == 15 || i == 15 || i == 16;
    }

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    public static boolean LIZIZ(Integer num) {
        int iLIZIZ;
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIIIIZZ(null)) {
            return true;
        }
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C1389340mG4.LIZJ(null, null).LIZIZ();
        }
        if (iLIZIZ < 500) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC690260R5s
    public final void LJJII(ViewGroup viewGroup) {
        viewGroup.getLayoutParams().width = LLJZIJLIL(0, viewGroup);
        viewGroup.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), 0, 0, 0);
    }

    @Override // X.InterfaceC690260R5s
    public final void LLIIII(ViewGroup viewGroup, AwS590S0100000_11 awS590S0100000_11) {
        awS590S0100000_11.invoke(Integer.valueOf(LLJZIJLIL(20, viewGroup)));
    }

    @Override // X.InterfaceC690260R5s
    public final int LLJZIJLIL(int i, ViewGroup viewGroup) {
        Activity activityLIZ;
        Context context = viewGroup.getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return -1;
        }
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activityLIZ, null);
        int iLIZIZ = c1389350mG5LIZJ.LIZIZ();
        int iLIZ = c1389350mG5LIZJ.LIZ();
        if (iLIZIZ < iLIZ) {
            iLIZIZ = iLIZ;
        }
        return (int) (((double) context.getResources().getDisplayMetrics().density) * (C13LZ.LIZJ(((double) iLIZIZ) * 0.3d, 275.0d, 375.0d) - ((double) i)));
    }

    @Override // X.InterfaceC690260R5s
    public final void LJJLIIIJL(View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (!((Boolean) C0AVO.LIZ.getValue()).booleanValue() && z2 && view != null) {
            if (z) {
                C337180DJs.LIZ(view);
                C337180DJs.LIZJ(view);
                return;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            viewGroup.addView(view);
        }
    }

    @Override // X.InterfaceC690260R5s
    public final void LJIJ(ViewGroup viewGroup, int i, Boolean bool, Integer num) {
        Context context;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int iLIZIZ2;
        if (LIZ(i)) {
            return;
        }
        C20593115i5.LIZ.getClass();
        if (!C20593115i5.LJIIIIZZ(null) && viewGroup != null && (context = viewGroup.getContext()) != null) {
            if (num != null) {
                iLIZIZ = num.intValue();
            } else {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ == null) {
                    return;
                } else {
                    iLIZIZ = C1389340mG4.LIZJ(activityLIZ, null).LIZIZ();
                }
            }
            if (LIZIZ(Integer.valueOf(iLIZIZ)) && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLIZIZ3 = 0;
                if (Build.VERSION.SDK_INT >= 35) {
                    C0IKF.LIZ.getClass();
                    i2 = C465320IMo.LIZ().LIZIZ(viewGroup.getContext()).LIZIZ.LIZ(2).LIZLLL;
                } else {
                    i2 = 0;
                }
                if (LIZIZ(Integer.valueOf(iLIZIZ))) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
                int i3 = iLIZIZ2 + i2;
                if (!LIZIZ(Integer.valueOf(iLIZIZ))) {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                }
                if (marginLayoutParams.bottomMargin != i3 || marginLayoutParams.leftMargin != iLIZIZ3) {
                    marginLayoutParams.bottomMargin = i3;
                    marginLayoutParams.setMarginStart(iLIZIZ3);
                    C786410Ut5.X5(marginLayoutParams, viewGroup);
                }
            }
        }
    }

    @Override // X.InterfaceC690260R5s
    public final void LJJIIZ(ViewGroup viewGroup, int i, Integer num, Integer num2) {
        if (viewGroup != null) {
            C0SKL c0skl = LIZ;
            c0skl.LJLZ(viewGroup, i, Boolean.TRUE, num, num2);
            c0skl.LJIJ(viewGroup, i, Boolean.TRUE, num);
        }
    }

    @Override // X.InterfaceC690260R5s
    public final AbstractC726740Sf2 LLLLIILL(Aweme aweme, final View view, final View view2, final View view3) {
        if (C735370Ssx.LJJIJIL(aweme)) {
            return new AbstractC726740Sf2(view, view2, view3) { // from class: X.0Sf3
                public float LJII;
                public float LJIIIIZZ;
                public boolean LJIIIZ;

                @Override // X.AbstractC726740Sf2
                public final void LIZIZ(float f, float f2) {
                    View view4;
                    float f3;
                    float f4;
                    View view5;
                    View view6;
                    if (!this.LJIIIZ && (view5 = this.LIZ) != null && (view6 = this.LIZJ) != null) {
                        this.LJIIIZ = true;
                        int width = view5.getWidth();
                        int width2 = view6.getWidth();
                        this.LJII = width;
                        this.LJIIIIZZ = width2 / 2.0f;
                    }
                    View view7 = this.LIZ;
                    if (view7 == null || (view4 = this.LIZJ) == null) {
                        return;
                    }
                    int width3 = view4.getWidth();
                    float f5 = this.LJII;
                    if (f5 > 0.0f && f2 > 0.0f) {
                        float f6 = width3;
                        float f7 = f6 - (f2 * 1.0f);
                        float f8 = f7 / f5;
                        float f9 = this.LJIIIIZZ;
                        float f10 = 1;
                        float f11 = (f9 + (((f6 / 2.0f) - f9) * (f10 - f8))) - (f7 / 2.0f);
                        if (C726770Sf5.LIZ(view7.getContext())) {
                            f3 = ((f - (2.0f * f2)) / f2) * (-1.0f);
                        } else {
                            f3 = f / f2;
                        }
                        float f12 = ((f8 - f10) * f3) + 1.0f;
                        float fLIZ = LIZ() - ((LIZ() + f11) * f3);
                        C786410Ut5.Ob(view7, f12);
                        C786410Ut5.pc(view7, f12);
                        if (C726770Sf5.LIZ(view7.getContext())) {
                            f4 = -fLIZ;
                        } else {
                            f4 = fLIZ;
                        }
                        C786410Ut5.Jc(view7, f4);
                        View view8 = this.LIZIZ;
                        if (view8 != null) {
                            C786410Ut5.Ob(view8, f12);
                            C786410Ut5.pc(view8, f12);
                            if (C726770Sf5.LIZ(view7.getContext())) {
                                fLIZ = -fLIZ;
                            }
                            C786410Ut5.Jc(view8, fLIZ);
                        }
                    }
                }
            };
        }
        return new AbstractC726740Sf2(view, view2, view3) { // from class: X.0Sf4
            public boolean LJII;
            public float LJIIIIZZ;

            @Override // X.AbstractC726740Sf2
            public final void LIZIZ(float f, float f2) {
                View view4;
                float f3;
                float f4;
                View view5;
                View view6;
                if (!this.LJII && (view5 = this.LIZ) != null && (view6 = this.LIZJ) != null) {
                    this.LJII = true;
                    int width = view5.getWidth();
                    view6.getWidth();
                    this.LJIIIIZZ = width;
                }
                View view7 = this.LIZ;
                if (view7 == null || (view4 = this.LIZJ) == null) {
                    return;
                }
                view4.getWidth();
                if (this.LJIIIIZZ > 0.0f && f2 > 0.0f) {
                    float f5 = f2 / 2.0f;
                    if (C726770Sf5.LIZ(view7.getContext())) {
                        f3 = ((f - (2.0f * f2)) / f2) * (-1.0f);
                    } else {
                        f3 = f / f2;
                    }
                    float fLIZ = LIZ() - ((LIZ() + f5) * f3);
                    if (C726770Sf5.LIZ(view7.getContext())) {
                        f4 = -fLIZ;
                    } else {
                        f4 = fLIZ;
                    }
                    C786410Ut5.Jc(view7, f4);
                    View view8 = this.LIZIZ;
                    if (view8 != null) {
                        if (C726770Sf5.LIZ(view7.getContext())) {
                            fLIZ = -fLIZ;
                        }
                        C786410Ut5.Jc(view8, fLIZ);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC690260R5s
    public final Integer LJJJIL(Context context, int i, Boolean bool, Integer num, Integer num2) {
        int iLIZIZ;
        int iLIZ;
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        DisplayMetrics displayMetrics3;
        if (context == null) {
            return null;
        }
        if (LIZ(i)) {
            Resources resources = context.getResources();
            if (resources == null || (displayMetrics3 = resources.getDisplayMetrics()) == null) {
                return null;
            }
            return Integer.valueOf(displayMetrics3.widthPixels);
        }
        if (num != null && num2 != null) {
            iLIZIZ = num.intValue();
            iLIZ = num2.intValue();
        } else {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ == null) {
                return null;
            }
            C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activityLIZ, null);
            iLIZIZ = c1389350mG5LIZJ.LIZIZ();
            iLIZ = c1389350mG5LIZJ.LIZ();
        }
        if (LIZIZ(Integer.valueOf(iLIZIZ)) && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            Resources resources2 = context.getResources();
            if (resources2 == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) {
                return null;
            }
            return Integer.valueOf(displayMetrics2.widthPixels);
        }
        if (LIZIZ(Integer.valueOf(iLIZIZ))) {
            Resources resources3 = context.getResources();
            if (resources3 == null || (displayMetrics = resources3.getDisplayMetrics()) == null) {
                return null;
            }
            return Integer.valueOf(displayMetrics.widthPixels);
        }
        if (iLIZIZ < iLIZ) {
            iLIZIZ = iLIZ;
        }
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((int) C13LZ.LIZJ(((double) iLIZIZ) * 0.3d, 275.0d, 375.0d)))));
    }

    @Override // X.InterfaceC690260R5s
    public final void LJLZ(ViewGroup viewGroup, int i, Boolean bool, Integer num, Integer num2) {
        Context context;
        int iLIZIZ;
        int iLIZ;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        if (LIZ(i) || (context = viewGroup.getContext()) == null) {
            return;
        }
        if (num != null && num2 != null) {
            iLIZIZ = num.intValue();
            iLIZ = num2.intValue();
        } else {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ == null) {
                return;
            }
            C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activityLIZ, null);
            iLIZIZ = c1389350mG5LIZJ.LIZIZ();
            iLIZ = c1389350mG5LIZJ.LIZ();
        }
        if ((LIZIZ(Integer.valueOf(iLIZIZ)) && !Intrinsics.LJFF(bool, Boolean.TRUE)) || (layoutParams = viewGroup.getLayoutParams()) == null) {
            return;
        }
        if (LIZIZ(Integer.valueOf(iLIZIZ))) {
            layoutParams.width = -1;
        } else {
            if (iLIZIZ < iLIZ) {
                i2 = iLIZ;
            } else {
                i2 = iLIZIZ;
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C13LZ.LIZJ(((double) i2) * 0.3d, 275.0d, 375.0d))));
        }
        C786410Ut5.X5(layoutParams, viewGroup);
        LJLLLL((ViewGroup) viewGroup.findViewById(R.id.ubh), (SmartImageView) viewGroup.findViewById(R.id.sat), (TuxTextView) viewGroup.findViewById(R.id.saw), viewGroup.findViewById(R.id.u9z), i, bool, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZ));
    }

    @Override // X.InterfaceC690260R5s
    public final void LJLLLL(ViewGroup viewGroup, SmartImageView smartImageView, TuxTextView tuxTextView, View view, int i, Boolean bool, Integer num, Integer num2) {
        Context context;
        int iLIZIZ;
        int iLIZ;
        C1CRC c1crc;
        int width;
        int width2;
        if (!LIZ(i) && viewGroup != null && (context = viewGroup.getContext()) != null) {
            if (num != null && num2 != null) {
                iLIZIZ = num.intValue();
                iLIZ = num2.intValue();
            } else {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ == null) {
                    return;
                }
                C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activityLIZ, null);
                iLIZIZ = c1389350mG5LIZJ.LIZIZ();
                iLIZ = c1389350mG5LIZJ.LIZ();
            }
            if (LIZIZ(Integer.valueOf(iLIZIZ)) && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C1CRC) && (c1crc = (C1CRC) layoutParams) != null) {
                int width3 = 0;
                if (smartImageView != null) {
                    width = smartImageView.getWidth();
                } else {
                    width = 0;
                }
                if (tuxTextView != null) {
                    width2 = tuxTextView.getWidth();
                } else {
                    width2 = 0;
                }
                if (view != null) {
                    width3 = view.getWidth();
                }
                if (LIZIZ(Integer.valueOf(iLIZIZ))) {
                    c1crc.LJI = C2230281CQw.LIZ(context, "screen.width-12dp-" + width + '-' + width2 + '-' + width3 + "-12dp", "layout_width");
                } else {
                    if (iLIZIZ < iLIZ) {
                        iLIZIZ = iLIZ;
                    }
                    double dLIZJ = C13LZ.LIZJ(((double) iLIZIZ) * 0.3d, 275.0d, 375.0d);
                    if (((Boolean) C07AO.LIZ.getValue()).booleanValue()) {
                        c1crc.LJI = C2230281CQw.LIZ(context, ((int) dLIZJ) + "dp-12dp-" + context.getResources().getResourceEntryName(R.id.sat) + ".width-" + context.getResources().getResourceEntryName(R.id.saw) + ".width-" + context.getResources().getResourceEntryName(R.id.u9z) + ".width-12dp", "layout_width");
                    } else {
                        c1crc.LJI = C2230281CQw.LIZ(context, ((int) dLIZJ) + "dp-12dp-" + width + '-' + width2 + '-' + width3 + "-12dp", "layout_width");
                    }
                }
                C786410Ut5.X5(c1crc, viewGroup);
            }
        }
    }
}
