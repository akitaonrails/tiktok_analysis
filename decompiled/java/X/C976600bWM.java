package X;

/* JADX INFO: renamed from: X.0bWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976600bWM {
    public static final boolean LIZ(EnumC975850bV9 enumC975850bV9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDirectMatchFromOpenedMatchPanel, fromSource: ");
        sbLIZ.append(enumC975850bV9);
        sbLIZ.append(", ");
        sbLIZ.append(C2074808Aw.LJ());
        C20441214yg.LIZIZ("DirectMatchFromOpenedMatchPanel", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC975850bV9 == EnumC975850bV9.INVITER_FROM_FRIEND_RANK && C2074808Aw.LJ()) {
            return true;
        }
        return false;
    }
}
