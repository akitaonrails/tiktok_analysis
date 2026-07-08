package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547820qNg {
    public static final Map<String, AbstractC1547800qNe> LIZ = C2097608Jq.LJIIIIZZ(new Pair("should_full_screen", new AbstractC1547800qNe() { // from class: X.0qNi
        @Override // X.AbstractC1547800qNe
        public final String LIZ() {
            return "";
        }
    }), new Pair("show_dim", new AbstractC1547800qNe() { // from class: X.0qNj
        @Override // X.AbstractC1547800qNe
        public final String LIZ() {
            return "show_mask";
        }
    }), new Pair("mask_alpha", new AbstractC1547800qNe() { // from class: X.0qNh
        @Override // X.AbstractC1547800qNe
        public final String LIZ() {
            return "mask_bg_color";
        }

        @Override // X.AbstractC1547800qNe
        public final String LIZIZ(String str) {
            try {
                String strJ4 = C786410Ut5.j4("%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (CastFloatProtector.parseFloat(str) * 255))}, 1));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("000000");
                sbLIZ.append(strJ4);
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "00000000";
            }
        }
    }), new Pair("popup_enter_type", new AbstractC1547800qNe() { // from class: X.0qNf
        @Override // X.AbstractC1547800qNe
        public final String LIZ() {
            return "transition_animation";
        }
    }));
}
