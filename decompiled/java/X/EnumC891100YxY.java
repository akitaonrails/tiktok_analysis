package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC891100YxY {
    public static final EnumC891100YxY DEFAULT;
    public static final EnumC891100YxY IN_APP_TONE;
    public static final /* synthetic */ EnumC891100YxY[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC891100YxY> getEntries() {
        return LLILZ;
    }

    static {
        EnumC891100YxY enumC891100YxY = new EnumC891100YxY("IN_APP_TONE", 0, "in_app_tone", CardStruct.IStatusCode.DEFAULT);
        IN_APP_TONE = enumC891100YxY;
        EnumC891100YxY enumC891100YxY2 = new EnumC891100YxY(LivePreviewCTASmartDisplayManager.DEFAULT, 1, "default", "1");
        DEFAULT = enumC891100YxY2;
        EnumC891100YxY[] enumC891100YxYArr = {enumC891100YxY, enumC891100YxY2};
        LLILLL = enumC891100YxYArr;
        LLILZ = new C2254308sP(enumC891100YxYArr);
    }

    public static EnumC891100YxY[] values() {
        return (EnumC891100YxY[]) LLILLL.clone();
    }

    public final String getAlertId() {
        return this.LL;
    }

    public final String getAlertValue() {
        return this.LLILLJJLI;
    }

    public static EnumC891100YxY valueOf(String str) {
        return (EnumC891100YxY) C08FF.LIZ(EnumC891100YxY.class, str);
    }

    public EnumC891100YxY(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
