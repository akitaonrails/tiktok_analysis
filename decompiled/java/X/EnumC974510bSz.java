package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974510bSz {
    public static final EnumC974510bSz CAPSULE;
    public static final EnumC974510bSz ICON;
    public static final /* synthetic */ EnumC974510bSz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974510bSz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974510bSz enumC974510bSz = new EnumC974510bSz("ICON", 0, "icon");
        ICON = enumC974510bSz;
        EnumC974510bSz enumC974510bSz2 = new EnumC974510bSz("CAPSULE", 1, "capsule");
        CAPSULE = enumC974510bSz2;
        EnumC974510bSz[] enumC974510bSzArr = {enumC974510bSz, enumC974510bSz2};
        LLILLJJLI = enumC974510bSzArr;
        LLILLL = new C2254308sP(enumC974510bSzArr);
    }

    public static EnumC974510bSz[] values() {
        return (EnumC974510bSz[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC974510bSz valueOf(String str) {
        return (EnumC974510bSz) C08FF.LIZ(EnumC974510bSz.class, str);
    }

    public EnumC974510bSz(String str, int i, String str2) {
        this.LL = str2;
    }
}
