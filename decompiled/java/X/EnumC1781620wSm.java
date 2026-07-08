package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781620wSm {
    public static final EnumC1781620wSm COMPLETE;
    public static final /* synthetic */ EnumC1781620wSm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781620wSm LOADING;

    public static InterfaceC2044707zh<EnumC1781620wSm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781620wSm enumC1781620wSm = new EnumC1781620wSm("LOADING", 0);
        LOADING = enumC1781620wSm;
        EnumC1781620wSm enumC1781620wSm2 = new EnumC1781620wSm("COMPLETE", 1);
        COMPLETE = enumC1781620wSm2;
        EnumC1781620wSm[] enumC1781620wSmArr = {enumC1781620wSm, enumC1781620wSm2};
        LL = enumC1781620wSmArr;
        LLILLJJLI = new C2254308sP(enumC1781620wSmArr);
    }

    public static EnumC1781620wSm[] values() {
        return (EnumC1781620wSm[]) LL.clone();
    }

    public static EnumC1781620wSm valueOf(String str) {
        return (EnumC1781620wSm) C08FF.LIZ(EnumC1781620wSm.class, str);
    }

    public EnumC1781620wSm(String str, int i) {
    }
}
