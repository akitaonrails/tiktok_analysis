package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC517850KSp {
    public static final /* synthetic */ EnumC517850KSp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC517850KSp STREAM_ON;
    public static final EnumC517850KSp STREAM_PAUSE;

    public static InterfaceC2044707zh<EnumC517850KSp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC517850KSp enumC517850KSp = new EnumC517850KSp("STREAM_ON", 0);
        STREAM_ON = enumC517850KSp;
        EnumC517850KSp enumC517850KSp2 = new EnumC517850KSp("STREAM_PAUSE", 1);
        STREAM_PAUSE = enumC517850KSp2;
        EnumC517850KSp[] enumC517850KSpArr = {enumC517850KSp, enumC517850KSp2};
        LL = enumC517850KSpArr;
        LLILLJJLI = new C2254308sP(enumC517850KSpArr);
    }

    public static EnumC517850KSp[] values() {
        return (EnumC517850KSp[]) LL.clone();
    }

    public static EnumC517850KSp valueOf(String str) {
        return (EnumC517850KSp) C08FF.LIZ(EnumC517850KSp.class, str);
    }

    public EnumC517850KSp(String str, int i) {
    }
}
