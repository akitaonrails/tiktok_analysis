package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1285050jXr {
    public static final EnumC1285050jXr LIVE;
    public static final /* synthetic */ EnumC1285050jXr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1285050jXr NORMAL;
    public static final EnumC1285050jXr NOWS;

    public static InterfaceC2044707zh<EnumC1285050jXr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1285050jXr enumC1285050jXr = new EnumC1285050jXr("NORMAL", 0);
        NORMAL = enumC1285050jXr;
        EnumC1285050jXr enumC1285050jXr2 = new EnumC1285050jXr("NOWS", 1);
        NOWS = enumC1285050jXr2;
        EnumC1285050jXr enumC1285050jXr3 = new EnumC1285050jXr("LIVE", 2);
        LIVE = enumC1285050jXr3;
        EnumC1285050jXr[] enumC1285050jXrArr = {enumC1285050jXr, enumC1285050jXr2, enumC1285050jXr3};
        LL = enumC1285050jXrArr;
        LLILLJJLI = new C2254308sP(enumC1285050jXrArr);
    }

    public static EnumC1285050jXr[] values() {
        return (EnumC1285050jXr[]) LL.clone();
    }

    public static EnumC1285050jXr valueOf(String str) {
        return (EnumC1285050jXr) C08FF.LIZ(EnumC1285050jXr.class, str);
    }

    public EnumC1285050jXr(String str, int i) {
    }
}
