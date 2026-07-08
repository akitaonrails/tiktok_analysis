package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1164730gPn {
    public static final EnumC1164730gPn DEFAULT;
    public static final EnumC1164730gPn FAILED;
    public static final /* synthetic */ EnumC1164730gPn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1164730gPn LOADING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1164730gPn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1164730gPn enumC1164730gPn = new EnumC1164730gPn(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1164730gPn;
        EnumC1164730gPn enumC1164730gPn2 = new EnumC1164730gPn("LOADING", 1, 1);
        LOADING = enumC1164730gPn2;
        EnumC1164730gPn enumC1164730gPn3 = new EnumC1164730gPn("FAILED", 2, 2);
        FAILED = enumC1164730gPn3;
        EnumC1164730gPn[] enumC1164730gPnArr = {enumC1164730gPn, enumC1164730gPn2, enumC1164730gPn3};
        LLILLJJLI = enumC1164730gPnArr;
        LLILLL = new C2254308sP(enumC1164730gPnArr);
    }

    public static EnumC1164730gPn[] values() {
        return (EnumC1164730gPn[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1164730gPn valueOf(String str) {
        return (EnumC1164730gPn) C08FF.LIZ(EnumC1164730gPn.class, str);
    }

    public EnumC1164730gPn(String str, int i, int i2) {
        this.LL = i2;
    }
}
