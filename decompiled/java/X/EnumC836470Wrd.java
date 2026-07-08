package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Wrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC836470Wrd {
    public static final EnumC836470Wrd CancelSubscribe;
    public static final /* synthetic */ EnumC836470Wrd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC836470Wrd Subscribe;
    public static final EnumC836470Wrd Unknown;

    public static InterfaceC2044707zh<EnumC836470Wrd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC836470Wrd enumC836470Wrd = new EnumC836470Wrd("Unknown", 0);
        Unknown = enumC836470Wrd;
        EnumC836470Wrd enumC836470Wrd2 = new EnumC836470Wrd("Subscribe", 1);
        Subscribe = enumC836470Wrd2;
        EnumC836470Wrd enumC836470Wrd3 = new EnumC836470Wrd("CancelSubscribe", 2);
        CancelSubscribe = enumC836470Wrd3;
        EnumC836470Wrd[] enumC836470WrdArr = {enumC836470Wrd, enumC836470Wrd2, enumC836470Wrd3};
        LL = enumC836470WrdArr;
        LLILLJJLI = new C2254308sP(enumC836470WrdArr);
    }

    public static EnumC836470Wrd[] values() {
        return (EnumC836470Wrd[]) LL.clone();
    }

    public static EnumC836470Wrd valueOf(String str) {
        return (EnumC836470Wrd) C08FF.LIZ(EnumC836470Wrd.class, str);
    }

    public EnumC836470Wrd(String str, int i) {
    }
}
