package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992310bvh {
    public static final /* synthetic */ EnumC992310bvh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992310bvh Slardar;
    public static final EnumC992310bvh Tea;

    public static InterfaceC2044707zh<EnumC992310bvh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992310bvh enumC992310bvh = new EnumC992310bvh("Slardar", 0);
        Slardar = enumC992310bvh;
        EnumC992310bvh enumC992310bvh2 = new EnumC992310bvh("Tea", 1);
        Tea = enumC992310bvh2;
        EnumC992310bvh[] enumC992310bvhArr = {enumC992310bvh, enumC992310bvh2};
        LL = enumC992310bvhArr;
        LLILLJJLI = new C2254308sP(enumC992310bvhArr);
    }

    public static EnumC992310bvh[] values() {
        return (EnumC992310bvh[]) LL.clone();
    }

    public static EnumC992310bvh valueOf(String str) {
        return (EnumC992310bvh) C08FF.LIZ(EnumC992310bvh.class, str);
    }

    public EnumC992310bvh(String str, int i) {
    }
}
