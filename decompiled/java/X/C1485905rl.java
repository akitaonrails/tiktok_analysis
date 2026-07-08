package X;

import android.util.Log;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legacy.select.SelectedCardVM$followUsers$2", f = "SelectedCardVM.kt", l = {}, m = "invokeSuspend")
public final class C1485905rl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SelectedCardVM LLILLJJLI;
    public final /* synthetic */ List<User> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1485905rl(SelectedCardVM selectedCardVM, List<? extends User> list, InterfaceC1364105Vn<? super C1485905rl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectedCardVM;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1485905rl c1485905rl = new C1485905rl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1485905rl.LL = obj;
        return c1485905rl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        int i2;
        C1C7U.LIZ("SelectedCardVM@b606.followUsers$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LLILLJJLI.LLJILJILJ.getValue(), true)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SelectedCardVM@b606.followUsers$2");
            return unit;
        }
        this.LLILLJJLI.LLJILJILJ.postValue(true);
        List<User> list = this.LLILLL;
        SelectedCardVM selectedCardVM = this.LLILLJJLI;
        try {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (User user : list) {
                IUserService iUserService = selectedCardVM.LLILZLL;
                String uid = user.getUid();
                if (user.getFollowStatus() >= 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                FollowStatus followStatusLJII = iUserService.LJII(i, uid, user.getSecUid());
                if (followStatusLJII != null) {
                    followStatusLJII.checkValid();
                    if (user.getFollowStatus() >= 1) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    user.setFollowStatus(i2);
                    arrayList.add(C2201951BFx.LIZ(user));
                } else {
                    throw new IllegalStateException("follow result is illegal");
                }
            }
            selectedCardVM.LLJIJIL.postValue(arrayList);
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "source_default_key", InterfaceC1337505Lh.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                interfaceC1555100qZQLIZIZ.LIZIZ(new AwS581S0100000_2((List) list, (List<ActionBarButtonConfBusiness>) 703));
            }
            c098200Yq = C2286608xc.LJ(Log.i("SelectCard", "follow success!"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            SelectedCardVM selectedCardVM2 = this.LLILLJJLI;
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SelectCard", "follow net work error!", thM5exceptionOrNullimpl);
            C0O3Q.LIZ(ActivityStack.getTopActivity(), thM5exceptionOrNullimpl);
            selectedCardVM2.LLILLL = false;
        }
        this.LLILLJJLI.LLJILJILJ.postValue(false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SelectedCardVM@b606.followUsers$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
