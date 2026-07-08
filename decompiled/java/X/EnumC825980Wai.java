package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Wai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC825980Wai {
    public static final EnumC825980Wai Downloader;
    public static final /* synthetic */ EnumC825980Wai[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC825980Wai TTNet;

    public static InterfaceC2044707zh<EnumC825980Wai> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC825980Wai enumC825980Wai = new EnumC825980Wai("TTNet", 0);
        TTNet = enumC825980Wai;
        EnumC825980Wai enumC825980Wai2 = new EnumC825980Wai("Downloader", 1);
        Downloader = enumC825980Wai2;
        EnumC825980Wai[] enumC825980WaiArr = {enumC825980Wai, enumC825980Wai2};
        LL = enumC825980WaiArr;
        LLILLJJLI = new C2254308sP(enumC825980WaiArr);
    }

    public static EnumC825980Wai[] values() {
        return (EnumC825980Wai[]) LL.clone();
    }

    public static EnumC825980Wai valueOf(String str) {
        return (EnumC825980Wai) C08FF.LIZ(EnumC825980Wai.class, str);
    }

    public EnumC825980Wai(String str, int i) {
    }
}
