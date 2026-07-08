package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961210b7X {
    public static final EnumC961210b7X LL;
    public static final EnumC961210b7X LLILLJJLI;
    public static final EnumC961210b7X LLILLL;
    public static final EnumC961210b7X LLILZ;
    public static final /* synthetic */ EnumC961210b7X[] LLILZIL;

    static {
        EnumC961210b7X enumC961210b7X = new EnumC961210b7X("TYPE_FRIEND_USER", 0);
        LL = enumC961210b7X;
        EnumC961210b7X enumC961210b7X2 = new EnumC961210b7X("TYPE_MAY_KNOW_USER", 1);
        LLILLJJLI = enumC961210b7X2;
        EnumC961210b7X enumC961210b7X3 = new EnumC961210b7X("TYPE_RECOMMEND_USER", 2);
        LLILLL = enumC961210b7X3;
        EnumC961210b7X enumC961210b7X4 = new EnumC961210b7X("TYPE_VIEWER_SUGGESTION_USER", 3);
        LLILZ = enumC961210b7X4;
        EnumC961210b7X[] enumC961210b7XArr = {enumC961210b7X, enumC961210b7X2, enumC961210b7X3, enumC961210b7X4};
        LLILZIL = enumC961210b7XArr;
        new C2254308sP(enumC961210b7XArr);
    }

    public static EnumC961210b7X[] values() {
        return (EnumC961210b7X[]) LLILZIL.clone();
    }

    public static EnumC961210b7X valueOf(String str) {
        return (EnumC961210b7X) C08FF.LIZ(EnumC961210b7X.class, str);
    }

    public EnumC961210b7X(String str, int i) {
    }
}
