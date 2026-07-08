package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0by9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993830by9 {
    public static final EnumC993830by9 COMPILE;
    public static final EnumC993830by9 DEFAULT;
    public static final /* synthetic */ EnumC993830by9[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC993830by9 SEND_MSG;
    public static final EnumC993830by9 UPLOAD;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC993830by9> getEntries() {
        return LLILZ;
    }

    static {
        EnumC993830by9 enumC993830by9 = new EnumC993830by9(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0, "Default");
        DEFAULT = enumC993830by9;
        EnumC993830by9 enumC993830by92 = new EnumC993830by9("COMPILE", 1, 1, "Compile");
        COMPILE = enumC993830by92;
        EnumC993830by9 enumC993830by93 = new EnumC993830by9("UPLOAD", 2, 2, "Upload");
        UPLOAD = enumC993830by93;
        EnumC993830by9 enumC993830by94 = new EnumC993830by9("SEND_MSG", 3, 3, "Send msg");
        SEND_MSG = enumC993830by94;
        EnumC993830by9[] enumC993830by9Arr = {enumC993830by9, enumC993830by92, enumC993830by93, enumC993830by94};
        LLILLL = enumC993830by9Arr;
        LLILZ = new C2254308sP(enumC993830by9Arr);
    }

    public static EnumC993830by9[] values() {
        return (EnumC993830by9[]) LLILLL.clone();
    }

    public final int getNode() {
        return this.LL;
    }

    public final String getNodeName() {
        return this.LLILLJJLI;
    }

    public static EnumC993830by9 valueOf(String str) {
        return (EnumC993830by9) C08FF.LIZ(EnumC993830by9.class, str);
    }

    public EnumC993830by9(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
