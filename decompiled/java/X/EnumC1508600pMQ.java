package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1508600pMQ {
    public static final EnumC1508600pMQ DESC_VIDEO;
    public static final EnumC1508600pMQ HEADER_VIDEO;
    public static final /* synthetic */ EnumC1508600pMQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1508600pMQ LYNX_VIDEO;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC1508600pMQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1508600pMQ enumC1508600pMQ = new EnumC1508600pMQ("HEADER_VIDEO", 0, true);
        HEADER_VIDEO = enumC1508600pMQ;
        EnumC1508600pMQ enumC1508600pMQ2 = new EnumC1508600pMQ("DESC_VIDEO", 1, true);
        DESC_VIDEO = enumC1508600pMQ2;
        EnumC1508600pMQ enumC1508600pMQ3 = new EnumC1508600pMQ("LYNX_VIDEO", 2, false);
        LYNX_VIDEO = enumC1508600pMQ3;
        EnumC1508600pMQ[] enumC1508600pMQArr = {enumC1508600pMQ, enumC1508600pMQ2, enumC1508600pMQ3};
        LLILLJJLI = enumC1508600pMQArr;
        LLILLL = new C2254308sP(enumC1508600pMQArr);
    }

    public static EnumC1508600pMQ[] values() {
        return (EnumC1508600pMQ[]) LLILLJJLI.clone();
    }

    public final boolean getHasOwnAudio() {
        return this.LL;
    }

    public static EnumC1508600pMQ valueOf(String str) {
        return (EnumC1508600pMQ) C08FF.LIZ(EnumC1508600pMQ.class, str);
    }

    public EnumC1508600pMQ(String str, int i, boolean z) {
        this.LL = z;
    }
}
