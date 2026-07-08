package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910050Zn1 {
    public static final C910050Zn1 LIZ = new C910050Zn1();
    public static final String LIZIZ = EnumC12986056i.QUICK_LIVE_REACTION_GUIDE.getSceneName();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(572));

    public static InterfaceC12999056v LIZ() {
        IFrequencyControlSyncService iFrequencyControlSyncService = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null);
        if (iFrequencyControlSyncService != null) {
            return iFrequencyControlSyncService.LIZ(EnumC12986056i.QUICK_LIVE_REACTION_GUIDE.getSceneName(), new C054M("legacy_quick_live_reaction_guide_v1", AFwS201S0000000_14.get$arr$(570), AFwS201S0000000_14.get$arr$(571)));
        }
        return null;
    }

    public static String LIZIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!(!Intrinsics.LJFF(strLIZIZ, "-1")) || strLIZIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_animation_displayed");
        sbLIZ.append('_');
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
