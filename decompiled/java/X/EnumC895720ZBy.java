package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895720ZBy {
    public static final /* synthetic */ EnumC895720ZBy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895720ZBy RESULT_FETCH_VOICE_PRINT_FAIL;
    public static final EnumC895720ZBy RESULT_GET_AUDIO_FAIL;
    public static final EnumC895720ZBy RESULT_PROCESS_CANCELED;
    public static final EnumC895720ZBy RESULT_REQUEST_RESULT_FAIL;
    public static final EnumC895720ZBy RESULT_SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC895720ZBy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895720ZBy enumC895720ZBy = new EnumC895720ZBy("RESULT_SUCCESS", 0, 0);
        RESULT_SUCCESS = enumC895720ZBy;
        EnumC895720ZBy enumC895720ZBy2 = new EnumC895720ZBy("RESULT_GET_AUDIO_FAIL", 1, -100);
        RESULT_GET_AUDIO_FAIL = enumC895720ZBy2;
        EnumC895720ZBy enumC895720ZBy3 = new EnumC895720ZBy("RESULT_FETCH_VOICE_PRINT_FAIL", 2, -200);
        RESULT_FETCH_VOICE_PRINT_FAIL = enumC895720ZBy3;
        EnumC895720ZBy enumC895720ZBy4 = new EnumC895720ZBy("RESULT_REQUEST_RESULT_FAIL", 3, -300);
        RESULT_REQUEST_RESULT_FAIL = enumC895720ZBy4;
        EnumC895720ZBy enumC895720ZBy5 = new EnumC895720ZBy("RESULT_PROCESS_CANCELED", 4, -400);
        RESULT_PROCESS_CANCELED = enumC895720ZBy5;
        EnumC895720ZBy[] enumC895720ZByArr = {enumC895720ZBy, enumC895720ZBy2, enumC895720ZBy3, enumC895720ZBy4, enumC895720ZBy5};
        LLILLJJLI = enumC895720ZByArr;
        LLILLL = new C2254308sP(enumC895720ZByArr);
    }

    public static EnumC895720ZBy[] values() {
        return (EnumC895720ZBy[]) LLILLJJLI.clone();
    }

    public final int getValue$tools_camera_base_release() {
        return this.LL;
    }

    public static EnumC895720ZBy valueOf(String str) {
        return (EnumC895720ZBy) C08FF.LIZ(EnumC895720ZBy.class, str);
    }

    public EnumC895720ZBy(String str, int i, int i2) {
        this.LL = i2;
    }
}
