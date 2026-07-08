package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155170gAN {
    public static final EnumC1155170gAN DEFAULT;
    public static final EnumC1155170gAN LATEST;
    public static final /* synthetic */ EnumC1155170gAN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1155170gAN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1155170gAN enumC1155170gAN = new EnumC1155170gAN("LATEST", 0, 0);
        LATEST = enumC1155170gAN;
        EnumC1155170gAN enumC1155170gAN2 = new EnumC1155170gAN(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 1);
        DEFAULT = enumC1155170gAN2;
        EnumC1155170gAN[] enumC1155170gANArr = {enumC1155170gAN, enumC1155170gAN2};
        LLILLJJLI = enumC1155170gANArr;
        LLILLL = new C2254308sP(enumC1155170gANArr);
    }

    public static EnumC1155170gAN[] values() {
        return (EnumC1155170gAN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1155170gAN valueOf(String str) {
        return (EnumC1155170gAN) C08FF.LIZ(EnumC1155170gAN.class, str);
    }

    public EnumC1155170gAN(String str, int i, int i2) {
        this.LL = i2;
    }
}
