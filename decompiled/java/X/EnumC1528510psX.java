package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0psX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1528510psX {
    public static final /* synthetic */ EnumC1528510psX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1528510psX NO_REUSE;
    public static final EnumC1528510psX REGISTER_CALLBACK;
    public static final EnumC1528510psX WAIT_FOR_RESULT;

    public static InterfaceC2044707zh<EnumC1528510psX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1528510psX enumC1528510psX = new EnumC1528510psX("NO_REUSE", 0);
        NO_REUSE = enumC1528510psX;
        EnumC1528510psX enumC1528510psX2 = new EnumC1528510psX("WAIT_FOR_RESULT", 1);
        WAIT_FOR_RESULT = enumC1528510psX2;
        EnumC1528510psX enumC1528510psX3 = new EnumC1528510psX("REGISTER_CALLBACK", 2);
        REGISTER_CALLBACK = enumC1528510psX3;
        EnumC1528510psX[] enumC1528510psXArr = {enumC1528510psX, enumC1528510psX2, enumC1528510psX3};
        LL = enumC1528510psXArr;
        LLILLJJLI = new C2254308sP(enumC1528510psXArr);
    }

    public static EnumC1528510psX[] values() {
        return (EnumC1528510psX[]) LL.clone();
    }

    public static EnumC1528510psX valueOf(String str) {
        return (EnumC1528510psX) C08FF.LIZ(EnumC1528510psX.class, str);
    }

    public EnumC1528510psX(String str, int i) {
    }
}
