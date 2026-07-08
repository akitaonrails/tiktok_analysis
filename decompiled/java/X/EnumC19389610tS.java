package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10tS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19389610tS {
    public static final EnumC19389610tS DEFAULT;
    public static final EnumC19389610tS FEED_ICON;
    public static final EnumC19389610tS LAZY_INIT_TASK;
    public static final /* synthetic */ EnumC19389610tS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19389610tS USER_CHANGE;

    public static InterfaceC2044707zh<EnumC19389610tS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19389610tS enumC19389610tS = new EnumC19389610tS(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC19389610tS;
        EnumC19389610tS enumC19389610tS2 = new EnumC19389610tS("USER_CHANGE", 1);
        USER_CHANGE = enumC19389610tS2;
        EnumC19389610tS enumC19389610tS3 = new EnumC19389610tS("FEED_ICON", 2);
        FEED_ICON = enumC19389610tS3;
        EnumC19389610tS enumC19389610tS4 = new EnumC19389610tS("LAZY_INIT_TASK", 3);
        LAZY_INIT_TASK = enumC19389610tS4;
        EnumC19389610tS[] enumC19389610tSArr = {enumC19389610tS, enumC19389610tS2, enumC19389610tS3, enumC19389610tS4};
        LL = enumC19389610tSArr;
        LLILLJJLI = new C2254308sP(enumC19389610tSArr);
    }

    public static EnumC19389610tS[] values() {
        return (EnumC19389610tS[]) LL.clone();
    }

    public static EnumC19389610tS valueOf(String str) {
        return (EnumC19389610tS) C08FF.LIZ(EnumC19389610tS.class, str);
    }

    public EnumC19389610tS(String str, int i) {
    }
}
