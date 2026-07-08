package X;

import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkAnchorIdSubscribeData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0J5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC486310J5h extends C0J66<C486280J5e, BaseDownlinkData> {
    public final String LJ;
    public final Set<String> LJFF;

    @Override // X.C0J66
    public final boolean LJIIIZ() {
        return true;
    }

    public final List<UplinkModel<UplinkAnchorIdSubscribeData>> LJIIL() {
        String str = this.LJ;
        UplinkModel uplinkModelLIZIZ = C0J66.LIZIZ(this, str, str, new UplinkAnchorIdSubscribeData(this.LJFF));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append(" type = ");
        sbLIZ.append(uplinkModelLIZIZ.subType);
        sbLIZ.append(" data");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZJ, uplinkModelLIZIZ.data));
        C20441214yg.LIZIZ("AbsAnchorIdSubscribeScene", C2188811AlT.LIZIZ(sbLIZ));
        return Collections.singletonList(uplinkModelLIZIZ);
    }

    @Override // X.C0J66
    public final List<UplinkModel<?>> LJIIJJI() {
        return LJIIL();
    }

    @Override // X.C0J66
    public final Class<BaseDownlinkData> LJIIIIZZ() {
        return BaseDownlinkData.class;
    }

    public AbstractC486310J5h(String str) {
        super(new C486280J5e(null), str, null);
        this.LJ = str;
        this.LJFF = new LinkedHashSet();
    }

    @Override // X.C0J66
    public final List LJFF(C486280J5e c486280J5e) {
        Set<String> set = c486280J5e.LIZ;
        if (set != null) {
            this.LJFF.clear();
            this.LJFF.addAll(set);
        }
        return LJIIL();
    }
}
