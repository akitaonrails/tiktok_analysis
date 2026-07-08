package X;

import X.C11UL;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19568811hG<T extends C11UL> extends AbstractC19569011hI {
    public final AbstractC19568411hC<T, Void> LL;
    public final Function2<T, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final InterfaceC19568711hF<T, Void> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(314));

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), null, null, new C19568911hH(this, null), 3);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String message;
        InterfaceC19569411hM interfaceC19569411hM;
        this.LL.LIZ(4);
        AbstractC19568411hC<T, Void> abstractC19568411hC = this.LL;
        if (baseException != null) {
            message = baseException.getMessage();
        } else {
            message = null;
        }
        abstractC19568411hC.LJFF = new C19569211hK(baseException, -1, message);
        this.LLILLL.LIZJ(this.LL);
        T t = this.LL.LIZIZ;
        if (t instanceof C11UK) {
            InterfaceC19569411hM interfaceC19569411hM2 = C196916122o.LIZJ;
            if (interfaceC19569411hM2 != null) {
                interfaceC19569411hM2.LIZ(t.effect.getEffectId(), baseException);
                return;
            }
            return;
        }
        if (!(t instanceof C2280608we) || (interfaceC19569411hM = C196916122o.LIZJ) == null) {
            return;
        }
        interfaceC19569411hM.LIZLLL(t.effect.getEffectId(), baseException);
    }

    public C19568811hG(AbstractC19568411hC abstractC19568411hC, Function2 function2, C19568211hA c19568211hA) {
        this.LL = abstractC19568411hC;
        this.LLILLJJLI = function2;
        this.LLILLL = c19568211hA;
    }
}
