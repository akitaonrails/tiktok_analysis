package Y;

import X.C07IB;
import X.C1558520qew;
import X.C1847770yBT;
import X.C1859250yTz;
import X.C1859260yU0;
import X.C1859280yU2;
import X.C1859290yU3;
import X.C1859300yU4;
import X.C1859370yUB;
import X.C1859430yUH;
import X.C1859590yUX;
import X.C1863280yaU;
import X.C1863450yal;
import X.C1863840ybO;
import X.C19510811Va;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C238400w2;
import X.C689230R1t;
import X.EnumC1847910yBh;
import X.InterfaceC1848340yCO;
import X.InterfaceC1863480yao;
import X.InterfaceC342000Daw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpdateUserSettings;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS21S1300000_27 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C19510811Va c19510811Va = (C19510811Va) this.l1;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_type", this.s0);
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) this.l2;
        c2344009Gk.LJIIIIZZ("anchor_entry", anchorPublishStruct != null ? anchorPublishStruct.title : null);
        c19510811Va.LIZ(c2344009Gk);
        c2344009Gk.LJII((Map) this.l3);
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
    }

    public final void LIZ$1() {
        InterfaceC342000Daw interfaceC342000DawRemove;
        Message messageYy1;
        if (((C1859370yUB) this.l1).getParent() == null) {
            return;
        }
        TakoCardAbility takoCardAbilitySp = ((TakoNewMarkdownAssem) this.l2).sp();
        String str = null;
        if (takoCardAbilitySp != null && (messageYy1 = takoCardAbilitySp.Yy1()) != null) {
            str = messageYy1.uuid;
        }
        if (Intrinsics.LJFF(str, this.s0)) {
            try {
                String str2 = this.s0;
                if (str2 != null && (interfaceC342000DawRemove = C1859590yUX.LIZ.remove(str2)) != null) {
                    C1859430yUH.LIZ((C1859370yUB) this.l1, interfaceC342000DawRemove, C1859250yTz.LIZJ(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)), new C689230R1t(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)), new C1859280yU2(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)), new C1859260yU0(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)), new C1859290yU3(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)), new C1859300yU4(C1558520qew.LJIIL((TakoNewMarkdownAssem) this.l2)));
                    ((TakoNewMarkdownAssem) this.l2).up((Map) this.l3);
                }
                ((TakoNewMarkdownAssem) this.l2).LLLF = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((TakoNewMarkdownAssem) this.l2).LLLF = false;
                throw th;
            }
        }
    }

    public final void LIZ$2() {
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoMixFeed takoMixFeedLJIIIZ2;
        InterfaceC1863480yao interfaceC1863480yaoLIZ = ((C1863280yaU) this.l1).LJI.LIZ();
        String str = this.s0;
        long j = ((C238400w2) this.l2).element;
        ConversationInfo conversationInfo = (ConversationInfo) this.l3;
        UpdateUserSettings updateUserSettings = conversationInfo.conversationUserSettings;
        interfaceC1863480yaoLIZ.LJIIZILJ(new C1863840ybO(str, j, updateUserSettings.showedDisclaimerPopup, updateUserSettings.acceptedDisclaimerPopup, 1, updateUserSettings.showedMemoryGuidePopup, updateUserSettings.switchStatus, updateUserSettings.sendUser, conversationInfo.botId, conversationInfo.botSource, false));
        InterfaceC1863480yao interfaceC1863480yaoLIZ2 = ((C1863280yaU) this.l1).LJI.LIZ();
        ConversationInfo conversationInfo2 = (ConversationInfo) this.l3;
        String str2 = conversationInfo2.conversationId;
        String str3 = conversationInfo2.subConversationId;
        if (str3 == null) {
            str3 = "";
        }
        interfaceC1863480yaoLIZ2.LJIL(C1863450yal.LIZ(new SubConversationConfig(false, str2, str3, conversationInfo2.conversationTitle, 0, 0L, conversationInfo2.readCursor, 0L, conversationInfo2.unreadCount, conversationInfo2.latestMessageTime, conversationInfo2.relatedVideo, 5), ((ConversationInfo) this.l3).readCursor, 2));
        Message message = ((ConversationInfo) this.l3).lastMessage;
        if (message != null) {
            C1863280yaU c1863280yaU = (C1863280yaU) this.l1;
            Message messageLJJIJIIJI = c1863280yaU.LJJIJIIJI(message.uuid);
            TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ3 == null || takoMixFeedLJIIIZ3.cardType != -1 || (C07IB.LIZ() ? (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || takoMixFeedLJIIIZ.status != 3 : message.LJFF() != 3) || messageLJJIJIIJI == null || ((takoMixFeedLJIIIZ2 = messageLJJIJIIJI.LJIIIZ()) != null && takoMixFeedLJIIIZ2.cardType == -1)) {
                message.LIZLLL = message.LIZLLL;
                message.LIZIZ = 6;
                c1863280yaU.LJJJLIIL(message, false, false);
            }
        }
    }

    public static final void run$0(ARunnableS21S1300000_27 aRunnableS21S1300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MultiAnchorPublishExtension@182f.sendDefaultChooseEvent$1");
        try {
            aRunnableS21S1300000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiAnchorPublishExtension@182f.sendDefaultChooseEvent$1");
    }

    public static final void run$1(ARunnableS21S1300000_27 aRunnableS21S1300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoNewMarkdownAssem@242a.applyTakoCarryCachedSpans$2");
        try {
            aRunnableS21S1300000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoNewMarkdownAssem@242a.applyTakoCarryCachedSpans$2");
    }

    public static final void run$2(ARunnableS21S1300000_27 aRunnableS21S1300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MessageOperatorHandler@b589.initTako$9");
        try {
            aRunnableS21S1300000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageOperatorHandler@b589.initTako$9");
    }

    public static final void run$3(ARunnableS21S1300000_27 aRunnableS21S1300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("EventDispatch@4f88.notifyNodeEventCallback$1");
        try {
            ((InterfaceC1848340yCO) aRunnableS21S1300000_27.l1).LIZ((EnumC1847910yBh) aRunnableS21S1300000_27.l2, (C1847770yBT) aRunnableS21S1300000_27.l3, aRunnableS21S1300000_27.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EventDispatch@4f88.notifyNodeEventCallback$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS21S1300000_27(Object obj, C19510811Va c19510811Va, String str, AnchorPublishStruct anchorPublishStruct, Map<String, String> map) {
        this.$t = map;
        this.l1 = obj;
        this.s0 = c19510811Va;
        this.l2 = str;
        this.l3 = anchorPublishStruct;
    }
}
