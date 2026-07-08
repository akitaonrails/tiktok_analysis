package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1043330dFz {
    public static final EnumC1043330dFz DOMAIN;
    public static final EnumC1043330dFz HITPREFETCH;
    public static final /* synthetic */ EnumC1043330dFz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1043330dFz NONE;
    public static final EnumC1043330dFz OFFLINE;
    public static final EnumC1043330dFz PREFETCH;

    public static InterfaceC2044707zh<EnumC1043330dFz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1043330dFz enumC1043330dFz = new EnumC1043330dFz("NONE", 0);
        NONE = enumC1043330dFz;
        EnumC1043330dFz enumC1043330dFz2 = new EnumC1043330dFz("OFFLINE", 1);
        OFFLINE = enumC1043330dFz2;
        EnumC1043330dFz enumC1043330dFz3 = new EnumC1043330dFz("PREFETCH", 2);
        PREFETCH = enumC1043330dFz3;
        EnumC1043330dFz enumC1043330dFz4 = new EnumC1043330dFz("DOMAIN", 3);
        DOMAIN = enumC1043330dFz4;
        EnumC1043330dFz enumC1043330dFz5 = new EnumC1043330dFz("HITPREFETCH", 4);
        HITPREFETCH = enumC1043330dFz5;
        EnumC1043330dFz[] enumC1043330dFzArr = {enumC1043330dFz, enumC1043330dFz2, enumC1043330dFz3, enumC1043330dFz4, enumC1043330dFz5};
        LL = enumC1043330dFzArr;
        LLILLJJLI = new C2254308sP(enumC1043330dFzArr);
    }

    public static EnumC1043330dFz[] values() {
        return (EnumC1043330dFz[]) LL.clone();
    }

    public static EnumC1043330dFz valueOf(String str) {
        return (EnumC1043330dFz) C08FF.LIZ(EnumC1043330dFz.class, str);
    }

    public EnumC1043330dFz(String str, int i) {
    }
}
