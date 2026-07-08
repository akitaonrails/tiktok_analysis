package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC975300bUG {
    public static final EnumC975300bUG BATTLE_END;
    public static final EnumC975300bUG KEEP_ALIVE;
    public static final /* synthetic */ EnumC975300bUG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC975300bUG OPT_OUT_UPDATE;
    public static final EnumC975300bUG SCORE_UPDATE;
    public static final EnumC975300bUG UNKNOWN;
    public static final EnumC975300bUG UPDATE_EFFECT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC975300bUG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC975300bUG enumC975300bUG = new EnumC975300bUG("UNKNOWN", 0, 0);
        UNKNOWN = enumC975300bUG;
        EnumC975300bUG enumC975300bUG2 = new EnumC975300bUG("SCORE_UPDATE", 1, 1);
        SCORE_UPDATE = enumC975300bUG2;
        EnumC975300bUG enumC975300bUG3 = new EnumC975300bUG("BATTLE_END", 2, 2);
        BATTLE_END = enumC975300bUG3;
        EnumC975300bUG enumC975300bUG4 = new EnumC975300bUG("OPT_OUT_UPDATE", 3, 3);
        OPT_OUT_UPDATE = enumC975300bUG4;
        EnumC975300bUG enumC975300bUG5 = new EnumC975300bUG("KEEP_ALIVE", 4, 4);
        KEEP_ALIVE = enumC975300bUG5;
        EnumC975300bUG enumC975300bUG6 = new EnumC975300bUG("UPDATE_EFFECT", 5, 5);
        UPDATE_EFFECT = enumC975300bUG6;
        EnumC975300bUG[] enumC975300bUGArr = {enumC975300bUG, enumC975300bUG2, enumC975300bUG3, enumC975300bUG4, enumC975300bUG5, enumC975300bUG6};
        LLILLJJLI = enumC975300bUGArr;
        LLILLL = new C2254308sP(enumC975300bUGArr);
    }

    public static EnumC975300bUG[] values() {
        return (EnumC975300bUG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC975300bUG valueOf(String str) {
        return (EnumC975300bUG) C08FF.LIZ(EnumC975300bUG.class, str);
    }

    public EnumC975300bUG(String str, int i, int i2) {
        this.LL = i2;
    }
}
