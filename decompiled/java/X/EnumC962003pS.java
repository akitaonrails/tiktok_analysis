package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03pS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC962003pS {
    public static final EnumC962003pS ADDRESS_MAP;
    public static final EnumC962003pS DEFAULT;
    public static final /* synthetic */ EnumC962003pS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC962003pS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC962003pS enumC962003pS = new EnumC962003pS(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC962003pS;
        EnumC962003pS enumC962003pS2 = new EnumC962003pS("ADDRESS_MAP", 1);
        ADDRESS_MAP = enumC962003pS2;
        EnumC962003pS[] enumC962003pSArr = {enumC962003pS, enumC962003pS2};
        LL = enumC962003pSArr;
        LLILLJJLI = new C2254308sP(enumC962003pSArr);
    }

    public static EnumC962003pS[] values() {
        return (EnumC962003pS[]) LL.clone();
    }

    public static EnumC962003pS valueOf(String str) {
        return (EnumC962003pS) C08FF.LIZ(EnumC962003pS.class, str);
    }

    public EnumC962003pS(String str, int i) {
    }
}
