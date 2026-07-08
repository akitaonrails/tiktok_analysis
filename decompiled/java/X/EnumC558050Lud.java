package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC558050Lud {
    public static final EnumC558050Lud DEFAULT;
    public static final EnumC558050Lud ERROR;
    public static final EnumC558050Lud INFO;
    public static final /* synthetic */ EnumC558050Lud[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC558050Lud SUCCESS;
    public static final EnumC558050Lud WARN;

    public static InterfaceC2044707zh<EnumC558050Lud> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC558050Lud enumC558050Lud = new EnumC558050Lud("SUCCESS", 0);
        SUCCESS = enumC558050Lud;
        EnumC558050Lud enumC558050Lud2 = new EnumC558050Lud("ERROR", 1);
        ERROR = enumC558050Lud2;
        EnumC558050Lud enumC558050Lud3 = new EnumC558050Lud("WARN", 2);
        WARN = enumC558050Lud3;
        EnumC558050Lud enumC558050Lud4 = new EnumC558050Lud("INFO", 3);
        INFO = enumC558050Lud4;
        EnumC558050Lud enumC558050Lud5 = new EnumC558050Lud(LivePreviewCTASmartDisplayManager.DEFAULT, 4);
        DEFAULT = enumC558050Lud5;
        EnumC558050Lud[] enumC558050LudArr = {enumC558050Lud, enumC558050Lud2, enumC558050Lud3, enumC558050Lud4, enumC558050Lud5};
        LL = enumC558050LudArr;
        LLILLJJLI = new C2254308sP(enumC558050LudArr);
    }

    public static EnumC558050Lud[] values() {
        return (EnumC558050Lud[]) LL.clone();
    }

    public static EnumC558050Lud valueOf(String str) {
        return (EnumC558050Lud) C08FF.LIZ(EnumC558050Lud.class, str);
    }

    public EnumC558050Lud(String str, int i) {
    }
}
