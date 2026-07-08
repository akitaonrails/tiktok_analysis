package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EffectShowModel;
import com.ss.android.ugc.aweme.utils.ParcelableConcurrentSet;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661470tKz implements InterfaceC1449160noY {
    public final EffectShowModel LIZ;
    public final CreativeModel LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 947));

    public C1661470tKz(EffectShowModel effectShowModel, CreativeModel creativeModel) {
        this.LIZ = effectShowModel;
        this.LIZIZ = creativeModel;
    }

    @Override // X.InterfaceC1449160noY
    public final boolean LIZ(String str, String str2, String str3, String str4, String str5) {
        ParcelableConcurrentSet parcelableConcurrentSet = (ParcelableConcurrentSet) this.LIZJ.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZIZ.creativeInfo.getCreationId());
        sb.append("_");
        sb.append(str3);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(str);
        if (Intrinsics.LJFF(str2, "sticker_category:favorite")) {
            sb.append("_");
            sb.append(str4);
        }
        sb.append("_");
        sb.append(str5);
        boolean zLIZ = parcelableConcurrentSet.LIZ(sb.toString());
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShow, id = ");
        sbLIZ.append(str);
        sbLIZ.append(", tabKey = ");
        sbLIZ.append(str2);
        sbLIZ.append(", isDefaultOnShootPage = ");
        sbLIZ.append(str3);
        sbLIZ.append(", customType = ");
        sbLIZ.append(str4);
        sbLIZ.append(", effectRequestLogId = ");
        sbLIZ.append(str5);
        sbLIZ.append(", result = ");
        sbLIZ.append(zLIZ);
        C201955140j.LIZLLL(c20012313Rx, "EffectShowRepo", C2188811AlT.LIZIZ(sbLIZ));
        return zLIZ;
    }
}
