package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0byB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993850byB {
    public static final /* synthetic */ EnumC993850byB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993850byB NOT_RECV;
    public static final EnumC993850byB RECV_EMPTY;
    public static final EnumC993850byB RECV_LINK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993850byB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993850byB enumC993850byB = new EnumC993850byB("NOT_RECV", 0, "not_recv");
        NOT_RECV = enumC993850byB;
        EnumC993850byB enumC993850byB2 = new EnumC993850byB("RECV_EMPTY", 1, "recv_empty");
        RECV_EMPTY = enumC993850byB2;
        EnumC993850byB enumC993850byB3 = new EnumC993850byB("RECV_LINK", 2, "recv_link");
        RECV_LINK = enumC993850byB3;
        EnumC993850byB[] enumC993850byBArr = {enumC993850byB, enumC993850byB2, enumC993850byB3};
        LLILLJJLI = enumC993850byBArr;
        LLILLL = new C2254308sP(enumC993850byBArr);
    }

    public static EnumC993850byB[] values() {
        return (EnumC993850byB[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC993850byB valueOf(String str) {
        return (EnumC993850byB) C08FF.LIZ(EnumC993850byB.class, str);
    }

    public EnumC993850byB(String str, int i, String str2) {
        this.LL = str2;
    }
}
