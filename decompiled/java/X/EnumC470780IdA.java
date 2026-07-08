package X;

/* JADX INFO: renamed from: X.0IdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC470780IdA {
    RUNNING(0),
    SUCCESS(1),
    FAILED(-1);

    public final int mStatus;

    public static EnumC470780IdA valueOf(String str) {
        return (EnumC470780IdA) C08FF.LIZ(EnumC470780IdA.class, str);
    }

    EnumC470780IdA(int i) {
        this.mStatus = i;
    }
}
