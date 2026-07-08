package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.FeedComponentsMarginConfig;
import com.ss.android.ugc.feed.platform.ab.UnifyComponentsMarginConfig;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695720RQs {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(321));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(320));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(426));

    public static float LIZLLL(float f) {
        return C341940Daq.LIZIZ(f);
    }

    public static void LIZ(Pair pair, ComponentMarginConfig componentMarginConfig, Function1 function1) {
        if (Math.abs(((Number) pair.getSecond()).floatValue() - C339190DRl.LIZ(componentMarginConfig.bottomGap)) > 2.0f || Math.abs(((Number) pair.getFirst()).floatValue() - C339190DRl.LIZ(componentMarginConfig.topGap)) > 2.0f) {
            function1.invoke(pair);
        }
    }

    public static ComponentMarginConfig LIZIZ(GlobalComponentData globalComponentData, UnifyComponentsMarginConfig unifyComponentsMarginConfig, boolean z) {
        Map<String, ComponentMarginConfig> map;
        ComponentMarginConfig componentMarginConfig;
        Map<String, ComponentMarginConfig> map2;
        ComponentMarginConfig componentMarginConfig2;
        if (globalComponentData == null) {
            return null;
        }
        if (z && !Intrinsics.LJFF(globalComponentData.getMatchedContainerKey(), "bottom_button")) {
            return unifyComponentsMarginConfig.lastComponentConfig;
        }
        String componentKey = globalComponentData.getComponentKey();
        String matchedContainerKey = globalComponentData.getMatchedContainerKey();
        FeedComponentsMarginConfig feedComponentsMarginConfig = unifyComponentsMarginConfig.componentsMarginConfig;
        if (feedComponentsMarginConfig != null && (map2 = feedComponentsMarginConfig.componentCustomConfig) != null && (componentMarginConfig2 = map2.get(componentKey)) != null) {
            return componentMarginConfig2;
        }
        FeedComponentsMarginConfig feedComponentsMarginConfig2 = unifyComponentsMarginConfig.componentsMarginConfig;
        if (feedComponentsMarginConfig2 != null && (map = feedComponentsMarginConfig2.containerCustomConfig) != null && (componentMarginConfig = map.get(matchedContainerKey)) != null) {
            return componentMarginConfig;
        }
        FeedComponentsMarginConfig feedComponentsMarginConfig3 = unifyComponentsMarginConfig.componentsMarginConfig;
        if (feedComponentsMarginConfig3 == null) {
            return null;
        }
        return feedComponentsMarginConfig3.leftContainerCommonSpace;
    }

    public static ComponentMarginConfig LIZJ(ComponentMarginConfig componentMarginConfig, View view, boolean z) {
        int id = view.getId();
        String str = C0RPZ.LJIIJJI;
        if (id == R.id.elm) {
            return componentMarginConfig.copy(componentMarginConfig.bottomGap - ConstraintSizeVM.LLILZLL, componentMarginConfig.topGap);
        }
        if (!z && view.getId() == R.id.elv) {
            return componentMarginConfig.copy(componentMarginConfig.bottomGap - 4, componentMarginConfig.topGap);
        }
        return componentMarginConfig.copy(componentMarginConfig.bottomGap, componentMarginConfig.topGap);
    }
}
