package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818700W9s {
    public static final EnumC818700W9s ANDROID;
    public static final EnumC818700W9s IOS;
    public static final /* synthetic */ EnumC818700W9s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC818700W9s PC;

    public static InterfaceC2044707zh<EnumC818700W9s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC818700W9s enumC818700W9s = new EnumC818700W9s("ANDROID", 0);
        ANDROID = enumC818700W9s;
        EnumC818700W9s enumC818700W9s2 = new EnumC818700W9s("IOS", 1);
        IOS = enumC818700W9s2;
        EnumC818700W9s enumC818700W9s3 = new EnumC818700W9s("PC", 2);
        PC = enumC818700W9s3;
        EnumC818700W9s[] enumC818700W9sArr = {enumC818700W9s, enumC818700W9s2, enumC818700W9s3};
        LL = enumC818700W9sArr;
        LLILLJJLI = new C2254308sP(enumC818700W9sArr);
    }

    public static EnumC818700W9s[] values() {
        return (EnumC818700W9s[]) LL.clone();
    }

    public static EnumC818700W9s valueOf(String str) {
        return (EnumC818700W9s) C08FF.LIZ(EnumC818700W9s.class, str);
    }

    public EnumC818700W9s(String str, int i) {
    }
}
