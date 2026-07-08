package Y;

import X.AbstractC1313500kHk;
import X.AbstractC1322720kWc;
import X.C1285820jZ6;
import X.C1322730kWd;
import X.C1336600kt0;
import X.C13LZ;
import X.C20085613iQ;
import X.InterfaceC1335610krP;
import android.animation.Keyframe;
import android.util.Range;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.DeploymentModelV4;
import com.bytedance.ies.xelement.LynxScrollView;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public class AComparatorS39S0000000_20 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case 16:
                return compare$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS39S0000000_20(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        CheckRequestBodyModel.TargetChannel targetChannel = (CheckRequestBodyModel.TargetChannel) obj;
        CheckRequestBodyModel.TargetChannel targetChannel2 = (CheckRequestBodyModel.TargetChannel) obj2;
        if (targetChannel == null) {
            if (targetChannel2 == null) {
                return 0;
            }
            return -1;
        }
        if (targetChannel2 == null) {
            return 1;
        }
        return targetChannel.channelName.compareTo(targetChannel2.channelName);
    }

    public static final int compare$1(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        DeploymentModelV4.V4Group v4Group = (DeploymentModelV4.V4Group) obj;
        DeploymentModelV4.V4Group v4Group2 = (DeploymentModelV4.V4Group) obj2;
        if (v4Group == null) {
            if (v4Group2 == null) {
                return 0;
            }
            return -1;
        }
        if (v4Group2 == null) {
            return 1;
        }
        return v4Group.name.compareTo(v4Group2.name);
    }

    public static final int compare$10(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return Float.compare(((Keyframe) obj).getFraction(), ((Keyframe) obj2).getFraction());
    }

    public static final int compare$11(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        int iCompareTo;
        AbstractC1322720kWc abstractC1322720kWc = (AbstractC1322720kWc) obj;
        AbstractC1322720kWc abstractC1322720kWc2 = (AbstractC1322720kWc) obj2;
        Iterator<Byte> it2 = abstractC1322720kWc.iterator2();
        Iterator<Byte> it3 = abstractC1322720kWc2.iterator2();
        do {
            C1322730kWd c1322730kWd = (C1322730kWd) it2;
            if (c1322730kWd.hasNext()) {
                C1322730kWd c1322730kWd2 = (C1322730kWd) it3;
                if (c1322730kWd2.hasNext()) {
                    iCompareTo = Integer.valueOf(AbstractC1322720kWc.toInt(c1322730kWd.LIZJ())).compareTo(Integer.valueOf(AbstractC1322720kWc.toInt(c1322730kWd2.LIZJ())));
                }
            }
            return Integer.valueOf(abstractC1322720kWc.size()).compareTo(Integer.valueOf(abstractC1322720kWc2.size()));
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public static final int compare$12(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        long j = ((C1336600kt0) obj).LIZ;
        long j2 = ((C1336600kt0) obj2).LIZ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return -1;
        }
        return 1;
    }

    public static final int compare$13(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) obj2;
        if (lynxBaseUI.getTranslationZ() > lynxBaseUI2.getTranslationZ()) {
            return 1;
        }
        if (lynxBaseUI.getTranslationZ() == lynxBaseUI2.getTranslationZ()) {
            return 0;
        }
        return -1;
    }

    public static final int compare$14(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return Float.compare(((Keyframe) obj).getFraction(), ((Keyframe) obj2).getFraction());
    }

    public static final int compare$15(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj2;
        VideoEncoderConfig videoEncoderConfig2 = (VideoEncoderConfig) obj;
        return C20085613iQ.LIZIZ(Long.valueOf(((long) videoEncoderConfig.width) * ((long) videoEncoderConfig.height)), Long.valueOf(((long) videoEncoderConfig2.width) * ((long) videoEncoderConfig2.height)));
    }

    public static final int compare$16(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        int i = LynxScrollView.LLJJLIIIJLLLLLLLZ;
        return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
    }

    public static final int compare$17(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        int i = LynxScrollView.LLJJLIIIJLLLLLLLZ;
        return ((Integer) obj).intValue() - ((Integer) obj2).intValue();
    }

    public static final int compare$18(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        int i;
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        int i2 = 0;
        if (tEFrameSizei2 != null) {
            i = tEFrameSizei2.width * tEFrameSizei2.height;
        } else {
            i = 0;
        }
        if (tEFrameSizei != null) {
            i2 = tEFrameSizei.width * tEFrameSizei.height;
        }
        return Intrinsics.LJI(i, i2);
    }

    public static final int compare$19(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        Range range = (Range) obj;
        Range range2 = (Range) obj2;
        int iCompare = Integer.compare(((Integer) range.getLower()).intValue(), ((Integer) range2.getLower()).intValue());
        if (iCompare == 0) {
            return Integer.compare(((Integer) range2.getUpper()).intValue(), ((Integer) range.getUpper()).intValue());
        }
        return iCompare;
    }

    public static final int compare$2(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$20(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$3(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Number) obj).intValue()), Integer.valueOf(((Number) obj2).intValue()));
    }

    public static final int compare$4(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        WeakHashMap<View, Integer> weakHashMap = AbstractC1313500kHk.LLLLLZ;
        Integer num = weakHashMap.get(obj);
        Integer num2 = 0;
        if (num == null) {
            num = num2;
        }
        Integer num3 = weakHashMap.get(obj2);
        if (num3 != null) {
            num2 = num3;
        }
        return num.intValue() - num2.intValue();
    }

    public static final int compare$5(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return Integer.compare(((JavaOnlyMap) obj).getInt("position"), ((JavaOnlyMap) obj2).getInt("position"));
    }

    public static final int compare$6(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        View view = (View) obj2;
        Integer viewZIndex = UIGroup.getViewZIndex((View) obj);
        Integer num = 0;
        if (viewZIndex == null) {
            viewZIndex = num;
        }
        Integer viewZIndex2 = UIGroup.getViewZIndex(view);
        if (viewZIndex2 != null) {
            num = viewZIndex2;
        }
        return viewZIndex.intValue() - num.intValue();
    }

    public static final int compare$7(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        TEFrameSizei tEFrameSizei2 = (TEFrameSizei) obj2;
        return (tEFrameSizei2.width * tEFrameSizei2.height) - (tEFrameSizei.width * tEFrameSizei.height);
    }

    public static final int compare$8(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(C13LZ.LIZJ(((C1285820jZ6) obj).LIZIZ, 0.0d, 1.0d)), Double.valueOf(C13LZ.LIZJ(((C1285820jZ6) obj2).LIZIZ, 0.0d, 1.0d)));
    }

    public static final int compare$9(AComparatorS39S0000000_20 aComparatorS39S0000000_20, Object obj, Object obj2) {
        long timestamp = ((InterfaceC1335610krP) obj).getTimestamp();
        long timestamp2 = ((InterfaceC1335610krP) obj2).getTimestamp();
        if (timestamp < timestamp2) {
            return -1;
        }
        if (timestamp2 == timestamp) {
            return 0;
        }
        return 1;
    }
}
