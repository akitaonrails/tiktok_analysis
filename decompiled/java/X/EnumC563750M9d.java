package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC563750M9d {
    public static final EnumC563750M9d DEFAULT;
    public static final /* synthetic */ EnumC563750M9d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC563750M9d RETURN_TO_SOURCE;

    public static InterfaceC2044707zh<EnumC563750M9d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC563750M9d enumC563750M9d = new EnumC563750M9d(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC563750M9d;
        EnumC563750M9d enumC563750M9d2 = new EnumC563750M9d("RETURN_TO_SOURCE", 1);
        RETURN_TO_SOURCE = enumC563750M9d2;
        EnumC563750M9d[] enumC563750M9dArr = {enumC563750M9d, enumC563750M9d2};
        LL = enumC563750M9dArr;
        LLILLJJLI = new C2254308sP(enumC563750M9dArr);
    }

    public static EnumC563750M9d[] values() {
        return (EnumC563750M9d[]) LL.clone();
    }

    public static EnumC563750M9d valueOf(String str) {
        return (EnumC563750M9d) C08FF.LIZ(EnumC563750M9d.class, str);
    }

    public EnumC563750M9d(String str, int i) {
    }
}
