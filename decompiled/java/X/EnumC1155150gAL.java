package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155150gAL {
    public static final EnumC1155150gAL DEFAULT;
    public static final EnumC1155150gAL LATEST;
    public static final /* synthetic */ EnumC1155150gAL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1155150gAL UN_SUPPORT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1155150gAL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1155150gAL enumC1155150gAL = new EnumC1155150gAL("UN_SUPPORT", 0, 0);
        UN_SUPPORT = enumC1155150gAL;
        EnumC1155150gAL enumC1155150gAL2 = new EnumC1155150gAL("LATEST", 1, 1);
        LATEST = enumC1155150gAL2;
        EnumC1155150gAL enumC1155150gAL3 = new EnumC1155150gAL(LivePreviewCTASmartDisplayManager.DEFAULT, 2, 2);
        DEFAULT = enumC1155150gAL3;
        EnumC1155150gAL[] enumC1155150gALArr = {enumC1155150gAL, enumC1155150gAL2, enumC1155150gAL3};
        LLILLJJLI = enumC1155150gALArr;
        LLILLL = new C2254308sP(enumC1155150gALArr);
    }

    public static EnumC1155150gAL[] values() {
        return (EnumC1155150gAL[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1155150gAL valueOf(String str) {
        return (EnumC1155150gAL) C08FF.LIZ(EnumC1155150gAL.class, str);
    }

    public EnumC1155150gAL(String str, int i, int i2) {
        this.LL = i2;
    }
}
