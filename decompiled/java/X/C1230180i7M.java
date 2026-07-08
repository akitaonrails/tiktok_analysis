package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.GroupInvitationImpl$tryOpenGroupInvitationSheet$1$resp$1", f = "GroupInvitationImpl.kt", l = {253}, m = "invokeSuspend")
public final class C1230180i7M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GroupInvitePopupResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230180i7M(String str, InterfaceC1364105Vn<? super C1230180i7M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230180i7M(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1$resp$1");
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
            GroupInvitePopupRequest groupInvitePopupRequest = new GroupInvitePopupRequest(this.LLILLJJLI, 0L);
            C1230160i7K c1230160i7K = C1230160i7K.LIZ;
            this.LL = 1;
            obj = c1230160i7K.LIZ(groupInvitePopupRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
