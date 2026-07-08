package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ouq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC634620Ouq {
    public static final EnumC634620Ouq FEEDBACK;
    public static final /* synthetic */ EnumC634620Ouq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC634620Ouq SWITCH;

    public static InterfaceC2044707zh<EnumC634620Ouq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC634620Ouq enumC634620Ouq = new EnumC634620Ouq("SWITCH", 0);
        SWITCH = enumC634620Ouq;
        EnumC634620Ouq enumC634620Ouq2 = new EnumC634620Ouq("FEEDBACK", 1);
        FEEDBACK = enumC634620Ouq2;
        EnumC634620Ouq[] enumC634620OuqArr = {enumC634620Ouq, enumC634620Ouq2};
        LL = enumC634620OuqArr;
        LLILLJJLI = new C2254308sP(enumC634620OuqArr);
    }

    public static EnumC634620Ouq[] values() {
        return (EnumC634620Ouq[]) LL.clone();
    }

    public static EnumC634620Ouq valueOf(String str) {
        return (EnumC634620Ouq) C08FF.LIZ(EnumC634620Ouq.class, str);
    }

    public EnumC634620Ouq(String str, int i) {
    }
}
