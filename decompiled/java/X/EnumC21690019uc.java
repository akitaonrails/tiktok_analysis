package X;

/* JADX INFO: renamed from: X.19uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC21690019uc {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    public final String LL;

    EnumC21690019uc(String str) {
        this.LL = str;
    }

    public static EnumC21690019uc valueOf(String str) {
        return (EnumC21690019uc) C08FF.LIZ(EnumC21690019uc.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
