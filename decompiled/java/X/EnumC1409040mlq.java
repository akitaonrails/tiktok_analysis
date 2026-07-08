package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1409040mlq {
    public static final EnumC1409040mlq DISMISSED;
    public static final /* synthetic */ EnumC1409040mlq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1409040mlq SHOWN;

    public static InterfaceC2044707zh<EnumC1409040mlq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1409040mlq enumC1409040mlq = new EnumC1409040mlq("SHOWN", 0);
        SHOWN = enumC1409040mlq;
        EnumC1409040mlq enumC1409040mlq2 = new EnumC1409040mlq("DISMISSED", 1);
        DISMISSED = enumC1409040mlq2;
        EnumC1409040mlq[] enumC1409040mlqArr = {enumC1409040mlq, enumC1409040mlq2};
        LL = enumC1409040mlqArr;
        LLILLJJLI = new C2254308sP(enumC1409040mlqArr);
    }

    public static EnumC1409040mlq[] values() {
        return (EnumC1409040mlq[]) LL.clone();
    }

    public static EnumC1409040mlq valueOf(String str) {
        return (EnumC1409040mlq) C08FF.LIZ(EnumC1409040mlq.class, str);
    }

    public EnumC1409040mlq(String str, int i) {
    }
}
