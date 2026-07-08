package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19384410sc {
    public static final EnumC19384410sc DEFAULT;
    public static final /* synthetic */ EnumC19384410sc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19384410sc SMALL;

    public static InterfaceC2044707zh<EnumC19384410sc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19384410sc enumC19384410sc = new EnumC19384410sc(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC19384410sc;
        EnumC19384410sc enumC19384410sc2 = new EnumC19384410sc("SMALL", 1);
        SMALL = enumC19384410sc2;
        EnumC19384410sc[] enumC19384410scArr = {enumC19384410sc, enumC19384410sc2};
        LL = enumC19384410scArr;
        LLILLJJLI = new C2254308sP(enumC19384410scArr);
    }

    public static EnumC19384410sc[] values() {
        return (EnumC19384410sc[]) LL.clone();
    }

    public static EnumC19384410sc valueOf(String str) {
        return (EnumC19384410sc) C08FF.LIZ(EnumC19384410sc.class, str);
    }

    public EnumC19384410sc(String str, int i) {
    }
}
