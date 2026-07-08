package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1674410tfr {
    public static final EnumC1674410tfr CREATION;
    public static final EnumC1674410tfr EDIT_COVER;
    public static final /* synthetic */ EnumC1674410tfr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1674410tfr PREVIEW;

    public static InterfaceC2044707zh<EnumC1674410tfr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1674410tfr enumC1674410tfr = new EnumC1674410tfr("PREVIEW", 0);
        PREVIEW = enumC1674410tfr;
        EnumC1674410tfr enumC1674410tfr2 = new EnumC1674410tfr("CREATION", 1);
        CREATION = enumC1674410tfr2;
        EnumC1674410tfr enumC1674410tfr3 = new EnumC1674410tfr("EDIT_COVER", 2);
        EDIT_COVER = enumC1674410tfr3;
        EnumC1674410tfr[] enumC1674410tfrArr = {enumC1674410tfr, enumC1674410tfr2, enumC1674410tfr3};
        LL = enumC1674410tfrArr;
        LLILLJJLI = new C2254308sP(enumC1674410tfrArr);
    }

    public static EnumC1674410tfr[] values() {
        return (EnumC1674410tfr[]) LL.clone();
    }

    public static EnumC1674410tfr valueOf(String str) {
        return (EnumC1674410tfr) C08FF.LIZ(EnumC1674410tfr.class, str);
    }

    public EnumC1674410tfr(String str, int i) {
    }
}
