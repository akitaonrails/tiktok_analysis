package X;

import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0z7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem", f = "MatchCountDownAssem.kt", l = {1118}, m = "showLeagueTaskTip")
public final class C1884010z7v extends AbstractC23140094w {
    public Text LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MatchCountDownAssem LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884010z7v(MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C1884010z7v> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = matchCountDownAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchCountDownAssem@1efb.showLeagueTaskTip$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objSp = this.LLILLL.sp(null, this);
        C1C7U.LIZIZ("MatchCountDownAssem@1efb.showLeagueTaskTip$1");
        return objSp;
    }
}
