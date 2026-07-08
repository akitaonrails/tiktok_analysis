package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992190bvV {
    public static final EnumC992190bvV DEFAULT;
    public static final /* synthetic */ EnumC992190bvV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<EnumC992190bvV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992190bvV enumC992190bvV = new EnumC992190bvV();
        DEFAULT = enumC992190bvV;
        EnumC992190bvV[] enumC992190bvVArr = {enumC992190bvV};
        LLILLJJLI = enumC992190bvVArr;
        LLILLL = new C2254308sP(enumC992190bvVArr);
    }

    public static EnumC992190bvV[] values() {
        return (EnumC992190bvV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992190bvV valueOf(String str) {
        return (EnumC992190bvV) C08FF.LIZ(EnumC992190bvV.class, str);
    }
}
