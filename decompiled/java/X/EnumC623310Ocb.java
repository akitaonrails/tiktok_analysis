package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ocb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623310Ocb {
    public static final EnumC623310Ocb DOWN;
    public static final EnumC623310Ocb LEFT;
    public static final /* synthetic */ EnumC623310Ocb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC623310Ocb RIGHT;
    public static final EnumC623310Ocb UP;

    public static InterfaceC2044707zh<EnumC623310Ocb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC623310Ocb enumC623310Ocb = new EnumC623310Ocb("UP", 0);
        UP = enumC623310Ocb;
        EnumC623310Ocb enumC623310Ocb2 = new EnumC623310Ocb("DOWN", 1);
        DOWN = enumC623310Ocb2;
        EnumC623310Ocb enumC623310Ocb3 = new EnumC623310Ocb("LEFT", 2);
        LEFT = enumC623310Ocb3;
        EnumC623310Ocb enumC623310Ocb4 = new EnumC623310Ocb("RIGHT", 3);
        RIGHT = enumC623310Ocb4;
        EnumC623310Ocb[] enumC623310OcbArr = {enumC623310Ocb, enumC623310Ocb2, enumC623310Ocb3, enumC623310Ocb4};
        LL = enumC623310OcbArr;
        LLILLJJLI = new C2254308sP(enumC623310OcbArr);
    }

    public static EnumC623310Ocb[] values() {
        return (EnumC623310Ocb[]) LL.clone();
    }

    public static EnumC623310Ocb valueOf(String str) {
        return (EnumC623310Ocb) C08FF.LIZ(EnumC623310Ocb.class, str);
    }

    public EnumC623310Ocb(String str, int i) {
    }
}
