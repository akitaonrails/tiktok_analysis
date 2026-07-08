package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ftU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144700ftU {
    public static final EnumC1144700ftU ITEM_PURGED;
    public static final EnumC1144700ftU ITEM_TIME_EXPIRED;
    public static final /* synthetic */ EnumC1144700ftU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1144700ftU MATCH_ENDED;
    public static final EnumC1144700ftU MATCH_SETTLED;

    public static InterfaceC2044707zh<EnumC1144700ftU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1144700ftU enumC1144700ftU = new EnumC1144700ftU("ITEM_TIME_EXPIRED", 0);
        ITEM_TIME_EXPIRED = enumC1144700ftU;
        EnumC1144700ftU enumC1144700ftU2 = new EnumC1144700ftU("MATCH_SETTLED", 1);
        MATCH_SETTLED = enumC1144700ftU2;
        EnumC1144700ftU enumC1144700ftU3 = new EnumC1144700ftU("ITEM_PURGED", 2);
        ITEM_PURGED = enumC1144700ftU3;
        EnumC1144700ftU enumC1144700ftU4 = new EnumC1144700ftU("MATCH_ENDED", 3);
        MATCH_ENDED = enumC1144700ftU4;
        EnumC1144700ftU[] enumC1144700ftUArr = {enumC1144700ftU, enumC1144700ftU2, enumC1144700ftU3, enumC1144700ftU4};
        LL = enumC1144700ftUArr;
        LLILLJJLI = new C2254308sP(enumC1144700ftUArr);
    }

    public static EnumC1144700ftU[] values() {
        return (EnumC1144700ftU[]) LL.clone();
    }

    public static EnumC1144700ftU valueOf(String str) {
        return (EnumC1144700ftU) C08FF.LIZ(EnumC1144700ftU.class, str);
    }

    public EnumC1144700ftU(String str, int i) {
    }
}
