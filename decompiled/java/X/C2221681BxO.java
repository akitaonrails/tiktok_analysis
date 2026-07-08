package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.model.message.GiftGlobalMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221681BxO {
    public static long LIZ;
    public static IMessageManager LIZIZ;
    public static C2222081By2 LIZJ;
    public static boolean LIZLLL;
    public static C163700jz LJ;
    public static boolean LJFF;
    public static final List<Function0<InterfaceC1132950faX>> LJI = new ArrayList();
    public static boolean LJII;

    public static void LIZJ() {
        IMessageManager iMessageManager = LIZIZ;
        if (iMessageManager != null) {
            iMessageManager.destroyMessage();
        }
        LIZIZ = null;
        LIZJ = null;
        LJ = null;
        C480460Ism c480460IsmLIZ = C480460Ism.LIZ();
        C1502000pBm c1502000pBm = C1501980pBk.LIZ().LIZLLL;
        c480460IsmLIZ.getClass();
        ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).Pg0(c1502000pBm);
    }

    public static void LIZ(IMessageManager iMessageManager) {
        InterfaceC1132950faX interfaceC1132950faX;
        for (Function0 function0 : (ArrayList) LJI) {
            if (function0 != null && (interfaceC1132950faX = (InterfaceC1132950faX) function0.invoke()) != null) {
                interfaceC1132950faX.LIZ(LIZIZ);
                if (iMessageManager != null) {
                    iMessageManager.addInterceptor(interfaceC1132950faX);
                }
            }
        }
    }

    public static boolean LIZLLL(IMessageManager iMessageManager) {
        EnumC19379710rr enumC19379710rr;
        C2222081By2 messageConfiguration;
        C2222091By3 c2222091By3;
        if (iMessageManager != null && (messageConfiguration = iMessageManager.getMessageConfiguration()) != null && (c2222091By3 = messageConfiguration.LIZ) != null) {
            enumC19379710rr = c2222091By3.LJIILIIL;
        } else {
            enumC19379710rr = null;
        }
        if (enumC19379710rr == EnumC19379710rr.PREVIEW) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(final long j, IMessageManager iMessageManager) {
        LJII = true;
        LIZ(iMessageManager);
        IInterceptor iInterceptor = new IInterceptor(j) { // from class: X.0f8h
            public final long LL;

            {
                this.LL = j;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
            public final boolean onMessage(IMessage iMessage) {
                CommonMessageData commonMessageData;
                AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
                if ((abstractC1136060ffY instanceof LiveIntroMessage) && abstractC1136060ffY.baseMessage != null) {
                    abstractC1136060ffY.baseMessage.roomId = this.LL;
                    return false;
                }
                if ((abstractC1136060ffY instanceof MarqueeAnnouncementMessage) || (abstractC1136060ffY instanceof GiftGlobalMessage) || (abstractC1136060ffY instanceof PrivilegeAdvanceMessage) || (abstractC1136060ffY instanceof PrivilegeDynamicEffectMessage) || LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue() || (commonMessageData = abstractC1136060ffY.baseMessage) == null || commonMessageData.roomId == this.LL) {
                    return false;
                }
                MessageMonitor.markDispatchStatus(iMessage, MessageMonitor.DispatchStatus.SKIPPING_NOT_CURRENT_ROOM);
                return true;
            }
        };
        if (iMessageManager != null) {
            iMessageManager.addInterceptor(iInterceptor);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.1BxP] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.1Bxn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ugc.live.sdk.message.interfaces.IMessageManager LJ(android.content.Context r17, long r18, boolean r20, long r21, boolean r23, boolean r24, X.EnumC19379710rr r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221681BxO.LJ(android.content.Context, long, boolean, long, boolean, boolean, X.10rr, boolean):com.ss.ugc.live.sdk.message.interfaces.IMessageManager");
    }
}
