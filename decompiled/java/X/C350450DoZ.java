package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350450DoZ extends C350680Dow implements InterfaceC354930Dvn {
    public C350450DoZ(C0E48 c0e48) {
        super(c0e48);
    }

    public static NLESegment LLJJIJIIJIL(C350460Doa c350460Doa) {
        NLEResTag nLEResTag;
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_NLE_COMPOSER_FOR_EFFECT, Boolean.FALSE)).booleanValue() && !c350460Doa.LJI) {
            NLESegmentComposerFilter nLESegmentComposerFilter = new NLESegmentComposerFilter();
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceTag(NLEResTag.NORMAL);
            nLEResourceNode.setResourceFile(c350460Doa.LIZIZ);
            nLEResourceNode.setResourceName(c350460Doa.LIZJ);
            nLEResourceNode.setResourceId(c350460Doa.LIZ);
            nLEResourceNode.setResourceType(NLEResType.EFFECT);
            nLESegmentComposerFilter.setEffectSDKFilter(nLEResourceNode);
            nLESegmentComposerFilter.setStatus(1);
            nLESegmentComposerFilter.setFilterName(c350460Doa.LIZJ);
            nLESegmentComposerFilter.setEffectTags(new VecString(new String[]{c350460Doa.LIZLLL}));
            LLJJIJI(c350460Doa, nLESegmentComposerFilter);
            return nLESegmentComposerFilter;
        }
        NLESegmentEffect nLESegmentEffect = new NLESegmentEffect();
        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
        if (c350460Doa.LJI) {
            nLEResTag = NLEResTag.AMAZING;
        } else {
            nLEResTag = NLEResTag.NORMAL;
        }
        nLEResourceNode2.setResourceTag(nLEResTag);
        nLEResourceNode2.setResourceFile(c350460Doa.LIZIZ);
        nLEResourceNode2.setResourceName(c350460Doa.LIZJ);
        nLEResourceNode2.setResourceId(c350460Doa.LIZ);
        nLEResourceNode2.setResourceType(NLEResType.EFFECT);
        nLESegmentEffect.setEffectSDKEffect(nLEResourceNode2);
        if (c350460Doa.LJI) {
            nLESegmentEffect.setApplyTargetType(c350460Doa.LJII);
            try {
                JSONObject jSONObject = new JSONObject(c350460Doa.LJIIIIZZ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                    nLEStringFloatPair.setFirst(next);
                    nLEStringFloatPair.setSecond((float) jSONObject.optDouble(next));
                    nLESegmentEffect.addAdjustParams(nLEStringFloatPair);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        LLJJIJI(c350460Doa, nLESegmentEffect);
        nLESegmentEffect.setEffectName(c350460Doa.LIZJ);
        return nLESegmentEffect;
    }

    public static void LLJJIJI(C350460Doa c350460Doa, NLESegment nLESegment) {
        EffectSearchModel effectSearchModel = c350460Doa.LJIIIZ;
        if (effectSearchModel != null) {
            nLESegment.setExtra("searched_effect_info", C051R.LIZIZ(effectSearchModel.copy(effectSearchModel.searchFrom, effectSearchModel.tokenType, effectSearchModel.searchId, effectSearchModel.searchKeyword, effectSearchModel.searchResultId, effectSearchModel.searchUniversalRank, effectSearchModel.creatorSearchInfo, effectSearchModel.isFirstScreen, effectSearchModel.insertedFromSearchPanel, Boolean.FALSE, effectSearchModel.applyTime)));
            if (Intrinsics.LJFF(effectSearchModel.getAppliedFromSearchPanel(), Boolean.TRUE) && !nLESegment.hasExtra("applied_from_search_panel")) {
                nLESegment.setExtra("applied_from_search_panel", "true");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // X.InterfaceC354930Dvn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot> LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r4, X.EnumC356070Dxd r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L1e
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r3.LLJJI()
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = r3.LLJJIII()
        La:
            if (r2 == 0) goto L1c
            boolean r1 = X.C351220Dpo.LLJJIII(r2)
            r0 = 1
            if (r1 != r0) goto L1c
        L13:
            r1 = 0
            if (r0 != 0) goto L29
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r1)
            return r0
        L1c:
            r0 = 0
            goto L13
        L1e:
            X.0E48 r0 = r3.LIZ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = r0.getTrackBySlot(r4)
            goto La
        L29:
            r2.removeSlot(r4)
            r3.LLJJ(r1, r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350450DoZ.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.0Dxd):kotlin.Pair");
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJIJJ(NLETrack nLETrack, C350470Dob c350470Dob, EnumC356070Dxd enumC356070Dxd) {
        int layer;
        NLETrackSlot nLETrackSlotLLJJI = c350470Dob.LIZ;
        if (nLETrackSlotLLJJI == null) {
            nLETrackSlotLLJJI = LLJJI();
        }
        boolean zLIZLLL = C351420Dq8.LIZLLL(C350870DpF.LJI(this.LIZ));
        if (nLETrackSlotLLJJI == null) {
            return null;
        }
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone(true));
        nLETrackSlotDynamicCast.setStartTime(c350470Dob.LIZIZ);
        nLETrackSlotDynamicCast.setEndTime(c350470Dob.LIZIZ + c350470Dob.LIZJ);
        if (zLIZLLL) {
            layer = C351420Dq8.LJ(C350870DpF.LJI(this.LIZ), EnumC355980DxU.EFFECT);
        } else {
            layer = nLETrack.getLayer() + 10000;
        }
        nLETrackSlotDynamicCast.setTransformZ(layer);
        nLETrack.addSlot(nLETrackSlotDynamicCast);
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlotDynamicCast;
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJJIIZ(NLETrack nLETrack, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        int i;
        int iLJ;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setMainSegment(LLJJIJIIJIL(c350460Doa));
        nLETrackSlot.setStartTime(c350460Doa.LJ);
        nLETrackSlot.setEndTime(c350460Doa.LJ + c350460Doa.LJFF);
        if (nLETrack != null) {
            nLETrackSlot.setTransformZ(nLETrack.getLayer() + 10000);
            nLETrack.addSlot(nLETrackSlot);
        } else {
            boolean zLIZLLL = C351420Dq8.LIZLLL(C350870DpF.LJI(this.LIZ));
            if (C351220Dpo.LJJIJLIJ(C350870DpF.LJI(this.LIZ)).isEmpty()) {
                i = 0;
            } else {
                Iterator<NLETrack> it2 = C351220Dpo.LJJIJLIJ(C350870DpF.LJI(this.LIZ)).iterator();
                if (it2.hasNext()) {
                    int layer = it2.next().getLayer();
                    while (it2.hasNext()) {
                        int layer2 = it2.next().getLayer();
                        if (layer < layer2) {
                            layer = layer2;
                        }
                    }
                    i = layer + 1;
                } else {
                    throw new NoSuchElementException();
                }
            }
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setMainTrack(false);
            nLETrack2.setLayer(i);
            nLETrack2.setExtra("track_type", "video_effect");
            nLETrack2.setExtraTrackType(NLETrackType.EFFECT);
            nLETrack2.setExtra("EffectTrackType", "NORMAL");
            C351220Dpo.LLLLJI(nLETrack2);
            if (zLIZLLL) {
                iLJ = C351420Dq8.LJ(C350870DpF.LJI(this.LIZ), EnumC355980DxU.EFFECT);
            } else {
                iLJ = i + 10000;
            }
            nLETrackSlot.setTransformZ(iLJ);
            nLETrack2.addSlot(nLETrackSlot);
            C350870DpF.LJI(this.LIZ).addTrack(nLETrack2);
        }
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlot;
    }

    @Override // X.InterfaceC354930Dvn
    public final NLENode LJJJ(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        NLEVideoEffect nLEVideoEffect;
        NLESegment nLESegmentLLJJIJIIJIL = LLJJIJIIJIL(c350460Doa);
        if (nLESegmentLLJJIJIIJIL instanceof NLESegmentEffect) {
            NLEVideoEffect nLEVideoEffect2 = new NLEVideoEffect();
            nLEVideoEffect2.setSegment((NLESegmentEffect) nLESegmentLLJJIJIIJIL);
            nLEVideoEffect2.setStartTime(-2L);
            nLEVideoEffect2.setEndTime(-2L);
            nLEVideoEffect2.setExtra("icon_url", c350460Doa.LJIIJ);
            nLETrackSlot.addVideoEffect(nLEVideoEffect2);
            nLEVideoEffect = nLEVideoEffect2;
        } else if (nLESegmentLLJJIJIIJIL instanceof NLESegmentComposerFilter) {
            NLEFilter nLEFilter = new NLEFilter();
            nLEFilter.setSegment((NLESegmentFilter) nLESegmentLLJJIJIIJIL);
            nLEFilter.setStartTime(-2L);
            nLEFilter.setEndTime(-2L);
            nLEFilter.setExtra("icon_url", c350460Doa.LJIIJ);
            nLETrackSlot.addFilter(nLEFilter);
            nLEVideoEffect = nLEFilter;
        } else {
            nLEVideoEffect = null;
        }
        LLJJ(null, enumC356070Dxd);
        return nLEVideoEffect;
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJLLLL(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        int layer;
        if (nLETrackSlot == null) {
            nLETrackSlot = LLJJI();
        }
        if (nLETrackSlot != null) {
            boolean zLIZLLL = C351420Dq8.LIZLLL(C350870DpF.LJI(this.LIZ));
            NLETrack trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                trackBySlot.removeSlot(nLETrackSlot);
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                nLETrackSlot2.setMainSegment(LLJJIJIIJIL(c350460Doa));
                nLETrackSlot2.setStartTime(c350460Doa.LJ);
                nLETrackSlot2.setEndTime(c350460Doa.LJ + c350460Doa.LJFF);
                if (zLIZLLL) {
                    layer = nLETrackSlot.getTransformZ();
                } else {
                    layer = trackBySlot.getLayer() + 10000;
                }
                nLETrackSlot2.setTransformZ(layer);
                trackBySlot.addSlot(nLETrackSlot2);
                LLJJ(null, enumC356070Dxd);
                return nLETrackSlot2;
            }
        }
        return null;
    }

    @Override // X.InterfaceC354930Dvn
    public final void LLIIJI(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        String resourceId;
        NLEResourceNode effectSDKFilter;
        NLEResourceNode effectSDKEffect;
        Iterator<NLEVideoEffect> it2 = nLETrackSlot.getVideoEffects().iterator();
        while (true) {
            String resourceId2 = null;
            if (!it2.hasNext()) {
                break;
            }
            NLEVideoEffect next = it2.next();
            NLESegmentEffect segment = next.getSegment();
            if (segment != null && (effectSDKEffect = segment.getEffectSDKEffect()) != null) {
                resourceId2 = effectSDKEffect.getResourceId();
            }
            if (Intrinsics.LJFF(resourceId2, c350460Doa.LIZ)) {
                nLETrackSlot.removeVideoEffect(next);
            }
        }
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            NLESegmentFilter segment2 = nLEFilter.getSegment();
            if (segment2 != null && (effectSDKFilter = segment2.getEffectSDKFilter()) != null) {
                resourceId = effectSDKFilter.getResourceId();
            } else {
                resourceId = null;
            }
            if (Intrinsics.LJFF(resourceId, c350460Doa.LIZ)) {
                nLETrackSlot.removeFilter(nLEFilter);
            }
        }
        LLJJ(null, enumC356070Dxd);
    }
}
