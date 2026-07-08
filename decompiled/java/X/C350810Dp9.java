package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Dp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350810Dp9 extends C350680Dow implements InterfaceC350850DpD {
    public NLETrackSlot LJ;
    public NLETrackSlot LJFF;
    public final long LJI;
    public final long LJII;

    @Override // X.InterfaceC350850DpD
    public final void LJJLJLI() {
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = this.LIZ.LLFII();
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ2 = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ2 == null || (nLETrackSlotLJJLIIIJLLLLLLLZ = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ()) == null || nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition() == null) {
            return;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLJJLIIIJLLLLLLLZ2.deepClone());
        long maxEnd = this.LIZ.Rn().getMaxEnd();
        interfaceC351350Dq1LLFII.LLJILLL(new C350820DpA("", -1, "", 0L, false, null, null, null, 1008), EnumC356070Dxd.NONE);
        LJLLILLLL(nLEModelDynamicCast, nLETrackSlotDynamicCast, this.LIZ);
        if (this.LIZ.Rn().getMaxEnd() > maxEnd) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            C0E48 c0e48 = this.LIZ;
            c351510DqH.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e48);
        }
    }

    public final long LLJJIJI() {
        NLETrackSlot nLETrackSlot = this.LJ;
        if (nLETrackSlot == null || this.LJFF == null) {
            return 0L;
        }
        long duration = nLETrackSlot.getDuration() > this.LJFF.getDuration() ? this.LJFF.getDuration() / ((long) 2) : this.LJ.getDuration() / ((long) 2);
        long j = this.LJII;
        return duration > j ? j : duration;
    }

    @Override // X.InterfaceC350850DpD
    public final NLETrackSlot LJIILL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC350850DpD
    public final NLETrackSlot LJJLIIIJLLLLLLLZ() {
        return this.LJ;
    }

    public C350810Dp9(C0E48 c0e48) {
        super(c0e48);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.toMicros(1000L);
        this.LJI = timeUnit.toMicros(100L);
        this.LJII = timeUnit.toMicros(Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJIJIIJI(long j) {
        NLESegmentTransition endTransition;
        long j2;
        this.LIZ.Rn();
        NLETrackSlot nLETrackSlot = this.LJ;
        if (nLETrackSlot != null) {
            long measuredEndTime = nLETrackSlot.getMeasuredEndTime();
            NLETrackSlot nLETrackSlot2 = this.LJ;
            if (nLETrackSlot2 != null) {
                endTransition = nLETrackSlot2.getEndTransition();
            } else {
                endTransition = null;
            }
            if (C347020Dj2.LIZ(endTransition)) {
                j2 = j;
            } else {
                j2 = j / ((long) 2);
            }
            long j3 = measuredEndTime - j2;
            long j4 = 30000;
            this.LIZLLL.LJJIIZI(j3 - j4, j + j3 + j4, false, true);
        }
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        this.LJ = nLETrackSlot;
        this.LJFF = nLETrackSlot2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    @Override // X.InterfaceC350850DpD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(X.C350820DpA r15, X.EnumC356070Dxd r16) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350810Dp9.LJJLIIIJILLIZJL(X.0DpA, X.0Dxd):void");
    }

    @Override // X.InterfaceC350850DpD
    public final void LJLJLJ(long j, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlot2 = this.LJ;
        if (nLETrackSlot2 != null) {
            NLESegmentTransition endTransition = nLETrackSlot2.getEndTransition();
            if (endTransition != null) {
                long transitionDuration = j - endTransition.getTransitionDuration();
                endTransition.setTransitionDuration(j);
                this.LIZ.Rn().timeSort();
                if (C347020Dj2.LIZ(endTransition)) {
                    C350110Do1.LJFF(LLZ());
                    C0E48 c0e48 = this.LIZ;
                    VecNLETrackSlotSPtr sortedSlots = c0e48.Rn().getSortedSlots();
                    if (sortedSlots != null && sortedSlots.indexOf(nLETrackSlot2) >= 0) {
                        if (transitionDuration > 0) {
                            C350690Dox.LIZ(0L, c0e48.Rn(), nLETrackSlot2);
                        } else {
                            C350690Dox.LIZLLL(c0e48.Rn(), nLETrackSlot2);
                        }
                        NLETrack nLETrackRn = c0e48.Rn();
                        VecNLETrackSlotSPtr sortedSlots2 = nLETrackRn.getSortedSlots();
                        if (sortedSlots2 != null) {
                            int iIndexOf = sortedSlots2.indexOf(nLETrackSlot2);
                            VecNLETrackSlotSPtr sortedSlots3 = nLETrackRn.getSortedSlots();
                            if (sortedSlots3 != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(iIndexOf + 1, sortedSlots3)) != null) {
                                if (transitionDuration > 0) {
                                    C350690Dox.LIZJ(0L, c0e48.Rn(), nLETrackSlot);
                                } else {
                                    C350690Dox.LJ(0L, c0e48.Rn(), nLETrackSlot);
                                }
                            }
                        }
                    }
                }
                LLJJ(null, enumC356070Dxd);
            }
            nLETrackSlot2.setExtra("ep_transition_cache_duration", String.valueOf(j));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    @Override // X.InterfaceC350850DpD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILLL(X.C350820DpA r7, X.EnumC356070Dxd r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350810Dp9.LLJILLL(X.0DpA, X.0Dxd):void");
    }

    @Override // X.InterfaceC350850DpD
    public final void LJLLILLLL(NLEModel nLEModel, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        TrackLinkageManagerProvider.Companion.getClass();
        AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
        if (businessTrackLinkageManager != null) {
            businessTrackLinkageManager.LIZJ(new C349510Dn3("transition", C1697810uHb.LJ(new C349470Dmz(nLETrackSlot, nLETrackSlotLJJLIIIJLLLLLLLZ, null, null, 28)), nLEModel));
        }
    }
}
