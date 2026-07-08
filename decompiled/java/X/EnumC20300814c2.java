package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20300814c2 {
    public static final EnumC20300814c2 ANY;
    public static final EnumC20300814c2 FOCUS;
    public static final EnumC20300814c2 LAYOUT;
    public static final /* synthetic */ EnumC20300814c2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20300814c2 SCROLL;

    public static InterfaceC2044707zh<EnumC20300814c2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20300814c2 enumC20300814c2 = new EnumC20300814c2("LAYOUT", 0);
        LAYOUT = enumC20300814c2;
        EnumC20300814c2 enumC20300814c22 = new EnumC20300814c2("SCROLL", 1);
        SCROLL = enumC20300814c22;
        EnumC20300814c2 enumC20300814c23 = new EnumC20300814c2("FOCUS", 2);
        FOCUS = enumC20300814c23;
        EnumC20300814c2 enumC20300814c24 = new EnumC20300814c2("ANY", 3);
        ANY = enumC20300814c24;
        EnumC20300814c2[] enumC20300814c2Arr = {enumC20300814c2, enumC20300814c22, enumC20300814c23, enumC20300814c24};
        LL = enumC20300814c2Arr;
        LLILLJJLI = new C2254308sP(enumC20300814c2Arr);
    }

    public static EnumC20300814c2[] values() {
        return (EnumC20300814c2[]) LL.clone();
    }

    public static EnumC20300814c2 valueOf(String str) {
        return (EnumC20300814c2) C08FF.LIZ(EnumC20300814c2.class, str);
    }

    public EnumC20300814c2(String str, int i) {
    }
}
