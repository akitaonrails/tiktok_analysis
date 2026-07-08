package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ibv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1249130ibv {
    public static final EnumC1249130ibv CENTER_AREA;
    public static final EnumC1249130ibv END_AREA;
    public static final /* synthetic */ EnumC1249130ibv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1249130ibv NULL;
    public static final EnumC1249130ibv START_AREA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1249130ibv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1249130ibv enumC1249130ibv = new EnumC1249130ibv("NULL", 0, "");
        NULL = enumC1249130ibv;
        EnumC1249130ibv enumC1249130ibv2 = new EnumC1249130ibv("START_AREA", 1, "start");
        START_AREA = enumC1249130ibv2;
        EnumC1249130ibv enumC1249130ibv3 = new EnumC1249130ibv("CENTER_AREA", 2, "center");
        CENTER_AREA = enumC1249130ibv3;
        EnumC1249130ibv enumC1249130ibv4 = new EnumC1249130ibv("END_AREA", 3, "end");
        END_AREA = enumC1249130ibv4;
        EnumC1249130ibv[] enumC1249130ibvArr = {enumC1249130ibv, enumC1249130ibv2, enumC1249130ibv3, enumC1249130ibv4};
        LLILLJJLI = enumC1249130ibvArr;
        LLILLL = new C2254308sP(enumC1249130ibvArr);
    }

    public static EnumC1249130ibv[] values() {
        return (EnumC1249130ibv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1249130ibv valueOf(String str) {
        return (EnumC1249130ibv) C08FF.LIZ(EnumC1249130ibv.class, str);
    }

    public EnumC1249130ibv(String str, int i, String str2) {
        this.LL = str2;
    }
}
