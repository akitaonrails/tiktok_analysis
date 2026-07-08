package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.assemble.other.UserProfileInfoAssem;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ig8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.assemble.other.UserProfileInfoAssem$onCreate$2$1", f = "UserProfileInfoAssem.kt", l = {286}, m = "invokeSuspend")
public final class C1251740ig8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UIAssem LLILLJJLI;
    public final /* synthetic */ UserProfileInfoAssem LLILLL;
    public final /* synthetic */ C291001Au<Pair<ProfileUser, User>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1251740ig8(UIAssem uIAssem, UserProfileInfoAssem userProfileInfoAssem, C291001Au<? extends Pair<ProfileUser, ? extends User>> c291001Au, InterfaceC1364105Vn<? super C1251740ig8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = uIAssem;
        this.LLILLL = userProfileInfoAssem;
        this.LLILZ = c291001Au;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1251740ig8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r7 = "UserProfileInfoAssem@6dc0.onCreate$2$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L7e
            X.C155000ia.LIZIZ(r14)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L19:
            X.C155000ia.LIZIZ(r14)
            com.bytedance.assem.arch.core.UIAssem r0 = r13.LLILLJJLI
            androidx.lifecycle.LifecycleRegistry r8 = r0.getLifecycle()
            com.bytedance.assem.arch.core.UIAssem r4 = r13.LLILLJJLI
            com.ss.android.ugc.profile.platform.base.assemble.other.UserProfileInfoAssem r3 = r13.LLILLL
            X.01Au<kotlin.Pair<com.ss.android.ugc.profile.platform.base.data.ProfileUser, com.ss.android.ugc.aweme.profile.model.User>> r2 = r13.LLILZ
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.RESUMED
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r11 = r0.LLIILII()
            kotlin.coroutines.CoroutineContext r0 = r13.getContext()
            boolean r10 = r11.isDispatchNeeded(r0)
            if (r10 != 0) goto L6d
            androidx.lifecycle.Lifecycle$State r1 = r8.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 == r0) goto L86
            androidx.lifecycle.Lifecycle$State r0 = r8.getCurrentState()
            int r0 = r0.compareTo(r9)
            if (r0 < 0) goto L6d
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "handleResume："
            r1.append(r0)
            boolean r0 = X.C1578630rBN.LJIIJ(r4)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "UserProfileInfoAssem"
            X.C1720106oR.LIZ(r0, r1)
            r3.cp(r2)
            goto L13
        L6d:
            X.0ig7 r12 = new X.0ig7
            r12.<init>()
            r13.LL = r6
            java.lang.Object r0 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r8, r9, r10, r11, r12, r13)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r7)
            return r5
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L86:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251740ig8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
