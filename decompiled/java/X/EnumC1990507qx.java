package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990507qx {
    public static final EnumC1990507qx DEFAULT;
    public static final /* synthetic */ EnumC1990507qx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990507qx V1;
    public static final EnumC1990507qx V2;
    public static final EnumC1990507qx V3;
    public static final EnumC1990507qx V4;
    public static final EnumC1990507qx V5;
    public static final EnumC1990507qx V6;

    public static InterfaceC2044707zh<EnumC1990507qx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990507qx enumC1990507qx = new EnumC1990507qx(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1990507qx;
        EnumC1990507qx enumC1990507qx2 = new EnumC1990507qx("V1", 1);
        V1 = enumC1990507qx2;
        EnumC1990507qx enumC1990507qx3 = new EnumC1990507qx("V2", 2);
        V2 = enumC1990507qx3;
        EnumC1990507qx enumC1990507qx4 = new EnumC1990507qx("V3", 3);
        V3 = enumC1990507qx4;
        EnumC1990507qx enumC1990507qx5 = new EnumC1990507qx("V4", 4);
        V4 = enumC1990507qx5;
        EnumC1990507qx enumC1990507qx6 = new EnumC1990507qx("V5", 5);
        V5 = enumC1990507qx6;
        EnumC1990507qx enumC1990507qx7 = new EnumC1990507qx("V6", 6);
        V6 = enumC1990507qx7;
        EnumC1990507qx[] enumC1990507qxArr = {enumC1990507qx, enumC1990507qx2, enumC1990507qx3, enumC1990507qx4, enumC1990507qx5, enumC1990507qx6, enumC1990507qx7};
        LL = enumC1990507qxArr;
        LLILLJJLI = new C2254308sP(enumC1990507qxArr);
    }

    public static EnumC1990507qx[] values() {
        return (EnumC1990507qx[]) LL.clone();
    }

    public static EnumC1990507qx valueOf(String str) {
        return (EnumC1990507qx) C08FF.LIZ(EnumC1990507qx.class, str);
    }

    public EnumC1990507qx(String str, int i) {
    }
}
