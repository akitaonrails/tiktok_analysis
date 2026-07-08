package X;

/* JADX INFO: renamed from: X.0Z0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC892800Z0s {
    BYTENNLLM("bytennllm"),
    GEMINI_NANO("gemini_nano"),
    LANG_CLOUD("lang_cloud"),
    BYTENN("bytenn"),
    PITAYA("pitaya_ml"),
    ASR_STREAM("asr_stream");

    public final String LL;

    public static EnumC892800Z0s valueOf(String str) {
        return (EnumC892800Z0s) C08FF.LIZ(EnumC892800Z0s.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    EnumC892800Z0s(String str) {
        this.LL = str;
    }
}
