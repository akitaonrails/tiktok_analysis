package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452930HpT {
    public static final EnumC452930HpT LL;
    public static final EnumC452930HpT LLILLJJLI;
    public static final /* synthetic */ EnumC452930HpT[] LLILLL;

    static {
        EnumC452930HpT enumC452930HpT = new EnumC452930HpT("RECOMMENDATION", 0);
        LL = enumC452930HpT;
        EnumC452930HpT enumC452930HpT2 = new EnumC452930HpT("RECENT_FAVORITE", 1);
        LLILLJJLI = enumC452930HpT2;
        EnumC452930HpT[] enumC452930HpTArr = {enumC452930HpT, enumC452930HpT2};
        LLILLL = enumC452930HpTArr;
        new C2254308sP(enumC452930HpTArr);
    }

    public static EnumC452930HpT[] values() {
        return (EnumC452930HpT[]) LLILLL.clone();
    }

    public static EnumC452930HpT valueOf(String str) {
        return (EnumC452930HpT) C08FF.LIZ(EnumC452930HpT.class, str);
    }

    public EnumC452930HpT(String str, int i) {
    }
}
