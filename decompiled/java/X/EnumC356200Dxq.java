package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356200Dxq {
    public static final /* synthetic */ EnumC356200Dxq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356200Dxq PHOTO;
    public static final EnumC356200Dxq VIDEO;

    public static InterfaceC2044707zh<EnumC356200Dxq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356200Dxq enumC356200Dxq = new EnumC356200Dxq("PHOTO", 0);
        PHOTO = enumC356200Dxq;
        EnumC356200Dxq enumC356200Dxq2 = new EnumC356200Dxq("VIDEO", 1);
        VIDEO = enumC356200Dxq2;
        EnumC356200Dxq[] enumC356200DxqArr = {enumC356200Dxq, enumC356200Dxq2};
        LL = enumC356200DxqArr;
        LLILLJJLI = new C2254308sP(enumC356200DxqArr);
    }

    public static EnumC356200Dxq[] values() {
        return (EnumC356200Dxq[]) LL.clone();
    }

    public static EnumC356200Dxq valueOf(String str) {
        return (EnumC356200Dxq) C08FF.LIZ(EnumC356200Dxq.class, str);
    }

    public EnumC356200Dxq(String str, int i) {
    }
}
