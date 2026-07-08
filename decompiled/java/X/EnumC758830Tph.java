package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC758830Tph {
    public static final EnumC758830Tph DIALOG_CLICK_NEGATIVE;
    public static final EnumC758830Tph DIALOG_CLICK_POSITIVE;
    public static final EnumC758830Tph DIALOG_SHOW;
    public static final /* synthetic */ EnumC758830Tph[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC758830Tph> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC758830Tph enumC758830Tph = new EnumC758830Tph("DIALOG_SHOW", 0);
        DIALOG_SHOW = enumC758830Tph;
        EnumC758830Tph enumC758830Tph2 = new EnumC758830Tph("DIALOG_CLICK_POSITIVE", 1);
        DIALOG_CLICK_POSITIVE = enumC758830Tph2;
        EnumC758830Tph enumC758830Tph3 = new EnumC758830Tph("DIALOG_CLICK_NEGATIVE", 2);
        DIALOG_CLICK_NEGATIVE = enumC758830Tph3;
        EnumC758830Tph[] enumC758830TphArr = {enumC758830Tph, enumC758830Tph2, enumC758830Tph3};
        LL = enumC758830TphArr;
        LLILLJJLI = new C2254308sP(enumC758830TphArr);
    }

    public static EnumC758830Tph[] values() {
        return (EnumC758830Tph[]) LL.clone();
    }

    public static EnumC758830Tph valueOf(String str) {
        return (EnumC758830Tph) C08FF.LIZ(EnumC758830Tph.class, str);
    }

    public EnumC758830Tph(String str, int i) {
    }
}
