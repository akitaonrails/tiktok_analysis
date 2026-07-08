package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504650Jqh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C504660Jqi LL;
    public final /* synthetic */ InterfaceC2753014t LLILLJJLI;
    public final /* synthetic */ C504510JqT LLILLL;
    public final /* synthetic */ C504640Jqg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504650Jqh(C504660Jqi c504660Jqi, InterfaceC2753014t interfaceC2753014t, C504510JqT c504510JqT, C504640Jqg c504640Jqg) {
        super(0);
        this.LL = c504660Jqi;
        this.LLILLJJLI = interfaceC2753014t;
        this.LLILLL = c504510JqT;
        this.LLILZ = c504640Jqg;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String idStr;
        List<SpaceActivityInfo> list;
        String str;
        View view = this.LL.LL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int size = 0;
        layoutParams.height = 0;
        C786410Ut5.W5(view, layoutParams);
        C504510JqT c504510JqT = (C504510JqT) this.LLILLJJLI;
        if (c504510JqT != null && c504510JqT.LLJ) {
            User user = this.LLILLL.LLILLL;
            String str2 = "";
            if (user == null || (idStr = user.getIdStr()) == null) {
                idStr = "";
            }
            C504510JqT c504510JqT2 = (C504510JqT) this.LLILLJJLI;
            if (c504510JqT2 != null && (str = c504510JqT2.LLJIJIL) != null) {
                str2 = str;
            }
            SpaceActivityIndicator spaceActivityIndicator = this.LLILZ.LIZ;
            if (spaceActivityIndicator != null && (list = spaceActivityIndicator.spaceActivityInfoList) != null) {
                size = list.size();
            }
            C502520JnG.LIZ(size, "click", idStr, str2);
        }
        return Unit.LIZ;
    }
}
