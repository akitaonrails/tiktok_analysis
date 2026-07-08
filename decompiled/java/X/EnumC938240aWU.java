package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC938240aWU {
    public static final EnumC938240aWU AIGC_COUNTDOWN;
    public static final EnumC938240aWU LIVE_SHOW;
    public static final /* synthetic */ EnumC938240aWU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC938240aWU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC938240aWU enumC938240aWU = new EnumC938240aWU("LIVE_SHOW", 0);
        LIVE_SHOW = enumC938240aWU;
        EnumC938240aWU enumC938240aWU2 = new EnumC938240aWU("AIGC_COUNTDOWN", 1);
        AIGC_COUNTDOWN = enumC938240aWU2;
        EnumC938240aWU[] enumC938240aWUArr = {enumC938240aWU, enumC938240aWU2};
        LL = enumC938240aWUArr;
        LLILLJJLI = new C2254308sP(enumC938240aWUArr);
    }

    public static EnumC938240aWU[] values() {
        return (EnumC938240aWU[]) LL.clone();
    }

    public static EnumC938240aWU valueOf(String str) {
        return (EnumC938240aWU) C08FF.LIZ(EnumC938240aWU.class, str);
    }

    public EnumC938240aWU(String str, int i) {
    }
}
