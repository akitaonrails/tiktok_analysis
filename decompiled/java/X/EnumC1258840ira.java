package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ira, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1258840ira {
    public static final EnumC1258840ira DEFAULT;
    public static final /* synthetic */ EnumC1258840ira[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1258840ira MANUAL_LOAD_MORE;
    public static final EnumC1258840ira REMOVE_HINT;

    public static InterfaceC2044707zh<EnumC1258840ira> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1258840ira enumC1258840ira = new EnumC1258840ira(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1258840ira;
        EnumC1258840ira enumC1258840ira2 = new EnumC1258840ira("REMOVE_HINT", 1);
        REMOVE_HINT = enumC1258840ira2;
        EnumC1258840ira enumC1258840ira3 = new EnumC1258840ira("MANUAL_LOAD_MORE", 2);
        MANUAL_LOAD_MORE = enumC1258840ira3;
        EnumC1258840ira[] enumC1258840iraArr = {enumC1258840ira, enumC1258840ira2, enumC1258840ira3};
        LL = enumC1258840iraArr;
        LLILLJJLI = new C2254308sP(enumC1258840iraArr);
    }

    public static EnumC1258840ira[] values() {
        return (EnumC1258840ira[]) LL.clone();
    }

    public static EnumC1258840ira valueOf(String str) {
        return (EnumC1258840ira) C08FF.LIZ(EnumC1258840ira.class, str);
    }

    public EnumC1258840ira(String str, int i) {
    }
}
