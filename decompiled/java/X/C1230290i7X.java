package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS6S1010000_19;
import njp.a;

/* JADX INFO: renamed from: X.0i7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM$getConversationAndJoinGroup$1$onSuccess$1", f = "GroupInvitationVM.kt", l = {}, m = "invokeSuspend")
public final class C1230290i7X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ GroupInvitationVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AbstractC1230540i7w LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230290i7X(C0Y8T c0y8t, GroupInvitationVM groupInvitationVM, Context context, AbstractC1230540i7w abstractC1230540i7w, String str, View view, InterfaceC1364105Vn<? super C1230290i7X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y8t;
        this.LLILLJJLI = groupInvitationVM;
        this.LLILLL = context;
        this.LLILZ = abstractC1230540i7w;
        this.LLILZIL = str;
        this.LLILZLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230290i7X(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupInvitationVM@e2e3.getConversationAndJoinGroup$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8t = this.LL;
        if (c0y8t != null && c0y8t.isMember()) {
            GroupInvitationVM groupInvitationVM = this.LLILLJJLI;
            groupInvitationVM.getClass();
            groupInvitationVM.setState(new AwS6S1010000_19(false, null, 0));
            C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
            Context context = this.LLILLL;
            C1229500i6G joinGroupEnterChatParams = this.LLILZ.getJoinGroupEnterChatParams();
            String str = this.LLILZIL;
            c1230440i7m.getClass();
            C1230440i7m.LJ(context, joinGroupEnterChatParams, str);
            this.LLILLJJLI.xQ2(new C1230320i7a(this.LLILZIL));
        } else {
            this.LLILLJJLI.CQ2(this.LLILLL, this.LLILZLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationVM@e2e3.getConversationAndJoinGroup$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
