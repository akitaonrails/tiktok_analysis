package X;

/* JADX INFO: renamed from: X.0apk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950180apk {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(EnumC950120ape enumC950120ape, EnumC950120ape enumC950120ape2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkUpdateState, curState = ");
        sbLIZ.append(enumC950120ape);
        sbLIZ.append(", newState = ");
        sbLIZ.append(enumC950120ape2);
        sbLIZ.append(", force = ");
        sbLIZ.append(z);
        sbLIZ.append(", source=");
        sbLIZ.append("MultiHostCrossAdapter");
        C20441214yg.LJIIIZ("MultiHostStateHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (!z && enumC950120ape2.getValue() <= enumC950120ape.getValue()) {
            return false;
        }
        return true;
    }
}
