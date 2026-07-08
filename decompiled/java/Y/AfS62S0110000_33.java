package Y;

import X.C09JN;
import X.C1ABF;
import X.C1ACA;
import X.C1C7U;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import webcast.api.room.PreviewTimeReportResponse;

/* JADX INFO: loaded from: classes34.dex */
public class AfS62S0110000_33 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS62S0110000_33 afS62S0110000_33, Object obj) {
        long j;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        C1C7U.LIZ("SubscribeMaskLayerVM@ab82.reportPreViewTime$1$subscribe$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (afS62S0110000_33.z1) {
            PreviewTimeReportResponse.ResponseData responseData = (PreviewTimeReportResponse.ResponseData) baseResponse.data;
            if (responseData != null) {
                j = responseData.remainPreviewTimeMs;
            } else {
                j = 0;
            }
            SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) afS62S0110000_33.l0;
            subscribeMaskLayerVM.LLILZ = j;
            if (j > 0) {
                C1ACA c1aca = (C1ACA) subscribeMaskLayerVM.LL.getValue();
                if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null) {
                    liveRoomStruct2.allowPreviewTime = j;
                }
                C1ACA c1aca2 = (C1ACA) ((SubscribeMaskLayerVM) afS62S0110000_33.l0).LL.getValue();
                if (c1aca2 != null && (liveRoomStruct = c1aca2.LIZJ) != null) {
                    liveRoomStruct.liveSubOnly = 1L;
                }
                ((SubscribeMaskLayerVM) afS62S0110000_33.l0).LLILLL.setValue(new C1ABF(true, j));
            } else {
                subscribeMaskLayerVM.LLILLJJLI.setValue(Boolean.FALSE);
            }
        }
        C1C7U.LIZIZ("SubscribeMaskLayerVM@ab82.reportPreViewTime$1$subscribe$1");
    }

    public static final void accept$1(AfS62S0110000_33 afS62S0110000_33, Object obj) {
        C1C7U.LIZ("SubscribeMaskLayerVM@ab82.reportPreViewTime$1$subscribe$2");
        if (afS62S0110000_33.z1) {
            ((SubscribeMaskLayerVM) afS62S0110000_33.l0).LLILLJJLI.setValue(Boolean.FALSE);
        }
        C1C7U.LIZIZ("SubscribeMaskLayerVM@ab82.reportPreViewTime$1$subscribe$2");
    }

    public AfS62S0110000_33(boolean z, SubscribeMaskLayerVM subscribeMaskLayerVM, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = subscribeMaskLayerVM;
    }
}
