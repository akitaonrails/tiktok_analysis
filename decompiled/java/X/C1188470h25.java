package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;

/* JADX INFO: renamed from: X.0h25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188470h25 {
    public static final PoiAnchorExtra LIZ(Aweme aweme) {
        String extra;
        if (aweme == null) {
            return null;
        }
        C1188460h24.LIZ.getClass();
        AnchorCommonStruct anchorCommonStructLIZ = C1188460h24.LIZ(aweme);
        if (anchorCommonStructLIZ != null && (extra = anchorCommonStructLIZ.getExtra()) != null) {
            try {
                Object objFromJson = GsonProtectorUtils.fromJson(C2365509Or.LIZ(), extra, C2371409Qy.LIZJ(C13LE.LJII(PoiAnchorExtra.class)));
                if (!(objFromJson instanceof PoiAnchorExtra)) {
                    objFromJson = null;
                }
                return (PoiAnchorExtra) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
