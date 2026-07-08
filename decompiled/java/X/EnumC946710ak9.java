package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ak9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC946710ak9 {
    public static final EnumC946710ak9 CLIENT_AI;
    public static final EnumC946710ak9 FOLLOW;
    public static final EnumC946710ak9 GIFT;
    public static final EnumC946710ak9 LIKE;
    public static final /* synthetic */ EnumC946710ak9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC946710ak9 SHARE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC946710ak9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC946710ak9 enumC946710ak9 = new EnumC946710ak9("FOLLOW", 0, 0);
        FOLLOW = enumC946710ak9;
        EnumC946710ak9 enumC946710ak92 = new EnumC946710ak9("LIKE", 1, 1);
        LIKE = enumC946710ak92;
        EnumC946710ak9 enumC946710ak93 = new EnumC946710ak9("SHARE", 2, 2);
        SHARE = enumC946710ak93;
        EnumC946710ak9 enumC946710ak94 = new EnumC946710ak9("GIFT", 3, 3);
        GIFT = enumC946710ak94;
        EnumC946710ak9 enumC946710ak95 = new EnumC946710ak9("CLIENT_AI", 4, 4);
        CLIENT_AI = enumC946710ak95;
        EnumC946710ak9[] enumC946710ak9Arr = {enumC946710ak9, enumC946710ak92, enumC946710ak93, enumC946710ak94, enumC946710ak95};
        LLILLJJLI = enumC946710ak9Arr;
        LLILLL = new C2254308sP(enumC946710ak9Arr);
    }

    public static EnumC946710ak9[] values() {
        return (EnumC946710ak9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC946710ak9 valueOf(String str) {
        return (EnumC946710ak9) C08FF.LIZ(EnumC946710ak9.class, str);
    }

    public EnumC946710ak9(String str, int i, int i2) {
        this.LL = i2;
    }
}
