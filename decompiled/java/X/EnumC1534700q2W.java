package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534700q2W {
    public static final EnumC1534700q2W EXPIRED;
    public static final /* synthetic */ EnumC1534700q2W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1534700q2W NEGOTIATED;
    public static final EnumC1534700q2W NORMAL;
    public static final EnumC1534700q2W REUSE;

    public static InterfaceC2044707zh<EnumC1534700q2W> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534700q2W enumC1534700q2W = new EnumC1534700q2W("EXPIRED", 0);
        EXPIRED = enumC1534700q2W;
        EnumC1534700q2W enumC1534700q2W2 = new EnumC1534700q2W("NEGOTIATED", 1);
        NEGOTIATED = enumC1534700q2W2;
        EnumC1534700q2W enumC1534700q2W3 = new EnumC1534700q2W("NORMAL", 2);
        NORMAL = enumC1534700q2W3;
        EnumC1534700q2W enumC1534700q2W4 = new EnumC1534700q2W("REUSE", 3);
        REUSE = enumC1534700q2W4;
        EnumC1534700q2W[] enumC1534700q2WArr = {enumC1534700q2W, enumC1534700q2W2, enumC1534700q2W3, enumC1534700q2W4};
        LL = enumC1534700q2WArr;
        LLILLJJLI = new C2254308sP(enumC1534700q2WArr);
    }

    public static EnumC1534700q2W[] values() {
        return (EnumC1534700q2W[]) LL.clone();
    }

    public static EnumC1534700q2W valueOf(String str) {
        return (EnumC1534700q2W) C08FF.LIZ(EnumC1534700q2W.class, str);
    }

    public EnumC1534700q2W(String str, int i) {
    }
}
