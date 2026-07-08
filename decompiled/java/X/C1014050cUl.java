package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageDataModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0cUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014050cUl extends AbstractC1014240cV4 {
    public final InterfaceC1014090cUp LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public C0FPU LLJLLL;
    public C424560Gko LLJZ;
    public LinearLayout LLJZIJLIL;
    public FrameLayout LLL;
    public SmartImageView LLLF;
    public RelativeLayout LLLFF;
    public TuxSpinner LLLFFI;
    public TuxTextView LLLFZ;
    public TuxTextView LLLI;
    public int LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public final BPEAHandler LLLIIL;
    public final ARunnableS116S0100000_16 LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public float LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public String LLLJIL;
    public final ChoreographerFrameCallbackC1014080cUo LLLJL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final IABLoadingFormatModel LJJ() {
        return (IABLoadingFormatModel) this.LLLIL.getValue();
    }

    public final void LJJI() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2 = this.LLLI;
        if ((tuxTextView2 == null || tuxTextView2.getVisibility() != 0) && (tuxTextView = this.LLLI) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView3 = this.LLLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(u.LJJ(this.LLLII, e3.d));
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        C786410Ut5.v2().removeFrameCallback(this.LLLJL);
        this.LLLIIL.removeCallbacks(this.LLLIILIL);
        this.LLLILZJ = 0.0f;
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        this.LLLJ = false;
        this.LLLII = 1;
        this.LLLIIII = false;
        TuxTextView tuxTextView = this.LLLI;
        if (tuxTextView != null) {
            tuxTextView.setText(e3.d);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        Float fValueOf;
        LinearLayout linearLayout;
        int width;
        int height;
        int width2;
        int height2;
        k kVarLJJIIZ;
        super.LJII(anoleComponentAppearModel);
        n nVar = this.LLILLJJLI.LJ;
        ViewGroup.LayoutParams layoutParams = null;
        if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("iabContainerHeightRate")) != null) {
            fValueOf = Float.valueOf(kVarLJJIIZ.LJIIJ());
        } else {
            fValueOf = null;
        }
        if (fValueOf != null && !Intrinsics.LIZLLL(fValueOf, 1.0f) && (linearLayout = this.LLJZIJLIL) != null) {
            if (linearLayout.getLayoutParams() == null) {
                LinearLayout linearLayout2 = this.LLJZIJLIL;
                if (linearLayout2 != null) {
                    ViewGroup viewGroup = this.LLJJIII;
                    if (viewGroup != null) {
                        width2 = viewGroup.getWidth();
                    } else {
                        width2 = 0;
                    }
                    ViewGroup viewGroup2 = this.LLJJIII;
                    if (viewGroup2 != null) {
                        height2 = viewGroup2.getHeight();
                    } else {
                        height2 = 0;
                    }
                    C786410Ut5.d6(linearLayout2, new ViewGroup.LayoutParams(width2, (int) (height2 * fValueOf.floatValue())));
                }
            } else {
                LinearLayout linearLayout3 = this.LLJZIJLIL;
                if (linearLayout3 != null && (layoutParams = linearLayout3.getLayoutParams()) != null) {
                    ViewGroup viewGroup3 = this.LLJJIII;
                    if (viewGroup3 != null) {
                        width = viewGroup3.getWidth();
                    } else {
                        width = 0;
                    }
                    layoutParams.width = width;
                    ViewGroup viewGroup4 = this.LLJJIII;
                    if (viewGroup4 != null) {
                        height = viewGroup4.getHeight();
                    } else {
                        height = 0;
                    }
                    layoutParams.height = (int) (height * fValueOf.floatValue());
                }
                LinearLayout linearLayout4 = this.LLJZIJLIL;
                if (linearLayout4 != null) {
                    C786410Ut5.d6(linearLayout4, layoutParams);
                }
            }
        }
        this.LLLII = 1;
        this.LLLIIII = false;
        this.LLLIIL.removeCallbacks(this.LLLIILIL);
        C786410Ut5.v2().postFrameCallback(this.LLLJL);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mk(X.AbstractC1003980cEW r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014050cUl.Mk(X.0cEW):void");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        FrameLayout frameLayout2;
        SmartImageView smartImageView;
        TuxSpinner tuxSpinner;
        RelativeLayout relativeLayout;
        C0FPU c0fpu;
        C424560Gko c424560Gko;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        String strLJIL;
        Integer numValueOf;
        LandingPageDataModel landingPageData;
        String icon;
        String str;
        String str2;
        LandingPageDataModel landingPageData2;
        List<String> geckoChannel;
        List<String> geckoChannel2;
        boolean z;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        super.Fk(viewGroup, interfaceC1014340cVE);
        String iconPath = null;
        View viewSd = C786410Ut5.Sd(R.layout.pt, C786410Ut5.ne(this.LLILZ), null);
        this.LLJJIJIL = viewSd;
        if (viewSd != null) {
            frameLayout = (FrameLayout) viewSd.findViewById(R.id.i1m);
        } else {
            frameLayout = null;
        }
        this.LLJLILLLLZIIL = frameLayout;
        View view = this.LLJJIJIL;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.jy1);
        } else {
            linearLayout = null;
        }
        this.LLJZIJLIL = linearLayout;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            frameLayout2 = (FrameLayout) view2.findViewById(R.id.u26);
        } else {
            frameLayout2 = null;
        }
        this.LLL = frameLayout2;
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            smartImageView = (SmartImageView) view3.findViewById(R.id.u25);
        } else {
            smartImageView = null;
        }
        this.LLLF = smartImageView;
        View view4 = this.LLJJIJIL;
        if (view4 != null) {
            tuxSpinner = (TuxSpinner) view4.findViewById(R.id.u27);
        } else {
            tuxSpinner = null;
        }
        this.LLLFFI = tuxSpinner;
        View view5 = this.LLJJIJIL;
        if (view5 != null) {
            relativeLayout = (RelativeLayout) view5.findViewById(R.id.u28);
        } else {
            relativeLayout = null;
        }
        this.LLLFF = relativeLayout;
        View view6 = this.LLJJIJIL;
        if (view6 != null) {
            c0fpu = (C0FPU) view6.findViewById(R.id.du0);
        } else {
            c0fpu = null;
        }
        this.LLJLLL = c0fpu;
        View view7 = this.LLJJIJIL;
        if (view7 != null) {
            c424560Gko = (C424560Gko) view7.findViewById(R.id.jxe);
        } else {
            c424560Gko = null;
        }
        this.LLJZ = c424560Gko;
        View view8 = this.LLJJIJIL;
        if (view8 != null) {
            tuxTextView = (TuxTextView) view8.findViewById(R.id.s8m);
        } else {
            tuxTextView = null;
        }
        this.LLLFZ = tuxTextView;
        View view9 = this.LLJJIJIL;
        if (view9 != null) {
            tuxTextView2 = (TuxTextView) view9.findViewById(R.id.s8n);
        } else {
            tuxTextView2 = null;
        }
        this.LLLI = tuxTextView2;
        if (LJJ() != null) {
            try {
                n nVar = this.LLILLJJLI.LJ;
                if (nVar != null && (kVarLJJIIZ2 = nVar.LJJIIZ("authorAvatar")) != null) {
                    strLJIL = kVarLJJIIZ2.LJIL();
                } else {
                    strLJIL = null;
                }
            } catch (Exception e) {
                e = e;
                strLJIL = null;
            }
            try {
                n nVar2 = this.LLILLJJLI.LJ;
                if (nVar2 != null && (kVarLJJIIZ = nVar2.LJJIIZ("isEndLayer")) != null && kVarLJJIIZ.LJ()) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLLIIIIL = z;
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
            IABLoadingFormatModel iABLoadingFormatModelLJJ = LJJ();
            if (iABLoadingFormatModelLJJ != null && (numValueOf = Integer.valueOf(iABLoadingFormatModelLJJ.getLandingFormatType())) != null) {
                if (numValueOf.intValue() == 2) {
                    LinearLayout linearLayout2 = this.LLJZIJLIL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    FrameLayout frameLayout3 = this.LLL;
                    if (frameLayout3 != null) {
                        C786410Ut5.LJZ(8, frameLayout3);
                    }
                    IABLoadingFormatModel iABLoadingFormatModelLJJ2 = LJJ();
                    if (iABLoadingFormatModelLJJ2 != null && (landingPageData = iABLoadingFormatModelLJJ2.getLandingPageData()) != null && (icon = landingPageData.getIcon()) != null && icon.length() != 0) {
                        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
                        String strDp = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).dp();
                        IABLoadingFormatModel iABLoadingFormatModelLJJ3 = LJJ();
                        if (iABLoadingFormatModelLJJ3 != null && (geckoChannel2 = iABLoadingFormatModelLJJ3.getGeckoChannel()) != null) {
                            str = (String) C13LP.LJJJLL(geckoChannel2);
                        } else {
                            str = null;
                        }
                        if (iAdWebUtils.q0(strDp, str)) {
                            C1014060cUm.LIZIZ(this, false);
                            IAdWebUtils iAdWebUtils2 = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
                            String strDp2 = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).dp();
                            IABLoadingFormatModel iABLoadingFormatModelLJJ4 = LJJ();
                            if (iABLoadingFormatModelLJJ4 != null && (geckoChannel = iABLoadingFormatModelLJJ4.getGeckoChannel()) != null) {
                                str2 = (String) C13LP.LJJJLL(geckoChannel);
                            } else {
                                str2 = null;
                            }
                            String strP0 = iAdWebUtils2.p0(strDp2, str2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strP0);
                            sbLIZ.append('/');
                            IABLoadingFormatModel iABLoadingFormatModelLJJ5 = LJJ();
                            if (iABLoadingFormatModelLJJ5 != null && (landingPageData2 = iABLoadingFormatModelLJJ5.getLandingPageData()) != null) {
                                iconPath = landingPageData2.getIconPath();
                            }
                            sbLIZ.append(iconPath);
                            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
                            c1331670kl3LJII.LJJ(this.LLJZ);
                            C1331750klB c1331750klB = new C1331750klB();
                            c1331750klB.LIZ = true;
                            c1331670kl3LJII.LJJI = new C1331730kl9(c1331750klB);
                            c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
                            C786410Ut5.h3(c1331670kl3LJII);
                            return;
                        }
                    }
                    C1014060cUm.LIZJ(this, strLJIL);
                    return;
                }
                if (numValueOf.intValue() == 4) {
                    C1014060cUm.LJ(this, strLJIL, false);
                    return;
                }
                if (numValueOf.intValue() == 5) {
                    C1014060cUm.LIZLLL(this, strLJIL, false);
                    return;
                }
                if (numValueOf.intValue() == 6) {
                    C1014060cUm.LIZJ(this, strLJIL);
                } else if (numValueOf.intValue() == 7) {
                    C1014060cUm.LJ(this, strLJIL, true);
                } else if (numValueOf.intValue() == 8) {
                    C1014060cUm.LIZLLL(this, strLJIL, true);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0cUo] */
    public C1014050cUl(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1014090cUp interfaceC1014090cUp) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1014090cUp;
        this.LLLII = 1;
        this.LLLIIL = new BPEAHandler(Looper.getMainLooper());
        this.LLLIILIL = new ARunnableS116S0100000_16(this, 207);
        this.LLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 843));
        this.LLLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA, 842));
        this.LLLJL = new Choreographer.FrameCallback() { // from class: X.0cUo
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C786410Ut5.v2().postFrameCallback(this);
                C1014050cUl c1014050cUl = this.LL;
                float f = c1014050cUl.LLLILZJ;
                if (f >= 100.0f) {
                    C1014060cUm.LIZ(c1014050cUl);
                    return;
                }
                if (c1014050cUl.LLLJ) {
                    c1014050cUl.LLLILZJ = f + 10;
                    C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                    return;
                }
                if (f < 50.0f) {
                    c1014050cUl.LLLILZJ = f + 1.0f;
                    C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                    return;
                }
                if (50.0f <= f && f <= 80.0f) {
                    if (c1014050cUl.LLLILZLLLI) {
                        c1014050cUl.LLLILZJ = f + 1.0f;
                        C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                        return;
                    } else {
                        c1014050cUl.LLLILZJ = f + 0.33333334f;
                        C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                        return;
                    }
                }
                if (80.0f > f || f > 98.0f) {
                    return;
                }
                if (c1014050cUl.LLLIZZ) {
                    c1014050cUl.LLLILZJ = f + 1.0f;
                    C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                } else {
                    c1014050cUl.LLLILZJ = f + 0.25f;
                    C1014060cUm.LJI(c1014050cUl, c1014050cUl.LLLILZJ);
                }
            }
        };
    }
}
