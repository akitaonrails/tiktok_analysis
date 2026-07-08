package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2249508rd {
    public static final /* synthetic */ EnumC2249508rd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249508rd MIX;
    public static final EnumC2249508rd PHOTO;

    public static InterfaceC2044707zh<EnumC2249508rd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249508rd enumC2249508rd = new EnumC2249508rd("MIX", 0);
        MIX = enumC2249508rd;
        EnumC2249508rd enumC2249508rd2 = new EnumC2249508rd("PHOTO", 1);
        PHOTO = enumC2249508rd2;
        EnumC2249508rd[] enumC2249508rdArr = {enumC2249508rd, enumC2249508rd2};
        LL = enumC2249508rdArr;
        LLILLJJLI = new C2254308sP(enumC2249508rdArr);
    }

    public static EnumC2249508rd[] values() {
        return (EnumC2249508rd[]) LL.clone();
    }

    public static EnumC2249508rd valueOf(String str) {
        return (EnumC2249508rd) C08FF.LIZ(EnumC2249508rd.class, str);
    }

    public EnumC2249508rd(String str, int i) {
    }
}
