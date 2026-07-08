package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588680N7a {
    public static final /* synthetic */ EnumC588680N7a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC588680N7a ResponseZeroCopyOptGetSegmentCount;
    public static final EnumC588680N7a ResponseZeroCopyOptGetSegmentSize;
    public final int LL;

    public static InterfaceC2044707zh<EnumC588680N7a> getEntries() {
        return LLILLL;
    }

    static {
        EnumC588680N7a enumC588680N7a = new EnumC588680N7a("ResponseZeroCopyOptGetSegmentSize", 0, 8);
        ResponseZeroCopyOptGetSegmentSize = enumC588680N7a;
        EnumC588680N7a enumC588680N7a2 = new EnumC588680N7a("ResponseZeroCopyOptGetSegmentCount", 1, 2);
        ResponseZeroCopyOptGetSegmentCount = enumC588680N7a2;
        EnumC588680N7a[] enumC588680N7aArr = {enumC588680N7a, enumC588680N7a2};
        LLILLJJLI = enumC588680N7aArr;
        LLILLL = new C2254308sP(enumC588680N7aArr);
    }

    public static EnumC588680N7a[] values() {
        return (EnumC588680N7a[]) LLILLJJLI.clone();
    }

    public final int getDefaultVal() {
        return this.LL;
    }

    public static EnumC588680N7a valueOf(String str) {
        return (EnumC588680N7a) C08FF.LIZ(EnumC588680N7a.class, str);
    }

    public EnumC588680N7a(String str, int i, int i2) {
        this.LL = i2;
    }
}
