package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Krz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530930Krz extends C09AY implements Function2<Bitmap, Throwable, Unit> {
    public final /* synthetic */ C529750Kq5 LL;
    public final /* synthetic */ InterfaceC529900KqK LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ TikTokMediaModel LLILZ;
    public final /* synthetic */ C530920Kry LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C530930Krz(C529750Kq5 c529750Kq5, InterfaceC529900KqK interfaceC529900KqK, boolean z, TikTokMediaModel tikTokMediaModel, C530920Kry c530920Kry) {
        super(2);
        this.LL = c529750Kq5;
        this.LLILLJJLI = interfaceC529900KqK;
        this.LLILLL = z;
        this.LLILZ = tikTokMediaModel;
        this.LLILZIL = c530920Kry;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Bitmap bitmap, Throwable th) {
        C433800Gzi c433800Gzi;
        Bitmap bitmap2 = bitmap;
        Throwable th2 = th;
        InterfaceC420801kM interfaceC420801kM = this.LL.LLJLILLLLZIIL;
        if (interfaceC420801kM != null) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
            this.LL.LLJLILLLLZIIL = null;
        }
        if (bitmap2 != null) {
            this.LLILLJJLI.LIZ();
            if (this.LLILLL && this.LLILZ.LJIIJ()) {
                if (C433810Gzj.LIZ()) {
                    C530920Kry c530920Kry = this.LLILZIL;
                    C529750Kq5 c529750Kq5 = this.LL;
                    TikTokMediaModel tikTokMediaModel = this.LLILZ;
                    c530920Kry.getClass();
                    C433800Gzi c433800Gzi2 = c529750Kq5.LL;
                    if (c433800Gzi2 != null) {
                        c433800Gzi2.LJIIIZ(tikTokMediaModel, bitmap2);
                    }
                } else {
                    C530920Kry c530920Kry2 = this.LLILZIL;
                    C529750Kq5 c529750Kq52 = this.LL;
                    TikTokMediaModel tikTokMediaModel2 = this.LLILZ;
                    c530920Kry2.getClass();
                    if (C530950Ks1.LIZ(bitmap2) && (c433800Gzi = c529750Kq52.LL) != null) {
                        c433800Gzi.LJIIIZ(tikTokMediaModel2, bitmap2);
                    }
                }
            }
        } else if (th2 != null) {
            this.LLILLJJLI.onFailure(th2);
        }
        return Unit.LIZ;
    }
}
