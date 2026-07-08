package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import java.util.Map;
import kotlin.jvm.internal.AwS151S1100000_2;

/* JADX INFO: renamed from: X.06gU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1670806gU {
    public static final void LIZIZ(C1671006gW c1671006gW, SystemContent systemContent) {
        SessionInfo sessionInfo;
        String str;
        String str2;
        SystemContent.Key key;
        String str3 = "";
        c1671006gW.LJI("");
        C422800Ghy topAvatarImageView = c1671006gW.getTopAvatarImageView();
        if (topAvatarImageView != null) {
            int visibility = topAvatarImageView.getVisibility();
            topAvatarImageView.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, topAvatarImageView);
        }
        TuxTextView topFollowButton = c1671006gW.getTopFollowButton();
        if (topFollowButton != null) {
            C786410Ut5.LLLLZLL(topFollowButton, 8);
        }
        c1671006gW.LJFF(systemContent);
        SystemContent.Key[] template = systemContent.getTemplate();
        if (template != null && (key = (SystemContent.Key) C13LQ.LJJIFFI(template)) != null && key.getAction() == 8) {
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                iIMChatAnalyticsLIZ.LJFF(c1671006gW.LLILLJJLI, C0I0B.LJFF.LIZIZ());
                return;
            }
            return;
        }
        SystemContent.Key[] template2 = systemContent.getTemplate();
        if (template2 == null) {
            return;
        }
        for (SystemContent.Key key2 : template2) {
            C1675506hF.LIZ.getClass();
            if (C1675506hF.LIZJ(key2)) {
                if (key2 == null) {
                    return;
                }
                Map<String, String> extra = key2.getExtra();
                if (extra != null && (str2 = extra.get("user_type")) != null) {
                    str3 = str2;
                }
                IImDmProminenceAnalytics.LIZ.getClass();
                IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
                if (iImDmProminenceAnalyticsLIZ == null || (sessionInfo = c1671006gW.LLILLJJLI) == null) {
                    return;
                }
                Map<String, String> extra2 = key2.getExtra();
                if (extra2 == null || (str = extra2.get(Scene.SCENE_SERVICE)) == null) {
                    str = "minor_protection";
                }
                iImDmProminenceAnalyticsLIZ.LJI(sessionInfo, str, str3, C0I0B.LJFF.LIZIZ());
                return;
            }
        }
    }

    public static final C1732606qS LIZ(C1671006gW c1671006gW, String str, InterfaceC1638406bG interfaceC1638406bG) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1671006gW, null);
        c1671006gW.removeAllViews();
        EnumC1651806dQ enumC1651806dQLIZ = C1651506dN.LIZ(str);
        C1732606qS c1732606qS = new C1732606qS(c1671006gW.getContext());
        c1732606qS.setStyle(enumC1651806dQLIZ);
        c1732606qS.setOnDismissEventListener(new AwS151S1100000_2(interfaceC1638406bG, str, 26));
        c1671006gW.addView(c1732606qS);
        int i = C1651706dP.LIZJ().getInt(C1651706dP.LIZ(), 0) + 1;
        C1651706dP.LIZJ().storeInt(C1651706dP.LIZ(), i);
        if (i >= 3) {
            interfaceC1638406bG.LIZ(2, str);
        }
        C786410Ut5.f0(c1671006gW, 0);
        return c1732606qS;
    }
}
