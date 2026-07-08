package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818600W9i {
    public static final /* synthetic */ EnumC818600W9i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC818600W9i Local;
    public static final EnumC818600W9i Remote;

    public static InterfaceC2044707zh<EnumC818600W9i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC818600W9i enumC818600W9i = new EnumC818600W9i("Local", 0);
        Local = enumC818600W9i;
        EnumC818600W9i enumC818600W9i2 = new EnumC818600W9i("Remote", 1);
        Remote = enumC818600W9i2;
        EnumC818600W9i[] enumC818600W9iArr = {enumC818600W9i, enumC818600W9i2};
        LL = enumC818600W9iArr;
        LLILLJJLI = new C2254308sP(enumC818600W9iArr);
    }

    public static EnumC818600W9i[] values() {
        return (EnumC818600W9i[]) LL.clone();
    }

    public static EnumC818600W9i valueOf(String str) {
        return (EnumC818600W9i) C08FF.LIZ(EnumC818600W9i.class, str);
    }

    public EnumC818600W9i(String str, int i) {
    }
}
