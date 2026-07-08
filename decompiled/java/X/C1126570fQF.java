package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;

/* JADX INFO: renamed from: X.0fQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126570fQF {
    public static int LIZ = -1;

    public static int LIZJ() {
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        int iLIZ = C439101nJ.LIZ(56);
        LIZ = iLIZ;
        return iLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(ImageModel imageModel, C1324720kZq c1324720kZq) {
        C1325710kbR[] c1325710kbRArrLJ;
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (C1819620xS4.LIZLLL(imageModel)) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
                c1324610kZfLIZJ.LJIL = true;
                c1324610kZfLIZJ.LJJI(c1324720kZq);
                return;
            }
            return;
        }
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0 || (c1325710kbRArrLJ = C1324570kZb.LJ(imageModel, null, null, false)) == 0 || c1325710kbRArrLJ.length == 0) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
        c1320810kTXLIZJ.LJIIJJI = true;
        if (!C1322020kVU.LIZ()) {
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJ, true);
        } else if (c1325710kbRArrLJ.length == 1) {
            c1320810kTXLIZJ.LIZLLL = c1325710kbRArrLJ[0];
        } else {
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJ, false);
        }
        c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
    }

    public static C19482711Kf LIZIZ(final C1324720kZq c1324720kZq, final ImageModel imageModel, final int i, final int i2, final int i3) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU(imageModel, i, i2, i3) { // from class: X.0fRQ
            public final /* synthetic */ ImageModel LIZIZ;
            public final /* synthetic */ int LIZJ;

            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<AbstractC1127100fR6> c09aj) {
                Drawable drawable;
                C1C7U.LIZ("GiftImageLoaderExperimentHelper@969a.bindImageRxJava$1");
                C1151780g4u c1151780g4u = new C1151780g4u((C19482611Ke) c09aj, 3);
                C1324720kZq c1324720kZq2 = this.LIZ;
                ImageModel imageModel2 = this.LIZIZ;
                int i4 = this.LIZJ;
                if (i4 <= 0) {
                    drawable = null;
                } else {
                    drawable = C497740JfY.LJII().getResources().getDrawable(i4);
                }
                C1324570kZb.LIZJ(c1324720kZq2, imageModel2, drawable, null, c1151780g4u, false);
                C1C7U.LIZIZ("GiftImageLoaderExperimentHelper@969a.bindImageRxJava$1");
            }
        });
    }

    public static void LIZLLL(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, C0IYA c0iya, int i4) {
        C0IYA c0iya2 = c0iya;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 4) != 0) {
            i7 = -1;
        }
        if ((i4 & 8) != 0) {
            i6 = -1;
        }
        if ((i4 & 32) != 0) {
            i5 = -1;
        }
        if ((i4 & 64) != 0) {
            c0iya2 = null;
        }
        C0JSS.LIZJ(i7, i6, i5, imageView, imageModel, c0iya2, false);
    }

    public static C19482711Kf LJ(ImageView imageView, ImageModel imageModel, int i, int i2, boolean z, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i = -1;
        }
        if ((i4 & 8) != 0) {
            i2 = -1;
        }
        if ((i4 & 16) != 0) {
            z = false;
        }
        if ((i4 & 32) != 0) {
            i3 = -1;
        }
        return C11NZ.LJIJJLI(new C1127290fRP(imageView, imageModel, i, i2, z, i3));
    }
}
