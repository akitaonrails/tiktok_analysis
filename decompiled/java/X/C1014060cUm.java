package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS21S1100000_16;
import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.commercialize.model.IABLoadingFormatModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageDataModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.experiment.IABLoadingFormatOptConfigExp;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014060cUm {
    public static final void LIZ(C1014050cUl c1014050cUl) {
        c1014050cUl.LLLILZJ = 0.0f;
        C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS116S0100000_16(c1014050cUl, 208));
        C786410Ut5.v2().removeFrameCallback(c1014050cUl.LLLJL);
    }

    public static final void LJFF(C1014050cUl c1014050cUl) {
        LandingPageDataModel landingPageData;
        String loadingFormatCdn;
        IABLoadingFormatModel iABLoadingFormatModelLJJ = c1014050cUl.LJJ();
        if (iABLoadingFormatModelLJJ != null && (landingPageData = iABLoadingFormatModelLJJ.getLandingPageData()) != null && (loadingFormatCdn = landingPageData.getLoadingFormatCdn()) != null && C123100dR.LIZ(loadingFormatCdn)) {
            InterfaceC1014090cUp interfaceC1014090cUp = c1014050cUl.LLJLIL;
            if (interfaceC1014090cUp != null) {
                interfaceC1014090cUp.LIZLLL(1);
                return;
            }
            return;
        }
        InterfaceC1014090cUp interfaceC1014090cUp2 = c1014050cUl.LLJLIL;
        if (interfaceC1014090cUp2 == null) {
            return;
        }
        interfaceC1014090cUp2.LIZLLL(0);
    }

    public static final void LIZIZ(C1014050cUl c1014050cUl, boolean z) {
        Context context;
        Integer numLIZJ;
        IABLoadingFormatModel iABLoadingFormatModelLJJ;
        LandingPageDataModel landingPageData;
        String iconColor;
        LandingPageDataModel landingPageData2;
        String iconColor2;
        Context context2;
        Integer numLIZJ2;
        if (!z && (iABLoadingFormatModelLJJ = c1014050cUl.LJJ()) != null && (landingPageData = iABLoadingFormatModelLJJ.getLandingPageData()) != null && (iconColor = landingPageData.getIconColor()) != null && iconColor.length() != 0) {
            IABLoadingFormatModel iABLoadingFormatModelLJJ2 = c1014050cUl.LJJ();
            if (iABLoadingFormatModelLJJ2 != null && (landingPageData2 = iABLoadingFormatModelLJJ2.getLandingPageData()) != null && (iconColor2 = landingPageData2.getIconColor()) != null) {
                try {
                    C0FPU c0fpu = c1014050cUl.LLJLLL;
                    if (c0fpu != null) {
                        c0fpu.setAboveColor(Color.parseColor(iconColor2));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0FPU c0fpu2 = c1014050cUl.LLJLLL;
                    if (c0fpu2 != null && (context2 = c0fpu2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, context2)) != null) {
                        int iIntValue = numLIZJ2.intValue();
                        C0FPU c0fpu3 = c1014050cUl.LLJLLL;
                        if (c0fpu3 != null) {
                            c0fpu3.setAboveColor(iIntValue);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        C0FPU c0fpu4 = c1014050cUl.LLJLLL;
        if (c0fpu4 != null && (context = c0fpu4.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context)) != null) {
            int iIntValue2 = numLIZJ.intValue();
            C0FPU c0fpu5 = c1014050cUl.LLJLLL;
            if (c0fpu5 != null) {
                c0fpu5.setAboveColor(iIntValue2);
            }
        }
    }

    public static final void LIZJ(C1014050cUl c1014050cUl, String str) {
        Context context;
        int i;
        FrameLayout frameLayout = c1014050cUl.LLJLILLLLZIIL;
        if (frameLayout != null && (context = frameLayout.getContext()) != null) {
            IABLoadingFormatOptConfigExp.IABLoadingFormatOptConfig iABLoadingFormatOptConfigLIZ = IABLoadingFormatOptConfigExp.LIZ();
            if (iABLoadingFormatOptConfigLIZ != null && iABLoadingFormatOptConfigLIZ.optIcon) {
                i = R.attr.uk;
            } else {
                i = R.attr.a1b;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                FrameLayout frameLayout2 = c1014050cUl.LLJLILLLLZIIL;
                if (frameLayout2 != null) {
                    frameLayout2.setBackgroundColor(iIntValue);
                }
            }
        }
        LinearLayout linearLayout = c1014050cUl.LLJZIJLIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        LinearLayout linearLayout2 = c1014050cUl.LLJZIJLIL;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS151S0100000_16(c1014050cUl, 127));
        }
        FrameLayout frameLayout3 = c1014050cUl.LLL;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
        LIZIZ(c1014050cUl, true);
        if (C123100dR.LIZ(str)) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(c1014050cUl.LLJZ);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public static final void LJI(C1014050cUl c1014050cUl, float f) {
        boolean z;
        String strLJJIFFI;
        Context context;
        String string;
        String strLJJIFFI2;
        InterfaceC1014090cUp interfaceC1014090cUp;
        RelativeLayout relativeLayout;
        ViewGroup.LayoutParams layoutParams;
        int width;
        int height;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView;
        String string2;
        Context context2;
        C0FPU c0fpu = c1014050cUl.LLJLLL;
        if (c0fpu != null) {
            c0fpu.setProgress(f);
        }
        IABLoadingFormatOptConfigExp.IABLoadingFormatOptConfig iABLoadingFormatOptConfigLIZ = IABLoadingFormatOptConfigExp.LIZ();
        if (iABLoadingFormatOptConfigLIZ != null && iABLoadingFormatOptConfigLIZ.optIcon) {
            z = true;
        } else {
            z = false;
        }
        int i = 100;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!z) {
            TuxTextView tuxTextView2 = c1014050cUl.LLLI;
            if ((tuxTextView2 == null || tuxTextView2.getVisibility() != 8) && (tuxTextView = c1014050cUl.LLLI) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            if (f <= 100.0f) {
                i = (int) f;
            }
            TuxTextView tuxTextView3 = c1014050cUl.LLLFZ;
            if (tuxTextView3 != null && (context2 = tuxTextView3.getContext()) != null) {
                string2 = context2.getString(2131836765, Integer.valueOf(i));
            } else {
                string2 = null;
            }
            TuxTextView tuxTextView4 = c1014050cUl.LLLFZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(string2);
            }
        } else {
            if (f <= 100.0f) {
                i = (int) f;
            }
            TuxTextView tuxTextView5 = c1014050cUl.LLLFZ;
            if (tuxTextView5 != null && (context = tuxTextView5.getContext()) != null && (string = context.getString(2131836765, Integer.valueOf(i))) != null && (strLJJIFFI2 = u.LJJIFFI(string, "…", "", false)) != null) {
                strLJJIFFI = u.LJJIFFI(strLJJIFFI2, "...", "", false);
            } else {
                strLJJIFFI = null;
            }
            TuxTextView tuxTextView6 = c1014050cUl.LLLFZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(strLJJIFFI);
            }
            if (!c1014050cUl.LLLIIII) {
                c1014050cUl.LLLIIII = true;
                c1014050cUl.LLLII = 1;
                c1014050cUl.LJJI();
                c1014050cUl.LLLIIL.removeCallbacks(c1014050cUl.LLLIILIL);
                C786410Ut5.LJJZZIII(c1014050cUl.LLLIIL, c1014050cUl.LLLIILIL);
            }
        }
        if (c1014050cUl.LLJLL == 0) {
            FrameLayout frameLayout = c1014050cUl.LLJLILLLLZIIL;
            if (frameLayout != null) {
                height = frameLayout.getHeight();
            } else {
                height = 0;
            }
            c1014050cUl.LLJLL = height;
            TuxSpinner tuxSpinner = c1014050cUl.LLLFFI;
            if (tuxSpinner != null) {
                layoutParams2 = tuxSpinner.getLayoutParams();
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.bottomMargin = (int) (((((double) c1014050cUl.LLJLL) * 0.216d) - ((double) C1041450dCx.LIZIZ(24.0f, c1014050cUl.LLILZ))) / ((double) 2));
            }
        }
        if (f <= 98.0f && !c1014050cUl.LLLJ) {
            double d = 100.0f;
            c1014050cUl.LLJLLIL = (int) (((d - (((double) f) * 0.8d)) * ((double) c1014050cUl.LLJLL)) / d);
        }
        RelativeLayout relativeLayout2 = c1014050cUl.LLLFF;
        if (relativeLayout2 != null && (layoutParams = relativeLayout2.getLayoutParams()) != null) {
            layoutParams.height = c1014050cUl.LLJLLIL;
            ViewGroup viewGroup = c1014050cUl.LLJJIII;
            if (viewGroup != null) {
                width = viewGroup.getWidth();
            } else {
                width = 0;
            }
            layoutParams.width = width;
            RelativeLayout relativeLayout3 = c1014050cUl.LLLFF;
            if (relativeLayout3 != null) {
                C786410Ut5.e6(relativeLayout3, layoutParams);
            }
        }
        if (c1014050cUl.LLLJ && (relativeLayout = c1014050cUl.LLLFF) != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
        if (f > 98.0f && !c1014050cUl.LLLJ) {
            InterfaceC1014090cUp interfaceC1014090cUp2 = c1014050cUl.LLJLIL;
            if (interfaceC1014090cUp2 != null) {
                interfaceC1014090cUp2.LIZIZ();
            }
            TuxSpinner tuxSpinner2 = c1014050cUl.LLLFFI;
            if (tuxSpinner2 != null) {
                C786410Ut5.LLZILL(tuxSpinner2, 0);
            }
            TuxSpinner tuxSpinner3 = c1014050cUl.LLLFFI;
            if (tuxSpinner3 != null && tuxSpinner3.getVisibility() == 0 && (interfaceC1014090cUp = c1014050cUl.LLJLIL) != null) {
                interfaceC1014090cUp.LIZ();
                return;
            }
            return;
        }
        TuxSpinner tuxSpinner4 = c1014050cUl.LLLFFI;
        if (tuxSpinner4 == null) {
            return;
        }
        C786410Ut5.LLZILL(tuxSpinner4, 8);
    }

    public static final void LIZLLL(final C1014050cUl c1014050cUl, final String str, boolean z) {
        String loadingFormatCdn;
        LandingPageDataModel landingPageData;
        LinearLayout linearLayout = c1014050cUl.LLJZIJLIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        FrameLayout frameLayout = c1014050cUl.LLL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        LJFF(c1014050cUl);
        if (!z && !Intrinsics.LIZLLL((Float) c1014050cUl.LLLILZ.getValue(), 1.0f)) {
            LIZJ(c1014050cUl, str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        SettingsManager.LIZLLL().getClass();
        sbLIZ.append(SettingsManager.LJI("iab_loading_format_cdn_config", "https://tosv-sg.tiktok-row.org/obj/thrid-ladning-page/"));
        IABLoadingFormatModel iABLoadingFormatModelLJJ = c1014050cUl.LJJ();
        if (iABLoadingFormatModelLJJ == null || (landingPageData = iABLoadingFormatModelLJJ.getLandingPageData()) == null || (loadingFormatCdn = landingPageData.getLoadingFormatCdn()) == null) {
            loadingFormatCdn = "";
        }
        sbLIZ.append(loadingFormatCdn);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC442640HXi interfaceC442640HXi = new InterfaceC442640HXi() { // from class: X.0cUn
            @Override // X.InterfaceC442640HXi
            public final void onResult(Object obj) {
                String str2 = (String) obj;
                InterfaceC1014090cUp interfaceC1014090cUp = c1014050cUl.LLJLIL;
                if (interfaceC1014090cUp != null) {
                    interfaceC1014090cUp.LIZJ(C123100dR.LIZ(str2));
                }
                if (C123100dR.LIZ(str2)) {
                    C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str2));
                    c1331670kl3LJII.LJJ(c1014050cUl.LLLF);
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LIZ = false;
                    c1331670kl3LJII.LJJI = c1331750klB.LIZ();
                    c1331670kl3LJII.LJJ = EnumC1338240kve.CENTER_CROP;
                    C786410Ut5.h3(c1331670kl3LJII);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exited ");
                    sbLIZ2.append(strLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                C1014060cUm.LIZJ(c1014050cUl, str);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("no exited ");
                sbLIZ3.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        };
        if (TextUtils.isEmpty(strLIZIZ)) {
            C1325420kay.LIZLLL(new ARunnableS116S0100000_16(interfaceC442640HXi, 250));
        } else {
            C823050WQl.LIZLLL().execute(new ARunnableS21S1100000_16(interfaceC442640HXi, strLIZIZ, 9));
        }
    }

    public static final void LJ(C1014050cUl c1014050cUl, String str, boolean z) {
        LandingPageDataModel landingPageData;
        String loadingFormatCdn;
        String str2;
        List<String> geckoChannel;
        List<String> geckoChannel2;
        LinearLayout linearLayout = c1014050cUl.LLJZIJLIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        FrameLayout frameLayout = c1014050cUl.LLL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        LJFF(c1014050cUl);
        IABLoadingFormatOptConfigExp.IABLoadingFormatOptConfig iABLoadingFormatOptConfigLIZ = IABLoadingFormatOptConfigExp.LIZ();
        if ((iABLoadingFormatOptConfigLIZ != null && iABLoadingFormatOptConfigLIZ.allFallbackIcon && !c1014050cUl.LLLIIIIL) || (!z && !Intrinsics.LIZLLL((Float) c1014050cUl.LLLILZ.getValue(), 1.0f))) {
            LIZJ(c1014050cUl, str);
            return;
        }
        IABLoadingFormatModel iABLoadingFormatModelLJJ = c1014050cUl.LJJ();
        String str3 = null;
        if (iABLoadingFormatModelLJJ != null && (landingPageData = iABLoadingFormatModelLJJ.getLandingPageData()) != null && (loadingFormatCdn = landingPageData.getLoadingFormatCdn()) != null && loadingFormatCdn.length() != 0) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
            String strDp = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).dp();
            IABLoadingFormatModel iABLoadingFormatModelLJJ2 = c1014050cUl.LJJ();
            if (iABLoadingFormatModelLJJ2 != null && (geckoChannel2 = iABLoadingFormatModelLJJ2.getGeckoChannel()) != null) {
                str2 = (String) C13LP.LJJJLL(geckoChannel2);
            } else {
                str2 = null;
            }
            if (iAdWebUtils.q0(strDp, str2)) {
                IAdWebUtils iAdWebUtils2 = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
                String strDp2 = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).dp();
                IABLoadingFormatModel iABLoadingFormatModelLJJ3 = c1014050cUl.LJJ();
                if (iABLoadingFormatModelLJJ3 != null && (geckoChannel = iABLoadingFormatModelLJJ3.getGeckoChannel()) != null) {
                    str3 = (String) C13LP.LJJJLL(geckoChannel);
                }
                String strP0 = iAdWebUtils2.p0(strDp2, str3);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strP0);
                sbLIZ.append("/screenshot.jpeg");
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)));
                c1331670kl3LJII.LJJ(c1014050cUl.LLLF);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = false;
                c1331670kl3LJII.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJII.LJJ = EnumC1338240kve.CENTER_CROP;
                C786410Ut5.h3(c1331670kl3LJII);
                return;
            }
        }
        LIZJ(c1014050cUl, str);
    }
}
