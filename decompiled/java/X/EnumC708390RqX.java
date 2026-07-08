package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC708390RqX {
    public static final EnumC708390RqX HIDE;
    public static final EnumC708390RqX IS_REQUESTING;
    public static final /* synthetic */ EnumC708390RqX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC708390RqX SHOW;

    public static InterfaceC2044707zh<EnumC708390RqX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC708390RqX enumC708390RqX = new EnumC708390RqX("IS_REQUESTING", 0);
        IS_REQUESTING = enumC708390RqX;
        EnumC708390RqX enumC708390RqX2 = new EnumC708390RqX("SHOW", 1);
        SHOW = enumC708390RqX2;
        EnumC708390RqX enumC708390RqX3 = new EnumC708390RqX("HIDE", 2);
        HIDE = enumC708390RqX3;
        EnumC708390RqX[] enumC708390RqXArr = {enumC708390RqX, enumC708390RqX2, enumC708390RqX3};
        LL = enumC708390RqXArr;
        LLILLJJLI = new C2254308sP(enumC708390RqXArr);
    }

    public static EnumC708390RqX[] values() {
        return (EnumC708390RqX[]) LL.clone();
    }

    public static EnumC708390RqX valueOf(String str) {
        return (EnumC708390RqX) C08FF.LIZ(EnumC708390RqX.class, str);
    }

    public EnumC708390RqX(String str, int i) {
    }
}
