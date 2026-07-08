package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z2S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.analytics.JoinGroupAnalyticsImpl$logGroupInviteCardShow$1", f = "JoinGroupAnalyticsImpl.kt", l = {}, m = "invokeSuspend")
public final class C0Z2S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C900550ZUn LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;
    public final /* synthetic */ GroupInviteCardContent LLILLL;
    public final /* synthetic */ InterfaceC1493105sv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z2S(C900550ZUn c900550ZUn, SessionInfo sessionInfo, GroupInviteCardContent groupInviteCardContent, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C0Z2S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c900550ZUn;
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = groupInviteCardContent;
        this.LLILZ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z2S(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("JoinGroupAnalyticsImpl@7d0e.logGroupInviteCardShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C900550ZUn c900550ZUn = this.LL;
        SessionInfo sessionInfo = this.LLILLJJLI;
        GroupInviteCardContent groupInviteCardContent = this.LLILLL;
        c900550ZUn.getClass();
        Map<String, String> mapLIZLLL = C900550ZUn.LIZLLL(sessionInfo, groupInviteCardContent);
        mapLIZLLL.put("from_type", "in_app");
        SessionInfo sessionInfo2 = this.LLILLJJLI;
        if (sessionInfo2 != null && sessionInfo2.isGroupChat()) {
            mapLIZLLL.put("group_type", C1229100i5c.LJI(this.LLILLJJLI.getConversationId()));
            if (C1461005nk.LIZ != null) {
                numLJ = C2286608xc.LJ(C1461005nk.LJIIIIZZ(this.LLILLJJLI.getConversationId()));
            } else {
                numLJ = null;
            }
            mapLIZLLL.put("group_role", String.valueOf(numLJ));
        }
        this.LLILZ.sendEvent("show_share_card", mapLIZLLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("JoinGroupAnalyticsImpl@7d0e.logGroupInviteCardShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
