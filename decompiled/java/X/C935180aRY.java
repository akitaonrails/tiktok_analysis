package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935180aRY extends RecyclerView.ViewHolder {
    public final Function1<GuestInvitePanelResp.ListUser, Unit> LL;
    public final C1324720kZq LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final C16F5 LLILZIL;
    public final View LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C935180aRY(View view, Function1<? super GuestInvitePanelResp.ListUser, Unit> function1) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.l9h);
        this.LLILLL = view.findViewById(R.id.view_invite_mask);
        this.LLILZ = view.findViewById(R.id.llq);
        this.LLILZIL = (C16F5) view.findViewById(R.id.zym);
        this.LLILZLL = view.findViewById(R.id.view_online_dot);
    }
}
