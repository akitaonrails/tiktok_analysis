package X;

/* JADX INFO: renamed from: X.0Y7E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y7E {
    public static C0Y7G LIZ(C0Y7T c0y7t) {
        C0Y73 c0y73 = c0y7t.LIZ;
        if (!(c0y73 instanceof C0Y76) && !(c0y73 instanceof C0Y75)) {
            if (c0y7t.LJ) {
                if (c0y7t.LIZLLL.LIZ == EnumC868520Y5i.PROCESS_MSG_MISSING_ENTITY) {
                    return C0Y7G.CMD_HANDLED;
                }
                return C0Y7G.UNSUPPORTED;
            }
            return C0Y7G.FAILED_TO_SAVE;
        }
        if (c0y7t.LJ) {
            return C0Y7G.CMD_HANDLED;
        }
        if (c0y7t.LIZIZ != null) {
            return C0Y7G.SAVED;
        }
        return C0Y7G.INVALID_MSG;
    }
}
