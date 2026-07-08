package X;

import Y.ARunnableS27S0201000_21;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362360lYY implements InterfaceC1361740lXY<C1362370lYZ> {
    public final C1362160lYE LIZ;

    public C1362360lYY(C1362160lYE c1362160lYE) {
        this.LIZ = c1362160lYE;
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        boolean z;
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        String string;
        Long lLJIILIIL;
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        String strLJIIIZ;
        String str;
        String strLIZJ;
        String str2;
        IMUser iMUser;
        C1362370lYZ c1362370lYZ = (C1362370lYZ) interfaceC1361730lXX;
        C1362180lYG c1362180lYG = c1362370lYZ.LLIZ;
        if (c1362180lYG.LIZJ) {
            if (c1362180lYG.LIZ != EnumC1362480lYk.SELECTED) {
                z = true;
            } else {
                z = false;
            }
            int i = C1362420lYe.LIZ[this.LIZ.LJFF.zQ2(c1362370lYZ.LL, z).ordinal()];
            Object objValueOf = "";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    int iYQ2 = this.LIZ.LJFF.yQ2();
                    String quantityString = this.LIZ.LIZ.getResources().getQuantityString(2131755276, iYQ2, Integer.valueOf(iYQ2));
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LIZ);
                    c1389890mGx.LJIIJ(quantityString);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                IMContact iMContact = c1362370lYZ.LL;
                int i2 = c1362370lYZ.LLILLJJLI;
                SharePackage sharePackage = this.LIZ.LIZIZ;
                if (sharePackage != null) {
                    if (z) {
                        sharePackage.extras.putInt("rank_num", i2);
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
                            Bundle bundle = sharePackage.extras;
                            String lastGroupId = C0SUC.LIZ(c19egLIZIZ).getLastGroupId();
                            if (lastGroupId == null) {
                                lastGroupId = "";
                            }
                            C786410Ut5.LJJJI("last_group_id", lastGroupId, bundle);
                        }
                        boolean z2 = iMContact instanceof IMUser;
                        if (z2) {
                            Bundle bundle2 = sharePackage.extras;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(((IMUser) iMContact).getFollowStatus());
                            sbLIZ.append("");
                            C786410Ut5.LJJJI("relation_tag", C2188811AlT.LIZIZ(sbLIZ), bundle2);
                        }
                        C1367430lgj c1367430lgj = C1367430lgj.LIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0I0B c0i0b = C0I0B.LJFF;
                        InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
                        InterfaceC1493505sz interfaceC1493505szLIZIZ2 = c0i0b.LIZIZ();
                        c1367430lgj.getClass();
                        C1367430lgj.LIZLLL(sharePackage, iMContact, false, "", jCurrentTimeMillis, interfaceC1493505szLIZIZ, interfaceC1493505szLIZIZ2);
                        sharePackage.extras.remove("rank_num");
                        InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
                        if (interfaceC1362600lYw != null) {
                            interfaceC1362600lYw.LJIIJ(sharePackage, "chat_mergeIM");
                        }
                        if (Intrinsics.LJFF(sharePackage.itemType, "aigc_avatar")) {
                            C1364620lcC.LJFF(C1364620lcC.LIZ, iMContact);
                        }
                        if ((Intrinsics.LJFF(sharePackage.itemType, "aweme") || Intrinsics.LJFF(sharePackage.itemType, "aweme_photo") || Intrinsics.LJFF(sharePackage.itemType, "story_highlight")) && (string = sharePackage.extras.getString("aid")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
                            lLJIILIIL.longValue();
                            if (z2) {
                                C1336205Ku.LIZ(false).getImChatService().LJJIIZ(iMContact.getUid());
                            } else if (iMContact instanceof IMConversation) {
                                ((IMConversation) iMContact).getConversationId();
                            }
                        }
                    } else {
                        C1367430lgj.LJIIIZ(C1367430lgj.LIZ, sharePackage, iMContact, false);
                    }
                }
                SharePackage sharePackage2 = this.LIZ.LIZIZ;
                if (sharePackage2 != null) {
                    C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                    IMContact iMContact2 = c1362370lYZ.LL;
                    InterfaceC1493505sz interfaceC1493505szLIZIZ3 = C0I0B.LJFF.LIZIZ();
                    c1364620lcC.getClass();
                    C1364620lcC.LJIILLIIL(sharePackage2, iMContact2, interfaceC1493505szLIZIZ3);
                    if (C0ZFW.LIZ.LIZLLL(sharePackage2) && z && (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatDetailAnalytics.class, false, false, false, 14, null)) != null) {
                        iIMChatDetailAnalytics.LIZLLL("tiktok_friends", c1362370lYZ.LL, C20642515q3.LJI(2131845896), C20642515q3.LJI(2131847874), null, C0I0B.LJFF.LIZIZ());
                    }
                    C786410Ut5.LJJJI("incentive_share_action", "tiktok_friends", sharePackage2.extras);
                }
            }
            IMContact iMContact3 = c1362370lYZ.LL;
            int i3 = c1362370lYZ.LLILLJJLI;
            HashMap<String, String> map = new HashMap<>();
            ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
            if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact3)) == null) {
                strLJIIIZ = "";
            }
            map.put("to_user_id", strLJIIIZ);
            map.put("rank_index", String.valueOf(i3));
            boolean z3 = iMContact3 instanceof IMUser;
            if (z3) {
                str = "private";
            } else if (!(iMContact3 instanceof IMConversation)) {
                str = "";
            } else {
                str = "group";
            }
            map.put("icon_type", str);
            if (!z3) {
                strLIZJ = "";
            } else {
                C1364620lcC.LIZ.getClass();
                strLIZJ = C1364620lcC.LIZJ(iMContact3, "");
            }
            map.put("share_relation_type", strLIZJ);
            map.put("panel_source", "share_panel");
            if (z3 && (iMUser = (IMUser) iMContact3) != null) {
                objValueOf = Integer.valueOf(iMUser.getFollowStatus());
            }
            map.put("share_follow_status", objValueOf.toString());
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_chosen", str2);
            InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LJ;
            if (interfaceC1362600lYw2 != null) {
                interfaceC1362600lYw2.LJ(map);
            }
            C1371570lnP value = C1371570lnP.LIZ.getValue();
            SharePackage sharePackage3 = this.LIZ.LIZIZ;
            value.getClass();
            C1371570lnP.LIZ(sharePackage3);
            IMContact iMContact4 = c1362370lYZ.LL;
            EnumC1910440zoY enumC1910440zoY = EnumC1910440zoY.SHARE_PANEL;
            C0ZE7 c0ze7 = new C0ZE7(this.LIZ.LIZ);
            c0ze7.LIZIZ(enumC1910440zoY);
            c0ze7.LIZLLL = this.LIZ.LIZJ;
            c0ze7.LJFF = "share_panel";
            C897490ZIt.LIZ(iMContact4, c0ze7);
        }
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        C1362370lYZ c1362370lYZ = (C1362370lYZ) interfaceC1361730lXX;
        IMContact iMContact = c1362370lYZ.LL;
        LifecycleOwnerExtensionsKt.LIZ(this.LIZ.LIZ, new ARunnableS27S0201000_21(c1362370lYZ.LLILLJJLI, iMContact, this, 7));
    }
}
