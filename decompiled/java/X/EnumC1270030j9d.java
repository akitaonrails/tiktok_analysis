package X;

/* JADX INFO: renamed from: X.0j9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1270030j9d {
    VeLivePusherSuccess(0),
    VeLivePusherInvalidLicense(-1),
    VeLivePusherInvalidParameter(-2),
    VeLivePusherVideoCaptureError(-3),
    VeLivePusherAudioCaptureError(-4),
    VeLivePusherVideoEncoderError(-5),
    VeLivePusherAudioEncoderError(-6),
    VeLivePusherTransportError(-7),
    VeLivePusherVideoEffectError(-8),
    VeLivePusherAudioDeviceError(-9),
    VeLivePusherError(C386801es.DEFAULT),
    LivePusherFallBack(-100),
    LivePusherOpenApiForbidden(-101),
    LivePusherRtmpForbidden(-102),
    LivePusherRtmpAuthenticationFailed(-103),
    LivePusherRtmpDuplicateStream(-104);

    public static final C1270050j9f Companion = new C1270050j9f();
    public final int LL;

    public static final EnumC1270030j9d fromInt(int i) {
        Companion.getClass();
        return C1270050j9f.LIZ(i);
    }

    public static EnumC1270030j9d valueOf(String str) {
        return (EnumC1270030j9d) C08FF.LIZ(EnumC1270030j9d.class, str);
    }

    public final int getCode() {
        return this.LL;
    }

    EnumC1270030j9d(int i) {
        this.LL = i;
    }
}
