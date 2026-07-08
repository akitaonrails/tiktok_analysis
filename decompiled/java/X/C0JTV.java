package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubscriptionEmoteUrl;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JTV extends C09AY implements Function1<C0JUV, Unit> {
    public final /* synthetic */ SubWaveEmotePageViewModel LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JTV(SubWaveEmotePageViewModel subWaveEmotePageViewModel, Context context) {
        super(1);
        this.LL = subWaveEmotePageViewModel;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0JUV c0juv) {
        int i;
        C0JUV c0juv2 = c0juv;
        Pair<Integer, Integer> pair = c0juv2.LLILLL;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        C495520Jby c495520Jby = new C495520Jby(LiveSubscriptionEmoteUrl.INSTANCE.getValue().getUserEmotesReviewList());
        c495520Jby.LIZ(2, "emotes_review_scene");
        c495520Jby.LIZJ("sec_anchor_id", this.LL.wQ2().LLILLJJLI);
        c495520Jby.LIZ(iIntValue2 - iIntValue, "max_selection");
        StringBuilder sb = new StringBuilder("");
        List<C0JUN> list = c0juv2.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (C0JUN c0jun : list) {
            if (c0jun instanceof C0JUY) {
                arrayList.add(c0jun);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C0JUY) next).LLILZIL == 3) {
                arrayList2.add(next);
            }
        }
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((C0JUY) obj).LL.emoteId);
                if (i != arrayList2.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c495520Jby.LIZJ("pre_selection", sb.toString());
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, UriProtector.parse(c495520Jby.LIZLLL()));
        return Unit.LIZ;
    }
}
