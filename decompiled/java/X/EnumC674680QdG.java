package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC674680QdG {
    public static final EnumC674680QdG CANCEL;
    public static final EnumC674680QdG END_RECORD;
    public static final EnumC674680QdG FAILED;
    public static final EnumC674680QdG FINISH_SOON;
    public static final /* synthetic */ EnumC674680QdG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC674680QdG START_RECORD;
    public static final EnumC674680QdG SUCCESS;
    public static final EnumC674680QdG TIMEOUT;

    public static InterfaceC2044707zh<EnumC674680QdG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC674680QdG enumC674680QdG = new EnumC674680QdG("START_RECORD", 0);
        START_RECORD = enumC674680QdG;
        EnumC674680QdG enumC674680QdG2 = new EnumC674680QdG("END_RECORD", 1);
        END_RECORD = enumC674680QdG2;
        EnumC674680QdG enumC674680QdG3 = new EnumC674680QdG("FINISH_SOON", 2);
        FINISH_SOON = enumC674680QdG3;
        EnumC674680QdG enumC674680QdG4 = new EnumC674680QdG("SUCCESS", 3);
        SUCCESS = enumC674680QdG4;
        EnumC674680QdG enumC674680QdG5 = new EnumC674680QdG("FAILED", 4);
        FAILED = enumC674680QdG5;
        EnumC674680QdG enumC674680QdG6 = new EnumC674680QdG("TIMEOUT", 5);
        TIMEOUT = enumC674680QdG6;
        EnumC674680QdG enumC674680QdG7 = new EnumC674680QdG("CANCEL", 6);
        CANCEL = enumC674680QdG7;
        EnumC674680QdG[] enumC674680QdGArr = {enumC674680QdG, enumC674680QdG2, enumC674680QdG3, enumC674680QdG4, enumC674680QdG5, enumC674680QdG6, enumC674680QdG7};
        LL = enumC674680QdGArr;
        LLILLJJLI = new C2254308sP(enumC674680QdGArr);
    }

    public static EnumC674680QdG[] values() {
        return (EnumC674680QdG[]) LL.clone();
    }

    public static EnumC674680QdG valueOf(String str) {
        return (EnumC674680QdG) C08FF.LIZ(EnumC674680QdG.class, str);
    }

    public EnumC674680QdG(String str, int i) {
    }
}
