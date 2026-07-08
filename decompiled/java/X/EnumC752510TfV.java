package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC752510TfV {
    public static final EnumC752510TfV EDIT;
    public static final EnumC752510TfV GUIDE;
    public static final /* synthetic */ EnumC752510TfV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC752510TfV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC752510TfV enumC752510TfV = new EnumC752510TfV("GUIDE", 0);
        GUIDE = enumC752510TfV;
        EnumC752510TfV enumC752510TfV2 = new EnumC752510TfV("EDIT", 1);
        EDIT = enumC752510TfV2;
        EnumC752510TfV[] enumC752510TfVArr = {enumC752510TfV, enumC752510TfV2};
        LL = enumC752510TfVArr;
        LLILLJJLI = new C2254308sP(enumC752510TfVArr);
    }

    public static EnumC752510TfV[] values() {
        return (EnumC752510TfV[]) LL.clone();
    }

    public static EnumC752510TfV valueOf(String str) {
        return (EnumC752510TfV) C08FF.LIZ(EnumC752510TfV.class, str);
    }

    public EnumC752510TfV(String str, int i) {
    }
}
