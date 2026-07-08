package Y;

import X.C1852780yJY;
import X.C1C7U;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS38S0101000_27 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS38S0101000_27 aRunnableS38S0101000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomInputAssem@df38.updateActionBarSugItem$1$1");
        try {
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS38S0101000_27.l0).scrollToPosition(aRunnableS38S0101000_27.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomInputAssem@df38.updateActionBarSugItem$1$1");
    }

    public static final void run$1(ARunnableS38S0101000_27 aRunnableS38S0101000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ImageShortcutsAssem@5cda.updateSugItem$1$1");
        try {
            ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS38S0101000_27.l0).scrollToPosition(aRunnableS38S0101000_27.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageShortcutsAssem@5cda.updateSugItem$1$1");
    }

    public static final void run$2(ARunnableS38S0101000_27 aRunnableS38S0101000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewPhotoFragment@6965.onViewCreated$8$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PreviewPhotoFragment) aRunnableS38S0101000_27.l0).LLJILLL;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS38S0101000_27.i1, false);
            }
            ((PreviewPhotoFragment) aRunnableS38S0101000_27.l0).LLJJI = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewPhotoFragment@6965.onViewCreated$8$1");
    }

    public static final void run$3(ARunnableS38S0101000_27 aRunnableS38S0101000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoImageEditSelectAndPreviewView@a20f.onKeyBoardShowOrHide$1");
        try {
            ((C1852780yJY) aRunnableS38S0101000_27.l0).LJ(aRunnableS38S0101000_27.i1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoImageEditSelectAndPreviewView@a20f.onKeyBoardShowOrHide$1");
    }

    public ARunnableS38S0101000_27(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
