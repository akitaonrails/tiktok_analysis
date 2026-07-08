package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083200eII {
    public static final EnumC1083200eII DEFAULT;
    public static final /* synthetic */ EnumC1083200eII[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083200eII UNIFIED_ENTRANCE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1083200eII> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083200eII enumC1083200eII = new EnumC1083200eII(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1083200eII;
        EnumC1083200eII enumC1083200eII2 = new EnumC1083200eII("UNIFIED_ENTRANCE", 1, 1);
        UNIFIED_ENTRANCE = enumC1083200eII2;
        EnumC1083200eII[] enumC1083200eIIArr = {enumC1083200eII, enumC1083200eII2};
        LLILLJJLI = enumC1083200eIIArr;
        LLILLL = new C2254308sP(enumC1083200eIIArr);
    }

    public static EnumC1083200eII[] values() {
        return (EnumC1083200eII[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1083200eII valueOf(String str) {
        return (EnumC1083200eII) C08FF.LIZ(EnumC1083200eII.class, str);
    }

    public EnumC1083200eII(String str, int i, int i2) {
        this.LL = i2;
    }
}
