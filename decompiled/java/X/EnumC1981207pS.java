package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1981207pS {
    public static final EnumC1981207pS DEFAULT;
    public static final EnumC1981207pS FIRST_ORDER;
    public static final EnumC1981207pS FLASH_SALE;
    public static final EnumC1981207pS FREE_SHIPPING;
    public static final /* synthetic */ EnumC1981207pS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1981207pS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1981207pS enumC1981207pS = new EnumC1981207pS(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1981207pS;
        EnumC1981207pS enumC1981207pS2 = new EnumC1981207pS("FLASH_SALE", 1);
        FLASH_SALE = enumC1981207pS2;
        EnumC1981207pS enumC1981207pS3 = new EnumC1981207pS("FIRST_ORDER", 2);
        FIRST_ORDER = enumC1981207pS3;
        EnumC1981207pS enumC1981207pS4 = new EnumC1981207pS("FREE_SHIPPING", 3);
        FREE_SHIPPING = enumC1981207pS4;
        EnumC1981207pS[] enumC1981207pSArr = {enumC1981207pS, enumC1981207pS2, enumC1981207pS3, enumC1981207pS4};
        LL = enumC1981207pSArr;
        LLILLJJLI = new C2254308sP(enumC1981207pSArr);
    }

    public static EnumC1981207pS[] values() {
        return (EnumC1981207pS[]) LL.clone();
    }

    public static EnumC1981207pS valueOf(String str) {
        return (EnumC1981207pS) C08FF.LIZ(EnumC1981207pS.class, str);
    }

    public EnumC1981207pS(String str, int i) {
    }
}
