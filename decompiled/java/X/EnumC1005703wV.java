package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1005703wV {
    public static final EnumC1005703wV BODY;
    public static final /* synthetic */ EnumC1005703wV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "body";

    public static InterfaceC2044707zh<EnumC1005703wV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005703wV enumC1005703wV = new EnumC1005703wV();
        BODY = enumC1005703wV;
        EnumC1005703wV[] enumC1005703wVArr = {enumC1005703wV};
        LLILLJJLI = enumC1005703wVArr;
        LLILLL = new C2254308sP(enumC1005703wVArr);
    }

    public static EnumC1005703wV[] values() {
        return (EnumC1005703wV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1005703wV valueOf(String str) {
        return (EnumC1005703wV) C08FF.LIZ(EnumC1005703wV.class, str);
    }
}
