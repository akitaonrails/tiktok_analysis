package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3A {
    public static C2473609mg LIZ;

    public static C2473609mg LIZ() {
        C2473609mg c2473609mg = LIZ;
        if (c2473609mg != null) {
            return c2473609mg;
        }
        int iIntValue = ((Number) C0AYD.LIZ.getValue()).intValue();
        if (iIntValue <= 0) {
            C2473609mg c2473609mg2 = new C2473609mg(90, 7, false);
            LIZ = c2473609mg2;
            return c2473609mg2;
        }
        C2473609mg c2473609mg3 = new C2473609mg(iIntValue % 100, (iIntValue / LSPassThroughRecordSizeConfig.DEFAULT) % 100, iIntValue >= 100000);
        LIZ = c2473609mg3;
        return c2473609mg3;
    }

    public static final Pair<FilterBean, Float> LIZIZ(NLEModel nLEModel) {
        NLETrack next;
        NLESegment mainSegment;
        NLEResourceNode resource;
        Uri uri;
        NLETrackSlot next2;
        Float fValueOf = Float.valueOf(0.0f);
        NLEStringFloatPair nLEStringFloatPair = null;
        if (nLEModel == null) {
            return new Pair<>(null, fValueOf);
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = next;
                if (nLETrack.getTrackType() == NLETrackType.FILTER && !Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "normal_effect")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = next;
        if (nLETrack2 == null) {
            return new Pair<>(null, fValueOf);
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack2.getSlots());
        if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
            C0LE8.LIZ.getClass();
            Effect effectLIZ = C347840DkM.LIZ(nLETrack2, C0LE8.LJFF);
            if (effectLIZ == null) {
                return new Pair<>(null, fValueOf);
            }
            FilterBean filterBean = new FilterBean();
            filterBean.setId(effectLIZ.getEffectId());
            filterBean.setResId(effectLIZ.getResourceId());
            filterBean.setExtra(effectLIZ.getExtra());
            filterBean.setName(effectLIZ.getName());
            filterBean.setCategoryKey(C194396113q.LIZ(effectLIZ));
            filterBean.setEnName(C1639660slo.LIZJ(effectLIZ));
            UrlModel urlModelLIZ = C1441230nbl.LIZ(effectLIZ.getFileUrl());
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.uri = urlModelLIZ.getUri();
            toolsUrlModel.urlList = urlModelLIZ.getUrlList();
            filterBean.setResource(toolsUrlModel);
            List<String> tags = effectLIZ.getTags();
            if (tags == null) {
                tags = C13BV.INSTANCE;
            }
            filterBean.setTags(tags);
            if (!effectLIZ.getIconUrl().getUrlList().isEmpty()) {
                try {
                    uri = UriProtector.parse(effectLIZ.getIconUrl().getUrlList().get(0));
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    uri = null;
                }
                filterBean.setThumbnailFileUri(uri);
            }
            filterBean.setFilterFolder(resource.getResourceFile());
            filterBean.setFilterFilePath(resource.getResourceFile());
            Iterator<NLETrackSlot> it3 = nLETrack2.getSlots().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (NLESegmentComposerFilter.dynamicCast((NLENode) next2.getMainSegment()) != null) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot2 = next2;
            float second = 1.0f;
            if (nLETrackSlot2 == null) {
                return new Pair<>(filterBean, Float.valueOf(1.0f));
            }
            Iterator<NLEStringFloatPair> it4 = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()).getEffectNodeKeyValuePairs().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                NLEStringFloatPair next3 = it4.next();
                if (Intrinsics.LJFF(next3.getFirst(), "Filter_intensity")) {
                    nLEStringFloatPair = next3;
                    break;
                }
            }
            NLEStringFloatPair nLEStringFloatPair2 = nLEStringFloatPair;
            if (nLEStringFloatPair2 != null) {
                second = nLEStringFloatPair2.getSecond();
            }
            return new Pair<>(filterBean, Float.valueOf(second));
        }
        return new Pair<>(null, fValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel r8) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E3A.LIZLLL(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public static final boolean LJ(NLETemplateModel nLETemplateModel) {
        for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableAssetItems()) {
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            if (C123100dR.LIZ(nLETrackSlot2.getExtra("freeze_group")) || C123100dR.LIZ(nLETrackSlot2.getExtra("freeze_from_uuid"))) {
                if (nLETrackSlot != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean LJFF(NLETemplateModel nLETemplateModel) {
        for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableAssetItems()) {
            if (C123100dR.LIZ(nLETrackSlot.getExtra("same_asset_group"))) {
                if (nLETrackSlot != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final String LIZJ(String str, EnumC20228014Cw enumC20228014Cw, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, List<String> list, boolean z, boolean z2) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateProducer, allowSameAssetSlot:");
        sbLIZ.append(z2);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        String absolutePath = C2298208zU.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), enumC20228014Cw, null, false, 12).getAbsolutePath();
        if (str == null) {
            str = "";
        }
        C352420Drk c352420Drk = new C352420Drk(nLEModel, str);
        if (list != null && (!list.isEmpty())) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr sortedSlots = it2.next().getSortedSlots();
                ArrayList arrayList2 = new ArrayList();
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    if (list.contains(nLETrackSlot.getUUID())) {
                        arrayList2.add(nLETrackSlot);
                    }
                }
                C19719612Di.LJJI(arrayList2, arrayList);
            }
            if (!arrayList.isEmpty()) {
                c352420Drk.LIZJ = C09HN.LIZ(arrayList);
            }
        }
        String strLIZ = c352420Drk.LIZ(C0CHQ.LIZ, absolutePath, z, z2, videoPublishEditModel.creativeModel.publishModel.bindFreezeFrameSlot);
        if (strLIZ != null && strLIZ.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TemplateProducer, TemplateZip:");
            sbLIZ2.append(strLIZ);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
            return strLIZ;
        }
        return "zip_url_invalid";
    }
}
