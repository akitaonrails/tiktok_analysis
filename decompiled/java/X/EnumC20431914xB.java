package X;

/* JADX INFO: renamed from: X.14xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public enum EnumC20431914xB {
    SUCCESS(1),
    FAILURE(0),
    CANCEL(2);

    public int value;

    public static EnumC20431914xB valueOf(String str) {
        return (EnumC20431914xB) C08FF.LIZ(EnumC20431914xB.class, str);
    }

    EnumC20431914xB(int i) {
        this.value = i;
    }
}
