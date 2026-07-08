package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC756450Tlr {
    public static final EnumC756450Tlr LEADS_GEN_AUDIENCE;
    public static final EnumC756450Tlr LEADS_GEN_BA_DURING_LIVE;
    public static final /* synthetic */ EnumC756450Tlr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC756450Tlr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC756450Tlr enumC756450Tlr = new EnumC756450Tlr("LEADS_GEN_AUDIENCE", 0);
        LEADS_GEN_AUDIENCE = enumC756450Tlr;
        EnumC756450Tlr enumC756450Tlr2 = new EnumC756450Tlr("LEADS_GEN_BA_DURING_LIVE", 1);
        LEADS_GEN_BA_DURING_LIVE = enumC756450Tlr2;
        EnumC756450Tlr[] enumC756450TlrArr = {enumC756450Tlr, enumC756450Tlr2};
        LL = enumC756450TlrArr;
        LLILLJJLI = new C2254308sP(enumC756450TlrArr);
    }

    public static EnumC756450Tlr[] values() {
        return (EnumC756450Tlr[]) LL.clone();
    }

    public static EnumC756450Tlr valueOf(String str) {
        return (EnumC756450Tlr) C08FF.LIZ(EnumC756450Tlr.class, str);
    }

    public EnumC756450Tlr(String str, int i) {
    }
}
