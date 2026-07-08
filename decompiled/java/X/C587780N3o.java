package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0N3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587780N3o extends C09AY implements InterfaceC1685420txc<Bitmap, Throwable, String, Integer, Integer, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ EnumC587690N3f LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C587780N3o(Aweme aweme, Throwable th, long j, EnumC587690N3f enumC587690N3f) {
        super(5);
        this.LL = aweme;
        this.LLILLJJLI = th;
        this.LLILLL = j;
        this.LLILZ = enumC587690N3f;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Bitmap bitmap, Throwable th, String str, Integer num, Integer num2) {
        int i;
        UrlModel urlModel;
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(this.LL, 1, false);
        if (photoModeImageLJIILIIL != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null && bitmap != null) {
            C0N3Z.LIZJ.put(new C03IT(urlModel.getUrlList()).toString(), bitmap);
        }
        C0N3Z c0n3z = C0N3Z.LIZ;
        Throwable th2 = this.LLILLJJLI;
        if (th2 == null) {
            i = 1;
        } else {
            i = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLL;
        EnumC587690N3f enumC587690N3f = this.LLILZ;
        EnumC587710N3h enumC587710N3h = EnumC587710N3h.BITMAP;
        c0n3z.getClass();
        C0N3Z.LIZJ(i, 1, jElapsedRealtime, enumC587710N3h, enumC587690N3f, th2);
        return Unit.LIZ;
    }
}
