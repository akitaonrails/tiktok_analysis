package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1745020vVk {
    public static final EnumC1745020vVk CLOSE;
    public static final /* synthetic */ EnumC1745020vVk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1745020vVk OPEN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1745020vVk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1745020vVk enumC1745020vVk = new EnumC1745020vVk("CLOSE", 0, 0);
        CLOSE = enumC1745020vVk;
        EnumC1745020vVk enumC1745020vVk2 = new EnumC1745020vVk("OPEN", 1, 1);
        OPEN = enumC1745020vVk2;
        EnumC1745020vVk[] enumC1745020vVkArr = {enumC1745020vVk, enumC1745020vVk2};
        LLILLJJLI = enumC1745020vVkArr;
        LLILLL = new C2254308sP(enumC1745020vVkArr);
    }

    public static EnumC1745020vVk[] values() {
        return (EnumC1745020vVk[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC1745020vVk valueOf(String str) {
        return (EnumC1745020vVk) C08FF.LIZ(EnumC1745020vVk.class, str);
    }

    public EnumC1745020vVk(String str, int i, int i2) {
        this.LL = i2;
    }
}
