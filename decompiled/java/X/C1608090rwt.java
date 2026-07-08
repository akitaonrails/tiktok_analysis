package X;

import android.content.Context;
import android.text.Spanned;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608090rwt implements IRecommendUsersService {
    public static final C1608090rwt LIZIZ = new C1608090rwt();
    public final /* synthetic */ IRecommendUsersService LIZ = (IRecommendUsersService) ServiceManager.get().getService(IRecommendUsersService.class);

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final List<InboxFragmentWidgetInjectProtocol> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZJ(C19EG c19eg, String str, String str2) {
        this.LIZ.LIZJ(c19eg, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LJFF(String str, String str2) {
        return this.LIZ.LJFF(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final C13IQ<? extends UIContentAssem> LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJII(C1264600j0s c1264600j0s) {
        this.LIZ.LJII(c1264600j0s);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final Spanned LJIIIIZZ(Context context, Integer num, Integer num2, Integer num3, int i, String str, String str2, int i2, Function0<Unit> function0) {
        return this.LIZ.LJIIIIZZ(context, num, num2, num3, i, str, str2, i2, function0);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIIZ(String str, String str2) {
        this.LIZ.LJIIIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIJ(String str) {
        this.LIZ.LJIIJ(str);
    }
}
