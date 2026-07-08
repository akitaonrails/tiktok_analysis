package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.strategy.StrategyApi;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideCheckParam;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0Ibv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470010Ibv {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ() {
        /*
            X.0JT6<java.util.List<java.lang.String>> r0 = X.InterfaceC1106030et7.Z9
            r2 = 0
            if (r0 == 0) goto Lac
            java.lang.Object r3 = r0.LIZ()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto Lac
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            r1.<init>(r0)
            java.util.Iterator r6 = r3.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            r5 = 1
            if (r0 == 0) goto L77
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "_"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r4 = kotlin.text.a0.LJJLIIIJILLIZJL(r4, r3, r2, r0)
            int r3 = r4.size()
            r0 = 3
            if (r3 != r0) goto L75
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L75
            long r8 = r0.longValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L75
            long r10 = r0.longValue()
            r0 = 2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L75
            long r12 = r0.longValue()
            com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel r7 = new com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel
            r7.<init>(r8, r10, r12)
        L71:
            r1.add(r7)
            goto L1c
        L75:
            r7 = 0
            goto L71
        L77:
            java.util.List r0 = X.C13LP.LJJJJLI(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r9 = r0.iterator()
            r8 = 0
        L87:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r6 = r9.next()
            r0 = r6
            com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel r0 = (com.ss.android.ugc.aweme.feed.adapter.widget.repost.guide.RepostGuideShowRecordsModel) r0
            long r2 = r0.guidanceShowTimestamp
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            r0 = 259200(0x3f480, float:3.63217E-40)
            long r0 = (long) r0
            long r4 = r4 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L87
            r8 = 1
            r7.add(r6)
            goto L87
        Lac:
            X.13BV r7 = X.C13BV.INSTANCE
            goto Lb4
        Laf:
            if (r8 == 0) goto Lb4
            LIZLLL(r7)
        Lb4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C470010Ibv.LIZIZ():java.util.List");
    }

    public static StrategyData LIZJ() {
        C469620IbI.LIZ.getClass();
        return C469620IbI.LIZIZ(19, null, true, false, false);
    }

    public static void LIZLLL(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RepostGuideShowRecordsModel repostGuideShowRecordsModel = (RepostGuideShowRecordsModel) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(repostGuideShowRecordsModel.roomId);
            sbLIZ.append('_');
            sbLIZ.append(repostGuideShowRecordsModel.guidanceShowTimestamp);
            sbLIZ.append('_');
            sbLIZ.append(repostGuideShowRecordsModel.interactTimestamp);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.Z9;
        if (c0jt6 != null) {
            c0jt6.LIZJ(arrayList);
        }
    }

    public static void LIZ(C1ACA c1aca, Function2 function2) {
        LiveRoomStruct liveRoomStruct;
        Long lLIZ;
        String str;
        boolean z;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            long j = liveRoomStruct.id;
            C0JT6<Long> c0jt6 = InterfaceC1106030et7.Y9;
            Boolean boolValueOf = null;
            if (c0jt6 != null) {
                lLIZ = c0jt6.LIZ();
            } else {
                lLIZ = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            long j3 = jCurrentTimeMillis / j2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkAndShowRepostTextGuide nextShowTime: ");
            sbLIZ.append(lLIZ);
            sbLIZ.append(", curTime: ");
            sbLIZ.append(j3);
            sbLIZ.append(", not_reach: ");
            if (lLIZ != null) {
                if (lLIZ.longValue() > j3) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (lLIZ != null && lLIZ.longValue() > j3) {
                function2.invoke(Boolean.FALSE, "not_reach_next_show");
                return;
            }
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null) {
                long j4 = liveRoomStruct2.ownerUserId;
                String strLIZJ = C1516000pYM.LIZJ(new RepostGuideCheckParam(LIZIZ(), System.currentTimeMillis() / j2));
                C480460Ism.LIZ().getClass();
                StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZLLL(StrategyApi.class);
                StrategyData strategyDataLIZJ = LIZJ();
                if (strategyDataLIZJ == null || (str = strategyDataLIZJ.strategyId) == null) {
                    str = "";
                }
                strategyApi.strategyCheckPost(19, str, j, j4, strLIZJ).LJJLL(new AfS176S0100000_7(function2, 199), new C516201zk(function2, 172));
            }
        }
    }
}
