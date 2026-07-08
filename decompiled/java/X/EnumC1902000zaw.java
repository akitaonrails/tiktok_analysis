package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1902000zaw {
    public static final EnumC1902000zaw DEFAULT;
    public static final EnumC1902000zaw FRIENDS;
    public static final /* synthetic */ EnumC1902000zaw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public String LL;

    public static InterfaceC2044707zh<EnumC1902000zaw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1902000zaw enumC1902000zaw = new EnumC1902000zaw(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1902000zaw;
        EnumC1902000zaw enumC1902000zaw2 = new EnumC1902000zaw("FRIENDS", 1, "friends");
        FRIENDS = enumC1902000zaw2;
        EnumC1902000zaw[] enumC1902000zawArr = {enumC1902000zaw, enumC1902000zaw2};
        LLILLJJLI = enumC1902000zawArr;
        LLILLL = new C2254308sP(enumC1902000zawArr);
    }

    public static EnumC1902000zaw[] values() {
        return (EnumC1902000zaw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1902000zaw valueOf(String str) {
        return (EnumC1902000zaw) C08FF.LIZ(EnumC1902000zaw.class, str);
    }

    public final void setValue(String str) {
        this.LL = str;
    }

    public EnumC1902000zaw(String str, int i, String str2) {
        this.LL = str2;
    }
}
