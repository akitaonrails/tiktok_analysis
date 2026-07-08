package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1544890qIx {
    public static final /* synthetic */ EnumC1544890qIx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1544890qIx LOAD_FINISH;
    public static final EnumC1544890qIx LOAD_START;
    public static final EnumC1544890qIx MANUAL;
    public static final EnumC1544890qIx VERY_BEGINNING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1544890qIx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1544890qIx enumC1544890qIx = new EnumC1544890qIx("LOAD_START", 0, "load_start");
        LOAD_START = enumC1544890qIx;
        EnumC1544890qIx enumC1544890qIx2 = new EnumC1544890qIx("LOAD_FINISH", 1, "load_finish");
        LOAD_FINISH = enumC1544890qIx2;
        EnumC1544890qIx enumC1544890qIx3 = new EnumC1544890qIx("VERY_BEGINNING", 2, "very_beginning");
        VERY_BEGINNING = enumC1544890qIx3;
        EnumC1544890qIx enumC1544890qIx4 = new EnumC1544890qIx("MANUAL", 3, "custom_manual");
        MANUAL = enumC1544890qIx4;
        EnumC1544890qIx[] enumC1544890qIxArr = {enumC1544890qIx, enumC1544890qIx2, enumC1544890qIx3, enumC1544890qIx4};
        LLILLJJLI = enumC1544890qIxArr;
        LLILLL = new C2254308sP(enumC1544890qIxArr);
    }

    public static EnumC1544890qIx[] values() {
        return (EnumC1544890qIx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1544890qIx valueOf(String str) {
        return (EnumC1544890qIx) C08FF.LIZ(EnumC1544890qIx.class, str);
    }

    public EnumC1544890qIx(String str, int i, String str2) {
        this.LL = str2;
    }
}
