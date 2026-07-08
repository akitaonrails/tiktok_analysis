package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362560lYs implements InterfaceC1361740lXY<C1362100lY8> {
    public final C1362160lYE LIZ;
    public boolean LIZIZ = true;

    public final String LIZLLL() {
        if (((Boolean) C0AL3.LIZ.getValue()).booleanValue()) {
            return this.LIZ.LJFF.getState().LLIZ;
        }
        return null;
    }

    public final void LJ() {
        SharePackage sharePackage = this.LIZ.LIZIZ;
        if (sharePackage == null || !Intrinsics.LJFF(sharePackage.itemType, "aigc_avatar")) {
            return;
        }
        C1364620lcC.LJI(C1364620lcC.LIZ);
        C786410Ut5.LJJJI("enter_method", "more", sharePackage.extras);
    }

    public final void LJI() {
        ITakoService iTakoService;
        SharePackage sharePackage = this.LIZ.LIZIZ;
        if (sharePackage == null || (iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null)) == null || !iTakoService.LJIIZILJ(sharePackage)) {
            return;
        }
        if (Intrinsics.LJFF(sharePackage.itemType, "tako_local_image") || Intrinsics.LJFF(sharePackage.itemType, "tako_local_video")) {
            iTakoService.LJLJL(Intrinsics.LJFF(sharePackage.itemType, "tako_local_video") ? "share_video" : "share_picture", "search_user", sharePackage.extras);
        } else if (sharePackage.sendMessageTemplateTask != null) {
            iTakoService.LJLLL(sharePackage.extras, "search_user");
        }
    }

    public C1362560lYs(C1362160lYE c1362160lYE) {
        this.LIZ = c1362160lYE;
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        String strLJIIIZ;
        String str;
        String strLIZJ;
        IMUser iMUser;
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        Bundle bundle;
        C1362100lY8 c1362100lY8 = (C1362100lY8) interfaceC1361730lXX;
        SharePackage sharePackage = this.LIZ.LIZIZ;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            C786410Ut5.LJJJI("share_platform", "chat_more", bundle);
            C786410Ut5.LJJJI("incentive_share_action", "tiktok_friends_more", bundle);
        }
        LJFF(null, "from_internal_end");
        LIZJ(LIZLLL());
        LJ();
        C0ZFW c0zfw = C0ZFW.LIZ;
        SharePackage sharePackage2 = this.LIZ.LIZIZ;
        if (sharePackage2 == null) {
            sharePackage2 = new SharePackage(new C1370940lmO());
        }
        if (c0zfw.LIZLLL(sharePackage2) && (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatDetailAnalytics.class, false, false, false, 14, null)) != null) {
            iIMChatDetailAnalytics.LIZLLL("more_button", null, C20642515q3.LJI(2131845896), C20642515q3.LJI(2131847874), null, C0I0B.LJFF.LIZIZ());
        }
        IMContact iMContact = c1362100lY8.LL;
        int i = c1362100lY8.LLILLJJLI;
        HashMap<String, String> map = new HashMap<>();
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        Object objValueOf = "";
        if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact)) == null) {
            strLJIIIZ = "";
        }
        map.put("to_user_id", strLJIIIZ);
        map.put("rank_index", String.valueOf(i));
        boolean z = iMContact instanceof IMUser;
        if (z) {
            str = "private";
        } else if (!(iMContact instanceof IMConversation)) {
            str = "";
        } else {
            str = "group";
        }
        map.put("icon_type", str);
        if (!z) {
            strLIZJ = "";
        } else {
            C1364620lcC.LIZ.getClass();
            strLIZJ = C1364620lcC.LIZJ(iMContact, "");
        }
        map.put("share_relation_type", strLIZJ);
        map.put("panel_source", "share_panel");
        if (z && (iMUser = (IMUser) iMContact) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        map.put("is_chosen", "1");
        InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LJ(map);
        }
        LJI();
    }

    @Override // X.InterfaceC1361740lXY
    public final void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
        Bundle bundle;
        C1362100lY8 c1362100lY8 = (C1362100lY8) interfaceC1361730lXX;
        if (this.LIZIZ) {
            SharePackage sharePackage = this.LIZ.LIZIZ;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                C786410Ut5.LJJJI("button_type", "search_button", bundle);
            }
            C1367430lgj.LIZ.LJIIIIZZ(this.LIZ.LIZIZ, "from_internal_end");
            this.LIZIZ = false;
        }
        int i = c1362100lY8.LLILLJJLI;
        HashMap<String, String> map = new HashMap<>();
        map.put("to_user_id", "more");
        map.put("rank_index", String.valueOf(i));
        map.put("icon_type", "search_icon");
        map.put("share_relation_type", "");
        map.put("panel_source", "share_panel");
        map.put("share_follow_status", "");
        InterfaceC1362600lYw interfaceC1362600lYw = this.LIZ.LJ;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1362560lYs.LIZJ(java.lang.String):void");
    }

    public final void LJFF(SharePackage sharePackage, String str) {
        Bundle bundle;
        Integer numValueOf;
        if (sharePackage == null) {
            sharePackage = this.LIZ.LIZIZ;
        }
        C1367430lgj c1367430lgj = C1367430lgj.LIZ;
        c1367430lgj.getClass();
        C1367430lgj.LJFF(c1367430lgj, "click", sharePackage, str);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (numValueOf = Integer.valueOf(bundle.getInt("aweme_type"))) != null) {
            if (numValueOf.intValue() == 502) {
                C912070ZqH.LIZIZ.LJFF().LJIILIIL("video", "more", false, null, C0I0B.LJFF.LIZIZ());
            } else {
                if (numValueOf.intValue() != 501) {
                    return;
                }
                C912070ZqH.LIZIZ.LJFF().LJIILIIL("image", "more", false, null, C0I0B.LJFF.LIZIZ());
            }
        }
    }
}
