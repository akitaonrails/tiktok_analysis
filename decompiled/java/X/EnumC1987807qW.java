package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987807qW {
    public static final /* synthetic */ EnumC1987807qW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1987807qW POI_HEADER_TOP_VIDEOS;
    public static final EnumC1987807qW POI_TOP_VIDEOS_PAGE;

    public static InterfaceC2044707zh<EnumC1987807qW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987807qW enumC1987807qW = new EnumC1987807qW("POI_HEADER_TOP_VIDEOS", 0);
        POI_HEADER_TOP_VIDEOS = enumC1987807qW;
        EnumC1987807qW enumC1987807qW2 = new EnumC1987807qW("POI_TOP_VIDEOS_PAGE", 1);
        POI_TOP_VIDEOS_PAGE = enumC1987807qW2;
        EnumC1987807qW[] enumC1987807qWArr = {enumC1987807qW, enumC1987807qW2};
        LL = enumC1987807qWArr;
        LLILLJJLI = new C2254308sP(enumC1987807qWArr);
    }

    public static EnumC1987807qW[] values() {
        return (EnumC1987807qW[]) LL.clone();
    }

    public static EnumC1987807qW valueOf(String str) {
        return (EnumC1987807qW) C08FF.LIZ(EnumC1987807qW.class, str);
    }

    public EnumC1987807qW(String str, int i) {
    }
}
