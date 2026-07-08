package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907830zkL implements InterfaceC1259970itP {
    public final /* synthetic */ C1907850zkN LIZ;

    @Override // X.InterfaceC1259970itP
    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
        return list;
    }

    @Override // X.InterfaceC1259970itP
    public final void LJ() {
    }

    @Override // X.InterfaceC1259970itP
    public final String LIZLLL() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1259970itP
    public final String LIZIZ() {
        return C1907730zkB.LIZ();
    }

    public C1907830zkL(C1907850zkN c1907850zkN) {
        this.LIZ = c1907850zkN;
    }

    @Override // X.InterfaceC1259970itP
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
        MTTemplateNotificationHolder mTTemplateNotificationHolder = new MTTemplateNotificationHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aaj, viewGroup, false), new AwS607S0100000_28(this.LIZ, 192));
        mTTemplateNotificationHolder.LLJILJIL = this.LIZ.LIZ();
        return mTTemplateNotificationHolder;
    }

    @Override // X.InterfaceC1259970itP
    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
        boolean z2;
        if ((baseNotice instanceof MusNotice) && (viewHolder instanceof MTTemplateNotificationHolder)) {
            MTTemplateNotificationHolder mTTemplateNotificationHolder = (MTTemplateNotificationHolder) viewHolder;
            MusNotice musNotice = (MusNotice) baseNotice;
            C1907850zkN c1907850zkN = this.LIZ;
            String str = c1907850zkN.LIZJ;
            String str2 = c1907850zkN.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            if (c1907850zkN.LJ == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            List listLIZ = C1907840zkM.LIZ(baseNotice);
            C1907850zkN c1907850zkN2 = this.LIZ;
            MTTemplateNotificationHolder.P5(mTTemplateNotificationHolder, musNotice, i, "", str, str2, z2, listLIZ, false, c1907850zkN2.LJ, null, c1907850zkN2.LJFF, c1907850zkN2.LJI, 1408);
        }
    }
}
