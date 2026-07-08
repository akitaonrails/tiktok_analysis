package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624640Oek {
    public static final C624630Oej Companion;
    public static final EnumC624640Oek DOWNLOAD_100_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_120_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_150_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_200_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_240_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_480_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_50_VIDEOS;
    public static final EnumC624640Oek DOWNLOAD_60_VIDEOS;
    public static final /* synthetic */ EnumC624640Oek[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC624640Oek> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC624640Oek enumC624640Oek = new EnumC624640Oek("DOWNLOAD_60_VIDEOS", 0, 60, 30, 200);
        DOWNLOAD_60_VIDEOS = enumC624640Oek;
        EnumC624640Oek enumC624640Oek2 = new EnumC624640Oek("DOWNLOAD_120_VIDEOS", 1, 120, 60, 400);
        DOWNLOAD_120_VIDEOS = enumC624640Oek2;
        EnumC624640Oek enumC624640Oek3 = new EnumC624640Oek("DOWNLOAD_240_VIDEOS", 2, 240, 120, 800);
        DOWNLOAD_240_VIDEOS = enumC624640Oek3;
        EnumC624640Oek enumC624640Oek4 = new EnumC624640Oek("DOWNLOAD_480_VIDEOS", 3, 480, 240, 1600);
        DOWNLOAD_480_VIDEOS = enumC624640Oek4;
        EnumC624640Oek enumC624640Oek5 = new EnumC624640Oek("DOWNLOAD_50_VIDEOS", 4, 50, 30, 100);
        DOWNLOAD_50_VIDEOS = enumC624640Oek5;
        EnumC624640Oek enumC624640Oek6 = new EnumC624640Oek("DOWNLOAD_100_VIDEOS", 5, 100, 50, 200);
        DOWNLOAD_100_VIDEOS = enumC624640Oek6;
        EnumC624640Oek enumC624640Oek7 = new EnumC624640Oek("DOWNLOAD_150_VIDEOS", 6, 150, 70, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        DOWNLOAD_150_VIDEOS = enumC624640Oek7;
        EnumC624640Oek enumC624640Oek8 = new EnumC624640Oek("DOWNLOAD_200_VIDEOS", 7, 200, 120, 400);
        DOWNLOAD_200_VIDEOS = enumC624640Oek8;
        EnumC624640Oek[] enumC624640OekArr = {enumC624640Oek, enumC624640Oek2, enumC624640Oek3, enumC624640Oek4, enumC624640Oek5, enumC624640Oek6, enumC624640Oek7, enumC624640Oek8};
        LLILZ = enumC624640OekArr;
        LLILZIL = new C2254308sP(enumC624640OekArr);
        Companion = new C624630Oej();
    }

    public static EnumC624640Oek[] values() {
        return (EnumC624640Oek[]) LLILZ.clone();
    }

    public final int getCount() {
        return this.LL;
    }

    public final int getMinutes() {
        return this.LLILLJJLI;
    }

    public final int getSize() {
        return this.LLILLL;
    }

    public static EnumC624640Oek valueOf(String str) {
        return (EnumC624640Oek) C08FF.LIZ(EnumC624640Oek.class, str);
    }

    public EnumC624640Oek(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
