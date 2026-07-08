package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.List;

/* JADX INFO: renamed from: X.0kWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322510kWH {
    public int LIZ;
    public final UrlModel LIZIZ;
    public final RemoteImageView LIZJ;
    public C1325710kbR[] LIZLLL;
    public AbstractC1320710kTN LJ;
    public C1320810kTX LJII;
    public final InterfaceC1322530kWJ LJIIIIZZ;
    public boolean LJIIIZ = true;
    public final C1322520kWI LJIIJ = new InterfaceC1320650kTH<InterfaceC1330440kj4>() { // from class: X.0kWI
        public boolean LIZ;

        @Override // X.InterfaceC1320650kTH
        public final void LIZ(String str, Throwable th) {
        }

        @Override // X.InterfaceC1320650kTH
        public final void LJFF(Object obj, String str) {
        }

        @Override // X.InterfaceC1320650kTH
        public final void LIZIZ(String str) {
            this.LIZ = false;
        }

        @Override // X.InterfaceC1320650kTH
        public final void LIZJ(Object obj, String str) {
            this.LIZ = false;
        }

        @Override // X.InterfaceC1320650kTH
        public final void LIZLLL(String str, Throwable th) {
            InterfaceC1322530kWJ interfaceC1322530kWJ = this.LIZIZ.LJIIIIZZ;
            if (interfaceC1322530kWJ != null) {
                interfaceC1322530kWJ.onFail();
            }
            this.LIZIZ.LIZ();
            this.LIZ = false;
        }

        @Override // X.InterfaceC1320650kTH
        public final void LJ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
            Animatable animatableLIZ;
            if (animatable != null) {
                this.LIZ = true;
                if (this.LIZIZ.LIZJ.getController() != null && this.LIZ && (animatableLIZ = this.LIZIZ.LIZJ.getController().LIZ()) != null && !animatableLIZ.isRunning() && this.LIZIZ.LJIIIZ) {
                    animatableLIZ.start();
                }
                InterfaceC1322530kWJ interfaceC1322530kWJ = this.LIZIZ.LJIIIIZZ;
                if (interfaceC1322530kWJ != null) {
                    interfaceC1322530kWJ.onSuccess();
                    return;
                }
                return;
            }
            this.LIZ = false;
        }
    };
    public final int LJFF = 0;
    public final int LJI = 0;

    public final void LIZ() {
        int i;
        List<String> urlList = this.LIZIZ.getUrlList();
        int i2 = this.LIZ;
        this.LIZ = i2 + 1;
        String str = (C086I.LIZIZ(urlList) || i2 >= urlList.size()) ? null : (String) ListProtector.get(urlList, i2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LIZLLL == null) {
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.LIZIZ(1);
            imageDecodeOptionsBuilder.LJ = false;
            C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJFF = c1329360khK;
            int i3 = this.LJI;
            if (i3 > 0 && (i = this.LJFF) > 0) {
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(i, i3);
            }
            this.LIZLLL = new C1325710kbR[]{c1325700kbQLIZLLL.LIZ()};
        }
        C1325710kbR[] c1325710kbRArr = this.LIZLLL;
        if (this.LJII == null) {
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = this.LIZJ.getController();
            c1320810kTXLIZJ.LJFF(c1325710kbRArr, true);
            c1320810kTXLIZJ.LJIIIIZZ = this.LJIIJ;
            this.LJII = c1320810kTXLIZJ;
        }
        this.LJII.LJFF(c1325710kbRArr, true);
        if (this.LJ == null) {
            this.LJ = this.LJII.LIZ();
        }
        this.LIZJ.setController(this.LJ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kWI] */
    public C1322510kWH(RemoteImageView remoteImageView, UrlModel urlModel, InterfaceC1322530kWJ interfaceC1322530kWJ) {
        this.LIZJ = remoteImageView;
        this.LIZIZ = urlModel;
        this.LJIIIIZZ = interfaceC1322530kWJ;
    }
}
