package Y;

import X.AbstractRunnableC21377818lM;
import X.AbstractRunnableC874200YRe;
import X.C05O2;
import X.C0CHQ;
import X.C0Y22;
import X.C0Y2B;
import X.C0Y2C;
import X.C0Y3I;
import X.C0Y60;
import X.C0Y8T;
import X.C0YEM;
import X.C0YRZ;
import X.C0Z7A;
import X.C0Z8N;
import X.C12WG;
import X.C1433230nOr;
import X.C1433500nPI;
import X.C1433730nPf;
import X.C1459970o5z;
import X.C15438062q;
import X.C19EG;
import X.C1C7U;
import X.C21378018lO;
import X.C2188811AlT;
import X.C259800zU;
import X.C545820Lau;
import X.C577950Mld;
import X.C855100Xga;
import X.C856140XiG;
import X.C862640Xsk;
import X.C866530Xz1;
import X.C868200Y4c;
import X.C878460YdA;
import X.C878470YdB;
import X.C885830Yp3;
import X.C908310ZkD;
import X.C908330ZkF;
import X.InterfaceC1439070nYH;
import X.InterfaceC1741206rq;
import X.InterfaceC856560Xiw;
import X.InterfaceC863600XuI;
import X.InterfaceC870420YCq;
import X.InterfaceC908320ZkE;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.model.DefaultConvReadInfoHelper;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.msg.GroupCreationAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS57S0010000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS83S0200000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C868200Y4c c868200Y4c = ((DefaultConvReadInfoHelper) this.l0).LL.LJIIZILJ().getDomain().LIZ;
        ArrayList arrayList = new ArrayList((Collection) ((C259800zU) this.l1).element);
        Iterator it2 = ((CopyOnWriteArraySet) c868200Y4c.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC870420YCq) it2.next()).LJIJ(arrayList);
        }
    }

    public final void LIZ$1() {
        String uid;
        MafChatListWidgetV2 mafChatListWidgetV2 = (MafChatListWidgetV2) this.l0;
        List list = (List) this.l1;
        mafChatListWidgetV2.LLJ.clear();
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(((ConcurrentHashMap) mafChatListWidgetV2.LLIZLLLIL).keySet());
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((User) it2.next()).getUid());
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C0Z8N) {
                    arrayList4.add(obj);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                IMUser imUser = ((C0Z8N) it3.next()).getExtra().getImUser();
                if (imUser != null && (uid = imUser.getUid()) != null) {
                    mafChatListWidgetV2.LLJ.add(uid);
                    if (arrayList3.contains(uid)) {
                        mafChatListWidgetV2.Ho(uid);
                        arrayList3.remove(uid);
                    }
                }
            }
        }
    }

    public final void LIZ$2() {
        if (C12WG.LIZIZ((C1459970o5z) this.l0)) {
            return;
        }
        ((C1459970o5z) this.l0).LLLLIL().ww2().removeObserver((AObjectS243S0100000_14) this.l1);
        C1459970o5z.LLJLLL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_story_filter_promote_is_showed");
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String str = CardStruct.IStatusCode.DEFAULT;
        String str2 = (String) settingsManagerLIZLLL.LJIIIIZZ("new_filter_guide_tooltip_version", String.class, CardStruct.IStatusCode.DEFAULT);
        if (str2 != null) {
            str = str2;
        }
        sbLIZ.append(str);
        C862640Xsk.LIZ("keva_repo_story_filter", C2188811AlT.LIZIZ(sbLIZ), new AwS558S0100000_14((C1459970o5z) this.l0, 1180));
    }

    public final void LIZ$3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishSchedule clearPrePublishTask task id = ");
        sbLIZ.append(((C1433500nPI) this.l0).LLILZIL.LIZIZ);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((C1433500nPI) this.l0).LJIILL((C1433230nOr) this.l1);
        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
        C1433730nPf.LJIIIZ = null;
    }

    public static final void run$0(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ChatListConversationDataSource@6f28.solvePreloadResult$1$2");
        try {
            Runnable runnableRemove = ((C878460YdA) aRunnableS83S0200000_14.l0).LJII.remove(((C878470YdB) aRunnableS83S0200000_14.l1).LIZ);
            if (runnableRemove != null) {
                runnableRemove.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.solvePreloadResult$1$2");
    }

    public static final void run$1(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatusSync$1");
        try {
            ((C0YEM) aRunnableS83S0200000_14.l0).LJIIZILJ().getDomain().LIZ.LJJIIJZLJL(new C0Y3I("Update ref list status"), (List) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatusSync$1");
    }

    public static final void run$10(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onDissolveConversation$1");
        try {
            ((GroupCreationAssem) aRunnableS83S0200000_14.l0).yp((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onDissolveConversation$1");
    }

    public static final void run$11(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onSyncConversation$1$1");
        try {
            ((GroupCreationAssem) aRunnableS83S0200000_14.l0).yp((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onSyncConversation$1$1");
    }

    public static final void run$12(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onUpdateConversation$1");
        try {
            ((GroupCreationAssem) aRunnableS83S0200000_14.l0).yp((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupCreationAssem@cc14.conversationObserver$2$1$onUpdateConversation$1");
    }

    public static final void run$13(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aRunnableS83S0200000_14.l0;
        InterfaceC856560Xiw interfaceC856560Xiw = (InterfaceC856560Xiw) aRunnableS83S0200000_14.l1;
        String str = VideoEditContainerScene.LLLLLILLIL;
        videoEditContainerScene.getClass();
        C1C7U.LIZ("VideoEditContainerScene@649c.preloadPublishResources$2L");
        if (videoEditContainerScene.LLLIZZ && C545820Lau.LIZIZ(videoEditContainerScene) != null) {
            Iterator<Integer> it2 = interfaceC856560Xiw.LIZIZ().iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                Context contextLIZIZ = C545820Lau.LIZIZ(videoEditContainerScene);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("publish");
                sbLIZ.append(iIntValue);
                C856140XiG.LIZ(contextLIZIZ, new C855100Xga(C2188811AlT.LIZIZ(sbLIZ), iIntValue));
            }
        }
        C1C7U.LIZIZ("VideoEditContainerScene@649c.preloadPublishResources$2L");
    }

    public static final void run$14(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aRunnableS83S0200000_14.l0;
        InterfaceC856560Xiw interfaceC856560Xiw = (InterfaceC856560Xiw) aRunnableS83S0200000_14.l1;
        String str = VideoEditContainerScene.LLLLLILLIL;
        videoEditContainerScene.getClass();
        C1C7U.LIZ("VideoEditContainerScene@649c.preloadPublishResourcesAfterExitFromPublish$1L");
        Context contextLIZIZ = C545820Lau.LIZIZ(videoEditContainerScene);
        if (contextLIZIZ != null) {
            InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
            if (publishService.LJJIJ()) {
                contextLIZIZ = new ContextThemeWrapper(contextLIZIZ, publishService.LJIILL(contextLIZIZ, videoEditContainerScene.LLJZIJLIL.creativeModel));
            }
            Iterator<Integer> it2 = interfaceC856560Xiw.LIZIZ().iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("publish");
                sbLIZ.append(iIntValue);
                C856140XiG.LIZ(contextLIZIZ, new C855100Xga(C2188811AlT.LIZIZ(sbLIZ), iIntValue));
            }
        }
        C1C7U.LIZIZ("VideoEditContainerScene@649c.preloadPublishResourcesAfterExitFromPublish$1L");
    }

    public static final void run$15(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aRunnableS83S0200000_14.l0;
        C19EG c19eg = (C19EG) aRunnableS83S0200000_14.l1;
        vEVideoPublishPreviewScene.getClass();
        C1C7U.LIZ("VEVideoPublishPreviewScene@ca2a.publishActionWithBundle$1L");
        C0CHQ.LIZ().getPublishService().LJIJJLI(vEVideoPublishPreviewScene.LLJL, c19eg, vEVideoPublishPreviewScene.LLLLLLIL, vEVideoPublishPreviewScene);
        C1C7U.LIZIZ("VEVideoPublishPreviewScene@ca2a.publishActionWithBundle$1L");
    }

    public static final void run$16(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("NewEditToolbarScene@2309.showStoryFilterPromote$1$onChanged$1");
        try {
            aRunnableS83S0200000_14.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewEditToolbarScene@2309.showStoryFilterPromote$1$onChanged$1");
    }

    public static final void run$17(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BizScopedInboxEventManager@2766.subscribe$cleanupTasks$1$1");
        try {
            ((CopyOnWriteArraySet) aRunnableS83S0200000_14.l0).remove((InterfaceC1741206rq) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BizScopedInboxEventManager@2766.subscribe$cleanupTasks$1$1");
    }

    public static final void run$18(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ConversationModelImpl@4b41.updateLocalExt$2");
        try {
            InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) aRunnableS83S0200000_14.l0;
            if (interfaceC863600XuI != null) {
                C866530Xz1 c866530Xz1 = (C866530Xz1) aRunnableS83S0200000_14.l1;
                interfaceC863600XuI.onSuccess(c866530Xz1.LIZLLL.LIZ(c866530Xz1.LIZIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConversationModelImpl@4b41.updateLocalExt$2");
    }

    public static final void run$19(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.cancelPrePublish$1$1");
        try {
            if (((C1433500nPI) aRunnableS83S0200000_14.l0) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishSchedule cancelPrePublish task id = ");
                sbLIZ.append(((C1433500nPI) aRunnableS83S0200000_14.l0).LLILZIL.LIZIZ);
                C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1433500nPI c1433500nPI = (C1433500nPI) aRunnableS83S0200000_14.l0;
            if (c1433500nPI != null) {
                c1433500nPI.LJIILL((C1433230nOr) aRunnableS83S0200000_14.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.cancelPrePublish$1$1");
    }

    public static final void run$2(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseUploadTask@e3e1.onTaskSuccess$1");
        try {
            C0YRZ c0yrz = ((AbstractRunnableC874200YRe) aRunnableS83S0200000_14.l0).LLILLJJLI;
            if (c0yrz != null) {
                c0yrz.onSuccess(aRunnableS83S0200000_14.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseUploadTask@e3e1.onTaskSuccess$1");
    }

    public static final void run$20(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.clearPrePublishTask$1");
        try {
            aRunnableS83S0200000_14.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.clearPrePublishTask$1");
    }

    public static final void run$21(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DeleteConvUpdater@a24d.deleteConv$1");
        try {
            ((C0Y2C) aRunnableS83S0200000_14.l0).LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJIL((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeleteConvUpdater@a24d.deleteConv$1");
    }

    public static final void run$22(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DisbandConvUpdater@9f25.deleteConversation$2");
        try {
            ((C0Y22) aRunnableS83S0200000_14.l0).LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJ((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DisbandConvUpdater@9f25.deleteConversation$2");
    }

    public static final void run$23(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("GroupMemberUpdater@15de.leaveLocalConversation$1");
        try {
            ((C0Y2B) aRunnableS83S0200000_14.l0).LIZ.LJIIZILJ().LIZLLL().LIZLLL().LJI((C0Y8T) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupMemberUpdater@15de.leaveLocalConversation$1");
    }

    public static final void run$3(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConvReadInfoHelper@9d10.callUpdateReadIndex$1");
        try {
            aRunnableS83S0200000_14.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConvReadInfoHelper@9d10.callUpdateReadIndex$1");
    }

    public static final void run$4(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultConversationListModel@a5c5.notifyConversationDissolved$1");
        try {
            if (((ConcurrentHashMap) ((C0Y60) aRunnableS83S0200000_14.l1).LIZ).containsKey(((C0Y8T) aRunnableS83S0200000_14.l0).getConversationId())) {
                ((ConcurrentHashMap) ((C0Y60) aRunnableS83S0200000_14.l1).LIZ).put(((C0Y8T) aRunnableS83S0200000_14.l0).getConversationId(), (C0Y8T) aRunnableS83S0200000_14.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultConversationListModel@a5c5.notifyConversationDissolved$1");
    }

    public static final void run$5(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BioEnrollStepFragment@5a3e.onViewCreated$2");
        try {
            ((BioEnrollStepFragment) aRunnableS83S0200000_14.l0).NR().vQ2((C19EG) aRunnableS83S0200000_14.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BioEnrollStepFragment@5a3e.onViewCreated$2");
    }

    public static final void run$6(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        List list = (List) aRunnableS83S0200000_14.l0;
        C21378018lO c21378018lO = (C21378018lO) aRunnableS83S0200000_14.l1;
        C1C7U.LIZ("TaskScheduler$schedulerCallback$1@2c3c.onTaskSubmitResult$1L");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c21378018lO.c3((AbstractRunnableC21377818lM) it2.next());
        }
        C1C7U.LIZIZ("TaskScheduler$schedulerCallback$1@2c3c.onTaskSubmitResult$1L");
    }

    public static final void run$7(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("MafChatListWidgetV2@1caf.chatListObserver$1$onChatListDataUpdate$1");
        try {
            aRunnableS83S0200000_14.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MafChatListWidgetV2@1caf.chatListObserver$1$onChatListDataUpdate$1");
    }

    public static final void run$8(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        boolean zIsSnapshot;
        C1C7U.LIZ("SessionListBaseVH@932d.special$$inlined$doOnPreDraw$1");
        try {
            C0Z7A.LIZJ(System.currentTimeMillis());
            C885830Yp3 c885830Yp3 = C885830Yp3.LL;
            VO vo = ((SessionListBaseVH) aRunnableS83S0200000_14.l1).LLJJIJIIJIL;
            if (vo != 0) {
                zIsSnapshot = vo.isSnapshot();
            } else {
                zIsSnapshot = false;
            }
            synchronized (c885830Yp3) {
                C885830Yp3.LJ(c885830Yp3, "first_item_show", new AwS57S0010000_14(zIsSnapshot, 0), 2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SessionListBaseVH@932d.special$$inlined$doOnPreDraw$1");
    }

    public static final void run$9(ARunnableS83S0200000_14 aRunnableS83S0200000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMErrorUtils@8723.showNetworkErrorToast$1");
        try {
            if (Intrinsics.LJFF((InterfaceC908320ZkE) aRunnableS83S0200000_14.l0, C908330ZkF.LIZ)) {
                IMNetworkSaasApi.LIZ.getClass();
                IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
                if (iMNetworkSaasApiLIZ != null) {
                    iMNetworkSaasApiLIZ.LIZ((Activity) aRunnableS83S0200000_14.l1, C908310ZkD.LIZ, "");
                }
            } else {
                IMNetworkSaasApi.LIZ.getClass();
                IMNetworkSaasApi iMNetworkSaasApiLIZ2 = C05O2.LIZ();
                if (iMNetworkSaasApiLIZ2 != null) {
                    iMNetworkSaasApiLIZ2.LIZ((Activity) aRunnableS83S0200000_14.l1, (InterfaceC908320ZkE) aRunnableS83S0200000_14.l0, "");
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMErrorUtils@8723.showNetworkErrorToast$1");
    }

    public ARunnableS83S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS83S0200000_14(VEVideoPublishPreviewScene vEVideoPublishPreviewScene, C19EG c19eg, long j, int i) {
        this.$t = i;
        this.l0 = vEVideoPublishPreviewScene;
        this.l1 = c19eg;
    }
}
