package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083790eJF {
    public static final EnumC1083790eJF CENTER;
    public static final EnumC1083790eJF END;
    public static final /* synthetic */ EnumC1083790eJF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083790eJF START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1083790eJF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083790eJF enumC1083790eJF = new EnumC1083790eJF("CENTER", 0, 0);
        CENTER = enumC1083790eJF;
        EnumC1083790eJF enumC1083790eJF2 = new EnumC1083790eJF("START", 1, 1);
        START = enumC1083790eJF2;
        EnumC1083790eJF enumC1083790eJF3 = new EnumC1083790eJF("END", 2, 2);
        END = enumC1083790eJF3;
        EnumC1083790eJF[] enumC1083790eJFArr = {enumC1083790eJF, enumC1083790eJF2, enumC1083790eJF3};
        LLILLJJLI = enumC1083790eJFArr;
        LLILLL = new C2254308sP(enumC1083790eJFArr);
    }

    public static EnumC1083790eJF[] values() {
        return (EnumC1083790eJF[]) LLILLJJLI.clone();
    }

    public final int getGravity() {
        return this.LL;
    }

    public static EnumC1083790eJF valueOf(String str) {
        return (EnumC1083790eJF) C08FF.LIZ(EnumC1083790eJF.class, str);
    }

    public EnumC1083790eJF(String str, int i, int i2) {
        this.LL = i2;
    }
}
