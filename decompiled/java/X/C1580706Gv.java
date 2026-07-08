package X;

import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils", f = "StreakLynxDataUtils.kt", l = {139}, m = "getStreakPanelConvContext")
public final class C1580706Gv extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StreakLynxDataUtils LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580706Gv(StreakLynxDataUtils streakLynxDataUtils, InterfaceC1364105Vn<? super C1580706Gv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = streakLynxDataUtils;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakLynxDataUtils@6836.getStreakPanelConvContext$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("StreakLynxDataUtils@6836.getStreakPanelConvContext$1");
        return objLIZLLL;
    }
}
