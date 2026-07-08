package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007207te {
    public static final EnumC2007207te DirectRecord;
    public static final EnumC2007207te Draft;
    public static final /* synthetic */ EnumC2007207te[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2007207te> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007207te enumC2007207te = new EnumC2007207te("DirectRecord", 0);
        DirectRecord = enumC2007207te;
        EnumC2007207te enumC2007207te2 = new EnumC2007207te("Draft", 1);
        Draft = enumC2007207te2;
        EnumC2007207te[] enumC2007207teArr = {enumC2007207te, enumC2007207te2};
        LL = enumC2007207teArr;
        LLILLJJLI = new C2254308sP(enumC2007207teArr);
    }

    public static EnumC2007207te[] values() {
        return (EnumC2007207te[]) LL.clone();
    }

    public static EnumC2007207te valueOf(String str) {
        return (EnumC2007207te) C08FF.LIZ(EnumC2007207te.class, str);
    }

    public EnumC2007207te(String str, int i) {
    }
}
