package X;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885700Yoq {
    public static void LIZIZ(InterfaceC884180YmO interfaceC884180YmO, String str, List list, InterfaceC879010Ye3 interfaceC879010Ye3, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142, boolean z) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        interfaceC884180YmO.LIZ(activityLIZ, str, list, interfaceC879010Ye3, awS558S0100000_14, awS558S0100000_142, z);
    }

    public static void LIZ(InterfaceC884180YmO interfaceC884180YmO, String str, List list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, boolean z, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142, int i) {
        Activity activityLIZ;
        boolean z2;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        AwS558S0100000_14 awS558S0100000_143 = awS558S0100000_14;
        AwS558S0100000_14 awS558S0100000_144 = null;
        if ((i & 1) != 0 && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            awS558S0100000_143 = null;
        }
        if ((i & 256) == 0) {
            awS558S0100000_144 = awS558S0100000_142;
        }
        interfaceC884180YmO.LIZIZ(activityLIZ, str, list, interfaceC879010Ye3, enumC885270Yo9, z2, z, awS558S0100000_143, awS558S0100000_144);
    }
}
