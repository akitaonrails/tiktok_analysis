package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.analytics.IMQuickChatAnalytics$logEnterQuickChat$1", f = "IMQuickChatAnalytics.kt", l = {65}, m = "invokeSuspend")
public final class C1593806Lw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnterChatParams LLILLL;
    public final /* synthetic */ SessionInfo LLILZ;
    public final /* synthetic */ IMUser LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593806Lw(String str, EnterChatParams enterChatParams, SessionInfo sessionInfo, IMUser iMUser, InterfaceC1364105Vn<? super C1593806Lw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = enterChatParams;
        this.LLILZ = sessionInfo;
        this.LLILZIL = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1593806Lw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickChatAnalytics@f2bd.logEnterQuickChat$1");
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
            boolean zHasDraftData = C0YNP.LIZIZ(this.LLILLJJLI).LJII().hasDraftData();
            C895830ZCj c895830ZCj = C895830ZCj.LIZ;
            EnterChatParams enterChatParams = this.LLILLL;
            SessionInfo sessionInfo = this.LLILZ;
            IMUser iMUser = this.LLILZIL;
            this.LL = 1;
            if (c895830ZCj.LIZ(enterChatParams, sessionInfo, zHasDraftData, iMUser, C0I0B.LJFF.LIZIZ(), true, false, this) == objLJFF) {
                C1C7U.LIZIZ("IMQuickChatAnalytics@f2bd.logEnterQuickChat$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickChatAnalytics@f2bd.logEnterQuickChat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
