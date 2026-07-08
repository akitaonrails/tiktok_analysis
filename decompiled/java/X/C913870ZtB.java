package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmRiskyKeywordsSettingViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.RiskyKeywordsSettingFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913870ZtB implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
        }
    }

    public C913870ZtB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        DmRiskyKeywordsSettingViewModel dmRiskyKeywordsSettingViewModel = ((RiskyKeywordsSettingFragment) c913870ZtB.l0).LLIZ;
        if (dmRiskyKeywordsSettingViewModel == null) {
            dmRiskyKeywordsSettingViewModel = null;
        }
        if (z != dmRiskyKeywordsSettingViewModel.LLIZ.LJIIJ()) {
            dmRiskyKeywordsSettingViewModel.LLJ.setValue(Boolean.valueOf(z));
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            dmRiskyKeywordsSettingViewModel.LLIZ.LJFF("dm_filter_keyword", i, C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS558S0100000_14(dmRiskyKeywordsSettingViewModel, 1596), AFwS229S0000000_2.get$arr$(266), true);
            C0I0B.LJFF.LIZIZ();
            if (i != 1) {
                str = "off";
            } else {
                str = "on";
            }
            C20684815ws.LJIILLIIL("change_message_preference_permission", C894490Z7f.LIZ(new Pair("enter_from", "privacy_and_safety_settings"), new Pair("to_status", str), new Pair("target", "filtered_keywords"), new Pair("action_source", "user")));
        }
    }

    public static final void onCheckedChanged$1(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        String uid;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        VideoPublishEditModel videoPublishEditModelP4 = ((C905250ZfH) c913870ZtB.l0).P4();
        if (videoPublishEditModelP4 != null && (creativeModel = videoPublishEditModelP4.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null) {
            contentCheckInfo.manualChangeSwitch = z;
        }
        C19EG c19egO4 = ((C905250ZfH) c913870ZtB.l0).O4();
        C905250ZfH c905250ZfH = (C905250ZfH) c913870ZtB.l0;
        C857660Xki.LJIIIIZZ(c19egO4, false, C20622515mp.LJIILL(c905250ZfH.O4(), c905250ZfH.LLIZ));
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        } else {
            uid = null;
        }
        C856290XiV.LIZIZ(((C905250ZfH) c913870ZtB.l0).P4(), Boolean.valueOf(z), uid);
        C857700Xkm.LIZ.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("enable", z ? 1 : 0);
        C20684815ws.LJIILL("content_check_toggle_click", bundle);
        C905250ZfH c905250ZfH2 = (C905250ZfH) c913870ZtB.l0;
        c905250ZfH2.i3(new AwS101S0110000_14(c905250ZfH2, z, 4));
    }

    public static final void onCheckedChanged$2(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        String uid;
        ContentCheckInfo contentCheckInfo = ((C905260ZfI) c913870ZtB.l0).P4().creativeModel.privacySettingModel.contentCheckInfo;
        if (contentCheckInfo != null) {
            contentCheckInfo.manualChangeSwitch = z;
        }
        C19EG c19egO4 = ((C905260ZfI) c913870ZtB.l0).O4();
        C905260ZfI c905260ZfI = (C905260ZfI) c913870ZtB.l0;
        C857660Xki.LJIIIIZZ(c19egO4, false, C20622515mp.LJIILL(c905260ZfI.O4(), c905260ZfI.LLIZ));
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        } else {
            uid = null;
        }
        C856290XiV.LIZIZ(((C905260ZfI) c913870ZtB.l0).P4(), Boolean.valueOf(z), uid);
        C857700Xkm.LIZ.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("enable", z ? 1 : 0);
        C20684815ws.LJIILL("content_check_toggle_click", bundle);
        C905260ZfI c905260ZfI2 = (C905260ZfI) c913870ZtB.l0;
        c905260ZfI2.i3(new AwS101S0110000_14(c905260ZfI2, z, 5));
    }

    public static final void onCheckedChanged$3(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((VideoPublishEditModel) c913870ZtB.l0).creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility = "Friends";
        } else {
            ((VideoPublishEditModel) c913870ZtB.l0).creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility = "Everyone";
        }
    }

    public static final void onCheckedChanged$4(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        C05RV c05rv;
        String str;
        if (z) {
            C891740Yya c891740Yya = (C891740Yya) c913870ZtB.l0;
            if (C889930Yvf.LJIIJ(C889930Yvf.LIZ)) {
                c05rv = C05RV.PRO_CREATOR_INBOX;
            } else {
                c05rv = C05RV.PERSONAL_INBOX;
            }
            c891740Yya.LJFF = c05rv;
            if (C877900YcG.LIZ[((C891740Yya) c913870ZtB.l0).LJFF.ordinal()] == 1) {
                str = "click_option_creator_pro";
            } else {
                str = "click_option_personal";
            }
            ((C891740Yya) c913870ZtB.l0).LJII(str);
        }
        ((C891740Yya) c913870ZtB.l0).LJIIIIZZ();
    }

    public static final void onCheckedChanged$5(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        if (z) {
            C891740Yya c891740Yya = (C891740Yya) c913870ZtB.l0;
            c891740Yya.LJFF = C05RV.BUSINESS_INBOX;
            c891740Yya.LJII("click_option_business");
        }
        ((C891740Yya) c913870ZtB.l0).LJIIIIZZ();
    }

    public static final void onCheckedChanged$6(C913870ZtB c913870ZtB, CompoundButton compoundButton, boolean z) {
        int i;
        C0ZJR c0zjr = (C0ZJR) c913870ZtB.l0;
        C19727912Gn c19727912Gn = c0zjr.LJIIIZ;
        TextView textView = null;
        if (c19727912Gn == null) {
            c19727912Gn = null;
        }
        c19727912Gn.setActive(z);
        if (c0zjr.LJIL) {
            if (z) {
                i = 2131824680;
            } else {
                i = 2131824676;
            }
            TextView textView2 = c0zjr.LJIIJJI;
            if (textView2 != null) {
                textView = textView2;
            }
            textView.setText(i);
        }
        C0ZJR c0zjr2 = (C0ZJR) c913870ZtB.l0;
        if (c0zjr2.LJIJI) {
            return;
        }
        c0zjr2.LJIJJ = z;
    }
}
