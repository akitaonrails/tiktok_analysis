package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19364510pP {
    public static final /* synthetic */ EnumC19364510pP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19364510pP ONLINE;
    public static final EnumC19364510pP OTHERS;

    public static InterfaceC2044707zh<EnumC19364510pP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19364510pP enumC19364510pP = new EnumC19364510pP("ONLINE", 0);
        ONLINE = enumC19364510pP;
        EnumC19364510pP enumC19364510pP2 = new EnumC19364510pP("OTHERS", 1);
        OTHERS = enumC19364510pP2;
        EnumC19364510pP[] enumC19364510pPArr = {enumC19364510pP, enumC19364510pP2};
        LL = enumC19364510pPArr;
        LLILLJJLI = new C2254308sP(enumC19364510pPArr);
    }

    public static EnumC19364510pP[] values() {
        return (EnumC19364510pP[]) LL.clone();
    }

    public static EnumC19364510pP valueOf(String str) {
        return (EnumC19364510pP) C08FF.LIZ(EnumC19364510pP.class, str);
    }

    public EnumC19364510pP(String str, int i) {
    }
}
