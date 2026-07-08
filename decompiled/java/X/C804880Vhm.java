package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Vhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImp.task.FriendsTabInitTask$run$1", f = "FriendsTabInitTask.kt", l = {51}, m = "invokeSuspend")
public final class C804880Vhm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C804880Vhm(InterfaceC1364105Vn<? super C804880Vhm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804880Vhm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabInitTask@a5a9.run$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(15000L, this) == objLJFF) {
                C1C7U.LIZIZ("FriendsTabInitTask@a5a9.run$1");
                return objLJFF;
            }
        }
        C1593830rZt.LIZIZ.LIZ();
        C797820VRk.LIZIZ.LIZ();
        C0VRX.LIZIZ.LIZ();
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService != null) {
            iFollowReadService.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabInitTask@a5a9.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C804880Vhm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
