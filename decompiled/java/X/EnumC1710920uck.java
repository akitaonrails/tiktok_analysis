package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710920uck {
    public static final EnumC1710920uck LL;
    public static final EnumC1710920uck LLILLJJLI;
    public static final EnumC1710920uck LLILLL;
    public static final /* synthetic */ EnumC1710920uck[] LLILZ;

    static {
        EnumC1710920uck enumC1710920uck = new EnumC1710920uck("NONE", 0);
        LL = enumC1710920uck;
        EnumC1710920uck enumC1710920uck2 = new EnumC1710920uck("CONTINUE_ACTION_LINK", 1);
        LLILLJJLI = enumC1710920uck2;
        EnumC1710920uck enumC1710920uck3 = new EnumC1710920uck("VIEW_BALANCE_LINK", 2);
        LLILLL = enumC1710920uck3;
        EnumC1710920uck[] enumC1710920uckArr = {enumC1710920uck, enumC1710920uck2, enumC1710920uck3};
        LLILZ = enumC1710920uckArr;
        new C2254308sP(enumC1710920uckArr);
    }

    public static EnumC1710920uck[] values() {
        return (EnumC1710920uck[]) LLILZ.clone();
    }

    public static EnumC1710920uck valueOf(String str) {
        return (EnumC1710920uck) C08FF.LIZ(EnumC1710920uck.class, str);
    }

    public EnumC1710920uck(String str, int i) {
    }
}
