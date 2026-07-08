package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361490EFf {
    public static final EnumC361490EFf LL;
    public static final EnumC361490EFf LLILLJJLI;
    public static final /* synthetic */ EnumC361490EFf[] LLILLL;

    static {
        EnumC361490EFf enumC361490EFf = new EnumC361490EFf("FADE_IN", 0);
        LL = enumC361490EFf;
        EnumC361490EFf enumC361490EFf2 = new EnumC361490EFf("FADE_OUT", 1);
        LLILLJJLI = enumC361490EFf2;
        EnumC361490EFf[] enumC361490EFfArr = {enumC361490EFf, enumC361490EFf2};
        LLILLL = enumC361490EFfArr;
        new C2254308sP(enumC361490EFfArr);
    }

    public static EnumC361490EFf[] values() {
        return (EnumC361490EFf[]) LLILLL.clone();
    }

    public static EnumC361490EFf valueOf(String str) {
        return (EnumC361490EFf) C08FF.LIZ(EnumC361490EFf.class, str);
    }

    public EnumC361490EFf(String str, int i) {
    }
}
