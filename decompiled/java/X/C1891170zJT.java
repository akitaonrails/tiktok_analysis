package X;

import com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment$requestPushPermissionPopupWithDelay$1", f = "PushPermissionBackgroundFragment.kt", l = {243}, m = "invokeSuspend")
public final class C1891170zJT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ PushPermissionBackgroundFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891170zJT(long j, PushPermissionBackgroundFragment pushPermissionBackgroundFragment, InterfaceC1364105Vn<? super C1891170zJT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = pushPermissionBackgroundFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891170zJT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushPermissionBackgroundFragment@3adb.requestPushPermissionPopupWithDelay$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.requestPushPermissionPopupWithDelay$1");
                return objLJFF;
            }
        }
        C1911410zq7.LIZ("PushPermissionFragment", "requestPushPermissionPopupWithDelay");
        PushPermissionBackgroundFragment pushPermissionBackgroundFragment = this.LLILLL;
        if (pushPermissionBackgroundFragment.LLJJIJI != null) {
            pushPermissionBackgroundFragment.aS();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.requestPushPermissionPopupWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
