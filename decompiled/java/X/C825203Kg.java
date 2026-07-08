package X;

import android.content.DialogInterface;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S1100100_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.ShopSkuAdapter$jumpUserRightSecondPage$1$2", f = "ShopSkuAdapter.kt", l = {558}, m = "invokeSuspend")
public final class C825203Kg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C802303Bl LLILLJJLI;
    public final /* synthetic */ UserRightDetail LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825203Kg(C802303Bl c802303Bl, UserRightDetail userRightDetail, HashMap<String, Object> map, InterfaceC1364105Vn<? super C825203Kg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c802303Bl;
        this.LLILLL = userRightDetail;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825203Kg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager fragmentManager;
        Object objLIZ;
        C1C7U.LIZ("ShopSkuAdapter@f0f7.jumpUserRightSecondPage$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Fragment fragment = this.LLILLJJLI.LL;
            if (fragment != null) {
                fragmentManager = fragment.getFragmentManager();
            } else {
                fragmentManager = null;
            }
            UserRightDetail userRightDetail = this.LLILLL;
            String str = userRightDetail.name;
            String str2 = userRightDetail.description;
            final String strLIZLLL = C960603pE.LIZLLL(this.LLILLJJLI.LLILLJJLI);
            final HashMap<String, Object> map = this.LLILZ;
            this.LL = 1;
            if (fragmentManager == null) {
                objLIZ = Unit.LIZ;
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C03E5.LIZ = c23260099m;
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                map.put("page_name", "free_return_via_drop_off");
                C770750ULh c770750ULh = new C770750ULh();
                if (str == null) {
                    str = "";
                }
                c770750ULh.LJ = str;
                if (str2 == null) {
                    str2 = "";
                }
                c770750ULh.LIZJ(str2);
                C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.03E4
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
                        String str3;
                        String name;
                        String str4;
                        String str5 = TuxSheet._pnsPageId;
                        if (Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C343980De8.LIZ) && (str4 = strLIZLLL) != null) {
                            C1748720vbi.LIZJ(str4, new C049Y(), new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 35));
                        }
                        String str6 = strLIZLLL;
                        if (str6 != null) {
                            long j = jElapsedRealtime;
                            HashMap<String, Object> map2 = map;
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                boolean z = false;
                                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                                    z = true;
                                }
                                String name2 = IActivityStackDependencyService.class.getName();
                                if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                                    name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                                } else {
                                    name = null;
                                }
                                C1AQS.LIZJ(jElapsedRealtime2, 1, name2, name, z);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                            }
                            if (((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround()) {
                                str3 = "close";
                            } else {
                                str3 = "return";
                            }
                            C1748720vbi.LIZJ(str6, new C10508049a(), new AwS18S1100100_1(SystemClock.elapsedRealtime() - j, str3, (HashMap) map2, 0));
                        }
                        C23260099m c23260099m2 = C03E5.LIZ;
                        if (c23260099m2 != null) {
                            Unit unit = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit);
                            c23260099m2.resumeWith(unit);
                        }
                        C03E5.LIZ = null;
                    }
                };
                TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
                tuxSheet.LLILLJJLI = onDismissListener;
                tuxSheet.show(fragmentManager, "returnFree");
                if (strLIZLLL != null) {
                    C1748720vbi.LIZJ(strLIZLLL, new C049Z(), new AwS580S0100000_1((HashMap) map, (HashMap<String, Object>) 36));
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ShopSkuAdapter@f0f7.jumpUserRightSecondPage$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopSkuAdapter@f0f7.jumpUserRightSecondPage$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
