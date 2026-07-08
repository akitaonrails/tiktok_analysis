package X;

/* JADX INFO: renamed from: X.1AtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193691AtL {
    public static final /* synthetic */ int LIZ = 0;

    public static C2193701AtM LIZ(Integer num) {
        if (num != null && num.intValue() != -1) {
            if (num.intValue() != 1 && num.intValue() != 4) {
                if (num.intValue() == 3004051) {
                    return new C2193701AtM(num.intValue(), EnumC2193681AtK.INVALID_SCOPE);
                }
                if (num.intValue() == 3004049) {
                    return new C2193701AtM(num.intValue(), EnumC2193681AtK.UNAUTHORIZED_CLIENT);
                }
                if (num.intValue() == 10038) {
                    return new C2193701AtM(num.intValue(), EnumC2193681AtK.INVALID_REQUEST);
                }
                if (num.intValue() != 5 && num.intValue() != 3004048 && num.intValue() != 3004050 && num.intValue() != 3004052 && num.intValue() != 3004056) {
                    return new C2193701AtM(num.intValue(), EnumC2193681AtK.SERVER_ERROR);
                }
                return new C2193701AtM(num.intValue(), EnumC2193681AtK.INVALID_REQUEST);
            }
            return new C2193701AtM(num.intValue(), EnumC2193681AtK.SERVER_ERROR);
        }
        return new C2193701AtM(-1, EnumC2193681AtK.TEMPORARILY_UNAVAILABLE);
    }
}
