package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177370gkB {
    public static final EnumC1177370gkB CHART;
    public static final EnumC1177370gkB FAVORITE;
    public static final EnumC1177370gkB HIGHLIGHT;
    public static final /* synthetic */ EnumC1177370gkB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1177370gkB NONE;
    public static final EnumC1177370gkB TRUST;

    public static InterfaceC2044707zh<EnumC1177370gkB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1177370gkB enumC1177370gkB = new EnumC1177370gkB("NONE", 0);
        NONE = enumC1177370gkB;
        EnumC1177370gkB enumC1177370gkB2 = new EnumC1177370gkB("CHART", 1);
        CHART = enumC1177370gkB2;
        EnumC1177370gkB enumC1177370gkB3 = new EnumC1177370gkB("FAVORITE", 2);
        FAVORITE = enumC1177370gkB3;
        EnumC1177370gkB enumC1177370gkB4 = new EnumC1177370gkB("HIGHLIGHT", 3);
        HIGHLIGHT = enumC1177370gkB4;
        EnumC1177370gkB enumC1177370gkB5 = new EnumC1177370gkB("TRUST", 4);
        TRUST = enumC1177370gkB5;
        EnumC1177370gkB[] enumC1177370gkBArr = {enumC1177370gkB, enumC1177370gkB2, enumC1177370gkB3, enumC1177370gkB4, enumC1177370gkB5};
        LL = enumC1177370gkBArr;
        LLILLJJLI = new C2254308sP(enumC1177370gkBArr);
    }

    public static EnumC1177370gkB[] values() {
        return (EnumC1177370gkB[]) LL.clone();
    }

    public static EnumC1177370gkB valueOf(String str) {
        return (EnumC1177370gkB) C08FF.LIZ(EnumC1177370gkB.class, str);
    }

    public EnumC1177370gkB(String str, int i) {
    }
}
