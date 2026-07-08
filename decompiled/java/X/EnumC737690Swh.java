package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Swh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC737690Swh {
    public static final EnumC737690Swh DEFAULT;
    public static final EnumC737690Swh EXTRA_LARGE;
    public static final EnumC737690Swh LARGE;
    public static final /* synthetic */ EnumC737690Swh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC737690Swh MEDIUM;
    public static final EnumC737690Swh SMALL;

    public static InterfaceC2044707zh<EnumC737690Swh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC737690Swh enumC737690Swh = new EnumC737690Swh("SMALL", 0);
        SMALL = enumC737690Swh;
        EnumC737690Swh enumC737690Swh2 = new EnumC737690Swh("MEDIUM", 1);
        MEDIUM = enumC737690Swh2;
        EnumC737690Swh enumC737690Swh3 = new EnumC737690Swh("LARGE", 2);
        LARGE = enumC737690Swh3;
        EnumC737690Swh enumC737690Swh4 = new EnumC737690Swh("EXTRA_LARGE", 3);
        EXTRA_LARGE = enumC737690Swh4;
        EnumC737690Swh enumC737690Swh5 = new EnumC737690Swh(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = enumC737690Swh5;
        EnumC737690Swh[] enumC737690SwhArr = {enumC737690Swh, enumC737690Swh2, enumC737690Swh3, enumC737690Swh4, enumC737690Swh5};
        LL = enumC737690SwhArr;
        LLILLJJLI = new C2254308sP(enumC737690SwhArr);
    }

    public static EnumC737690Swh[] values() {
        return (EnumC737690Swh[]) LL.clone();
    }

    public static EnumC737690Swh valueOf(String str) {
        return (EnumC737690Swh) C08FF.LIZ(EnumC737690Swh.class, str);
    }

    public EnumC737690Swh(String str, int i) {
    }
}
