package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Igd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC472930Igd {
    public static final EnumC472930Igd IDLE;
    public static final /* synthetic */ EnumC472930Igd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC472930Igd LOCKED;
    public static final EnumC472930Igd UNLOCKED;

    public static InterfaceC2044707zh<EnumC472930Igd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC472930Igd enumC472930Igd = new EnumC472930Igd("IDLE", 0);
        IDLE = enumC472930Igd;
        EnumC472930Igd enumC472930Igd2 = new EnumC472930Igd("LOCKED", 1);
        LOCKED = enumC472930Igd2;
        EnumC472930Igd enumC472930Igd3 = new EnumC472930Igd("UNLOCKED", 2);
        UNLOCKED = enumC472930Igd3;
        EnumC472930Igd[] enumC472930IgdArr = {enumC472930Igd, enumC472930Igd2, enumC472930Igd3};
        LL = enumC472930IgdArr;
        LLILLJJLI = new C2254308sP(enumC472930IgdArr);
    }

    public static EnumC472930Igd[] values() {
        return (EnumC472930Igd[]) LL.clone();
    }

    public static EnumC472930Igd valueOf(String str) {
        return (EnumC472930Igd) C08FF.LIZ(EnumC472930Igd.class, str);
    }

    public EnumC472930Igd(String str, int i) {
    }
}
