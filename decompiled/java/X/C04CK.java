package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;

/* JADX INFO: renamed from: X.04CK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C04CK extends AbstractC1748750vbl {
    @Override // X.AbstractC1748750vbl
    public void LJFF(LaneParams laneParams) {
        Object obj = this.LJFF.get((Object) "biz_type");
        if (obj != null) {
            laneParams.put("biz_type", obj);
        }
    }

    @Override // X.AbstractC1748750vbl
    public void LJI(LaneParams laneParams) {
        if (!laneParams.containsKey("EVENT_ORIGIN_FEATURE")) {
            laneParams.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        }
    }

    public C04CK(String str, String str2) {
        super(str, str2);
    }
}
