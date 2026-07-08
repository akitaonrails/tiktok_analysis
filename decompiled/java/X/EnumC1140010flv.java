package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0flv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1140010flv {
    public static final EnumC1140010flv CANCEL;
    public static final EnumC1140010flv DONE;
    public static final EnumC1140010flv ERROR;
    public static final /* synthetic */ EnumC1140010flv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1140010flv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1140010flv enumC1140010flv = new EnumC1140010flv("DONE", 0);
        DONE = enumC1140010flv;
        EnumC1140010flv enumC1140010flv2 = new EnumC1140010flv("ERROR", 1);
        ERROR = enumC1140010flv2;
        EnumC1140010flv enumC1140010flv3 = new EnumC1140010flv("CANCEL", 2);
        CANCEL = enumC1140010flv3;
        EnumC1140010flv[] enumC1140010flvArr = {enumC1140010flv, enumC1140010flv2, enumC1140010flv3};
        LL = enumC1140010flvArr;
        LLILLJJLI = new C2254308sP(enumC1140010flvArr);
    }

    public static EnumC1140010flv[] values() {
        return (EnumC1140010flv[]) LL.clone();
    }

    public static EnumC1140010flv valueOf(String str) {
        return (EnumC1140010flv) C08FF.LIZ(EnumC1140010flv.class, str);
    }

    public EnumC1140010flv(String str, int i) {
    }
}
