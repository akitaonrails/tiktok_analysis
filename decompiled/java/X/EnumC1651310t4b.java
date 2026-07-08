package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0t4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1651310t4b {
    public static final EnumC1651310t4b FIXED;
    public static final /* synthetic */ EnumC1651310t4b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1651310t4b SLIDE;

    public static InterfaceC2044707zh<EnumC1651310t4b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1651310t4b enumC1651310t4b = new EnumC1651310t4b("FIXED", 0);
        FIXED = enumC1651310t4b;
        EnumC1651310t4b enumC1651310t4b2 = new EnumC1651310t4b("SLIDE", 1);
        SLIDE = enumC1651310t4b2;
        EnumC1651310t4b[] enumC1651310t4bArr = {enumC1651310t4b, enumC1651310t4b2};
        LL = enumC1651310t4bArr;
        LLILLJJLI = new C2254308sP(enumC1651310t4bArr);
    }

    public static EnumC1651310t4b[] values() {
        return (EnumC1651310t4b[]) LL.clone();
    }

    public static EnumC1651310t4b valueOf(String str) {
        return (EnumC1651310t4b) C08FF.LIZ(EnumC1651310t4b.class, str);
    }

    public EnumC1651310t4b(String str, int i) {
    }
}
