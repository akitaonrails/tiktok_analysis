package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641560sos {
    public static final EnumC1641560sos CAMERA_FIRST_FRAME;
    public static final /* synthetic */ EnumC1641560sos[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641560sos UI_FIRST_FRAME;

    public static InterfaceC2044707zh<EnumC1641560sos> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641560sos enumC1641560sos = new EnumC1641560sos("CAMERA_FIRST_FRAME", 0);
        CAMERA_FIRST_FRAME = enumC1641560sos;
        EnumC1641560sos enumC1641560sos2 = new EnumC1641560sos("UI_FIRST_FRAME", 1);
        UI_FIRST_FRAME = enumC1641560sos2;
        EnumC1641560sos[] enumC1641560sosArr = {enumC1641560sos, enumC1641560sos2};
        LL = enumC1641560sosArr;
        LLILLJJLI = new C2254308sP(enumC1641560sosArr);
    }

    public static EnumC1641560sos[] values() {
        return (EnumC1641560sos[]) LL.clone();
    }

    public static EnumC1641560sos valueOf(String str) {
        return (EnumC1641560sos) C08FF.LIZ(EnumC1641560sos.class, str);
    }

    public EnumC1641560sos(String str, int i) {
    }
}
