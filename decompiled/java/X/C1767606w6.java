package X;

import android.content.Context;
import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.GoLiveReminderAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.HideMembersAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.RequireApprovalAssem;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.bot.BotDetailSwitchOperationAssem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationShowOnProfileAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.06w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1767606w6 implements CompoundButton.OnCheckedChangeListener {
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

    public C1767606w6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1767606w6 c1767606w6, CompoundButton compoundButton, final boolean z) {
        String str;
        final ManageGroupViewModel manageGroupViewModelGo = ((GoLiveReminderAssem) c1767606w6.l0).Go();
        String str2 = ((GoLiveReminderAssem) c1767606w6.l0).Go().getState().LLJIJIL;
        IMGroupChatDetailAnalytics iMGroupChatDetailAnalytics = IMGroupChatDetailAnalytics.LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "group_management");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        iMGroupChatDetailAnalytics.LJFF("click_go_live_reminder", pairArr, C0I0B.LJFF.LIZIZ());
        manageGroupViewModelGo.setStateImmediate(new AwS17S0010000_2(z, 5));
        C0Z58.LJIILIIL(manageGroupViewModelGo.xQ2(), str2, z, new InterfaceC863600XuI<C0Y8T>() { // from class: X.06ki
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                manageGroupViewModelGo.setState(new AwS17S0010000_2(z, 6));
                IIMErrorUtils.LIZ.getClass();
                IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                if (iIMErrorUtilsLIZ != null) {
                    C0I0B.LJFF.LIZJ();
                    iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                }
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C0Y8T c0y8t) {
                manageGroupViewModelGo.setState(new AwS17S0010000_2(z, 7));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.06d9] */
    public static final void onCheckedChanged$1(C1767606w6 c1767606w6, CompoundButton compoundButton, final boolean z) {
        String str;
        AssemVMLazy assemVMLazy = ((HideMembersAssem) c1767606w6.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HideMembersAssem.LLJI;
        final ManageGroupViewModel manageGroupViewModel = (ManageGroupViewModel) assemVMLazy.getValue();
        String strXQ2 = manageGroupViewModel.xQ2();
        if (strXQ2 != null) {
            manageGroupViewModel.zQ2().LJIIJ(strXQ2, z, new InterfaceC863600XuI<C0Y8T>() { // from class: X.06d9
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    manageGroupViewModel.setState(new AwS17S0010000_2(z, 4));
                }

                @Override // X.InterfaceC863600XuI
                public final /* bridge */ /* synthetic */ void onSuccess(C0Y8T c0y8t) {
                }
            });
        }
        HideMembersAssem hideMembersAssem = (HideMembersAssem) c1767606w6.l0;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        hideMembersAssem.getClass();
        IMGroupChatDetailAnalytics.LIZ.LJFF("ttsocial_group_hide_members_click", new Pair[]{new Pair("enter_from", "group_management"), new Pair("enter_method", "group_management_cell"), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str)}, C0I0B.LJFF.LIZIZ());
    }

    public static final void onCheckedChanged$2(C1767606w6 c1767606w6, CompoundButton compoundButton, boolean z) {
        if (!z && ((RequireApprovalAssem) c1767606w6.l0).hp().getState().LLIZ != 0) {
            ManageGroupViewModel manageGroupViewModelHp = ((RequireApprovalAssem) c1767606w6.l0).hp();
            Context context = ((RequireApprovalAssem) c1767606w6.l0).LJJIJL().getContext();
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(context.getString(2131830192));
            c1397580mTM.LIZ(2131830191);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS368S0200000_2(manageGroupViewModelHp, context, 74));
            new C1397510mTF(c1397580mTM).LIZLLL();
            ((C21411818qq) ((RequireApprovalAssem) c1767606w6.l0).LLJJIJI.getValue()).setChecked(true);
            return;
        }
        ((RequireApprovalAssem) c1767606w6.l0).hp().AQ2(z);
    }

    public static final void onCheckedChanged$3(C1767606w6 c1767606w6, CompoundButton compoundButton, boolean z) {
        AssemVMLazy assemVMLazy = ((GroupCreationShowOnProfileAssem) c1767606w6.l0).LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupCreationShowOnProfileAssem.LLJJIJI;
        assemVMLazy.getValue().setState(new AwS17S0010000_2(z, 8));
    }

    public static final void onCheckedChanged$4(C1767606w6 c1767606w6, CompoundButton compoundButton, boolean z) {
        ((C1733806qe) c1767606w6.l0).LIZIZ = z;
    }

    public static final void onCheckedChanged$5(C1767606w6 c1767606w6, CompoundButton compoundButton, boolean z) {
        ((C1733806qe) c1767606w6.l0).LIZ = z;
    }

    public static final void onCheckedChanged$6(C1767606w6 c1767606w6, CompoundButton compoundButton, boolean z) {
        ((BotDetailSwitchOperationAssem) c1767606w6.l0).hp().xQ2(C06W8.LIZ, Boolean.valueOf(z), C724240Sb0.LIZ((BotDetailSwitchOperationAssem) c1767606w6.l0));
    }
}
