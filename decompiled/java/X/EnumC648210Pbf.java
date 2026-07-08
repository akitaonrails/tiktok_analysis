package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC648210Pbf implements C1D61 {
    public static final /* synthetic */ EnumC648210Pbf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC648210Pbf ON_PLAY_COMPLETE;
    public static final EnumC648210Pbf ON_PLAY_START;
    public static final EnumC648210Pbf ON_PLAY_STOP;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC648210Pbf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC648210Pbf enumC648210Pbf = new EnumC648210Pbf("ON_PLAY_START", 0);
        ON_PLAY_START = enumC648210Pbf;
        EnumC648210Pbf enumC648210Pbf2 = new EnumC648210Pbf("ON_PLAY_STOP", 1);
        ON_PLAY_STOP = enumC648210Pbf2;
        EnumC648210Pbf enumC648210Pbf3 = new EnumC648210Pbf("ON_PLAY_COMPLETE", 2);
        ON_PLAY_COMPLETE = enumC648210Pbf3;
        EnumC648210Pbf[] enumC648210PbfArr = {enumC648210Pbf, enumC648210Pbf2, enumC648210Pbf3};
        LLILLJJLI = enumC648210PbfArr;
        LLILLL = new C2254308sP(enumC648210PbfArr);
    }

    public static EnumC648210Pbf[] values() {
        return (EnumC648210Pbf[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC648210Pbf valueOf(String str) {
        return (EnumC648210Pbf) C08FF.LIZ(EnumC648210Pbf.class, str);
    }

    public EnumC648210Pbf(String str, int i) {
    }
}
