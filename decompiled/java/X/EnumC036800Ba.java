package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036800Ba {
    public static final EnumC036800Ba DEFAULT;
    public static final /* synthetic */ EnumC036800Ba[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC036800Ba VIDEO;

    public static InterfaceC2044707zh<EnumC036800Ba> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC036800Ba enumC036800Ba = new EnumC036800Ba(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC036800Ba;
        EnumC036800Ba enumC036800Ba2 = new EnumC036800Ba("VIDEO", 1);
        VIDEO = enumC036800Ba2;
        EnumC036800Ba[] enumC036800BaArr = {enumC036800Ba, enumC036800Ba2};
        LL = enumC036800BaArr;
        LLILLJJLI = new C2254308sP(enumC036800BaArr);
    }

    public static EnumC036800Ba[] values() {
        return (EnumC036800Ba[]) LL.clone();
    }

    public static EnumC036800Ba valueOf(String str) {
        return (EnumC036800Ba) C08FF.LIZ(EnumC036800Ba.class, str);
    }

    public EnumC036800Ba(String str, int i) {
    }
}
