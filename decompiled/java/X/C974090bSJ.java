package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: renamed from: X.0bSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974090bSJ {
    public final InterfaceC974170bSR LIZ;
    public final LiveWidget LIZIZ;
    public final String LIZJ;
    public final EnumC962960bAM LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowChooseModePanelParams(launcherCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ownerWidget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C974090bSJ(C974010bSB c974010bSB, MultiMatchAnchorWidget multiMatchAnchorWidget, String str, EnumC962960bAM enumC962960bAM) {
        this.LIZ = c974010bSB;
        this.LIZIZ = multiMatchAnchorWidget;
        this.LIZJ = str;
        this.LIZLLL = enumC962960bAM;
    }
}
