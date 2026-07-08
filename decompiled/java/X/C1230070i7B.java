package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.utils.JoinGroupHelper$realJoin$1$resp$1", f = "JoinGroupHelper.kt", l = {257}, m = "invokeSuspend")
public final class C1230070i7B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GroupJoinResponseV2>, Object> {
    public int LL;
    public final /* synthetic */ GroupJoinRequestV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230070i7B(GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super C1230070i7B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupJoinRequestV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230070i7B(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("JoinGroupHelper@86ca.realJoin$1$resp$1");
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
            C1230140i7I c1230140i7I = C1230140i7I.LIZ;
            GroupJoinRequestV2 groupJoinRequestV2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c1230140i7I.LJI(groupJoinRequestV2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("JoinGroupHelper@86ca.realJoin$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("JoinGroupHelper@86ca.realJoin$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
