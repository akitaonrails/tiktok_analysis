package X;

import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideSamsungExp;
import com.ss.android.ugc.awemepushlib.experiments.NotificationSettingPageAuthGuideXiaomiExp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09j6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2451409j6 {
    public static final boolean LIZ() {
        String strLIZIZ = C0W9A.LIZIZ();
        boolean zIsV1 = Intrinsics.LJFF(strLIZIZ, "xiaomi") ? NotificationSettingPageAuthGuideXiaomiExp.INSTANCE.isV1() : Intrinsics.LJFF(strLIZIZ, "samsung") ? NotificationSettingPageAuthGuideSamsungExp.INSTANCE.isV1() : NotificationSettingPageAuthGuideExp.INSTANCE.isV1();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isV1, manufacturer: ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", isV1: ");
        sbLIZ.append(zIsV1);
        C1720106oR.LJI("NotificationSettingPageAuthGuideHelper", C2188811AlT.LIZIZ(sbLIZ));
        return zIsV1;
    }
}
