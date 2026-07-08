package X;

/* JADX INFO: renamed from: X.0dJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1045410dJL {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String LL;

    EnumC1045410dJL(String str) {
        this.LL = str;
    }

    public static EnumC1045410dJL valueOf(String str) {
        return (EnumC1045410dJL) C08FF.LIZ(EnumC1045410dJL.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }
}
