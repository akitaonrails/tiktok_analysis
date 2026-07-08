package X;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ewJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1108010ewJ {
    public static final EnumC1108010ewJ AUTO;
    public static final EnumC1108010ewJ COVER;
    public static final /* synthetic */ EnumC1108010ewJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1108010ewJ MANUALLY_CLOSE;
    public static final EnumC1108010ewJ OTHERS;

    public static InterfaceC2044707zh<EnumC1108010ewJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1108010ewJ enumC1108010ewJ = new EnumC1108010ewJ("AUTO", 0);
        AUTO = enumC1108010ewJ;
        EnumC1108010ewJ enumC1108010ewJ2 = new EnumC1108010ewJ("COVER", 1);
        COVER = enumC1108010ewJ2;
        EnumC1108010ewJ enumC1108010ewJ3 = new EnumC1108010ewJ("MANUALLY_CLOSE", 2);
        MANUALLY_CLOSE = enumC1108010ewJ3;
        EnumC1108010ewJ enumC1108010ewJ4 = new EnumC1108010ewJ("OTHERS", 3);
        OTHERS = enumC1108010ewJ4;
        EnumC1108010ewJ[] enumC1108010ewJArr = {enumC1108010ewJ, enumC1108010ewJ2, enumC1108010ewJ3, enumC1108010ewJ4};
        LL = enumC1108010ewJArr;
        LLILLJJLI = new C2254308sP(enumC1108010ewJArr);
    }

    public static EnumC1108010ewJ[] values() {
        return (EnumC1108010ewJ[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }

    public static EnumC1108010ewJ valueOf(String str) {
        return (EnumC1108010ewJ) C08FF.LIZ(EnumC1108010ewJ.class, str);
    }

    public EnumC1108010ewJ(String str, int i) {
    }
}
