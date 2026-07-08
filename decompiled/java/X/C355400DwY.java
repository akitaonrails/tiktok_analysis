package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS37S0200100_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355400DwY extends C350680Dow implements InterfaceC354940Dvo {
    public final List<String> LJ;

    public C355400DwY(C0E48 c0e48) {
        super(c0e48);
        this.LJ = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJLIIIJ(final C355420Dwa c355420Dwa, final C360110E9x c360110E9x) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (String str : this.LJ) {
            boolean zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
            boolean zLJFF = Intrinsics.LJFF(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str), "asset://md5_error");
            if (!zIsResourceAvailable || zLJFF) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), new C13MA<Long>() { // from class: X.0DwZ
                @Override // X.C13MA
                public final void onSuccess(Long l) {
                    l.longValue();
                    this.LLJJIJI(c355420Dwa, c360110E9x, System.currentTimeMillis() - jCurrentTimeMillis, false);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                    l.longValue();
                }

                @Override // X.C13MA
                public final void onFail(Long l, C1662010tLr c1662010tLr) {
                    C01TT.LIZJ(new AwS37S0200100_5(c360110E9x, c1662010tLr, System.currentTimeMillis() - jCurrentTimeMillis, 5));
                }
            });
        } else {
            LLJJIJI(c355420Dwa, c360110E9x, System.currentTimeMillis() - jCurrentTimeMillis, true);
        }
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJJZ(NLETrackSlot nLETrackSlot, List<C351390Dq5> list, EnumC356070Dxd enumC356070Dxd) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            LJJLIIJ(nLETrackSlot, new C351410Dq7((C351390Dq5) it2.next(), true), EnumC356070Dxd.COMMIT);
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJLIIJ(NLETrackSlot nLETrackSlot, C351410Dq7 c351410Dq7, EnumC356070Dxd enumC356070Dxd) {
        float f;
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        String resourceFile;
        float f2;
        C351390Dq5 c351390Dq5 = c351410Dq7.LIZ;
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            if (C351220Dpo.LLILZIL(nLEFilter) && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilter.getSegment())) != null) {
                List<String> listLJIIJJI = C351220Dpo.LJIIJJI(nLESegmentComposerFilterDynamicCast);
                NLEResourceNode effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter();
                if (effectSDKFilter == null || (resourceFile = effectSDKFilter.getResourceFile()) == null) {
                    resourceFile = "";
                }
                ArrayList arrayList = (ArrayList) listLJIIJJI;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), c351390Dq5.LIZIZ)) {
                            Pair pair = (Pair) C13LP.LJJJLL(c351390Dq5.LIZJ);
                            if (pair != null) {
                                LJJIZ(nLETrackSlot, c351390Dq5.LIZIZ, ((Number) pair.getSecond()).intValue(), c351410Dq7.LIZIZ, enumC356070Dxd);
                                return;
                            }
                            return;
                        }
                    }
                }
                if (Intrinsics.LJFF(resourceFile, c351390Dq5.LIZ)) {
                    for (Pair<String, Integer> pair2 : c351390Dq5.LIZJ) {
                        NLEStringFloatPair nLEStringFloatPair = new NLEStringFloatPair();
                        nLEStringFloatPair.setFirst(pair2.getFirst());
                        boolean z = c351390Dq5.LIZLLL;
                        float fFloatValue = pair2.getSecond().floatValue();
                        if (z) {
                            f2 = fFloatValue / 50.0f;
                        } else {
                            f2 = fFloatValue / 100.0f;
                        }
                        nLEStringFloatPair.setSecond(f2);
                        nLEStringFloatPair.setExtra("is_beauty_res_range_two_ways", String.valueOf(c351390Dq5.LIZLLL));
                        nLEStringFloatPair.setExtra("beauty_item_res_id", c351390Dq5.LIZIZ);
                        nLEStringFloatPair.setExtra("is_beauty_filter_from_auto_retouch", String.valueOf(c351410Dq7.LIZIZ));
                        nLESegmentComposerFilterDynamicCast.addEffectNodeKeyValuePair(nLEStringFloatPair);
                    }
                    LLJJ(null, enumC356070Dxd);
                    return;
                }
            }
        }
        NLESegmentComposerFilter nLESegmentComposerFilter = new NLESegmentComposerFilter();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(c351390Dq5.LIZ);
        nLEResourceNode.setResourceType(NLEResType.COMPOSER);
        nLEResourceNode.setResourceTag(NLEResTag.AMAZING);
        nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(c351390Dq5.LIZIZ, "editor_pro_retouch"));
        nLESegmentComposerFilter.setEffectSDKFilter(nLEResourceNode);
        NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
        nLEStringFloatPair2.setFirst("is_retouch");
        nLEStringFloatPair2.setSecond(1.0f);
        nLESegmentComposerFilter.addEffectNodeKeyValuePair(nLEStringFloatPair2);
        for (Pair<String, Integer> pair3 : c351390Dq5.LIZJ) {
            NLEStringFloatPair nLEStringFloatPair3 = new NLEStringFloatPair();
            nLEStringFloatPair3.setFirst(pair3.getFirst());
            boolean z2 = c351390Dq5.LIZLLL;
            float fFloatValue2 = pair3.getSecond().floatValue();
            if (z2) {
                f = fFloatValue2 / 50.0f;
            } else {
                f = fFloatValue2 / 100.0f;
            }
            nLEStringFloatPair3.setSecond(f);
            nLEStringFloatPair3.setExtra("is_beauty_res_range_two_ways", String.valueOf(c351390Dq5.LIZLLL));
            nLEStringFloatPair3.setExtra("beauty_item_res_id", c351390Dq5.LIZIZ);
            nLEStringFloatPair3.setExtra("is_beauty_filter_from_auto_retouch", String.valueOf(c351410Dq7.LIZIZ));
            nLESegmentComposerFilter.addEffectNodeKeyValuePair(nLEStringFloatPair3);
        }
        NLEFilter nLEFilter2 = new NLEFilter();
        nLEFilter2.setSegment(nLESegmentComposerFilter);
        nLEFilter2.setStartTime(-2L);
        nLEFilter2.setEndTime(-2L);
        nLEFilter2.setExtra("part_filter_type", "beauty_filter");
        nLETrackSlot.addFilter(nLEFilter2);
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LLJILJIL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        ArrayList arrayList = new ArrayList();
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            if (C351220Dpo.LLILZIL(nLEFilter) && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilter.getSegment())) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (NLEStringFloatPair nLEStringFloatPair : nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs()) {
                    if (Intrinsics.LJFF(C351220Dpo.LJJIFFI(nLEStringFloatPair), str)) {
                        arrayList2.add(nLEStringFloatPair);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    nLESegmentComposerFilterDynamicCast.removeEffectNodeKeyValuePair((NLEStringFloatPair) it2.next());
                }
                VecNLEStringFloatPairSPtr effectNodeKeyValuePairs = nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs();
                if (!(effectNodeKeyValuePairs instanceof Collection) || !effectNodeKeyValuePairs.isEmpty()) {
                    Iterator<NLEStringFloatPair> it3 = effectNodeKeyValuePairs.iterator();
                    while (it3.hasNext()) {
                        if (!Intrinsics.LJFF(it3.next().getFirst(), "is_retouch")) {
                            break;
                        }
                    }
                }
                arrayList.add(nLEFilter);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            nLETrackSlot.removeFilter((NLEFilter) it4.next());
        }
        LLJJ(null, enumC356070Dxd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Type inference failed for: r2v82, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, float[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, float[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJI(X.C355420Dwa r21, X.InterfaceC355460Dwe r22, long r23, boolean r25) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355400DwY.LLJJIJI(X.0Dwa, X.0Dwe, long, boolean):void");
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJIZ(NLETrackSlot nLETrackSlot, String str, int i, boolean z, EnumC356070Dxd enumC356070Dxd) {
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        float f;
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            if (C351220Dpo.LLILZIL(nLEFilter) && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilter.getSegment())) != null) {
                ArrayList arrayList = (ArrayList) C351220Dpo.LJIIJJI(nLESegmentComposerFilterDynamicCast);
                if (arrayList.isEmpty()) {
                    continue;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), str)) {
                            ArrayList arrayList2 = new ArrayList();
                            for (NLEStringFloatPair nLEStringFloatPair : nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs()) {
                                if (Intrinsics.LJFF(C351220Dpo.LJJIFFI(nLEStringFloatPair), str)) {
                                    boolean zLLILZLL = C351220Dpo.LLILZLL(nLEStringFloatPair);
                                    NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
                                    nLEStringFloatPair2.setFirst(nLEStringFloatPair.getFirst());
                                    float f2 = i;
                                    if (zLLILZLL) {
                                        f = 50.0f;
                                    } else {
                                        f = 100.0f;
                                    }
                                    nLEStringFloatPair2.setSecond(f2 / f);
                                    nLEStringFloatPair2.setExtra("is_beauty_res_range_two_ways", String.valueOf(zLLILZLL));
                                    nLEStringFloatPair2.setExtra("beauty_item_res_id", str);
                                    nLEStringFloatPair2.setExtra("is_beauty_filter_from_auto_retouch", String.valueOf(z));
                                    nLESegmentComposerFilterDynamicCast.addEffectNodeKeyValuePair(nLEStringFloatPair2);
                                    arrayList2.add(nLEStringFloatPair);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                nLESegmentComposerFilterDynamicCast.removeEffectNodeKeyValuePair((NLEStringFloatPair) it3.next());
                            }
                            LLJJ(null, enumC356070Dxd);
                            return;
                        }
                    }
                }
            }
        }
    }
}
