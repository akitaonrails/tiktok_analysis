package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1419290n2N {
    public static final /* synthetic */ EnumC1419290n2N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1419290n2N STAGE_BIND;
    public static final EnumC1419290n2N STAGE_PRE_UPLOAD;
    public static final EnumC1419290n2N STAGE_UPLOAD_ZIP;

    public static InterfaceC2044707zh<EnumC1419290n2N> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1419290n2N enumC1419290n2N = new EnumC1419290n2N("STAGE_PRE_UPLOAD", 0);
        STAGE_PRE_UPLOAD = enumC1419290n2N;
        EnumC1419290n2N enumC1419290n2N2 = new EnumC1419290n2N("STAGE_UPLOAD_ZIP", 1);
        STAGE_UPLOAD_ZIP = enumC1419290n2N2;
        EnumC1419290n2N enumC1419290n2N3 = new EnumC1419290n2N("STAGE_BIND", 2);
        STAGE_BIND = enumC1419290n2N3;
        EnumC1419290n2N[] enumC1419290n2NArr = {enumC1419290n2N, enumC1419290n2N2, enumC1419290n2N3};
        LL = enumC1419290n2NArr;
        LLILLJJLI = new C2254308sP(enumC1419290n2NArr);
    }

    public static EnumC1419290n2N[] values() {
        return (EnumC1419290n2N[]) LL.clone();
    }

    public static EnumC1419290n2N valueOf(String str) {
        return (EnumC1419290n2N) C08FF.LIZ(EnumC1419290n2N.class, str);
    }

    public EnumC1419290n2N(String str, int i) {
    }
}
