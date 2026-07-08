package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC344070DeH {
    public static final EnumC344070DeH DEFAULT;
    public static final /* synthetic */ EnumC344070DeH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC344070DeH LOADING;
    public static final EnumC344070DeH SELECTED;

    public static InterfaceC2044707zh<EnumC344070DeH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC344070DeH enumC344070DeH = new EnumC344070DeH("LOADING", 0);
        LOADING = enumC344070DeH;
        EnumC344070DeH enumC344070DeH2 = new EnumC344070DeH("SELECTED", 1);
        SELECTED = enumC344070DeH2;
        EnumC344070DeH enumC344070DeH3 = new EnumC344070DeH(LivePreviewCTASmartDisplayManager.DEFAULT, 2);
        DEFAULT = enumC344070DeH3;
        EnumC344070DeH[] enumC344070DeHArr = {enumC344070DeH, enumC344070DeH2, enumC344070DeH3};
        LL = enumC344070DeHArr;
        LLILLJJLI = new C2254308sP(enumC344070DeHArr);
    }

    public static EnumC344070DeH[] values() {
        return (EnumC344070DeH[]) LL.clone();
    }

    public static EnumC344070DeH valueOf(String str) {
        return (EnumC344070DeH) C08FF.LIZ(EnumC344070DeH.class, str);
    }

    public EnumC344070DeH(String str, int i) {
    }
}
