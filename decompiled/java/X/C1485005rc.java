package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM$mobClickSharePop$1", f = "GroupInvitationVM.kt", l = {}, m = "invokeSuspend")
public final class C1485005rc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1230540i7w LL;
    public final /* synthetic */ GroupInvitationVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485005rc(AbstractC1230540i7w abstractC1230540i7w, GroupInvitationVM groupInvitationVM, InterfaceC1364105Vn<? super C1485005rc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1230540i7w;
        this.LLILLJJLI = groupInvitationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1485005rc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1230560i7y c1230560i7y;
        String string;
        C1C7U.LIZ("GroupInvitationVM@e2e3.mobClickSharePop$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1230540i7w abstractC1230540i7w = this.LL;
        if ((abstractC1230540i7w instanceof C1230560i7y) && (c1230560i7y = (C1230560i7y) abstractC1230540i7w) != null && (string = C2286608xc.LJFF(c1230560i7y.getSender()).toString()) != null) {
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            final GroupInvitationVM groupInvitationVM = this.LLILLJJLI;
            c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.05tI
                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
                    if (iIMGroupLiveAnalytics != null) {
                        String uid = iMUser.getUid();
                        iIMGroupLiveAnalytics.LIZ(C0I0B.LJFF.LIZIZ(), Integer.valueOf(iMUser.getFollowStatus()), uid, String.valueOf(groupInvitationVM.getState().LL.LIZ));
                    }
                }
            }, string, null, "im_chat_group", false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupInvitationVM@e2e3.mobClickSharePop$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationVM@e2e3.mobClickSharePop$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
