package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C727902sn {
    public static final boolean LIZIZ(List<LogisticExpressionArea> list) {
        Integer num;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<LogisticExpressionArea> it2 = list.iterator();
        while (it2.hasNext()) {
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = it2.next().extraInfo;
            if (logisticsExpressionAreaExtraInfo != null && (num = logisticsExpressionAreaExtraInfo.hideSkuImages) != null && num.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public static final List<C03J5> LIZ(LogisticPanelModule logisticPanelModule, List<LogisticDTO> list, String str, int i) {
        List<LogisticExpressionArea> list2;
        boolean z;
        String str2;
        LogisticDTO next;
        boolean z2;
        LogisticArea logisticArea;
        ArrayList arrayList = new ArrayList();
        if (logisticPanelModule != null && (logisticArea = logisticPanelModule.logisticArea) != null) {
            list2 = logisticArea.logisticExpressionAreas;
        } else {
            list2 = null;
        }
        if (list != null && C756302xN.LIZ(list) && list.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        if (list2 != null) {
            int i2 = 0;
            for (LogisticExpressionArea logisticExpressionArea : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
                    LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea2.extraInfo;
                    if (logisticsExpressionAreaExtraInfo != null && (str2 = logisticsExpressionAreaExtraInfo.logisticsServiceId) != null && list != null) {
                        Iterator<LogisticDTO> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.logisticsServiceId, str2)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LogisticDTO logisticDTO = next;
                        if (logisticDTO != null) {
                            boolean zLJFF = Intrinsics.LJFF(logisticDTO.logisticsServiceId, str);
                            boolean zLJFF2 = Intrinsics.LJFF(logisticDTO.logisticsServiceId, str);
                            Integer num = logisticExpressionArea2.extraInfo.logisticsServiceInvalid;
                            if (num != null && num.intValue() == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList.add(new C03J5(logisticExpressionArea2, logisticDTO, zLJFF, z, zLJFF2, i2, i, z2));
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
