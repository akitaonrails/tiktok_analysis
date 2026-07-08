package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC458500HyS {
    public static final EnumC458500HyS ALWAYS_TAKE_UP_SPACE;
    public static final /* synthetic */ EnumC458500HyS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC458500HyS TAKE_UP_SPACE_WHEN_TIP;

    public static InterfaceC2044707zh<EnumC458500HyS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC458500HyS enumC458500HyS = new EnumC458500HyS("ALWAYS_TAKE_UP_SPACE", 0);
        ALWAYS_TAKE_UP_SPACE = enumC458500HyS;
        EnumC458500HyS enumC458500HyS2 = new EnumC458500HyS("TAKE_UP_SPACE_WHEN_TIP", 1);
        TAKE_UP_SPACE_WHEN_TIP = enumC458500HyS2;
        EnumC458500HyS[] enumC458500HySArr = {enumC458500HyS, enumC458500HyS2};
        LL = enumC458500HySArr;
        LLILLJJLI = new C2254308sP(enumC458500HySArr);
    }

    public static EnumC458500HyS[] values() {
        return (EnumC458500HyS[]) LL.clone();
    }

    public static EnumC458500HyS valueOf(String str) {
        return (EnumC458500HyS) C08FF.LIZ(EnumC458500HyS.class, str);
    }

    public EnumC458500HyS(String str, int i) {
    }
}
