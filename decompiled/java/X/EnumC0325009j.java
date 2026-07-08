package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0325009j {
    public static final /* synthetic */ EnumC0325009j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0325009j TTM_TRACK_ID;
    public final int LL = 4;

    public static InterfaceC2044707zh<EnumC0325009j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0325009j enumC0325009j = new EnumC0325009j();
        TTM_TRACK_ID = enumC0325009j;
        EnumC0325009j[] enumC0325009jArr = {enumC0325009j};
        LLILLJJLI = enumC0325009jArr;
        LLILLL = new C2254308sP(enumC0325009jArr);
    }

    public static EnumC0325009j[] values() {
        return (EnumC0325009j[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC0325009j valueOf(String str) {
        return (EnumC0325009j) C08FF.LIZ(EnumC0325009j.class, str);
    }
}
