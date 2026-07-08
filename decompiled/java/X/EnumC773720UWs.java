package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC773720UWs {
    public static final EnumC773720UWs DEFAULT;
    public static final /* synthetic */ EnumC773720UWs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC773720UWs ZOOM_IN;
    public static final EnumC773720UWs ZOOM_OUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC773720UWs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC773720UWs enumC773720UWs = new EnumC773720UWs(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC773720UWs;
        EnumC773720UWs enumC773720UWs2 = new EnumC773720UWs("ZOOM_IN", 1, "zoom_in");
        ZOOM_IN = enumC773720UWs2;
        EnumC773720UWs enumC773720UWs3 = new EnumC773720UWs("ZOOM_OUT", 2, "zoom_out");
        ZOOM_OUT = enumC773720UWs3;
        EnumC773720UWs[] enumC773720UWsArr = {enumC773720UWs, enumC773720UWs2, enumC773720UWs3};
        LLILLJJLI = enumC773720UWsArr;
        LLILLL = new C2254308sP(enumC773720UWsArr);
    }

    public static EnumC773720UWs[] values() {
        return (EnumC773720UWs[]) LLILLJJLI.clone();
    }

    public final String getDescribe() {
        return this.LL;
    }

    public static EnumC773720UWs valueOf(String str) {
        return (EnumC773720UWs) C08FF.LIZ(EnumC773720UWs.class, str);
    }

    public EnumC773720UWs(String str, int i, String str2) {
        this.LL = str2;
    }
}
