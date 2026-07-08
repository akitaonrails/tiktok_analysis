package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1737480vJa {
    public static final EnumC1737480vJa EDIT;
    public static final /* synthetic */ EnumC1737480vJa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1737480vJa PUBLISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1737480vJa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1737480vJa enumC1737480vJa = new EnumC1737480vJa("PUBLISH", 0, "publish_page");
        PUBLISH = enumC1737480vJa;
        EnumC1737480vJa enumC1737480vJa2 = new EnumC1737480vJa("EDIT", 1, "edit_page");
        EDIT = enumC1737480vJa2;
        EnumC1737480vJa[] enumC1737480vJaArr = {enumC1737480vJa, enumC1737480vJa2};
        LLILLJJLI = enumC1737480vJaArr;
        LLILLL = new C2254308sP(enumC1737480vJaArr);
    }

    public static EnumC1737480vJa[] values() {
        return (EnumC1737480vJa[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1737480vJa valueOf(String str) {
        return (EnumC1737480vJa) C08FF.LIZ(EnumC1737480vJa.class, str);
    }

    public EnumC1737480vJa(String str, int i, String str2) {
        this.LL = str2;
    }
}
