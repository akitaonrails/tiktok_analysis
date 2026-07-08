package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.util.Size;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2278808wM {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(1645));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1644));

    public static Uri LIZ(C2262608tk c2262608tk) {
        if (C2471909mP.LJJIIZI(c2262608tk.LJ)) {
            return C2471909mP.LJIILIIL(c2262608tk.LJ);
        }
        if (C2471909mP.LJJIIZI(c2262608tk.LIZ)) {
            return C2471909mP.LJIILIIL(c2262608tk.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no content uri found. ");
        sbLIZ.append(c2262608tk);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Bitmap LIZIZ(C2262608tk c2262608tk, CancellationSignal cancellationSignal) {
        C01GW c01gw = LIZIZ;
        Size size = new Size(((Number) c01gw.getValue()).intValue(), ((Number) c01gw.getValue()).intValue());
        if (Build.VERSION.SDK_INT >= 29) {
            return C786410Ut5.M3(C1BWL.LIZ()).getContentResolver().loadThumbnail(LIZ(c2262608tk), size, cancellationSignal);
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c2262608tk.LJFF);
        if (lLJIILIIL == null) {
            lLJIILIIL = Long.valueOf(ContentUris.parseId(LIZ(c2262608tk)));
        }
        if (lLJIILIIL.longValue() != -1) {
            if (C1414600muo.LIZJ(c2262608tk)) {
                return MediaStore.Video.Thumbnails.getThumbnail(C786410Ut5.M3(C1BWL.LIZ()).getContentResolver(), lLJIILIIL.longValue(), 1, (BitmapFactory.Options) LIZ.getValue());
            }
            return MediaStore.Images.Thumbnails.getThumbnail(C786410Ut5.M3(C1BWL.LIZ()).getContentResolver(), CastLongProtector.parseLong(c2262608tk.LJFF), 1, (BitmapFactory.Options) LIZ.getValue());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no media system id found. ");
        sbLIZ.append(c2262608tk);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
