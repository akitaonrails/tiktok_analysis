package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992430bvt {
    public static final /* synthetic */ EnumC992430bvt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992430bvt MUSIC_PANEL_FIRST;
    public static final EnumC992430bvt MUSIC_PANEL_LIST;
    public static final EnumC992430bvt MUSIC_RECOMMEND_4_EFFECT;
    public static final EnumC992430bvt NO_MATCH;

    public static InterfaceC2044707zh<EnumC992430bvt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992430bvt enumC992430bvt = new EnumC992430bvt("NO_MATCH", 0);
        NO_MATCH = enumC992430bvt;
        EnumC992430bvt enumC992430bvt2 = new EnumC992430bvt("MUSIC_PANEL_FIRST", 1);
        MUSIC_PANEL_FIRST = enumC992430bvt2;
        EnumC992430bvt enumC992430bvt3 = new EnumC992430bvt("MUSIC_PANEL_LIST", 2);
        MUSIC_PANEL_LIST = enumC992430bvt3;
        EnumC992430bvt enumC992430bvt4 = new EnumC992430bvt("MUSIC_RECOMMEND_4_EFFECT", 3);
        MUSIC_RECOMMEND_4_EFFECT = enumC992430bvt4;
        EnumC992430bvt[] enumC992430bvtArr = {enumC992430bvt, enumC992430bvt2, enumC992430bvt3, enumC992430bvt4};
        LL = enumC992430bvtArr;
        LLILLJJLI = new C2254308sP(enumC992430bvtArr);
    }

    public static EnumC992430bvt[] values() {
        return (EnumC992430bvt[]) LL.clone();
    }

    public static EnumC992430bvt valueOf(String str) {
        return (EnumC992430bvt) C08FF.LIZ(EnumC992430bvt.class, str);
    }

    public EnumC992430bvt(String str, int i) {
    }
}
