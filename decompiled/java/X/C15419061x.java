package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;

/* JADX INFO: renamed from: X.061x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.AIBotOperator", f = "AIBotOperator.kt", l = {59}, m = "createBot$im_ai_impl_release")
public final class C15419061x extends AbstractC23140094w {
    public long LL;
    public IMAIBotInfo LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C15417061v LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15419061x(C15417061v c15417061v, InterfaceC1364105Vn<? super C15419061x> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c15417061v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIBotOperator@463a.createBot$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(0, false, this);
        C1C7U.LIZIZ("AIBotOperator@463a.createBot$1");
        return objLIZIZ;
    }
}
