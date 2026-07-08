package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1350830lFx {
    public static final EnumC1350830lFx LL;
    public static final EnumC1350830lFx LLILLJJLI;
    public static final EnumC1350830lFx LLILLL;
    public static final EnumC1350830lFx LLILZ;
    public static final /* synthetic */ EnumC1350830lFx[] LLILZIL;

    static {
        EnumC1350830lFx enumC1350830lFx = new EnumC1350830lFx("IDLE", 0);
        LL = enumC1350830lFx;
        EnumC1350830lFx enumC1350830lFx2 = new EnumC1350830lFx("STARTING", 1);
        LLILLJJLI = enumC1350830lFx2;
        EnumC1350830lFx enumC1350830lFx3 = new EnumC1350830lFx("PLAYING", 2);
        LLILLL = enumC1350830lFx3;
        EnumC1350830lFx enumC1350830lFx4 = new EnumC1350830lFx("TERMINATED", 3);
        LLILZ = enumC1350830lFx4;
        EnumC1350830lFx[] enumC1350830lFxArr = {enumC1350830lFx, enumC1350830lFx2, enumC1350830lFx3, enumC1350830lFx4};
        LLILZIL = enumC1350830lFxArr;
        new C2254308sP(enumC1350830lFxArr);
    }

    public static EnumC1350830lFx[] values() {
        return (EnumC1350830lFx[]) LLILZIL.clone();
    }

    public static EnumC1350830lFx valueOf(String str) {
        return (EnumC1350830lFx) C08FF.LIZ(EnumC1350830lFx.class, str);
    }

    public EnumC1350830lFx(String str, int i) {
    }
}
