package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076010e6h implements IFriendsService {
    public static final C1076010e6h LIZJ = new C1076010e6h();
    public final /* synthetic */ IFriendsService LIZIZ = (IFriendsService) ServiceManager.get().getService(IFriendsService.class);

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1908760zlq LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final RelationService LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C11NZ<ShortenUrlModel> LIZJ(String str) {
        return this.LIZIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LIZLLL(Activity activity) {
        return this.LIZIZ.LIZLLL(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070270dxR LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    @InterfaceC1294060jmO
    public final void LJI(String str) {
        this.LIZIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1071740dzo LJII() {
        return this.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C0SY1 LJIIIIZZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIIZ() {
        this.LIZIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070570dxv LJIIJ() {
        return this.LIZIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIIJJI(Activity activity) {
        return this.LIZIZ.LJIIJJI(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return this.LIZIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1582690rHv LJIILIIL(C19EG c19eg) {
        return this.LIZIZ.LJIILIIL(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILJJIL() {
        this.LIZIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Fragment LJIILL(EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, int i, Function0<Unit> function0) {
        return this.LIZIZ.LJIILL(enumC1262450ixP, mufPageTrackInfo, i, function0);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    @InterfaceC1294060jmO
    public final boolean LJIILLIIL() {
        return this.LIZIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ISocialFriendsService LJIIZILJ() {
        return this.LIZIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJ(User user) {
        return this.LIZIZ.LJIJ(user);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJI() {
        return this.LIZIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJ(String str, Map map) {
        this.LIZIZ.LJIJJ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJLI() {
        this.LIZIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1074380e44 LJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, C1590150rTx c1590150rTx) {
        return this.LIZIZ.LJIL(fragment, homePageDataViewModel, c1590150rTx);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJ() {
        this.LIZIZ.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1073770e35 LJJI() {
        return this.LIZIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC1070980dya LJJIFFI(String str, LifecycleOwner lifecycleOwner) {
        return this.LIZIZ.LJJIFFI(str, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJII() {
        return this.LIZIZ.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    @InterfaceC1294060jmO
    public final void LJJIII(String str, String str2, String str3) {
        this.LIZIZ.LJJIII(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIJ(boolean z) {
        this.LIZIZ.LJJIIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC800130Va7 LJJIIJZLJL() {
        return this.LIZIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LJJIIZ(Context context, int i) {
        return this.LIZIZ.LJJIIZ(context, i);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIZI(boolean z) {
        this.LIZIZ.LJJIIZI(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIJ(String str, Map map) {
        this.LIZIZ.LJJIJ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJIIJI() {
        return this.LIZIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC800130Va7 LJJIJIIJIL() {
        return this.LIZIZ.LJJIJIIJIL();
    }
}
