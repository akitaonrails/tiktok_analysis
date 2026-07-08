package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1248260iaW {
    public static final EnumC1248260iaW ICON;
    public static final EnumC1248260iaW ICON_TEXT;
    public static final /* synthetic */ EnumC1248260iaW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1248260iaW TEXT;
    public static final EnumC1248260iaW UNKONWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1248260iaW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1248260iaW enumC1248260iaW = new EnumC1248260iaW("UNKONWN", 0, 0);
        UNKONWN = enumC1248260iaW;
        EnumC1248260iaW enumC1248260iaW2 = new EnumC1248260iaW("ICON", 1, 1);
        ICON = enumC1248260iaW2;
        EnumC1248260iaW enumC1248260iaW3 = new EnumC1248260iaW("TEXT", 2, 2);
        TEXT = enumC1248260iaW3;
        EnumC1248260iaW enumC1248260iaW4 = new EnumC1248260iaW("ICON_TEXT", 3, 3);
        ICON_TEXT = enumC1248260iaW4;
        EnumC1248260iaW[] enumC1248260iaWArr = {enumC1248260iaW, enumC1248260iaW2, enumC1248260iaW3, enumC1248260iaW4};
        LLILLJJLI = enumC1248260iaWArr;
        LLILLL = new C2254308sP(enumC1248260iaWArr);
    }

    public static EnumC1248260iaW[] values() {
        return (EnumC1248260iaW[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1248260iaW valueOf(String str) {
        return (EnumC1248260iaW) C08FF.LIZ(EnumC1248260iaW.class, str);
    }

    public EnumC1248260iaW(String str, int i, int i2) {
        this.LL = i2;
    }
}
