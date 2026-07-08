package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1099670eir {
    public static final EnumC1099670eir HIDE;
    public static final /* synthetic */ EnumC1099670eir[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1099670eir SHOW;

    public static InterfaceC2044707zh<EnumC1099670eir> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1099670eir enumC1099670eir = new EnumC1099670eir("SHOW", 0);
        SHOW = enumC1099670eir;
        EnumC1099670eir enumC1099670eir2 = new EnumC1099670eir("HIDE", 1);
        HIDE = enumC1099670eir2;
        EnumC1099670eir[] enumC1099670eirArr = {enumC1099670eir, enumC1099670eir2};
        LL = enumC1099670eirArr;
        LLILLJJLI = new C2254308sP(enumC1099670eirArr);
    }

    public static EnumC1099670eir[] values() {
        return (EnumC1099670eir[]) LL.clone();
    }

    public final EnumC1099670eir converse() {
        int i = C1099680eis.LIZ[ordinal()];
        if (i == 1) {
            return HIDE;
        }
        if (i == 2) {
            return SHOW;
        }
        throw new C1954807lC();
    }

    public static EnumC1099670eir valueOf(String str) {
        return (EnumC1099670eir) C08FF.LIZ(EnumC1099670eir.class, str);
    }

    public EnumC1099670eir(String str, int i) {
    }
}
