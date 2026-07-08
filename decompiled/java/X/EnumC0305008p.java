package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0305008p {
    public static final /* synthetic */ EnumC0305008p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0305008p UNKNOWN;
    public static final EnumC0305008p WATERMARK_FRAME;

    public static InterfaceC2044707zh<EnumC0305008p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0305008p enumC0305008p = new EnumC0305008p("UNKNOWN", 0);
        UNKNOWN = enumC0305008p;
        EnumC0305008p enumC0305008p2 = new EnumC0305008p("WATERMARK_FRAME", 1);
        WATERMARK_FRAME = enumC0305008p2;
        EnumC0305008p[] enumC0305008pArr = {enumC0305008p, enumC0305008p2};
        LL = enumC0305008pArr;
        LLILLJJLI = new C2254308sP(enumC0305008pArr);
    }

    public static EnumC0305008p[] values() {
        return (EnumC0305008p[]) LL.clone();
    }

    public static EnumC0305008p valueOf(String str) {
        return (EnumC0305008p) C08FF.LIZ(EnumC0305008p.class, str);
    }

    public EnumC0305008p(String str, int i) {
    }
}
