package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0RUD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUD extends C0RTA {
    public ComponentStrategy LLJILJILJ;
    public String LLJILLL;
    public Integer LLJJ = 0;
    public Integer LLJJI = 0;

    public static C0RUB LJII() {
        return new C0RUB(EnumC695670RQn.NEVER_LAZY, false, C0CMJ.HIGH_PRIORITY.getType(), "");
    }

    public final C0RUB LJI(String str, boolean z) {
        Integer num;
        ComponentStrategy componentStrategy;
        EnumC695670RQn enumC695670RQnLIZ;
        ComponentStrategy componentStrategy2 = this.LLJILJILJ;
        if (str == null && componentStrategy2 == null) {
            return LJII();
        }
        Integer num2 = this.LLJJI;
        if ((num2 == null || num2.intValue() != 0) && ((num = this.LLJJI) == null || num.intValue() != 61)) {
            return LJII();
        }
        if (!Intrinsics.LJFF(this.LLJILLL, "homepage_hot")) {
            if (this.LLJJ != null && C304510Bwf.LIZ() && str != null && ((Set) C097900Yn.LIZIZ.getValue()).contains(str)) {
                IntRange intRange = new IntRange(0, C304510Bwf.LIZIZ());
                Integer num3 = this.LLJJ;
                if (num3 != null && intRange.LJLJL(num3.intValue())) {
                    return new C0RUB(EnumC695670RQn.SPLIT_TO_FRAME, true, C0CMJ.HIGH_PRIORITY.getType(), str);
                }
            }
            return LJII();
        }
        EnumC695670RQn enumC695670RQnLIZ2 = null;
        if (componentStrategy2 == null) {
            if (str != null) {
                componentStrategy = (ComponentStrategy) ((Map) C0RUC.LIZ.getValue()).get(str);
            } else {
                componentStrategy = null;
            }
        } else {
            componentStrategy = componentStrategy2;
        }
        Integer num4 = this.LLJJ;
        if (num4 == null || num4.intValue() != 0) {
            if (componentStrategy != null) {
                enumC695670RQnLIZ = C695690RQp.LIZ(componentStrategy);
            } else {
                enumC695670RQnLIZ = null;
            }
            if (enumC695670RQnLIZ != EnumC695670RQn.START_UP_END) {
                if (componentStrategy != null) {
                    enumC695670RQnLIZ2 = C695690RQp.LIZ(componentStrategy);
                }
                if (enumC695670RQnLIZ2 != EnumC695670RQn.SECOND_VIDEO_HAS_LEFT) {
                    if (num4 != null && C304510Bwf.LIZ() && str != null && ((Set) C097800Ym.LIZIZ.getValue()).contains(str) && new IntRange(1, C304510Bwf.LIZIZ()).LJLJL(num4.intValue())) {
                        return new C0RUB(EnumC695670RQn.SPLIT_TO_FRAME, true, C0CMJ.HIGH_PRIORITY.getType(), str);
                    }
                    return LJII();
                }
            }
        }
        if (componentStrategy2 == null) {
            if (componentStrategy == null) {
                if (z && str != null) {
                    return new C0RUB(EnumC695670RQn.FIRST_VIDEO_SHOW, true, C0CMJ.HIGH_PRIORITY.getType(), str);
                }
                if (((Boolean) C283200B8c.LIZ.getValue()).booleanValue() && !C13LP.LJJJJ(str, (Set) C0RUC.LIZIZ.getValue())) {
                    C1AF0.LIZJ("tag: " + str + " miss strategy");
                }
                return LJII();
            }
            componentStrategy2 = componentStrategy;
        }
        if (C312230CLt.LJFF(C0RUC.LJIIJ(C695690RQp.LIZ(componentStrategy2)))) {
            return LJII();
        }
        return new C0RUB(C695690RQp.LIZ(componentStrategy2), true, componentStrategy2.priority, componentStrategy2.tag, componentStrategy2.timeoutDuration, componentStrategy2.idleTrigger, componentStrategy2.ignoreSurfaceView);
    }
}
