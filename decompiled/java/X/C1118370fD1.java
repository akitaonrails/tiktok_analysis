package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.GiftPanelItemsUpdate;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideWattingDurationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.FansEventMessage;
import com.bytedance.android.livesdk.model.message.GiftUnlockMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.FansLevelInfo;

/* JADX INFO: renamed from: X.0fD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118370fD1 implements OnMessageListener {
    public GiftUnlockMessage LL;
    public C1085980eMm LLILLJJLI;
    public long LLILLL;
    public DataChannel LLILZ;
    public IMessageManager LLILZIL;

    public static void LJ(List list) {
        for (Gift gift : (ArrayList) list) {
            Gift giftFindGiftById = GiftManager.inst().findGiftById(gift.id);
            if (giftFindGiftById != null) {
                giftFindGiftById.giftSubInfo = gift.giftSubInfo;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.message.GiftUnlockMessage r24) {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1118370fD1.LIZ(com.bytedance.android.livesdk.model.message.GiftUnlockMessage):void");
    }

    public final void LIZLLL(List<? extends Gift> list) {
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends Gift> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().id));
            }
            dataChannel.LC0(GiftPanelItemsUpdate.class, arrayList);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        FansLevelInfo fansLevelInfo;
        GiftUnlockMessage giftUnlockMessage;
        if (iMessage instanceof GiftUnlockMessage) {
            LIZ((GiftUnlockMessage) iMessage);
            return;
        }
        if (this.LL == null || !(iMessage instanceof FansEventMessage) || (fansLevelInfo = ((FansEventMessage) iMessage).fansLevelInfo) == null || fansLevelInfo.level != 1 || (giftUnlockMessage = this.LL) == null) {
            return;
        }
        LIZ(giftUnlockMessage);
    }

    public final void LIZIZ(List<? extends Gift> list, Text text, EnumC1120860fH2 enumC1120860fH2, GiftUnlockMessage giftUnlockMessage, boolean z, Integer num, Integer num2) {
        String str;
        Object next;
        Long lValueOf;
        C20441214yg.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble");
        if (text != null) {
            ImageModel imageModel = null;
            if (text != null && (str = text.key) != null && str.length() != 0 && (this.LLILLL + ((long) (LiveGuideWattingDurationSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT))) - System.currentTimeMillis() <= 0) {
                C20441214yg.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble directly");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((Gift) it2.next()).id));
                }
                List listLJJJJLI = C13LP.LJJJJLI(GiftManager.inst().getGiftPageList());
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ((ArrayList) listLJJJJLI).iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(((GiftPage) it3.next()).gifts, arrayList2);
                }
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (arrayList.contains(Long.valueOf(((Gift) next).id))) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Gift gift = (Gift) next;
                if (gift == null) {
                    gift = (Gift) C13LP.LJJJLL(list);
                }
                C20441214yg.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble before post event");
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                if (gift != null) {
                    lValueOf = Long.valueOf(gift.id);
                } else {
                    lValueOf = null;
                }
                if (z && gift != null) {
                    imageModel = gift.image;
                }
                c784440UpuLIZ.LIZIZ(new C1121100fHQ(lValueOf, imageModel, text, enumC1120860fH2, giftUnlockMessage, num, num2, 32));
                C20441214yg.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble after post event");
                this.LLILLL = System.currentTimeMillis();
            }
        }
    }
}
