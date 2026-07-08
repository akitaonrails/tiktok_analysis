package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Itq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481120Itq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LongPressWidget LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481120Itq(LongPressWidget longPressWidget, Room room, int i, int i2, Bundle bundle, Map<String, String> map) {
        super(0);
        this.LL = longPressWidget;
        this.LLILLJJLI = room;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = bundle;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share");
        C1ACA c1acaZ1 = this.LL.z1();
        c474500IjALIZ.LJJII(c1acaZ1 != null ? c1acaZ1.LIZLLL : null, "enter_from_merge");
        c474500IjALIZ.LJJII("live_cell", "enter_method");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLJJLI.getId()), "room_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL), "is_create_group_chat");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "friends_shared_cnt");
        LongPressWidget longPressWidget = this.LL;
        Bundle bundle = this.LLILZIL;
        longPressWidget.getClass();
        String string = bundle != null ? bundle.getString(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLF(3)) : null;
        String str = "top_supporters";
        if (!TextUtils.equals(string, "top_supporters")) {
            str = "recently_shared";
            if (!TextUtils.equals(string, "recently_shared")) {
                str = "none";
            }
        }
        c474500IjALIZ.LJJII(str, "batch_share_type");
        c474500IjALIZ.LJJIIZI(this.LLILZLL);
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_share"));
        c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIZILJ(C481150Itt.LIZ));
        c474500IjALIZ.LIZ();
        C481150Itt.LIZIZ();
        return Unit.LIZ;
    }
}
