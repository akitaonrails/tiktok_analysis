package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0N3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587770N3n extends C09AY implements InterfaceC1685420txc<Bitmap, Throwable, String, Integer, Integer, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ EnumC587690N3f LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C587770N3n(Aweme aweme, long j, EnumC587690N3f enumC587690N3f, int i) {
        super(5);
        this.LL = aweme;
        this.LLILLJJLI = j;
        this.LLILLL = enumC587690N3f;
        this.LLILZ = i;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Bitmap bitmap, Throwable th, String str, Integer num, Integer num2) {
        int i;
        UrlModel urlModel;
        Throwable th2 = th;
        C0N3Z.LIZ.getClass();
        C01GW c01gw = C0N3Z.LIZIZ;
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download bitmap aweme ");
        sbLIZ.append(this.LL.getAid());
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (th2 == null) {
            i = 1;
        } else {
            i = 0;
        }
        C0N3Z.LIZJ(i, 0, SystemClock.elapsedRealtime() - this.LLILLJJLI, EnumC587710N3h.BITMAP, this.LLILLL, th2);
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(this.LL, 0, false);
        if (photoModeImageLJIILIIL != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null) {
            Aweme aweme = this.LL;
            if (bitmap != null) {
                AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cache bitmap map ");
                sbLIZ2.append(aweme.getAid());
                sbLIZ2.append(", baseImageUrlModel ---> ");
                sbLIZ2.append(new C03IT(urlModel.getUrlList()));
                abstractC1604130rqV2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C0N3Z.LIZJ.put(new C03IT(urlModel.getUrlList()).toString(), bitmap);
            }
        }
        if (this.LLILZ > 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            Aweme aweme2 = this.LL;
            c1ee2.LJJLIIIIJ(aweme2, 1, new C587780N3o(aweme2, th2, jElapsedRealtime, this.LLILLL));
        }
        return Unit.LIZ;
    }
}
