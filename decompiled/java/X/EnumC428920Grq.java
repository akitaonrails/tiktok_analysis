package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428920Grq {
    public static final C0GYD Companion;
    public static final EnumC428920Grq HIGH_CONTRAST;
    public static final /* synthetic */ EnumC428920Grq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC428920Grq LOW_CONTRAST;
    public final int LL;

    public static final EnumC428920Grq from(int i) {
        Companion.getClass();
        return C0GYD.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC428920Grq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC428920Grq enumC428920Grq = new EnumC428920Grq("HIGH_CONTRAST", 0, 0);
        HIGH_CONTRAST = enumC428920Grq;
        EnumC428920Grq enumC428920Grq2 = new EnumC428920Grq("LOW_CONTRAST", 1, 1);
        LOW_CONTRAST = enumC428920Grq2;
        EnumC428920Grq[] enumC428920GrqArr = {enumC428920Grq, enumC428920Grq2};
        LLILLJJLI = enumC428920GrqArr;
        LLILLL = new C2254308sP(enumC428920GrqArr);
        Companion = new C0GYD();
    }

    public static EnumC428920Grq[] values() {
        return (EnumC428920Grq[]) LLILLJJLI.clone();
    }

    public final int getStyleValue() {
        return this.LL;
    }

    public static EnumC428920Grq valueOf(String str) {
        return (EnumC428920Grq) C08FF.LIZ(EnumC428920Grq.class, str);
    }

    public EnumC428920Grq(String str, int i, int i2) {
        this.LL = i2;
    }
}
