package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0WJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.migrate.PlayerGroupIdRecorderMigrate", f = "PlayerGroupIdRecorderMigrate.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "prepareFile")
public final class C0WJ7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0WJ5 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJ7(C0WJ5 c0wj5, InterfaceC1364105Vn<? super C0WJ7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0wj5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerGroupIdRecorderMigrate@54cc.prepareFile$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("PlayerGroupIdRecorderMigrate@54cc.prepareFile$1");
        return objLIZLLL;
    }
}
