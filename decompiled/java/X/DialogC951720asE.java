package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0asE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC951720asE extends AbstractDialogC423201kk {
    public final InterfaceC951750asH LLJILJIL;
    public LiveIconView LLJILJILJ;
    public RunnableC781530UlD LLJILLL;
    public final C1117360fBO LLJJ;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g98;
    }

    @Override // X.AbstractDialogC423201kk
    public final void LJL() {
        this.LLJIJIL = findViewById(R.id.n67);
        this.LLJILJILJ = (LiveIconView) findViewById(R.id.n68);
        this.LLJILLL = (RunnableC781530UlD) findViewById(R.id.foy);
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 192));
        }
        this.LLJJ.LLLI(C951740asG.class, new AbstractC960430b6H<C951740asG, C951730asF>() { // from class: X.0asD
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h_6, viewGroup, false);
                return new AbstractC960440b6I<C951740asG>(viewTd) { // from class: X.0asF
                    public C16F5 LL;
                    public C16F5 LLILLJJLI;
                    public View LLILLL;

                    @Override // X.AbstractC960440b6I
                    public final void I5(int i, Object obj) {
                        C951740asG c951740asG = (C951740asG) obj;
                        View view = this.itemView;
                        this.LL = (C16F5) view.findViewById(R.id.fp1);
                        this.LLILLJJLI = (C16F5) view.findViewById(R.id.foz);
                        this.LLILLL = view.findViewById(R.id.fp0);
                        C500260Jjc.LJLJL(c951740asG.LIZJ, view);
                        C500260Jjc.LJJLJ(c951740asG.LIZLLL, view);
                        int i2 = c951740asG.LIZ;
                        if (i2 != 1) {
                            if (i2 == 2) {
                                C16F5 c16f5 = this.LL;
                                if (c16f5 != null) {
                                    C439101nJ.LJI(c16f5);
                                }
                                C16F5 c16f52 = this.LLILLJJLI;
                                if (c16f52 != null) {
                                    C12ES.LJIILL(0, c16f52);
                                }
                                View view2 = this.LLILLL;
                                if (view2 != null) {
                                    C12ES.LJIILL(0, view2);
                                }
                                C16F5 c16f53 = this.LLILLJJLI;
                                if (c16f53 != null) {
                                    c16f53.setText(C497740JfY.LJIJI(c951740asG.LIZIZ));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C16F5 c16f54 = this.LL;
                        if (c16f54 != null) {
                            C12ES.LJIILL(0, c16f54);
                        }
                        C16F5 c16f55 = this.LLILLJJLI;
                        if (c16f55 != null) {
                            C439101nJ.LJI(c16f55);
                        }
                        View view3 = this.LLILLL;
                        if (view3 != null) {
                            C439101nJ.LJI(view3);
                        }
                        C16F5 c16f56 = this.LL;
                        if (c16f56 == null) {
                            return;
                        }
                        c16f56.setText(C497740JfY.LJIJI(c951740asG.LIZIZ));
                    }
                };
            }
        });
        this.LLJJ.LLLI(C951760asI.class, new AbstractC960430b6H<C951760asI, C951670as9>() { // from class: X.0asA
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AbstractC960440b6I<C951760asI>(C786410Ut5.Td(layoutInflater, R.layout.h_5, viewGroup, false)) { // from class: X.0as9
                    public C1324720kZq LL;

                    @Override // X.AbstractC960440b6I
                    public final void I5(int i, Object obj) {
                        String str;
                        this.LL = (C1324720kZq) this.itemView.findViewById(R.id.n69);
                        if (C497740JfY.LJJ()) {
                            str = "ttlive_multi_guest_live_show_description_rtl.png";
                        } else {
                            str = "ttlive_multi_guest_live_show_description_ltr.png";
                        }
                        C1143680frq.LIZLLL(this.LL, "tiktok_live_liveshow_resource_demand", str);
                    }
                };
            }
        });
        RunnableC781530UlD runnableC781530UlD = this.LLJILLL;
        if (runnableC781530UlD != null) {
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager(getContext());
            sSLinearLayoutManager.setOrientation(1);
            runnableC781530UlD.setLayoutManager(sSLinearLayoutManager);
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJILLL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLJJ);
        }
        C1117360fBO c1117360fBO = this.LLJJ;
        C410901il c410901il = new C410901il();
        c410901il.add(new C951740asG(1, 2131843561, 14, 0));
        c410901il.add(new C951740asG(2, 2131843555, 10, 0));
        c410901il.add(new C951740asG(2, 2131843556, 12, 0));
        c410901il.add(new C951740asG(2, 2131843557, 12, 0));
        c410901il.add(new Object() { // from class: X.0asI
        });
        c410901il.add(new C951740asG(2, 2131843558, 12, 0));
        c410901il.add(new C951740asG(2, 2131843559, 12, 12));
        c410901il.add(new C951740asG(2, 2131843336, 12, 50));
        c1117360fBO.LL = c410901il;
        C1117360fBO c1117360fBO2 = this.LLJJ;
        if (c1117360fBO2 != null) {
            c1117360fBO2.notifyDataSetChanged();
        }
    }

    public DialogC951720asE(Context context, InterfaceC951750asH interfaceC951750asH) {
        super(context, true);
        this.LLJILJIL = interfaceC951750asH;
        this.LLJJ = new C1117360fBO();
    }
}
