package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773890UXj {
    public static final EnumC773890UXj INTERACTION;
    public static final /* synthetic */ EnumC773890UXj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC773890UXj SINGLE;

    public static InterfaceC2044707zh<EnumC773890UXj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC773890UXj enumC773890UXj = new EnumC773890UXj("INTERACTION", 0);
        INTERACTION = enumC773890UXj;
        EnumC773890UXj enumC773890UXj2 = new EnumC773890UXj("SINGLE", 1);
        SINGLE = enumC773890UXj2;
        EnumC773890UXj[] enumC773890UXjArr = {enumC773890UXj, enumC773890UXj2};
        LL = enumC773890UXjArr;
        LLILLJJLI = new C2254308sP(enumC773890UXjArr);
    }

    public static EnumC773890UXj[] values() {
        return (EnumC773890UXj[]) LL.clone();
    }

    public static EnumC773890UXj valueOf(String str) {
        return (EnumC773890UXj) C08FF.LIZ(EnumC773890UXj.class, str);
    }

    public EnumC773890UXj(String str, int i) {
    }
}
