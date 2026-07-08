package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007607ti {
    public static final EnumC2007607ti HIGH_TRAFFIC_STREAM;
    public static final /* synthetic */ EnumC2007607ti[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2007607ti PTF_CREATOR_RANKING_ENTRANCE_ANIMATION_DISABLE;
    public static final EnumC2007607ti PTF_CREATOR_RANKING_ENTRANCE_LOOP_ANIMATION_INTERVAL;

    public static InterfaceC2044707zh<EnumC2007607ti> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007607ti enumC2007607ti = new EnumC2007607ti("PTF_CREATOR_RANKING_ENTRANCE_LOOP_ANIMATION_INTERVAL", 0);
        PTF_CREATOR_RANKING_ENTRANCE_LOOP_ANIMATION_INTERVAL = enumC2007607ti;
        EnumC2007607ti enumC2007607ti2 = new EnumC2007607ti("PTF_CREATOR_RANKING_ENTRANCE_ANIMATION_DISABLE", 1);
        PTF_CREATOR_RANKING_ENTRANCE_ANIMATION_DISABLE = enumC2007607ti2;
        EnumC2007607ti enumC2007607ti3 = new EnumC2007607ti("HIGH_TRAFFIC_STREAM", 2);
        HIGH_TRAFFIC_STREAM = enumC2007607ti3;
        EnumC2007607ti[] enumC2007607tiArr = {enumC2007607ti, enumC2007607ti2, enumC2007607ti3};
        LL = enumC2007607tiArr;
        LLILLJJLI = new C2254308sP(enumC2007607tiArr);
    }

    public static EnumC2007607ti[] values() {
        return (EnumC2007607ti[]) LL.clone();
    }

    public static EnumC2007607ti valueOf(String str) {
        return (EnumC2007607ti) C08FF.LIZ(EnumC2007607ti.class, str);
    }

    public EnumC2007607ti(String str, int i) {
    }
}
