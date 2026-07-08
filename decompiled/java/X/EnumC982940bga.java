package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982940bga {
    public static final EnumC982940bga FINAL_CALL;
    public static final EnumC982940bga FINAL_RESULT;
    public static final /* synthetic */ EnumC982940bga[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC982940bga PLAYING;

    public static InterfaceC2044707zh<EnumC982940bga> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC982940bga enumC982940bga = new EnumC982940bga("PLAYING", 0);
        PLAYING = enumC982940bga;
        EnumC982940bga enumC982940bga2 = new EnumC982940bga("FINAL_CALL", 1);
        FINAL_CALL = enumC982940bga2;
        EnumC982940bga enumC982940bga3 = new EnumC982940bga("FINAL_RESULT", 2);
        FINAL_RESULT = enumC982940bga3;
        EnumC982940bga[] enumC982940bgaArr = {enumC982940bga, enumC982940bga2, enumC982940bga3};
        LL = enumC982940bgaArr;
        LLILLJJLI = new C2254308sP(enumC982940bgaArr);
    }

    public static EnumC982940bga[] values() {
        return (EnumC982940bga[]) LL.clone();
    }

    public static EnumC982940bga valueOf(String str) {
        return (EnumC982940bga) C08FF.LIZ(EnumC982940bga.class, str);
    }

    public EnumC982940bga(String str, int i) {
    }
}
