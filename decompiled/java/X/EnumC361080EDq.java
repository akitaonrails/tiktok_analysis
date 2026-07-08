package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361080EDq {
    public static final /* synthetic */ EnumC361080EDq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC361080EDq RIGHT_BOTTOM;
    public static final EnumC361080EDq RIGHT_TOP;

    public static InterfaceC2044707zh<EnumC361080EDq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC361080EDq enumC361080EDq = new EnumC361080EDq("RIGHT_TOP", 0);
        RIGHT_TOP = enumC361080EDq;
        EnumC361080EDq enumC361080EDq2 = new EnumC361080EDq("RIGHT_BOTTOM", 1);
        RIGHT_BOTTOM = enumC361080EDq2;
        EnumC361080EDq[] enumC361080EDqArr = {enumC361080EDq, enumC361080EDq2};
        LL = enumC361080EDqArr;
        LLILLJJLI = new C2254308sP(enumC361080EDqArr);
    }

    public static EnumC361080EDq[] values() {
        return (EnumC361080EDq[]) LL.clone();
    }

    public static EnumC361080EDq valueOf(String str) {
        return (EnumC361080EDq) C08FF.LIZ(EnumC361080EDq.class, str);
    }

    public EnumC361080EDq(String str, int i) {
    }
}
