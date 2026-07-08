package X;

import Y.AComparatorS24S0000000_5;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348520DlS {
    public static final List<NLETrack> LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && (Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "NORMAL") || Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "VIDEO_ANIM"))) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(22), arrayList);
    }

    public static final List<NLETrack> LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "NORMAL")) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(23), arrayList);
    }

    public static final List<NLETrack> LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack2), "VIDEO") || Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack2), "AUDIO")) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final NLETrack LIZLLL(NLEModel nLEModel) {
        NLETrack nLETrack;
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            nLETrack = null;
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack2 = next;
                if (nLETrack2.getEnable() && Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack2), "VIDEO")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack3 = next;
        if (nLETrack3 == null) {
            Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLETrack next2 = it3.next();
                NLETrack nLETrack4 = next2;
                if (nLETrack4.getEnable() && Intrinsics.LJFF(C348350DlB.LJI(nLETrack4), "TIME")) {
                    nLETrack = next2;
                    break;
                }
            }
            return nLETrack;
        }
        return nLETrack3;
    }

    public static final int LJ(NLETrackSlot nLETrackSlot) {
        return CastIntegerProtector.parseInt(nLETrackSlot.getMainSegment().getExtra("nleUIEndTime"));
    }

    public static final boolean LJFF(NLETrackSlot nLETrackSlot) {
        VecNLEVideoEffectSPtr videoEffects;
        String jsonParam;
        if (nLETrackSlot != null && (videoEffects = nLETrackSlot.getVideoEffects()) != null) {
            Iterator<NLEVideoEffect> it2 = videoEffects.iterator();
            while (it2.hasNext()) {
                NLESegmentEffect segment = it2.next().getSegment();
                if (segment != null && (jsonParam = segment.getJsonParam()) != null && !TextUtils.isEmpty(jsonParam)) {
                    return new JSONObject(jsonParam).has("editing_effect_algorithm_cache_url");
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (!(tracks instanceof Collection) || !tracks.isEmpty()) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getEnable() && Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack), "VIDEO")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJII(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || NLESegmentTimeEffect.dynamicCast(nLETrackSlot.getMainSegment()) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        NLEFilter nLEFilter;
        if (nLETrackSlot != null) {
            NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
            if (renderProxy != null) {
                if (renderProxy.getMainSegment() == null) {
                    if (nLETrackSlot == null) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            if (filters != null && (nLEFilter = (NLEFilter) C13LP.LJJJLL(filters)) != null) {
                if (nLEFilter.getSegment() == null) {
                    if (nLETrackSlot == null) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
            if (videoEffects != null && C13LP.LJJJLL(videoEffects) != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
