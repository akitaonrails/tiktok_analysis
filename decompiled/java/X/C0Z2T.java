package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z2T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.analytics.JoinGroupAnalyticsImpl$logGroupInviteCardClick$1", f = "JoinGroupAnalyticsImpl.kt", l = {}, m = "invokeSuspend")
public final class C0Z2T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C900550ZUn LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;
    public final /* synthetic */ GroupInviteCardContent LLILLL;
    public final /* synthetic */ InterfaceC1493105sv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z2T(C900550ZUn c900550ZUn, SessionInfo sessionInfo, GroupInviteCardContent groupInviteCardContent, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C0Z2T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c900550ZUn;
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = groupInviteCardContent;
        this.LLILZ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z2T(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("JoinGroupAnalyticsImpl@7d0e.logGroupInviteCardClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C900550ZUn c900550ZUn = this.LL;
        SessionInfo sessionInfo = this.LLILLJJLI;
        GroupInviteCardContent groupInviteCardContent = this.LLILLL;
        c900550ZUn.getClass();
        this.LLILZ.sendEvent("click_share_card", C900550ZUn.LIZLLL(sessionInfo, groupInviteCardContent));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("JoinGroupAnalyticsImpl@7d0e.logGroupInviteCardClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
