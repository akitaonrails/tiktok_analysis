package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import com.ss.android.ugc.aweme.live.GroupChatPageLiveViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GroupChatPageLiveViewModel$reportDisplayWatchLiveButton$1", f = "GroupChatPageLiveViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1501705uJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GroupChatPageLiveViewModel LL;
    public final /* synthetic */ HashMap<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501705uJ(GroupChatPageLiveViewModel groupChatPageLiveViewModel, HashMap<String, String> map, InterfaceC1364105Vn<? super C1501705uJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = groupChatPageLiveViewModel;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1501705uJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        C0Y8Y coreInfo;
        C1C7U.LIZ("GroupChatPageLiveViewModel@2d72.reportDisplayWatchLiveButton$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL.LL.getConversationId());
        HashMap<String, String> map = this.LLILLJJLI;
        Integer numLJ = null;
        if (map != null) {
            str = map.get("room_id");
        } else {
            str = null;
        }
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        if (iIMGroupLiveAnalytics != null) {
            String conversationId = this.LL.LL.getConversationId();
            if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
                string = C2286608xc.LJFF(coreInfo.getOwner()).toString();
            } else {
                string = null;
                if (c0y8tLIZ != null) {
                }
                iIMGroupLiveAnalytics.LIZJ(C0I0B.LJFF.LIZIZ(), numLJ, conversationId, string, str);
            }
            numLJ = C2286608xc.LJ(c0y8tLIZ.getMemberCount());
            iIMGroupLiveAnalytics.LIZJ(C0I0B.LJFF.LIZIZ(), numLJ, conversationId, string, str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatPageLiveViewModel@2d72.reportDisplayWatchLiveButton$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
