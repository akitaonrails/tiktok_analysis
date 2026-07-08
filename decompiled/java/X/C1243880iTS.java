package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.FragmentSwitchViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.util.EcInboxTabConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECInboxMsgCreatorShopConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.notice.NoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.FragmentSwitchViewModel$createTabData$2", f = "FragmentSwitchViewModel.kt", l = {63}, m = "invokeSuspend")
public final class C1243880iTS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FragmentSwitchViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243880iTS(FragmentSwitchViewModel fragmentSwitchViewModel, InterfaceC1364105Vn<? super C1243880iTS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = fragmentSwitchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1243880iTS c1243880iTS = new C1243880iTS(this.LLILLL, interfaceC1364105Vn);
        c1243880iTS.LLILLJJLI = obj;
        return c1243880iTS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        boolean z3;
        String name;
        Object objLIZJ = obj;
        C1C7U.LIZ("FragmentSwitchViewModel@7f64.createTabData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1243940iTY c1243940iTY = C1243940iTY.LIZ;
            this.LL = 1;
            objLIZJ = c1243940iTY.LIZJ(interfaceC497601wk, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("FragmentSwitchViewModel@7f64.createTabData$2");
                return objLJFF;
            }
        }
        EcInboxTabConfig ecInboxTabConfig = (EcInboxTabConfig) objLIZJ;
        if (ecInboxTabConfig != null && ecInboxTabConfig.needShowCreator) {
            FragmentSwitchViewModel fragmentSwitchViewModel = this.LLILLL;
            fragmentSwitchViewModel.getClass();
            C1243860iTQ c1243860iTQ = new C1243860iTQ(false, false);
            C1243860iTQ c1243860iTQ2 = new C1243860iTQ(false, false);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin = NoticeDependencyService.createINoticeDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name2 = INoticeDependencyService.class.getName();
                if (anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INoticeDependencyService.class);
            }
            INoticeDependencyService iNoticeDependencyService = (INoticeDependencyService) anonymousClass0317CreateINoticeDependencyServicebyMonsterPlugin;
            int[] iArrLLII = C13LP.LLII(((ECInboxMsgCreatorShopConfig.MsgGroupConfig) fragmentSwitchViewModel.LL.getValue()).creatorGroups);
            int unreadSingleGroupSum = iNoticeDependencyService.getUnreadSingleGroupSum(Arrays.copyOf(iArrLLII, iArrLLII.length));
            int[] iArrLLII2 = C13LP.LLII(((ECInboxMsgCreatorShopConfig.MsgGroupConfig) fragmentSwitchViewModel.LL.getValue()).shopGroups);
            int unreadSingleGroupSum2 = iNoticeDependencyService.getUnreadSingleGroupSum(Arrays.copyOf(iArrLLII2, iArrLLII2.length));
            if (unreadSingleGroupSum > 0) {
                z = true;
            } else {
                z = false;
            }
            C1243860iTQ c1243860iTQLIZ = C1243860iTQ.LIZ(c1243860iTQ, z, 1);
            if (unreadSingleGroupSum2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1243860iTQ c1243860iTQLIZ2 = C1243860iTQ.LIZ(c1243860iTQ2, z2, 1);
            if (unreadSingleGroupSum2 > 0 && unreadSingleGroupSum <= 0) {
                c1243860iTQLIZ2 = new C1243860iTQ(true, false);
            } else {
                c1243860iTQLIZ = new C1243860iTQ(true, false);
            }
            this.LLILLL.setState(new AwS598S0100000_19(new Pair(c1243860iTQLIZ, c1243860iTQLIZ2), (Pair<C1243860iTQ, C1243860iTQ>) 579));
        } else {
            this.LLILLL.setState(AFwS257S0000000_19.get$arr$(632));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FragmentSwitchViewModel@7f64.createTabData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
