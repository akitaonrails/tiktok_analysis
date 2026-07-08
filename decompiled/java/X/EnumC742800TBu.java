package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC742800TBu {
    public static final EnumC742800TBu LL;
    public static final EnumC742800TBu LLILLJJLI;
    public static final EnumC742800TBu LLILLL;
    public static final EnumC742800TBu LLILZ;
    public static final /* synthetic */ EnumC742800TBu[] LLILZIL;

    static {
        EnumC742800TBu enumC742800TBu = new EnumC742800TBu("UN_PRELOAD", 0);
        LL = enumC742800TBu;
        EnumC742800TBu enumC742800TBu2 = new EnumC742800TBu("WAIT_TO_PRELOAD", 1);
        LLILLJJLI = enumC742800TBu2;
        EnumC742800TBu enumC742800TBu3 = new EnumC742800TBu("PRELOAD_RIGHT_NOW", 2);
        LLILLL = enumC742800TBu3;
        EnumC742800TBu enumC742800TBu4 = new EnumC742800TBu("PRELOADED", 3);
        LLILZ = enumC742800TBu4;
        EnumC742800TBu[] enumC742800TBuArr = {enumC742800TBu, enumC742800TBu2, enumC742800TBu3, enumC742800TBu4};
        LLILZIL = enumC742800TBuArr;
        new C2254308sP(enumC742800TBuArr);
    }

    public static EnumC742800TBu[] values() {
        return (EnumC742800TBu[]) LLILZIL.clone();
    }

    public static EnumC742800TBu valueOf(String str) {
        return (EnumC742800TBu) C08FF.LIZ(EnumC742800TBu.class, str);
    }

    public EnumC742800TBu(String str, int i) {
    }
}
