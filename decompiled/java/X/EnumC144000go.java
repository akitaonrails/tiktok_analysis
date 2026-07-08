package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC144000go {
    public static final EnumC144000go ALWAYS_SHOW;
    public static final EnumC144000go DEFAULT;
    public static final /* synthetic */ EnumC144000go[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC144000go> getEntries() {
        return LLILLL;
    }

    static {
        EnumC144000go enumC144000go = new EnumC144000go(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC144000go;
        EnumC144000go enumC144000go2 = new EnumC144000go("ALWAYS_SHOW", 1, 1);
        ALWAYS_SHOW = enumC144000go2;
        EnumC144000go[] enumC144000goArr = {enumC144000go, enumC144000go2};
        LLILLJJLI = enumC144000goArr;
        LLILLL = new C2254308sP(enumC144000goArr);
    }

    public static EnumC144000go[] values() {
        return (EnumC144000go[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC144000go valueOf(String str) {
        return (EnumC144000go) C08FF.LIZ(EnumC144000go.class, str);
    }

    public EnumC144000go(String str, int i, int i2) {
        this.LL = i2;
    }
}
