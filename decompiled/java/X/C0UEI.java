package X;

import Y.ARunnableS81S0200000_12;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UEI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEI implements C0U45 {
    public long LIZ;
    public long LIZJ;
    public Function1<? super LiveEffect, Unit> LJ;
    public long LIZIZ = -1;
    public String LIZLLL = "";

    @Override // X.C0U45
    public final void LIZ(LiveEffect liveEffect) {
        boolean z;
        if (liveEffect == null) {
            return;
        }
        if (this.LIZ != 0) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            C0UC4.LJJ(C0UEH.LIZIZ, liveEffect, true, System.currentTimeMillis() - this.LIZ, this.LIZIZ, -1, "", null, this.LIZLLL);
        }
        if (C0UEH.LJII == this.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (z && Intrinsics.LJFF(liveEffect.getResourceId(), C0UEH.LJIIL) && !Intrinsics.LJFF(C0UEH.LJIIIIZZ, Boolean.FALSE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download effect success, apply effect, resourceId is ");
            sbLIZ.append(liveEffect.getResourceId());
            C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS81S0200000_12(liveEffect, this, 111));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("download effect success, not apply effect, isGuest is ");
        sbLIZ2.append(C0UEH.LJIIIIZZ);
        sbLIZ2.append(", currentRoomId is ");
        sbLIZ2.append(C0UEH.LJII);
        sbLIZ2.append(", roomId is ");
        sbLIZ2.append(this.LIZJ);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C0U45
    public final void LIZJ(LiveEffect liveEffect) {
        String resourceId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart download effect, resourceId is ");
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = System.currentTimeMillis();
    }

    @Override // X.C0U45
    public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
        String resourceId;
        Integer numValueOf;
        String msg;
        Integer numValueOf2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download effect fail, resourceId is ");
        String msg2 = null;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        sbLIZ.append(", errorCode is ");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", msg is ");
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        C0UEH.LJIIL = null;
        C0UC4 c0uc4 = C0UC4.LIZ;
        DataChannel dataChannel = C0UEH.LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        long j = this.LIZIZ;
        if (exceptionResult != null) {
            numValueOf2 = Integer.valueOf(exceptionResult.getErrorCode());
            msg2 = exceptionResult.getMsg();
        } else {
            numValueOf2 = null;
        }
        C0UC4.LJJ(dataChannel, liveEffect, false, jCurrentTimeMillis, j, numValueOf2, msg2, null, this.LIZLLL);
    }

    @Override // X.C0U45
    public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
        this.LIZIZ = j;
    }
}
