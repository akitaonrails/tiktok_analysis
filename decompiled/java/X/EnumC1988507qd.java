package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988507qd {
    public static final EnumC1988507qd FOCUS_RECORD;
    public static final /* synthetic */ EnumC1988507qd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1988507qd REVERSE_RECORD;

    public static InterfaceC2044707zh<EnumC1988507qd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1988507qd enumC1988507qd = new EnumC1988507qd("REVERSE_RECORD", 0);
        REVERSE_RECORD = enumC1988507qd;
        EnumC1988507qd enumC1988507qd2 = new EnumC1988507qd("FOCUS_RECORD", 1);
        FOCUS_RECORD = enumC1988507qd2;
        EnumC1988507qd[] enumC1988507qdArr = {enumC1988507qd, enumC1988507qd2};
        LL = enumC1988507qdArr;
        LLILLJJLI = new C2254308sP(enumC1988507qdArr);
    }

    public static EnumC1988507qd[] values() {
        return (EnumC1988507qd[]) LL.clone();
    }

    public static EnumC1988507qd valueOf(String str) {
        return (EnumC1988507qd) C08FF.LIZ(EnumC1988507qd.class, str);
    }

    public EnumC1988507qd(String str, int i) {
    }
}
