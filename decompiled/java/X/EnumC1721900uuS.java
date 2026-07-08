package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721900uuS {
    public static final C1721960uuY Companion;
    public static final EnumC1721900uuS FAILED;
    public static final /* synthetic */ EnumC1721900uuS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1721900uuS PENDING;
    public static final EnumC1721900uuS SUCCESS;

    public static InterfaceC2044707zh<EnumC1721900uuS> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0uuY] */
    static {
        EnumC1721900uuS enumC1721900uuS = new EnumC1721900uuS("PENDING", 0);
        PENDING = enumC1721900uuS;
        EnumC1721900uuS enumC1721900uuS2 = new EnumC1721900uuS("SUCCESS", 1);
        SUCCESS = enumC1721900uuS2;
        EnumC1721900uuS enumC1721900uuS3 = new EnumC1721900uuS("FAILED", 2);
        FAILED = enumC1721900uuS3;
        EnumC1721900uuS[] enumC1721900uuSArr = {enumC1721900uuS, enumC1721900uuS2, enumC1721900uuS3};
        LL = enumC1721900uuSArr;
        LLILLJJLI = new C2254308sP(enumC1721900uuSArr);
        Companion = new Object() { // from class: X.0uuY
        };
    }

    public static EnumC1721900uuS[] values() {
        return (EnumC1721900uuS[]) LL.clone();
    }

    public static EnumC1721900uuS valueOf(String str) {
        return (EnumC1721900uuS) C08FF.LIZ(EnumC1721900uuS.class, str);
    }

    public EnumC1721900uuS(String str, int i) {
    }
}
