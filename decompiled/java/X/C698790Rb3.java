package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698790Rb3 extends C09AY implements Function1<C698810Rb5, Unit> {
    public final /* synthetic */ C699060RbU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698790Rb3(C699060RbU c699060RbU) {
        super(1);
        this.LL = c699060RbU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C698810Rb5 c698810Rb5) {
        String aid;
        String authorUid;
        int i;
        Music music;
        C698810Rb5 c698810Rb52 = c698810Rb5;
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        C699060RbU c699060RbU = this.LL;
        Aweme aweme = c699060RbU.LLJILLL;
        String str = c699060RbU.LLILLJJLI;
        c698800Rb4.getClass();
        if (C700120RdC.LIZ(C698800Rb4.LIZJ) && c698810Rb52 != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Long lValueOf = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme != null && (music = aweme.getMusic()) != null) {
                lValueOf = Long.valueOf(music.getId());
            }
            c2344009Gk.LJ(lValueOf, "music_id");
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_from", str);
            if (((ArrayList) c698810Rb52.LIZLLL).size() == c698810Rb52.LJIILL + ((ArrayList) c698810Rb52.LJFF).size()) {
                i = 1;
            } else if (((ArrayList) c698810Rb52.LIZLLL).size() < c698810Rb52.LJIILL + ((ArrayList) c698810Rb52.LJFF).size()) {
                i = 2;
            } else if (((ArrayList) c698810Rb52.LIZLLL).size() > c698810Rb52.LJIILL + ((ArrayList) c698810Rb52.LJFF).size()) {
                i = 3;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "diff_state");
            C20684815ws.LJIILLIIL("avoid_component_state", c2344009Gk.LIZ);
            IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService != null) {
                iFeedDebugService.LIZJ();
            }
        }
        return Unit.LIZ;
    }
}
