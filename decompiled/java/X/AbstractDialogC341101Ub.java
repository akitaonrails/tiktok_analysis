package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC341101Ub extends AbstractDialogC423201kk {
    public LiveIconView LLJILJIL;
    public LiveIconView LLJILJILJ;
    public RunnableC781530UlD LLJILLL;
    public ViewGroup LLJJ;
    public final C951190arN LLJJI;
    public C1324720kZq LLJJIII;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g9f;
    }

    public abstract void LJLI();

    @Override // X.AbstractDialogC423201kk
    public void LJL() {
        this.LLJIJIL = this.LLJ;
        this.LLJILJIL = (LiveIconView) findViewById(R.id.v_l);
        this.LLJILJILJ = (LiveIconView) findViewById(R.id.v_n);
        this.LLJILLL = (RunnableC781530UlD) findViewById(R.id.v_i);
        this.LLJJ = (ViewGroup) findViewById(R.id.v_g);
        this.LLJJIII = (C1324720kZq) findViewById(R.id.v_e);
        C1143680frq.LIZLLL(this.LLJJIII, "tiktok_live_liveshow_resource_demand", "ttlive_multi_guest_live_show_list_dialog_bg.png");
        RunnableC781530UlD runnableC781530UlD = this.LLJILLL;
        if (runnableC781530UlD != null) {
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager(getContext());
            sSLinearLayoutManager.setOrientation(1);
            runnableC781530UlD.setLayoutManager(sSLinearLayoutManager);
        }
        LJLI();
        RunnableC781530UlD runnableC781530UlD2 = this.LLJILLL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLJJI);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLJJI.LLLIIIIL();
        super.onDetachedFromWindow();
    }

    public AbstractDialogC341101Ub(Context context) {
        super(context, true);
        this.LLJJI = new C951190arN();
    }
}
