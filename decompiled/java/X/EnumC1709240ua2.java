package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ua2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709240ua2 {
    public static final EnumC1709240ua2 DEFAULT;
    public static final /* synthetic */ EnumC1709240ua2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709240ua2 TOKO;

    public static InterfaceC2044707zh<EnumC1709240ua2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709240ua2 enumC1709240ua2 = new EnumC1709240ua2(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1709240ua2;
        EnumC1709240ua2 enumC1709240ua22 = new EnumC1709240ua2("TOKO", 1);
        TOKO = enumC1709240ua22;
        EnumC1709240ua2[] enumC1709240ua2Arr = {enumC1709240ua2, enumC1709240ua22};
        LL = enumC1709240ua2Arr;
        LLILLJJLI = new C2254308sP(enumC1709240ua2Arr);
    }

    public static EnumC1709240ua2[] values() {
        return (EnumC1709240ua2[]) LL.clone();
    }

    public static EnumC1709240ua2 valueOf(String str) {
        return (EnumC1709240ua2) C08FF.LIZ(EnumC1709240ua2.class, str);
    }

    public EnumC1709240ua2(String str, int i) {
    }
}
