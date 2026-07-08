package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC870900YEm {
    public static final EnumC870900YEm LLILLJJLI;
    public static final EnumC870900YEm LLILLL;
    public static final EnumC870900YEm LLILZ;
    public static final /* synthetic */ EnumC870900YEm[] LLILZIL;
    public final int LL;

    static {
        EnumC870900YEm enumC870900YEm = new EnumC870900YEm("SUCCESS", 0, 0);
        LLILLJJLI = enumC870900YEm;
        EnumC870900YEm enumC870900YEm2 = new EnumC870900YEm("FAILURE", 1, 1);
        LLILLL = enumC870900YEm2;
        EnumC870900YEm enumC870900YEm3 = new EnumC870900YEm("MISMATCH_UID", 2, 2);
        LLILZ = enumC870900YEm3;
        EnumC870900YEm[] enumC870900YEmArr = {enumC870900YEm, enumC870900YEm2, enumC870900YEm3};
        LLILZIL = enumC870900YEmArr;
        new C2254308sP(enumC870900YEmArr);
    }

    public static EnumC870900YEm[] values() {
        return (EnumC870900YEm[]) LLILZIL.clone();
    }

    public static EnumC870900YEm valueOf(String str) {
        return (EnumC870900YEm) C08FF.LIZ(EnumC870900YEm.class, str);
    }

    public EnumC870900YEm(String str, int i, int i2) {
        this.LL = i2;
    }
}
