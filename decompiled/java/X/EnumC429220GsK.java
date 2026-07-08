package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429220GsK {
    public static final EnumC429220GsK BOTH_FOLLOW;
    public static final EnumC429220GsK FOLLOWED;
    public static final /* synthetic */ EnumC429220GsK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC429220GsK UNFOLLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429220GsK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429220GsK enumC429220GsK = new EnumC429220GsK("UNFOLLOW", 0, 0);
        UNFOLLOW = enumC429220GsK;
        EnumC429220GsK enumC429220GsK2 = new EnumC429220GsK("FOLLOWED", 1, 1);
        FOLLOWED = enumC429220GsK2;
        EnumC429220GsK enumC429220GsK3 = new EnumC429220GsK("BOTH_FOLLOW", 2, 2);
        BOTH_FOLLOW = enumC429220GsK3;
        EnumC429220GsK[] enumC429220GsKArr = {enumC429220GsK, enumC429220GsK2, enumC429220GsK3};
        LLILLJJLI = enumC429220GsKArr;
        LLILLL = new C2254308sP(enumC429220GsKArr);
    }

    public static EnumC429220GsK[] values() {
        return (EnumC429220GsK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC429220GsK valueOf(String str) {
        return (EnumC429220GsK) C08FF.LIZ(EnumC429220GsK.class, str);
    }

    public EnumC429220GsK(String str, int i, int i2) {
        this.LL = i2;
    }
}
