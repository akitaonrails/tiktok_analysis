package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19596611lk implements InterfaceC19578611iq {
    public C0P0T LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    public C19596611lk(C19EG c19eg, Aweme aweme) {
        this.LLILLJJLI = c19eg;
        this.LLILLL = aweme;
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        final C2223001BzW c2223001BzWLIZ = C2203211BKt.LIZ(this.LLILLL);
        if (c2223001BzWLIZ == null) {
            return false;
        }
        C20684815ws.LJIILLIIL("view_original_comment", C2097608Jq.LJIIIIZZ(new Pair("is_share_public_comment_to_story", "1"), new Pair("action_type", "show")));
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = this.LLILLJJLI;
        int type = interactStickerStruct.getType();
        final C19EG c19eg2 = this.LLILLJJLI;
        C19582711jV c19582711jV = new C19582711jV(type, pointF, new InterfaceC19583711jf() { // from class: X.11ll
            @Override // X.InterfaceC19583711jf
            public final List<InterfaceC450850Hm7> actions() {
                return Collections.singletonList(C19583611je.LIZ(c19eg2.getString(2131824825), new AwS263S0300000_19(c19eg2, c2223001BzWLIZ, this, 9)));
            }
        }, new AwS608S0100000_29(this, 232));
        AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6(this, pointF, 23);
        c19582611jU.getClass();
        C19582611jU.LJFF(c19eg, c19582711jV, awS372S0200000_6);
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
        if (iPlayerManagerService != null) {
            iPlayerManagerService.LIZ();
        }
        return true;
    }
}
