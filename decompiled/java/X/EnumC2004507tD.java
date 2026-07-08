package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004507tD {
    public static final EnumC2004507tD ALLOW;
    public static final EnumC2004507tD BLOCK_CONCURRENT_RESOURCE;
    public static final EnumC2004507tD BLOCK_DAILY_QUOTA;
    public static final /* synthetic */ EnumC2004507tD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2004507tD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2004507tD enumC2004507tD = new EnumC2004507tD("ALLOW", 0);
        ALLOW = enumC2004507tD;
        EnumC2004507tD enumC2004507tD2 = new EnumC2004507tD("BLOCK_DAILY_QUOTA", 1);
        BLOCK_DAILY_QUOTA = enumC2004507tD2;
        EnumC2004507tD enumC2004507tD3 = new EnumC2004507tD("BLOCK_CONCURRENT_RESOURCE", 2);
        BLOCK_CONCURRENT_RESOURCE = enumC2004507tD3;
        EnumC2004507tD[] enumC2004507tDArr = {enumC2004507tD, enumC2004507tD2, enumC2004507tD3};
        LL = enumC2004507tDArr;
        LLILLJJLI = new C2254308sP(enumC2004507tDArr);
    }

    public static EnumC2004507tD[] values() {
        return (EnumC2004507tD[]) LL.clone();
    }

    public static EnumC2004507tD valueOf(String str) {
        return (EnumC2004507tD) C08FF.LIZ(EnumC2004507tD.class, str);
    }

    public EnumC2004507tD(String str, int i) {
    }
}
