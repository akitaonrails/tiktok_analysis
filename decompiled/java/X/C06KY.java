package X;

import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06KY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils$StreakLynxConversationDataBuilder", f = "StreakLynxDataUtils.kt", l = {513}, m = "putGroupInfo")
public final class C06KY extends AbstractC23140094w {
    public StreakLynxDataUtils.StreakLynxConversationDataBuilder LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StreakLynxDataUtils.StreakLynxConversationDataBuilder LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KY(StreakLynxDataUtils.StreakLynxConversationDataBuilder streakLynxConversationDataBuilder, InterfaceC1364105Vn<? super C06KY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = streakLynxConversationDataBuilder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.putGroupInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(this);
        C1C7U.LIZIZ("StreakLynxDataUtils$StreakLynxConversationDataBuilder@cf4c.putGroupInfo$1");
        return objLIZJ;
    }
}
