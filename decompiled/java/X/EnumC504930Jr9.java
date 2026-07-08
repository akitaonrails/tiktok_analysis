package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC504930Jr9 {
    public static final EnumC504930Jr9 COMMENT;
    public static final /* synthetic */ EnumC504930Jr9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC504930Jr9 REPLY;
    public static final EnumC504930Jr9 REPLY_TO_REPLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC504930Jr9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC504930Jr9 enumC504930Jr9 = new EnumC504930Jr9("COMMENT", 0, 0);
        COMMENT = enumC504930Jr9;
        EnumC504930Jr9 enumC504930Jr92 = new EnumC504930Jr9("REPLY", 1, 1);
        REPLY = enumC504930Jr92;
        EnumC504930Jr9 enumC504930Jr93 = new EnumC504930Jr9("REPLY_TO_REPLY", 2, 2);
        REPLY_TO_REPLY = enumC504930Jr93;
        EnumC504930Jr9[] enumC504930Jr9Arr = {enumC504930Jr9, enumC504930Jr92, enumC504930Jr93};
        LLILLJJLI = enumC504930Jr9Arr;
        LLILLL = new C2254308sP(enumC504930Jr9Arr);
    }

    public static EnumC504930Jr9[] values() {
        return (EnumC504930Jr9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC504930Jr9 valueOf(String str) {
        return (EnumC504930Jr9) C08FF.LIZ(EnumC504930Jr9.class, str);
    }

    public EnumC504930Jr9(String str, int i, int i2) {
        this.LL = i2;
    }
}
