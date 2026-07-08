package X;

/* JADX INFO: renamed from: X.0bMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970370bMJ {
    public static final int LIZIZ() {
        return C915980Zwa.LJFF().xB0().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ() {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970370bMJ.LIZJ():int");
    }

    public static final boolean LIZLLL() {
        return C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_1V1;
    }

    public static final boolean LJ() {
        return C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF() {
        /*
            java.lang.String r1 = X.C975390bUP.LJIIJJI()
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            r3 = 1
            java.util.List r0 = r0.LLILZLL(r3)
            int r2 = r0.size()
            int r0 = r1.hashCode()
            switch(r0) {
                case -329901406: goto L42;
                case 50796: goto L4b;
                case 50797: goto L55;
                case 50798: goto L5e;
                case 51758: goto L67;
                case 48818663: goto L72;
                default: goto L18;
            }
        L18:
            r5 = r2
        L19:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isMatchDropOff: subMatchType "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", currentHostSize "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", subMatchTypeSize "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r4)
            java.lang.String r0 = "MatchConstant"
            X.C20441214yg.LIZIZ(r0, r1)
            if (r2 != r5) goto L41
            r3 = 0
        L41:
            return r3
        L42:
            java.lang.String r0 = "1v1v1v1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L70
            goto L18
        L4b:
            java.lang.String r0 = "1v1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            r5 = 2
            goto L19
        L55:
            java.lang.String r0 = "1v2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            goto L18
        L5e:
            java.lang.String r0 = "1v3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L70
            goto L18
        L67:
            java.lang.String r0 = "2v2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L70
            goto L18
        L70:
            r5 = 4
            goto L19
        L72:
            java.lang.String r0 = "1v1v1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
            goto L18
        L7b:
            r5 = 3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970370bMJ.LJFF():boolean");
    }

    public static final boolean LJI() {
        return (C915980Zwa.LJFF().RY(false).isIdle() && C915980Zwa.LIZIZ().JV1(false).isIdle()) ? false : true;
    }

    public static final boolean LJII() {
        return (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_1V1 || C915980Zwa.LJFF().xB0() == EnumC919170a1j.UNKNOWN) ? false : true;
    }

    public static final boolean LJIIIIZZ() {
        return C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_2V2 || C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_1VN;
    }

    public static final boolean LJIIIZ() {
        return C915980Zwa.LJII().LLILZLL(true).size() == 2 && LJI();
    }

    public static final boolean LJIIJ() {
        return C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_1V1;
    }

    public static final int LIZ(EnumC975850bV9 enumC975850bV9) {
        int i = C974610bT9.LIZ[enumC975850bV9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC970440bMQ.BATTLE_INFO_SCENE_FINISH.getType();
                }
                return EnumC970440bMQ.BATTLE_INFO_SCENE_ENTER_ROOM.getType();
            }
            return EnumC970440bMQ.BATTLE_INFO_SCENE_TASK.getType();
        }
        return EnumC970440bMQ.BATTLE_INFO_SCENE_FINISH.getType();
    }
}
