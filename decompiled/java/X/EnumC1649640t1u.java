package X;

/* JADX INFO: renamed from: X.0t1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public enum EnumC1649640t1u {
    BEGIN(1),
    END(2);

    public final int LL;

    EnumC1649640t1u(int i) {
        this.LL = i;
    }

    public static EnumC1649640t1u valueOf(String str) {
        return (EnumC1649640t1u) C08FF.LIZ(EnumC1649640t1u.class, str);
    }

    public int getStatus() {
        return this.LL;
    }
}
