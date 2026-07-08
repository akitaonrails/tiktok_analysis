package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781750wSz {
    public static final /* synthetic */ EnumC1781750wSz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781750wSz RELOAD;
    public static final EnumC1781750wSz UPDATE;

    public static InterfaceC2044707zh<EnumC1781750wSz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781750wSz enumC1781750wSz = new EnumC1781750wSz("RELOAD", 0);
        RELOAD = enumC1781750wSz;
        EnumC1781750wSz enumC1781750wSz2 = new EnumC1781750wSz("UPDATE", 1);
        UPDATE = enumC1781750wSz2;
        EnumC1781750wSz[] enumC1781750wSzArr = {enumC1781750wSz, enumC1781750wSz2};
        LL = enumC1781750wSzArr;
        LLILLJJLI = new C2254308sP(enumC1781750wSzArr);
    }

    public static EnumC1781750wSz[] values() {
        return (EnumC1781750wSz[]) LL.clone();
    }

    public static EnumC1781750wSz valueOf(String str) {
        return (EnumC1781750wSz) C08FF.LIZ(EnumC1781750wSz.class, str);
    }

    public EnumC1781750wSz(String str, int i) {
    }
}
