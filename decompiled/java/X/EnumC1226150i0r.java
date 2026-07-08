package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1226150i0r {
    public static final EnumC1226150i0r DEFAULT;
    public static final EnumC1226150i0r IN_GROUP;
    public static final /* synthetic */ EnumC1226150i0r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1226150i0r NO_CHAT_PERMISSION;
    public static final EnumC1226150i0r NO_GROUP_PERMISSION;

    public static InterfaceC2044707zh<EnumC1226150i0r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1226150i0r enumC1226150i0r = new EnumC1226150i0r(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1226150i0r;
        EnumC1226150i0r enumC1226150i0r2 = new EnumC1226150i0r("IN_GROUP", 1);
        IN_GROUP = enumC1226150i0r2;
        EnumC1226150i0r enumC1226150i0r3 = new EnumC1226150i0r("NO_GROUP_PERMISSION", 2);
        NO_GROUP_PERMISSION = enumC1226150i0r3;
        EnumC1226150i0r enumC1226150i0r4 = new EnumC1226150i0r("NO_CHAT_PERMISSION", 3);
        NO_CHAT_PERMISSION = enumC1226150i0r4;
        EnumC1226150i0r[] enumC1226150i0rArr = {enumC1226150i0r, enumC1226150i0r2, enumC1226150i0r3, enumC1226150i0r4};
        LL = enumC1226150i0rArr;
        LLILLJJLI = new C2254308sP(enumC1226150i0rArr);
    }

    public static EnumC1226150i0r[] values() {
        return (EnumC1226150i0r[]) LL.clone();
    }

    public static EnumC1226150i0r valueOf(String str) {
        return (EnumC1226150i0r) C08FF.LIZ(EnumC1226150i0r.class, str);
    }

    public EnumC1226150i0r(String str, int i) {
    }
}
