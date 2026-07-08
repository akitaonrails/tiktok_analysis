package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1597370rfb {
    public static final /* synthetic */ EnumC1597370rfb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1597370rfb ONETIME;
    public static final EnumC1597370rfb PERSISTENT;

    public static InterfaceC2044707zh<EnumC1597370rfb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1597370rfb enumC1597370rfb = new EnumC1597370rfb("ONETIME", 0);
        ONETIME = enumC1597370rfb;
        EnumC1597370rfb enumC1597370rfb2 = new EnumC1597370rfb("PERSISTENT", 1);
        PERSISTENT = enumC1597370rfb2;
        EnumC1597370rfb[] enumC1597370rfbArr = {enumC1597370rfb, enumC1597370rfb2};
        LL = enumC1597370rfbArr;
        LLILLJJLI = new C2254308sP(enumC1597370rfbArr);
    }

    public static EnumC1597370rfb[] values() {
        return (EnumC1597370rfb[]) LL.clone();
    }

    public static EnumC1597370rfb valueOf(String str) {
        return (EnumC1597370rfb) C08FF.LIZ(EnumC1597370rfb.class, str);
    }

    public EnumC1597370rfb(String str, int i) {
    }
}
