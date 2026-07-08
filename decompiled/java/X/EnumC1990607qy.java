package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990607qy {
    public static final EnumC1990607qy DEFAULT;
    public static final /* synthetic */ EnumC1990607qy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990607qy V1;
    public static final EnumC1990607qy V2;
    public static final EnumC1990607qy V3;
    public static final EnumC1990607qy V4;
    public static final EnumC1990607qy V5;
    public static final EnumC1990607qy V6;

    public static InterfaceC2044707zh<EnumC1990607qy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990607qy enumC1990607qy = new EnumC1990607qy(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1990607qy;
        EnumC1990607qy enumC1990607qy2 = new EnumC1990607qy("V1", 1);
        V1 = enumC1990607qy2;
        EnumC1990607qy enumC1990607qy3 = new EnumC1990607qy("V2", 2);
        V2 = enumC1990607qy3;
        EnumC1990607qy enumC1990607qy4 = new EnumC1990607qy("V3", 3);
        V3 = enumC1990607qy4;
        EnumC1990607qy enumC1990607qy5 = new EnumC1990607qy("V4", 4);
        V4 = enumC1990607qy5;
        EnumC1990607qy enumC1990607qy6 = new EnumC1990607qy("V5", 5);
        V5 = enumC1990607qy6;
        EnumC1990607qy enumC1990607qy7 = new EnumC1990607qy("V6", 6);
        V6 = enumC1990607qy7;
        EnumC1990607qy[] enumC1990607qyArr = {enumC1990607qy, enumC1990607qy2, enumC1990607qy3, enumC1990607qy4, enumC1990607qy5, enumC1990607qy6, enumC1990607qy7};
        LL = enumC1990607qyArr;
        LLILLJJLI = new C2254308sP(enumC1990607qyArr);
    }

    public static EnumC1990607qy[] values() {
        return (EnumC1990607qy[]) LL.clone();
    }

    public static EnumC1990607qy valueOf(String str) {
        return (EnumC1990607qy) C08FF.LIZ(EnumC1990607qy.class, str);
    }

    public EnumC1990607qy(String str, int i) {
    }
}
