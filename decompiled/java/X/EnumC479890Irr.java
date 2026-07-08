package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Irr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC479890Irr {
    public static final EnumC479890Irr BROADCAST;
    public static final EnumC479890Irr LIVE_PLAY;
    public static final /* synthetic */ EnumC479890Irr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC479890Irr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC479890Irr enumC479890Irr = new EnumC479890Irr("BROADCAST", 0);
        BROADCAST = enumC479890Irr;
        EnumC479890Irr enumC479890Irr2 = new EnumC479890Irr("LIVE_PLAY", 1);
        LIVE_PLAY = enumC479890Irr2;
        EnumC479890Irr[] enumC479890IrrArr = {enumC479890Irr, enumC479890Irr2};
        LL = enumC479890IrrArr;
        LLILLJJLI = new C2254308sP(enumC479890IrrArr);
    }

    public static EnumC479890Irr[] values() {
        return (EnumC479890Irr[]) LL.clone();
    }

    public static EnumC479890Irr valueOf(String str) {
        return (EnumC479890Irr) C08FF.LIZ(EnumC479890Irr.class, str);
    }

    public EnumC479890Irr(String str, int i) {
    }
}
