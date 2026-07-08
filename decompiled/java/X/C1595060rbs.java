package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import java.util.List;

/* JADX INFO: renamed from: X.0rbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595060rbs implements IFollowFeedService {
    public static final C1595060rbs LIZIZ = new C1595060rbs();
    public final /* synthetic */ IFollowFeedService LIZ = FollowFeedServiceImpl.LJIL();

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void E1() {
        this.LIZ.E1();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZ(Context context, List<FollowingInterestUser> list) {
        this.LIZ.LIZ(context, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C0WHU LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZJ(Context context) {
        this.LIZ.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJ(String str) {
        this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final InterfaceC1569400qwU LJFF(C19EG c19eg) {
        return this.LIZ.LJFF(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJI(String str, C059B c059b) {
        this.LIZ.LJI(str, c059b);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C0CCZ LJIIIIZZ(Context context) {
        return this.LIZ.LJIIIIZZ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIJ() {
        this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJIILIIL(C737030Svd c737030Svd) {
        return this.LIZ.LJIILIIL(c737030Svd);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILJJIL(long j) {
        this.LIZ.LJIILJJIL(j);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILL(String str, boolean z) {
        this.LIZ.LJIILL(str, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILLIIL(int i, int i2) {
        this.LIZ.LJIILLIIL(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> LJIIZILJ(List<? extends FollowFeed> list) {
        return this.LIZ.LJIIZILJ(list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends UIContentAssem> LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final long LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIJJLI(Fragment fragment) {
        return this.LIZ.LJIJJLI(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void S1() {
        this.LIZ.S1();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean T1() {
        return this.LIZ.T1();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void refreshComment(Fragment fragment) {
        this.LIZ.refreshComment(fragment);
    }
}
