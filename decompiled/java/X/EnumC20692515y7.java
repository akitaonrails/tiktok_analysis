package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15y7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20692515y7 {
    public static final /* synthetic */ EnumC20692515y7[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC20692515y7 PLAY_IN_ORDER;
    public static final EnumC20692515y7 REPEAT;
    public final int LL;
    public final int LLILLJJLI;
    public final EnumC20692615y8 LLILLL;

    public static InterfaceC2044707zh<EnumC20692515y7> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC20692515y7 enumC20692515y7 = new EnumC20692515y7("PLAY_IN_ORDER", 0, 2131826769, R.raw.icon_list_arrow_down, EnumC20692615y8.PLAY_IN_ORDER);
        PLAY_IN_ORDER = enumC20692515y7;
        EnumC20692515y7 enumC20692515y72 = new EnumC20692515y7("REPEAT", 1, 2131826770, R.raw.icon_repeat_1, EnumC20692615y8.REPEAT);
        REPEAT = enumC20692515y72;
        EnumC20692515y7[] enumC20692515y7Arr = {enumC20692515y7, enumC20692515y72};
        LLILZ = enumC20692515y7Arr;
        LLILZIL = new C2254308sP(enumC20692515y7Arr);
    }

    public static EnumC20692515y7[] values() {
        return (EnumC20692515y7[]) LLILZ.clone();
    }

    public final int getIcon() {
        return this.LLILLJJLI;
    }

    public final EnumC20692615y8 getPlayOrder() {
        return this.LLILLL;
    }

    public final int getTitle() {
        return this.LL;
    }

    public static EnumC20692515y7 valueOf(String str) {
        return (EnumC20692515y7) C08FF.LIZ(EnumC20692515y7.class, str);
    }

    public EnumC20692515y7(String str, int i, int i2, int i3, EnumC20692615y8 enumC20692615y8) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = enumC20692615y8;
    }
}
