package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Oeb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624550Oeb {
    public static final void LIZLLL(TuxTextView tuxTextView, String str) {
        if (str == null) {
            return;
        }
        C01GW c01gw = C2248361CzK.LIZ;
        Integer numLJ = C2248361CzK.LJ(tuxTextView.getContext(), str);
        if (numLJ != null) {
            tuxTextView.setTextColor(numLJ.intValue());
        }
    }

    public static void LJ(TuxIconView tuxIconView, TuxImageModel tuxImageModel) {
        ImageUrlModel imageUrlModelLIZIZ;
        if (tuxIconView != null) {
            if (tuxImageModel != null) {
                imageUrlModelLIZIZ = C0OSD.LIZIZ(tuxIconView.getContext(), tuxImageModel);
            } else {
                imageUrlModelLIZIZ = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
            c1331670kl3LJIIIIZZ.LJJI(tuxIconView);
            c1331670kl3LJIIIIZZ.LJIIJ(null);
        }
    }

    public static final int LIZ(BitmapFactory.Options options, int i, int i2) {
        Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        int i3 = 1;
        if (iIntValue > i2 || iIntValue2 > i) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static final int LIZIZ(int i, int i2, View view) {
        try {
            return view.getContext().getResources().getDimensionPixelSize(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getDimensionPixelSizeSafe failed, resId not found: ");
            sbLIZ.append(i);
            sbLIZ.append(". e:");
            sbLIZ.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        }
    }

    public static final void LIZJ(ImageView imageView, String str, String str2, int i, int i2) {
        boolean zLIZLLL = C10UZ.LIZLLL(imageView.getContext());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(C364401bG.LIZ("quick_create_sheet", str2, zLIZLLL));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            if (new C0VSJ(strLIZIZ).exists() && i > 0 && i2 > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(strLIZIZ, options);
                options.inSampleSize = LIZ(options, i, i2);
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLIZIZ, options);
                if (bitmapDecodeFile != null) {
                    imageView.setImageBitmap(bitmapDecodeFile);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quick create page loadFileImage error, imagePath: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", width: ");
            sbLIZ2.append(i);
            sbLIZ2.append(", height: ");
            sbLIZ2.append(i2);
            sbLIZ2.append(". ");
            sbLIZ2.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
