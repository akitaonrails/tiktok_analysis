package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService;
import java.util.Map;

/* JADX INFO: renamed from: X.0r9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577460r9U implements IMiniDramaSpecialCardService {
    public static final C1577460r9U LLILLJJLI = new C1577460r9U();
    public final /* synthetic */ IMiniDramaSpecialCardService LL;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final boolean LIZ() {
        return this.LL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Object LIZIZ(View view, Fragment fragment, String str) {
        return this.LL.LIZIZ(view, fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final C13IQ<? extends AbstractC738140SxQ> LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LIZLLL() {
        this.LL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Aweme LJ() {
        return this.LL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final Object LJFF(Object obj) {
        return this.LL.LJFF(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final InterfaceC1577470r9V LJI() {
        return this.LL.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJII(Map<String, String> map) {
        this.LL.LJII(map);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final View LJIIIIZZ(Context context) {
        return this.LL.LJIIIIZZ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJIIIZ(Context context, C1577450r9T c1577450r9T) {
        this.LL.LJIIIZ(context, c1577450r9T);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaSpecialCardService
    public final void LJIIJ(Map<String, ? extends Object> map) {
        this.LL.LJIIJ(map);
    }

    public C1577460r9U() {
        IMiniDramaSpecialCardService iMiniDramaSpecialCardService = (IMiniDramaSpecialCardService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaSpecialCardService.class, false, false, false, 14, null);
        if (iMiniDramaSpecialCardService != null) {
            this.LL = iMiniDramaSpecialCardService;
        } else {
            "must be provided".toString();
            throw new IllegalStateException("must be provided");
        }
    }
}
