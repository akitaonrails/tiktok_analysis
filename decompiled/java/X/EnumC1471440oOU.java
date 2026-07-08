package X;

/* JADX INFO: renamed from: X.0oOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1471440oOU {
    Frame(0),
    TimeInSecond(1);

    public int LL;

    public int getGearType() {
        return this.LL;
    }

    public static EnumC1471440oOU valueOf(String str) {
        return (EnumC1471440oOU) C08FF.LIZ(EnumC1471440oOU.class, str);
    }

    public void setGearType(int i) {
        this.LL = i;
    }

    EnumC1471440oOU(int i) {
        this.LL = i;
    }
}
