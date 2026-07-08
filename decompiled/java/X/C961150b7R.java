package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0b7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961150b7R {
    public DataChannel LIZ;
    public boolean LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public Function0<Unit> LJFF;
    public Function0<Unit> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHostInviteListHeadViewConfig(showInvitePanelTitle = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" showCompressInvitePanelTitle = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" showExtendInvitePanelTitle = ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" inviteListScrollState = ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
