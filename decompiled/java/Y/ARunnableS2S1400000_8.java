package Y;

import X.C097U;
import X.C09K7;
import X.C0MWH;
import X.C1322110kVd;
import X.C1429320nIY;
import X.C1443400nfG;
import X.C198H;
import X.C19EG;
import X.C1C7U;
import X.C443530HaJ;
import X.C565950MHp;
import X.C569760MWg;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS2S1400000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        int width = ((C1322110kVd) this.l1).getWidth();
        Bitmap bitmapLIZIZ = C097U.LIZIZ(width, (int) (width / ((((VideoPublishEditModel) this.l2).videoWidth() * 1.0f) / ((VideoPublishEditModel) this.l2).videoHeight())), this.s0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l2;
        String str = videoPublishEditModel.creativeModel.postPageModel.customCoverPath;
        if (C1429320nIY.LIZJ(videoPublishEditModel)) {
            bitmapLIZIZ = C1443400nfG.LIZIZ(str);
        }
        if (bitmapLIZIZ != null) {
            CoverPublishModel coverPublishModel = ((VideoPublishEditModel) this.l2).getCoverPublishModel();
            if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapLIZIZ)) != null) {
                bitmapLIZIZ = bitmapMergeCoverText;
            }
            C443530HaJ c443530HaJ = new C443530HaJ(((C19EG) this.l3).getResources(), bitmapLIZIZ);
            C09K7 c09k7 = (C09K7) this.l4;
            if (c09k7 != null) {
                c09k7.LJJLIIIJLLLLLLLZ(bitmapLIZIZ);
            }
            ((C1322110kVd) this.l1).setImageDrawable(c443530HaJ);
            if (((C1322110kVd) this.l1).getParent() != null) {
                C565950MHp.LIZ((VideoPublishEditModel) this.l2);
            }
        }
    }

    public static final void run$0(ARunnableS2S1400000_8 aRunnableS2S1400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ChooseCoverHelper@ec4.setThumbImageWithUri$1");
        try {
            aRunnableS2S1400000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.setThumbImageWithUri$1");
    }

    public static final void run$1(ARunnableS2S1400000_8 aRunnableS2S1400000_8) {
        boolean zLIZ;
        CreativeToolContainerScene creativeToolContainerScene;
        Activity activity;
        C1C7U.LIZ("SAALauncher@a6aa.launchPageInSAAActivity$1");
        try {
            ((NavigationScene) aRunnableS2S1400000_8.l1).LLLJL();
            C198H c198hLC = ((CreativeToolContainerScene) aRunnableS2S1400000_8.l2).LC();
            if (c198hLC != null && (activity = (creativeToolContainerScene = (CreativeToolContainerScene) aRunnableS2S1400000_8.l2).mActivity) != null) {
                C0MWH c0mwh = C0MWH.LIZ;
                String str = aRunnableS2S1400000_8.s0;
                c0mwh.getClass();
                C0MWH.LJIJJLI(creativeToolContainerScene, str);
                C0MWH.LJIIIZ(activity, (NavigationScene) aRunnableS2S1400000_8.l1, c198hLC, aRunnableS2S1400000_8.s0, (Bundle) aRunnableS2S1400000_8.l3, (C569760MWg) aRunnableS2S1400000_8.l4);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncher@a6aa.launchPageInSAAActivity$1");
    }

    public static final void run$2(ARunnableS2S1400000_8 aRunnableS2S1400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SAALauncher@a6aa.launchPageInSAAActivity$2");
        try {
            ((NavigationScene) aRunnableS2S1400000_8.l1).LLLJL();
            C198H c198hLC = ((SAAActivity) aRunnableS2S1400000_8.l2).LC();
            if (c198hLC != null) {
                C0MWH c0mwh = C0MWH.LIZ;
                SAAActivity sAAActivity = (SAAActivity) aRunnableS2S1400000_8.l2;
                String str = aRunnableS2S1400000_8.s0;
                c0mwh.getClass();
                C0MWH.LJIJJLI(sAAActivity, str);
                C0MWH.LJIIIZ((SAAActivity) aRunnableS2S1400000_8.l2, (NavigationScene) aRunnableS2S1400000_8.l1, c198hLC, aRunnableS2S1400000_8.s0, (Bundle) aRunnableS2S1400000_8.l3, (C569760MWg) aRunnableS2S1400000_8.l4);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncher@a6aa.launchPageInSAAActivity$2");
    }

    public ARunnableS2S1400000_8(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.s0 = str;
        this.l3 = obj;
        this.l4 = obj4;
    }
}
