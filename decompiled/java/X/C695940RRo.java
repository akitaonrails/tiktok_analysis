package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695940RRo extends C09AY implements Function2<PriorityProtocol, Boolean, Unit> {
    public final /* synthetic */ Function1<View, Unit> LL;
    public final /* synthetic */ FeedBottomButtonContainer LLILLJJLI;
    public final /* synthetic */ Function1<View, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C695940RRo(Function1<? super View, Unit> function1, FeedBottomButtonContainer feedBottomButtonContainer, Function1<? super View, Unit> function12) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = feedBottomButtonContainer;
        this.LLILLL = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PriorityProtocol priorityProtocol, Boolean bool) {
        String str;
        PriorityProtocol priorityProtocol2 = priorityProtocol;
        if (bool.booleanValue()) {
            Function1<View, Unit> function1 = this.LL;
            if (function1 != null) {
                function1.invoke(priorityProtocol2.Vt());
            }
        } else {
            int i = 0;
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI.LJJIJL());
            View viewVt = priorityProtocol2.Vt();
            Function1<View, Unit> function12 = this.LLILLL;
            if (function12 != null) {
                function12.invoke(viewVt);
            }
            if ((C299830Bp7.LIZIZ() & 2) == 2) {
                C695960RRq c695960RRq = new Object() { // from class: X.0RRq
                };
                String strZg = priorityProtocol2.zg();
                String str2 = this.LLILLJJLI.nJ2().eventType;
                String aid = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme().getAid();
                String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme());
                c695960RRq.getClass();
                if (str2 != null && aid != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str2);
                    C705960Rmc.LIZ.getClass();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) C705960Rmc.LIZJ;
                    C695950RRp c695950RRp = (C695950RRp) linkedHashMap.get(strZg);
                    if (c695950RRp != null) {
                        i = c695950RRp.LIZ;
                    }
                    c2344009Gk.LIZJ(i, "button_code");
                    C695950RRp c695950RRp2 = (C695950RRp) linkedHashMap.get(strZg);
                    if (c695950RRp2 != null && (str = c695950RRp2.LIZIZ) != null) {
                        strZg = str;
                    }
                    c2344009Gk.LJIIIIZZ("business_type", strZg);
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    c2344009Gk.LJIIIIZZ("author_id", authorUid);
                    C20684815ws.LJIILLIIL("show_core_fdmt_button", c2344009Gk.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }
}
