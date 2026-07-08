package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Skz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC730430Skz {
    public static final EnumC730430Skz ICON;
    public static final EnumC730430Skz LIST;
    public static final /* synthetic */ EnumC730430Skz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC730430Skz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC730430Skz enumC730430Skz = new EnumC730430Skz("ICON", 0);
        ICON = enumC730430Skz;
        EnumC730430Skz enumC730430Skz2 = new EnumC730430Skz("LIST", 1);
        LIST = enumC730430Skz2;
        EnumC730430Skz[] enumC730430SkzArr = {enumC730430Skz, enumC730430Skz2};
        LL = enumC730430SkzArr;
        LLILLJJLI = new C2254308sP(enumC730430SkzArr);
    }

    public static EnumC730430Skz[] values() {
        return (EnumC730430Skz[]) LL.clone();
    }

    public static EnumC730430Skz valueOf(String str) {
        return (EnumC730430Skz) C08FF.LIZ(EnumC730430Skz.class, str);
    }

    public EnumC730430Skz(String str, int i) {
    }
}
