package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.1E5F, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E5F implements DetailFeedService {
    public static final C1E5F LIZIZ = new C1E5F();
    public final /* synthetic */ DetailFeedService LIZ = (DetailFeedService) ServiceManager.get().getService(DetailFeedService.class);

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LIZ(Context context) {
        return this.LIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZIZ(int i, String str, String str2, String str3, String str4) {
        return this.LIZ.LIZIZ(i, str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZJ(String str, String str2) {
        return this.LIZ.LIZJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJFF(Object obj) {
        return this.LIZ.LJFF(obj);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Long LJI(Fragment fragment) {
        return this.LIZ.LJI(fragment);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final C2189821An6 LJII(C19EG c19eg) {
        return this.LIZ.LJII(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Map<String, View> LJIIIIZZ(View view) {
        return this.LIZ.LJIIIIZZ(view);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final InterfaceC665370Q7z LJIIIZ(Fragment fragment) {
        return this.LIZ.LJIIIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LJIIJ(String str, String str2) {
        return this.LIZ.LJIIJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIIJJI(C19EG c19eg, boolean z) {
        this.LIZ.LJIIJJI(c19eg, z);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIIL(Context context, String str, String str2, String str3, int i, String str4, View view, Bundle bundle) {
        this.LIZ.LJIIL(context, str, str2, str3, i, str4, view, bundle);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJIILIIL(int i, String str) {
        return this.LIZ.LJIILIIL(i, str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJIILJJIL(String str, String str2, String str3) {
        return this.LIZ.LJIILJJIL(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJIILL(Activity activity) {
        return this.LIZ.LJIILL(activity);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJIIZILJ(Object obj) {
        return this.LIZ.LJIIZILJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final boolean LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final View LJIJI(View view) {
        return this.LIZ.LJIJI(view);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final void LJIJJ() {
        this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Class<? extends Activity> LJIJJLI() {
        return this.LIZ.LJIJJLI();
    }
}
