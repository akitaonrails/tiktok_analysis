package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992790bwT {
    public static final EnumC992790bwT INBOX_NORMAL;
    public static final EnumC992790bwT INBOX_SMALL;
    public static final /* synthetic */ EnumC992790bwT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992790bwT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992790bwT enumC992790bwT = new EnumC992790bwT("INBOX_NORMAL", 0);
        INBOX_NORMAL = enumC992790bwT;
        EnumC992790bwT enumC992790bwT2 = new EnumC992790bwT("INBOX_SMALL", 1);
        INBOX_SMALL = enumC992790bwT2;
        EnumC992790bwT[] enumC992790bwTArr = {enumC992790bwT, enumC992790bwT2};
        LL = enumC992790bwTArr;
        LLILLJJLI = new C2254308sP(enumC992790bwTArr);
    }

    public static EnumC992790bwT[] values() {
        return (EnumC992790bwT[]) LL.clone();
    }

    public static EnumC992790bwT valueOf(String str) {
        return (EnumC992790bwT) C08FF.LIZ(EnumC992790bwT.class, str);
    }

    public EnumC992790bwT(String str, int i) {
    }
}
