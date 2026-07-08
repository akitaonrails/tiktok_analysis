package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.ToastDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0i7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM$refreshPanelAfterAction$1", f = "GroupInvitationVM.kt", l = {468}, m = "invokeSuspend")
public final class C1230250i7T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupInvitationVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230250i7T(GroupInvitationVM groupInvitationVM, InterfaceC1364105Vn<? super C1230250i7T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupInvitationVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230250i7T(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        GroupInvitePopupResponse groupInvitePopupResponse;
        ToastDisplayMeta toastDisplayMeta;
        C1C7U.LIZ("GroupInvitationVM@e2e3.refreshPanelAfterAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1230240i7S c1230240i7S = new C1230240i7S(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1230240i7S);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GroupInvitationVM@e2e3.refreshPanelAfterAction$1");
                    return objLJFF;
                }
            }
            groupInvitePopupResponse = (GroupInvitePopupResponse) obj;
            toastDisplayMeta = groupInvitePopupResponse.toastMeta;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.DQ2(C459080HzO.LJ().getString(2131835079), false);
        }
        if (((int) toastDisplayMeta.statusCode) != 0) {
            this.LLILLJJLI.DQ2(toastDisplayMeta.text, false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupInvitationVM@e2e3.refreshPanelAfterAction$1");
            return unit;
        }
        C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
        int i2 = groupInvitePopupResponse.popupMeta.userGroupStatus;
        c1229970i71.getClass();
        EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(i2);
        InterfaceC1229620i6S interfaceC1229620i6SZQ2 = this.LLILLJJLI.zQ2();
        if (interfaceC1229620i6SZQ2 != null) {
            interfaceC1229620i6SZQ2.LIZJ(enumC1229960i70LIZ, groupInvitePopupResponse.popupMeta);
        }
        this.LLILLJJLI.setState(new AwS598S0100000_19(groupInvitePopupResponse, 615));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationVM@e2e3.refreshPanelAfterAction$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
