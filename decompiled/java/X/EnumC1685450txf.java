package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0txf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1685450txf {
    public static final /* synthetic */ EnumC1685450txf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1685450txf MATCH_LIST;
    public static final EnumC1685450txf NEW_FOLLOWER_SHEET;

    public static InterfaceC2044707zh<EnumC1685450txf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1685450txf enumC1685450txf = new EnumC1685450txf("MATCH_LIST", 0);
        MATCH_LIST = enumC1685450txf;
        EnumC1685450txf enumC1685450txf2 = new EnumC1685450txf("NEW_FOLLOWER_SHEET", 1);
        NEW_FOLLOWER_SHEET = enumC1685450txf2;
        EnumC1685450txf[] enumC1685450txfArr = {enumC1685450txf, enumC1685450txf2};
        LL = enumC1685450txfArr;
        LLILLJJLI = new C2254308sP(enumC1685450txfArr);
    }

    public static EnumC1685450txf[] values() {
        return (EnumC1685450txf[]) LL.clone();
    }

    public static EnumC1685450txf valueOf(String str) {
        return (EnumC1685450txf) C08FF.LIZ(EnumC1685450txf.class, str);
    }

    public EnumC1685450txf(String str, int i) {
    }
}
