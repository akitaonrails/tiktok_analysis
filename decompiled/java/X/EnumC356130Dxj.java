package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356130Dxj {
    public static final EnumC356130Dxj ADJUST_MASK;
    public static final EnumC356130Dxj CROP;
    public static final EnumC356130Dxj DEFAULT;
    public static final /* synthetic */ EnumC356130Dxj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356130Dxj ORIGIN_SHAPE;

    public static InterfaceC2044707zh<EnumC356130Dxj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356130Dxj enumC356130Dxj = new EnumC356130Dxj(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC356130Dxj;
        EnumC356130Dxj enumC356130Dxj2 = new EnumC356130Dxj("ORIGIN_SHAPE", 1);
        ORIGIN_SHAPE = enumC356130Dxj2;
        EnumC356130Dxj enumC356130Dxj3 = new EnumC356130Dxj("CROP", 2);
        CROP = enumC356130Dxj3;
        EnumC356130Dxj enumC356130Dxj4 = new EnumC356130Dxj("ADJUST_MASK", 3);
        ADJUST_MASK = enumC356130Dxj4;
        EnumC356130Dxj[] enumC356130DxjArr = {enumC356130Dxj, enumC356130Dxj2, enumC356130Dxj3, enumC356130Dxj4};
        LL = enumC356130DxjArr;
        LLILLJJLI = new C2254308sP(enumC356130DxjArr);
    }

    public static EnumC356130Dxj[] values() {
        return (EnumC356130Dxj[]) LL.clone();
    }

    public static EnumC356130Dxj valueOf(String str) {
        return (EnumC356130Dxj) C08FF.LIZ(EnumC356130Dxj.class, str);
    }

    public EnumC356130Dxj(String str, int i) {
    }
}
