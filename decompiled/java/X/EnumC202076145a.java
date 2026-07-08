package X;

/* JADX INFO: renamed from: X.145a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC202076145a {
    High(666),
    Middle(555),
    Low(444);

    public int LL;

    public static EnumC202076145a valueOf(String str) {
        return (EnumC202076145a) C08FF.LIZ(EnumC202076145a.class, str);
    }

    public final int getPriority() {
        return this.LL;
    }

    public final void setPriority(int i) {
        this.LL = i;
    }

    EnumC202076145a(int i) {
        this.LL = i;
    }
}
