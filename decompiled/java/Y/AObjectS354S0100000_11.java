package Y;

import X.C0RH0;
import X.C1558520qew;
import X.C305280Bxu;
import X.C703360RiQ;
import X.C703430RiX;
import X.C737030Svd;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS354S0100000_11 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public AObjectS354S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        Function1[] function1Arr = (Function1[]) aObjectS354S0100000_11.l0;
        for (int length = function1Arr.length - 1; length >= 0; length--) {
            obj = function1Arr[length].invoke(obj);
        }
        return obj;
    }

    public static final Object invoke$1(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        C703360RiQ c703360RiQLIZ = ((C703430RiX) aObjectS354S0100000_11.l0).LIZ((String) obj);
        c703360RiQLIZ.LIZJ = true;
        c703360RiQLIZ.LIZIZ = "blocked_by_ancestor_rule";
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS354S0100000_11.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0RH0 c0rh0 = videoViewCell.LLLL;
        if (c0rh0 != null) {
            c0rh0.setCanTouch(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        int[] iArr = (int[]) aObjectS354S0100000_11.l0;
        C737030Svd c737030Svd = (C737030Svd) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        Bundle bundle = new Bundle();
        bundle.putIntArray("share_button_location", iArr);
        c737030Svd.LIZJ = bundle;
        return c737030Svd;
    }

    public static final Object invoke$4(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        int[] iArr = (int[]) aObjectS354S0100000_11.l0;
        C737030Svd c737030Svd = (C737030Svd) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        Bundle bundle = new Bundle();
        bundle.putIntArray("comment_button_location", iArr);
        c737030Svd.LIZJ = bundle;
        return c737030Svd;
    }

    public static final Object invoke$5(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        int[] iArr = (int[]) aObjectS354S0100000_11.l0;
        C737030Svd c737030Svd = (C737030Svd) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        Bundle bundle = new Bundle();
        bundle.putIntArray("favorite_button_location", iArr);
        c737030Svd.LIZJ = bundle;
        return c737030Svd;
    }

    public static final Object invoke$6(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        DataCenter dataCenter = ((VideoViewCell) aObjectS354S0100000_11.l0).LLZL;
        if (dataCenter != null) {
            dataCenter.zQ2(obj, "social_video_tag_info");
            return null;
        }
        return null;
    }

    public static final Object invoke$7(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS354S0100000_11.l0;
        MotionEvent motionEvent = (MotionEvent) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        if (!C305280Bxu.LIZ()) {
            return Boolean.FALSE;
        }
        if (videoViewCell.u0 == null) {
            videoViewCell.u0 = (EdgeSpeedupAbility) C1558520qew.LIZ(videoViewCell.b, EdgeSpeedupAbility.class, null);
        }
        EdgeSpeedupAbility edgeSpeedupAbility = videoViewCell.u0;
        if (edgeSpeedupAbility != null && motionEvent != null && edgeSpeedupAbility.cS1(motionEvent.getX(), motionEvent.getY())) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$8(AObjectS354S0100000_11 aObjectS354S0100000_11, Object obj) {
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        return ((VideoViewCell) aObjectS354S0100000_11.l0).i((Video) obj);
    }
}
