package X;

/* JADX INFO: renamed from: X.0GYD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYD {
    public static EnumC428920Grq LIZ(int i) {
        for (EnumC428920Grq enumC428920Grq : EnumC428920Grq.values()) {
            if (enumC428920Grq.getStyleValue() == i) {
                return enumC428920Grq;
            }
        }
        return EnumC428920Grq.HIGH_CONTRAST;
    }
}
