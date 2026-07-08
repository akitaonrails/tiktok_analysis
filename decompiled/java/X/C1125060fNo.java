package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0fNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125060fNo {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(long j, LinkedList linkedList) {
        int size = linkedList.size();
        int size2 = linkedList.size();
        AbstractC1126600fQI abstractC1126600fQI = null;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) ListProtector.get(linkedList, i3);
            if ((abstractC1126600fQI2 instanceof C293001Bo) && ((Gift) abstractC1126600fQI2.LIZIZ).LJFF()) {
                if (abstractC1126600fQI != null) {
                    long jLJI = abstractC1126600fQI.LJI();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getSelectGiftId: find magic gift open default selected item success, index=");
                    sbLIZ.append(i3);
                    sbLIZ.append(", magicGiftEntranceIndex=");
                    sbLIZ.append(i3);
                    sbLIZ.append(", panelGiftIndex=");
                    sbLIZ.append(i);
                    sbLIZ.append(", inputGiftId=");
                    sbLIZ.append(j);
                    sbLIZ.append(", outputGiftId=");
                    sbLIZ.append(jLJI);
                    C20441214yg.LJIIIZ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ));
                    return jLJI;
                }
                i2 = i3;
            } else if (abstractC1126600fQI2 != null && (abstractC1126600fQI2 instanceof C1126040fPO)) {
                if (i2 != -1) {
                    long jLJI2 = abstractC1126600fQI2.LJI();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getSelectGiftId: find magic gift open default selected item success, index=");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", magicGiftEntranceIndex=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", panelGiftIndex=");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", inputGiftId=");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", outputGiftId=");
                    sbLIZ2.append(jLJI2);
                    C20441214yg.LJIIIZ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ2));
                    return jLJI2;
                }
                i = i3;
                abstractC1126600fQI = abstractC1126600fQI2;
            } else if (i3 == size - 1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getSelectGiftId: find magic gift open default selected item fail, index=");
                sbLIZ3.append(i3);
                sbLIZ3.append(", magicGiftEntranceIndex=");
                sbLIZ3.append(i2);
                sbLIZ3.append(", panelGiftIndex=");
                sbLIZ3.append(i);
                sbLIZ3.append(", inputGiftId=");
                sbLIZ3.append(j);
                sbLIZ3.append(", outputGiftIdd=");
                sbLIZ3.append(j);
                C20441214yg.LJ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, com.bytedance.android.livesdk.model.Gift r12, com.bytedance.android.livesdk.model.GiftTrayInfo r13, java.lang.String r14, int r15, int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125060fNo.LIZIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdk.model.Gift, com.bytedance.android.livesdk.model.GiftTrayInfo, java.lang.String, int, int, int, java.lang.String):void");
    }
}
