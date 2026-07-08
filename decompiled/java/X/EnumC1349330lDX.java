package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1349330lDX {
    public static final EnumC1349330lDX GONE;
    public static final /* synthetic */ EnumC1349330lDX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1349330lDX LOADING;
    public static final EnumC1349330lDX VISIBLE;

    public static InterfaceC2044707zh<EnumC1349330lDX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1349330lDX enumC1349330lDX = new EnumC1349330lDX("LOADING", 0);
        LOADING = enumC1349330lDX;
        EnumC1349330lDX enumC1349330lDX2 = new EnumC1349330lDX("VISIBLE", 1);
        VISIBLE = enumC1349330lDX2;
        EnumC1349330lDX enumC1349330lDX3 = new EnumC1349330lDX("GONE", 2);
        GONE = enumC1349330lDX3;
        EnumC1349330lDX[] enumC1349330lDXArr = {enumC1349330lDX, enumC1349330lDX2, enumC1349330lDX3};
        LL = enumC1349330lDXArr;
        LLILLJJLI = new C2254308sP(enumC1349330lDXArr);
    }

    public static EnumC1349330lDX[] values() {
        return (EnumC1349330lDX[]) LL.clone();
    }

    public static EnumC1349330lDX valueOf(String str) {
        return (EnumC1349330lDX) C08FF.LIZ(EnumC1349330lDX.class, str);
    }

    public EnumC1349330lDX(String str, int i) {
    }
}
