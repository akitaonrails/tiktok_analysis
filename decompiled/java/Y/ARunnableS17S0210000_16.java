package Y;

import X.C01GW;
import X.C1042580dEm;
import X.C1042650dEt;
import X.C1161970gLL;
import X.C13LP;
import X.C1440005kM;
import X.C1490740otc;
import X.C1537410q6t;
import X.C1C7U;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C988330bpH;
import X.C988430bpR;
import X.C998810c6B;
import X.EnumC992610bwB;
import X.InterfaceC1041500dD2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC988120bow;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.HorizontalTemplateListAssem;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS17S0210000_16 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1042650dEt c1042650dEt = ((C1042580dEm) this.l0).LJ;
        if (c1042650dEt != null) {
            c1042650dEt.LJIIIIZZ = Boolean.valueOf(this.z2);
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind with view. isTTWeb:");
        sbLIZ.append(this.z2);
        sbLIZ.append(", \n lifecycleId: ");
        InterfaceC1041500dD2 interfaceC1041500dD2 = (InterfaceC1041500dD2) this.l1;
        sbLIZ.append(interfaceC1041500dD2 != null ? Integer.valueOf(interfaceC1041500dD2.hashCode()) : null);
        sbLIZ.append(" \n cid: ");
        sbLIZ.append(((C1042580dEm) this.l0).LIZ);
        sbLIZ.append(" \n schemaurl: ");
        InterfaceC1041500dD2 interfaceC1041500dD22 = (InterfaceC1041500dD2) this.l1;
        sbLIZ.append(interfaceC1041500dD22 != null ? interfaceC1041500dD22.getLoadUrl() : null);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPLifeCycle_", 2);
    }

    public final void LIZ$1() {
        String str;
        int iLIZIZ;
        TextPaint paint;
        TakoAITemplates takoAITemplates;
        int fullScreenHeight = (ScreenUtils.getFullScreenHeight(((HorizontalTemplateListAssem) this.l1).getContext()) - ScreenUtils.getScreenHeight(((HorizontalTemplateListAssem) this.l1).getContext())) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(((HorizontalTemplateListAssem) this.l1).getContext());
        if (this.z2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EnumC992610bwB.MULTI_TEMPLATE.getHeight())));
        } else {
            List list = (List) ((HorizontalTemplateListAssem) this.l1).LLJJI.getValue();
            if (list == null || (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) == null || (str = takoAITemplates.templateSubTitle) == null) {
                str = "";
            }
            TuxTextView tuxTextView = ((HorizontalTemplateListAssem) this.l1).LLJL;
            float fMeasureText = (tuxTextView == null || (paint = tuxTextView.getPaint()) == null) ? 0.0f : paint.measureText(str);
            TuxTextView tuxTextView2 = ((HorizontalTemplateListAssem) this.l1).LLJL;
            iLIZIZ = fMeasureText == 0.0f ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EnumC992610bwB.SINGLE_TEMPLATE_NO_SUBTITLE.getHeight()))) : fMeasureText > (tuxTextView2 != null ? (float) tuxTextView2.getMeasuredWidth() : 0.0f) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EnumC992610bwB.SINGLE_TEMPLATE_2_LINE.getHeight()))) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EnumC992610bwB.SINGLE_TEMPLATE_1_LINE.getHeight())));
        }
        AssemVMLazy assemVMLazy = ((HorizontalTemplateListAssem) this.l1).LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HorizontalTemplateListAssem.LLLFZ;
        assemVMLazy.getValue().setState(new AwS606S0100000_27(new C998810c6B(iLIZIZ + fullScreenHeight), 603));
    }

    public static final void run$0(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SparkView@faa0.refreshDebugInfo$1");
        try {
            TextView textView = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) aRunnableS17S0210000_16.l0).LLJJL;
            if (textView != null) {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                if (C1161970gLL.LIZIZ().LIZ && aRunnableS17S0210000_16.z2 && !Intrinsics.LJFF((Boolean) aRunnableS17S0210000_16.l1, Boolean.TRUE)) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLIL(textView, i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkView@faa0.refreshDebugInfo$1");
    }

    public static final void run$1(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ShakeEgg@3fa8.load$3");
        try {
            ShakeEgg.LJIIIIZZ((Aweme) aRunnableS17S0210000_16.l0, aRunnableS17S0210000_16.z2, (ShakeEgg) aRunnableS17S0210000_16.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShakeEgg@3fa8.load$3");
    }

    public static final void run$2(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS17S0210000_16.l0;
        Aweme aweme = (Aweme) aRunnableS17S0210000_16.l1;
        boolean z = aRunnableS17S0210000_16.z2;
        profilePageFragment.getClass();
        C1C7U.LIZ("ProfilePageFragment@e348.setUserProfileSimpleUserData$1L");
        profilePageFragment.LL.WL(aweme.getAuthor(), !z);
        C1C7U.LIZIZ("ProfilePageFragment@e348.setUserProfileSimpleUserData$1L");
    }

    public static final void run$3(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPLifeCycle@86e2.bindWithView$1");
        try {
            aRunnableS17S0210000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPLifeCycle@86e2.bindWithView$1");
    }

    public static final void run$4(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdMaskManager@e7b1.hideAdLayout$1");
        try {
            C786410Ut5.LJZL(8, ((C988430bpR) aRunnableS17S0210000_16.l0).LL);
            if (aRunnableS17S0210000_16.z2) {
                ((InterfaceC988120bow) aRunnableS17S0210000_16.l1).LJIILLIIL();
            }
            Aweme aweme = ((C988430bpR) aRunnableS17S0210000_16.l0).LLILLJJLI;
            if (aweme == null) {
                aweme = null;
            }
            C1440005kM.LIZ(new C988330bpH(false, aweme.getAid()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdMaskManager@e7b1.hideAdLayout$1");
    }

    public static final void run$5(ARunnableS17S0210000_16 aRunnableS17S0210000_16) {
        boolean zLIZ;
        C1C7U.LIZ("HorizontalTemplateListAssem@3e95.adjustUIOfUnifyStyle$$inlined$doOnPreDraw$1");
        try {
            aRunnableS17S0210000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HorizontalTemplateListAssem@3e95.adjustUIOfUnifyStyle$$inlined$doOnPreDraw$1");
    }

    public ARunnableS17S0210000_16(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }

    public ARunnableS17S0210000_16(ProfilePageFragment profilePageFragment, Aweme aweme, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = profilePageFragment;
        this.l1 = aweme;
        this.z2 = z;
    }
}
