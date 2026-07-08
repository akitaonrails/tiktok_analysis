package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818760W9y {
    public static final EnumC818760W9y DEFAULT;
    public static final /* synthetic */ EnumC818760W9y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC818760W9y TITLE;
    public static final EnumC818760W9y URL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC818760W9y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC818760W9y enumC818760W9y = new EnumC818760W9y(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC818760W9y;
        EnumC818760W9y enumC818760W9y2 = new EnumC818760W9y("TITLE", 1, 1);
        TITLE = enumC818760W9y2;
        EnumC818760W9y enumC818760W9y3 = new EnumC818760W9y("URL", 2, 2);
        URL = enumC818760W9y3;
        EnumC818760W9y[] enumC818760W9yArr = {enumC818760W9y, enumC818760W9y2, enumC818760W9y3};
        LLILLJJLI = enumC818760W9yArr;
        LLILLL = new C2254308sP(enumC818760W9yArr);
    }

    public static EnumC818760W9y[] values() {
        return (EnumC818760W9y[]) LLILLJJLI.clone();
    }

    public final int getServerValue() {
        return this.LL;
    }

    public static EnumC818760W9y valueOf(String str) {
        return (EnumC818760W9y) C08FF.LIZ(EnumC818760W9y.class, str);
    }

    public EnumC818760W9y(String str, int i, int i2) {
        this.LL = i2;
    }
}
