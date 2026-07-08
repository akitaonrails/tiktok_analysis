package X;

/* JADX INFO: renamed from: X.0uL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public enum EnumC1700000uL8 {
    type_Unknown(-1),
    type_AudioVideo(0),
    type_Video(1),
    type_Audio(2),
    type_Image(3),
    type_Camera(4),
    type_Color(5),
    type_ImageVideo(6);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1700000uL8 valueOf(String str) {
        return (EnumC1700000uL8) C08FF.LIZ(EnumC1700000uL8.class, str);
    }

    EnumC1700000uL8(int i) {
        this.LL = i;
    }
}
