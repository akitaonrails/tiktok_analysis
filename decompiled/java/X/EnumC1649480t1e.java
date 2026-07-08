package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1649480t1e {
    public static final /* synthetic */ EnumC1649480t1e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1649480t1e MUSIC;
    public static final EnumC1649480t1e NONE;
    public static final EnumC1649480t1e VIDEO;

    public static InterfaceC2044707zh<EnumC1649480t1e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1649480t1e enumC1649480t1e = new EnumC1649480t1e("MUSIC", 0);
        MUSIC = enumC1649480t1e;
        EnumC1649480t1e enumC1649480t1e2 = new EnumC1649480t1e("VIDEO", 1);
        VIDEO = enumC1649480t1e2;
        EnumC1649480t1e enumC1649480t1e3 = new EnumC1649480t1e("NONE", 2);
        NONE = enumC1649480t1e3;
        EnumC1649480t1e[] enumC1649480t1eArr = {enumC1649480t1e, enumC1649480t1e2, enumC1649480t1e3};
        LL = enumC1649480t1eArr;
        LLILLJJLI = new C2254308sP(enumC1649480t1eArr);
    }

    public static EnumC1649480t1e[] values() {
        return (EnumC1649480t1e[]) LL.clone();
    }

    public static EnumC1649480t1e valueOf(String str) {
        return (EnumC1649480t1e) C08FF.LIZ(EnumC1649480t1e.class, str);
    }

    public EnumC1649480t1e(String str, int i) {
    }
}
