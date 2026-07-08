package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20486415Eg {
    public static final EnumC20486415Eg LL;
    public static final EnumC20486415Eg LLILLJJLI;
    public static final EnumC20486415Eg LLILLL;
    public static final /* synthetic */ EnumC20486415Eg[] LLILZ;

    static {
        EnumC20486415Eg enumC20486415Eg = new EnumC20486415Eg("NATURAL_COMPLETE", 0);
        LL = enumC20486415Eg;
        EnumC20486415Eg enumC20486415Eg2 = new EnumC20486415Eg("INVALIDATED", 1);
        LLILLJJLI = enumC20486415Eg2;
        EnumC20486415Eg enumC20486415Eg3 = new EnumC20486415Eg("RESET", 2);
        LLILLL = enumC20486415Eg3;
        EnumC20486415Eg[] enumC20486415EgArr = {enumC20486415Eg, enumC20486415Eg2, enumC20486415Eg3};
        LLILZ = enumC20486415EgArr;
        new C2254308sP(enumC20486415EgArr);
    }

    public static EnumC20486415Eg[] values() {
        return (EnumC20486415Eg[]) LLILZ.clone();
    }

    public static EnumC20486415Eg valueOf(String str) {
        return (EnumC20486415Eg) C08FF.LIZ(EnumC20486415Eg.class, str);
    }

    public EnumC20486415Eg(String str, int i) {
    }
}
