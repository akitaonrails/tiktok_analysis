package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0npG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449600npG {
    public static final String LIZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
        String string = "invalid_duration";
        if (jSONObjectLJII != null) {
            Iterator<String> itKeys = jSONObjectLJII.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (Intrinsics.LJFF(next, "default_duration")) {
                    string = JSONObjectProtectorUtils.getString(jSONObjectLJII, next);
                }
            }
        }
        return string;
    }

    public static final boolean LIZIZ(Effect effect) {
        return C1624200sMs.LIZ(effect, "is_greenscreen_tool");
    }

    public static final boolean LIZJ(Effect effect) {
        if (effect.getSource() == 101 || !a0.LJJIIZI(effect.getSdkExtra(), "exportableGreenScreen", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Effect effect) {
        List<String> tags;
        List<String> tags2 = effect.getTags();
        if (tags2 == null || tags2.isEmpty() || (tags = effect.getTags()) == null || !tags.contains("only_support_9_to_16")) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Effect effect) {
        if (effect.getSource() == 101) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(Effect effect) {
        boolean z;
        C1446130njf.LIZ.getClass();
        String strLJIIJ = C1446130njf.LJIIJ(effect, "time_consuming_generate_effect");
        if (strLJIIJ != null && !a0.LJJJIL(strLJIIJ)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJI(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJIILJJIL(effect, "useSlowMo", false);
    }

    public static final boolean LJII(Effect effect) {
        if (effect.getSource() != 101) {
            C1446130njf.LIZ.getClass();
            if (C1446130njf.LJIILJJIL(effect, "canEdit", false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Effect effect) {
        String strOptString;
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
        if (jSONObjectLJIIIZ != null) {
            strOptString = jSONObjectLJIIIZ.optString("AIGCSubType");
        } else {
            strOptString = null;
        }
        return Intrinsics.LJFF(strOptString, "v2v");
    }
}
