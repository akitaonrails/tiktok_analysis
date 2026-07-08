package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.business.TarsSceneConfig;
import com.ss.android.ugc.profile.business.ad.platform.BioEmailData;
import com.ss.android.ugc.profile.business.ad.platform.business.BioStructuralBAEmailProtocol;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0j30, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnLongClickListenerC1265920j30 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1265920j30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        Context context;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) viewOnLongClickListenerC1265920j30.l0;
        inputCodeFragment.getClass();
        try {
            Context context2 = inputCodeFragment.getContext();
            if (context2 != null) {
                if (C20145813s8.LIZJ(context2, TokenCert.Companion.with("bpea-code_has_text_v1_fragment"))) {
                    InputCodeFragment inputCodeFragment2 = (InputCodeFragment) viewOnLongClickListenerC1265920j30.l0;
                    if (inputCodeFragment2.LLLLLZ == null && (context = inputCodeFragment2.getContext()) != null) {
                        C1754640vlG pinField = inputCodeFragment2.mT().getPinField();
                        C450860Hm8 c450860Hm8 = new C450860Hm8(context);
                        C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                        c1391600mJi.LIZIZ = pinField;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                        c450860Hm8.LJIIJ(new AwS598S0100000_19(inputCodeFragment2, 569));
                        inputCodeFragment2.LLLLLZ = c450860Hm8.LIZIZ();
                    }
                    C0P0T c0p0t = inputCodeFragment2.LLLLLZ;
                    if (c0p0t != null) {
                        c0p0t.show();
                    }
                    C853660XeG c853660XeG = C853660XeG.LIZ;
                    EnumC1237100iIW enumC1237100iIWLT = inputCodeFragment2.lT();
                    c853660XeG.getClass();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZ(enumC1237100iIWLT.ordinal(), "input_type");
                    C20684815ws.LJIILLIIL("paste_tooltip_show", c0xgr.LIZ);
                    return true;
                }
                return true;
            }
            return true;
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        String bioEmail;
        BioStructuralBAEmailProtocol bioStructuralBAEmailProtocol = (BioStructuralBAEmailProtocol) viewOnLongClickListenerC1265920j30.l0;
        BioEmailData bioEmailData = (BioEmailData) bioStructuralBAEmailProtocol.LLJILJIL;
        if (bioEmailData == null || (bioEmail = bioEmailData.getBioEmail()) == null) {
            bioEmail = "";
        }
        if (!TextUtils.isEmpty(bioEmail) && bioStructuralBAEmailProtocol.getContext() != null) {
            try {
                C20145813s8.LIZ(bioEmail, bioEmail, bioStructuralBAEmailProtocol.getContext(), CertProviderManagerKt.findCert("bpea-profile_copy_bio_email", 1476399110));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
        }
        C1233040iBy c1233040iBy = new C1233040iBy(((BioStructuralBAEmailProtocol) viewOnLongClickListenerC1265920j30.l0).getContext());
        c1233040iBy.LIZIZ(2131828213);
        c1233040iBy.LIZLLL();
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        C1224840hyk item = ((SelectorListContactCell) viewOnLongClickListenerC1265920j30.l0).getItem();
        if (item != null) {
            item.LIZIZ();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        Context context;
        InputCodeFragmentV2 inputCodeFragmentV2 = (InputCodeFragmentV2) viewOnLongClickListenerC1265920j30.l0;
        inputCodeFragmentV2.getClass();
        try {
            Context context2 = inputCodeFragmentV2.getContext();
            if (context2 != null) {
                if (C20145813s8.LIZJ(context2, TokenCert.Companion.with("bpea-code_has_text"))) {
                    InputCodeFragmentV2 inputCodeFragmentV22 = (InputCodeFragmentV2) viewOnLongClickListenerC1265920j30.l0;
                    if (inputCodeFragmentV22.LLLLJI == null && (context = inputCodeFragmentV22.getContext()) != null) {
                        C1754640vlG pinField = inputCodeFragmentV22.lT().getPinField();
                        C450860Hm8 c450860Hm8 = new C450860Hm8(context);
                        C1391600mJi c1391600mJi = c450860Hm8.LLILLJJLI;
                        c1391600mJi.LIZIZ = pinField;
                        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                        c450860Hm8.LJIIJ(new AwS598S0100000_19(inputCodeFragmentV22, 570));
                        inputCodeFragmentV22.LLLLJI = c450860Hm8.LIZIZ();
                    }
                    C0P0T c0p0t = inputCodeFragmentV22.LLLLJI;
                    if (c0p0t != null) {
                        c0p0t.show();
                    }
                    C853660XeG c853660XeG = C853660XeG.LIZ;
                    EnumC1237100iIW enumC1237100iIWKT = inputCodeFragmentV22.kT();
                    c853660XeG.getClass();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZ(enumC1237100iIWKT.ordinal(), "input_type");
                    C20684815ws.LJIILLIIL("paste_tooltip_show", c0xgr.LIZ);
                    return true;
                }
                return true;
            }
            return true;
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        ((Function0) viewOnLongClickListenerC1265920j30.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        String str;
        TarsSharedInterface tarsSharedInterface;
        C0Z0Y c0z0yLIZJ;
        TarsSceneConfig tarsSceneConfig = (TarsSceneConfig) C1249880id8.LIZ.getValue();
        if (tarsSceneConfig != null && (str = tarsSceneConfig.scene) != null && (tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null)) != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(str, null)) != null) {
            c0z0yLIZJ.LIZ(null);
        }
        ((ProfileHeaderSignatureTranslationComponent) viewOnLongClickListenerC1265920j30.l0).Jp(EnumC1065850dqJ.LONG_PRESS);
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1265920j30 viewOnLongClickListenerC1265920j30, View view) {
        C1391550mJd c1391550mJd = new C1391550mJd(((AbstractC1637470siH) viewOnLongClickListenerC1265920j30.l0).itemView.getContext());
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c1391550mJd.LJIIIZ(true, null);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4));
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJFF = iLIZIZ;
        c1391600mJi2.LJII = -1001L;
        c1391550mJd.LJII(R.attr.ee);
        FrameLayout frameLayout = new FrameLayout(((AbstractC1637470siH) viewOnLongClickListenerC1265920j30.l0).itemView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        frameLayout.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
        TuxIconView tuxIconView = new TuxIconView(frameLayout.getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams2.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams2);
        tuxIconView.setIconRes(R.raw.icon_trash_bin_filled);
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setTintColorRes(R.attr.zs);
        frameLayout.addView(tuxIconView);
        c1391550mJd.LLILLJJLI.LJIIZILJ = frameLayout;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        C1231520i9W.LIZ = c0p0tLIZIZ;
        c0p0tLIZIZ.LJJII(true, new ACListenerS154S0100000_19((AbstractC1637470siH) viewOnLongClickListenerC1265920j30.l0, 248));
        C0P0T c0p0t = C1231520i9W.LIZ;
        if (c0p0t != null) {
            c0p0t.show();
        }
        return true;
    }
}
