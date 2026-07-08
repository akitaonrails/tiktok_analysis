package X;

import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import java.util.Map;

/* JADX INFO: renamed from: X.0usE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720520usE {
    public static final boolean LIZIZ(BaseWidgetDO baseWidgetDO) {
        Integer shouldTrackEvent = baseWidgetDO.getShouldTrackEvent();
        if (shouldTrackEvent != null && shouldTrackEvent.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final C1720510usD LIZ(CardDO cardDO, Map<String, ? extends Object> map) {
        boolean z;
        boolean zBooleanValue;
        Integer shouldTrackEvent;
        Map<String, Object> trackingParams = cardDO.getTrackingParams();
        boolean z2 = true;
        if (cardDO.getShouldTrackEvent() == null || ((shouldTrackEvent = cardDO.getShouldTrackEvent()) != null && shouldTrackEvent.intValue() == 1)) {
            z = true;
        } else {
            z = false;
        }
        Integer repeatReportInSinglePage = cardDO.getRepeatReportInSinglePage();
        if (repeatReportInSinglePage == null || repeatReportInSinglePage.intValue() != 1) {
            z2 = false;
        }
        Boolean shouldTrackSection = cardDO.getShouldTrackSection();
        if (shouldTrackSection != null) {
            zBooleanValue = shouldTrackSection.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return new C1720510usD(trackingParams, z, z2, zBooleanValue, map);
    }
}
