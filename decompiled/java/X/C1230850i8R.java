package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonTrigger;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation.JoinGroupBottomButtonTrigger$onBind$3", f = "JoinGroupBottomButtonTrigger.kt", l = {96}, m = "invokeSuspend")
public final class C1230850i8R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JoinGroupBottomButtonTrigger LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230850i8R(String str, JoinGroupBottomButtonTrigger joinGroupBottomButtonTrigger, String str2, InterfaceC1364105Vn<? super C1230850i8R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = joinGroupBottomButtonTrigger;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230850i8R(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GroupInvitePopupResponse groupInvitePopupResponse;
        C1C7U.LIZ("JoinGroupBottomButtonTrigger@b2.onBind$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = JoinGroupBottomButtonTrigger.LLJLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind request verify api when rebind error: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null) {
                GroupInvitePopupRequest groupInvitePopupRequest = new GroupInvitePopupRequest(this.LLILLJJLI, 0L);
                this.LL = 1;
                obj = iMGroupChatApiLIZ.LJIILL(groupInvitePopupRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("JoinGroupBottomButtonTrigger@b2.onBind$3");
                    return objLJFF;
                }
            } else {
                groupInvitePopupResponse = null;
                this.LLILLL.yp(groupInvitePopupResponse, this.LLILZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("JoinGroupBottomButtonTrigger@b2.onBind$3");
                return unit;
            }
        }
        groupInvitePopupResponse = (GroupInvitePopupResponse) obj;
        this.LLILLL.yp(groupInvitePopupResponse, this.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("JoinGroupBottomButtonTrigger@b2.onBind$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
