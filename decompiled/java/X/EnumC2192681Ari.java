package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Ari, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192681Ari {
    public static final EnumC2192681Ari HOT_LOAD;
    public static final /* synthetic */ EnumC2192681Ari[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2192681Ari MAIN_FRAME_PRELOAD;
    public static final EnumC2192681Ari NEW_CREATE;

    public static InterfaceC2044707zh<EnumC2192681Ari> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2192681Ari enumC2192681Ari = new EnumC2192681Ari("NEW_CREATE", 0);
        NEW_CREATE = enumC2192681Ari;
        EnumC2192681Ari enumC2192681Ari2 = new EnumC2192681Ari("HOT_LOAD", 1);
        HOT_LOAD = enumC2192681Ari2;
        EnumC2192681Ari enumC2192681Ari3 = new EnumC2192681Ari("MAIN_FRAME_PRELOAD", 2);
        MAIN_FRAME_PRELOAD = enumC2192681Ari3;
        EnumC2192681Ari[] enumC2192681AriArr = {enumC2192681Ari, enumC2192681Ari2, enumC2192681Ari3};
        LL = enumC2192681AriArr;
        LLILLJJLI = new C2254308sP(enumC2192681AriArr);
    }

    public static EnumC2192681Ari[] values() {
        return (EnumC2192681Ari[]) LL.clone();
    }

    public static EnumC2192681Ari valueOf(String str) {
        return (EnumC2192681Ari) C08FF.LIZ(EnumC2192681Ari.class, str);
    }

    public EnumC2192681Ari(String str, int i) {
    }
}
