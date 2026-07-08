package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899760ZRm {
    public static final EnumC899760ZRm INTERACTED;
    public static final /* synthetic */ EnumC899760ZRm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC899760ZRm NOT_INTERACTED;

    public static InterfaceC2044707zh<EnumC899760ZRm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC899760ZRm enumC899760ZRm = new EnumC899760ZRm("NOT_INTERACTED", 0);
        NOT_INTERACTED = enumC899760ZRm;
        EnumC899760ZRm enumC899760ZRm2 = new EnumC899760ZRm("INTERACTED", 1);
        INTERACTED = enumC899760ZRm2;
        EnumC899760ZRm[] enumC899760ZRmArr = {enumC899760ZRm, enumC899760ZRm2};
        LL = enumC899760ZRmArr;
        LLILLJJLI = new C2254308sP(enumC899760ZRmArr);
    }

    public static EnumC899760ZRm[] values() {
        return (EnumC899760ZRm[]) LL.clone();
    }

    public static EnumC899760ZRm valueOf(String str) {
        return (EnumC899760ZRm) C08FF.LIZ(EnumC899760ZRm.class, str);
    }

    public EnumC899760ZRm(String str, int i) {
    }
}
