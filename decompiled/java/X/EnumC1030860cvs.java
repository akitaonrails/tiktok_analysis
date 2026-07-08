package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1030860cvs implements InterfaceC593520NPq<Integer> {
    public static final EnumC1030860cvs FITSPLASH;
    public static final /* synthetic */ EnumC1030860cvs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1030860cvs NONETWORK;
    public static final EnumC1030860cvs REQUEST;
    public static final EnumC1030860cvs REQUEST_START;
    public static final EnumC1030860cvs TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1030860cvs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1030860cvs enumC1030860cvs = new EnumC1030860cvs("REQUEST", 0, 0);
        REQUEST = enumC1030860cvs;
        EnumC1030860cvs enumC1030860cvs2 = new EnumC1030860cvs("TIMEOUT", 1, 1);
        TIMEOUT = enumC1030860cvs2;
        EnumC1030860cvs enumC1030860cvs3 = new EnumC1030860cvs("NONETWORK", 2, 2);
        NONETWORK = enumC1030860cvs3;
        EnumC1030860cvs enumC1030860cvs4 = new EnumC1030860cvs("FITSPLASH", 3, 3);
        FITSPLASH = enumC1030860cvs4;
        EnumC1030860cvs enumC1030860cvs5 = new EnumC1030860cvs("REQUEST_START", 4, 4);
        REQUEST_START = enumC1030860cvs5;
        EnumC1030860cvs[] enumC1030860cvsArr = {enumC1030860cvs, enumC1030860cvs2, enumC1030860cvs3, enumC1030860cvs4, enumC1030860cvs5};
        LLILLJJLI = enumC1030860cvsArr;
        LLILLL = new C2254308sP(enumC1030860cvsArr);
    }

    public static EnumC1030860cvs[] values() {
        return (EnumC1030860cvs[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC593520NPq
    public Integer getParamValue() {
        return Integer.valueOf(this.LL);
    }

    public static EnumC1030860cvs valueOf(String str) {
        return (EnumC1030860cvs) C08FF.LIZ(EnumC1030860cvs.class, str);
    }

    public EnumC1030860cvs(String str, int i, int i2) {
        this.LL = i2;
    }
}
