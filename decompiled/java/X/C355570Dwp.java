package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355570Dwp {
    public final C19EG LIZ;
    public final C0E48 LIZIZ;
    public boolean LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C361270EEj LIZIZ() {
        /*
            r18 = this;
            r6 = r18
            X.0E48 r0 = r6.LIZIZ
            r12 = 0
            if (r0 != 0) goto L8
            return r12
        L8:
            X.0E55 r0 = r0.getPlayer()
            long r13 = r0.Jh()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r10
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r6.LIZJ()
            r8 = 0
            if (r0 == 0) goto L3e
            java.util.List r0 = X.C348520DlS.LIZIZ(r0)
            if (r0 == 0) goto L3e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSortedSlots()
            X.C19719612Di.LJJI(r0, r2)
            goto L2a
        L3e:
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L72
            r13 = 0
            goto L72
        L45:
            java.util.Iterator r7 = r2.iterator()
        L49:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r5 = r7.next()
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r5 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r5
            long r0 = r5.getEndTime()
            long r0 = r0 - r13
            long r3 = java.lang.Math.abs(r0)
            r0 = 100
            long r1 = (long) r0
            long r1 = r1 * r10
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
            long r1 = r5.getStartTime()
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
            long r13 = r5.getEndTime()
        L72:
            boolean r0 = r6.LJ(r13)
            if (r0 == 0) goto L79
            return r12
        L79:
            long r15 = r6.LIZLLL(r13)
            int r0 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r0 >= 0) goto L82
            return r12
        L82:
            X.0EEj r9 = new X.0EEj
            X.0E6a r10 = X.EnumC359100E6a.GLOBAL_EFFECT
            X.0Dy5 r11 = X.EnumC356350Dy5.ADD
            r17 = 36
            r9.<init>(r10, r11, r12, r13, r15, r17)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355570Dwp.LIZIZ():X.0EEj");
    }

    public final NLEModel LIZJ() {
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 != null) {
            return C350870DpF.LJI(c0e48);
        }
        return null;
    }

    public final long LIZLLL(long j) {
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            NLEModel nLEModelLIZJ = LIZJ();
            if (nLEModelLIZJ == null) {
                return -1L;
            }
            long jLJII = C351220Dpo.LJII(nLEModelLIZJ) - j;
            if (jLJII / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
                C19EG c19eg = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131827574);
                C1390380mHk.LIZ(c19eg, 6007, creativeToastBuilder);
                return -1L;
            }
            return jLJII;
        }
        return Long.MAX_VALUE;
    }

    public final boolean LJ(long j) {
        List<NLETrack> listLJJIJLIJ;
        int layer;
        boolean z;
        NLEModel nLEModelLIZJ = LIZJ();
        Boolean boolValueOf = null;
        if (nLEModelLIZJ != null) {
            listLJJIJLIJ = C351220Dpo.LJJIJLIJ(nLEModelLIZJ);
        } else {
            listLJJIJLIJ = null;
        }
        if (listLJJIJLIJ != null) {
            if (!listLJJIJLIJ.isEmpty()) {
                loop0: for (NLETrack nLETrack : listLJJIJLIJ) {
                    if (!nLETrack.getSlots().isEmpty()) {
                        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                        if (!(slots instanceof Collection) || !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it2 = slots.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().getEndTime() > j) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return false;
        }
        if (listLJJIJLIJ != null && (!listLJJIJLIJ.isEmpty())) {
            layer = ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(listLJJIJLIJ)).getLayer() + 1;
        } else {
            layer = 0;
        }
        if (layer >= C356600DyU.LJ()) {
            C19EG c19eg = this.LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833284);
            C1390380mHk.LIZ(c19eg, 1059, creativeToastBuilder);
            return true;
        }
        return false;
    }

    public final Pair LIZ(NLETrackSlot nLETrackSlot, boolean z) {
        Pair<NLETrack, NLETrackSlot> pairLIZIZ;
        C0E55 player;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.LIZIZ;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            pairLIZIZ = interfaceC351350Dq1LLFII.LIZIZ(nLETrackSlot, EnumC356070Dxd.NONE);
        } else {
            pairLIZIZ = null;
        }
        NLEModel nLEModelLIZJ = LIZJ();
        if (nLEModelLIZJ != null) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLETrackType nLETrackType = NLETrackType.EFFECT;
            c351510DqH.getClass();
            C351510DqH.LJIIJJI(nLEModelLIZJ, nLETrackType, "");
        }
        if (!z) {
            C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
            C0E48 c0e482 = this.LIZIZ;
            if (c0e482 != null) {
                C350870DpF.LIZJ(c0e482, C051R.LIZIZ(c0e1x));
            }
        } else {
            C0E48 c0e483 = this.LIZIZ;
            if (c0e483 != null) {
                C350870DpF.LIZ(c0e483, false);
            }
        }
        C0E48 c0e484 = this.LIZIZ;
        if (c0e484 != null && (player = c0e484.getPlayer()) != null) {
            player.pause(false);
        }
        if (pairLIZIZ == null) {
            return new Pair(null, null);
        }
        return pairLIZIZ;
    }

    public C355570Dwp(C19GS c19gs, C0E48 c0e48, boolean z) {
        this.LIZ = c19gs;
        this.LIZIZ = c0e48;
        this.LIZJ = z;
    }
}
