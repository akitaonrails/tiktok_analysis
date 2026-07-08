package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993050bwt {
    public static final EnumC993050bwt FFP;
    public static final /* synthetic */ EnumC993050bwt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993050bwt NEW_FOLLOWER;

    public static InterfaceC2044707zh<EnumC993050bwt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993050bwt enumC993050bwt = new EnumC993050bwt("FFP", 0);
        FFP = enumC993050bwt;
        EnumC993050bwt enumC993050bwt2 = new EnumC993050bwt("NEW_FOLLOWER", 1);
        NEW_FOLLOWER = enumC993050bwt2;
        EnumC993050bwt[] enumC993050bwtArr = {enumC993050bwt, enumC993050bwt2};
        LL = enumC993050bwtArr;
        LLILLJJLI = new C2254308sP(enumC993050bwtArr);
    }

    public static EnumC993050bwt[] values() {
        return (EnumC993050bwt[]) LL.clone();
    }

    public static EnumC993050bwt valueOf(String str) {
        return (EnumC993050bwt) C08FF.LIZ(EnumC993050bwt.class, str);
    }

    public EnumC993050bwt(String str, int i) {
    }
}
