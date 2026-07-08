package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1567080qsk {
    public static final EnumC1567080qsk DEFAULT;
    public static final /* synthetic */ EnumC1567080qsk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1567080qsk REFRESHED;
    public static final EnumC1567080qsk REFRESHING;
    public static final EnumC1567080qsk REFRESHING_CONSECUTIVE;

    public static InterfaceC2044707zh<EnumC1567080qsk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1567080qsk enumC1567080qsk = new EnumC1567080qsk("REFRESHING", 0);
        REFRESHING = enumC1567080qsk;
        EnumC1567080qsk enumC1567080qsk2 = new EnumC1567080qsk("REFRESHING_CONSECUTIVE", 1);
        REFRESHING_CONSECUTIVE = enumC1567080qsk2;
        EnumC1567080qsk enumC1567080qsk3 = new EnumC1567080qsk("REFRESHED", 2);
        REFRESHED = enumC1567080qsk3;
        EnumC1567080qsk enumC1567080qsk4 = new EnumC1567080qsk(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC1567080qsk4;
        EnumC1567080qsk[] enumC1567080qskArr = {enumC1567080qsk, enumC1567080qsk2, enumC1567080qsk3, enumC1567080qsk4};
        LL = enumC1567080qskArr;
        LLILLJJLI = new C2254308sP(enumC1567080qskArr);
    }

    public static EnumC1567080qsk[] values() {
        return (EnumC1567080qsk[]) LL.clone();
    }

    public static EnumC1567080qsk valueOf(String str) {
        return (EnumC1567080qsk) C08FF.LIZ(EnumC1567080qsk.class, str);
    }

    public EnumC1567080qsk(String str, int i) {
    }
}
