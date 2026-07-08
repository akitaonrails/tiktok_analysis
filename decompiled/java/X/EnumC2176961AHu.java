package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2176961AHu {
    public static final EnumC2176961AHu BILLBOARD;
    public static final EnumC2176961AHu HORIZONTAL;
    public static final /* synthetic */ EnumC2176961AHu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2176961AHu VERTICAL;

    public static InterfaceC2044707zh<EnumC2176961AHu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2176961AHu enumC2176961AHu = new EnumC2176961AHu("HORIZONTAL", 0);
        HORIZONTAL = enumC2176961AHu;
        EnumC2176961AHu enumC2176961AHu2 = new EnumC2176961AHu("VERTICAL", 1);
        VERTICAL = enumC2176961AHu2;
        EnumC2176961AHu enumC2176961AHu3 = new EnumC2176961AHu("BILLBOARD", 2);
        BILLBOARD = enumC2176961AHu3;
        EnumC2176961AHu[] enumC2176961AHuArr = {enumC2176961AHu, enumC2176961AHu2, enumC2176961AHu3};
        LL = enumC2176961AHuArr;
        LLILLJJLI = new C2254308sP(enumC2176961AHuArr);
    }

    public static EnumC2176961AHu[] values() {
        return (EnumC2176961AHu[]) LL.clone();
    }

    public static EnumC2176961AHu valueOf(String str) {
        return (EnumC2176961AHu) C08FF.LIZ(EnumC2176961AHu.class, str);
    }

    public EnumC2176961AHu(String str, int i) {
    }
}
