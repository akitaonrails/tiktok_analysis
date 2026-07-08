package X;

/* JADX INFO: renamed from: X.0YbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877220YbA {
    public static EnumC877300YbI LIZ(int i) {
        EnumC877300YbI enumC877300YbI = EnumC877300YbI.ALL;
        if (i != enumC877300YbI.getValue()) {
            EnumC877300YbI enumC877300YbI2 = EnumC877300YbI.PRIMARY;
            if (i != enumC877300YbI2.getValue()) {
                EnumC877300YbI enumC877300YbI3 = EnumC877300YbI.SECONDARY;
                if (i != enumC877300YbI3.getValue()) {
                    return EnumC877300YbI.NULL;
                }
                return enumC877300YbI3;
            }
            return enumC877300YbI2;
        }
        return enumC877300YbI;
    }
}
