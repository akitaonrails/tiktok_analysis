package X;

import Y.AfS181S0100000_12;
import android.util.Log;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Uh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779000Uh8 implements InterfaceC778470UgH<GoodyBagMessage> {
    public final C11NJ LIZ = new C11NJ();
    public DataChannel LIZIZ;

    @Override // X.InterfaceC778470UgH
    public final int LIZ() {
        return C001A.GOODY_BAG_MESSAGE.getIntType();
    }

    @Override // X.InterfaceC778470UgH
    public final void onRelease() {
        this.LIZ.dispose();
    }

    @Override // X.InterfaceC778470UgH
    public final void LIZIZ(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // X.InterfaceC778470UgH
    public final void onMessage(IMessage iMessage) {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        Integer numValueOf;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        Long lValueOf;
        if (iMessage instanceof GoodyBagMessage) {
            GoodyBagMessage goodyBagMessage = (GoodyBagMessage) iMessage;
            int i = goodyBagMessage.type;
            if (i == 1) {
                GoodyBagBaseInfo goodyBagBaseInfo2 = goodyBagMessage.baseInfo;
                if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail2 = goodyBagBaseInfo2.commonDetail) != null && (lValueOf = Long.valueOf(goodyBagCommonDetail2.openAt)) != null) {
                    lValueOf.longValue();
                    this.LIZ.LIZ(C11NZ.LJLJJLL(Long.valueOf(Long.valueOf(lValueOf.longValue() - (System.currentTimeMillis() / 1000)).longValue() - ((long) 30)).longValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 144), new C09JN() { // from class: X.0UhA
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameGoodBagNotice@5b7a.onMessage$2");
                            C20441214yg.LJ("GameGoodBagNotice", Log.getStackTraceString((Throwable) obj));
                            C1C7U.LIZIZ("GameGoodBagNotice@5b7a.onMessage$2");
                        }
                    }));
                    return;
                }
                return;
            }
            if (i != 3 || (goodyBagBaseInfo = goodyBagMessage.baseInfo) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || (numValueOf = Integer.valueOf(goodyBagCommonDetail.joinedHeadcount)) == null) {
                return;
            }
            numValueOf.intValue();
            this.LIZ.LIZ(C11NZ.LJJJJZ(numValueOf).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 145), new C09JN() { // from class: X.0UhB
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameGoodBagNotice@5b7a.onMessage$4");
                    C20441214yg.LJ("GameGoodBagNotice", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameGoodBagNotice@5b7a.onMessage$4");
                }
            }));
        }
    }
}
