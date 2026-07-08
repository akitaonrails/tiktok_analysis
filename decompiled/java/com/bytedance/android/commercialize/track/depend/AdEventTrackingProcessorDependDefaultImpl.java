package com.bytedance.android.commercialize.track.depend;

import X.C1029000css;
import X.C1029010cst;
import X.C1029060csy;
import X.C1029100ct2;
import X.InterfaceC1028790csX;
import X.InterfaceC1029080ct0;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes17.dex */
public final class AdEventTrackingProcessorDependDefaultImpl implements IAdEventTrackingProcessorDepend {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cst] */
    @Override // com.bytedance.android.commercialize.track.depend.IAdEventTrackingProcessorDepend
    public final C1029010cst LIZ() {
        return new InterfaceC1029080ct0<C1029060csy>() { // from class: X.0cst
            @Override // X.InterfaceC1029080ct0
            public final void LIZIZ(C1029060csy c1029060csy) {
                String strValueOf;
                String logExtra;
                String strValueOf2;
                Long groupId;
                Long creativeId;
                String str = c1029060csy.LIZ;
                String str2 = c1029060csy.LIZIZ;
                C1028760csU c1028760csU = c1029060csy.LIZJ;
                C588050N4p c588050N4p = c1029060csy.LIZLLL;
                c588050N4p.LIZ("tag", str);
                c588050N4p.LIZ("refer", str2);
                c588050N4p.LIZ("is_ad_event", "1");
                c588050N4p.LIZ("category", "event_v3");
                C1029040csw c1029040csw = (C1029040csw) c1028760csU.LIZ(C1029040csw.class);
                if (c1029040csw != null) {
                    CommonAdData commonAdData = c1029040csw.LIZ;
                    if (commonAdData != null && (creativeId = commonAdData.getCreativeId()) != null) {
                        strValueOf = String.valueOf(creativeId);
                    } else {
                        strValueOf = c1029040csw.LIZIZ;
                    }
                    c588050N4p.LIZ("value", strValueOf);
                    CommonAdData commonAdData2 = c1029040csw.LIZ;
                    if (commonAdData2 == null || (logExtra = commonAdData2.getLogExtra()) == null) {
                        logExtra = c1029040csw.LIZJ;
                    }
                    c588050N4p.LIZ("log_extra", logExtra);
                    CommonAdData commonAdData3 = c1029040csw.LIZ;
                    if (commonAdData3 != null && (groupId = commonAdData3.getGroupId()) != null) {
                        strValueOf2 = String.valueOf(groupId);
                    } else {
                        strValueOf2 = c1029040csw.LIZLLL;
                        if (strValueOf2 == null) {
                            strValueOf2 = CardStruct.IStatusCode.DEFAULT;
                        }
                    }
                    c588050N4p.LIZ("group_id", strValueOf2);
                }
            }
        };
    }

    @Override // com.bytedance.android.commercialize.track.depend.IAdEventTrackingProcessorDepend
    public final InterfaceC1028790csX LIZIZ() {
        return new C1029000css(new C1029100ct2());
    }
}
