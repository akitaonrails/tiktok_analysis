package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC681240Qnq {
    public static final EnumC681240Qnq Default;
    public static final /* synthetic */ EnumC681240Qnq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC681240Qnq Loading;
    public static final EnumC681240Qnq Playing;

    public static InterfaceC2044707zh<EnumC681240Qnq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC681240Qnq enumC681240Qnq = new EnumC681240Qnq("Default", 0);
        Default = enumC681240Qnq;
        EnumC681240Qnq enumC681240Qnq2 = new EnumC681240Qnq("Loading", 1);
        Loading = enumC681240Qnq2;
        EnumC681240Qnq enumC681240Qnq3 = new EnumC681240Qnq("Playing", 2);
        Playing = enumC681240Qnq3;
        EnumC681240Qnq[] enumC681240QnqArr = {enumC681240Qnq, enumC681240Qnq2, enumC681240Qnq3};
        LL = enumC681240QnqArr;
        LLILLJJLI = new C2254308sP(enumC681240QnqArr);
    }

    public static EnumC681240Qnq[] values() {
        return (EnumC681240Qnq[]) LL.clone();
    }

    public static EnumC681240Qnq valueOf(String str) {
        return (EnumC681240Qnq) C08FF.LIZ(EnumC681240Qnq.class, str);
    }

    public EnumC681240Qnq(String str, int i) {
    }
}
