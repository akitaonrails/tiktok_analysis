package X;

/* JADX INFO: renamed from: X.08Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2086808Fm {
    ApiFail("ApiRequest"),
    ApiResultError("ApiResultError"),
    Other("other");

    public final String LL;

    public String getType() {
        return this.LL;
    }

    public static EnumC2086808Fm valueOf(String str) {
        return (EnumC2086808Fm) C08FF.LIZ(EnumC2086808Fm.class, str);
    }

    EnumC2086808Fm(String str) {
        this.LL = str;
    }
}
