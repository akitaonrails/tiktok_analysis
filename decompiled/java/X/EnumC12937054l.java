package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12937054l {
    public static final EnumC12937054l EXTENSION;
    public static final EnumC12937054l FIXED;
    public static final /* synthetic */ EnumC12937054l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC12937054l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC12937054l enumC12937054l = new EnumC12937054l("FIXED", 0);
        FIXED = enumC12937054l;
        EnumC12937054l enumC12937054l2 = new EnumC12937054l("EXTENSION", 1);
        EXTENSION = enumC12937054l2;
        EnumC12937054l[] enumC12937054lArr = {enumC12937054l, enumC12937054l2};
        LL = enumC12937054lArr;
        LLILLJJLI = new C2254308sP(enumC12937054lArr);
    }

    public static EnumC12937054l[] values() {
        return (EnumC12937054l[]) LL.clone();
    }

    public static EnumC12937054l valueOf(String str) {
        return (EnumC12937054l) C08FF.LIZ(EnumC12937054l.class, str);
    }

    public EnumC12937054l(String str, int i) {
    }
}
