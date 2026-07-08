package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ITu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC467200ITu {
    public static final /* synthetic */ EnumC467200ITu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC467200ITu Subscription;
    public static final EnumC467200ITu TaxInfoCollection;
    public static final EnumC467200ITu Unknown;
    public final long LL;

    public static InterfaceC2044707zh<EnumC467200ITu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC467200ITu enumC467200ITu = new EnumC467200ITu("Unknown", 0, -1L);
        Unknown = enumC467200ITu;
        EnumC467200ITu enumC467200ITu2 = new EnumC467200ITu("Subscription", 1, 0L);
        Subscription = enumC467200ITu2;
        EnumC467200ITu enumC467200ITu3 = new EnumC467200ITu("TaxInfoCollection", 2, 1L);
        TaxInfoCollection = enumC467200ITu3;
        EnumC467200ITu[] enumC467200ITuArr = {enumC467200ITu, enumC467200ITu2, enumC467200ITu3};
        LLILLJJLI = enumC467200ITuArr;
        LLILLL = new C2254308sP(enumC467200ITuArr);
    }

    public static EnumC467200ITu[] values() {
        return (EnumC467200ITu[]) LLILLJJLI.clone();
    }

    public final long getScene() {
        return this.LL;
    }

    public static EnumC467200ITu valueOf(String str) {
        return (EnumC467200ITu) C08FF.LIZ(EnumC467200ITu.class, str);
    }

    public EnumC467200ITu(String str, int i, long j) {
        this.LL = j;
    }
}
