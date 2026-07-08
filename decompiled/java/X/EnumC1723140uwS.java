package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723140uwS {
    public static final EnumC1723140uwS ALWAYS;
    public static final EnumC1723140uwS DEFAULT;
    public static final /* synthetic */ EnumC1723140uwS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723140uwS NEVER;

    public static InterfaceC2044707zh<EnumC1723140uwS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723140uwS enumC1723140uwS = new EnumC1723140uwS(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1723140uwS;
        EnumC1723140uwS enumC1723140uwS2 = new EnumC1723140uwS("ALWAYS", 1);
        ALWAYS = enumC1723140uwS2;
        EnumC1723140uwS enumC1723140uwS3 = new EnumC1723140uwS("NEVER", 2);
        NEVER = enumC1723140uwS3;
        EnumC1723140uwS[] enumC1723140uwSArr = {enumC1723140uwS, enumC1723140uwS2, enumC1723140uwS3};
        LL = enumC1723140uwSArr;
        LLILLJJLI = new C2254308sP(enumC1723140uwSArr);
    }

    public static EnumC1723140uwS[] values() {
        return (EnumC1723140uwS[]) LL.clone();
    }

    public static EnumC1723140uwS valueOf(String str) {
        return (EnumC1723140uwS) C08FF.LIZ(EnumC1723140uwS.class, str);
    }

    public EnumC1723140uwS(String str, int i) {
    }
}
