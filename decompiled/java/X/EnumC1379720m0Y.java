package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1379720m0Y {
    public static final /* synthetic */ EnumC1379720m0Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1379720m0Y LONG_PRESS;
    public static final EnumC1379720m0Y SHARE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1379720m0Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1379720m0Y enumC1379720m0Y = new EnumC1379720m0Y("LONG_PRESS", 0, "long_press");
        LONG_PRESS = enumC1379720m0Y;
        EnumC1379720m0Y enumC1379720m0Y2 = new EnumC1379720m0Y("SHARE_PANEL", 1, "share_panel");
        SHARE_PANEL = enumC1379720m0Y2;
        EnumC1379720m0Y[] enumC1379720m0YArr = {enumC1379720m0Y, enumC1379720m0Y2};
        LLILLJJLI = enumC1379720m0YArr;
        LLILLL = new C2254308sP(enumC1379720m0YArr);
    }

    public static EnumC1379720m0Y[] values() {
        return (EnumC1379720m0Y[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC1379720m0Y valueOf(String str) {
        return (EnumC1379720m0Y) C08FF.LIZ(EnumC1379720m0Y.class, str);
    }

    public EnumC1379720m0Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
