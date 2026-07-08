package X;

import Y.ACListenerS147S0100000_12;
import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS618S0100000_4;
import u4.q0;

/* JADX INFO: renamed from: X.0mTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397510mTF extends AbstractDialogInterfaceC1397690mTX<C1397580mTM> {
    public static int LLJJIJIIJIL;
    public final C1397580mTM LLIZLLLIL;
    public final View LLJ;
    public final RadiusLayout LLJI;
    public final ImageView LLJIJIL;
    public final FrameLayout LLJILJIL;
    public final C1397590mTN LLJILJILJ;
    public final C1397500mTE LLJILLL;
    public final View LLJJ;
    public final C1397530mTH LLJJI;
    public boolean LLJJIII;
    public final DialogC1391080mIs LLJJIJI;

    public final AbstractC1391450mJT LJII() {
        return this.LLJJI.getAction();
    }

    public final void LJIIIIZZ() {
        FrameLayout frameLayout;
        View view;
        int i = C20094413jq.LJIIZILJ;
        RadiusLayout radiusLayout = this.LLJI;
        C1397760mTe c1397760mTe = new C1397760mTe();
        String str = this.LL.LJIJJ;
        if (str == null) {
            str = "";
        }
        c1397760mTe.LIZ = str;
        c1397760mTe.LJ = new ACListenerS155S0100000_21(this, 210);
        c1397760mTe.LJI = new AwS565S0100000_21(this, 1387);
        String str2 = this.LL.LJIJ;
        if (str2 != null) {
            c1397760mTe.LJFF = str2;
        }
        q0.LJIJ(radiusLayout, c1397760mTe.LIZ());
        this.LLJJIJI.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.0mTG
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C1397510mTF c1397510mTF = this.LL;
                DialogInterface.OnShowListener onShowListener = c1397510mTF.LLILZLL;
                if (onShowListener != null) {
                    onShowListener.onShow(c1397510mTF);
                }
                C1397510mTF c1397510mTF2 = this.LL;
                if (c1397510mTF2.LLIZLLLIL.LJIIIIZZ) {
                    FrameLayout frameLayout2 = c1397510mTF2.LLJILJIL;
                    if (frameLayout2 != null) {
                        frameLayout2.performAccessibilityAction(64, null);
                        return;
                    }
                    return;
                }
                C426750GoL.LJI(c1397510mTF2.LLJI);
            }
        });
        C1397580mTM c1397580mTM = this.LLIZLLLIL;
        if (c1397580mTM.LJIIIIZZ) {
            if (c1397580mTM.LJIIJ != null) {
                frameLayout = this.LLJILJILJ;
            } else if (c1397580mTM.LJIIJJI != null) {
                frameLayout = this.LLJILLL;
            } else if (c1397580mTM.LJIIL == null) {
                return;
            } else {
                frameLayout = this.LLJJI;
            }
            if (frameLayout != null) {
                if (!frameLayout.isFocusable()) {
                    frameLayout.setImportantForAccessibility(1);
                    frameLayout.setFocusable(false);
                }
                if (LLJJIJIIJIL != 0) {
                    view = this.LLJILJIL;
                    if (view == null) {
                        view = this.LLJI;
                    }
                } else {
                    view = this.LLJIJIL;
                    if (view == null) {
                        view = this.LLJI;
                    }
                }
                C1397760mTe c1397760mTe2 = new C1397760mTe();
                c1397760mTe2.LJIIIZ = new AwS600S0100000_21(frameLayout, 312);
                q0.LJIJ(view, c1397760mTe2.LIZ());
            }
        }
    }

    public final boolean LJIIIZ() {
        return this.LLJJIJI.isShowing();
    }

    @Override // X.AbstractDialogInterfaceC1397690mTX
    public final Dialog LIZJ() {
        return this.LLJJIJI;
    }

    public C1397510mTF(C1397580mTM c1397580mTM) {
        View viewSd;
        ImageView imageView;
        C157F c157f;
        FrameLayout frameLayout;
        InterfaceC338730DPr interfaceC338730DPr;
        InterfaceC338730DPr interfaceC338730DPr2;
        super(c1397580mTM);
        this.LLIZLLLIL = c1397580mTM;
        if (LLJJIJIIJIL != 0) {
            viewSd = C786410Ut5.Sd(R.layout.gg, C786410Ut5.ne(this.LLILLJJLI), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.gl, C786410Ut5.ne(this.LLILLJJLI), null);
        }
        this.LLJ = viewSd;
        RadiusLayout radiusLayout = (RadiusLayout) viewSd.findViewById(R.id.visual_area);
        this.LLJI = radiusLayout;
        if (LLJJIJIIJIL != 0) {
            imageView = null;
        } else {
            imageView = (ImageView) viewSd.findViewById(R.id.e1y);
        }
        this.LLJIJIL = imageView;
        if (LLJJIJIIJIL != 0) {
            c157f = null;
        } else {
            c157f = (C157F) viewSd.findViewById(R.id.bdt);
        }
        if (LLJJIJIIJIL != 0) {
            frameLayout = (FrameLayout) viewSd.findViewById(R.id.e2c);
        } else {
            frameLayout = null;
        }
        this.LLJILJIL = frameLayout;
        C338760DPu c338760DPu = (C338760DPu) viewSd.findViewById(R.id.tsc);
        C458880Hz4 c458880Hz4 = (C458880Hz4) viewSd.findViewById(R.id.yap);
        C1397590mTN c1397590mTN = (C1397590mTN) viewSd.findViewById(R.id.dc7);
        this.LLJILJILJ = c1397590mTN;
        C1397500mTE c1397500mTE = (C1397500mTE) viewSd.findViewById(R.id.a0f);
        this.LLJILLL = c1397500mTE;
        View viewFindViewById = LLJJIJIIJIL != 0 ? viewSd.findViewById(R.id.fz3) : null;
        this.LLJJ = viewFindViewById;
        C1397530mTH c1397530mTH = (C1397530mTH) viewSd.findViewById(R.id.a13);
        this.LLJJI = c1397530mTH;
        float fLIZIZ = C418440Gaw.LIZIZ(14);
        float fLIZIZ2 = C418440Gaw.LIZIZ(22);
        this.LLJJIII = c1397580mTM.LJII;
        this.LLJJIJI = new DialogC1391080mIs(this, viewSd, radiusLayout);
        if (LLJJIJIIJIL != 0) {
            if (c1397580mTM.LJIILIIL == 1) {
                interfaceC338730DPr2 = new InterfaceC338730DPr() { // from class: X.0DPn
                    public final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                    public final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    public final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
                    public final float LIZLLL = 0.8f;
                    public final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));

                    @Override // X.InterfaceC338730DPr
                    public final void LIZIZ(int i, int i2, C338760DPu c338760DPu2, AwS618S0100000_4 awS618S0100000_4) {
                        int measuredWidth;
                        int i3;
                        awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                        View childAt = c338760DPu2.getChildAt(0);
                        if (c338760DPu2.getMeasuredWidth() > this.LIZ + this.LIZIZ) {
                            measuredWidth = c338760DPu2.getMeasuredWidth();
                            i3 = this.LIZIZ * 2;
                        } else {
                            measuredWidth = c338760DPu2.getMeasuredWidth();
                            i3 = this.LIZIZ;
                        }
                        int i4 = measuredWidth - i3;
                        int i5 = this.LIZJ;
                        if (i4 > i5) {
                            i4 = i5;
                        }
                        int iMin = Math.min((int) (c338760DPu2.getMeasuredHeight() * this.LIZLLL), this.LJ);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                        if (C1397510mTF.LLJJIJIIJIL != 0) {
                            childAt.measure(iMakeMeasureSpec, c338760DPu2.getMeasuredHeight());
                        } else {
                            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                    }

                    @Override // X.InterfaceC338730DPr
                    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu2, C346580DiK c346580DiK) {
                        C338720DPq.LIZ(c338760DPu2.getChildAt(0), i, i2, i3, i4);
                    }
                };
            } else {
                interfaceC338730DPr2 = new InterfaceC338730DPr() { // from class: X.0DPm
                    public final int LIZ;
                    public final float LIZIZ;
                    public final int LIZJ;
                    public final int LIZLLL;
                    public final int LJ;

                    {
                        int iLIZIZ = C1397510mTF.LLJJIJIIJIL != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(302)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                        this.LIZ = iLIZIZ;
                        this.LIZIZ = 0.8f;
                        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        this.LIZLLL = iLIZIZ2;
                        this.LJ = iLIZIZ + iLIZIZ2;
                    }

                    @Override // X.InterfaceC338730DPr
                    public final void LIZIZ(int i, int i2, C338760DPu c338760DPu2, AwS618S0100000_4 awS618S0100000_4) {
                        int measuredWidth;
                        awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                        View childAt = c338760DPu2.getChildAt(0);
                        if (c338760DPu2.getMeasuredWidth() > this.LJ) {
                            measuredWidth = this.LIZ;
                        } else {
                            measuredWidth = c338760DPu2.getMeasuredWidth() - this.LIZLLL;
                        }
                        int iMin = Math.min((int) (c338760DPu2.getMeasuredHeight() * this.LIZIZ), this.LIZJ);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                        if (C1397510mTF.LLJJIJIIJIL != 0) {
                            childAt.measure(iMakeMeasureSpec, c338760DPu2.getMeasuredHeight());
                        } else {
                            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                    }

                    @Override // X.InterfaceC338730DPr
                    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu2, C346580DiK c346580DiK) {
                        C338720DPq.LIZ(c338760DPu2.getChildAt(0), i, i2, i3, i4);
                    }
                };
            }
            c338760DPu.setConstraints(interfaceC338730DPr2);
            if (c1397580mTM.LJIIIIZZ) {
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                    C786410Ut5.O7(frameLayout, new ACListenerS147S0100000_12(this, 377));
                }
            } else if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            radiusLayout.setBackgroundColor(this.LL.LJIILIIL);
            float f = 0.0f;
            if (c1397580mTM.LJIIL == null) {
                float f2 = this.LL.LJII;
                if (fLIZIZ >= 0.0f) {
                    float f3 = fLIZIZ + f2;
                    if (f3 >= 0.0f) {
                        f = f3;
                    }
                }
            } else {
                float f4 = this.LL.LJIIIIZZ;
                if (fLIZIZ2 >= 0.0f) {
                    float f5 = fLIZIZ2 + f4;
                    if (f5 >= 0.0f) {
                        f = f5;
                    }
                }
            }
            radiusLayout.setRadius(f);
            if (c1397580mTM.LJIIL == null) {
                C426750GoL.LJIIIZ(c1397530mTH, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 16);
            }
            if (c1397580mTM.LJIIJJI instanceof C1391410mJP) {
                C426750GoL.LJIIIZ(c1397500mTE, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            }
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(this.LL.LJIILL);
                viewFindViewById.setBackground(c384050F3z.LIZ(this.LLILLJJLI));
            }
            c458880Hz4.setShowCloseButton$tux_theme_release(c1397580mTM.LJIIIIZZ);
            AbstractC1391830mK5 abstractC1391830mK5 = c1397580mTM.LJIIIZ;
            if (abstractC1391830mK5 == null) {
                c458880Hz4.LIZ();
            } else {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c458880Hz4, null);
                c458880Hz4.removeAllViews();
                abstractC1391830mK5.LIZJ = this;
                c458880Hz4.addView(abstractC1391830mK5.LIZIZ());
            }
            AbstractC1397560mTK abstractC1397560mTK = c1397580mTM.LJIIJ;
            c1397590mTN.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1397590mTN, null);
            c1397590mTN.removeAllViews();
            if (abstractC1397560mTK != null) {
                abstractC1397560mTK.LIZJ = this;
                c1397590mTN.addView(abstractC1397560mTK.LIZIZ());
            }
            c1397500mTE.LIZ(this, c1397580mTM.LJIIJJI);
            AbstractC1391450mJT abstractC1391450mJT = c1397580mTM.LJIIL;
            c1397530mTH.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1397530mTH, null);
            c1397530mTH.removeAllViews();
            c1397530mTH.LL = abstractC1391450mJT;
            if (abstractC1391450mJT != null) {
                abstractC1391450mJT.LIZ(this);
                c1397530mTH.addView(abstractC1391450mJT.LIZIZ());
            }
            LIZ();
            LJFF(c1397580mTM.LJII);
            LJIIIIZZ();
            return;
        }
        if (c1397580mTM.LJIILIIL == 1) {
            interfaceC338730DPr = new InterfaceC338730DPr() { // from class: X.0DPn
                public final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                public final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                public final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
                public final float LIZLLL = 0.8f;
                public final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));

                @Override // X.InterfaceC338730DPr
                public final void LIZIZ(int i, int i2, C338760DPu c338760DPu2, AwS618S0100000_4 awS618S0100000_4) {
                    int measuredWidth;
                    int i3;
                    awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                    View childAt = c338760DPu2.getChildAt(0);
                    if (c338760DPu2.getMeasuredWidth() > this.LIZ + this.LIZIZ) {
                        measuredWidth = c338760DPu2.getMeasuredWidth();
                        i3 = this.LIZIZ * 2;
                    } else {
                        measuredWidth = c338760DPu2.getMeasuredWidth();
                        i3 = this.LIZIZ;
                    }
                    int i4 = measuredWidth - i3;
                    int i5 = this.LIZJ;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                    int iMin = Math.min((int) (c338760DPu2.getMeasuredHeight() * this.LIZLLL), this.LJ);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                    if (C1397510mTF.LLJJIJIIJIL != 0) {
                        childAt.measure(iMakeMeasureSpec, c338760DPu2.getMeasuredHeight());
                    } else {
                        childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                }

                @Override // X.InterfaceC338730DPr
                public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu2, C346580DiK c346580DiK) {
                    C338720DPq.LIZ(c338760DPu2.getChildAt(0), i, i2, i3, i4);
                }
            };
        } else {
            interfaceC338730DPr = new InterfaceC338730DPr() { // from class: X.0DPm
                public final int LIZ;
                public final float LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;
                public final int LJ;

                {
                    int iLIZIZ = C1397510mTF.LLJJIJIIJIL != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(302)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
                    this.LIZ = iLIZIZ;
                    this.LIZIZ = 0.8f;
                    this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    this.LIZLLL = iLIZIZ2;
                    this.LJ = iLIZIZ + iLIZIZ2;
                }

                @Override // X.InterfaceC338730DPr
                public final void LIZIZ(int i, int i2, C338760DPu c338760DPu2, AwS618S0100000_4 awS618S0100000_4) {
                    int measuredWidth;
                    awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                    View childAt = c338760DPu2.getChildAt(0);
                    if (c338760DPu2.getMeasuredWidth() > this.LJ) {
                        measuredWidth = this.LIZ;
                    } else {
                        measuredWidth = c338760DPu2.getMeasuredWidth() - this.LIZLLL;
                    }
                    int iMin = Math.min((int) (c338760DPu2.getMeasuredHeight() * this.LIZIZ), this.LIZJ);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                    if (C1397510mTF.LLJJIJIIJIL != 0) {
                        childAt.measure(iMakeMeasureSpec, c338760DPu2.getMeasuredHeight());
                    } else {
                        childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                }

                @Override // X.InterfaceC338730DPr
                public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu2, C346580DiK c346580DiK) {
                    C338720DPq.LIZ(c338760DPu2.getChildAt(0), i, i2, i3, i4);
                }
            };
        }
        c338760DPu.setConstraints(interfaceC338730DPr);
        if (c1397580mTM.LJIIIIZZ) {
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            C1397600mTO c1397600mTO = this.LL;
            c419910GdJ.LIZ = c1397600mTO.LJIJI;
            c419910GdJ.LIZLLL = Integer.valueOf(c1397600mTO.LJIILJJIL);
            final TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLILLJJLI);
            if (imageView != null) {
                imageView.setImageDrawable(tuxIconDrawableLIZ);
                C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 378));
            }
            if (c157f != null) {
                int visibility = c157f.getVisibility();
                c157f.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c157f);
                c157f.setAutoDarkListener(new C157D() { // from class: X.0mRI
                    @Override // X.C157D
                    public final void LIZ() {
                    }

                    @Override // X.C157D
                    public final void LIZIZ(boolean z) {
                        TypedArray typedArrayObtainStyledAttributes = C1388190mED.LJ(C1388190mED.LIZJ(this.LIZ.LLILLJJLI, z), this.LIZ.LLILLJJLI).obtainStyledAttributes(null, R$styleable.TuxDialog, R.attr.xt, 0);
                        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxDialog__tux_dialog_colorCloseButtonNormal, 0);
                        typedArrayObtainStyledAttributes.recycle();
                        tuxIconDrawableLIZ.LJFF(color);
                    }
                });
                c157f.LLILZIL = true;
            }
        } else {
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            if (c157f != null) {
                int visibility2 = c157f.getVisibility();
                c157f.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c157f);
            }
        }
        radiusLayout.setBackgroundColor(this.LL.LJIILIIL);
        radiusLayout.setRadius(this.LL.LJI);
        AbstractC1391830mK5 abstractC1391830mK52 = c1397580mTM.LJIIIZ;
        if (abstractC1391830mK52 == null) {
            c458880Hz4.LIZ();
        } else {
            c458880Hz4.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c458880Hz4, null);
            c458880Hz4.removeAllViews();
            abstractC1391830mK52.LIZJ = this;
            c458880Hz4.addView(abstractC1391830mK52.LIZIZ());
        }
        AbstractC1397560mTK abstractC1397560mTK2 = c1397580mTM.LJIIJ;
        c1397590mTN.getClass();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1397590mTN, null);
        c1397590mTN.removeAllViews();
        if (abstractC1397560mTK2 != null) {
            abstractC1397560mTK2.LIZJ = this;
            c1397590mTN.addView(abstractC1397560mTK2.LIZIZ());
        }
        c1397500mTE.LIZ(this, c1397580mTM.LJIIJJI);
        AbstractC1391450mJT abstractC1391450mJT2 = c1397580mTM.LJIIL;
        c1397530mTH.getClass();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1397530mTH, null);
        c1397530mTH.removeAllViews();
        c1397530mTH.LL = abstractC1391450mJT2;
        if (abstractC1391450mJT2 != null) {
            abstractC1391450mJT2.LIZ(this);
            c1397530mTH.addView(abstractC1391450mJT2.LIZIZ());
        }
        LIZ();
        LJFF(c1397580mTM.LJII);
        LJIIIIZZ();
    }

    public final void LJFF(boolean z) {
        if (z) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 209), this.LLJ);
        } else {
            C786410Ut5.I7(null, this.LLJ);
        }
        this.LLJJIJI.setCancelable(z);
    }

    public final <T extends View> T LJI(int i) {
        return (T) this.LLJJIJI.findViewById(i);
    }
}
