package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671630QWb {
    public static final EnumC671630QWb ICON;
    public static final /* synthetic */ EnumC671630QWb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671630QWb TEXT;
    public static final EnumC671630QWb TEXT_AND_ICON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC671630QWb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671630QWb enumC671630QWb = new EnumC671630QWb("TEXT", 0, "text");
        TEXT = enumC671630QWb;
        EnumC671630QWb enumC671630QWb2 = new EnumC671630QWb("ICON", 1, "icon");
        ICON = enumC671630QWb2;
        EnumC671630QWb enumC671630QWb3 = new EnumC671630QWb("TEXT_AND_ICON", 2, "textandicon");
        TEXT_AND_ICON = enumC671630QWb3;
        EnumC671630QWb[] enumC671630QWbArr = {enumC671630QWb, enumC671630QWb2, enumC671630QWb3};
        LLILLJJLI = enumC671630QWbArr;
        LLILLL = new C2254308sP(enumC671630QWbArr);
    }

    public static EnumC671630QWb[] values() {
        return (EnumC671630QWb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC671630QWb valueOf(String str) {
        return (EnumC671630QWb) C08FF.LIZ(EnumC671630QWb.class, str);
    }

    public EnumC671630QWb(String str, int i, String str2) {
        this.LL = str2;
    }
}
