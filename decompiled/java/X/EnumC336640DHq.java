package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC336640DHq {
    public static final EnumC336640DHq APPLY;
    public static final EnumC336640DHq CANCEL;
    public static final /* synthetic */ EnumC336640DHq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC336640DHq STOP;

    public static InterfaceC2044707zh<EnumC336640DHq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC336640DHq enumC336640DHq = new EnumC336640DHq("APPLY", 0);
        APPLY = enumC336640DHq;
        EnumC336640DHq enumC336640DHq2 = new EnumC336640DHq("CANCEL", 1);
        CANCEL = enumC336640DHq2;
        EnumC336640DHq enumC336640DHq3 = new EnumC336640DHq("STOP", 2);
        STOP = enumC336640DHq3;
        EnumC336640DHq[] enumC336640DHqArr = {enumC336640DHq, enumC336640DHq2, enumC336640DHq3};
        LL = enumC336640DHqArr;
        LLILLJJLI = new C2254308sP(enumC336640DHqArr);
    }

    public static EnumC336640DHq[] values() {
        return (EnumC336640DHq[]) LL.clone();
    }

    public static EnumC336640DHq valueOf(String str) {
        return (EnumC336640DHq) C08FF.LIZ(EnumC336640DHq.class, str);
    }

    public EnumC336640DHq(String str, int i) {
    }
}
