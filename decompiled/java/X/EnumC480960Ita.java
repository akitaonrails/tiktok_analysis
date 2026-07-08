package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ita, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC480960Ita {
    public static final /* synthetic */ EnumC480960Ita[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC480960Ita PRECREATE;
    public static final EnumC480960Ita PREIO;
    public static final EnumC480960Ita PRELOAD;
    public static final EnumC480960Ita PREPARE;

    public static InterfaceC2044707zh<EnumC480960Ita> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC480960Ita enumC480960Ita = new EnumC480960Ita("PRECREATE", 0);
        PRECREATE = enumC480960Ita;
        EnumC480960Ita enumC480960Ita2 = new EnumC480960Ita("PRELOAD", 1);
        PRELOAD = enumC480960Ita2;
        EnumC480960Ita enumC480960Ita3 = new EnumC480960Ita("PREPARE", 2);
        PREPARE = enumC480960Ita3;
        EnumC480960Ita enumC480960Ita4 = new EnumC480960Ita("PREIO", 3);
        PREIO = enumC480960Ita4;
        EnumC480960Ita[] enumC480960ItaArr = {enumC480960Ita, enumC480960Ita2, enumC480960Ita3, enumC480960Ita4};
        LL = enumC480960ItaArr;
        LLILLJJLI = new C2254308sP(enumC480960ItaArr);
    }

    public static EnumC480960Ita[] values() {
        return (EnumC480960Ita[]) LL.clone();
    }

    public static EnumC480960Ita valueOf(String str) {
        return (EnumC480960Ita) C08FF.LIZ(EnumC480960Ita.class, str);
    }

    public EnumC480960Ita(String str, int i) {
    }
}
