package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201570hND {
    public static final EnumC1201570hND INTRO;
    public static final /* synthetic */ EnumC1201570hND[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1201570hND POPUP;

    public static InterfaceC2044707zh<EnumC1201570hND> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1201570hND enumC1201570hND = new EnumC1201570hND("POPUP", 0);
        POPUP = enumC1201570hND;
        EnumC1201570hND enumC1201570hND2 = new EnumC1201570hND("INTRO", 1);
        INTRO = enumC1201570hND2;
        EnumC1201570hND[] enumC1201570hNDArr = {enumC1201570hND, enumC1201570hND2};
        LL = enumC1201570hNDArr;
        LLILLJJLI = new C2254308sP(enumC1201570hNDArr);
    }

    public static EnumC1201570hND[] values() {
        return (EnumC1201570hND[]) LL.clone();
    }

    public static EnumC1201570hND valueOf(String str) {
        return (EnumC1201570hND) C08FF.LIZ(EnumC1201570hND.class, str);
    }

    public EnumC1201570hND(String str, int i) {
    }
}
