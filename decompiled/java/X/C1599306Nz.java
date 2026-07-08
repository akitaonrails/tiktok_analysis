package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: renamed from: X.06Nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1599306Nz {
    public static final C1599306Nz LIZ = new C1599306Nz();

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static EnumC12995056r LIZJ(C06O1 c06o1) {
        int i = C06O0.LIZIZ[c06o1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC12995056r.DISMISS;
                }
                throw new C1954807lC();
            }
            return EnumC12995056r.CLICK;
        }
        return EnumC12995056r.SHOW;
    }

    public final InterfaceC12999056v LIZ(String str) {
        IFrequencyControlSyncService iFrequencyControlSyncService;
        String strLIZIZ;
        EnumC12986056i enumC12986056i = C1570606Cy.LIZ.get(str);
        if (enumC12986056i == null || (iFrequencyControlSyncService = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null)) == null) {
            return null;
        }
        String sceneName = enumC12986056i.getSceneName();
        if (C06O0.LIZ[enumC12986056i.ordinal()] == 1) {
            strLIZIZ = "legacy_dm_common_banner_streak_pet_invite_v1";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("legacy_dm_common_banner_");
            sbLIZ.append(enumC12986056i.getSceneName());
            sbLIZ.append("_v1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return iFrequencyControlSyncService.LIZ(sceneName, new C054B(strLIZIZ, new C06O2(this), new AwS87S1000000_2(str, 21)));
    }
}
