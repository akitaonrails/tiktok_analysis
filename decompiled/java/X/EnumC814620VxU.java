package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC814620VxU {
    public static final EnumC814620VxU Android;
    public static final /* synthetic */ EnumC814620VxU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC814620VxU iOS;

    public static InterfaceC2044707zh<EnumC814620VxU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC814620VxU enumC814620VxU = new EnumC814620VxU("Android", 0);
        Android = enumC814620VxU;
        EnumC814620VxU enumC814620VxU2 = new EnumC814620VxU("iOS", 1);
        iOS = enumC814620VxU2;
        EnumC814620VxU[] enumC814620VxUArr = {enumC814620VxU, enumC814620VxU2};
        LL = enumC814620VxUArr;
        LLILLJJLI = new C2254308sP(enumC814620VxUArr);
    }

    public static EnumC814620VxU[] values() {
        return (EnumC814620VxU[]) LL.clone();
    }

    public static EnumC814620VxU valueOf(String str) {
        return (EnumC814620VxU) C08FF.LIZ(EnumC814620VxU.class, str);
    }

    public EnumC814620VxU(String str, int i) {
    }
}
