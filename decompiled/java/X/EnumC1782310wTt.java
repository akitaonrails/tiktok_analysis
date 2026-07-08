package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782310wTt {
    public static final EnumC1782310wTt AVOID_VISIBLE;
    public static final EnumC1782310wTt DISMISS_ALL_TO_SHOW;
    public static final EnumC1782310wTt DISMISS_VISIBLE_OVERLAP_TO_SHOW;
    public static final /* synthetic */ EnumC1782310wTt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782310wTt NOT_AVOID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1782310wTt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782310wTt enumC1782310wTt = new EnumC1782310wTt("NOT_AVOID", 0, 0);
        NOT_AVOID = enumC1782310wTt;
        EnumC1782310wTt enumC1782310wTt2 = new EnumC1782310wTt("AVOID_VISIBLE", 1, 1);
        AVOID_VISIBLE = enumC1782310wTt2;
        EnumC1782310wTt enumC1782310wTt3 = new EnumC1782310wTt("DISMISS_ALL_TO_SHOW", 2, 2);
        DISMISS_ALL_TO_SHOW = enumC1782310wTt3;
        EnumC1782310wTt enumC1782310wTt4 = new EnumC1782310wTt("DISMISS_VISIBLE_OVERLAP_TO_SHOW", 3, 3);
        DISMISS_VISIBLE_OVERLAP_TO_SHOW = enumC1782310wTt4;
        EnumC1782310wTt[] enumC1782310wTtArr = {enumC1782310wTt, enumC1782310wTt2, enumC1782310wTt3, enumC1782310wTt4};
        LLILLJJLI = enumC1782310wTtArr;
        LLILLL = new C2254308sP(enumC1782310wTtArr);
    }

    public static EnumC1782310wTt[] values() {
        return (EnumC1782310wTt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1782310wTt valueOf(String str) {
        return (EnumC1782310wTt) C08FF.LIZ(EnumC1782310wTt.class, str);
    }

    public EnumC1782310wTt(String str, int i, int i2) {
        this.LL = i2;
    }
}
