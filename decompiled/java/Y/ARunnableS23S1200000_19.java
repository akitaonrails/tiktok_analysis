package Y;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1229500i6G;
import X.C1260470iuD;
import X.C1260720iuc;
import X.C1336205Ku;
import X.C1C7U;
import X.C20013213Sg;
import X.C20684815ws;
import X.C2344009Gk;
import X.C337180DJs;
import X.C427660Gpo;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.EducatePhotoModeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonAssem;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.publicgroup.data.GroupForInvitation;
import wh6.AbS166S1200000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS23S1200000_19 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public final void LIZ$0() {
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams((Context) this.l1, 3, this.s0);
        C1229500i6G c1229500i6G = (C1229500i6G) this.l2;
        enterChatParams.setEnterFromForMob(c1229500i6G.LIZ);
        enterChatParams.setEnterMethodForMob(c1229500i6G.LIZIZ);
        enterChatParams.setQuickChatViewType(c1229500i6G.LIZJ);
        enterChatParams.setQuickChat(!c1229500i6G.LIZLLL);
        enterChatParams.setDisableBackGroundMaskForQuickChat(c1229500i6G.LJFF);
        enterChatParams.setTrafficType(c1229500i6G.LJ);
        enterChatParams.setGroupChatNeedPullLatestMsg(c1229500i6G.LJI);
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        String str = this.s0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("topic_id", ((BannerDisplayInfo) this.l1).trendId);
        c2344009Gk.LJ(((BannerDisplayInfo) this.l1).category, "category_name");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("session_id", ((C1260470iuD) this.l2).LLILZIL);
        c2344009Gk.LIZJ(((BannerDisplayInfo) this.l1).getTopicTypeActual(), "topic_type");
        c2344009Gk.LJIIIIZZ("debuginfo", ((BannerDisplayInfo) this.l1).debugInfo);
        c2344009Gk.LJIIIIZZ("search_topic_id", ((BannerDisplayInfo) this.l1).searchTopicId);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public final void LIZ$2() {
        JoinGroupBottomButtonAssem joinGroupBottomButtonAssem = (JoinGroupBottomButtonAssem) this.l1;
        GroupForInvitation groupForInvitation = (GroupForInvitation) this.l2;
        String str = this.s0;
        TextView textView = (TextView) joinGroupBottomButtonAssem.LLJLLL.getValue();
        if (textView != null) {
            textView.setText(groupForInvitation.groupName);
        }
        String str2 = groupForInvitation.avatarUrl;
        C427660Gpo c427660Gpo = (C427660Gpo) joinGroupBottomButtonAssem.LLJZ.getValue();
        if (c427660Gpo != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, str2, false, null, null, false, false, null, null, false, null, 1022);
        }
        C337180DJs.LIZJ(joinGroupBottomButtonAssem.LJJIJL());
        View view = (View) joinGroupBottomButtonAssem.LLJLLIL.getValue();
        if (view != null) {
            C786410Ut5.I7(new AbS166S1200000_19(joinGroupBottomButtonAssem, groupForInvitation, str, 0), view);
        }
    }

    public static final void run$0(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GroupInvitationImpl@19a2.enterChatDirectly$1");
        try {
            aRunnableS23S1200000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupInvitationImpl@19a2.enterChatDirectly$1");
    }

    public static final void run$1(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoTopicBannerViewHolder@d7ad.logEventNew$1");
        try {
            aRunnableS23S1200000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoTopicBannerViewHolder@d7ad.logEventNew$1");
    }

    public static final void run$2(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeLruMemoryAndDiskCache@2be7.putAwemeToDiskCache$1");
        try {
            C20013213Sg c20013213Sg = (C20013213Sg) aRunnableS23S1200000_19.l1;
            String str = aRunnableS23S1200000_19.s0;
            c20013213Sg.LJFF.submit(new ARunnableS23S1200000_19(c20013213Sg, (Aweme) aRunnableS23S1200000_19.l2, str, 3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeLruMemoryAndDiskCache@2be7.putAwemeToDiskCache$1");
    }

    public static final void run$3(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeLruMemoryAndDiskCache@2be7.putToDiskCacheAsync$1");
        try {
            try {
                ((C20013213Sg) aRunnableS23S1200000_19.l1).LJ((Aweme) aRunnableS23S1200000_19.l2, aRunnableS23S1200000_19.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeLruMemoryAndDiskCache@2be7.putToDiskCacheAsync$1");
    }

    public static final void run$4(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("EducatePhotoModeServiceImpl@a1bb.preRenderWebViewNew$1");
        try {
            try {
                C1260720iuc.LIZ.getClass();
                C1260720iuc.LIZIZ();
                EducatePhotoModeServiceImpl educatePhotoModeServiceImpl = (EducatePhotoModeServiceImpl) aRunnableS23S1200000_19.l1;
                BannerDisplayInfo bannerDisplayInfo = (BannerDisplayInfo) aRunnableS23S1200000_19.l2;
                String str = aRunnableS23S1200000_19.s0;
                educatePhotoModeServiceImpl.getClass();
                EducatePhotoModeServiceImpl.LIZLLL(bannerDisplayInfo, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EducatePhotoModeServiceImpl@a1bb.preRenderWebViewNew$1");
    }

    public static final void run$5(ARunnableS23S1200000_19 aRunnableS23S1200000_19) {
        boolean zLIZ;
        C1C7U.LIZ("JoinGroupBottomButtonAssem@c7e7.fetchGroupInvitationState$1");
        try {
            aRunnableS23S1200000_19.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JoinGroupBottomButtonAssem@c7e7.fetchGroupInvitationState$1");
    }

    public ARunnableS23S1200000_19(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
