package X;

/* JADX INFO: renamed from: X.0OI0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI0 {
    public static EnumC617010OHz LIZ(int i) {
        for (EnumC617010OHz enumC617010OHz : EnumC617010OHz.values()) {
            if (enumC617010OHz.getStatus() == i) {
                return enumC617010OHz;
            }
        }
        return EnumC617010OHz.INVALID;
    }
}
