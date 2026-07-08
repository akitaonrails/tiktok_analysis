package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993730bxz {
    public static final EnumC993730bxz ALL_READY;
    public static final /* synthetic */ EnumC993730bxz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993730bxz WAIT_REGISTER;
    public static final EnumC993730bxz WAIT_RENDER;

    public static InterfaceC2044707zh<EnumC993730bxz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993730bxz enumC993730bxz = new EnumC993730bxz("ALL_READY", 0);
        ALL_READY = enumC993730bxz;
        EnumC993730bxz enumC993730bxz2 = new EnumC993730bxz("WAIT_RENDER", 1);
        WAIT_RENDER = enumC993730bxz2;
        EnumC993730bxz enumC993730bxz3 = new EnumC993730bxz("WAIT_REGISTER", 2);
        WAIT_REGISTER = enumC993730bxz3;
        EnumC993730bxz[] enumC993730bxzArr = {enumC993730bxz, enumC993730bxz2, enumC993730bxz3};
        LL = enumC993730bxzArr;
        LLILLJJLI = new C2254308sP(enumC993730bxzArr);
    }

    public static EnumC993730bxz[] values() {
        return (EnumC993730bxz[]) LL.clone();
    }

    public static EnumC993730bxz valueOf(String str) {
        return (EnumC993730bxz) C08FF.LIZ(EnumC993730bxz.class, str);
    }

    public EnumC993730bxz(String str, int i) {
    }
}
