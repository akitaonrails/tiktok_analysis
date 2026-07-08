package X;

import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder", f = "StreakLynxDataUtils.kt", l = {542}, m = "build")
public final class C06KZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StreakLynxDataUtils.StreakLynxConversationDataBuilder LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KZ(StreakLynxDataUtils.StreakLynxConversationDataBuilder streakLynxConversationDataBuilder, InterfaceC1364105Vn<? super C06KZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = streakLynxConversationDataBuilder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.build$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.build$1");
        return objLIZ;
    }
}
