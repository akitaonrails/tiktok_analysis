package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ncf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1441790ncf {
    public static final EnumC1441790ncf AUTO_CUT;
    public static final EnumC1441790ncf CUT_SAME;
    public static final C1441800ncg Companion;
    public static final EnumC1441790ncf DEFAULT;
    public static final EnumC1441790ncf DUET;
    public static final /* synthetic */ EnumC1441790ncf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1441790ncf MV_THEME;
    public static final EnumC1441790ncf UGC_TEMPLATE;
    public static final Map<Integer, EnumC1441790ncf> map;
    public final int LL;

    public static final EnumC1441790ncf fromInt(int i) {
        Companion.getClass();
        return C1441800ncg.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC1441790ncf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1441790ncf enumC1441790ncf = new EnumC1441790ncf(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1441790ncf;
        EnumC1441790ncf enumC1441790ncf2 = new EnumC1441790ncf("MV_THEME", 1, 1);
        MV_THEME = enumC1441790ncf2;
        EnumC1441790ncf enumC1441790ncf3 = new EnumC1441790ncf("DUET", 2, 2);
        DUET = enumC1441790ncf3;
        EnumC1441790ncf enumC1441790ncf4 = new EnumC1441790ncf("CUT_SAME", 3, 3);
        CUT_SAME = enumC1441790ncf4;
        EnumC1441790ncf enumC1441790ncf5 = new EnumC1441790ncf("AUTO_CUT", 4, 4);
        AUTO_CUT = enumC1441790ncf5;
        EnumC1441790ncf enumC1441790ncf6 = new EnumC1441790ncf("UGC_TEMPLATE", 5, 5);
        UGC_TEMPLATE = enumC1441790ncf6;
        EnumC1441790ncf[] enumC1441790ncfArr = {enumC1441790ncf, enumC1441790ncf2, enumC1441790ncf3, enumC1441790ncf4, enumC1441790ncf5, enumC1441790ncf6};
        LLILLJJLI = enumC1441790ncfArr;
        LLILLL = new C2254308sP(enumC1441790ncfArr);
        Companion = new C1441800ncg();
        EnumC1441790ncf[] enumC1441790ncfArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1441790ncfArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1441790ncf enumC1441790ncf7 : enumC1441790ncfArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1441790ncf7.LL), enumC1441790ncf7);
        }
        map = linkedHashMap;
    }

    public static EnumC1441790ncf[] values() {
        return (EnumC1441790ncf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1441790ncf valueOf(String str) {
        return (EnumC1441790ncf) C08FF.LIZ(EnumC1441790ncf.class, str);
    }

    public EnumC1441790ncf(String str, int i, int i2) {
        this.LL = i2;
    }
}
