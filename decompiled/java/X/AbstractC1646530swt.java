package X;

import a6n.a;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import lnn.q;

/* JADX INFO: renamed from: X.0swt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1646530swt implements InterfaceC1653190t7d {
    public static final List<String> LL = C1697810uHb.LJIIJJI("record_mode_live", "record_mode_mv", "AISelf");

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    public static void LIZ(C1646490swp c1646490swp, a aVar) {
        q value;
        boolean z = !C13LP.LJJJJ(c1646490swp.LJ, LL);
        if (aVar.LJIILJJIL != null && c1646490swp.LIZIZ && z && (value = aVar.LJ().getValue()) != null) {
            C1624010sMZ.LJIIIIZZ(null, EnumC1448980noG.RECOVER, value, aVar.LJIILJJIL);
        }
    }

    public static void LIZIZ(C1646490swp c1646490swp, a aVar) {
        Object obj;
        Effect effectLLILIL;
        String str;
        C1647390syH c1647390syH = c1646490swp.LIZJ;
        if (c1647390syH != null) {
            obj = c1647390syH.LIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        if (!C13LP.LJJJJ(obj, LL)) {
            q value = aVar.LJ().getValue();
            if (value != null) {
                effectLLILIL = value.C0().LLILIL();
            } else {
                effectLLILIL = null;
            }
            aVar.LJIILJJIL = effectLLILIL;
            q value2 = aVar.LJ().getValue();
            if (value2 != null) {
                Bundle bundle = new Bundle();
                List<String> list = C579450Mo3.LIZ;
                if (C579450Mo3.LIZ(aVar.LIZLLL())) {
                    str = "carousel_change_tab";
                } else {
                    str = "panel_change_tab";
                }
                C786410Ut5.LJJJI("action_type", str, bundle);
                C1624010sMZ.LJIIIIZZ(bundle, null, value2, null);
            }
        }
    }
}
