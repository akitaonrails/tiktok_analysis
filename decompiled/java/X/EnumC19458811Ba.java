package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19458811Ba {
    public static final EnumC19458811Ba LL;
    public static final EnumC19458811Ba LLILLJJLI;
    public static final EnumC19458811Ba LLILLL;
    public static final /* synthetic */ EnumC19458811Ba[] LLILZ;

    static {
        EnumC19458811Ba enumC19458811Ba = new EnumC19458811Ba("SELECT", 0);
        LL = enumC19458811Ba;
        EnumC19458811Ba enumC19458811Ba2 = new EnumC19458811Ba("DELETE", 1);
        LLILLJJLI = enumC19458811Ba2;
        EnumC19458811Ba enumC19458811Ba3 = new EnumC19458811Ba("ADD", 2);
        LLILLL = enumC19458811Ba3;
        EnumC19458811Ba[] enumC19458811BaArr = {enumC19458811Ba, enumC19458811Ba2, enumC19458811Ba3};
        LLILZ = enumC19458811BaArr;
        new C2254308sP(enumC19458811BaArr);
    }

    public static EnumC19458811Ba[] values() {
        return (EnumC19458811Ba[]) LLILZ.clone();
    }

    public static EnumC19458811Ba valueOf(String str) {
        return (EnumC19458811Ba) C08FF.LIZ(EnumC19458811Ba.class, str);
    }

    public EnumC19458811Ba(String str, int i) {
    }
}
