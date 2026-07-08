package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1796980wrY {
    public static final EnumC1796980wrY CANCEL;
    public static final EnumC1796980wrY DEFAULT;
    public static final EnumC1796980wrY FAIL;
    public static final /* synthetic */ EnumC1796980wrY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1796980wrY SUCCESS;

    public static InterfaceC2044707zh<EnumC1796980wrY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1796980wrY enumC1796980wrY = new EnumC1796980wrY(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1796980wrY;
        EnumC1796980wrY enumC1796980wrY2 = new EnumC1796980wrY("CANCEL", 1);
        CANCEL = enumC1796980wrY2;
        EnumC1796980wrY enumC1796980wrY3 = new EnumC1796980wrY("SUCCESS", 2);
        SUCCESS = enumC1796980wrY3;
        EnumC1796980wrY enumC1796980wrY4 = new EnumC1796980wrY("FAIL", 3);
        FAIL = enumC1796980wrY4;
        EnumC1796980wrY[] enumC1796980wrYArr = {enumC1796980wrY, enumC1796980wrY2, enumC1796980wrY3, enumC1796980wrY4};
        LL = enumC1796980wrYArr;
        LLILLJJLI = new C2254308sP(enumC1796980wrYArr);
    }

    public static EnumC1796980wrY[] values() {
        return (EnumC1796980wrY[]) LL.clone();
    }

    public static EnumC1796980wrY valueOf(String str) {
        return (EnumC1796980wrY) C08FF.LIZ(EnumC1796980wrY.class, str);
    }

    public EnumC1796980wrY(String str, int i) {
    }
}
