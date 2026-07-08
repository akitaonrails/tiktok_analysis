package X;

/* JADX INFO: renamed from: X.0vLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1738800vLi {
    Default(0),
    DetectAndRecognize(1),
    NativeRecognizeInner(2),
    NativeRecognize(4),
    ImageCropped(5);

    public final int LL;

    public static EnumC1738800vLi valueOf(String str) {
        return (EnumC1738800vLi) C08FF.LIZ(EnumC1738800vLi.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1738800vLi(int i) {
        this.LL = i;
    }
}
