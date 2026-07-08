package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586670Mzh {
    public static final /* synthetic */ EnumC586670Mzh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586670Mzh PAUSED;
    public static final EnumC586670Mzh PLAYING;

    public static InterfaceC2044707zh<EnumC586670Mzh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586670Mzh enumC586670Mzh = new EnumC586670Mzh("PLAYING", 0);
        PLAYING = enumC586670Mzh;
        EnumC586670Mzh enumC586670Mzh2 = new EnumC586670Mzh("PAUSED", 1);
        PAUSED = enumC586670Mzh2;
        EnumC586670Mzh[] enumC586670MzhArr = {enumC586670Mzh, enumC586670Mzh2};
        LL = enumC586670MzhArr;
        LLILLJJLI = new C2254308sP(enumC586670MzhArr);
    }

    public static EnumC586670Mzh[] values() {
        return (EnumC586670Mzh[]) LL.clone();
    }

    public static EnumC586670Mzh valueOf(String str) {
        return (EnumC586670Mzh) C08FF.LIZ(EnumC586670Mzh.class, str);
    }

    public EnumC586670Mzh(String str, int i) {
    }
}
