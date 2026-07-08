package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC313620CRc {
    public static final EnumC313620CRc ACCUMULATE;
    public static final /* synthetic */ EnumC313620CRc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC313620CRc MERGE;
    public static final EnumC313620CRc OVERRIDE;

    public static InterfaceC2044707zh<EnumC313620CRc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC313620CRc enumC313620CRc = new EnumC313620CRc("MERGE", 0);
        MERGE = enumC313620CRc;
        EnumC313620CRc enumC313620CRc2 = new EnumC313620CRc("OVERRIDE", 1);
        OVERRIDE = enumC313620CRc2;
        EnumC313620CRc enumC313620CRc3 = new EnumC313620CRc("ACCUMULATE", 2);
        ACCUMULATE = enumC313620CRc3;
        EnumC313620CRc[] enumC313620CRcArr = {enumC313620CRc, enumC313620CRc2, enumC313620CRc3};
        LL = enumC313620CRcArr;
        LLILLJJLI = new C2254308sP(enumC313620CRcArr);
    }

    public static EnumC313620CRc[] values() {
        return (EnumC313620CRc[]) LL.clone();
    }

    public static EnumC313620CRc valueOf(String str) {
        return (EnumC313620CRc) C08FF.LIZ(EnumC313620CRc.class, str);
    }

    public EnumC313620CRc(String str, int i) {
    }
}
