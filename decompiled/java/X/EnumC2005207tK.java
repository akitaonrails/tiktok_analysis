package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005207tK {
    public static final EnumC2005207tK LL;
    public static final EnumC2005207tK LLILLJJLI;
    public static final /* synthetic */ EnumC2005207tK[] LLILLL;

    static {
        EnumC2005207tK enumC2005207tK = new EnumC2005207tK("WHITELIST", 0);
        LL = enumC2005207tK;
        EnumC2005207tK enumC2005207tK2 = new EnumC2005207tK("BLACKLIST", 1);
        LLILLJJLI = enumC2005207tK2;
        EnumC2005207tK[] enumC2005207tKArr = {enumC2005207tK, enumC2005207tK2};
        LLILLL = enumC2005207tKArr;
        new C2254308sP(enumC2005207tKArr);
    }

    public static EnumC2005207tK[] values() {
        return (EnumC2005207tK[]) LLILLL.clone();
    }

    public static EnumC2005207tK valueOf(String str) {
        return (EnumC2005207tK) C08FF.LIZ(EnumC2005207tK.class, str);
    }

    public EnumC2005207tK(String str, int i) {
    }
}
