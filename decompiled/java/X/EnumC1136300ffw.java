package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ffw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1136300ffw {
    public static final EnumC1136300ffw EXITING;
    public static final EnumC1136300ffw IDLE;
    public static final EnumC1136300ffw JUMPING;
    public static final /* synthetic */ EnumC1136300ffw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1136300ffw WAITING;

    public static InterfaceC2044707zh<EnumC1136300ffw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1136300ffw enumC1136300ffw = new EnumC1136300ffw("IDLE", 0);
        IDLE = enumC1136300ffw;
        EnumC1136300ffw enumC1136300ffw2 = new EnumC1136300ffw("JUMPING", 1);
        JUMPING = enumC1136300ffw2;
        EnumC1136300ffw enumC1136300ffw3 = new EnumC1136300ffw("WAITING", 2);
        WAITING = enumC1136300ffw3;
        EnumC1136300ffw enumC1136300ffw4 = new EnumC1136300ffw("EXITING", 3);
        EXITING = enumC1136300ffw4;
        EnumC1136300ffw[] enumC1136300ffwArr = {enumC1136300ffw, enumC1136300ffw2, enumC1136300ffw3, enumC1136300ffw4};
        LL = enumC1136300ffwArr;
        LLILLJJLI = new C2254308sP(enumC1136300ffwArr);
    }

    public static EnumC1136300ffw[] values() {
        return (EnumC1136300ffw[]) LL.clone();
    }

    public static EnumC1136300ffw valueOf(String str) {
        return (EnumC1136300ffw) C08FF.LIZ(EnumC1136300ffw.class, str);
    }

    public EnumC1136300ffw(String str, int i) {
    }
}
