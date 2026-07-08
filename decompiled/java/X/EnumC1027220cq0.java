package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1027220cq0 {
    public static final /* synthetic */ EnumC1027220cq0[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1027220cq0 NORMAL;
    public static final EnumC1027220cq0 ON_AWEME_CHANGE;
    public static final EnumC1027220cq0 SHAKE_EGG;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1027220cq0> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1027220cq0 enumC1027220cq0 = new EnumC1027220cq0("NORMAL", 0, "normal", 0);
        NORMAL = enumC1027220cq0;
        EnumC1027220cq0 enumC1027220cq02 = new EnumC1027220cq0("ON_AWEME_CHANGE", 1, "onAwemeChange", 1);
        ON_AWEME_CHANGE = enumC1027220cq02;
        EnumC1027220cq0 enumC1027220cq03 = new EnumC1027220cq0("SHAKE_EGG", 2, "shakeEgg", 2);
        SHAKE_EGG = enumC1027220cq03;
        EnumC1027220cq0[] enumC1027220cq0Arr = {enumC1027220cq0, enumC1027220cq02, enumC1027220cq03};
        LLILLL = enumC1027220cq0Arr;
        LLILZ = new C2254308sP(enumC1027220cq0Arr);
    }

    public static EnumC1027220cq0[] values() {
        return (EnumC1027220cq0[]) LLILLL.clone();
    }

    public final int getIntV() {
        return this.LLILLJJLI;
    }

    public final String getStrV() {
        return this.LL;
    }

    public static EnumC1027220cq0 valueOf(String str) {
        return (EnumC1027220cq0) C08FF.LIZ(EnumC1027220cq0.class, str);
    }

    public EnumC1027220cq0(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
