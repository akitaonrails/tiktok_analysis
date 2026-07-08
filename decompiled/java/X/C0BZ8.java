package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZ8 {
    public static final Map<String, Boolean> LIZ;
    public static final C01GW LIZIZ;

    static {
        String strValueOf = String.valueOf(EnumC1430380nKG.CT_DUET_ANCHOR.getTYPE());
        Boolean bool = Boolean.TRUE;
        LIZ = C2097608Jq.LJIIIIZZ(new Pair(strValueOf, bool), new Pair(String.valueOf(EnumC1430380nKG.CT_AI_MAGIC_ANCHOR.getTYPE()), bool), new Pair(String.valueOf(EnumC1430380nKG.CT_FILTER_ANCHOR.getTYPE()), bool), new Pair(String.valueOf(EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE.getTYPE()), bool), new Pair(String.valueOf(EnumC1430380nKG.EDITOR_PRO_CAPTIONS_ANCHOR.getTYPE()), bool));
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4290));
    }

    public static final boolean LIZ(int i) {
        return ((Map) LIZIZ.getValue()).containsKey(String.valueOf(i));
    }
}
