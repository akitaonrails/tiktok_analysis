package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1069130dvb {
    public static final EnumC1069130dvb AWAITING_SCROLL_ACK;
    public static final EnumC1069130dvb DISABLED;
    public static final EnumC1069130dvb ENABLED;
    public static final /* synthetic */ EnumC1069130dvb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1069130dvb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1069130dvb enumC1069130dvb = new EnumC1069130dvb("DISABLED", 0);
        DISABLED = enumC1069130dvb;
        EnumC1069130dvb enumC1069130dvb2 = new EnumC1069130dvb("AWAITING_SCROLL_ACK", 1);
        AWAITING_SCROLL_ACK = enumC1069130dvb2;
        EnumC1069130dvb enumC1069130dvb3 = new EnumC1069130dvb("ENABLED", 2);
        ENABLED = enumC1069130dvb3;
        EnumC1069130dvb[] enumC1069130dvbArr = {enumC1069130dvb, enumC1069130dvb2, enumC1069130dvb3};
        LL = enumC1069130dvbArr;
        LLILLJJLI = new C2254308sP(enumC1069130dvbArr);
    }

    public static EnumC1069130dvb[] values() {
        return (EnumC1069130dvb[]) LL.clone();
    }

    public static EnumC1069130dvb valueOf(String str) {
        return (EnumC1069130dvb) C08FF.LIZ(EnumC1069130dvb.class, str);
    }

    public EnumC1069130dvb(String str, int i) {
    }
}
