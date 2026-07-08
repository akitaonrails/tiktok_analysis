package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444940nhk {
    public static final LoudnessDetectResult LIZ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        String str;
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (str = forwardCanvasExtra.mediaMeta) != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                double dOptDouble = jSONObject.optDouble("peak");
                double dOptDouble2 = jSONObject.optDouble("loudness");
                if (!Double.isNaN(dOptDouble) && !Double.isNaN(dOptDouble2)) {
                    LoudnessDetectResult loudnessDetectResult = new LoudnessDetectResult();
                    loudnessDetectResult.avgLoudness = dOptDouble2;
                    loudnessDetectResult.peakLoudness = dOptDouble;
                    return loudnessDetectResult;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static final ForwardMusic LIZIZ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
            return forwardCanvasExtra.forwardMusic;
        }
        return null;
    }

    public static final int LIZJ(CanvasVideoData canvasVideoData) {
        List<String> list = canvasVideoData.sourceInfo;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static final boolean LIZLLL(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 4) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 9) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(CanvasVideoData canvasVideoData) {
        if (!LJIIZILJ(canvasVideoData) && !LJIILIIL(canvasVideoData) && !LJIILL(canvasVideoData)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(CanvasVideoData canvasVideoData) {
        if (!LJFF(canvasVideoData) && !LJIIJJI(canvasVideoData) && !LIZLLL(canvasVideoData) && !LJIILL(canvasVideoData)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(CanvasVideoData canvasVideoData) {
        if (canvasVideoData == null || canvasVideoData.canvasType != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 6) {
            return false;
        }
        return true;
    }

    public static final void LJIIIZ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        MentionStruct mentionStruct;
        if (LJFF(canvasVideoData) && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (mentionStruct = forwardCanvasExtra.videoShareBackwardsMention) != null && mentionStruct.getScenario() != EnumC19597511lt.POST_BACKWARDS_MENTION.getValue()) {
            EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue();
        }
    }

    public static final boolean LJIIJ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(CanvasVideoData canvasVideoData) {
        if (LJIILLIIL(canvasVideoData) && LJIIJJI(canvasVideoData)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 8) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(CanvasVideoData canvasVideoData) {
        String str;
        CanvasFilterParam canvasFilterParam;
        List<String> list = canvasVideoData.sourceInfo;
        String animPath = null;
        if (list != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
        if (transformList != null && (canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList)) != null) {
            animPath = canvasFilterParam.getAnimPath();
        }
        if (str != null && C570490MZb.LJ(str) && animPath != null && C570490MZb.LJ(animPath)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 5) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(CanvasVideoData canvasVideoData) {
        if (canvasVideoData == null || canvasVideoData.canvasType != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(CanvasVideoData canvasVideoData) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || forwardCanvasExtra.forwardType != 1) {
            return false;
        }
        return true;
    }

    public static final VEVideoTransformFilterParam LJIJ(CanvasFilterParam canvasFilterParam) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.scaleFactor = canvasFilterParam.getScaleFactor();
        vEVideoTransformFilterParam.transX = canvasFilterParam.getTransX();
        vEVideoTransformFilterParam.transY = canvasFilterParam.getTransY();
        vEVideoTransformFilterParam.degree = canvasFilterParam.getDegree();
        vEVideoTransformFilterParam.borderColor = canvasFilterParam.getBorderColor();
        if (canvasFilterParam.getBorderWidthPx() != -2) {
            vEVideoTransformFilterParam.borderWidth = canvasFilterParam.getBorderWidthPx();
        }
        vEVideoTransformFilterParam.transformType = canvasFilterParam.getTransformType();
        vEVideoTransformFilterParam.animStartTime = canvasFilterParam.getAnimStartTime();
        vEVideoTransformFilterParam.animEndTime = canvasFilterParam.getAnimEndTime();
        vEVideoTransformFilterParam.animPath = canvasFilterParam.getAnimPath();
        vEVideoTransformFilterParam.animJsonParam = canvasFilterParam.getAnimJsonParam();
        return vEVideoTransformFilterParam;
    }

    public static final List<VEBaseFilterParam> LJIJI(CanvasFilterParam canvasFilterParam) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(LJIJ(canvasFilterParam));
        if (canvasFilterParam.getVolume() == -2.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            VEAudioVolumeFilterParam vEAudioVolumeFilterParam = new VEAudioVolumeFilterParam();
            vEAudioVolumeFilterParam.volume = canvasFilterParam.getVolume();
            arrayList.add(vEAudioVolumeFilterParam);
        }
        try {
            if (canvasFilterParam.getLeftTopPoint().getFirst().floatValue() != -2.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (canvasFilterParam.getLeftTopPoint().getSecond().floatValue() != -2.0f) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (canvasFilterParam.getRightBottomPoint().getFirst().floatValue() != -2.0f) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        if (canvasFilterParam.getRightBottomPoint().getSecond().floatValue() != -2.0f) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!z5) {
                            VEVideoCropFilterParam vEVideoCropFilterParam = new VEVideoCropFilterParam();
                            vEVideoCropFilterParam.cropNodesCoord = new float[]{canvasFilterParam.getLeftTopPoint().getFirst().floatValue(), canvasFilterParam.getLeftTopPoint().getSecond().floatValue(), canvasFilterParam.getRightBottomPoint().getFirst().floatValue(), canvasFilterParam.getLeftTopPoint().getSecond().floatValue(), canvasFilterParam.getLeftTopPoint().getFirst().floatValue(), canvasFilterParam.getRightBottomPoint().getSecond().floatValue(), canvasFilterParam.getRightBottomPoint().getFirst().floatValue(), canvasFilterParam.getRightBottomPoint().getSecond().floatValue()};
                            arrayList.add(vEVideoCropFilterParam);
                            return arrayList;
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("CanvasFilterParam.toVEFilterParams() NPE", e);
        }
        return arrayList;
    }
}
