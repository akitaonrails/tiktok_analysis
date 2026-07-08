package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageLoadingApi;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0I97, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I97 {
    public final UrlModel LIZ;
    public final C1322110kVd LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final C0I9I LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public final Bitmap.Config LJIILIIL;
    public final String LJIILJJIL;
    public int LJIILL;
    public C1325710kbR[] LJIILLIIL;
    public AbstractC1320710kTN LJIIZILJ;
    public C1320810kTX LJIJ;
    public final C0IE7 LJIJI = new C0IE7(this, 5);

    public final void LIZ() {
        C0I9I c0i9i;
        try {
            List<String> urlList = this.LIZ.getUrlList();
            int i = this.LJIILL;
            this.LJIILL = i + 1;
            String str = (C086I.LIZIZ(urlList) || i >= urlList.size()) ? null : (String) ListProtector.get(urlList, i);
            if (TextUtils.isEmpty(str)) {
                if (this.LJFF && (c0i9i = this.LJ) != null && c0i9i.LIZLLL()) {
                    int iLIZ = C341940Daq.LIZ(90.0d);
                    ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                    layoutParams.width = iLIZ;
                    layoutParams.height = iLIZ;
                    C786410Ut5.c7(this.LIZIZ, layoutParams);
                    return;
                }
                return;
            }
            C1325710kbR[] c1325710kbRArrLIZIZ = LIZIZ(str, this.LJIIL);
            if (this.LJIJ == null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = this.LIZIZ.getController();
                c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZIZ, true);
                c1320810kTXLIZJ.LJIIJJI = this.LJI;
                c1320810kTXLIZJ.LJIIIIZZ = this.LJIJI;
                this.LJIJ = c1320810kTXLIZJ;
            }
            this.LJIJ.LJFF(c1325710kbRArrLIZIZ, true);
            if (this.LJIIZILJ == null) {
                this.LJIIZILJ = this.LJIJ.LIZ();
            }
            this.LIZIZ.setController(this.LJIIZILJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C0I97(C0I66 c0i66) {
        this.LIZIZ = c0i66.LIZIZ;
        this.LIZ = c0i66.LIZ;
        this.LIZJ = c0i66.LIZJ;
        this.LIZLLL = c0i66.LIZLLL;
        this.LJ = c0i66.LJ;
        this.LJII = c0i66.LJII;
        this.LJIIIIZZ = c0i66.LJIIIIZZ;
        this.LJFF = c0i66.LJFF;
        this.LJI = c0i66.LJI;
        this.LJIIIZ = c0i66.LJIIIZ;
        this.LJIIJJI = c0i66.LJIIJJI;
        this.LJIIJ = c0i66.LJIIJ;
        this.LJIIL = c0i66.LJIIL;
        this.LJIILIIL = c0i66.LJIILIIL;
        this.LJIILJJIL = c0i66.LJIILJJIL;
    }

    public final C1325710kbR[] LIZIZ(String str, boolean z) {
        int i;
        if (this.LJIILLIIL == null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(this.LJIILIIL);
            imageDecodeOptionsBuilder.LIZIZ(this.LJIIJJI);
            imageDecodeOptionsBuilder.LJ = this.LJIIJ;
            imageDecodeOptionsBuilder.LIZLLL = this.LJIIIIZZ;
            imageDecodeOptionsBuilder.LJFF = this.LJIIIZ;
            C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJFF = c1329360khK;
            if (z) {
                HashMap map = new HashMap();
                map.put("__NO_COOKIE", "1");
                IMImageLoadingApi.LIZ.getClass();
                IMImageLoadingApi value = C0I9O.LIZIZ.getValue();
                if (value != null) {
                    value.LIZIZ(c1325700kbQLIZLLL, map);
                }
            }
            int i2 = this.LIZLLL;
            if (i2 > 0 && (i = this.LIZJ) > 0) {
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i, i2);
            }
            String str2 = this.LJIILJJIL;
            if (str2 != null) {
                c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
                c1325700kbQLIZLLL.LJIJI = str2;
            }
            this.LJIILLIIL = new C1325710kbR[]{c1325700kbQLIZLLL.LIZ()};
        }
        return this.LJIILLIIL;
    }
}
