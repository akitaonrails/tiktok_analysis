package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1229950i6z {
    public static final EnumC1229950i6z ANCHOR_SELECT_STYLE;
    public static final EnumC1229950i6z DEFAULT;
    public static final /* synthetic */ EnumC1229950i6z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1229950i6z SELECT_STYLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1229950i6z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1229950i6z enumC1229950i6z = new EnumC1229950i6z(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1229950i6z;
        EnumC1229950i6z enumC1229950i6z2 = new EnumC1229950i6z("SELECT_STYLE", 1, 1);
        SELECT_STYLE = enumC1229950i6z2;
        EnumC1229950i6z enumC1229950i6z3 = new EnumC1229950i6z("ANCHOR_SELECT_STYLE", 2, 2);
        ANCHOR_SELECT_STYLE = enumC1229950i6z3;
        EnumC1229950i6z[] enumC1229950i6zArr = {enumC1229950i6z, enumC1229950i6z2, enumC1229950i6z3};
        LLILLJJLI = enumC1229950i6zArr;
        LLILLL = new C2254308sP(enumC1229950i6zArr);
    }

    public static EnumC1229950i6z[] values() {
        return (EnumC1229950i6z[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1229950i6z valueOf(String str) {
        return (EnumC1229950i6z) C08FF.LIZ(EnumC1229950i6z.class, str);
    }

    public EnumC1229950i6z(String str, int i, int i2) {
        this.LL = i2;
    }
}
