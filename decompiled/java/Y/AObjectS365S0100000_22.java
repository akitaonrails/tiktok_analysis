package Y;

import X.C1436970nUt;
import X.C280930Azj;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS365S0100000_22 implements Function1 {
    public final int $t;
    public Object l0;

    public static final Object invoke$4(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        Boolean bool = (Boolean) obj;
        ChooseCoverActivity.LLLLZLL((ChooseCoverActivity) aObjectS365S0100000_22.l0, bool);
        return bool;
    }

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
            default:
                return null;
        }
    }

    public AObjectS365S0100000_22(VEVideoPublishPreviewScene vEVideoPublishPreviewScene, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = vEVideoPublishPreviewScene;
        } else {
            this.l0 = vEVideoPublishPreviewScene;
        }
    }

    public static final Object invoke$0(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aObjectS365S0100000_22.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue != vEVideoPublishPreviewScene.LLLLLLLLL) {
            if (zBooleanValue) {
                vEVideoPublishPreviewScene.LLLLLLLZIL();
                C786410Ut5.LJZI(4, vEVideoPublishPreviewScene.LLLFFI);
                C786410Ut5.LLLLLLZZ(vEVideoPublishPreviewScene.LLLL, 4);
                vEVideoPublishPreviewScene.LLLLLZ(false);
            } else {
                vEVideoPublishPreviewScene.LLLLLLZZ();
                C786410Ut5.LJZI(0, vEVideoPublishPreviewScene.LLLFFI);
                vEVideoPublishPreviewScene.LLLLLZ(true);
            }
            vEVideoPublishPreviewScene.LLLLLLLLL = zBooleanValue;
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        C1436970nUt c1436970nUt = (C1436970nUt) aObjectS365S0100000_22.l0;
        if (c1436970nUt.LIZLLL.LLLLIILL.getAILivePhotoModel().LJIIJ()) {
            c1436970nUt.LIZ = c1436970nUt.LIZLLL.LLLLIILL.clone();
        }
        if (((Boolean) C280930Azj.LIZ.getValue()).booleanValue()) {
            c1436970nUt.LIZLLL.b0();
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aObjectS365S0100000_22.l0;
        vEVideoPublishPreviewScene.LLLLZLL(vEVideoPublishPreviewScene.findViewById(R.id.view_frame_cover));
        vEVideoPublishPreviewScene.LLLLLZL = (View) obj;
        vEVideoPublishPreviewScene.LLLLLLLLL();
        return null;
    }

    public static final Object invoke$3(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aObjectS365S0100000_22.l0;
        vEVideoPublishPreviewScene.LLLLZLL(vEVideoPublishPreviewScene.findViewById(R.id.view_frame_cover));
        vEVideoPublishPreviewScene.LLLLLZIL = (View) obj;
        vEVideoPublishPreviewScene.LLLLLLLLL();
        return null;
    }

    public static final Object invoke$5(AObjectS365S0100000_22 aObjectS365S0100000_22, Object obj) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aObjectS365S0100000_22.l0;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            vEChooseVideoCoverFragment.getClass();
            return Unit.LIZ;
        }
        if (vEChooseVideoCoverFragment.LLJJ != null) {
            if (bool.booleanValue()) {
                C786410Ut5.LJLZ(4, vEChooseVideoCoverFragment.LLJJ);
            } else {
                C786410Ut5.LJLZ(0, vEChooseVideoCoverFragment.LLJJ);
            }
        }
        return Unit.LIZ;
    }

    public AObjectS365S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
