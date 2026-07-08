package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1085440eLu {
    public static final /* synthetic */ EnumC1085440eLu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1085440eLu MERGE;
    public static final EnumC1085440eLu REPLACE;

    public static InterfaceC2044707zh<EnumC1085440eLu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1085440eLu enumC1085440eLu = new EnumC1085440eLu("REPLACE", 0);
        REPLACE = enumC1085440eLu;
        EnumC1085440eLu enumC1085440eLu2 = new EnumC1085440eLu("MERGE", 1);
        MERGE = enumC1085440eLu2;
        EnumC1085440eLu[] enumC1085440eLuArr = {enumC1085440eLu, enumC1085440eLu2};
        LL = enumC1085440eLuArr;
        LLILLJJLI = new C2254308sP(enumC1085440eLuArr);
    }

    public static EnumC1085440eLu[] values() {
        return (EnumC1085440eLu[]) LL.clone();
    }

    public static EnumC1085440eLu valueOf(String str) {
        return (EnumC1085440eLu) C08FF.LIZ(EnumC1085440eLu.class, str);
    }

    public EnumC1085440eLu(String str, int i) {
    }
}
