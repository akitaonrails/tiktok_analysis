package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.AddMemberHelper$openAddMemberPanelForPublicGroup$1$tabs$1", f = "AddMemberHelper.kt", l = {175}, m = "invokeSuspend")
public final class C0NZJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InvitationListTabInfo>>, Object> {
    public int LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZJ(C0Y8T c0y8t, InterfaceC1364105Vn<? super C0NZJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMemberHelper@47bc.openAddMemberPanelForPublicGroup$1$tabs$1");
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
            C0NZN c0nzn = C0NZN.LIZ;
            C0Y8T c0y8t = this.LLILLJJLI;
            this.LL = 1;
            obj = c0nzn.LIZ(c0y8t, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AddMemberHelper@47bc.openAddMemberPanelForPublicGroup$1$tabs$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AddMemberHelper@47bc.openAddMemberPanelForPublicGroup$1$tabs$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends InvitationListTabInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
