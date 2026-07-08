package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1234850iEt {
    public static final EnumC1234850iEt EXPLORE;
    public static final /* synthetic */ EnumC1234850iEt[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1234850iEt MY_GROUPS;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1234850iEt> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1234850iEt enumC1234850iEt = new EnumC1234850iEt("MY_GROUPS", 0, 1, 2131828308);
        MY_GROUPS = enumC1234850iEt;
        EnumC1234850iEt enumC1234850iEt2 = new EnumC1234850iEt("EXPLORE", 1, 2, 2131828309);
        EXPLORE = enumC1234850iEt2;
        EnumC1234850iEt[] enumC1234850iEtArr = {enumC1234850iEt, enumC1234850iEt2};
        LLILLL = enumC1234850iEtArr;
        LLILZ = new C2254308sP(enumC1234850iEtArr);
    }

    public static EnumC1234850iEt[] values() {
        return (EnumC1234850iEt[]) LLILLL.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public final int getTitleStarling() {
        return this.LLILLJJLI;
    }

    public static EnumC1234850iEt valueOf(String str) {
        return (EnumC1234850iEt) C08FF.LIZ(EnumC1234850iEt.class, str);
    }

    public EnumC1234850iEt(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
