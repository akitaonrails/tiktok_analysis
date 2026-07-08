package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC429101lh {
    public static final EnumC429101lh INPUT_EMPTY;
    public static final /* synthetic */ EnumC429101lh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429101lh MAX_VALUE_EXCEEDED;
    public static final EnumC429101lh MIN_VALUE_EXCEEDED;

    public static InterfaceC2044707zh<EnumC429101lh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429101lh enumC429101lh = new EnumC429101lh("MAX_VALUE_EXCEEDED", 0);
        MAX_VALUE_EXCEEDED = enumC429101lh;
        EnumC429101lh enumC429101lh2 = new EnumC429101lh("MIN_VALUE_EXCEEDED", 1);
        MIN_VALUE_EXCEEDED = enumC429101lh2;
        EnumC429101lh enumC429101lh3 = new EnumC429101lh("INPUT_EMPTY", 2);
        INPUT_EMPTY = enumC429101lh3;
        EnumC429101lh[] enumC429101lhArr = {enumC429101lh, enumC429101lh2, enumC429101lh3};
        LL = enumC429101lhArr;
        LLILLJJLI = new C2254308sP(enumC429101lhArr);
    }

    public static EnumC429101lh[] values() {
        return (EnumC429101lh[]) LL.clone();
    }

    public static EnumC429101lh valueOf(String str) {
        return (EnumC429101lh) C08FF.LIZ(EnumC429101lh.class, str);
    }

    public EnumC429101lh(String str, int i) {
    }
}
