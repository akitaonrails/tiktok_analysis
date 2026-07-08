package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.018s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2856018s {
    public static final EnumC2856018s FINISHED;
    public static final EnumC2856018s HIDDEN;
    public static final /* synthetic */ EnumC2856018s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2856018s STARTED;

    public static InterfaceC2044707zh<EnumC2856018s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2856018s enumC2856018s = new EnumC2856018s("HIDDEN", 0);
        HIDDEN = enumC2856018s;
        EnumC2856018s enumC2856018s2 = new EnumC2856018s("STARTED", 1);
        STARTED = enumC2856018s2;
        EnumC2856018s enumC2856018s3 = new EnumC2856018s("FINISHED", 2);
        FINISHED = enumC2856018s3;
        EnumC2856018s[] enumC2856018sArr = {enumC2856018s, enumC2856018s2, enumC2856018s3};
        LL = enumC2856018sArr;
        LLILLJJLI = new C2254308sP(enumC2856018sArr);
    }

    public static EnumC2856018s[] values() {
        return (EnumC2856018s[]) LL.clone();
    }

    public static EnumC2856018s valueOf(String str) {
        return (EnumC2856018s) C08FF.LIZ(EnumC2856018s.class, str);
    }

    public EnumC2856018s(String str, int i) {
    }
}
