package X;

import android.widget.CompoundButton;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CategorySetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelSetting;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationCategorySettingCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationChannelSettingCell;
import com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0P4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4Q implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.08bK, X.0Ow9] */
    public static final void onCheckedChanged$0(C0P4Q c0p4q, CompoundButton compoundButton, boolean z) {
        String str;
        String string;
        String str2;
        C635420Ow8 item = ((SystemNotificationCategorySettingCell) c0p4q.l0).getItem();
        if (item == null || (str = item.LLILZIL) == null) {
            str = "notification_page";
        }
        C635420Ow8 c635420Ow8 = (C635420Ow8) c0p4q.l1;
        String str3 = c635420Ow8.LLILZ;
        CategorySetting categorySetting = c635420Ow8.LLILLL;
        Integer num = categorySetting.label;
        String str4 = categorySetting.clientKey;
        ((SystemNotificationCategorySettingCell) c0p4q.l0).getClass();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", str);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("account_type", str3);
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        pairArr[2] = new Pair("category_type", string);
        if (z) {
            str2 = "subscribed";
        } else {
            str2 = "unsubscribed";
        }
        pairArr[3] = new Pair("action_type", str2);
        pairArr[4] = new Pair("client_key", str4);
        C20684815ws.LJFF().execute(new RunnableC514801zW(C2097608Jq.LJIIJ(pairArr), 66));
        ViewModel fragmentViewModel = ((SystemNotificationCategorySettingCell) c0p4q.l0).getFragmentViewModel(UnsubscribeChannelSettingViewModel.class, null);
        if (fragmentViewModel != null) {
            final C635420Ow8 c635420Ow82 = (C635420Ow8) c0p4q.l1;
            int i = c635420Ow82.LL;
            Integer num2 = c635420Ow82.LLILLL.label;
            final C127A c127a = (C127A) c0p4q.l2;
            final SystemNotificationCategorySettingCell systemNotificationCategorySettingCell = (SystemNotificationCategorySettingCell) c0p4q.l0;
            ?? r9 = new InterfaceC2148408bK() { // from class: X.0Ow9
                public final void LIZ() {
                    c127a.LJIIJJI(true);
                }

                @Override // X.InterfaceC2148408bK
                public final void onFailure() {
                    systemNotificationCategorySettingCell.I5(c635420Ow82);
                }

                @Override // X.InterfaceC2148408bK
                public final void onSuccess() {
                    systemNotificationCategorySettingCell.I5(c635420Ow82);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess subscribe_combine_setting/update/v1,isChecked=");
                    CategorySetting categorySetting2 = c635420Ow82.LLILLL;
                    sbLIZ.append(categorySetting2 != null ? Boolean.valueOf(categorySetting2.isSubscribe) : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            r9.LIZ();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(fragmentViewModel), null, null, new C2148008bG(i, num2, z, r9, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.08bK, X.0Ow4] */
    public static final void onCheckedChanged$1(C0P4Q c0p4q, CompoundButton compoundButton, boolean z) {
        String str;
        SystemNotificationChannelSettingCell systemNotificationChannelSettingCell = (SystemNotificationChannelSettingCell) c0p4q.l0;
        String str2 = ((C635370Ow3) c0p4q.l1).LLILLL;
        systemNotificationChannelSettingCell.getClass();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "notification_page");
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("account_type", str2);
        if (z) {
            str = "batch_subscribed";
        } else {
            str = "batch_unsubscribed";
        }
        pairArr[2] = new Pair("action_type", str);
        C20684815ws.LJFF().execute(new RunnableC514801zW(C2097608Jq.LJIIJ(pairArr), 67));
        ViewModel fragmentViewModel = ((SystemNotificationChannelSettingCell) c0p4q.l0).getFragmentViewModel(UnsubscribeChannelSettingViewModel.class, null);
        if (fragmentViewModel != null) {
            final C635370Ow3 c635370Ow3 = (C635370Ow3) c0p4q.l1;
            int i = c635370Ow3.LL;
            final C127A c127a = (C127A) c0p4q.l2;
            final SystemNotificationChannelSettingCell systemNotificationChannelSettingCell2 = (SystemNotificationChannelSettingCell) c0p4q.l0;
            ?? r9 = new InterfaceC2148408bK() { // from class: X.0Ow4
                public final void LIZ() {
                    c127a.LJIIJJI(true);
                }

                @Override // X.InterfaceC2148408bK
                public final void onFailure() {
                    systemNotificationChannelSettingCell2.I5(c635370Ow3);
                }

                @Override // X.InterfaceC2148408bK
                public final void onSuccess() {
                    systemNotificationChannelSettingCell2.I5(c635370Ow3);
                    UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel = (UnsubscribeChannelSettingViewModel) systemNotificationChannelSettingCell2.getFragmentViewModel(UnsubscribeChannelSettingViewModel.class, null);
                    if (unsubscribeChannelSettingViewModel != null) {
                        unsubscribeChannelSettingViewModel.vQ2(c635370Ow3.LL);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess subscribe_combine_setting/update/v1,groupId=");
                    sbLIZ.append(c635370Ow3.LL);
                    sbLIZ.append(",isChecked=");
                    ChannelSetting channelSetting = c635370Ow3.LLILLJJLI;
                    sbLIZ.append(channelSetting != null ? channelSetting.isSubscribe : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            r9.LIZ();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(fragmentViewModel), null, null, new C2148008bG(i, null, z, r9, null), 3);
        }
    }

    public C0P4Q(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
