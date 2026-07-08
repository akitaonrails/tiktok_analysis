package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585170MxH {
    public static final EnumC585170MxH IDLE;
    public static final /* synthetic */ EnumC585170MxH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585170MxH ZOOM;

    public static InterfaceC2044707zh<EnumC585170MxH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585170MxH enumC585170MxH = new EnumC585170MxH("IDLE", 0);
        IDLE = enumC585170MxH;
        EnumC585170MxH enumC585170MxH2 = new EnumC585170MxH("ZOOM", 1);
        ZOOM = enumC585170MxH2;
        EnumC585170MxH[] enumC585170MxHArr = {enumC585170MxH, enumC585170MxH2};
        LL = enumC585170MxHArr;
        LLILLJJLI = new C2254308sP(enumC585170MxHArr);
    }

    public static EnumC585170MxH[] values() {
        return (EnumC585170MxH[]) LL.clone();
    }

    public static EnumC585170MxH valueOf(String str) {
        return (EnumC585170MxH) C08FF.LIZ(EnumC585170MxH.class, str);
    }

    public EnumC585170MxH(String str, int i) {
    }
}
