package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1038130d7b {
    public static final /* synthetic */ EnumC1038130d7b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1038130d7b LOCK_ICON;
    public static final EnumC1038130d7b TITLE;
    public static final EnumC1038130d7b URL;

    public static InterfaceC2044707zh<EnumC1038130d7b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1038130d7b enumC1038130d7b = new EnumC1038130d7b("LOCK_ICON", 0);
        LOCK_ICON = enumC1038130d7b;
        EnumC1038130d7b enumC1038130d7b2 = new EnumC1038130d7b("URL", 1);
        URL = enumC1038130d7b2;
        EnumC1038130d7b enumC1038130d7b3 = new EnumC1038130d7b("TITLE", 2);
        TITLE = enumC1038130d7b3;
        EnumC1038130d7b[] enumC1038130d7bArr = {enumC1038130d7b, enumC1038130d7b2, enumC1038130d7b3};
        LL = enumC1038130d7bArr;
        LLILLJJLI = new C2254308sP(enumC1038130d7bArr);
    }

    public static EnumC1038130d7b[] values() {
        return (EnumC1038130d7b[]) LL.clone();
    }

    public static EnumC1038130d7b valueOf(String str) {
        return (EnumC1038130d7b) C08FF.LIZ(EnumC1038130d7b.class, str);
    }

    public EnumC1038130d7b(String str, int i) {
    }
}
