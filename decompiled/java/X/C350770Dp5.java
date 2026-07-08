package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350770Dp5 extends C350680Dow implements InterfaceC351130Dpf {
    public final C01GW LJ;

    public final boolean LLJJIJIIJIL() {
        return ((Boolean) this.LJ.getValue()).booleanValue();
    }

    public C350770Dp5(C0E48 c0e48) {
        super(c0e48);
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(c0e48, 1677));
    }

    @Override // X.InterfaceC351130Dpf
    public final void LIZ(C350800Dp8 c350800Dp8) {
        NLEVideoAnimation next;
        NLETrackSlot nLETrackSlotLIZLLL;
        C355090Dw3.LIZIZ("AnimationHandler", "real::playAnimation");
        if (!LLJJIJIIJIL()) {
            NLETrack trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(c350800Dp8.LIZ);
            if (trackBySlot != null && trackBySlot.getMainTrack() && (nLETrackSlotLIZLLL = C350700Doy.LIZLLL(C350870DpF.LJI(this.LIZ), c350800Dp8.LIZ, c350800Dp8.LIZIZ)) != null) {
                this.LIZ.getPlayer().LJIJI(nLETrackSlotLIZLLL.getStartTime(), new C0FX2(this, nLETrackSlotLIZLLL, 15));
                return;
            }
            return;
        }
        Iterator<NLEVideoAnimation> it2 = c350800Dp8.LIZ.getVideoAnims().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getExtra("anim_type"), c350800Dp8.LIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEVideoAnimation nLEVideoAnimation = next;
        if (nLEVideoAnimation == null) {
            return;
        }
        C350870DpF.LJI(this.LIZ).getTrackBySlot(c350800Dp8.LIZ);
        long measuredStartTime = c350800Dp8.LIZ.getMeasuredStartTime() + nLEVideoAnimation.getStartTime();
        if (nLEVideoAnimation.getDuration() <= 0) {
            return;
        }
        this.LIZLLL.LJJIIZI(measuredStartTime, measuredStartTime + nLEVideoAnimation.getDuration(), false, true);
    }

    @Override // X.InterfaceC351130Dpf
    public final void LIZJ(C350790Dp7 c350790Dp7, EnumC356070Dxd enumC356070Dxd) {
        NLETrack trackBySlot;
        C355090Dw3.LIZIZ("AnimationHandler", "real::updateAnimDuration");
        if (!LLJJIJIIJIL() && ((trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(c350790Dp7.LIZ)) == null || !trackBySlot.getMainTrack())) {
            return;
        }
        NLETrackSlot nLETrackSlot = c350790Dp7.LIZ;
        C351510DqH c351510DqH = C351510DqH.LIZ;
        String str = c350790Dp7.LIZIZ;
        c351510DqH.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        if (nLEVideoAnimationLJIJ != null) {
            nLEVideoAnimationLJIJ.setStartTime(c350790Dp7.LIZJ);
            nLEVideoAnimationLJIJ.setEndTime(c350790Dp7.LIZLLL);
        }
        if (!LLJJIJIIJIL()) {
            C350700Doy.LJIIIIZZ(C350870DpF.LJI(this.LIZ), nLETrackSlot, c350790Dp7.LIZIZ);
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final void LJ(C350650Dot c350650Dot, EnumC356070Dxd enumC356070Dxd) {
        NLETrack trackBySlot;
        if (!LLJJIJIIJIL() && ((trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(c350650Dot.LIZ)) == null || !trackBySlot.getMainTrack())) {
            return;
        }
        NLETrackSlot nLETrackSlot = c350650Dot.LIZ;
        C351510DqH c351510DqH = C351510DqH.LIZ;
        String str = c350650Dot.LIZIZ;
        c351510DqH.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        if (nLEVideoAnimationLJIJ != null) {
            nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIJ);
        }
        if (!LLJJIJIIJIL()) {
            C350700Doy.LIZIZ(C350870DpF.LJI(this.LIZ), nLETrackSlot, c350650Dot.LIZIZ);
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final NLETrackSlot LJIIJJI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        String strLJIIZILJ;
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        int i;
        NLETrackSlot nLETrackSlot2;
        NLEVideoAnimation nLEVideoAnimationDynamicCast;
        long jLongValue;
        Long lLJIILIIL;
        NLETrackSlot nLETrackSlotLIZJ = C350700Doy.LIZJ(C350870DpF.LJI(this.LIZ), nLETrackSlot);
        if (nLETrackSlotLIZJ != null && (strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot)) != null) {
            C351510DqH.LIZ.getClass();
            NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlotLIZJ, strLJIIZILJ);
            if (nLEVideoAnimationLJIJ == null || (iIndexOf = (sortedSlots = this.LIZ.Rn().getSortedSlots()).indexOf(nLETrackSlotLIZJ)) == -1 || (i = iIndexOf + 1) < 0 || i >= sortedSlots.size() || (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(i, sortedSlots)) == null || (nLEVideoAnimationDynamicCast = NLEVideoAnimation.dynamicCast(nLEVideoAnimationLJIJ.deepClone(true))) == null) {
                return null;
            }
            nLEVideoAnimationDynamicCast.setIsNewAnim(true);
            C350780Dp6 c350780Dp6 = new C350780Dp6(nLETrackSlot2, TimeUnit.MICROSECONDS.toMillis(nLEVideoAnimationLJIJ.getDuration()), strLJIIZILJ, "", "", "");
            long jLJIILJJIL = C351510DqH.LJIILJJIL(this.LIZ.Rn(), nLETrackSlot2);
            nLEVideoAnimationDynamicCast.setStartTime(C351510DqH.LJFF(c350780Dp6, this.LIZ.Rn(), jLJIILJJIL));
            nLEVideoAnimationDynamicCast.setEndTime(C351510DqH.LIZLLL(c350780Dp6, this.LIZ.Rn(), jLJIILJJIL));
            nLETrackSlot2.addVideoAnim(nLEVideoAnimationDynamicCast);
            if (nLEVideoAnimationDynamicCast.hasExtra("ep_anim_default_duration") && (lLJIILIIL = C2095008Iq.LJIILIIL(nLEVideoAnimationDynamicCast.getExtra("ep_anim_default_duration"))) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            return C350700Doy.LIZ(C350870DpF.LJI(this.LIZ), nLETrackSlot2, strLJIIZILJ, jLongValue);
        }
        return null;
    }

    @Override // X.InterfaceC351130Dpf
    public final C443120HZe<Boolean, Boolean, NLEVideoAnimation> LJIJJLI(C350780Dp6 c350780Dp6, EnumC356070Dxd enumC356070Dxd) {
        boolean z;
        long jLJIILJJIL;
        NLEVideoAnimation nLEVideoAnimationLLJJIJI;
        NLEResType resourceType;
        NLESegmentVideoAnimation segment;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlot = c350780Dp6.LIZ;
        C351510DqH c351510DqH = C351510DqH.LIZ;
        String str = c350780Dp6.LIZJ;
        c351510DqH.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
        if (videoAnims != null) {
            for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                if (nLEVideoAnimation != null && (segment = nLEVideoAnimation.getSegment()) != null && (resource = segment.getResource()) != null) {
                    resourceType = resource.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType == NLEResType.ANIMATION_VIDEO) {
                    nLETrackSlot.removeVideoAnim(nLEVideoAnimation);
                }
            }
        }
        if (nLEVideoAnimationLJIJ == null) {
            z = true;
        } else {
            z = false;
        }
        NLETrack nLETrackPt = this.LIZ.Pt();
        if (nLETrackPt == null) {
            return new C443120HZe<>(Boolean.FALSE, Boolean.TRUE, null);
        }
        C351510DqH.LIZ.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrackPt, nLETrackSlot);
        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
        if (nLEVideoAnimationLJIJ != null && C351220Dpo.LLJIJIL(nLEVideoAnimationLJIJ)) {
            jLJIILJJIL = nLEVideoAnimationLJIJ.getStartTime();
        } else {
            jLJIILJJIL = C351510DqH.LJIILJJIL(nLETrackPt, nLETrackSlot);
        }
        long jLJI = C351510DqH.LJI(c350780Dp6, nLETrackPt, z, jLJIILJJIL);
        long jLJ = C351510DqH.LJ(c350780Dp6, nLETrackPt, jLJIILJJIL);
        if (jLJI >= jLJJIJ) {
            jLJJIJ = jLJI;
        }
        if (jLJ < jLJJIIZI) {
            jLJJIIZI = jLJ;
        }
        if (Intrinsics.LJFF(c350780Dp6.LIZJ, "combo_video_anim") && Math.abs(jLJJIIZI - jLJJIJ) < 10000) {
            return new C443120HZe<>(Boolean.FALSE, Boolean.valueOf(z), null);
        }
        if (!z) {
            nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIJ);
            nLEVideoAnimationLLJJIJI = LLJJIJI(c350780Dp6, jLJJIJ, jLJJIIZI);
            nLETrackSlot.addVideoAnim(nLEVideoAnimationLLJJIJI);
        } else {
            nLEVideoAnimationLLJJIJI = LLJJIJI(c350780Dp6, jLJJIJ, jLJJIIZI);
            nLETrackSlot.addVideoAnim(nLEVideoAnimationLLJJIJI);
        }
        return new C443120HZe<>(Boolean.TRUE, Boolean.valueOf(z), nLEVideoAnimationLLJJIJI);
    }

    public static NLEVideoAnimation LLJJIJI(C350780Dp6 c350780Dp6, long j, long j2) {
        NLEResType nLEResType;
        NLEResourceNode effectSDKVideoAnimation;
        NLEResType nLEResType2;
        NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
        nLEVideoAnimation.setIsNewAnim(true);
        nLEVideoAnimation.setStartTime(j);
        nLEVideoAnimation.setEndTime(j2);
        NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(c350780Dp6.LIZLLL);
        nLEResourceNode.setResourceId(c350780Dp6.LJFF);
        nLEResourceNode.setResourceName(c350780Dp6.LJ);
        String str = c350780Dp6.LIZJ;
        if (Intrinsics.LJFF(str, "in_video_anim")) {
            nLEResType = NLEResType.ANIMATION_VIDEO_IN;
        } else if (Intrinsics.LJFF(str, "out_video_anim")) {
            nLEResType = NLEResType.ANIMATION_VIDEO_OUT;
        } else {
            nLEResType = NLEResType.ANIMATION_VIDEO_COMBO;
        }
        nLEResourceNode.setResourceType(nLEResType);
        nLESegmentVideoAnimation.setEffectSDKVideoAnimation(nLEResourceNode);
        nLEVideoAnimation.setSegment(nLESegmentVideoAnimation);
        nLEVideoAnimation.setExtra("anim_type", c350780Dp6.LIZJ);
        nLEVideoAnimation.setExtra("ep_anim_default_duration", String.valueOf(c350780Dp6.LIZIZ));
        nLEVideoAnimation.setExtra("from_ep_create", "1");
        NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
        if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null) {
            effectSDKVideoAnimation.setResourceId(c350780Dp6.LJFF);
            effectSDKVideoAnimation.setResourceFile(c350780Dp6.LIZLLL);
            effectSDKVideoAnimation.setResourceName(c350780Dp6.LJ);
            String str2 = c350780Dp6.LIZJ;
            if (Intrinsics.LJFF(str2, "in_video_anim")) {
                nLEResType2 = NLEResType.ANIMATION_VIDEO_IN;
            } else if (Intrinsics.LJFF(str2, "out_video_anim")) {
                nLEResType2 = NLEResType.ANIMATION_VIDEO_OUT;
            } else {
                nLEResType2 = NLEResType.ANIMATION_VIDEO_COMBO;
            }
            effectSDKVideoAnimation.setResourceType(nLEResType2);
        }
        return nLEVideoAnimation;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    @Override // X.InterfaceC351130Dpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LIZLLL(X.C350780Dp6 r12, X.EnumC356070Dxd r13, com.bytedance.ies.nle.editor_jni.NLEModel r14) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350770Dp5.LIZLLL(X.0Dp6, X.0Dxd, com.bytedance.ies.nle.editor_jni.NLEModel):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }
}
