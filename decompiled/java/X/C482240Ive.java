package X;

import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.android.livesdk.signaling.model.downlink.CacheUpdateUploadData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkRoomCacheUpdateData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkRoomCacheUpdateData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ive, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482240Ive extends C0J66<C00EE, DownlinkRoomCacheUpdateData> {
    public C482240Ive() {
        super(new C00EE(new ArrayList(), 2), "enter_boost", Collections.singletonList("enter_boost"));
    }

    @Override // X.C0J66
    public final Class<DownlinkRoomCacheUpdateData> LJIIIIZZ() {
        return DownlinkRoomCacheUpdateData.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J66
    public final List LJFF(C00EE c00ee) {
        Set setLLIIJI;
        C00EE c00ee2 = c00ee;
        List<String> list = c00ee2.LIZ;
        ((C00EE) this.LIZIZ).LIZ = list;
        if (list != null) {
            setLLIIJI = C13LP.LLIIJI(list);
        } else {
            setLLIIJI = null;
        }
        UplinkModel uplinkModelLIZIZ = C0J66.LIZIZ(this, "enter_boost", "enter_boost", new UplinkRoomCacheUpdateData(setLLIIJI));
        if (c00ee2.LIZIZ != null && (!r0.isEmpty())) {
            T t = uplinkModelLIZIZ.data;
            if (t != 0) {
                t.setUploadData(GsonProtectorUtils.toJson(C293501Bt.LIZ(), new CacheUpdateUploadData(c00ee2.LIZIZ)));
            }
            T t2 = uplinkModelLIZIZ.data;
            if (t2 != 0) {
                t2.setNeedResp(true);
            }
        }
        return Collections.singletonList(uplinkModelLIZIZ);
    }
}
