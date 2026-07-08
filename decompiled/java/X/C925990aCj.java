package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.MGEnterActionInfo;

/* JADX INFO: renamed from: X.0aCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925990aCj {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final InterfaceC926150aCz LIZJ;
    public final InterfaceC925430aBp LIZLLL;

    public final void LIZ(AbstractC926030aCn abstractC926030aCn) {
        int i;
        Integer numValueOf;
        int i2;
        Integer numValueOf2;
        String simpleName = abstractC926030aCn.getClass().getSimpleName();
        C926050aCp c926050aCp = abstractC926030aCn.LIZJ;
        if (c926050aCp == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute cmd=");
            sbLIZ.append(simpleName);
            sbLIZ.append(" snapshot=null");
            C20441214yg.LIZIZ("MGEnterActionExecutorV2", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("execute cmd=");
            sbLIZ2.append(simpleName);
            sbLIZ2.append(" enterAction=");
            MGEnterActionInfo mGEnterActionInfo = c926050aCp.LIZ;
            int i3 = 0;
            if (mGEnterActionInfo != null) {
                i = mGEnterActionInfo.enterAction;
            } else {
                i = 0;
            }
            sbLIZ2.append(C926070aCr.LIZ(i));
            sbLIZ2.append('(');
            MGEnterActionInfo mGEnterActionInfo2 = c926050aCp.LIZ;
            Integer numValueOf3 = null;
            if (mGEnterActionInfo2 != null) {
                numValueOf = Integer.valueOf(mGEnterActionInfo2.enterAction);
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(") enterActionReason=");
            MGEnterActionInfo mGEnterActionInfo3 = c926050aCp.LIZ;
            if (mGEnterActionInfo3 != null) {
                i2 = mGEnterActionInfo3.enterActionReason;
            } else {
                i2 = 0;
            }
            sbLIZ2.append(C926070aCr.LIZIZ(i2));
            sbLIZ2.append('(');
            MGEnterActionInfo mGEnterActionInfo4 = c926050aCp.LIZ;
            if (mGEnterActionInfo4 != null) {
                numValueOf2 = Integer.valueOf(mGEnterActionInfo4.enterActionReason);
            } else {
                numValueOf2 = null;
            }
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(") enterActionSourceRole=");
            MGEnterActionInfo mGEnterActionInfo5 = c926050aCp.LIZ;
            if (mGEnterActionInfo5 != null) {
                i3 = mGEnterActionInfo5.enterActionSourceRole;
            }
            sbLIZ2.append(C926070aCr.LIZJ(i3));
            sbLIZ2.append('(');
            MGEnterActionInfo mGEnterActionInfo6 = c926050aCp.LIZ;
            if (mGEnterActionInfo6 != null) {
                numValueOf3 = Integer.valueOf(mGEnterActionInfo6.enterActionSourceRole);
            }
            sbLIZ2.append(numValueOf3);
            sbLIZ2.append(") shareIntent=");
            sbLIZ2.append(c926050aCp.LJ);
            sbLIZ2.append(" inviterUserId=");
            sbLIZ2.append(c926050aCp.LJII);
            sbLIZ2.append(" originLinkmicId=");
            sbLIZ2.append(c926050aCp.LJIIJJI);
            C20441214yg.LIZIZ("MGEnterActionExecutorV2", C2188811AlT.LIZIZ(sbLIZ2));
        }
        LIZJ("preDo", new AwS559S0100000_15(abstractC926030aCn, 1053));
        LIZJ("core", new AwS416S0200000_15(this, abstractC926030aCn, 105));
        LIZJ("postDo", new AwS559S0100000_15(abstractC926030aCn, 1054));
    }

    public final void LIZIZ(int i) {
        C926050aCp c926050aCpLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postOpenApplyEvent: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MGEnterActionExecutorV2", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
        if (interfaceC925800aCQLIZIZ != null) {
            c926050aCpLJ = interfaceC925800aCQLIZIZ.LJ();
        } else {
            c926050aCpLJ = null;
        }
        dataChannel.LC0(GuestApplyEvent.class, new C925770aCN(null, 0, i, false, 0, false, 0, 0L, null, 0L, c926050aCpLJ, 4091));
    }

    public static void LIZJ(String str, Function0 function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute ");
            sbLIZ.append(str);
            sbLIZ.append(" failed: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("MGEnterActionExecutorV2", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C925990aCj(DataChannel dataChannel, Room room, C926160aD0 c926160aD0) {
        InterfaceC925430aBp interfaceC925430aBpLIZ = C925970aCh.LIZ();
        this.LIZ = dataChannel;
        this.LIZIZ = room;
        this.LIZJ = c926160aD0;
        this.LIZLLL = interfaceC925430aBpLIZ;
    }
}
