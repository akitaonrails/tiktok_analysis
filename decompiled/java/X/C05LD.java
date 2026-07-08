package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.user.repository.UserState;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewholder.IFollowItemCell$handleUserStateUpdate$3", f = "IFollowItemCell.kt", l = {442}, m = "invokeSuspend")
public final class C05LD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserState LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LD(UserState userState, InterfaceC1364105Vn<? super C05LD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userState;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IFollowItemCell@2d08.handleUserStateUpdate$3");
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
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List listSingletonList = Collections.singletonList(this.LLILLJJLI.getUser().getUid());
            this.LL = 1;
            if (interfaceC1725106pFLIZ.LJII("im_followstatus", listSingletonList, this, true, true, false) == objLJFF) {
                C1C7U.LIZIZ("IFollowItemCell@2d08.handleUserStateUpdate$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IFollowItemCell@2d08.handleUserStateUpdate$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
