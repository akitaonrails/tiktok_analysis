package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160050gIF {
    public static final EnumC1160050gIF CACHE;
    public static final EnumC1160050gIF CDN;
    public static final /* synthetic */ EnumC1160050gIF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1160050gIF NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1160050gIF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1160050gIF enumC1160050gIF = new EnumC1160050gIF("NONE", 0, 0);
        NONE = enumC1160050gIF;
        EnumC1160050gIF enumC1160050gIF2 = new EnumC1160050gIF("CACHE", 1, 1);
        CACHE = enumC1160050gIF2;
        EnumC1160050gIF enumC1160050gIF3 = new EnumC1160050gIF("CDN", 2, 2);
        CDN = enumC1160050gIF3;
        EnumC1160050gIF[] enumC1160050gIFArr = {enumC1160050gIF, enumC1160050gIF2, enumC1160050gIF3};
        LLILLJJLI = enumC1160050gIFArr;
        LLILLL = new C2254308sP(enumC1160050gIFArr);
    }

    public static EnumC1160050gIF[] values() {
        return (EnumC1160050gIF[]) LLILLJJLI.clone();
    }

    public final int getFrom() {
        return this.LL;
    }

    public static EnumC1160050gIF valueOf(String str) {
        return (EnumC1160050gIF) C08FF.LIZ(EnumC1160050gIF.class, str);
    }

    public EnumC1160050gIF(String str, int i, int i2) {
        this.LL = i2;
    }
}
