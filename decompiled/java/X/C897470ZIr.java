package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.DefaultGroupInviteCardClickHandler$handleGroupInviteClick$1", f = "DefaultGroupInviteCardClickHandler.kt", l = {}, m = "invokeSuspend")
public final class C897470ZIr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ C259800zU<GroupInfo> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897470ZIr(C869590Y9l c869590Y9l, C259800zU<GroupInfo> c259800zU, InterfaceC1364105Vn<? super C897470ZIr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897470ZIr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultGroupInviteCardClickHandler@350a.handleGroupInviteClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        String strValueOf = String.valueOf(this.LL.getSender());
        final C259800zU<GroupInfo> c259800zU = this.LLILLJJLI;
        c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.0ZIs
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                String str;
                IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMGroupLiveAnalytics.class, false, false, false, 14, null);
                if (iIMGroupLiveAnalytics != null) {
                    String uid = iMUser.getUid();
                    Integer numValueOf = Integer.valueOf(iMUser.getFollowStatus());
                    GroupInfo groupInfo = c259800zU.element;
                    if (groupInfo != null) {
                        str = groupInfo.conversationId;
                    } else {
                        str = null;
                    }
                    iIMGroupLiveAnalytics.LJI(C0I0B.LJFF.LIZIZ(), numValueOf, uid, str);
                }
            }
        }, strValueOf, null, "im_chat_group", false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGroupInviteCardClickHandler@350a.handleGroupInviteClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
