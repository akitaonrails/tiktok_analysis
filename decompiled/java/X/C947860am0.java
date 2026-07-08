package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LayoutConfig;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0am0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947860am0 {
    public static final LayoutConfig LIZIZ() {
        int panelLayoutType = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
        int iLIZJ = C940770aaZ.LIZ().getDataSource().LIZJ() - 1;
        if (panelLayoutType > 0) {
            LayoutConfig layoutConfig = new LayoutConfig();
            layoutConfig.panelLayoutType = panelLayoutType;
            layoutConfig.micCount = iLIZJ;
            return layoutConfig;
        }
        LayoutConfig layoutConfig2 = new LayoutConfig();
        layoutConfig2.panelLayoutType = 1;
        layoutConfig2.micCount = 0;
        return layoutConfig2;
    }

    public static final LayoutConfig LIZ(String str) {
        int i;
        if (str != null && !a0.LJJJIL(str)) {
            LayoutConfig layoutConfig = (LayoutConfig) C937280aUw.LIZJ(LayoutConfig.class, str, new LayoutConfig());
            if (layoutConfig.panelLayoutType <= 0) {
                C942210act c942210act = C942210act.LIZ;
                int i2 = layoutConfig.layoutType;
                c942210act.getClass();
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                i = 1;
                            } else {
                                i = 5;
                            }
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                layoutConfig.panelLayoutType = i;
            }
            C942210act.LIZ.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(2);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(3);
            arrayList.add(6);
            if (C934960aRC.LIZ() >= 1) {
                arrayList.add(11);
            }
            arrayList.add(7);
            if (C934960aRC.LIZ() >= 1) {
                arrayList.add(12);
            }
            if (arrayList.contains(Integer.valueOf(layoutConfig.panelLayoutType))) {
                return layoutConfig;
            }
            return null;
        }
        return null;
    }

    public static final boolean LIZJ(LayoutConfig layoutConfig, Function1<? super Boolean, Unit> function1) {
        int panelLayoutType = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
        int iLIZJ = C940770aaZ.LIZ().getDataSource().LIZJ() - 1;
        if (Intrinsics.LJFF(((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).IY(), "co_host")) {
            function1.invoke(Boolean.FALSE);
            return false;
        }
        if (layoutConfig == null) {
            if (panelLayoutType > 0) {
                C20441214yg.LIZIZ("PlaybookDecoration", "layoutConditionMet true, layoutConfig==null & currentPanelLayoutType > 0");
                function1.invoke(Boolean.TRUE);
                return true;
            }
        } else {
            int i = layoutConfig.panelLayoutType;
            if (i != 2 && i != 4) {
                if (i == panelLayoutType && iLIZJ == layoutConfig.micCount) {
                    C20441214yg.LIZIZ("PlaybookDecoration", "layoutConditionMet true, not flow");
                    function1.invoke(Boolean.TRUE);
                    return true;
                }
            } else if (i == panelLayoutType) {
                C20441214yg.LIZIZ("PlaybookDecoration", "layoutConditionMet true, flow");
                function1.invoke(Boolean.TRUE);
                return true;
            }
        }
        function1.invoke(Boolean.FALSE);
        return false;
    }

    public static final void LIZLLL(LayoutConfig layoutConfig, Function2<? super Boolean, ? super String, Unit> function2) {
        C940770aaZ.LIZ().getAction().LJFF(layoutConfig.panelLayoutType, layoutConfig.micCount + 1, new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 646), new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 647));
    }
}
