package X;

import com.bytedance.android.livesdk.dataChannel.LiveCenterForceRefreshEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS434S0200000_33;
import webcast.data.AnchorGrowTaskListItem;

/* JADX INFO: renamed from: X.1AGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AGZ extends C2217421BqW implements Function0<Unit> {
    public C1AGZ(C2176501AGa c2176501AGa) {
        super(0, c2176501AGa, C2176501AGa.class, "updateCountDown", "updateCountDown()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AnchorGrowTaskListItem anchorGrowTaskListItem;
        Long lValueOf;
        C2176501AGa c2176501AGa = (C2176501AGa) this.receiver;
        C2176601AGk c2176601AGk = c2176501AGa.LLILZLL;
        if (c2176601AGk != null) {
            C500260Jjc.LJJLIIIJJIZ(new AwS434S0200000_33(c2176601AGk, c2176501AGa, 157));
            AnchorGrowTaskListItem anchorGrowTaskListItem2 = c2176601AGk.LIZLLL;
            if ((anchorGrowTaskListItem2 != null ? anchorGrowTaskListItem2.taskExpireTime : System.currentTimeMillis()) - System.currentTimeMillis() < 1000 && (anchorGrowTaskListItem = c2176601AGk.LIZLLL) != null && (lValueOf = Long.valueOf(anchorGrowTaskListItem.taskId)) != null && lValueOf.longValue() >= 0) {
                Map<Long, Integer> map = C2176561AGg.LIZJ;
                Object obj = ((LinkedHashMap) map).get(lValueOf);
                if (obj == null) {
                    obj = 0;
                }
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue >= 0 && iIntValue < 8) {
                    map.put(lValueOf, Integer.valueOf(iIntValue + 1));
                    DataChannel dataChannel = c2176501AGa.LL;
                    if (dataChannel != null) {
                        dataChannel.FQ2(LiveCenterForceRefreshEvent.class);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
