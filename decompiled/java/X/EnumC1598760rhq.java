package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1598760rhq {
    public static final EnumC1598760rhq CLICK;
    public static final /* synthetic */ EnumC1598760rhq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1598760rhq SHOW;

    public static InterfaceC2044707zh<EnumC1598760rhq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1598760rhq enumC1598760rhq = new EnumC1598760rhq("SHOW", 0);
        SHOW = enumC1598760rhq;
        EnumC1598760rhq enumC1598760rhq2 = new EnumC1598760rhq("CLICK", 1);
        CLICK = enumC1598760rhq2;
        EnumC1598760rhq[] enumC1598760rhqArr = {enumC1598760rhq, enumC1598760rhq2};
        LL = enumC1598760rhqArr;
        LLILLJJLI = new C2254308sP(enumC1598760rhqArr);
    }

    public static EnumC1598760rhq[] values() {
        return (EnumC1598760rhq[]) LL.clone();
    }

    public static EnumC1598760rhq valueOf(String str) {
        return (EnumC1598760rhq) C08FF.LIZ(EnumC1598760rhq.class, str);
    }

    public EnumC1598760rhq(String str, int i) {
    }
}
