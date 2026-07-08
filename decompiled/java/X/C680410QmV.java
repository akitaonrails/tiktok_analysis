package X;

import Y.ARunnableS110S0100000_10;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0QmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680410QmV {
    /* JADX WARN: Type inference failed for: r0v32, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v7, types: [REQUEST, X.0kbR] */
    public static final void LIZIZ(C680400QmU c680400QmU) {
        C1324630kZh c1324630kZh;
        boolean z;
        C1325700kbQ c1325700kbQLIZ;
        C1325710kbR[] c1325710kbRArr;
        C1325700kbQ c1325700kbQLIZ2;
        C1325710kbR c1325710kbRLIZ;
        C1325700kbQ c1325700kbQLIZ3;
        ?? LIZ;
        List<String> urlList;
        int i;
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C2487409ou.LIZJ(new ARunnableS110S0100000_10(c680400QmU, 153));
            return;
        }
        ImageView imageView = c680400QmU.LIZ;
        if (imageView == null) {
            return;
        }
        boolean z2 = imageView instanceof C1322110kVd;
        if (z2) {
            ((C1322090kVb) imageView).getHierarchy();
        }
        int i2 = c680400QmU.LIZJ;
        if (i2 > 0 && (i = c680400QmU.LIZLLL) > 0) {
            c1324630kZh = new C1324630kZh(i2, i);
        } else {
            c1324630kZh = null;
        }
        UrlModel urlModel = c680400QmU.LIZIZ;
        if (urlModel != null && urlModel.getUrlList() != null && (urlList = urlModel.getUrlList()) != null && urlList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && z2) {
            EnumC1331380kka enumC1331380kka = EnumC1331380kka.MEDIUM;
            Bitmap.Config config = Bitmap.Config.RGB_565;
            UrlModel urlModel2 = c680400QmU.LIZIZ;
            boolean z3 = c680400QmU.LJII;
            if (urlModel2 == null) {
                c1325710kbRArr = new C1325710kbR[0];
            } else {
                ArrayList arrayList = new ArrayList();
                List<String> urlList2 = urlModel2.getUrlList();
                if (urlList2 != null) {
                    for (String str : urlList2) {
                        if (str != null && str.length() != 0 && (c1325700kbQLIZ2 = LIZ(str, enumC1331380kka, config, c1324630kZh, z3)) != null && (c1325710kbRLIZ = c1325700kbQLIZ2.LIZ()) != null) {
                            arrayList.add(c1325710kbRLIZ);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    c1325710kbRArr = new C1325710kbR[0];
                } else {
                    c1325710kbRArr = (C1325710kbR[]) arrayList.toArray(new C1325710kbR[0]);
                }
            }
            if (c1325710kbRArr.length == 0) {
                return;
            }
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            C1322090kVb c1322090kVb = (C1322090kVb) imageView;
            c1320810kTXLIZJ.LJIILJJIL = c1322090kVb.getController();
            c1320810kTXLIZJ.LJFF(c1325710kbRArr, true);
            if (!TextUtils.isEmpty(c680400QmU.LJFF) && (c1325700kbQLIZ3 = LIZ(c680400QmU.LJFF, EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565, c1324630kZh, c680400QmU.LJII)) != null && (LIZ = c1325700kbQLIZ3.LIZ()) != 0) {
                c1320810kTXLIZJ.LJ = LIZ;
                c1320810kTXLIZJ.LJIIL = true;
            }
            if (TextUtils.isEmpty("")) {
                c1320810kTXLIZJ.LJIIIIZZ = c680400QmU.LJ;
            } else {
                c1320810kTXLIZJ.LJIIIIZZ = new C1339410kxX(c680400QmU, 7);
            }
            c1320810kTXLIZJ.LIZJ = "";
            c1320810kTXLIZJ.LJIIJJI = c680400QmU.LJI;
            c1322090kVb.setController(c1320810kTXLIZJ.LIZ());
            return;
        }
        if (TextUtils.isEmpty(null) || !z2 || (c1325700kbQLIZ = LIZ(null, null, null, c1324630kZh, c680400QmU.LJII)) == null) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        C1322090kVb c1322090kVb2 = (C1322090kVb) imageView;
        c1320810kTXLIZJ2.LJIILJJIL = c1322090kVb2.getController();
        c1320810kTXLIZJ2.LIZLLL = c1325700kbQLIZ.LIZ();
        if (TextUtils.isEmpty("")) {
            c1320810kTXLIZJ2.LJIIIIZZ = c680400QmU.LJ;
        } else {
            c1320810kTXLIZJ2.LJIIIIZZ = new C1339410kxX(c680400QmU, 7);
        }
        c1320810kTXLIZJ2.LJIIJJI = c680400QmU.LJI;
        c1320810kTXLIZJ2.LIZJ = "";
        c1322090kVb2.setController(c1320810kTXLIZJ2.LIZ());
    }

    public static C1325700kbQ LIZ(String str, EnumC1331380kka enumC1331380kka, Bitmap.Config config, C1324630kZh c1324630kZh, boolean z) {
        boolean z2;
        Uri uriFromFile;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1325700kbQ c1325700kbQLIZLLL = null;
        if (z2) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "/", false)) {
            uriFromFile = Uri.fromFile(new C0VSJ(str));
        } else {
            uriFromFile = UriProtector.parse(str);
        }
        if (uriFromFile != null) {
            c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriFromFile);
            if (enumC1331380kka != null) {
                c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
            }
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            imageDecodeOptionsBuilder.LJFF = z;
            if (config != null) {
                imageDecodeOptionsBuilder.setBitmapConfig(config);
            }
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            if (c1324630kZh != null) {
                c1325700kbQLIZLLL.LIZJ = c1324630kZh;
            }
        }
        return c1325700kbQLIZLLL;
    }
}
