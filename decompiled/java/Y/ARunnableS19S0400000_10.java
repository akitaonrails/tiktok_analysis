package Y;

import X.C19EG;
import X.C1C7U;
import X.C1EE2;
import X.C21512819Ha;
import X.C2188811AlT;
import X.C661840Pxe;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS19S0400000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS19S0400000_10 aRunnableS19S0400000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoTextPageHelper@d11d.enterPhotoModeFullPage$1$1");
        try {
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            C19EG c19eg = (C19EG) aRunnableS19S0400000_10.l0;
            VideoItemParams videoItemParams = (VideoItemParams) aRunnableS19S0400000_10.l1;
            PostModeDetailParams postModeDetailParams = (PostModeDetailParams) aRunnableS19S0400000_10.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SearchPhotoTextTab_");
            sbLIZ.append(C661840Pxe.LIZ.hashCode());
            c1ee2.LJIJI(c19eg, videoItemParams, postModeDetailParams, C2188811AlT.LIZIZ(sbLIZ), null, null, (Fragment) aRunnableS19S0400000_10.l3, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoTextPageHelper@d11d.enterPhotoModeFullPage$1$1");
    }

    public static final void run$1(ARunnableS19S0400000_10 aRunnableS19S0400000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ImageLandingItemBaseAssem@b9d1.displayImage$1$1");
        try {
            ImageLandingItemBaseAssem imageLandingItemBaseAssem = (ImageLandingItemBaseAssem) aRunnableS19S0400000_10.l0;
            C21512819Ha c21512819Ha = (C21512819Ha) aRunnableS19S0400000_10.l1;
            Bitmap bitmap = (Bitmap) aRunnableS19S0400000_10.l2;
            imageLandingItemBaseAssem.getClass();
            Bitmap bitmapOp = ImageLandingItemBaseAssem.op(bitmap, c21512819Ha);
            ((C21512819Ha) aRunnableS19S0400000_10.l1).setImageDrawable(new BitmapDrawable((Resources) aRunnableS19S0400000_10.l3, bitmapOp));
            ((ImageLandingItemBaseAssem) aRunnableS19S0400000_10.l0).Ep(bitmapOp, (C21512819Ha) aRunnableS19S0400000_10.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageLandingItemBaseAssem@b9d1.displayImage$1$1");
    }

    public ARunnableS19S0400000_10(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
