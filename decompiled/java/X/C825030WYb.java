package X;

/* JADX INFO: renamed from: X.0WYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825030WYb {
    public static int LIZ(EnumC1527250pqV enumC1527250pqV) {
        if (enumC1527250pqV == null) {
            return EnumC1527250pqV.Device.getValue();
        }
        return enumC1527250pqV.getValue();
    }

    public static EnumC1527250pqV LIZIZ(int i) {
        EnumC1527250pqV enumC1527250pqVFromValue = EnumC1527250pqV.fromValue(i);
        if (enumC1527250pqVFromValue == null) {
            return EnumC1527250pqV.Device;
        }
        return enumC1527250pqVFromValue;
    }
}
