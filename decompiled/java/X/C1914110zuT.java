package X;

import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyBodyLinkListUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeActionUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914110zuT {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(java.lang.String r3, java.lang.String r4) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.String r0 = "external"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L14
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_EXTERNAL
            java.lang.String r1 = r0.getValue()
        Le:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r4)
            return r0
        L14:
            java.lang.String r0 = "h5"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L61
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            java.lang.String r1 = r3.getHost()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.String r0 = "play.google.com"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L44
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L44
            java.lang.String r0 = "/store/apps/details"
            boolean r0 = r1.equals(r0)
            if (r0 != r2) goto L44
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_EXTERNAL
            java.lang.String r1 = r0.getValue()
            goto Le
        L44:
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r4, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme://webview?url="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_INTERNAL
            java.lang.String r1 = r0.getValue()
            goto Le
        L61:
            java.lang.String r0 = "native"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto Lb1
            X.0zuU r2 = X.EnumC1914120zuU.LINK_TYPE_INTERNAL
            java.lang.String r0 = r2.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "pop"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto La9
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_POP
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto La9
            X.0zuU r1 = X.EnumC1914120zuU.LINK_TYPE_UPGRADE
            java.lang.String r0 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L9b
            java.lang.String r1 = r1.getValue()
            goto Le
        L9b:
            java.lang.String r1 = ""
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto Le
            java.lang.String r1 = r2.getValue()
            goto Le
        La9:
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_POP
            java.lang.String r1 = r0.getValue()
            goto Le
        Lb1:
            X.0zuU r0 = X.EnumC1914120zuU.LINK_TYPE_INTERNAL
            java.lang.String r1 = r0.getValue()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1914110zuT.LIZ(java.lang.String, java.lang.String):kotlin.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static UniversalPopupResponse LIZIZ(List list, Map map) throws UnsupportedEncodingException {
        ?? arrayList;
        ArrayList arrayList2;
        int i;
        boolean z;
        int iIntValue;
        boolean z2;
        boolean z3;
        List<String> listSingletonList;
        boolean zBooleanValue;
        int iIntValue2;
        if (list != null) {
            int i2 = 10;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PolicyNoticeUPSdk policyNoticeUPSdk = (PolicyNoticeUPSdk) it2.next();
                List<PolicyBodyLinkListUPSdk> list2 = policyNoticeUPSdk.policyLinkList;
                if (list2 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i2));
                    i = 0;
                    for (PolicyBodyLinkListUPSdk policyBodyLinkListUPSdk : list2) {
                        int i3 = i + 1;
                        String str = policyBodyLinkListUPSdk.linkType;
                        String str2 = policyBodyLinkListUPSdk.link;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Pair pairLIZ = LIZ(str, str2);
                        String value = (String) pairLIZ.getFirst();
                        String str3 = (String) pairLIZ.getSecond();
                        if (Intrinsics.LJFF(policyBodyLinkListUPSdk.upgrade, Boolean.TRUE)) {
                            value = EnumC1914120zuU.LINK_TYPE_UPGRADE.getValue();
                        }
                        String str4 = policyBodyLinkListUPSdk.name;
                        String strValueOf = String.valueOf(i);
                        Boolean bool = policyBodyLinkListUPSdk.approve;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        Integer num = policyBodyLinkListUPSdk.operation;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        arrayList2.add(new UniversalPopupBodyLinkList(str4, policyBodyLinkListUPSdk.font, policyBodyLinkListUPSdk.color, null, false, new UniversalPopupAction(strValueOf, str3, value, policyBodyLinkListUPSdk.extra, iIntValue2, policyBodyLinkListUPSdk.dismiss, null, null, zBooleanValue, null, null, false, false, 7872, null)));
                        i = i3;
                    }
                } else {
                    arrayList2 = null;
                    i = 0;
                }
                List<PolicyNoticeActionUPSdk> list3 = policyNoticeUPSdk.actions;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, i2));
                for (PolicyNoticeActionUPSdk policyNoticeActionUPSdk : list3) {
                    int i4 = i + 1;
                    Pair pairLIZ2 = LIZ(policyNoticeActionUPSdk.linkType, policyNoticeActionUPSdk.link);
                    String value2 = (String) pairLIZ2.getFirst();
                    String str5 = (String) pairLIZ2.getSecond();
                    Boolean bool2 = policyNoticeActionUPSdk.upgrade;
                    Boolean bool3 = Boolean.TRUE;
                    if (Intrinsics.LJFF(bool2, bool3)) {
                        value2 = EnumC1914120zuU.LINK_TYPE_UPGRADE.getValue();
                    }
                    String str6 = policyNoticeActionUPSdk.text;
                    String strValueOf2 = String.valueOf(i);
                    String str7 = policyNoticeActionUPSdk.extra;
                    Integer num2 = policyNoticeActionUPSdk.operation;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (Intrinsics.LJFF(policyNoticeActionUPSdk.dismiss, bool3) || Intrinsics.LJFF(policyNoticeActionUPSdk.linkType, "callback") || (policyNoticeActionUPSdk.approve && !Intrinsics.LJFF(policyNoticeActionUPSdk.linkType, "pop"))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    Boolean bool4 = policyNoticeActionUPSdk.dismissAll;
                    if (!policyNoticeActionUPSdk.approve && !Intrinsics.LJFF(policyNoticeActionUPSdk.linkType, "callback")) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (Intrinsics.LJFF(policyNoticeActionUPSdk.reGetSettings, bool3)) {
                        listSingletonList = Collections.singletonList("reload_settings");
                    } else {
                        listSingletonList = policyNoticeActionUPSdk.customizedActions;
                    }
                    arrayList3.add(new UniversalPopupButton(str6, new UniversalPopupAction(strValueOf2, str5, value2, str7, iIntValue, boolValueOf, null, bool4, z3, listSingletonList, policyNoticeActionUPSdk.nextPopUp, false, false, 6208, null), policyNoticeActionUPSdk.isBold(), i, true));
                    i = i4;
                }
                String str8 = policyNoticeUPSdk.business;
                String str9 = policyNoticeUPSdk.policyVersion;
                String str10 = policyNoticeUPSdk.style;
                String str11 = policyNoticeUPSdk.title;
                String str12 = policyNoticeUPSdk.body;
                String str13 = policyNoticeUPSdk.iconUrl;
                String str14 = policyNoticeUPSdk.iconUrlDark;
                Boolean boolIsSubPopUp = policyNoticeUPSdk.isSubPopUp();
                Boolean bool5 = policyNoticeUPSdk.firstButtonHighlight;
                if (policyNoticeUPSdk.upperRightClose != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean bool6 = policyNoticeUPSdk.upperLeftBack;
                String str15 = policyNoticeUPSdk.align;
                StyleExtra styleExtra = new StyleExtra(policyNoticeUPSdk.webviewUrl, policyNoticeUPSdk.webviewUxOption, null);
                ArrayList arrayList4 = arrayList2;
                arrayList.add(new UniversalPopup(false, str8, null, str9, str10, str11, str12, null, null, null, str15, arrayList3, str13, str14, arrayList4, boolIsSubPopUp, bool5, map, Boolean.valueOf(z), policyNoticeUPSdk.swipeDownClose, bool6, policyNoticeUPSdk.dismissClickOutside, styleExtra, 0.0f, 0.0f, null, policyNoticeUPSdk.isCompliance(), 58721157, null));
                i2 = 10;
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new UniversalPopupResponse(arrayList, null, 2, null);
    }
}
