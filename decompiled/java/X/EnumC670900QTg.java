package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC670900QTg {
    public static final EnumC670900QTg IDLE;
    public static final /* synthetic */ EnumC670900QTg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC670900QTg MASKED;
    public static final EnumC670900QTg NORMAL;

    public static InterfaceC2044707zh<EnumC670900QTg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC670900QTg enumC670900QTg = new EnumC670900QTg("NORMAL", 0);
        NORMAL = enumC670900QTg;
        EnumC670900QTg enumC670900QTg2 = new EnumC670900QTg("MASKED", 1);
        MASKED = enumC670900QTg2;
        EnumC670900QTg enumC670900QTg3 = new EnumC670900QTg("IDLE", 2);
        IDLE = enumC670900QTg3;
        EnumC670900QTg[] enumC670900QTgArr = {enumC670900QTg, enumC670900QTg2, enumC670900QTg3};
        LL = enumC670900QTgArr;
        LLILLJJLI = new C2254308sP(enumC670900QTgArr);
    }

    public static EnumC670900QTg[] values() {
        return (EnumC670900QTg[]) LL.clone();
    }

    public static EnumC670900QTg valueOf(String str) {
        return (EnumC670900QTg) C08FF.LIZ(EnumC670900QTg.class, str);
    }

    public EnumC670900QTg(String str, int i) {
    }
}
