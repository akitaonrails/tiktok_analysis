package X;

import com.ss.android.ugc.aweme.unifiedauthapi.model.CustomizedFrequencyControl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.HeaderView;
import com.ss.android.ugc.aweme.unifiedauthapi.model.NewUserFilters;
import com.ss.android.ugc.aweme.unifiedauthapi.model.OneClickSysPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PanelButtons;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupFiltersConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PushInnerPermissionChecklist;
import com.ss.android.ugc.aweme.unifiedauthapi.model.SubSwitch;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UserList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19207910Cn {
    public static final PopupInstanceConfig LIZ(PopupInstanceConfig popupInstanceConfig) {
        OneClickSysPopupConfig oneClickSysPopupConfig;
        List listLLIIII;
        HeaderView headerView;
        UserList userList;
        PanelButtons panelButtons;
        ArrayList arrayList;
        PushInnerPermissionChecklist pushInnerPermissionChecklist;
        ArrayList arrayList2;
        ArrayList arrayList3;
        NewUserFilters newUserFilters;
        ArrayList arrayList4;
        ArrayList arrayList5;
        CustomizedFrequencyControl customizedFrequencyControl;
        String str = popupInstanceConfig.panelId;
        int i = popupInstanceConfig.overwriteType;
        List listLLIIII2 = C13LP.LLIIII(popupInstanceConfig.platform);
        int i2 = popupInstanceConfig.popupCombinationType;
        OneClickSysPopupConfig oneClickSysPopupConfig2 = popupInstanceConfig.oneClickSysPopup;
        if (oneClickSysPopupConfig2 != null) {
            boolean z = oneClickSysPopupConfig2.showMask;
            String str2 = oneClickSysPopupConfig2.description;
            CustomizedFrequencyControl customizedFrequencyControl2 = oneClickSysPopupConfig2.customizedFrequencyControl;
            if (customizedFrequencyControl2 != null) {
                customizedFrequencyControl = new CustomizedFrequencyControl(customizedFrequencyControl2.name, customizedFrequencyControl2.showUpInterval, customizedFrequencyControl2.exitingLimit, customizedFrequencyControl2.showUpIntervalAfterExiting);
            } else {
                customizedFrequencyControl = null;
            }
            oneClickSysPopupConfig = new OneClickSysPopupConfig(z, str2, customizedFrequencyControl);
        } else {
            oneClickSysPopupConfig = null;
        }
        String str3 = popupInstanceConfig.panelType;
        PopupElementsConfig popupElementsConfig = popupInstanceConfig.popupElementsConfig;
        String str4 = popupElementsConfig.title;
        String str5 = popupElementsConfig.subtitle;
        String str6 = popupElementsConfig.description;
        boolean z2 = popupElementsConfig.dynamicTextEnabled;
        List<String> list = popupElementsConfig.dynamicValues;
        if (list != null) {
            listLLIIII = C13LP.LLIIII(list);
        } else {
            listLLIIII = null;
        }
        String str7 = popupElementsConfig.dynamicTitle;
        String str8 = popupElementsConfig.dynamicSubtitle;
        String str9 = popupElementsConfig.dynamicDescription;
        boolean z3 = popupElementsConfig.dynamicUseFallback;
        HeaderView headerView2 = popupElementsConfig.header;
        if (headerView2 != null) {
            headerView = new HeaderView(headerView2.bgResId, headerView2.bgResName, headerView2.bgResAlpha, headerView2.customizedViewId, headerView2.width, headerView2.height, headerView2.aspectRatio, headerView2.topMarginInDp, null);
        } else {
            headerView = null;
        }
        boolean z4 = popupElementsConfig.hideDetailIcon;
        boolean z5 = popupElementsConfig.showCloseIcon;
        UserList userList2 = popupElementsConfig.usersList;
        if (userList2 != null) {
            userList = new UserList(userList2.showSearchIc, userList2.showTTIc, userList2.hideTTIcSmall, userList2.showOnlineCircle, userList2.hide1stRightIc, userList2.hide1stAvatar, userList2.user1RightIcRawId, userList2.user2RightIcRawId, userList2.user1RightIcTintName, userList2.user1RightIcWidth, userList2.user1RightIcHeight, userList2.user1RightIcMarginTop, userList2.user1RightIcMarginEnd, userList2.user1RightIcResId, userList2.user2RightIcResId, userList2.user1RightIcName, userList2.user2RightIcName, userList2.hide2ndUser, userList2.user1TopMargin);
        } else {
            userList = null;
        }
        PanelButtons panelButtons2 = popupElementsConfig.buttons;
        if (panelButtons2 != null) {
            panelButtons = new PanelButtons(panelButtons2.positiveBtnText, panelButtons2.negativeBtnText, panelButtons2.singleButton);
        } else {
            panelButtons = null;
        }
        List<SubSwitch> list2 = popupElementsConfig.subSwitches;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (SubSwitch subSwitch : list2) {
                arrayList.add(new SubSwitch(subSwitch.switchText, subSwitch.switchField));
            }
        } else {
            arrayList = null;
        }
        PopupElementsConfig popupElementsConfig2 = new PopupElementsConfig(str4, str5, str6, z2, listLLIIII, str7, str8, str9, z3, headerView, z4, z5, userList, panelButtons, arrayList, popupElementsConfig.toastBottomMargin, popupElementsConfig.bannerTitle, popupElementsConfig.bannerButtonTitle);
        PopupFiltersConfig popupFiltersConfig = popupInstanceConfig.popupFiltersConfig;
        int i3 = popupFiltersConfig.pushSysPermissionStatusCheck;
        PushInnerPermissionChecklist pushInnerPermissionChecklist2 = popupFiltersConfig.pushInnerPermissionChecklist;
        if (pushInnerPermissionChecklist2 != null) {
            List<String> list3 = pushInnerPermissionChecklist2.allNeedCloseSwitches;
            if (list3 != null) {
                arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator<String> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(it2.next());
                }
            } else {
                arrayList4 = null;
            }
            List<String> list4 = pushInnerPermissionChecklist2.anyNeedCloseSwitches;
            if (list4 != null) {
                arrayList5 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<String> it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(it3.next());
                }
            } else {
                arrayList5 = null;
            }
            pushInnerPermissionChecklist = new PushInnerPermissionChecklist(arrayList4, arrayList5);
        } else {
            pushInnerPermissionChecklist = null;
        }
        boolean z6 = popupFiltersConfig.enableUnifiedFreqCtrlSettings;
        List<CustomizedFrequencyControl> list5 = popupFiltersConfig.customizedFreqCtrls;
        if (list5 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            for (CustomizedFrequencyControl customizedFrequencyControl3 : list5) {
                arrayList2.add(new CustomizedFrequencyControl(customizedFrequencyControl3.name, customizedFrequencyControl3.showUpInterval, customizedFrequencyControl3.exitingLimit, customizedFrequencyControl3.showUpIntervalAfterExiting));
            }
        } else {
            arrayList2 = null;
        }
        int i4 = popupFiltersConfig.showUpIntervalWithSystem;
        int i5 = popupFiltersConfig.loginStatusCheck;
        boolean z7 = popupFiltersConfig.smsConsentCheck;
        boolean z8 = popupFiltersConfig.edmConsentCheck;
        boolean z9 = popupFiltersConfig.edmSubscribeCheck;
        List<String> list6 = popupFiltersConfig.enabledSubScenes;
        if (list6 != null) {
            arrayList3 = new ArrayList(C15438062q.LJIJJ(list6, 10));
            Iterator<String> it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next());
            }
        } else {
            arrayList3 = null;
        }
        NewUserFilters newUserFilters2 = popupFiltersConfig.newUserFilter;
        if (newUserFilters2 != null) {
            newUserFilters = new NewUserFilters(newUserFilters2.moreThanXDays, newUserFilters2.lessThanXDays);
        } else {
            newUserFilters = null;
        }
        PopupFiltersConfig popupFiltersConfig2 = new PopupFiltersConfig(i3, pushInnerPermissionChecklist, z6, arrayList2, i4, newUserFilters, i5, z7, z8, z9, arrayList3);
        PopupActionsConfig popupActionsConfig = popupInstanceConfig.popupActionsConfig;
        return new PopupInstanceConfig(str, i, listLLIIII2, i2, oneClickSysPopupConfig, str3, popupElementsConfig2, popupFiltersConfig2, new PopupActionsConfig(popupActionsConfig.jump2SystemSettings, popupActionsConfig.needSetSubSwitches, popupActionsConfig.subSwitchesNewKeyValues, popupActionsConfig.closeOthers, popupActionsConfig.edmSubscribe, popupActionsConfig.edmConsent, popupActionsConfig.smsConsent));
    }
}
