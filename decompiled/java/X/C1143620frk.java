package X;

import com.bytedance.android.livesdk.gift.model.TransitionConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0frk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143620frk {
    public final C1118830fDl LIZ;
    public final List<TransitionConfig> LIZIZ;
    public final InterfaceC1143640frm LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigFlyingPathModel(giftTrayShowInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pathAnimation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1143620frk(C1118830fDl c1118830fDl, List<TransitionConfig> list, InterfaceC1143640frm interfaceC1143640frm) {
        this.LIZ = c1118830fDl;
        this.LIZIZ = list;
        this.LIZJ = interfaceC1143640frm;
    }
}
