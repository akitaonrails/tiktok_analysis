package X;

import Y.ACallableS68S1200000_8;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.vesdk.VEMediaParser;
import java.util.LinkedHashMap;
import v7.o;

/* JADX INFO: renamed from: X.0L3M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3M implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ VEMediaParserFrameProviderImpl LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ o<Bitmap> LLILZ;
    public final /* synthetic */ String LLILZIL;

    public C0L3M(String str, VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, int i, o<Bitmap> oVar, String str2) {
        this.LL = str;
        this.LLILLJJLI = vEMediaParserFrameProviderImpl;
        this.LLILLL = i;
        this.LLILZ = oVar;
        this.LLILZIL = str2;
    }

    public final void LIZ() {
        if (!C2286708xd.LJIILL(this.LL)) {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) this.LLILLJJLI.LLILLL).get(this.LL);
            if (vEMediaParser == null) {
                VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = this.LLILLJJLI;
                String str = this.LL;
                vEMediaParser = new VEMediaParser();
                vEMediaParser.init(str);
                vEMediaParserFrameProviderImpl.LLILLL.put(str, vEMediaParser);
            }
            o<Bitmap> oVar = this.LLILZ;
            VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl2 = this.LLILLJJLI;
            LIZIZ(oVar, vEMediaParserFrameProviderImpl2, this.LLILZIL, vEMediaParser.getVideoFrame(this.LLILLL, -1, vEMediaParserFrameProviderImpl2.LLILZIL, vEMediaParserFrameProviderImpl2.LLILLJJLI), true);
            return;
        }
        UrlModel urlModel = new UrlModel();
        String strLIZIZ = this.LL;
        if (!C2471909mP.LJJIIZI(strLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        urlModel.setUri(strLIZIZ);
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strLIZIZ));
        final VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl3 = this.LLILLJJLI;
        int i = vEMediaParserFrameProviderImpl3.LLILZIL;
        final o<Bitmap> oVar2 = this.LLILZ;
        final String str2 = this.LLILZIL;
        C1324750kZt.LJIJ(urlModel, i, i, new C092O() { // from class: X.0L3P
            @Override // X.C092O
            public final void accept(Object obj) {
                C0L3M.LIZIZ(oVar2, vEMediaParserFrameProviderImpl3, str2, (Bitmap) obj, false);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEMediaParserFrameProviderImpl@276f.getBitmapByExtractFrame$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEMediaParserFrameProviderImpl@276f.getBitmapByExtractFrame$1");
    }

    public static final void LIZIZ(o<Bitmap> oVar, VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            if (!bitmap.isRecycled() && z) {
                C15O7.LIZIZ(new ACallableS68S1200000_8(vEMediaParserFrameProviderImpl, str, bitmap, 2), C15O7.LJI, null);
            }
            oVar.LIZJ(bitmap);
            return;
        }
        oVar.LIZIZ(new Exception());
    }
}
