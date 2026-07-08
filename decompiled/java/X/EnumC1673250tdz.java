package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1673250tdz {
    public static final EnumC1673250tdz Destructive;
    public static final /* synthetic */ EnumC1673250tdz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1673250tdz Normal;

    public static InterfaceC2044707zh<EnumC1673250tdz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1673250tdz enumC1673250tdz = new EnumC1673250tdz("Normal", 0);
        Normal = enumC1673250tdz;
        EnumC1673250tdz enumC1673250tdz2 = new EnumC1673250tdz("Destructive", 1);
        Destructive = enumC1673250tdz2;
        EnumC1673250tdz[] enumC1673250tdzArr = {enumC1673250tdz, enumC1673250tdz2};
        LL = enumC1673250tdzArr;
        LLILLJJLI = new C2254308sP(enumC1673250tdzArr);
    }

    public static EnumC1673250tdz[] values() {
        return (EnumC1673250tdz[]) LL.clone();
    }

    public static EnumC1673250tdz valueOf(String str) {
        return (EnumC1673250tdz) C08FF.LIZ(EnumC1673250tdz.class, str);
    }

    public EnumC1673250tdz(String str, int i) {
    }
}
