package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0L7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537770L7f implements C0LDD {
    @Override // X.C0LDD
    public final String getTag() {
        return "CameraLayoutMediaDurationStrategy_MinDuration";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // X.C0LDD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r7) {
        /*
            r6 = this;
            java.util.List r0 = X.C13LP.LJJJJLI(r7)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L53
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r1 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r1
            boolean r0 = r1.LJIILJJIL()
            if (r0 == 0) goto L4d
            long r0 = r1.duration
        L23:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L27:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r1 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r1
            boolean r0 = r1.LJIILJJIL()
            if (r0 == 0) goto L47
            long r0 = r1.duration
        L3b:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r4.compareTo(r1)
            if (r0 <= 0) goto L27
            r4 = r1
            goto L27
        L47:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L3b
        L4d:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L23
        L53:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5f
        L59:
            if (r4 == 0) goto L53
            long r0 = r4.longValue()
        L5f:
            long r0 = java.lang.Math.min(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537770L7f.LIZ(java.util.List):long");
    }

    @Override // X.C0LDD
    public final void LIZIZ(NLEModel nLEModel) {
        Long l;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        Long lValueOf;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack != null && (lValueOf = Long.valueOf(nLETrack.getDuration())) != null) {
                arrayList.add(lValueOf);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Long lValueOf2 = Long.valueOf(((Number) it2.next()).longValue());
            loop1: while (true) {
                l = lValueOf2;
                while (it2.hasNext()) {
                    lValueOf2 = Long.valueOf(((Number) it2.next()).longValue());
                    if (l.compareTo(lValueOf2) > 0) {
                        break;
                    }
                }
            }
            if (l != null) {
                long jLongValue = l.longValue();
                C201955140j.LJIILL(C201967140v.LIZIZ, "CameraLayoutMediaDurationStrategy_MinDuration", "processMediaList: minDuration = " + jLongValue);
                Iterator it3 = ((ArrayList) C13LP.LJJJJLI(nLEModel.getTracks())).iterator();
                while (it3.hasNext()) {
                    for (NLETrackSlot nLETrackSlot : ((NLETrack) it3.next()).getSlots()) {
                        nLETrackSlot.setEndTime(jLongValue);
                        try {
                            NLESegment mainSegment = nLETrackSlot.getMainSegment();
                            if (mainSegment != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) != null) {
                                nLESegmentVideoDynamicCast.setTimeClipEnd(jLongValue);
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    nLEModel.setDuration(jLongValue);
                }
            }
        }
    }
}
