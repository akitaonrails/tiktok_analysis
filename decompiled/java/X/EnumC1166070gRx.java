package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1166070gRx {
    public static final C1166080gRy Companion;
    public static final /* synthetic */ EnumC1166070gRx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1166070gRx PUBLISHED;
    public static final EnumC1166070gRx UNKNOWN;
    public static final EnumC1166070gRx UNPUBLISHED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1166070gRx> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0gRy] */
    static {
        EnumC1166070gRx enumC1166070gRx = new EnumC1166070gRx("UNKNOWN", 0, 0);
        UNKNOWN = enumC1166070gRx;
        EnumC1166070gRx enumC1166070gRx2 = new EnumC1166070gRx("UNPUBLISHED", 1, 1);
        UNPUBLISHED = enumC1166070gRx2;
        EnumC1166070gRx enumC1166070gRx3 = new EnumC1166070gRx("PUBLISHED", 2, 2);
        PUBLISHED = enumC1166070gRx3;
        EnumC1166070gRx[] enumC1166070gRxArr = {enumC1166070gRx, enumC1166070gRx2, enumC1166070gRx3};
        LLILLJJLI = enumC1166070gRxArr;
        LLILLL = new C2254308sP(enumC1166070gRxArr);
        Companion = new Object() { // from class: X.0gRy
        };
    }

    public static EnumC1166070gRx[] values() {
        return (EnumC1166070gRx[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1166070gRx valueOf(String str) {
        return (EnumC1166070gRx) C08FF.LIZ(EnumC1166070gRx.class, str);
    }

    public EnumC1166070gRx(String str, int i, int i2) {
        this.LL = i2;
    }
}
