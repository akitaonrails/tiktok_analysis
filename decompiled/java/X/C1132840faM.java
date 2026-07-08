package X;

import Y.ARunnableS25S0400000_17;
import Y.AfS36S1000000_17;
import android.os.Looper;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingWatchdogAfterExpireSetting;
import com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFinishInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFullInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftMessage;
import com.bytedance.android.livesdk.model.message.CollabGiftUpdateInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0faM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132840faM implements OnMessageListener {
    public Runnable LLILLJJLI;
    public C19487111Lx LLILLL;
    public Runnable LLILZ;
    public C11JF LLILZIL;
    public DataChannel LLILZLL;
    public IMessageManager LLIZ;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public AbstractC1132210fZL LLIZLLLIL = C1132240fZO.LIZ;

    public final void LIZ() {
        Runnable runnable = this.LLILLJJLI;
        if (runnable != null) {
            this.LL.removeCallbacks(runnable);
        }
        this.LLILLJJLI = null;
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
        Runnable runnable2 = this.LLILZ;
        if (runnable2 != null) {
            this.LL.removeCallbacks(runnable2);
        }
        this.LLILZ = null;
    }

    public final void LJFF(AbstractC1132210fZL abstractC1132210fZL) {
        if (this.LLIZLLLIL == abstractC1132210fZL) {
            return;
        }
        this.LLIZLLLIL = abstractC1132210fZL;
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            dataChannel.zW(CollaborateGiftingStateChannel.class, abstractC1132210fZL);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int i;
        long j;
        String strLIZIZ;
        if (!(iMessage instanceof CollabGiftMessage)) {
            return;
        }
        CollabGiftMessage collabGiftMessage = (CollabGiftMessage) iMessage;
        CollabGiftBaseInfo collabGiftBaseInfo = collabGiftMessage.baseInfo;
        if (collabGiftBaseInfo == null) {
            C20441214yg.LJ("CollaborateGiftingStateMachine", "handleIMsg: baseInfo missing, drop");
            return;
        }
        String str = collabGiftBaseInfo.collabSessionId;
        int i2 = collabGiftMessage.msgType;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                return;
            }
            CollabGiftActiveInfo collabGiftActiveInfo = collabGiftMessage.activeInfo;
            if (collabGiftActiveInfo == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleIMsg: activeInfo missing for type=trigger session=");
                sbLIZ.append(str);
                C20441214yg.LJ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleIMsg: type=");
            if (collabGiftMessage.msgType == 2) {
                strLIZIZ = "trigger";
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fuel session=");
                sbLIZ3.append(str);
                sbLIZ3.append(" expire=");
                sbLIZ3.append(collabGiftActiveInfo.expireTime);
                sbLIZ3.append(" stage=");
                sbLIZ3.append(collabGiftActiveInfo.currentStage);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            sbLIZ2.append(strLIZIZ);
            C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ2));
            LIZJ(str, collabGiftBaseInfo, collabGiftActiveInfo, collabGiftMessage.updateInfo, collabGiftMessage.fullInfo, collabGiftMessage.effect);
            return;
        }
        CollabGiftFinishInfo collabGiftFinishInfo = collabGiftMessage.finishInfo;
        if (collabGiftFinishInfo != null) {
            i = collabGiftFinishInfo.finishReason;
        } else {
            i = 0;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("handleIMsg: FINISH session=");
        sbLIZ4.append(str);
        sbLIZ4.append(" reason=");
        sbLIZ4.append(i);
        C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ4));
        CollabGiftBaseInfo collabGiftBaseInfo2 = collabGiftMessage.baseInfo;
        CollabGiftActiveInfo collabGiftActiveInfo2 = collabGiftMessage.activeInfo;
        CollabGiftFullInfo collabGiftFullInfo = collabGiftMessage.fullInfo;
        AssetsModel assetsModel = collabGiftMessage.effect;
        if (assetsModel != null) {
            j = assetsModel.id;
        } else {
            j = 0;
        }
        LIZIZ(str, i, collabGiftBaseInfo2, collabGiftActiveInfo2, collabGiftFullInfo, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo r25, com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo r26, com.bytedance.android.livesdk.model.message.CollabGiftFullInfo r27, webcast.api.gift.CollabGiftGameplayResponse.Data r28) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132840faM.LIZLLL(com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo, com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo, com.bytedance.android.livesdk.model.message.CollabGiftFullInfo, webcast.api.gift.CollabGiftGameplayResponse$Data):void");
    }

    public final void LIZIZ(String str, int i, CollabGiftBaseInfo collabGiftBaseInfo, CollabGiftActiveInfo collabGiftActiveInfo, CollabGiftFullInfo collabGiftFullInfo, long j) {
        String str2;
        AbstractC1132210fZL abstractC1132210fZL = this.LLIZLLLIL;
        if (abstractC1132210fZL instanceof C1132220fZM) {
            str2 = ((C1132220fZM) abstractC1132210fZL).LIZ;
        } else if (abstractC1132210fZL instanceof C1132230fZN) {
            str2 = ((C1132230fZN) abstractC1132210fZL).LIZ;
        } else {
            str2 = null;
        }
        if (str2 != null && Intrinsics.LJFF(str, str2)) {
            LIZ();
            LJFF(new C1132230fZN(str2, i, collabGiftBaseInfo, collabGiftActiveInfo, collabGiftFullInfo, j));
            LJFF(C1132240fZO.LIZ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleFinish: session mismatch, msg=");
        sbLIZ.append(str);
        sbLIZ.append(" current=");
        sbLIZ.append(str2);
        sbLIZ.append(", drop");
        C20441214yg.LJ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[PHI: r6
      0x00d9: PHI (r6v4 com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo) = 
      (r6v3 com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo)
      (r6v7 com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo)
     binds: [B:47:0x00d6, B:41:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final java.lang.String r26, final com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo r27, final com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo r28, final com.bytedance.android.livesdk.model.message.CollabGiftUpdateInfo r29, final com.bytedance.android.livesdk.model.message.CollabGiftFullInfo r30, com.bytedance.android.livesdk.gift.assets.AssetsModel r31) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132840faM.LIZJ(java.lang.String, com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo, com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo, com.bytedance.android.livesdk.model.message.CollabGiftUpdateInfo, com.bytedance.android.livesdk.model.message.CollabGiftFullInfo, com.bytedance.android.livesdk.gift.assets.AssetsModel):void");
    }

    public final void LJ(final String str, final CollabGiftBaseInfo collabGiftBaseInfo, final CollabGiftActiveInfo collabGiftActiveInfo, CollabGiftUpdateInfo collabGiftUpdateInfo, final CollabGiftFullInfo collabGiftFullInfo, AssetsModel assetsModel, long j, boolean z) {
        final long jLIZJ = j - C158B.LIZJ();
        if (jLIZJ <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCountdownTimer: already expired, session=");
            sbLIZ.append(str);
            sbLIZ.append(" remainingSeconds=");
            sbLIZ.append(jLIZJ);
            C20441214yg.LJ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startCountdownTimer: sessionId=");
        sbLIZ2.append(str);
        sbLIZ2.append(" isNewSession=");
        sbLIZ2.append(z);
        sbLIZ2.append(" remainingSeconds=");
        sbLIZ2.append(jLIZJ);
        C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ2));
        C19487111Lx c19487111Lx = this.LLILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILLL = null;
        LJFF(new C1132220fZM(str, z, jLIZJ, collabGiftBaseInfo, collabGiftActiveInfo, collabGiftUpdateInfo, collabGiftFullInfo, assetsModel, true));
        this.LLILLL = (C19487111Lx) new C11IW(C11NZ.LJJJJL(1L, 1L, TimeUnit.SECONDS, C1701940uOG.LIZIZ()).LJLIIL(jLIZJ).LJJIJIIJIL(new C09JN() { // from class: X.0faF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1132220fZM c1132220fZM;
                C1C7U.LIZ("CollaborateGiftingStateMachine@8efd.startCountdownTimer$1");
                Long l = (Long) obj;
                AbstractC1132210fZL abstractC1132210fZL = this.LL.LLIZLLLIL;
                if ((abstractC1132210fZL instanceof C1132220fZM) && (c1132220fZM = (C1132220fZM) abstractC1132210fZL) != null && Intrinsics.LJFF(c1132220fZM.LIZ, str)) {
                    this.LL.LJFF(C1132220fZM.LIZ(c1132220fZM, (jLIZJ - l.longValue()) - 1, null, null, null, null, null, false, 249));
                }
                C1C7U.LIZIZ("CollaborateGiftingStateMachine@8efd.startCountdownTimer$1");
            }
        }).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0faN
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C1132220fZM c1132220fZM;
                AbstractC1132210fZL abstractC1132210fZL = this.LIZ.LLIZLLLIL;
                String str2 = null;
                if ((abstractC1132210fZL instanceof C1132220fZM) && (c1132220fZM = (C1132220fZM) abstractC1132210fZL) != null && Intrinsics.LJFF(c1132220fZM.LIZ, str)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onCountdownExpired: session=");
                    sbLIZ3.append(str);
                    C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ3));
                    C1132840faM c1132840faM = this.LIZ;
                    CollabGiftBaseInfo collabGiftBaseInfo2 = collabGiftBaseInfo;
                    CollabGiftActiveInfo collabGiftActiveInfo2 = collabGiftActiveInfo;
                    CollabGiftFullInfo collabGiftFullInfo2 = collabGiftFullInfo;
                    AbstractC1132210fZL abstractC1132210fZL2 = c1132840faM.LLIZLLLIL;
                    if (abstractC1132210fZL2 instanceof C1132220fZM) {
                        str2 = ((C1132220fZM) abstractC1132210fZL2).LIZ;
                    } else if (abstractC1132210fZL2 instanceof C1132230fZN) {
                        str2 = ((C1132230fZN) abstractC1132210fZL2).LIZ;
                    }
                    if (Intrinsics.LJFF(str2, collabGiftBaseInfo2.collabSessionId)) {
                        ARunnableS25S0400000_17 aRunnableS25S0400000_17 = new ARunnableS25S0400000_17(collabGiftActiveInfo2, c1132840faM, collabGiftBaseInfo2, collabGiftFullInfo2, 8);
                        long expireMs = GiftCollaborateGiftingWatchdogAfterExpireSetting.INSTANCE.getExpireMs();
                        Runnable runnable = c1132840faM.LLILZ;
                        if (runnable != null) {
                            c1132840faM.LL.removeCallbacks(runnable);
                        }
                        c1132840faM.LLILZ = aRunnableS25S0400000_17;
                        C786410Ut5.LJLIIL(expireMs, c1132840faM.LL, aRunnableS25S0400000_17);
                    }
                }
            }
        }).LJJIJIIJI(new AfS36S1000000_17(str, 5))).LJIILL().LJIIZILJ();
    }
}
