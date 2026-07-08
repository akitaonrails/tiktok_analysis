package X;

import com.bytedance.aigc.proto.Level;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C542820LQq implements C0LSL {
    public final Map<String, Float> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(34));
    public List<Pair<String, Float>> LIZJ = C13BV.INSTANCE;
    public int LIZLLL = -1;
    public long LJ;
    public float LJFF;

    @Override // X.C0LSL
    public Long LIZLLL(long j) {
        return null;
    }

    public String LJI() {
        return "DefaultProgressStrategy";
    }

    @Override // X.C0LSL
    public final long LIZ() {
        return TimeUnit.MINUTES.toSeconds(LJFF().pollingLimitMinutes);
    }

    public AICreationGenerateConfigExp.AICreationGenerateConfig LJFF() {
        return (AICreationGenerateConfigExp.AICreationGenerateConfig) this.LIZIZ.getValue();
    }

    public C542820LQq(Map<String, Float> map) {
        this.LIZ = map;
    }

    @Override // X.C0LSL
    public final void LJ(List<? extends C0LRS<C09JG, AbsTaskOutput>> list) {
        C0LTN c0ltnLIZLLL;
        String strLJIL;
        float fFloatValue;
        ArrayList arrayList = new ArrayList();
        for (C0LRS c0lrs : (ArrayList) list) {
            if (c0lrs != null && (c0ltnLIZLLL = c0lrs.LIZLLL()) != null && (strLJIL = c0ltnLIZLLL.LJIL()) != null) {
                Float f = this.LIZ.get(strLJIL);
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                arrayList.add(new Pair(strLJIL, Float.valueOf(fFloatValue)));
            }
        }
        C542840LQs c542840LQs = C542840LQs.LIZIZ;
        String strLJI = LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("progressStages=");
        sbLIZ.append(arrayList);
        C201955140j.LIZLLL(c542840LQs, strLJI, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = arrayList;
    }

    @Override // X.C0LSL
    public final int LIZJ(C0LSZ c0lsz, C0LSZ c0lsz2) {
        int i;
        float fMax;
        String string;
        String str = C0LMH.LIZ;
        String strLIZ = C0LMH.LIZ(c0lsz.LJI);
        Iterator<Pair<String, Float>> it2 = this.LIZJ.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getFirst(), strLIZ)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = 100;
        if (i2 == -1) {
            fMax = c0lsz.LJII + 0.05f;
        } else {
            Iterator it3 = C13LP.LL(this.LIZJ, i2).iterator();
            double dFloatValue = 0.0d;
            while (it3.hasNext()) {
                dFloatValue += (double) ((Number) ((Pair) it3.next()).getSecond()).floatValue();
            }
            float fFloatValue = ((Number) ((Pair) ListProtector.get(this.LIZJ, i2)).getSecond()).floatValue();
            if (c0lsz2 != null) {
                i = c0lsz2.LJII;
            } else {
                i = 0;
            }
            fMax = (float) ((dFloatValue * ((double) 100)) + ((double) (i * fFloatValue)));
        }
        if (LJFF().progressStillAddition) {
            fMax = Math.max(fMax, c0lsz.LJII);
        }
        if (!Intrinsics.LJFF(c0lsz.LJ, "FINISHED")) {
            i3 = 99;
        }
        int iLJ = C13LZ.LJ((int) Math.ceil(fMax), 0, i3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!C1906580ziK.LJI()) {
            int i4 = this.LIZLLL;
            if (i4 == -1) {
                this.LIZLLL = iLJ;
                this.LJ = jCurrentTimeMillis;
            } else {
                if (iLJ != i4) {
                    this.LIZLLL = iLJ;
                    this.LJ = jCurrentTimeMillis;
                    return iLJ;
                }
                long j = (jCurrentTimeMillis - this.LJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (j >= LJFF().progressStuckCheckIntervalSeconds) {
                    this.LJFF += j;
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = new Pair("progress", String.valueOf(iLJ));
                    if (c0lsz2 == null || (string = Integer.valueOf(c0lsz2.LJII).toString()) == null) {
                        string = "";
                    }
                    pairArr[1] = new Pair("child_progress", string);
                    pairArr[2] = new Pair("total_stuck_seconds", String.valueOf(this.LJFF));
                    String str2 = C0LMH.LIZ;
                    pairArr[3] = new Pair("step", C0LMH.LIZ(c0lsz.LJI));
                    pairArr[4] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0lsz.LJ);
                    pairArr[5] = new Pair("check_interval", String.valueOf(LJFF().progressStuckCheckIntervalSeconds));
                    pairArr[6] = new Pair("trace_id", c0lsz.LIZ);
                    Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    IAICreationTrace iAICreationTraceLIZ = C542850LQt.LIZ();
                    if (iAICreationTraceLIZ != null) {
                        iAICreationTraceLIZ.LIZIZ("progress_stuck", mapLJIIIIZZ, c0lsz, Level.WARN);
                    }
                    this.LJ = jCurrentTimeMillis;
                    return iLJ;
                }
            }
        }
        return iLJ;
    }

    @Override // X.C0LSL
    public Integer LIZIZ(float f, int i, int i2) {
        if (i != 1) {
            if (i == 2) {
                i2 = Math.min((int) (((double) 10) + (((double) f) * 0.9d)), 99);
            }
        } else {
            i2 = 10;
        }
        return Integer.valueOf(Math.min(i2, 100));
    }
}
