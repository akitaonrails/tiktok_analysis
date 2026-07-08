package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381990m4D {
    public static final /* synthetic */ EnumC1381990m4D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1381990m4D MAF;
    public static final EnumC1381990m4D ME_FOLLOWING;
    public static final EnumC1381990m4D MUF;
    public static final EnumC1381990m4D RECENT_CHAT;
    public static final EnumC1381990m4D SERVER;
    public static final EnumC1381990m4D UNKNOWN;

    public static InterfaceC2044707zh<EnumC1381990m4D> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1381990m4D enumC1381990m4D = new EnumC1381990m4D("RECENT_CHAT", 0);
        RECENT_CHAT = enumC1381990m4D;
        EnumC1381990m4D enumC1381990m4D2 = new EnumC1381990m4D("MUF", 1);
        MUF = enumC1381990m4D2;
        EnumC1381990m4D enumC1381990m4D3 = new EnumC1381990m4D("ME_FOLLOWING", 2);
        ME_FOLLOWING = enumC1381990m4D3;
        EnumC1381990m4D enumC1381990m4D4 = new EnumC1381990m4D("MAF", 3);
        MAF = enumC1381990m4D4;
        EnumC1381990m4D enumC1381990m4D5 = new EnumC1381990m4D("SERVER", 4);
        SERVER = enumC1381990m4D5;
        EnumC1381990m4D enumC1381990m4D6 = new EnumC1381990m4D("UNKNOWN", 5);
        UNKNOWN = enumC1381990m4D6;
        EnumC1381990m4D[] enumC1381990m4DArr = {enumC1381990m4D, enumC1381990m4D2, enumC1381990m4D3, enumC1381990m4D4, enumC1381990m4D5, enumC1381990m4D6};
        LL = enumC1381990m4DArr;
        LLILLJJLI = new C2254308sP(enumC1381990m4DArr);
    }

    public static EnumC1381990m4D[] values() {
        return (EnumC1381990m4D[]) LL.clone();
    }

    public static EnumC1381990m4D valueOf(String str) {
        return (EnumC1381990m4D) C08FF.LIZ(EnumC1381990m4D.class, str);
    }

    public EnumC1381990m4D(String str, int i) {
    }
}
