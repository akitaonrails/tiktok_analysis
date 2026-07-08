package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerPreloadConfig;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452170HoF {
    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(boolean z) {
        long j;
        CommentWithStickerPreloadConfig.CommentStickerPreloadConfig commentStickerPreloadConfig;
        C01GW c01gw = CommentWithStickerPreloadConfig.LIZIZ;
        CommentWithStickerPreloadConfig.CommentStickerPreloadConfig commentStickerPreloadConfig2 = (CommentWithStickerPreloadConfig.CommentStickerPreloadConfig) c01gw.getValue();
        if (commentStickerPreloadConfig2 != null && commentStickerPreloadConfig2.enableStickerPreload == 1 && CommentWithStickerExp.LIZIZ() && !C459990I2b.LIZLLL) {
            C459990I2b.LIZLLL = true;
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            RunnableC452160HoE runnableC452160HoE = new Runnable() { // from class: X.0HoE
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommentStickerHelper$Companion@6cb6.preloadStickerPanelData$1");
                    try {
                        IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJJIIJ("comment");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommentStickerHelper$Companion@6cb6.preloadStickerPanelData$1");
                }
            };
            if (z && (commentStickerPreloadConfig = (CommentWithStickerPreloadConfig.CommentStickerPreloadConfig) c01gw.getValue()) != null) {
                j = commentStickerPreloadConfig.delayTime;
            } else {
                j = 0;
            }
            C786410Ut5.LJLIIL(j, bPEAHandler, runnableC452160HoE);
        }
    }

    public static Drawable LIZIZ(Context context, int i, int i2, Integer num, Integer num2, int i3) {
        int iIntValue;
        Float fValueOf = null;
        if (context == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i3;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            int iIntValue2 = numLIZJ.intValue();
            tuxIconDrawableLIZ.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(iIntValue2), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(iIntValue2), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(iIntValue2), 0.0f, 0.0f, 0.0f, Color.alpha(iIntValue2) / 255.0f, 0.0f}));
        }
        C384050F3z c384050F3z = new C384050F3z();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = i2;
        }
        c384050F3z.LJII = iIntValue;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        c384050F3z.LJI = i2;
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        if (context.getResources() != null) {
            fValueOf = Float.valueOf(r1.getDimensionPixelOffset(R.dimen.ju));
        }
        c384050F3z.LIZJ = fValueOf;
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }
}
