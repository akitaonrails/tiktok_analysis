package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1603630rph {
    public static final /* synthetic */ EnumC1603630rph[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1603630rph LOADMORE;
    public static final EnumC1603630rph REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1603630rph> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1603630rph enumC1603630rph = new EnumC1603630rph("REFRESH", 0, 1);
        REFRESH = enumC1603630rph;
        EnumC1603630rph enumC1603630rph2 = new EnumC1603630rph("LOADMORE", 1, 2);
        LOADMORE = enumC1603630rph2;
        EnumC1603630rph[] enumC1603630rphArr = {enumC1603630rph, enumC1603630rph2};
        LLILLJJLI = enumC1603630rphArr;
        LLILLL = new C2254308sP(enumC1603630rphArr);
    }

    public static EnumC1603630rph[] values() {
        return (EnumC1603630rph[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1603630rph valueOf(String str) {
        return (EnumC1603630rph) C08FF.LIZ(EnumC1603630rph.class, str);
    }

    public EnumC1603630rph(String str, int i, int i2) {
        this.LL = i2;
    }
}
