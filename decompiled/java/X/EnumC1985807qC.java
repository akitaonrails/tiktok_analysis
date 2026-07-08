package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985807qC {
    public static final /* synthetic */ EnumC1985807qC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985807qC VIDEO_COVER_PRELOAD;
    public static final EnumC1985807qC VIDEO_PRELOAD;

    public static InterfaceC2044707zh<EnumC1985807qC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985807qC enumC1985807qC = new EnumC1985807qC("VIDEO_PRELOAD", 0);
        VIDEO_PRELOAD = enumC1985807qC;
        EnumC1985807qC enumC1985807qC2 = new EnumC1985807qC("VIDEO_COVER_PRELOAD", 1);
        VIDEO_COVER_PRELOAD = enumC1985807qC2;
        EnumC1985807qC[] enumC1985807qCArr = {enumC1985807qC, enumC1985807qC2};
        LL = enumC1985807qCArr;
        LLILLJJLI = new C2254308sP(enumC1985807qCArr);
    }

    public static EnumC1985807qC[] values() {
        return (EnumC1985807qC[]) LL.clone();
    }

    public static EnumC1985807qC valueOf(String str) {
        return (EnumC1985807qC) C08FF.LIZ(EnumC1985807qC.class, str);
    }

    public EnumC1985807qC(String str, int i) {
    }
}
