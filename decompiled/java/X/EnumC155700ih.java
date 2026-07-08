package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC155700ih {
    public static final EnumC155700ih FINISHED;
    public static final /* synthetic */ EnumC155700ih[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC155700ih LOADING;

    public static InterfaceC2044707zh<EnumC155700ih> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC155700ih enumC155700ih = new EnumC155700ih("FINISHED", 0);
        FINISHED = enumC155700ih;
        EnumC155700ih enumC155700ih2 = new EnumC155700ih("LOADING", 1);
        LOADING = enumC155700ih2;
        EnumC155700ih[] enumC155700ihArr = {enumC155700ih, enumC155700ih2};
        LL = enumC155700ihArr;
        LLILLJJLI = new C2254308sP(enumC155700ihArr);
    }

    public static EnumC155700ih[] values() {
        return (EnumC155700ih[]) LL.clone();
    }

    public static EnumC155700ih valueOf(String str) {
        return (EnumC155700ih) C08FF.LIZ(EnumC155700ih.class, str);
    }

    public EnumC155700ih(String str, int i) {
    }
}
