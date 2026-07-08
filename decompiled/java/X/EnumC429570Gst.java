package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429570Gst {
    public static final EnumC429570Gst FILTER;
    public static final /* synthetic */ EnumC429570Gst[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429570Gst> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429570Gst enumC429570Gst = new EnumC429570Gst();
        FILTER = enumC429570Gst;
        EnumC429570Gst[] enumC429570GstArr = {enumC429570Gst};
        LL = enumC429570GstArr;
        LLILLJJLI = new C2254308sP(enumC429570GstArr);
    }

    public static EnumC429570Gst[] values() {
        return (EnumC429570Gst[]) LL.clone();
    }

    public static EnumC429570Gst valueOf(String str) {
        return (EnumC429570Gst) C08FF.LIZ(EnumC429570Gst.class, str);
    }
}
