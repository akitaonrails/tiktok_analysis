package X;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1583960rJy {
    public static final /* synthetic */ EnumC1583960rJy[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1583960rJy TAB_1;
    public static final EnumC1583960rJy TAB_2;
    public static final EnumC1583960rJy TAB_3;
    public static final EnumC1583960rJy TAB_4;
    public static final EnumC1583960rJy TAB_5;
    public final int LL;
    public final List<String> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1583960rJy> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1583960rJy enumC1583960rJy = new EnumC1583960rJy("TAB_1", 0, 0);
        TAB_1 = enumC1583960rJy;
        InterfaceC475400Ikc.LIZ.getClass();
        EnumC1583960rJy enumC1583960rJy2 = new EnumC1583960rJy("TAB_2", 1, 1, C1583980rK0.LJ);
        TAB_2 = enumC1583960rJy2;
        EnumC1583960rJy enumC1583960rJy3 = new EnumC1583960rJy("TAB_3", 2, 2, C1583980rK0.LJFF);
        TAB_3 = enumC1583960rJy3;
        EnumC1583960rJy enumC1583960rJy4 = new EnumC1583960rJy("TAB_4", 3, 3);
        TAB_4 = enumC1583960rJy4;
        EnumC1583960rJy enumC1583960rJy5 = new EnumC1583960rJy("TAB_5", 4, 4);
        TAB_5 = enumC1583960rJy5;
        EnumC1583960rJy[] enumC1583960rJyArr = {enumC1583960rJy, enumC1583960rJy2, enumC1583960rJy3, enumC1583960rJy4, enumC1583960rJy5};
        LLILLL = enumC1583960rJyArr;
        LLILZ = new C2254308sP(enumC1583960rJyArr);
    }

    public static EnumC1583960rJy[] values() {
        return (EnumC1583960rJy[]) LLILLL.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public final List<String> getPriorityList() {
        return this.LLILLJJLI;
    }

    public static EnumC1583960rJy valueOf(String str) {
        return (EnumC1583960rJy) C08FF.LIZ(EnumC1583960rJy.class, str);
    }

    public EnumC1583960rJy(String str, int i, int i2) {
        this(str, i, i2, C13BV.INSTANCE);
    }

    public EnumC1583960rJy(String str, int i, int i2, List list) {
        this.LL = i2;
        this.LLILLJJLI = list;
    }
}
