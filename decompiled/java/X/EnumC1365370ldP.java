package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ldP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1365370ldP {
    public static final EnumC1365370ldP DEFAULT;
    public static final /* synthetic */ EnumC1365370ldP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1365370ldP SENDING;
    public static final EnumC1365370ldP SENT;
    public static final EnumC1365370ldP UNDO;

    public static InterfaceC2044707zh<EnumC1365370ldP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1365370ldP enumC1365370ldP = new EnumC1365370ldP(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1365370ldP;
        EnumC1365370ldP enumC1365370ldP2 = new EnumC1365370ldP("SENDING", 1);
        SENDING = enumC1365370ldP2;
        EnumC1365370ldP enumC1365370ldP3 = new EnumC1365370ldP("SENT", 2);
        SENT = enumC1365370ldP3;
        EnumC1365370ldP enumC1365370ldP4 = new EnumC1365370ldP("UNDO", 3);
        UNDO = enumC1365370ldP4;
        EnumC1365370ldP[] enumC1365370ldPArr = {enumC1365370ldP, enumC1365370ldP2, enumC1365370ldP3, enumC1365370ldP4};
        LL = enumC1365370ldPArr;
        LLILLJJLI = new C2254308sP(enumC1365370ldPArr);
    }

    public static EnumC1365370ldP[] values() {
        return (EnumC1365370ldP[]) LL.clone();
    }

    public static EnumC1365370ldP valueOf(String str) {
        return (EnumC1365370ldP) C08FF.LIZ(EnumC1365370ldP.class, str);
    }

    public EnumC1365370ldP(String str, int i) {
    }
}
