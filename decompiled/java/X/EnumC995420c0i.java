package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995420c0i {
    public static final EnumC995420c0i Default;
    public static final EnumC995420c0i Direct;
    public static final /* synthetic */ EnumC995420c0i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995420c0i PageConfig;

    public static InterfaceC2044707zh<EnumC995420c0i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995420c0i enumC995420c0i = new EnumC995420c0i("Default", 0);
        Default = enumC995420c0i;
        EnumC995420c0i enumC995420c0i2 = new EnumC995420c0i("PageConfig", 1);
        PageConfig = enumC995420c0i2;
        EnumC995420c0i enumC995420c0i3 = new EnumC995420c0i("Direct", 2);
        Direct = enumC995420c0i3;
        EnumC995420c0i[] enumC995420c0iArr = {enumC995420c0i, enumC995420c0i2, enumC995420c0i3};
        LL = enumC995420c0iArr;
        LLILLJJLI = new C2254308sP(enumC995420c0iArr);
    }

    public static EnumC995420c0i[] values() {
        return (EnumC995420c0i[]) LL.clone();
    }

    public static EnumC995420c0i valueOf(String str) {
        return (EnumC995420c0i) C08FF.LIZ(EnumC995420c0i.class, str);
    }

    public EnumC995420c0i(String str, int i) {
    }
}
