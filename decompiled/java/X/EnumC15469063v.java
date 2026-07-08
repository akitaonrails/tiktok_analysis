package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.063v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15469063v {
    public static final EnumC15469063v AIGC_CREATE;
    public static final EnumC15469063v AIGC_EDIT;
    public static final EnumC15469063v AIGC_PUBLISHED;
    public static final /* synthetic */ EnumC15469063v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC15469063v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC15469063v enumC15469063v = new EnumC15469063v("AIGC_CREATE", 0);
        AIGC_CREATE = enumC15469063v;
        EnumC15469063v enumC15469063v2 = new EnumC15469063v("AIGC_EDIT", 1);
        AIGC_EDIT = enumC15469063v2;
        EnumC15469063v enumC15469063v3 = new EnumC15469063v("AIGC_PUBLISHED", 2);
        AIGC_PUBLISHED = enumC15469063v3;
        EnumC15469063v[] enumC15469063vArr = {enumC15469063v, enumC15469063v2, enumC15469063v3};
        LL = enumC15469063vArr;
        LLILLJJLI = new C2254308sP(enumC15469063vArr);
    }

    public static EnumC15469063v[] values() {
        return (EnumC15469063v[]) LL.clone();
    }

    public static EnumC15469063v valueOf(String str) {
        return (EnumC15469063v) C08FF.LIZ(EnumC15469063v.class, str);
    }

    public EnumC15469063v(String str, int i) {
    }
}
