package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC771230UNd {
    public static final EnumC771230UNd APPLYING;
    public static final EnumC771230UNd APPLY_FAILED;
    public static final EnumC771230UNd APPLY_FINISH;
    public static final EnumC771230UNd DEFAULT;
    public static final /* synthetic */ EnumC771230UNd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC771230UNd START_FAIL;
    public static final EnumC771230UNd START_SUCCESS;

    public static InterfaceC2044707zh<EnumC771230UNd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC771230UNd enumC771230UNd = new EnumC771230UNd(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC771230UNd;
        EnumC771230UNd enumC771230UNd2 = new EnumC771230UNd("START_FAIL", 1);
        START_FAIL = enumC771230UNd2;
        EnumC771230UNd enumC771230UNd3 = new EnumC771230UNd("START_SUCCESS", 2);
        START_SUCCESS = enumC771230UNd3;
        EnumC771230UNd enumC771230UNd4 = new EnumC771230UNd("APPLYING", 3);
        APPLYING = enumC771230UNd4;
        EnumC771230UNd enumC771230UNd5 = new EnumC771230UNd("APPLY_FINISH", 4);
        APPLY_FINISH = enumC771230UNd5;
        EnumC771230UNd enumC771230UNd6 = new EnumC771230UNd("APPLY_FAILED", 5);
        APPLY_FAILED = enumC771230UNd6;
        EnumC771230UNd[] enumC771230UNdArr = {enumC771230UNd, enumC771230UNd2, enumC771230UNd3, enumC771230UNd4, enumC771230UNd5, enumC771230UNd6};
        LL = enumC771230UNdArr;
        LLILLJJLI = new C2254308sP(enumC771230UNdArr);
    }

    public static EnumC771230UNd[] values() {
        return (EnumC771230UNd[]) LL.clone();
    }

    public static EnumC771230UNd valueOf(String str) {
        return (EnumC771230UNd) C08FF.LIZ(EnumC771230UNd.class, str);
    }

    public EnumC771230UNd(String str, int i) {
    }
}
