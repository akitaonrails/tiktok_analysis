package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19554011es {
    public static final EnumC19554011es COLLECT;
    public static final /* synthetic */ EnumC19554011es[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19554011es PREVIEW;
    public static final EnumC19554011es REFRESH_DOWNLOAD;
    public static final EnumC19554011es USE;

    public static InterfaceC2044707zh<EnumC19554011es> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19554011es enumC19554011es = new EnumC19554011es("PREVIEW", 0);
        PREVIEW = enumC19554011es;
        EnumC19554011es enumC19554011es2 = new EnumC19554011es("COLLECT", 1);
        COLLECT = enumC19554011es2;
        EnumC19554011es enumC19554011es3 = new EnumC19554011es("USE", 2);
        USE = enumC19554011es3;
        EnumC19554011es enumC19554011es4 = new EnumC19554011es("REFRESH_DOWNLOAD", 3);
        REFRESH_DOWNLOAD = enumC19554011es4;
        EnumC19554011es[] enumC19554011esArr = {enumC19554011es, enumC19554011es2, enumC19554011es3, enumC19554011es4};
        LL = enumC19554011esArr;
        LLILLJJLI = new C2254308sP(enumC19554011esArr);
    }

    public static EnumC19554011es[] values() {
        return (EnumC19554011es[]) LL.clone();
    }

    public static EnumC19554011es valueOf(String str) {
        return (EnumC19554011es) C08FF.LIZ(EnumC19554011es.class, str);
    }

    public EnumC19554011es(String str, int i) {
    }
}
