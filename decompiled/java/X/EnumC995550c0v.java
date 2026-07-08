package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995550c0v {
    public static final EnumC995550c0v CLICK;
    public static final /* synthetic */ EnumC995550c0v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995550c0v SHOW;

    public static InterfaceC2044707zh<EnumC995550c0v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995550c0v enumC995550c0v = new EnumC995550c0v("SHOW", 0);
        SHOW = enumC995550c0v;
        EnumC995550c0v enumC995550c0v2 = new EnumC995550c0v("CLICK", 1);
        CLICK = enumC995550c0v2;
        EnumC995550c0v[] enumC995550c0vArr = {enumC995550c0v, enumC995550c0v2};
        LL = enumC995550c0vArr;
        LLILLJJLI = new C2254308sP(enumC995550c0vArr);
    }

    public static EnumC995550c0v[] values() {
        return (EnumC995550c0v[]) LL.clone();
    }

    public static EnumC995550c0v valueOf(String str) {
        return (EnumC995550c0v) C08FF.LIZ(EnumC995550c0v.class, str);
    }

    public EnumC995550c0v(String str, int i) {
    }
}
