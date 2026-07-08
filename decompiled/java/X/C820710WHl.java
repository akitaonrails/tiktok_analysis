package X;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Locale;

/* JADX INFO: renamed from: X.0WHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C820710WHl extends AbstractC820720WHm {
    public C844770XBz LIZ;

    public Pair<String, Boolean> LIZIZ() {
        AdvertisingIdClient.Info infoLLLLLILLIL;
        boolean z;
        Context context = this.LIZ.LIZJ;
        String strLLLLLIL = null;
        if (!C10EU.LJIILIIL() || !C20123813oa.LIZ()) {
            infoLLLLLILLIL = C2204961BRm.LLLLLILLIL(context, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
            if (infoLLLLLILLIL == null) {
                z = false;
            }
            return new Pair<>(strLLLLLIL, Boolean.valueOf(z));
        }
        infoLLLLLILLIL = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        strLLLLLIL = C2204961BRm.LLLLLIL(infoLLLLLILLIL, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
        z = infoLLLLLILLIL.LIZIZ;
        return new Pair<>(strLLLLLIL, Boolean.valueOf(z));
    }

    public String LIZJ() {
        return C2204961BRm.LLIIJLIL(this.LIZ.LJJIIJZLJL, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
    }

    public String LIZLLL() {
        return C2204961BRm.LLIIL(this.LIZ.LJJIIJZLJL, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
    }

    public String LJ() {
        return C2204961BRm.LLIIZ(this.LIZ.LJJIIJZLJL, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
    }

    public String LIZ() {
        return C2204961BRm.g0(Locale.getDefault(), new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kzmNDKuiaZrPkgXR3+xIh0SMsCiXV1/HfgN3lgNXFw/p7f7SMQ==", null));
    }
}
