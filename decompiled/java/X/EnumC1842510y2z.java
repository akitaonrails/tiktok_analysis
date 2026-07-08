package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1842510y2z {
    public static final EnumC1842510y2z ADD;
    public static final EnumC1842510y2z BASIC_ANIMATION;
    public static final EnumC1842510y2z DEFAULT;
    public static final /* synthetic */ EnumC1842510y2z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1842510y2z RELOAD;
    public static final EnumC1842510y2z REMOVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1842510y2z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1842510y2z enumC1842510y2z = new EnumC1842510y2z(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1842510y2z;
        EnumC1842510y2z enumC1842510y2z2 = new EnumC1842510y2z("ADD", 1, 1);
        ADD = enumC1842510y2z2;
        EnumC1842510y2z enumC1842510y2z3 = new EnumC1842510y2z("REMOVE", 2, 2);
        REMOVE = enumC1842510y2z3;
        EnumC1842510y2z enumC1842510y2z4 = new EnumC1842510y2z("RELOAD", 3, 3);
        RELOAD = enumC1842510y2z4;
        EnumC1842510y2z enumC1842510y2z5 = new EnumC1842510y2z("BASIC_ANIMATION", 4, 4);
        BASIC_ANIMATION = enumC1842510y2z5;
        EnumC1842510y2z[] enumC1842510y2zArr = {enumC1842510y2z, enumC1842510y2z2, enumC1842510y2z3, enumC1842510y2z4, enumC1842510y2z5};
        LLILLJJLI = enumC1842510y2zArr;
        LLILLL = new C2254308sP(enumC1842510y2zArr);
    }

    public static EnumC1842510y2z[] values() {
        return (EnumC1842510y2z[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1842510y2z valueOf(String str) {
        return (EnumC1842510y2z) C08FF.LIZ(EnumC1842510y2z.class, str);
    }

    public EnumC1842510y2z(String str, int i, int i2) {
        this.LL = i2;
    }
}
