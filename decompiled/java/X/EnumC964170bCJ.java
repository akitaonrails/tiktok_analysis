package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964170bCJ {
    public static final EnumC964170bCJ ACCEPTED;
    public static final EnumC964170bCJ DRAW;
    public static final EnumC964170bCJ INVITED;
    public static final /* synthetic */ EnumC964170bCJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC964170bCJ MATCH_END;
    public static final EnumC964170bCJ MATCH_START;
    public static final EnumC964170bCJ NONE;
    public static final EnumC964170bCJ PREPARING;
    public static final EnumC964170bCJ PUNISH_START;
    public static final EnumC964170bCJ RECEIVED;
    public static final EnumC964170bCJ SETTLE_START;

    public static InterfaceC2044707zh<EnumC964170bCJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC964170bCJ enumC964170bCJ = new EnumC964170bCJ("NONE", 0);
        NONE = enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2 = new EnumC964170bCJ("PREPARING", 1);
        PREPARING = enumC964170bCJ2;
        EnumC964170bCJ enumC964170bCJ3 = new EnumC964170bCJ("INVITED", 2);
        INVITED = enumC964170bCJ3;
        EnumC964170bCJ enumC964170bCJ4 = new EnumC964170bCJ("RECEIVED", 3);
        RECEIVED = enumC964170bCJ4;
        EnumC964170bCJ enumC964170bCJ5 = new EnumC964170bCJ("ACCEPTED", 4);
        ACCEPTED = enumC964170bCJ5;
        EnumC964170bCJ enumC964170bCJ6 = new EnumC964170bCJ("MATCH_START", 5);
        MATCH_START = enumC964170bCJ6;
        EnumC964170bCJ enumC964170bCJ7 = new EnumC964170bCJ("SETTLE_START", 6);
        SETTLE_START = enumC964170bCJ7;
        EnumC964170bCJ enumC964170bCJ8 = new EnumC964170bCJ("PUNISH_START", 7);
        PUNISH_START = enumC964170bCJ8;
        EnumC964170bCJ enumC964170bCJ9 = new EnumC964170bCJ("DRAW", 8);
        DRAW = enumC964170bCJ9;
        EnumC964170bCJ enumC964170bCJ10 = new EnumC964170bCJ("MATCH_END", 9);
        MATCH_END = enumC964170bCJ10;
        EnumC964170bCJ[] enumC964170bCJArr = {enumC964170bCJ, enumC964170bCJ2, enumC964170bCJ3, enumC964170bCJ4, enumC964170bCJ5, enumC964170bCJ6, enumC964170bCJ7, enumC964170bCJ8, enumC964170bCJ9, enumC964170bCJ10};
        LL = enumC964170bCJArr;
        LLILLJJLI = new C2254308sP(enumC964170bCJArr);
    }

    public static EnumC964170bCJ[] values() {
        return (EnumC964170bCJ[]) LL.clone();
    }

    public final boolean isIdle() {
        return this == NONE || this == MATCH_END;
    }

    public static EnumC964170bCJ valueOf(String str) {
        return (EnumC964170bCJ) C08FF.LIZ(EnumC964170bCJ.class, str);
    }

    public EnumC964170bCJ(String str, int i) {
    }
}
