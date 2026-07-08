package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC804403Cg {
    public static final EnumC804403Cg DEFAULT;
    public static final /* synthetic */ EnumC804403Cg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804403Cg POST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804403Cg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804403Cg enumC804403Cg = new EnumC804403Cg(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC804403Cg;
        EnumC804403Cg enumC804403Cg2 = new EnumC804403Cg("POST", 1, 1);
        POST = enumC804403Cg2;
        EnumC804403Cg[] enumC804403CgArr = {enumC804403Cg, enumC804403Cg2};
        LLILLJJLI = enumC804403CgArr;
        LLILLL = new C2254308sP(enumC804403CgArr);
    }

    public static EnumC804403Cg[] values() {
        return (EnumC804403Cg[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804403Cg valueOf(String str) {
        return (EnumC804403Cg) C08FF.LIZ(EnumC804403Cg.class, str);
    }

    public EnumC804403Cg(String str, int i, int i2) {
        this.LL = i2;
    }
}
