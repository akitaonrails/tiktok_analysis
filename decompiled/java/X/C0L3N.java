package X;

import Y.ACallableS68S1200000_8;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.vesdk.VEMediaParser;
import java.util.LinkedHashMap;
import v7.o;

/* JADX INFO: renamed from: X.0L3N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3N implements Runnable {
    public final /* synthetic */ C2472709mX LL;
    public final /* synthetic */ o<Bitmap> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ VEMediaParserProviderV2 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    public C0L3N(C2472709mX c2472709mX, o<Bitmap> oVar, String str, int i, VEMediaParserProviderV2 vEMediaParserProviderV2, int i2, String str2) {
        this.LL = c2472709mX;
        this.LLILLJJLI = oVar;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = vEMediaParserProviderV2;
        this.LLILZLL = i2;
        this.LLIZ = str2;
    }

    public final void LIZ() {
        if (this.LL.LIZ()) {
            this.LLILLJJLI.LIZ();
            return;
        }
        if (!C2286708xd.LJIILL(this.LLILLL)) {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) this.LLILZIL.LLILLJJLI).get(this.LLILLL);
            if (vEMediaParser == null) {
                VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LLILZIL;
                String str = this.LLILLL;
                vEMediaParser = new VEMediaParser();
                vEMediaParser.init(str);
                vEMediaParserProviderV2.LLILLJJLI.put(str, vEMediaParser);
            }
            C2472709mX c2472709mX = this.LL;
            o<Bitmap> oVar = this.LLILLJJLI;
            VEMediaParserProviderV2 vEMediaParserProviderV22 = this.LLILZIL;
            LIZIZ(c2472709mX, oVar, vEMediaParserProviderV22, this.LLIZ, vEMediaParser.getVideoFrame(this.LLILZLL, vEMediaParserProviderV22.LLIZLLLIL, this.LLILZ, vEMediaParserProviderV22.LL), true);
            return;
        }
        UrlModel urlModel = new UrlModel();
        String strLIZIZ = this.LLILLL;
        if (!C2471909mP.LJJIIZI(strLIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        urlModel.setUri(strLIZIZ);
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strLIZIZ));
        int i = this.LLILZ;
        final C2472709mX c2472709mX2 = this.LL;
        final o<Bitmap> oVar2 = this.LLILLJJLI;
        final VEMediaParserProviderV2 vEMediaParserProviderV23 = this.LLILZIL;
        final String str2 = this.LLIZ;
        C1324750kZt.LJIJ(urlModel, i, i, new C092O() { // from class: X.0L3O
            @Override // X.C092O
            public final void accept(Object obj) {
                C0L3N.LIZIZ(c2472709mX2, oVar2, vEMediaParserProviderV23, str2, (Bitmap) obj, false);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEMediaParserProviderV2@d09d.getBitmapAsync$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEMediaParserProviderV2@d09d.getBitmapAsync$1");
    }

    public static final void LIZIZ(C2472709mX c2472709mX, o<Bitmap> oVar, VEMediaParserProviderV2 vEMediaParserProviderV2, String str, Bitmap bitmap, boolean z) {
        if (c2472709mX.LIZ()) {
            oVar.LIZ();
            return;
        }
        if (bitmap != null) {
            if (!bitmap.isRecycled() && z) {
                C15O7.LIZIZ(new ACallableS68S1200000_8(vEMediaParserProviderV2, str, bitmap, 0), C823050WQl.LIZLLL(), null);
            }
            oVar.LIZJ(bitmap);
            return;
        }
        oVar.LIZIZ(new Exception());
    }
}
