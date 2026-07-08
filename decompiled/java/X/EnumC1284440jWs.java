package X;

/* JADX INFO: renamed from: X.0jWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1284440jWs {
    HW_ENC_FALLBACK_NONE(0),
    VIDEO_ENC_INIT_FALLBACK(1),
    AUDIO_ENC_INIT_FALLBACK(2),
    VIDEO_ENC_ENCODING_FALLBACK(3),
    AUDIO_ENC_ENCODING_FALLBACK(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1284440jWs valueOf(String str) {
        return (EnumC1284440jWs) C08FF.LIZ(EnumC1284440jWs.class, str);
    }

    EnumC1284440jWs(int i) {
        this.LL = i;
    }
}
