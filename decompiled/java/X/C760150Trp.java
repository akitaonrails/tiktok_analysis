package X;

import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0Trp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760150Trp implements IHostLongPressCallback {
    public final /* synthetic */ LongPressWidget LIZ;

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onDislikePressed() {
        Aweme aweme;
        C1ACA c1acaZ1 = this.LIZ.z1();
        if (c1acaZ1 != null) {
            aweme = c1acaZ1.LIZIZ;
            if (aweme != null && aweme.isAd()) {
                C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
                LongPressWidget longPressWidget = this.LIZ;
                c1047660dMy.U2(longPressWidget.context, aweme, "live_ad", new AwS413S0200000_12(longPressWidget, aweme, 24), new AwS413S0200000_12(this.LIZ, aweme, 25));
                return;
            }
        } else {
            aweme = null;
        }
        if (this.LIZ.LLJIJIL) {
            C766270U4b.LIZLLL(2131842709);
            C1ACA c1acaZ12 = this.LIZ.z1();
            C1440005kM.LIZ(new C1210880hcE(c1acaZ12 != null ? c1acaZ12.LJ : null, "FUNCTION_FROM_DEFAULT", "not_interested", aweme));
        }
    }

    @Override // com.bytedance.android.livesdk.callback.IHostLongPressCallback
    public final void onReportPressed() {
        Aweme aweme;
        LongPressWidget longPressWidget;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme2;
        List<LiveRoomStatesTag> liveRoomStatesTags;
        String str;
        C1ACA c1acaZ12 = this.LIZ.z1();
        if (c1acaZ12 != null) {
            aweme = c1acaZ12.LIZIZ;
            if (aweme != null && !aweme.isAd()) {
                LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                String strLIZ = liveRoomStructLJI != null ? C354201Zc.LIZ(RoomStruct.getStreamType(liveRoomStructLJI)) : null;
                InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                if (interfaceC20673515v3K4 == null || (c1acaZ1 = (longPressWidget = this.LIZ).z1()) == null || (liveRoomStruct = c1acaZ1.LIZJ) == null) {
                    return;
                }
                long j = liveRoomStruct.id;
                long j2 = CastLongProtector.parseLong(liveRoomStruct.owner.getUid());
                long j3 = CastLongProtector.parseLong(liveRoomStruct.owner.getUid());
                String secUid = liveRoomStruct.owner.getSecUid();
                C1ACA c1acaZ13 = longPressWidget.z1();
                String str2 = c1acaZ13 != null ? c1acaZ13.LJ : null;
                String requestId = aweme.getRequestId();
                if (requestId == null) {
                    requestId = "";
                }
                C759930TrT c759930TrT = new C759930TrT(j, j2, j3, secUid, "long_press", str2, "live_cell", "click", "report_anchor", requestId, null, false, strLIZ);
                c759930TrT.LIZ = "full_screen";
                c759930TrT.LJJIIZ = liveRoomStruct.owner.getNickname();
                c759930TrT.LJJIIJZLJL = liveRoomStruct.owner.getUniqueId();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1ACA c1acaZ14 = longPressWidget.z1();
                if (c1acaZ14 != null && (aweme2 = c1acaZ14.LIZIZ) != null && (liveRoomStatesTags = aweme2.getLiveRoomStatesTags()) != null) {
                    for (LiveRoomStatesTag liveRoomStatesTag : liveRoomStatesTags) {
                        String str3 = liveRoomStatesTag.tagKey;
                        if (str3 != null && (str = liveRoomStatesTag.tagValue) != null) {
                            linkedHashMap.put(str3, str);
                        }
                    }
                }
                c759930TrT.LIZIZ = linkedHashMap;
                interfaceC20673515v3K4.LLIIJI(longPressWidget.context, c759930TrT);
                return;
            }
        } else {
            aweme = null;
        }
        C1047660dMy.LIZIZ.a3(this.LIZ.context, aweme, "live_ad", null, true, null);
    }

    public C760150Trp(LongPressWidget longPressWidget) {
        this.LIZ = longPressWidget;
    }
}
