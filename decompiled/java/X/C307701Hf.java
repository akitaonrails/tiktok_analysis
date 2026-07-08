package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.UserCountdownRecord;

/* JADX INFO: renamed from: X.01Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C307701Hf extends C0J8P<FanTicketRanklistResponse.CountdownInfo, C308201Hk> {
    public final DataChannel LIZIZ;
    public final long LIZJ;

    public C307701Hf(long j, DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
        this.LIZJ = j;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, FanTicketRanklistResponse.CountdownInfo countdownInfo) {
        C308201Hk c308201Hk = (C308201Hk) viewHolder;
        FanTicketRanklistResponse.CountdownInfo countdownInfo2 = countdownInfo;
        C500260Jjc.LJLJLJ((View) c308201Hk.LL.getValue(), countdownInfo2.historyExists);
        C786410Ut5.K7((ViewGroup) c308201Hk.LL.getValue(), new ViewOnClickListenerC512201z6(this, 56));
        UserCountdownRecord userCountdownRecord = countdownInfo2.inProgressRecord;
        if (userCountdownRecord != null) {
            boolean z = false;
            C12ES.LJIILL(0, (View) c308201Hk.LLILLJJLI.getValue());
            TextView textView = (TextView) c308201Hk.LLILLJJLI.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131843249));
            sbLIZ.append(" | ");
            sbLIZ.append(C256800z0.LIZIZ(userCountdownRecord));
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            View view = (View) c308201Hk.LLILLL.getValue();
            if (userCountdownRecord.targetScore > 0) {
                z = true;
            }
            C500260Jjc.LJLJLJ(view, z);
            ((TextView) c308201Hk.LLILLL.getValue()).setText(C256800z0.LIZ(userCountdownRecord, ((View) c308201Hk.LLILLL.getValue()).getContext()));
            return;
        }
        C439101nJ.LJI((View) c308201Hk.LLILLJJLI.getValue());
        C439101nJ.LJI((View) c308201Hk.LLILLL.getValue());
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C308201Hk(viewGroup);
    }
}
