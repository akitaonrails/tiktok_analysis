package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0317009b {
    public static final EnumC0317009b AUDIO_RECORD_BUFFER_SIZE_ERROR;
    public static final EnumC0317009b AUDIO_RECORD_INIT_ERROR;
    public static final EnumC0317009b AUDIO_RECORD_INVALID_OPERATION_ERROR;
    public static final EnumC0317009b AUDIO_RECORD_LOOP_ERROR;
    public static final EnumC0317009b AUDIO_RECORD_SUCCESS;
    public static final /* synthetic */ EnumC0317009b[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0317009b> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0317009b enumC0317009b = new EnumC0317009b("AUDIO_RECORD_SUCCESS", 0);
        AUDIO_RECORD_SUCCESS = enumC0317009b;
        EnumC0317009b enumC0317009b2 = new EnumC0317009b("AUDIO_RECORD_INIT_ERROR", 1);
        AUDIO_RECORD_INIT_ERROR = enumC0317009b2;
        EnumC0317009b enumC0317009b3 = new EnumC0317009b("AUDIO_RECORD_BUFFER_SIZE_ERROR", 2);
        AUDIO_RECORD_BUFFER_SIZE_ERROR = enumC0317009b3;
        EnumC0317009b enumC0317009b4 = new EnumC0317009b("AUDIO_RECORD_INVALID_OPERATION_ERROR", 3);
        AUDIO_RECORD_INVALID_OPERATION_ERROR = enumC0317009b4;
        EnumC0317009b enumC0317009b5 = new EnumC0317009b("AUDIO_RECORD_LOOP_ERROR", 4);
        AUDIO_RECORD_LOOP_ERROR = enumC0317009b5;
        EnumC0317009b[] enumC0317009bArr = {enumC0317009b, enumC0317009b2, enumC0317009b3, enumC0317009b4, enumC0317009b5};
        LL = enumC0317009bArr;
        LLILLJJLI = new C2254308sP(enumC0317009bArr);
    }

    public static EnumC0317009b[] values() {
        return (EnumC0317009b[]) LL.clone();
    }

    public static EnumC0317009b valueOf(String str) {
        return (EnumC0317009b) C08FF.LIZ(EnumC0317009b.class, str);
    }

    public EnumC0317009b(String str, int i) {
    }
}
