package X;

import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;

/* JADX INFO: renamed from: X.06Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder", f = "StreakLynxDataUtils.kt", l = {470}, m = "getGroupSelfInfo")
public final class C1589006Ka extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StreakLynxDataUtils.StreakLynxConversationDataBuilder LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589006Ka(StreakLynxDataUtils.StreakLynxConversationDataBuilder streakLynxConversationDataBuilder, InterfaceC1364105Vn<? super C1589006Ka> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = streakLynxConversationDataBuilder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.getGroupSelfInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.getGroupSelfInfo$1");
        return objLIZIZ;
    }
}
