package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955260axw {
    public static final EnumC955260axw ALL;
    public static final /* synthetic */ EnumC955260axw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC955260axw UI_RENDER;
    public static final EnumC955260axw VIDEO_STREAMER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC955260axw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955260axw enumC955260axw = new EnumC955260axw("UI_RENDER", 0, 1);
        UI_RENDER = enumC955260axw;
        EnumC955260axw enumC955260axw2 = new EnumC955260axw("VIDEO_STREAMER", 1, 2);
        VIDEO_STREAMER = enumC955260axw2;
        EnumC955260axw enumC955260axw3 = new EnumC955260axw("ALL", 2, -1);
        ALL = enumC955260axw3;
        EnumC955260axw[] enumC955260axwArr = {enumC955260axw, enumC955260axw2, enumC955260axw3};
        LLILLJJLI = enumC955260axwArr;
        LLILLL = new C2254308sP(enumC955260axwArr);
    }

    public static EnumC955260axw[] values() {
        return (EnumC955260axw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC955260axw valueOf(String str) {
        return (EnumC955260axw) C08FF.LIZ(EnumC955260axw.class, str);
    }

    public EnumC955260axw(String str, int i, int i2) {
        this.LL = i2;
    }
}
