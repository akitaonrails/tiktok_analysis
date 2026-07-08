package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1071760dzq extends AbstractC1223210hw7 {
    public final C1071220dyy LIZIZ;
    public final Integer LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(491));
    public Integer LJ;

    public Map<String, String> LJ() {
        if (this.LIZIZ.LIZ.LIZLLL.LIZ != EnumC1070340dxY.FACEBOOK) {
            return null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Boolean boolLJII = C1076010e6h.LIZJ.LJII().LJII(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("fb_token_expired", boolLJII != null ? AbstractC1223210hw7.LIZJ(boolLJII.booleanValue()) : null);
        c2344009Gk.LJ(this.LIZJ, "server_fb_token");
        return c2344009Gk.LIZ;
    }

    public final String LJFF() {
        C1071220dyy c1071220dyy = this.LIZIZ;
        C1071260dz2 c1071260dz2 = c1071220dyy.LIZIZ.LIZ;
        if (c1071260dz2.LIZ) {
            if (!c1071260dz2.LIZIZ) {
                return "uid";
            }
            "wrong initStatus for auth pipeline".toString();
            throw new IllegalStateException("wrong initStatus for auth pipeline");
        }
        if (!c1071260dz2.LIZIZ) {
            return "both";
        }
        int i = C1071750dzp.LIZ[c1071220dyy.LIZ.LIZLLL.LIZ.ordinal()];
        if (i == 1 || i == 2) {
            return "token";
        }
        if (i == 3) {
            return "did";
        }
        "wrong relationAuthPlatform".toString();
        throw new IllegalStateException("wrong relationAuthPlatform");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJI() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1071760dzq.LJI():java.util.Map");
    }

    public final Map<String, String> LJII() {
        RelationFreqControlData relationFreqControlData;
        Bundle bundle = this.LIZIZ.LIZ.LJI;
        if (bundle == null || (relationFreqControlData = (RelationFreqControlData) bundle.getParcelable("freq_data_before_pipeline")) == null) {
            return C2097608Jq.LJ();
        }
        Bundle bundle2 = this.LIZIZ.LIZ.LJI;
        if (bundle2 == null || !bundle2.getBoolean("is_passive_pop_up")) {
            return null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(relationFreqControlData.totalPopupCount, "total_pop_up_count");
        return c2344009Gk.LIZ;
    }

    public AbstractC1071760dzq(C1071220dyy c1071220dyy, Integer num) {
        this.LIZIZ = c1071220dyy;
        this.LIZJ = num;
    }
}
