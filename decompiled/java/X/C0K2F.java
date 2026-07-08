package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS136S0400000_7;

/* JADX INFO: renamed from: X.0K2F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2F extends C0K3V {
    public final View LL;
    public final C0K1P LLILLJJLI;

    public C0K2F(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (C0K1P) view.findViewById(R.id.a5r);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K2H c0k2h;
        C511370K3r c511370K3r;
        String idStr;
        List<SpaceActivityInfo> list;
        String str;
        if ((abstractC511160K2w instanceof C0K2H) && (c0k2h = (C0K2H) abstractC511160K2w) != null && (interfaceC2753014t instanceof C511370K3r) && (c511370K3r = (C511370K3r) interfaceC2753014t) != null) {
            int size = 0;
            this.LLILLJJLI.LIZIZ(C0K1T.LJFF, false);
            this.LLILLJJLI.LIZJ(c0k2h.LIZ, new AwS136S0400000_7(this, interfaceC2753014t, c511370K3r, c0k2h, 4));
            C511370K3r c511370K3r2 = (C511370K3r) interfaceC2753014t;
            if (c511370K3r2 != null && c511370K3r2.LLJ) {
                C0K26 c0k26 = C0K26.LIZ;
                User user = c511370K3r.LLILLL;
                String str2 = "";
                if (user == null || (idStr = user.getIdStr()) == null) {
                    idStr = "";
                }
                if (c511370K3r2 != null && (str = c511370K3r2.LLJIJIL) != null) {
                    str2 = str;
                }
                SpaceActivityIndicator spaceActivityIndicator = c0k2h.LIZ;
                if (spaceActivityIndicator != null && (list = spaceActivityIndicator.spaceActivityInfoList) != null) {
                    size = list.size();
                }
                c0k26.getClass();
                C0K26.LIZ(size, "show", idStr, str2);
            }
        }
    }
}
