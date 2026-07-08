package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.component.slideupcompoent.model.AnoleUpSlideComponetDataModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0cDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003640cDy {
    public static final void LIZIZ(C1003650cDz c1003650cDz, AnoleUpSlideComponetDataModel anoleUpSlideComponetDataModel) {
        String str;
        String str2;
        InterfaceC1014270cV7 interfaceC1014270cV7 = c1003650cDz.LLILLL;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), 81));
        String rName = EnumC1005330cGh.REFER.getRName();
        AnoleLogInfo logInfo = anoleUpSlideComponetDataModel.getLogInfo();
        if (logInfo == null || (str = logInfo.refer) == null) {
            str = "up_slide";
        }
        mapLJIIJ.put(rName, str);
        String rName2 = EnumC1005330cGh.TAG.getRName();
        AnoleLogInfo logInfo2 = anoleUpSlideComponetDataModel.getLogInfo();
        if (logInfo2 == null || (str2 = logInfo2.tag) == null) {
            str2 = "incentive_ad";
        }
        mapLJIIJ.put(rName2, str2);
        interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), c1003650cDz);
    }

    public static final void LIZ(ViewGroup viewGroup, AFwS252S0000000_16 aFwS252S0000000_16, AwS382S0200000_16 awS382S0200000_16) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (((Boolean) aFwS252S0000000_16.invoke(childAt)).booleanValue()) {
                awS382S0200000_16.invoke(childAt);
            }
            if (childAt instanceof ViewGroup) {
                LIZ((ViewGroup) childAt, aFwS252S0000000_16, awS382S0200000_16);
            }
        }
    }
}
