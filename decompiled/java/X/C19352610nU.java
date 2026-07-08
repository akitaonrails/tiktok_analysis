package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10nU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19352610nU {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(468));

    public static final void LIZ(final int i, final int i2) {
        if (i > 0 && i2 > 0) {
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.10nT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchPhotoSlideSizeCache@507a.updateSearchPhotoSlideViewSizeCache$1");
                    try {
                        C01GW c01gw = C19352610nU.LIZ;
                        ((Keva) c01gw.getValue()).storeInt("slide_img_width", i);
                        ((Keva) c01gw.getValue()).storeInt("slide_img_height", i2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchPhotoSlideSizeCache@507a.updateSearchPhotoSlideViewSizeCache$1");
                }
            });
        }
    }
}
