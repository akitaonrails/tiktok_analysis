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
/* JADX INFO: renamed from: X.12zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19938012zi {
    public static final /* synthetic */ EnumC19938012zi[] LLILLL;
    public static final EnumC19938012zi zza;
    public static final EnumC19938012zi zzb;
    public static final EnumC19938012zi zzc;
    public static final EnumC19938012zi zzd;
    public static final EnumC19938012zi zze;
    public static final EnumC19938012zi zzf;
    public static final EnumC19938012zi zzg;
    public static final EnumC19938012zi zzh;
    public static final EnumC19938012zi zzi;
    public static final EnumC19938012zi zzj;
    public static final EnumC19938012zi zzk;
    public static final EnumC19938012zi zzl;
    public static final EnumC19938012zi zzm;
    public static final EnumC19938012zi zzn;
    public static final EnumC19938012zi zzo;
    public static final EnumC19938012zi zzp;
    public static final EnumC19938012zi zzq;
    public static final EnumC19938012zi zzr;
    public final EnumC19938112zj LL;
    public final int LLILLJJLI;

    public final int zza() {
        return this.LLILLJJLI;
    }

    public final EnumC19938112zj zzb() {
        return this.LL;
    }

    static {
        EnumC19938012zi enumC19938012zi = new EnumC19938012zi("DOUBLE", 0, EnumC19938112zj.DOUBLE, 1);
        zza = enumC19938012zi;
        EnumC19938012zi enumC19938012zi2 = new EnumC19938012zi("FLOAT", 1, EnumC19938112zj.FLOAT, 5);
        zzb = enumC19938012zi2;
        EnumC19938112zj enumC19938112zj = EnumC19938112zj.LONG;
        EnumC19938012zi enumC19938012zi3 = new EnumC19938012zi("INT64", 2, enumC19938112zj, 0);
        zzc = enumC19938012zi3;
        EnumC19938012zi enumC19938012zi4 = new EnumC19938012zi("UINT64", 3, enumC19938112zj, 0);
        zzd = enumC19938012zi4;
        EnumC19938112zj enumC19938112zj2 = EnumC19938112zj.INT;
        EnumC19938012zi enumC19938012zi5 = new EnumC19938012zi("INT32", 4, enumC19938112zj2, 0);
        zze = enumC19938012zi5;
        EnumC19938012zi enumC19938012zi6 = new EnumC19938012zi("FIXED64", 5, enumC19938112zj, 1);
        zzf = enumC19938012zi6;
        EnumC19938012zi enumC19938012zi7 = new EnumC19938012zi("FIXED32", 6, enumC19938112zj2, 5);
        zzg = enumC19938012zi7;
        EnumC19938012zi enumC19938012zi8 = new EnumC19938012zi("BOOL", 7, EnumC19938112zj.BOOLEAN, 0);
        zzh = enumC19938012zi8;
        EnumC19938012zi enumC19938012zi9 = new EnumC19938012zi("STRING", 8, EnumC19938112zj.STRING, 2);
        zzi = enumC19938012zi9;
        EnumC19938112zj enumC19938112zj3 = EnumC19938112zj.MESSAGE;
        EnumC19938012zi enumC19938012zi10 = new EnumC19938012zi("GROUP", 9, enumC19938112zj3, 3);
        zzj = enumC19938012zi10;
        EnumC19938012zi enumC19938012zi11 = new EnumC19938012zi("MESSAGE", 10, enumC19938112zj3, 2);
        zzk = enumC19938012zi11;
        EnumC19938012zi enumC19938012zi12 = new EnumC19938012zi("BYTES", 11, EnumC19938112zj.BYTE_STRING, 2);
        zzl = enumC19938012zi12;
        EnumC19938012zi enumC19938012zi13 = new EnumC19938012zi("UINT32", 12, enumC19938112zj2, 0);
        zzm = enumC19938012zi13;
        EnumC19938012zi enumC19938012zi14 = new EnumC19938012zi("ENUM", 13, EnumC19938112zj.ENUM, 0);
        zzn = enumC19938012zi14;
        EnumC19938012zi enumC19938012zi15 = new EnumC19938012zi("SFIXED32", 14, enumC19938112zj2, 5);
        zzo = enumC19938012zi15;
        EnumC19938012zi enumC19938012zi16 = new EnumC19938012zi("SFIXED64", 15, enumC19938112zj, 1);
        zzp = enumC19938012zi16;
        EnumC19938012zi enumC19938012zi17 = new EnumC19938012zi("SINT32", 16, enumC19938112zj2, 0);
        zzq = enumC19938012zi17;
        EnumC19938012zi enumC19938012zi18 = new EnumC19938012zi("SINT64", 17, enumC19938112zj, 0);
        zzr = enumC19938012zi18;
        LLILLL = new EnumC19938012zi[]{enumC19938012zi, enumC19938012zi2, enumC19938012zi3, enumC19938012zi4, enumC19938012zi5, enumC19938012zi6, enumC19938012zi7, enumC19938012zi8, enumC19938012zi9, enumC19938012zi10, enumC19938012zi11, enumC19938012zi12, enumC19938012zi13, enumC19938012zi14, enumC19938012zi15, enumC19938012zi16, enumC19938012zi17, enumC19938012zi18};
    }

    public static EnumC19938012zi[] values() {
        return (EnumC19938012zi[]) LLILLL.clone();
    }

    public EnumC19938012zi(String str, int i, EnumC19938112zj enumC19938112zj, int i2) {
        this.LL = enumC19938112zj;
        this.LLILLJJLI = i2;
    }
}
