package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.133E, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C133E {
    public static final /* synthetic */ C133E[] LLILLL;
    public static final C133E zza;
    public static final C133E zzb;
    public static final C133E zzc;
    public static final C133E zzd;
    public static final C133E zze;
    public static final C133E zzf;
    public static final C133E zzg;
    public static final C133E zzh;
    public static final C133E zzi;
    public static final C133E zzj;
    public static final C133E zzk;
    public static final C133E zzl;
    public static final C133E zzm;
    public static final C133E zzn;
    public static final C133E zzo;
    public static final C133E zzp;
    public static final C133E zzq;
    public static final C133E zzr;
    public final C133D LL;
    public final int LLILLJJLI;

    public /* synthetic */ C133E() {
        throw null;
    }

    static {
        C133E c133e = new C133E("DOUBLE", 0, C133D.DOUBLE, 1);
        zza = c133e;
        C133E c133e2 = new C133E("FLOAT", 1, C133D.FLOAT, 5);
        zzb = c133e2;
        C133D c133d = C133D.LONG;
        C133E c133e3 = new C133E("INT64", 2, c133d, 0);
        zzc = c133e3;
        C133E c133e4 = new C133E("UINT64", 3, c133d, 0);
        zzd = c133e4;
        C133D c133d2 = C133D.INT;
        C133E c133e5 = new C133E("INT32", 4, c133d2, 0);
        zze = c133e5;
        C133E c133e6 = new C133E("FIXED64", 5, c133d, 1);
        zzf = c133e6;
        C133E c133e7 = new C133E("FIXED32", 6, c133d2, 5);
        zzg = c133e7;
        C133E c133e8 = new C133E("BOOL", 7, C133D.BOOLEAN, 0);
        zzh = c133e8;
        final C133D c133d3 = C133D.STRING;
        C133E c133e9 = new C133E(c133d3) { // from class: X.133G
        };
        zzi = c133e9;
        final C133D c133d4 = C133D.MESSAGE;
        C133E c133e10 = new C133E(c133d4) { // from class: X.133H
        };
        zzj = c133e10;
        C133E c133e11 = new C133E(c133d4) { // from class: X.133I
        };
        zzk = c133e11;
        final C133D c133d5 = C133D.BYTE_STRING;
        C133E c133e12 = new C133E(c133d5) { // from class: X.133J
        };
        zzl = c133e12;
        C133E c133e13 = new C133E("UINT32", 12, c133d2, 0);
        zzm = c133e13;
        C133E c133e14 = new C133E("ENUM", 13, C133D.ENUM, 0);
        zzn = c133e14;
        C133E c133e15 = new C133E("SFIXED32", 14, c133d2, 5);
        zzo = c133e15;
        C133E c133e16 = new C133E("SFIXED64", 15, c133d, 1);
        zzp = c133e16;
        C133E c133e17 = new C133E("SINT32", 16, c133d2, 0);
        zzq = c133e17;
        C133E c133e18 = new C133E("SINT64", 17, c133d, 0);
        zzr = c133e18;
        LLILLL = new C133E[]{c133e, c133e2, c133e3, c133e4, c133e5, c133e6, c133e7, c133e8, c133e9, c133e10, c133e11, c133e12, c133e13, c133e14, c133e15, c133e16, c133e17, c133e18};
    }

    public static C133E[] values() {
        return (C133E[]) LLILLL.clone();
    }

    public final int zza() {
        return this.LLILLJJLI;
    }

    public final C133D zzb() {
        return this.LL;
    }

    public C133E(String str, int i, C133D c133d, int i2) {
        this.LL = c133d;
        this.LLILLJJLI = i2;
    }
}
