package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0laI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363440laI extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLILZLL = 0;
    public SharePanelViewModel LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
    }

    public final boolean I5() {
        Bundle bundle;
        SharePackage sharePackage = this.LL.LL;
        boolean z = false;
        if (sharePackage != null && (bundle = sharePackage.extras) != null && bundle.getBoolean("is_reposted_live")) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        Bundle bundle;
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null) {
            return;
        }
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("user_id", C0XQ7.LJFF().getCurUserId());
        Activity activityLIZ = C0FNT.LIZ(this.itemView.getContext());
        pairArr[1] = new Pair("panel_source", (activityLIZ == null || !activityLIZ.getClass().getSimpleName().equals("MainActivity")) ? "long_press" : "preview_press");
        pairArr[2] = new Pair("button_status", I5() ? "repost" : "cancel_repost");
        pairArr[3] = new Pair("enter_from_merge", bundle.getString("enter_from"));
        pairArr[4] = new Pair("enter_method", bundle.getString("enter_method_live"));
        pairArr[5] = new Pair("room_id", String.valueOf(bundle.getLong("item_id")));
        pairArr[6] = new Pair("anchor_id", bundle.getString("uid_for_share"));
        pairArr[7] = new Pair("action_type", bundle.getString("live_action_type"));
        pairArr[8] = new Pair("follow_status", String.valueOf(bundle.getLong("follow_status")));
        pairArr[9] = new Pair("request_id", bundle.getString("request_id"));
        C20684815ws.LJIILLIIL("livesdk_repost_icon_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C1363440laI(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1590));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1591));
        this.LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(635));
        this.LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(636));
    }
}
