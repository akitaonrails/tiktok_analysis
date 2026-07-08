package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1671200tag {
    public static final /* synthetic */ EnumC1671200tag[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1671200tag Ltr;
    public static final EnumC1671200tag Rtl;

    public static InterfaceC2044707zh<EnumC1671200tag> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1671200tag valueOf(String str) {
        return (EnumC1671200tag) C08FF.LIZ(EnumC1671200tag.class, str);
    }

    public static EnumC1671200tag[] values() {
        return (EnumC1671200tag[]) LL.clone();
    }

    static {
        EnumC1671200tag enumC1671200tag = new EnumC1671200tag("Ltr", 0);
        Ltr = enumC1671200tag;
        EnumC1671200tag enumC1671200tag2 = new EnumC1671200tag("Rtl", 1);
        Rtl = enumC1671200tag2;
        EnumC1671200tag[] enumC1671200tagArr = {enumC1671200tag, enumC1671200tag2};
        LL = enumC1671200tagArr;
        LLILLJJLI = new C2254308sP(enumC1671200tagArr);
    }

    public EnumC1671200tag(String str, int i) {
    }
}
