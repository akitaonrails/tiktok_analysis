package X;

/* JADX INFO: renamed from: X.0Wo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC834230Wo1 {
    LaunchActivityEmptyContent(1),
    LaunchActivityParseContentError(2);

    public final int LL;

    public static EnumC834230Wo1 valueOf(String str) {
        return (EnumC834230Wo1) C08FF.LIZ(EnumC834230Wo1.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC834230Wo1(int i) {
        this.LL = i;
    }
}
