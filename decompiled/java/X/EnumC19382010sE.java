package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19382010sE {
    public static final EnumC19382010sE CREATED;
    public static final EnumC19382010sE FINISHED;
    public static final EnumC19382010sE INPROGRESS;
    public static final /* synthetic */ EnumC19382010sE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19382010sE UNKNOWN;
    public static final EnumC19382010sE WAITTOFINISH;

    public static InterfaceC2044707zh<EnumC19382010sE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19382010sE enumC19382010sE = new EnumC19382010sE("UNKNOWN", 0);
        UNKNOWN = enumC19382010sE;
        EnumC19382010sE enumC19382010sE2 = new EnumC19382010sE("CREATED", 1);
        CREATED = enumC19382010sE2;
        EnumC19382010sE enumC19382010sE3 = new EnumC19382010sE("INPROGRESS", 2);
        INPROGRESS = enumC19382010sE3;
        EnumC19382010sE enumC19382010sE4 = new EnumC19382010sE("WAITTOFINISH", 3);
        WAITTOFINISH = enumC19382010sE4;
        EnumC19382010sE enumC19382010sE5 = new EnumC19382010sE("FINISHED", 4);
        FINISHED = enumC19382010sE5;
        EnumC19382010sE[] enumC19382010sEArr = {enumC19382010sE, enumC19382010sE2, enumC19382010sE3, enumC19382010sE4, enumC19382010sE5};
        LL = enumC19382010sEArr;
        LLILLJJLI = new C2254308sP(enumC19382010sEArr);
    }

    public static EnumC19382010sE[] values() {
        return (EnumC19382010sE[]) LL.clone();
    }

    public static EnumC19382010sE valueOf(String str) {
        return (EnumC19382010sE) C08FF.LIZ(EnumC19382010sE.class, str);
    }

    public EnumC19382010sE(String str, int i) {
    }
}
