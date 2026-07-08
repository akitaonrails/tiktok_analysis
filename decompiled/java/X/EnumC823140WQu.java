package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC823140WQu {
    public static final EnumC823140WQu DEFAULT;
    public static final /* synthetic */ EnumC823140WQu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC823140WQu LOW;
    public static final EnumC823140WQu VERY_LOW;

    public static InterfaceC2044707zh<EnumC823140WQu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC823140WQu enumC823140WQu = new EnumC823140WQu(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC823140WQu;
        EnumC823140WQu enumC823140WQu2 = new EnumC823140WQu("LOW", 1);
        LOW = enumC823140WQu2;
        EnumC823140WQu enumC823140WQu3 = new EnumC823140WQu("VERY_LOW", 2);
        VERY_LOW = enumC823140WQu3;
        EnumC823140WQu[] enumC823140WQuArr = {enumC823140WQu, enumC823140WQu2, enumC823140WQu3};
        LL = enumC823140WQuArr;
        LLILLJJLI = new C2254308sP(enumC823140WQuArr);
    }

    public static EnumC823140WQu[] values() {
        return (EnumC823140WQu[]) LL.clone();
    }

    public static EnumC823140WQu valueOf(String str) {
        return (EnumC823140WQu) C08FF.LIZ(EnumC823140WQu.class, str);
    }

    public EnumC823140WQu(String str, int i) {
    }
}
