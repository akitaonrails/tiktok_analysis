package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.SMBDecorationBoardsPermissionChannel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.host_board.DisplayPosition;

/* JADX INFO: renamed from: X.01uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C482301uH {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1631630sYr<Boolean, Integer, BoardItemPosition, C1814980xKa, Unit> LIZJ;
    public final Function2<Integer, C1814980xKa, Unit> LIZLLL;
    public final InterfaceC1631620sYq<Board, BoardItem, Boolean, C1814980xKa> LJ;
    public String LJFF;
    public C486401uw LJIIIZ;
    public final C01GW LJI = C452501pT.LIZIZ(new C486501ux());
    public final C01GW LJII = C452501pT.LIZIZ(new C486601uy());
    public final float LJIIIIZZ = C418440Gaw.LIZIZ(125);
    public final C482801uM LJIIJ = new C482801uM(this);

    public final void LIZIZ() {
        String str = this.LJFF;
        if (str != null) {
            String str2 = C336101Sd.LIZ;
            C482601uK c482601uK = new C482601uK(this, str);
            AnonymousClass0956 anonymousClass0956 = C336101Sd.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C336101Sd.LIZ = str;
            C336101Sd.LIZJ = C23250099c.LIZLLL(C336101Sd.LIZIZ, null, null, new C318701Ll(c482601uK, null), 3);
        }
    }

    public static String LIZ(DisplayPosition displayPosition) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pos[top=");
        sbLIZ.append(Long.valueOf(displayPosition.marginTop));
        sbLIZ.append(", align=");
        sbLIZ.append(Integer.valueOf(displayPosition.alignment));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482301uH.LIZLLL(java.lang.String):void");
    }

    public final void LIZJ(Board board, BoardItem boardItem, boolean z) {
        boolean z2;
        String str = boardItem.fullyCustomizedContent;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(z2))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("render: ");
        sbLIZ.append(boardItem.id);
        sbLIZ.append(" content:");
        sbLIZ.append(str);
        C20441214yg.LJ("BulletBoardRenderer", C2188811AlT.LIZIZ(sbLIZ));
        C486401uw c486401uw = new C486401uw(board, boardItem, str, z);
        this.LJIIIZ = c486401uw;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C1083460eIi.class, c486401uw);
        }
        String str2 = C758440Tp4.LIZIZ;
        if (!C500260Jjc.LJJIIZ(str2) && !C500260Jjc.LJJJIL(this.LIZ) && !C500260Jjc.LJIIZILJ(this.LIZ) && C500260Jjc.LJJLIIIIJ(this.LIZ) == null) {
            C20441214yg.LJ("BulletBoardRenderer", "title empty observeBulletTitle");
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.GQ2(this.LIZIZ, SMBDecorationBoardsPermissionChannel.class, this.LJIIJ);
            }
            DataChannel dataChannel3 = this.LIZ;
            if (dataChannel3 != null) {
                dataChannel3.EQ2(this.LIZIZ, SMBDecorationBoardsPermissionChannel.class, this.LJIIJ);
                return;
            }
            return;
        }
        LIZLLL(str2);
    }

    public C482301uH(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C1814930xKV c1814930xKV, C1814940xKW c1814940xKW, C487201v4 c487201v4) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c1814930xKV;
        this.LIZLLL = c1814940xKW;
        this.LJ = c487201v4;
    }
}
