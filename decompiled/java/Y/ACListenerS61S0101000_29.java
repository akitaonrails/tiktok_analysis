package Y;

import X.AbstractC19399310v1;
import X.AbstractC19563811gS;
import X.C114F;
import X.C19401510vN;
import X.C19401910vR;
import X.C19402010vS;
import X.C21594419fC;
import X.InterfaceC19399510v3;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.audiencefooter.view.AudienceFooterBottomSheetOption;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS61S0101000_29 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        ViewPager viewPager = ((C114F) aCListenerS61S0101000_29.l0).LLJL;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS61S0101000_29.i1, true);
        }
    }

    public static final void onClick$1(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        InterfaceC19399510v3 interfaceC19399510v3 = ((AbstractC19399310v1) aCListenerS61S0101000_29.l0).LL;
        if (interfaceC19399510v3 != null) {
            interfaceC19399510v3.LIZ(aCListenerS61S0101000_29.i1);
        }
    }

    public static final void onClick$2(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        ((AudienceFooterBottomSheetOption) aCListenerS61S0101000_29.l0).WR().vQ2(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$3(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        ((AudienceFooterBottomSheetOption) aCListenerS61S0101000_29.l0).WR().vQ2(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$4(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        AudienceFooterBottomSheetOption audienceFooterBottomSheetOption = (AudienceFooterBottomSheetOption) aCListenerS61S0101000_29.l0;
        VideoPublishEditModel videoPublishEditModel = audienceFooterBottomSheetOption.LLJILLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.isSubscribeOnly = false;
        }
        audienceFooterBottomSheetOption.WR().vQ2(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$5(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        AudienceFooterBottomSheetOption audienceFooterBottomSheetOption = (AudienceFooterBottomSheetOption) aCListenerS61S0101000_29.l0;
        VideoPublishEditModel videoPublishEditModel = audienceFooterBottomSheetOption.LLJILLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.isSubscribeOnly = false;
        }
        audienceFooterBottomSheetOption.WR().vQ2(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$6(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        AudienceFooterBottomSheetOption audienceFooterBottomSheetOption = (AudienceFooterBottomSheetOption) aCListenerS61S0101000_29.l0;
        VideoPublishEditModel videoPublishEditModel = audienceFooterBottomSheetOption.LLJILLL;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            privacySettingModel.isSubscribeOnly = true;
        }
        audienceFooterBottomSheetOption.WR().vQ2(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$7(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        ((ViewPager) aCListenerS61S0101000_29.l0).setCurrentItem(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$8(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        C19401910vR c19401910vR = ((C19401510vN) aCListenerS61S0101000_29.l0).LL;
        int iIndexOf = c19401910vR.LIZ.indexOf(c19401910vR.LIZIZ);
        C19401510vN c19401510vN = (C19401510vN) aCListenerS61S0101000_29.l0;
        c19401510vN.LLILLJJLI.L5((C19402010vS) ListProtector.get(c19401510vN.LL.LIZ, aCListenerS61S0101000_29.i1));
        ((C19401510vN) aCListenerS61S0101000_29.l0).notifyItemChanged(iIndexOf);
        ((C19401510vN) aCListenerS61S0101000_29.l0).notifyItemChanged(aCListenerS61S0101000_29.i1);
    }

    public static final void onClick$9(ACListenerS61S0101000_29 aCListenerS61S0101000_29, View view) {
        C21594419fC c21594419fC = ((AbstractC19563811gS) aCListenerS61S0101000_29.l0).LLJLILLLLZIIL;
        if (c21594419fC != null) {
            c21594419fC.setCurrentItem(aCListenerS61S0101000_29.i1, true);
        }
    }

    public ACListenerS61S0101000_29(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
