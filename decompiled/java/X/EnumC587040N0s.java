package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587040N0s {
    public static final EnumC587040N0s FORWARD_LOOP;
    public static final /* synthetic */ EnumC587040N0s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587040N0s REVERSE_LOOP;

    public static InterfaceC2044707zh<EnumC587040N0s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587040N0s enumC587040N0s = new EnumC587040N0s("FORWARD_LOOP", 0);
        FORWARD_LOOP = enumC587040N0s;
        EnumC587040N0s enumC587040N0s2 = new EnumC587040N0s("REVERSE_LOOP", 1);
        REVERSE_LOOP = enumC587040N0s2;
        EnumC587040N0s[] enumC587040N0sArr = {enumC587040N0s, enumC587040N0s2};
        LL = enumC587040N0sArr;
        LLILLJJLI = new C2254308sP(enumC587040N0sArr);
    }

    public static EnumC587040N0s[] values() {
        return (EnumC587040N0s[]) LL.clone();
    }

    public static EnumC587040N0s valueOf(String str) {
        return (EnumC587040N0s) C08FF.LIZ(EnumC587040N0s.class, str);
    }

    public EnumC587040N0s(String str, int i) {
    }
}
