package X;

/* JADX INFO: renamed from: X.0jMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1278080jMc {
    VeLiveAudioSampleRate8000(8000),
    VeLiveAudioSampleRate16000(16000),
    VeLiveAudioSampleRate32000(32000),
    VeLiveAudioSampleRate44100(44100),
    VeLiveAudioSampleRate48000(48000);

    public static final C1278230jMr Companion = new C1278230jMr();
    public final int LL;

    public static final EnumC1278080jMc fromInt(int i) {
        Companion.getClass();
        return C1278230jMr.LIZ(i);
    }

    public static EnumC1278080jMc valueOf(String str) {
        return (EnumC1278080jMc) C08FF.LIZ(EnumC1278080jMc.class, str);
    }

    public final int getSampleRate() {
        return this.LL;
    }

    EnumC1278080jMc(int i) {
        this.LL = i;
    }
}
