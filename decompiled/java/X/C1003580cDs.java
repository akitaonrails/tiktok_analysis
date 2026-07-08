package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.component.gestureupcomponent.AnoleGestureContextModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0cDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003580cDs extends C09AY implements InterfaceC1631630sYr<String, Float, Float, Float, Unit> {
    public final /* synthetic */ AnoleGestureContextModel LL;
    public final /* synthetic */ C1003570cDr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003580cDs(AnoleGestureContextModel anoleGestureContextModel, C1003570cDr c1003570cDr) {
        super(4);
        this.LL = anoleGestureContextModel;
        this.LLILLJJLI = c1003570cDr;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Float f, Float f2, Float f3) {
        String str2;
        String str3;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3 = f.floatValue();
        float fFloatValue4 = f2.floatValue();
        float fFloatValue5 = f3.floatValue();
        AnoleGestureContextModel.SlideContext slideContext = this.LL.getSlideContext();
        if (slideContext != null) {
            C1003570cDr c1003570cDr = this.LLILLJJLI;
            InterfaceC1014270cV7 interfaceC1014270cV7 = c1003570cDr.LLILLL;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 100));
            String rName = EnumC1005330cGh.REFER.getRName();
            AnoleLogInfo logInfo = slideContext.getLogInfo();
            if (logInfo == null || (str2 = logInfo.refer) == null) {
                str2 = "full_screen_slide";
            }
            mapLJIIJ.put(rName, str2);
            String rName2 = EnumC1005330cGh.TAG.getRName();
            AnoleLogInfo logInfo2 = slideContext.getLogInfo();
            if (logInfo2 == null || (str3 = logInfo2.tag) == null) {
                str3 = "draw_ad";
            }
            mapLJIIJ.put(rName2, str3);
            String rName3 = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("gesture_area", "full_screen_gesture");
            pairArr[1] = new Pair("direction", str);
            pairArr[2] = new Pair("distance", Float.valueOf(fFloatValue3));
            Float distanceThresholdMax = slideContext.getDistanceThresholdMax();
            if (distanceThresholdMax != null) {
                fFloatValue = distanceThresholdMax.floatValue();
            } else {
                fFloatValue = 8.0f;
            }
            pairArr[3] = new Pair("distance_threshold_max", Float.valueOf(fFloatValue));
            Float distanceThresholdMin = slideContext.getDistanceThresholdMin();
            if (distanceThresholdMin != null) {
                fFloatValue2 = distanceThresholdMin.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            pairArr[4] = new Pair("distance_threshold_min", Float.valueOf(fFloatValue2));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fFloatValue4);
            sbLIZ.append(',');
            sbLIZ.append(fFloatValue5);
            pairArr[5] = new Pair("locationPoint", C2188811AlT.LIZIZ(sbLIZ));
            mapLJIIJ.put(rName3, C2097608Jq.LJIIJ(pairArr));
            interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), c1003570cDr);
        }
        return Unit.LIZ;
    }
}
