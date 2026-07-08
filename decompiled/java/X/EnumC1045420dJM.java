package X;

/* JADX INFO: renamed from: X.0dJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1045420dJM {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    public final String LL;

    EnumC1045420dJM(String str) {
        this.LL = str;
    }

    public static EnumC1045420dJM valueOf(String str) {
        return (EnumC1045420dJM) C08FF.LIZ(EnumC1045420dJM.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
