package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC696090RSd {
    public static final EnumC696090RSd CANCEL;
    public static final EnumC696090RSd DEFAULT;
    public static final EnumC696090RSd FAILED;
    public static final /* synthetic */ EnumC696090RSd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC696090RSd SUCCESS;
    public static final EnumC696090RSd UPLOADING;

    public static InterfaceC2044707zh<EnumC696090RSd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC696090RSd enumC696090RSd = new EnumC696090RSd("SUCCESS", 0);
        SUCCESS = enumC696090RSd;
        EnumC696090RSd enumC696090RSd2 = new EnumC696090RSd("FAILED", 1);
        FAILED = enumC696090RSd2;
        EnumC696090RSd enumC696090RSd3 = new EnumC696090RSd("CANCEL", 2);
        CANCEL = enumC696090RSd3;
        EnumC696090RSd enumC696090RSd4 = new EnumC696090RSd("UPLOADING", 3);
        UPLOADING = enumC696090RSd4;
        EnumC696090RSd enumC696090RSd5 = new EnumC696090RSd(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = enumC696090RSd5;
        EnumC696090RSd[] enumC696090RSdArr = {enumC696090RSd, enumC696090RSd2, enumC696090RSd3, enumC696090RSd4, enumC696090RSd5};
        LL = enumC696090RSdArr;
        LLILLJJLI = new C2254308sP(enumC696090RSdArr);
    }

    public static EnumC696090RSd[] values() {
        return (EnumC696090RSd[]) LL.clone();
    }

    public static EnumC696090RSd valueOf(String str) {
        return (EnumC696090RSd) C08FF.LIZ(EnumC696090RSd.class, str);
    }

    public EnumC696090RSd(String str, int i) {
    }
}
