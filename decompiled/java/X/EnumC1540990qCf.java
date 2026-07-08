package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1540990qCf {
    public static final EnumC1540990qCf FETCH_ASYNC;
    public static final EnumC1540990qCf FETCH_BLOCK;
    public static final EnumC1540990qCf FETCH_TRY;
    public static final /* synthetic */ EnumC1540990qCf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1540990qCf PRE_CREATE;
    public static final EnumC1540990qCf PRE_LAYOUT;
    public static final EnumC1540990qCf PRE_RENDER;

    public static InterfaceC2044707zh<EnumC1540990qCf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1540990qCf enumC1540990qCf = new EnumC1540990qCf("PRE_RENDER", 0);
        PRE_RENDER = enumC1540990qCf;
        EnumC1540990qCf enumC1540990qCf2 = new EnumC1540990qCf("PRE_LAYOUT", 1);
        PRE_LAYOUT = enumC1540990qCf2;
        EnumC1540990qCf enumC1540990qCf3 = new EnumC1540990qCf("PRE_CREATE", 2);
        PRE_CREATE = enumC1540990qCf3;
        EnumC1540990qCf enumC1540990qCf4 = new EnumC1540990qCf("FETCH_BLOCK", 3);
        FETCH_BLOCK = enumC1540990qCf4;
        EnumC1540990qCf enumC1540990qCf5 = new EnumC1540990qCf("FETCH_ASYNC", 4);
        FETCH_ASYNC = enumC1540990qCf5;
        EnumC1540990qCf enumC1540990qCf6 = new EnumC1540990qCf("FETCH_TRY", 5);
        FETCH_TRY = enumC1540990qCf6;
        EnumC1540990qCf[] enumC1540990qCfArr = {enumC1540990qCf, enumC1540990qCf2, enumC1540990qCf3, enumC1540990qCf4, enumC1540990qCf5, enumC1540990qCf6};
        LL = enumC1540990qCfArr;
        LLILLJJLI = new C2254308sP(enumC1540990qCfArr);
    }

    public static EnumC1540990qCf[] values() {
        return (EnumC1540990qCf[]) LL.clone();
    }

    public static EnumC1540990qCf valueOf(String str) {
        return (EnumC1540990qCf) C08FF.LIZ(EnumC1540990qCf.class, str);
    }

    public EnumC1540990qCf(String str, int i) {
    }
}
