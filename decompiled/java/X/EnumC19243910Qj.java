package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19243910Qj {
    public static final C19244410Qo Companion;
    public static final EnumC19243910Qj FEED;
    public static final /* synthetic */ EnumC19243910Qj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19243910Qj MUSIC_DETAIL;
    public static final EnumC19243910Qj SHOOT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19243910Qj> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10Qo] */
    static {
        EnumC19243910Qj enumC19243910Qj = new EnumC19243910Qj("FEED", 0, 1);
        FEED = enumC19243910Qj;
        EnumC19243910Qj enumC19243910Qj2 = new EnumC19243910Qj("MUSIC_DETAIL", 1, 2);
        MUSIC_DETAIL = enumC19243910Qj2;
        EnumC19243910Qj enumC19243910Qj3 = new EnumC19243910Qj("SHOOT", 2, 3);
        SHOOT = enumC19243910Qj3;
        EnumC19243910Qj[] enumC19243910QjArr = {enumC19243910Qj, enumC19243910Qj2, enumC19243910Qj3};
        LLILLJJLI = enumC19243910QjArr;
        LLILLL = new C2254308sP(enumC19243910QjArr);
        Companion = new Object() { // from class: X.10Qo
        };
    }

    public static EnumC19243910Qj[] values() {
        return (EnumC19243910Qj[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19243910Qj valueOf(String str) {
        return (EnumC19243910Qj) C08FF.LIZ(EnumC19243910Qj.class, str);
    }

    public EnumC19243910Qj(String str, int i, int i2) {
        this.LL = i2;
    }
}
