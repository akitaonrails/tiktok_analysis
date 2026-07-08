package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.InviteByLinkAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0j2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265910j2z implements CompoundButton.OnCheckedChangeListener {
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
        }
    }

    public C1265910j2z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1265910j2z c1265910j2z, CompoundButton compoundButton, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Click smsCheckbox(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        Bundle arguments = ((InputCodeFragment) c1265910j2z.l0).getArguments();
        if (arguments != null) {
            ((InputCodeFragment) c1265910j2z.l0).ET(arguments);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0huw] */
    public static final void onCheckedChanged$1(C1265910j2z c1265910j2z, CompoundButton compoundButton, final boolean z) {
        String str;
        AssemVMLazy assemVMLazy = ((InviteByLinkAssem) c1265910j2z.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InviteByLinkAssem.LLJI;
        final ManageGroupViewModel manageGroupViewModel = (ManageGroupViewModel) assemVMLazy.getValue();
        manageGroupViewModel.setStateImmediate(new AwS33S0010000_19(z, 11));
        String strXQ2 = manageGroupViewModel.xQ2();
        if (strXQ2 != null) {
            manageGroupViewModel.zQ2().LJII(strXQ2, z, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0huw
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    manageGroupViewModel.setState(new AwS33S0010000_19(z, 12));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    manageGroupViewModel.setState(new AwS33S0010000_19(z, 13));
                }
            });
        }
        IMGroupChatDetailAnalytics iMGroupChatDetailAnalytics = IMGroupChatDetailAnalytics.LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "group_management");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        iMGroupChatDetailAnalytics.LJFF("click_invite_people_by_link", pairArr, C0I0B.LJFF.LIZIZ());
    }

    public static final void onCheckedChanged$2(C1265910j2z c1265910j2z, CompoundButton compoundButton, boolean z) {
        C197039127h c197039127hVR = ((MinisRechargeFragment) c1265910j2z.l0).VR();
        if (c197039127hVR != null) {
            c197039127hVR.setEnabled(z);
        }
    }

    public static final void onCheckedChanged$3(C1265910j2z c1265910j2z, CompoundButton compoundButton, boolean z) {
        C1265550j2P c1265550j2P = (C1265550j2P) c1265910j2z.l0;
        int i = c1265550j2P.LLILZLL;
        c1265550j2P.LLILZLL = EnumC1155170gAN.DEFAULT.getValue();
        ((C1265550j2P) c1265910j2z.l0).LIZ(i);
        TuxSheet tuxSheet = ((C1265550j2P) c1265910j2z.l0).LLILZIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void onCheckedChanged$4(C1265910j2z c1265910j2z, CompoundButton compoundButton, boolean z) {
        C1265550j2P c1265550j2P = (C1265550j2P) c1265910j2z.l0;
        int i = c1265550j2P.LLILZLL;
        c1265550j2P.LLILZLL = EnumC1155170gAN.LATEST.getValue();
        ((C1265550j2P) c1265910j2z.l0).LIZ(i);
        TuxSheet tuxSheet = ((C1265550j2P) c1265910j2z.l0).LLILZIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void onCheckedChanged$5(C1265910j2z c1265910j2z, CompoundButton compoundButton, boolean z) {
        C1259990itR c1259990itR = (C1259990itR) c1265910j2z.l0;
        Aweme aweme = c1259990itR.LLJI;
        if (z) {
            C0HZQ c0hzq = c1259990itR.LLJ;
            if (c0hzq != null) {
                C786410Ut5.LLLLLZ(c0hzq, 0);
            }
            ShareVideoPanelViewModel shareVideoPanelViewModel = (ShareVideoPanelViewModel) ((C1259990itR) c1265910j2z.l0).LLJJI.getValue();
            if (shareVideoPanelViewModel != null) {
                shareVideoPanelViewModel.xQ2(aweme, new AwS563S0100000_19(compoundButton, 2873));
                return;
            }
            return;
        }
        C0HZQ c0hzq2 = c1259990itR.LLJ;
        if (c0hzq2 != null) {
            C786410Ut5.LLLLLZ(c0hzq2, 8);
        }
        ShareVideoPanelViewModel shareVideoPanelViewModel2 = (ShareVideoPanelViewModel) ((C1259990itR) c1265910j2z.l0).LLJJI.getValue();
        if (shareVideoPanelViewModel2 == null) {
            return;
        }
        shareVideoPanelViewModel2.xQ2(null, null);
    }
}
