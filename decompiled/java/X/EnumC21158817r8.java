package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21158817r8 {
    public static final EnumC21158817r8 LL;
    public static final EnumC21158817r8 LLILLJJLI;
    public static final EnumC21158817r8 LLILLL;
    public static final /* synthetic */ EnumC21158817r8[] LLILZ;

    static {
        EnumC21158817r8 enumC21158817r8 = new EnumC21158817r8("COMMITTED", 0);
        LL = enumC21158817r8;
        EnumC21158817r8 enumC21158817r82 = new EnumC21158817r8("STALE_SKIPPED", 1);
        LLILLJJLI = enumC21158817r82;
        EnumC21158817r8 enumC21158817r83 = new EnumC21158817r8("DEFERRED_ZERO_SIZE", 2);
        LLILLL = enumC21158817r83;
        EnumC21158817r8[] enumC21158817r8Arr = {enumC21158817r8, enumC21158817r82, enumC21158817r83};
        LLILZ = enumC21158817r8Arr;
        new C2254308sP(enumC21158817r8Arr);
    }

    public static EnumC21158817r8[] values() {
        return (EnumC21158817r8[]) LLILZ.clone();
    }

    public static EnumC21158817r8 valueOf(String str) {
        return (EnumC21158817r8) C08FF.LIZ(EnumC21158817r8.class, str);
    }

    public EnumC21158817r8(String str, int i) {
    }
}
