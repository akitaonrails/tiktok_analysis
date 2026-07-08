package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Jqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504660Jqi extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C507840Jvq LLILLL;

    public C504660Jqi(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C507840Jvq) view.findViewById(R.id.a5r);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        C504640Jqg c504640Jqg;
        C504510JqT c504510JqT;
        String idStr;
        List<SpaceActivityInfo> list;
        String str;
        C504510JqT c504510JqTVQ2;
        if ((abstractC503810JpL instanceof C504640Jqg) && (c504640Jqg = (C504640Jqg) abstractC503810JpL) != null && (interfaceC2753014t instanceof C504510JqT) && (c504510JqT = (C504510JqT) interfaceC2753014t) != null) {
            int size = 0;
            if (this.LLILLJJLI.DQ2() && (c504510JqTVQ2 = this.LLILLJJLI.vQ2()) != null && c504510JqTVQ2.LLILZIL) {
                String strLIZ = C505720JsQ.LIZ(c504640Jqg.LIZ.schema);
                if (!C504670Jqj.LIZIZ(strLIZ)) {
                    c504640Jqg.LIZ.schema = strLIZ;
                }
            }
            this.LLILLL.e0(new AbstractC507850Jvr() { // from class: X.0Jvs
                {
                    EnumC428930Grr enumC428930Grr = EnumC428930Grr.MEDIUM;
                }
            }, false);
            this.LLILLL.h0(c504640Jqg.LIZ, new C504650Jqh(this, interfaceC2753014t, c504510JqT, c504640Jqg));
            C504510JqT c504510JqT2 = (C504510JqT) interfaceC2753014t;
            if (c504510JqT2 != null && c504510JqT2.LLJ) {
                User user = c504510JqT.LLILLL;
                String str2 = "";
                if (user == null || (idStr = user.getIdStr()) == null) {
                    idStr = "";
                }
                if (c504510JqT2 != null && (str = c504510JqT2.LLJIJIL) != null) {
                    str2 = str;
                }
                SpaceActivityIndicator spaceActivityIndicator = c504640Jqg.LIZ;
                if (spaceActivityIndicator != null && (list = spaceActivityIndicator.spaceActivityInfoList) != null) {
                    size = list.size();
                }
                C502520JnG.LIZ(size, "show", idStr, str2);
            }
        }
    }
}
