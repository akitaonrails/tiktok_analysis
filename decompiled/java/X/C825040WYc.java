package X;

/* JADX INFO: renamed from: X.0WYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825040WYc {
    public static int LIZ(EnumC1525890poJ enumC1525890poJ) {
        if (enumC1525890poJ == null) {
            return EnumC1525890poJ.SpecTopic.getValue();
        }
        return enumC1525890poJ.getValue();
    }

    public static EnumC1525890poJ LIZIZ(int i) {
        EnumC1525890poJ enumC1525890poJFromValue = EnumC1525890poJ.fromValue(i);
        if (enumC1525890poJFromValue == null) {
            return EnumC1525890poJ.SpecTopic;
        }
        return enumC1525890poJFromValue;
    }
}
