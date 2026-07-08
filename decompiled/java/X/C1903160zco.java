package X;

import android.content.Context;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0zco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903160zco extends AbstractC1903250zcx {
    public final Context LIZJ;
    public final MultiViewModel LIZLLL;

    @Override // X.AbstractC1903250zcx
    public final int LIZLLL() {
        return R.raw.icon_trash_bin;
    }

    @Override // X.AbstractC1903250zcx
    public final int LJ() {
        return R.string.gm7;
    }

    @Override // X.AbstractC1903250zcx
    public final int LJFF() {
        return 1;
    }

    @Override // X.AbstractC1903250zcx
    public final void LIZJ() {
        String str;
        Context context = this.LIZJ;
        if (context == null) {
            return;
        }
        int i = this.LIZ.entranceCell.cellId;
        Integer num = (i == 10 || i == 15) ? 2131828108 : null;
        int i2 = this.LIZ.entranceCell.cellId;
        int i3 = i2 == 8 ? 2131835414 : i2 == 10 ? 2131828107 : i2 == 15 ? 2131828150 : 2131836091;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        if (num != null) {
            c1397580mTM.LJFF(num.intValue());
        }
        c1397580mTM.LIZ(i3);
        C985403tE.LIZ(c1397580mTM, new AwS394S0200000_28(context, this, 84));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        InboxEntranceCell inboxEntranceCell = this.LIZ.entranceCell;
        if (inboxEntranceCell.cellId != 10 || (str = inboxEntranceCell.entranceKey) == null) {
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("action_type", "show"));
        c0opq.getClass();
        C0OPQ.LJIJI(str, mapLJIIIIZZ);
    }

    @Override // X.AbstractC1903250zcx
    public final void LIZ() {
        super.LIZ();
        this.LIZIZ.LJ(3);
    }

    @Override // X.AbstractC1903250zcx
    public final void LIZIZ() {
        super.LIZIZ();
        this.LIZIZ.LIZLLL(3, this.LIZ);
    }

    public C1903160zco(InboxEntrancePod inboxEntrancePod, C1903020zca c1903020zca, Context context, MultiViewModel multiViewModel) {
        super(inboxEntrancePod, c1903020zca);
        this.LIZJ = context;
        this.LIZLLL = multiViewModel;
    }
}
