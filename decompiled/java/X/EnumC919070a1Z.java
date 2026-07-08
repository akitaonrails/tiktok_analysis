package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919070a1Z {
    public static final /* synthetic */ EnumC919070a1Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC919070a1Z NEW;
    public static final EnumC919070a1Z OLD;
    public long LL;

    public static InterfaceC2044707zh<EnumC919070a1Z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC919070a1Z enumC919070a1Z = new EnumC919070a1Z("OLD", 0, 0L);
        OLD = enumC919070a1Z;
        EnumC919070a1Z enumC919070a1Z2 = new EnumC919070a1Z("NEW", 1, 1L);
        NEW = enumC919070a1Z2;
        EnumC919070a1Z[] enumC919070a1ZArr = {enumC919070a1Z, enumC919070a1Z2};
        LLILLJJLI = enumC919070a1ZArr;
        LLILLL = new C2254308sP(enumC919070a1ZArr);
    }

    public static EnumC919070a1Z[] values() {
        return (EnumC919070a1Z[]) LLILLJJLI.clone();
    }

    public final long getVersion() {
        return this.LL;
    }

    public static EnumC919070a1Z valueOf(String str) {
        return (EnumC919070a1Z) C08FF.LIZ(EnumC919070a1Z.class, str);
    }

    public final void setVersion(long j) {
        this.LL = j;
    }

    public EnumC919070a1Z(String str, int i, long j) {
        this.LL = j;
    }
}
