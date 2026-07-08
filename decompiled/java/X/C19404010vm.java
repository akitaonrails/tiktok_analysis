package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import java.util.List;

/* JADX INFO: renamed from: X.10vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404010vm {
    public final String LIZ;
    public final String LIZIZ;
    public final List<ProfileNaviFeatureDataModel> LIZJ;

    public final int LIZ() {
        try {
            return CastIntegerProtector.parseInt(this.LIZ);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public C19404010vm(String str, String str2, List<ProfileNaviFeatureDataModel> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
