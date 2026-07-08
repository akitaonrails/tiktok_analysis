package X;

import Y.ACListenerS149S0100000_14;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.ContentCheckInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857660Xki {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (privacySettingModel = creativeModel.privacySettingModel) == null || (contentCheckInfo = privacySettingModel.contentCheckInfo) == null || !contentCheckInfo.manualChangeSwitch) {
            return false;
        }
        return true;
    }

    public static final Integer LJ(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null) {
            numValueOf = Integer.valueOf(contentCheckInfo.usageCountToday);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() <= 3 && numValueOf.intValue() >= -1) {
            return Integer.valueOf(3 - numValueOf.intValue());
        }
        return -1;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        String uid;
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        } else {
            uid = null;
        }
        if (C856290XiV.LIZ(uid) && !LJIIIZ(videoPublishEditModel) && LJII(videoPublishEditModel) && LJI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null) {
            numValueOf = Integer.valueOf(contentCheckInfo.usageCountToday);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() >= 3) {
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isEnableContentCheck count:");
            sbLIZ.append(numValueOf);
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.isPrivate() == 0) {
            return true;
        }
        C201955140j.LIZJ(C385220F8m.LIZIZ, "isEnableContentCheck is not public");
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        Boolean boolValueOf;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        if (!C857670Xkj.LJ()) {
            C385220F8m c385220F8m = C385220F8m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ab:");
            sbLIZ.append(((Boolean) C276210As7.LIZ.getValue()).booleanValue());
            sbLIZ.append(", isChildrenMode:");
            sbLIZ.append(C0CHQ.LIZ().getAccountService().LIZ());
            sbLIZ.append(", isPrivateAccount:");
            sbLIZ.append(C857670Xkj.LIZJ());
            C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        ContentCheckInfo contentCheckInfo = null;
        if (videoPublishEditModel != null) {
            boolValueOf = Boolean.valueOf(C1428470nHB.LJJZZI(videoPublishEditModel));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck is in image mode");
            return false;
        }
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null) {
            contentCheckInfo = privacySettingModel.contentCheckInfo;
        }
        if (contentCheckInfo != null && !contentCheckInfo.isEligible) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck isEligible is false");
            return false;
        }
        if (C857670Xkj.LIZLLL(videoPublishEditModel)) {
            C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck isStory");
            return false;
        }
        if (!C857670Xkj.LIZIZ(videoPublishEditModel)) {
            return true;
        }
        C201955140j.LIZJ(C385220F8m.LIZIZ, "isSupportContentCheck isFromOnThisDay");
        return false;
    }

    public static final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C857670Xkj.LJ() || (videoPublishEditModel != null && (videoPublishEditModel.isPrivate() == 0 || C1428470nHB.LJJZZI(videoPublishEditModel)))) {
            return false;
        }
        return true;
    }

    public static SpannableString LIZIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        String string = c19eg.getString(2131849499);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.getString(2131829488));
        sbLIZ.append(' ');
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C913800Zt4 c913800Zt4 = new C913800Zt4(c19eg, 0);
        int iLJJJ = a0.LJJJ(strLIZIZ, string, 0, false, 6);
        if (iLJJJ > 0) {
            C786410Ut5.p2(spannableString, c913800Zt4, iLJJJ, string.length() + iLJJJ, 17);
            C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, string.length() + iLJJJ, 17);
        }
        Integer numLJ = LJ(videoPublishEditModel);
        if (LJIIIZ(videoPublishEditModel)) {
            return new SpannableString(LIZLLL(c19eg, videoPublishEditModel));
        }
        if (!LIZ(videoPublishEditModel) && numLJ != null && numLJ.intValue() > 2) {
            return spannableString;
        }
        return new SpannableString(LIZLLL(c19eg, videoPublishEditModel));
    }

    public static String LIZLLL(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        Integer numValueOf;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        ContentCheckInfo contentCheckInfo;
        String string = c19eg.getString(2131829497);
        String string2 = c19eg.getString(2131829495);
        String string3 = c19eg.getString(2131829496);
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (contentCheckInfo = privacySettingModel.contentCheckInfo) != null) {
            numValueOf = Integer.valueOf(contentCheckInfo.usageCountToday);
        } else {
            numValueOf = null;
        }
        if (!LJIIIZ(videoPublishEditModel)) {
            if (numValueOf != null && numValueOf.intValue() >= 3) {
                return string3;
            }
            return C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{LJ(videoPublishEditModel)}, 1));
        }
        return string;
    }

    public static final void LJIIIIZZ(C19EG c19eg, boolean z, FragmentManager fragmentManager) {
        String uid;
        String uid2;
        InterfaceC2257101DWa interfaceC2257101DWaLIZ = C857670Xkj.LIZ();
        if (interfaceC2257101DWaLIZ != null) {
            uid = ((C19292410dm) interfaceC2257101DWaLIZ).getUid();
        } else {
            uid = null;
        }
        C01GW c01gw = C856290XiV.LIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("_content_check_mvp_status_first");
        boolean z2 = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        if (!z2) {
            InterfaceC2257101DWa interfaceC2257101DWaLIZ2 = C857670Xkj.LIZ();
            if (interfaceC2257101DWaLIZ2 != null) {
                uid2 = ((C19292410dm) interfaceC2257101DWaLIZ2).getUid();
            } else {
                uid2 = null;
            }
            Keva keva2 = (Keva) c01gw.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(uid2);
            sbLIZ2.append("_content_check_mvp_status_first");
            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            C201955140j.LIZJ(C385220F8m.LIZIZ, "storeFirstShowLearnMore");
        }
        if (z || !z2) {
            String string = c19eg.getString(2131829492);
            String string2 = c19eg.getString(2131829493);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d70, null, false);
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.e1v);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJJIII = viewTd;
            tuxSheet.LLJLILLLLZIIL = true;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLILLL = true;
            TextView textView = (TextView) viewTd.findViewById(R.id.xyz);
            if (textView != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(string);
                sbLIZ3.append(' ');
                sbLIZ3.append(string2);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS149S0100000_14(tuxSheet, 49));
            }
            tuxSheet.show(fragmentManager, "content_check_mvp");
        }
    }
}
