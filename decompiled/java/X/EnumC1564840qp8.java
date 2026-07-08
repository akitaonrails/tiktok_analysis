package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1564840qp8 {
    public static final EnumC1564840qp8 FIRST_FRAME;
    public static final /* synthetic */ EnumC1564840qp8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final C1564830qp7 LL;

    public static InterfaceC2044707zh<EnumC1564840qp8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1564840qp8 enumC1564840qp8 = new EnumC1564840qp8(new C1564830qp7());
        FIRST_FRAME = enumC1564840qp8;
        EnumC1564840qp8[] enumC1564840qp8Arr = {enumC1564840qp8};
        LLILLJJLI = enumC1564840qp8Arr;
        LLILLL = new C2254308sP(enumC1564840qp8Arr);
    }

    public static EnumC1564840qp8[] values() {
        return (EnumC1564840qp8[]) LLILLJJLI.clone();
    }

    public final C1564830qp7 getCache$tako_release() {
        return this.LL;
    }

    public EnumC1564840qp8(C1564830qp7 c1564830qp7) {
        this.LL = c1564830qp7;
    }

    public static EnumC1564840qp8 valueOf(String str) {
        return (EnumC1564840qp8) C08FF.LIZ(EnumC1564840qp8.class, str);
    }
}
