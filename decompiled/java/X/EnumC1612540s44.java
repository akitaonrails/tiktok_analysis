package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1612540s44 {
    public static final EnumC1612540s44 CONTINUE_WATCH;
    public static final EnumC1612540s44 DEFAULT;
    public static final EnumC1612540s44 FIRST_VIDEO;
    public static final EnumC1612540s44 LAST_WATCHED;
    public static final /* synthetic */ EnumC1612540s44[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1612540s44> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1612540s44 enumC1612540s44 = new EnumC1612540s44(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1612540s44;
        EnumC1612540s44 enumC1612540s442 = new EnumC1612540s44("FIRST_VIDEO", 1, 1);
        FIRST_VIDEO = enumC1612540s442;
        EnumC1612540s44 enumC1612540s443 = new EnumC1612540s44("LAST_WATCHED", 2, 2);
        LAST_WATCHED = enumC1612540s443;
        EnumC1612540s44 enumC1612540s444 = new EnumC1612540s44("CONTINUE_WATCH", 3, 3);
        CONTINUE_WATCH = enumC1612540s444;
        EnumC1612540s44[] enumC1612540s44Arr = {enumC1612540s44, enumC1612540s442, enumC1612540s443, enumC1612540s444};
        LLILLJJLI = enumC1612540s44Arr;
        LLILLL = new C2254308sP(enumC1612540s44Arr);
    }

    public static EnumC1612540s44[] values() {
        return (EnumC1612540s44[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1612540s44 valueOf(String str) {
        return (EnumC1612540s44) C08FF.LIZ(EnumC1612540s44.class, str);
    }

    public EnumC1612540s44(String str, int i, int i2) {
        this.LL = i2;
    }
}
