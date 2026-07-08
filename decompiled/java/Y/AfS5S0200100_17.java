package Y;

import X.AbstractC1136060ffY;
import X.C004F;
import X.C098200Yq;
import X.C09JN;
import X.C1087840ePm;
import X.C1109010exv;
import X.C1109020exw;
import X.C1109030exx;
import X.C1109770ez9;
import X.C1116230f9Z;
import X.C1116360f9m;
import X.C1133160fas;
import X.C1133640fbe;
import X.C189200o6;
import X.C1C7U;
import X.C470590Icr;
import X.C501470JlZ;
import X.C766270U4b;
import X.InterfaceC1109140ey8;
import X.InterfaceC1109210eyF;
import X.InterfaceC20236714Gf;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.message.NewPinMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import tikcast.api.star_comment.StarCommentDeleteResponse;
import tikcast.api.star_comment.StarCommentQueue;
import webcast.api.interaction.PinResponse;
import webcast.data.InteractionConflict;
import webcast.data.InteractionConflictItem;

/* JADX INFO: loaded from: classes18.dex */
public class AfS5S0200100_17 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) afS5S0200100_17.l0;
        long j = afS5S0200100_17.j2;
        IMessageManager iMessageManager = (IMessageManager) afS5S0200100_17.l1;
        absAudienceInteractionFragment.getClass();
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.continueAfterWidgetLoaded$2L");
        absAudienceInteractionFragment.LT(j, true);
        iMessageManager.startMessage();
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.continueAfterWidgetLoaded$2L");
    }

    public static final void accept$1(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.launchAnchorRecordApi$2$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - afS5S0200100_17.j2;
        if (baseResponse != null && baseResponse.data != 0) {
            if (((Long) afS5S0200100_17.l0) == null) {
                i2 = 12;
            } else {
                i2 = 15;
            }
            C1133640fbe.LJIIL(i2, null, Long.valueOf(jUptimeMillis), null, 10);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS5S0200100_17.l1;
            Object obj2 = baseResponse.data;
            C189200o6.m2constructorimpl(obj2);
            interfaceC20236714Gf.resumeWith(obj2);
        } else {
            if (((Long) afS5S0200100_17.l0) == null) {
                i = 13;
            } else {
                i = 16;
            }
            C1133640fbe.LJIIL(i, null, Long.valueOf(jUptimeMillis), -1, 2);
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) afS5S0200100_17.l1;
            C098200Yq c098200Yq = new C098200Yq(new Exception("resp is null or resp.data is null"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
        C1C7U.LIZIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.launchAnchorRecordApi$2$1");
    }

    public static final void accept$2(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        int i;
        C1C7U.LIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.launchAnchorRecordApi$2$2");
        Throwable th = (Throwable) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - afS5S0200100_17.j2;
        int i2 = C1133160fas.LIZ(th).LIZ;
        if (((Long) afS5S0200100_17.l0) == null) {
            i = 13;
        } else {
            i = 16;
        }
        C1133640fbe.LJIIL(i, null, Long.valueOf(jUptimeMillis), Integer.valueOf(i2), 2);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS5S0200100_17.l1;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("GiftAnchorPanelRecordPageCenterAssemViewModel@1e9e.launchAnchorRecordApi$2$2");
    }

    public static final void accept$3(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        C1C7U.LIZ("LiveProfileLikeHelper@f45d.onLikeClickDown$2");
        C1087840ePm c1087840ePm = (C1087840ePm) afS5S0200100_17.l0;
        long j = c1087840ePm.LJFF;
        long j2 = afS5S0200100_17.j2;
        Function0 function0 = (Function0) afS5S0200100_17.l1;
        long j3 = j % ((long) c1087840ePm.LJIIJJI);
        if (j3 != 0) {
            c1087840ePm.LIZ((int) j3, j2);
            c1087840ePm.LJFF = 0L;
        }
        function0.invoke();
        C1C7U.LIZIZ("LiveProfileLikeHelper@f45d.onLikeClickDown$2");
    }

    public static final void accept$4(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        StarCommentDeleteResponse.Data data;
        StarCommentQueue starCommentQueue;
        C1C7U.LIZ("StarCommentCenter@1cc2.deleteCommentNoDialog$1$1");
        C470590Icr<StarCommentDeleteResponse.Data> c470590Icr = (C470590Icr) obj;
        if (c470590Icr != null && (data = c470590Icr.data) != null && (starCommentQueue = data.queue) != null) {
            C1116230f9Z c1116230f9Z = (C1116230f9Z) afS5S0200100_17.l0;
            C1116360f9m c1116360f9m = (C1116360f9m) afS5S0200100_17.l1;
            long j = afS5S0200100_17.j2;
            c1116230f9Z.LJ(starCommentQueue, false);
            c1116230f9Z.LJIIIZ(c470590Icr, c1116360f9m, j);
        }
        C1C7U.LIZIZ("StarCommentCenter@1cc2.deleteCommentNoDialog$1$1");
    }

    public static final void accept$5(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        C1C7U.LIZ("StarCommentCenter@1cc2.deleteCommentNoDialog$1$2");
        ((C1116230f9Z) afS5S0200100_17.l0).LJIIIIZZ((Throwable) obj, (C1116360f9m) afS5S0200100_17.l1, afS5S0200100_17.j2);
        C1C7U.LIZIZ("StarCommentCenter@1cc2.deleteCommentNoDialog$1$2");
    }

    public static final void accept$6(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        StarCommentDeleteResponse.Data data;
        StarCommentQueue starCommentQueue;
        C1C7U.LIZ("StarCommentCenter@1cc2.deleteCommentWithDialog$2$1$1");
        C470590Icr<StarCommentDeleteResponse.Data> c470590Icr = (C470590Icr) obj;
        if (c470590Icr != null && (data = c470590Icr.data) != null && (starCommentQueue = data.queue) != null) {
            C1116230f9Z c1116230f9Z = (C1116230f9Z) afS5S0200100_17.l0;
            C1116360f9m c1116360f9m = (C1116360f9m) afS5S0200100_17.l1;
            long j = afS5S0200100_17.j2;
            c1116230f9Z.LJ(starCommentQueue, false);
            C766270U4b.LIZLLL(2131844152);
            c1116230f9Z.LJIIIZ(c470590Icr, c1116360f9m, j);
        }
        C1C7U.LIZIZ("StarCommentCenter@1cc2.deleteCommentWithDialog$2$1$1");
    }

    public static final void accept$7(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        C1C7U.LIZ("StarCommentCenter@1cc2.deleteCommentWithDialog$2$1$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C501470JlZ) {
            C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
        }
        ((C1116230f9Z) afS5S0200100_17.l0).LJIIIIZZ(th, (C1116360f9m) afS5S0200100_17.l1, afS5S0200100_17.j2);
        C1C7U.LIZIZ("StarCommentCenter@1cc2.deleteCommentWithDialog$2$1$2");
    }

    public static final void accept$8(AfS5S0200100_17 afS5S0200100_17, Object obj) {
        PinResponse.ResponseData responseData;
        InteractionConflict interactionConflict;
        PinResponse.ResponseData responseData2;
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        C1C7U.LIZ("PinMessageManager@ae43.pin$4");
        final PinResponse pinResponse = (PinResponse) obj;
        if (pinResponse != null && (responseData2 = pinResponse.data) != null && responseData2.status == 1) {
            C1109020exw c1109020exw = (C1109020exw) afS5S0200100_17.l0;
            long j = afS5S0200100_17.j2;
            PinMessage pinMessage = responseData2.pinMsg;
            if (pinMessage != null) {
                AbstractC1136060ffY abstractC1136060ffYLIZ = C004F.LIZ(pinMessage);
                if (abstractC1136060ffYLIZ != null) {
                    long jLongValue = Long.valueOf(abstractC1136060ffYLIZ.getMessageId()).longValue();
                    AbstractC1136060ffY abstractC1136060ffY = c1109020exw.LJFF;
                    if (abstractC1136060ffY != null && (commonMessageData2 = abstractC1136060ffY.baseMessage) != null) {
                        commonMessageData2.messageId = jLongValue;
                    }
                }
                c1109020exw.LJI = responseData2.pinMsg;
            } else {
                NewPinMessage newPinMessage = responseData2.pinMsgV2;
                if (newPinMessage != null) {
                    AbstractC1136060ffY abstractC1136060ffY2 = c1109020exw.LJFF;
                    if (abstractC1136060ffY2 != null && (commonMessageData = abstractC1136060ffY2.baseMessage) != null) {
                        commonMessageData.messageId = newPinMessage.pinMsgId;
                    }
                    C1109010exv.LIZ.getClass();
                    c1109020exw.LJI = C1109010exv.LIZ(newPinMessage);
                }
            }
            C1109010exv.LJFF(C1109010exv.LIZ, j, c1109020exw);
        } else {
            C1109010exv.LJFF.remove(afS5S0200100_17.j2);
            C1109010exv c1109010exv = C1109010exv.LIZ;
            C1109020exw c1109020exw2 = (C1109020exw) afS5S0200100_17.l0;
            c1109020exw2.LIZLLL = true;
            c1109010exv.getClass();
            C1109010exv.LJIIL(c1109020exw2);
            if (pinResponse != null && (responseData = pinResponse.data) != null && (interactionConflict = responseData.interactionConflict) != null && interactionConflict.isconflict) {
                C1109030exx c1109030exx = C1109030exx.LIZ;
                InterfaceC1109140ey8 interfaceC1109140ey8LIZ = C1109030exx.LIZ(new InterfaceC1109210eyF() { // from class: X.0exy
                    @Override // X.InterfaceC1109210eyF
                    public final boolean LIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
                        InteractionConflict interactionConflict2;
                        List<InteractionConflictItem> list;
                        PinResponse.ResponseData responseData3 = pinResponse.data;
                        if (responseData3 != null && (interactionConflict2 = responseData3.interactionConflict) != null && (list = interactionConflict2.conflictlist) != null) {
                            for (InteractionConflictItem interactionConflictItem : list) {
                                if (interactionConflictItem.itemtype == interfaceC1109140ey8.LJ()) {
                                    if (interactionConflictItem != null) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                            return false;
                        }
                        return false;
                    }
                });
                if (interfaceC1109140ey8LIZ != null) {
                    interfaceC1109140ey8LIZ.LIZJ((C1109770ez9) afS5S0200100_17.l1);
                }
            }
        }
        C1C7U.LIZIZ("PinMessageManager@ae43.pin$4");
    }

    public AfS5S0200100_17(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
