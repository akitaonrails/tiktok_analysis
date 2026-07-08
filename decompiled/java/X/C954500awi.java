package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;

/* JADX INFO: renamed from: X.0awi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954500awi {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(InterfaceC950030apV interfaceC950030apV) {
        boolean zLJJLIIIJJI = interfaceC950030apV.LJJLIIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCohostWithGuestLayoutIfInProgress");
        sbLIZ.append(", isInHostWithGuest = ");
        sbLIZ.append(zLJJLIIIJJI);
        C20441214yg.LIZIZ("HostWithGuestLayoutConfig", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJJLIIIJJI) {
            return LiveCoHostLayoutIdConfigSetting.INSTANCE.getValue().cohostWithGuest;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[LOOP:4: B:44:0x00f0->B:46:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162 A[EDGE_INSN: B:93:0x0162->B:58:0x0162 BREAK  A[LOOP:5: B:47:0x011f->B:55:0x015c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(X.InterfaceC950030apV r13) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954500awi.LIZIZ(X.0apV):java.util.Map");
    }
}
