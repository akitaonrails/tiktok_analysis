package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0il9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1254850il9 {
    public static final EnumC1254850il9 DEFAULT;
    public static final EnumC1254850il9 EDIT_PROFILE;
    public static final EnumC1254850il9 ENLARGE_AVATAR;
    public static final /* synthetic */ EnumC1254850il9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1254850il9 PROFILE;
    public static final EnumC1254850il9 PROMPT;
    public static final EnumC1254850il9 SIGNUP;
    public static final EnumC1254850il9 TWO_HEADER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1254850il9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1254850il9 enumC1254850il9 = new EnumC1254850il9(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1254850il9;
        EnumC1254850il9 enumC1254850il92 = new EnumC1254850il9("PROFILE", 1, 1);
        PROFILE = enumC1254850il92;
        EnumC1254850il9 enumC1254850il93 = new EnumC1254850il9("SIGNUP", 2, 2);
        SIGNUP = enumC1254850il93;
        EnumC1254850il9 enumC1254850il94 = new EnumC1254850il9("PROMPT", 3, 4);
        PROMPT = enumC1254850il94;
        EnumC1254850il9 enumC1254850il95 = new EnumC1254850il9("TWO_HEADER", 4, 6);
        TWO_HEADER = enumC1254850il95;
        EnumC1254850il9 enumC1254850il96 = new EnumC1254850il9("EDIT_PROFILE", 5, 7);
        EDIT_PROFILE = enumC1254850il96;
        EnumC1254850il9 enumC1254850il97 = new EnumC1254850il9("ENLARGE_AVATAR", 6, 8);
        ENLARGE_AVATAR = enumC1254850il97;
        EnumC1254850il9[] enumC1254850il9Arr = {enumC1254850il9, enumC1254850il92, enumC1254850il93, enumC1254850il94, enumC1254850il95, enumC1254850il96, enumC1254850il97};
        LLILLJJLI = enumC1254850il9Arr;
        LLILLL = new C2254308sP(enumC1254850il9Arr);
    }

    public static EnumC1254850il9[] values() {
        return (EnumC1254850il9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1254850il9 valueOf(String str) {
        return (EnumC1254850il9) C08FF.LIZ(EnumC1254850il9.class, str);
    }

    public EnumC1254850il9(String str, int i, int i2) {
        this.LL = i2;
    }
}
