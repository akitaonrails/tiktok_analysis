package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC687210QxT {
    public static final EnumC687210QxT COMPLETE;
    public static final EnumC687210QxT INIT;
    public static final /* synthetic */ EnumC687210QxT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC687210QxT PAUSE;
    public static final EnumC687210QxT RUNNING;
    public static final EnumC687210QxT STOP;
    public static final EnumC687210QxT UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC687210QxT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC687210QxT enumC687210QxT = new EnumC687210QxT("UNKNOWN", 0, 0);
        UNKNOWN = enumC687210QxT;
        EnumC687210QxT enumC687210QxT2 = new EnumC687210QxT("INIT", 1, 1);
        INIT = enumC687210QxT2;
        EnumC687210QxT enumC687210QxT3 = new EnumC687210QxT("RUNNING", 2, 2);
        RUNNING = enumC687210QxT3;
        EnumC687210QxT enumC687210QxT4 = new EnumC687210QxT("PAUSE", 3, 3);
        PAUSE = enumC687210QxT4;
        EnumC687210QxT enumC687210QxT5 = new EnumC687210QxT("STOP", 4, 4);
        STOP = enumC687210QxT5;
        EnumC687210QxT enumC687210QxT6 = new EnumC687210QxT("COMPLETE", 5, 5);
        COMPLETE = enumC687210QxT6;
        EnumC687210QxT[] enumC687210QxTArr = {enumC687210QxT, enumC687210QxT2, enumC687210QxT3, enumC687210QxT4, enumC687210QxT5, enumC687210QxT6};
        LLILLJJLI = enumC687210QxTArr;
        LLILLL = new C2254308sP(enumC687210QxTArr);
    }

    public static EnumC687210QxT[] values() {
        return (EnumC687210QxT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC687210QxT valueOf(String str) {
        return (EnumC687210QxT) C08FF.LIZ(EnumC687210QxT.class, str);
    }

    public EnumC687210QxT(String str, int i, int i2) {
        this.LL = i2;
    }
}
