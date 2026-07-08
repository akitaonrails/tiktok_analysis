package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC936560aTm {
    public static final /* synthetic */ EnumC936560aTm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC936560aTm STATE_IDLE;
    public static final EnumC936560aTm STATE_INIT;
    public static final EnumC936560aTm STATE_JOINED;
    public static final EnumC936560aTm STATE_LINKED;
    public static final EnumC936560aTm STATE_PAUSE;
    public static final EnumC936560aTm STATE_PREPARING;

    public static InterfaceC2044707zh<EnumC936560aTm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC936560aTm enumC936560aTm = new EnumC936560aTm("STATE_IDLE", 0);
        STATE_IDLE = enumC936560aTm;
        EnumC936560aTm enumC936560aTm2 = new EnumC936560aTm("STATE_INIT", 1);
        STATE_INIT = enumC936560aTm2;
        EnumC936560aTm enumC936560aTm3 = new EnumC936560aTm("STATE_PREPARING", 2);
        STATE_PREPARING = enumC936560aTm3;
        EnumC936560aTm enumC936560aTm4 = new EnumC936560aTm("STATE_JOINED", 3);
        STATE_JOINED = enumC936560aTm4;
        EnumC936560aTm enumC936560aTm5 = new EnumC936560aTm("STATE_LINKED", 4);
        STATE_LINKED = enumC936560aTm5;
        EnumC936560aTm enumC936560aTm6 = new EnumC936560aTm("STATE_PAUSE", 5);
        STATE_PAUSE = enumC936560aTm6;
        EnumC936560aTm[] enumC936560aTmArr = {enumC936560aTm, enumC936560aTm2, enumC936560aTm3, enumC936560aTm4, enumC936560aTm5, enumC936560aTm6};
        LL = enumC936560aTmArr;
        LLILLJJLI = new C2254308sP(enumC936560aTmArr);
    }

    public static EnumC936560aTm[] values() {
        return (EnumC936560aTm[]) LL.clone();
    }

    public static EnumC936560aTm valueOf(String str) {
        return (EnumC936560aTm) C08FF.LIZ(EnumC936560aTm.class, str);
    }

    public EnumC936560aTm(String str, int i) {
    }
}
