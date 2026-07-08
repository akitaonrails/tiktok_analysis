package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356430DyD {
    public static final EnumC356430DyD ADD;
    public static final EnumC356430DyD DEFAULT;
    public static final /* synthetic */ EnumC356430DyD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC356430DyD REMOVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC356430DyD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC356430DyD enumC356430DyD = new EnumC356430DyD(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = enumC356430DyD;
        EnumC356430DyD enumC356430DyD2 = new EnumC356430DyD("ADD", 1, 0);
        ADD = enumC356430DyD2;
        EnumC356430DyD enumC356430DyD3 = new EnumC356430DyD("REMOVE", 2, 1);
        REMOVE = enumC356430DyD3;
        EnumC356430DyD[] enumC356430DyDArr = {enumC356430DyD, enumC356430DyD2, enumC356430DyD3};
        LLILLJJLI = enumC356430DyDArr;
        LLILLL = new C2254308sP(enumC356430DyDArr);
    }

    public static EnumC356430DyD[] values() {
        return (EnumC356430DyD[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC356430DyD valueOf(String str) {
        return (EnumC356430DyD) C08FF.LIZ(EnumC356430DyD.class, str);
    }

    public EnumC356430DyD(String str, int i, int i2) {
        this.LL = i2;
    }
}
