package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Wcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC827250Wcl {
    public static final EnumC827250Wcl BUNDLE;
    public static final /* synthetic */ EnumC827250Wcl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC827250Wcl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC827250Wcl enumC827250Wcl = new EnumC827250Wcl();
        BUNDLE = enumC827250Wcl;
        EnumC827250Wcl[] enumC827250WclArr = {enumC827250Wcl};
        LLILLJJLI = enumC827250WclArr;
        LLILLL = new C2254308sP(enumC827250WclArr);
    }

    public static EnumC827250Wcl[] values() {
        return (EnumC827250Wcl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC827250Wcl valueOf(String str) {
        return (EnumC827250Wcl) C08FF.LIZ(EnumC827250Wcl.class, str);
    }
}
