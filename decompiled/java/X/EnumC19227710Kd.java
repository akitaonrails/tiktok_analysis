package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19227710Kd {
    public static final /* synthetic */ EnumC19227710Kd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19227710Kd NARROW;
    public static final EnumC19227710Kd NORMAL;
    public static final EnumC19227710Kd WIDE;

    public static InterfaceC2044707zh<EnumC19227710Kd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19227710Kd enumC19227710Kd = new EnumC19227710Kd("NARROW", 0);
        NARROW = enumC19227710Kd;
        EnumC19227710Kd enumC19227710Kd2 = new EnumC19227710Kd("NORMAL", 1);
        NORMAL = enumC19227710Kd2;
        EnumC19227710Kd enumC19227710Kd3 = new EnumC19227710Kd("WIDE", 2);
        WIDE = enumC19227710Kd3;
        EnumC19227710Kd[] enumC19227710KdArr = {enumC19227710Kd, enumC19227710Kd2, enumC19227710Kd3};
        LL = enumC19227710KdArr;
        LLILLJJLI = new C2254308sP(enumC19227710KdArr);
    }

    public static EnumC19227710Kd[] values() {
        return (EnumC19227710Kd[]) LL.clone();
    }

    public static EnumC19227710Kd valueOf(String str) {
        return (EnumC19227710Kd) C08FF.LIZ(EnumC19227710Kd.class, str);
    }

    public EnumC19227710Kd(String str, int i) {
    }
}
