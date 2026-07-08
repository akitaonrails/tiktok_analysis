package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778950wOT {
    public static final EnumC1778950wOT CURRENT_PERIOD;
    public static final EnumC1778950wOT HISTORY;
    public static final /* synthetic */ EnumC1778950wOT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778950wOT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778950wOT enumC1778950wOT = new EnumC1778950wOT("CURRENT_PERIOD", 0);
        CURRENT_PERIOD = enumC1778950wOT;
        EnumC1778950wOT enumC1778950wOT2 = new EnumC1778950wOT("HISTORY", 1);
        HISTORY = enumC1778950wOT2;
        EnumC1778950wOT[] enumC1778950wOTArr = {enumC1778950wOT, enumC1778950wOT2};
        LL = enumC1778950wOTArr;
        LLILLJJLI = new C2254308sP(enumC1778950wOTArr);
    }

    public static EnumC1778950wOT[] values() {
        return (EnumC1778950wOT[]) LL.clone();
    }

    public static EnumC1778950wOT valueOf(String str) {
        return (EnumC1778950wOT) C08FF.LIZ(EnumC1778950wOT.class, str);
    }

    public EnumC1778950wOT(String str, int i) {
    }
}
