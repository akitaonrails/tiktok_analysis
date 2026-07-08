package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VrO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC810840VrO {
    public static final C810860VrQ Companion;
    public static final EnumC810840VrO DEFAULT;
    public static final /* synthetic */ EnumC810840VrO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC810840VrO NO_SOUND;
    public static final EnumC810840VrO SOUND_TYPE_2;
    public static final EnumC810840VrO SOUND_TYPE_3;
    public static final EnumC810840VrO SOUND_TYPE_4;
    public final int LL;

    public static final EnumC810840VrO fromInt(int i) {
        Companion.getClass();
        return C810860VrQ.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC810840VrO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC810840VrO enumC810840VrO = new EnumC810840VrO("NO_SOUND", 0, -1);
        NO_SOUND = enumC810840VrO;
        EnumC810840VrO enumC810840VrO2 = new EnumC810840VrO(LivePreviewCTASmartDisplayManager.DEFAULT, 1, 0);
        DEFAULT = enumC810840VrO2;
        EnumC810840VrO enumC810840VrO3 = new EnumC810840VrO("SOUND_TYPE_2", 2, 2);
        SOUND_TYPE_2 = enumC810840VrO3;
        EnumC810840VrO enumC810840VrO4 = new EnumC810840VrO("SOUND_TYPE_3", 3, 3);
        SOUND_TYPE_3 = enumC810840VrO4;
        EnumC810840VrO enumC810840VrO5 = new EnumC810840VrO("SOUND_TYPE_4", 4, 4);
        SOUND_TYPE_4 = enumC810840VrO5;
        EnumC810840VrO[] enumC810840VrOArr = {enumC810840VrO, enumC810840VrO2, enumC810840VrO3, enumC810840VrO4, enumC810840VrO5};
        LLILLJJLI = enumC810840VrOArr;
        LLILLL = new C2254308sP(enumC810840VrOArr);
        Companion = new C810860VrQ();
    }

    public static EnumC810840VrO[] values() {
        return (EnumC810840VrO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC810840VrO valueOf(String str) {
        return (EnumC810840VrO) C08FF.LIZ(EnumC810840VrO.class, str);
    }

    public EnumC810840VrO(String str, int i, int i2) {
        this.LL = i2;
    }
}
