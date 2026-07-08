package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770310wAX {
    public static final EnumC1770310wAX COPY;
    public static final EnumC1770310wAX DELETE;
    public static final EnumC1770310wAX EDIT;
    public static final /* synthetic */ EnumC1770310wAX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770310wAX PLACEHOLDER;
    public static final EnumC1770310wAX SCALE;
    public static final EnumC1770310wAX TRACKING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770310wAX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770310wAX enumC1770310wAX = new EnumC1770310wAX("DELETE", 0, "delete");
        DELETE = enumC1770310wAX;
        EnumC1770310wAX enumC1770310wAX2 = new EnumC1770310wAX("COPY", 1, "copy");
        COPY = enumC1770310wAX2;
        EnumC1770310wAX enumC1770310wAX3 = new EnumC1770310wAX("SCALE", 2, "resize");
        SCALE = enumC1770310wAX3;
        EnumC1770310wAX enumC1770310wAX4 = new EnumC1770310wAX("EDIT", 3, "edit");
        EDIT = enumC1770310wAX4;
        EnumC1770310wAX enumC1770310wAX5 = new EnumC1770310wAX("PLACEHOLDER", 4, "place_holder");
        PLACEHOLDER = enumC1770310wAX5;
        EnumC1770310wAX enumC1770310wAX6 = new EnumC1770310wAX("TRACKING", 5, "tracking");
        TRACKING = enumC1770310wAX6;
        EnumC1770310wAX[] enumC1770310wAXArr = {enumC1770310wAX, enumC1770310wAX2, enumC1770310wAX3, enumC1770310wAX4, enumC1770310wAX5, enumC1770310wAX6};
        LLILLJJLI = enumC1770310wAXArr;
        LLILLL = new C2254308sP(enumC1770310wAXArr);
    }

    public static EnumC1770310wAX[] values() {
        return (EnumC1770310wAX[]) LLILLJJLI.clone();
    }

    public final String getReportName() {
        return this.LL;
    }

    public static EnumC1770310wAX valueOf(String str) {
        return (EnumC1770310wAX) C08FF.LIZ(EnumC1770310wAX.class, str);
    }

    public EnumC1770310wAX(String str, int i, String str2) {
        this.LL = str2;
    }
}
