package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656500Pp2 {
    public static final EnumC656500Pp2 DEFAULT;
    public static final EnumC656500Pp2 HORIZONTAL;
    public static final /* synthetic */ EnumC656500Pp2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656500Pp2 SQUIRE;
    public static final EnumC656500Pp2 VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC656500Pp2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656500Pp2 enumC656500Pp2 = new EnumC656500Pp2(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC656500Pp2;
        EnumC656500Pp2 enumC656500Pp22 = new EnumC656500Pp2("VERTICAL", 1, 1);
        VERTICAL = enumC656500Pp22;
        EnumC656500Pp2 enumC656500Pp23 = new EnumC656500Pp2("HORIZONTAL", 2, 2);
        HORIZONTAL = enumC656500Pp23;
        EnumC656500Pp2 enumC656500Pp24 = new EnumC656500Pp2("SQUIRE", 3, 3);
        SQUIRE = enumC656500Pp24;
        EnumC656500Pp2[] enumC656500Pp2Arr = {enumC656500Pp2, enumC656500Pp22, enumC656500Pp23, enumC656500Pp24};
        LLILLJJLI = enumC656500Pp2Arr;
        LLILLL = new C2254308sP(enumC656500Pp2Arr);
    }

    public static EnumC656500Pp2[] values() {
        return (EnumC656500Pp2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC656500Pp2 valueOf(String str) {
        return (EnumC656500Pp2) C08FF.LIZ(EnumC656500Pp2.class, str);
    }

    public EnumC656500Pp2(String str, int i, int i2) {
        this.LL = i2;
    }
}
