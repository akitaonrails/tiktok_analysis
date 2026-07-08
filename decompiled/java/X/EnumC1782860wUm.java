package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782860wUm {
    public static final EnumC1782860wUm INITIAL;
    public static final /* synthetic */ EnumC1782860wUm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782860wUm PAUSED;
    public static final EnumC1782860wUm PLAYING;

    public static InterfaceC2044707zh<EnumC1782860wUm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782860wUm enumC1782860wUm = new EnumC1782860wUm("PLAYING", 0);
        PLAYING = enumC1782860wUm;
        EnumC1782860wUm enumC1782860wUm2 = new EnumC1782860wUm("PAUSED", 1);
        PAUSED = enumC1782860wUm2;
        EnumC1782860wUm enumC1782860wUm3 = new EnumC1782860wUm("INITIAL", 2);
        INITIAL = enumC1782860wUm3;
        EnumC1782860wUm[] enumC1782860wUmArr = {enumC1782860wUm, enumC1782860wUm2, enumC1782860wUm3};
        LL = enumC1782860wUmArr;
        LLILLJJLI = new C2254308sP(enumC1782860wUmArr);
    }

    public static EnumC1782860wUm[] values() {
        return (EnumC1782860wUm[]) LL.clone();
    }

    public static EnumC1782860wUm valueOf(String str) {
        return (EnumC1782860wUm) C08FF.LIZ(EnumC1782860wUm.class, str);
    }

    public EnumC1782860wUm(String str, int i) {
    }
}
