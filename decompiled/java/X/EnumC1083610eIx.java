package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083610eIx {
    public static final EnumC1083610eIx CACHE_SHOW;
    public static final EnumC1083610eIx END;
    public static final /* synthetic */ EnumC1083610eIx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083610eIx START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1083610eIx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083610eIx enumC1083610eIx = new EnumC1083610eIx("START", 0, "start");
        START = enumC1083610eIx;
        EnumC1083610eIx enumC1083610eIx2 = new EnumC1083610eIx("CACHE_SHOW", 1, "cache_show");
        CACHE_SHOW = enumC1083610eIx2;
        EnumC1083610eIx enumC1083610eIx3 = new EnumC1083610eIx("END", 2, "end");
        END = enumC1083610eIx3;
        EnumC1083610eIx[] enumC1083610eIxArr = {enumC1083610eIx, enumC1083610eIx2, enumC1083610eIx3};
        LLILLJJLI = enumC1083610eIxArr;
        LLILLL = new C2254308sP(enumC1083610eIxArr);
    }

    public static EnumC1083610eIx[] values() {
        return (EnumC1083610eIx[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1083610eIx valueOf(String str) {
        return (EnumC1083610eIx) C08FF.LIZ(EnumC1083610eIx.class, str);
    }

    public EnumC1083610eIx(String str, int i, String str2) {
        this.LL = str2;
    }
}
