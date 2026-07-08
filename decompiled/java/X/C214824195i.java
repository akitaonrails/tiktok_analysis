package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creation.config.DMMediaAuthConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.195i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214824195i implements IBulletinBoardService {
    public static final C214824195i LIZIZ = new C214824195i();
    public final /* synthetic */ IBulletinBoardService LIZ = (IBulletinBoardService) ServiceManager.get().getService(IBulletinBoardService.class);

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LIZIZ(LifecycleOwner lifecycleOwner, String str, String str2, BaseSharePackage baseSharePackage, int i, boolean z, String str3, int i2, String str4, Function1<? super HashMap<String, String>, Unit> function1, Aweme aweme) {
        this.LIZ.LIZIZ(lifecycleOwner, str, str2, baseSharePackage, i, true, str3, i2, str4, function1, aweme);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final TuxSheet LIZJ(Bundle bundle, FragmentManager fragmentManager) {
        return this.LIZ.LIZJ(bundle, fragmentManager);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LIZLLL(int i, InterfaceC1364105Vn<? super DMMediaAuthConfig> interfaceC1364105Vn) {
        return this.LIZ.LIZLLL(i, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C0OPB LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJFF() {
        this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LJII(Context context, String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return this.LIZ.LJII(context, str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIIIIZZ() {
        this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIIIZ() {
        this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LJIIJ(Context context, String str, String str2, Map map, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        return this.LIZ.LJIIJ(context, str, str2, map, interfaceC1364105Vn, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C11NZ<Boolean> LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIILIIL(Activity activity, Bundle bundle, Function0<Unit> function0) {
        this.LIZ.LJIILIIL(activity, bundle, function0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIILJJIL(boolean z, boolean z2) {
        this.LIZ.LJIILJJIL(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIILLIIL(LifecycleOwner lifecycleOwner, Aweme aweme, AwemeSharePackage awemeSharePackage) {
        this.LIZ.LJIILLIIL(lifecycleOwner, aweme, awemeSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final String LJIIZILJ(long j) {
        return this.LIZ.LJIIZILJ(j);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIJ(boolean z) {
        this.LIZ.LJIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LJIJJ(boolean z) {
        this.LIZ.LJIJJ(z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LLIL() {
        return this.LIZ.LLIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LLILII(String str, boolean z) {
        this.LIZ.LLILII(str, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean LLILIL() {
        return this.LIZ.LLILIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void LLILL(Activity activity, View view, String str, Function0<Unit> function0) {
        this.LIZ.LLILL(activity, view, str, function0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final Object LLZZJLIL(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return this.LIZ.LLZZJLIL(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final void d0(Aweme aweme, Map<String, String> map) {
        this.LIZ.d0(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean e0() {
        return this.LIZ.e0();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService
    public final boolean isPrivateAccount() {
        return this.LIZ.isPrivateAccount();
    }
}
