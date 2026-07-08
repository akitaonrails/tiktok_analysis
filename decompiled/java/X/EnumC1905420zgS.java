package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1905420zgS implements C1D61 {
    public static final /* synthetic */ EnumC1905420zgS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1905420zgS ON_CREATE;
    public static final EnumC1905420zgS ON_DESTROY;
    public static final EnumC1905420zgS ON_PAUSE;
    public static final EnumC1905420zgS ON_RESUME;
    public static final EnumC1905420zgS ON_START;
    public static final EnumC1905420zgS ON_STOP;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC1905420zgS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1905420zgS enumC1905420zgS = new EnumC1905420zgS("ON_CREATE", 0);
        ON_CREATE = enumC1905420zgS;
        EnumC1905420zgS enumC1905420zgS2 = new EnumC1905420zgS("ON_START", 1);
        ON_START = enumC1905420zgS2;
        EnumC1905420zgS enumC1905420zgS3 = new EnumC1905420zgS("ON_RESUME", 2);
        ON_RESUME = enumC1905420zgS3;
        EnumC1905420zgS enumC1905420zgS4 = new EnumC1905420zgS("ON_PAUSE", 3);
        ON_PAUSE = enumC1905420zgS4;
        EnumC1905420zgS enumC1905420zgS5 = new EnumC1905420zgS("ON_STOP", 4);
        ON_STOP = enumC1905420zgS5;
        EnumC1905420zgS enumC1905420zgS6 = new EnumC1905420zgS("ON_DESTROY", 5);
        ON_DESTROY = enumC1905420zgS6;
        EnumC1905420zgS[] enumC1905420zgSArr = {enumC1905420zgS, enumC1905420zgS2, enumC1905420zgS3, enumC1905420zgS4, enumC1905420zgS5, enumC1905420zgS6};
        LLILLJJLI = enumC1905420zgSArr;
        LLILLL = new C2254308sP(enumC1905420zgSArr);
    }

    public static EnumC1905420zgS[] values() {
        return (EnumC1905420zgS[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC1905420zgS valueOf(String str) {
        return (EnumC1905420zgS) C08FF.LIZ(EnumC1905420zgS.class, str);
    }

    public EnumC1905420zgS(String str, int i) {
    }
}
