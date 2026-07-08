package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19423810yy {
    public static final EnumC19423810yy DEFAULT;
    public static final /* synthetic */ EnumC19423810yy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19423810yy NOT_INITIALIZED;
    public static final EnumC19423810yy TUTORIAL_1;
    public static final EnumC19423810yy TUTORIAL_2;

    public static InterfaceC2044707zh<EnumC19423810yy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19423810yy enumC19423810yy = new EnumC19423810yy("NOT_INITIALIZED", 0);
        NOT_INITIALIZED = enumC19423810yy;
        EnumC19423810yy enumC19423810yy2 = new EnumC19423810yy("TUTORIAL_1", 1);
        TUTORIAL_1 = enumC19423810yy2;
        EnumC19423810yy enumC19423810yy3 = new EnumC19423810yy("TUTORIAL_2", 2);
        TUTORIAL_2 = enumC19423810yy3;
        EnumC19423810yy enumC19423810yy4 = new EnumC19423810yy(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC19423810yy4;
        EnumC19423810yy[] enumC19423810yyArr = {enumC19423810yy, enumC19423810yy2, enumC19423810yy3, enumC19423810yy4};
        LL = enumC19423810yyArr;
        LLILLJJLI = new C2254308sP(enumC19423810yyArr);
    }

    public static EnumC19423810yy[] values() {
        return (EnumC19423810yy[]) LL.clone();
    }

    public static EnumC19423810yy valueOf(String str) {
        return (EnumC19423810yy) C08FF.LIZ(EnumC19423810yy.class, str);
    }

    public EnumC19423810yy(String str, int i) {
    }
}
