package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.end;

import X.AbstractC21673619ry;
import X.C01HZ;
import X.C01UR;
import X.C01US;
import X.C0J8P;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C12ES;
import X.C16FS;
import X.C1EOY;
import X.C304801Gc;
import X.C334801Rq;
import X.C410901il;
import X.C431501m5;
import X.C432201mC;
import X.C433001mK;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C786410Ut5;
import X.C915900ZwS;
import X.EnumC499801x6;
import X.RunnableC514801zW;
import X.RunnableC781530UlD;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownEndDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZz8/KTxiLjo2OzE/ISAkLCo7J2EwJyghJiF9PSxiLCE3ZgI5LDwnGy0jPis8PysJJysXISQgJig=";
    public final GuestShowdownContent LLL;
    public final boolean LLLF;
    public final C01UR LLLFF;
    public final C334801Rq LLLFFI;
    public RunnableC781530UlD LLLFZ;
    public View LLLI;
    public View LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public C16FS LLLIIIL;
    public TextView LLLIIL;
    public final long LLLIILIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.hcy;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_ranking_page_end"));
        }
        C1EOY.LIZ.LJJII("guest_showdown_party_ranking_page_end");
        C433001mK.LIZLLL.remove("GuestShowdownEndDialog");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.dimBehindType = 1;
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_ranking_page_end"), null);
        }
    }

    public final void uS(GuestShowdownContent guestShowdownContent) {
        AbstractC21673619ry adapter;
        C1117360fBO c1117360fBO;
        if (guestShowdownContent != null) {
            RunnableC781530UlD runnableC781530UlD = this.LLLFZ;
            AbstractC21673619ry adapter2 = null;
            if (runnableC781530UlD != null) {
                adapter2 = runnableC781530UlD.getAdapter();
            }
            if ((adapter2 instanceof C1117360fBO) && (c1117360fBO = (C1117360fBO) adapter2) != null) {
                C410901il c410901il = new C410901il();
                c410901il.add(new C01US(C497740JfY.LJIJI(2131852934)));
                c410901il.addAll(guestShowdownContent.runningPlayUsers);
                if (!guestShowdownContent.leavePlayUsers.isEmpty()) {
                    c410901il.add(new C01US(C497740JfY.LJIJI(2131852937)));
                    c410901il.addAll(guestShowdownContent.leavePlayUsers);
                }
                c1117360fBO.LLLII(c410901il);
            }
            RunnableC781530UlD runnableC781530UlD2 = this.LLLFZ;
            if (runnableC781530UlD2 != null && (adapter = runnableC781530UlD2.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public final void wS(int i) {
        int i2;
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isChangeMinGuestCount()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (i >= i2) {
            TextView textView = this.LLLIIL;
            if (textView != null) {
                C439101nJ.LJI(textView);
            }
            C16FS c16fs = this.LLLIIIL;
            if (c16fs != null) {
                c16fs.setEnabled(true);
                return;
            }
            return;
        }
        TextView textView2 = this.LLLIIL;
        if (textView2 != null) {
            C12ES.LJIILL(0, textView2);
        }
        C16FS c16fs2 = this.LLLIIIL;
        if (c16fs2 == null) {
            return;
        }
        c16fs2.setEnabled(false);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveIconView liveIconView;
        int i;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.tvh);
            this.LLLFZ = runnableC781530UlD;
            if (runnableC781530UlD != null) {
                runnableC781530UlD.setLayoutManager(new LinearLayoutManager(context));
                C1117360fBO c1117360fBO = new C1117360fBO();
                c1117360fBO.LLLI(C01US.class, new C0J8P<C01US, C432201mC>() { // from class: X.01m9
                    @Override // X.C0J8P
                    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C01US c01us) {
                        String strLJII;
                        C432201mC c432201mC = (C432201mC) viewHolder;
                        String str = c01us.LIZ;
                        if (C1533950q1J.LJ(str)) {
                            ((TextView) c432201mC.LL.getValue()).setText(str);
                        }
                        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                        if (multiGuestDataHolder != null) {
                            strLJII = multiGuestDataHolder.LJII();
                        } else {
                            strLJII = null;
                        }
                        if (strLJII != null) {
                            C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
                            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                                url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432201mC.itemView.getContext(), Integer.valueOf(c432201mC.I5().getWidth()), Integer.valueOf(c432201mC.I5().getHeight()));
                            } else {
                                url.LJIIIZ = R.drawable.emi;
                            }
                            url.LJIIL = new C987120bnK(3);
                            url.LJJI(c432201mC.I5());
                            return;
                        }
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            C1126540fQC c1126540fQCI5 = c432201mC.I5();
                            if (c1126540fQCI5 == null) {
                                return;
                            }
                            c1126540fQCI5.setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432201mC.itemView.getContext(), Integer.valueOf(c432201mC.I5().getWidth()), Integer.valueOf(c432201mC.I5().getHeight())));
                            return;
                        }
                        C1126540fQC c1126540fQCI52 = c432201mC.I5();
                        if (c1126540fQCI52 == null) {
                            return;
                        }
                        c1126540fQCI52.setActualImageResource(R.drawable.emi);
                    }

                    @Override // X.C0J8P
                    /* JADX INFO: renamed from: LJ */
                    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return new C432201mC(viewGroup);
                    }
                });
                c1117360fBO.LLLI(GuestShowdownUser.class, new C431501m5(context));
                GuestShowdownContent guestShowdownContent = this.LLL;
                if (guestShowdownContent != null) {
                    C410901il c410901il = new C410901il();
                    c410901il.add(new C01US(C497740JfY.LJIJI(2131852934)));
                    c410901il.addAll(guestShowdownContent.runningPlayUsers);
                    if (!guestShowdownContent.leavePlayUsers.isEmpty()) {
                        c410901il.add(new C01US(C497740JfY.LJIJI(2131852937)));
                        c410901il.addAll(guestShowdownContent.leavePlayUsers);
                    }
                    c1117360fBO.LL = c410901il;
                }
                runnableC781530UlD.setAdapter(c1117360fBO);
            }
            this.LLLIIL = (TextView) view.findViewById(R.id.h4m);
            this.LLLI = view.findViewById(R.id.ja7);
            this.LLLII = view.findViewById(R.id.ja5);
            this.LLLIIII = view.findViewById(R.id.ja6);
            this.LLLIIIIL = view.findViewById(R.id.ja9);
            this.LLLIIIL = (C16FS) view.findViewById(R.id.ja8);
            MultiGuestGuestShowdownRemainTaskSetting multiGuestGuestShowdownRemainTaskSetting = MultiGuestGuestShowdownRemainTaskSetting.INSTANCE;
            if (multiGuestGuestShowdownRemainTaskSetting.isChangeMinGuestCount()) {
                if (multiGuestGuestShowdownRemainTaskSetting.isChangeMinGuestCount()) {
                    i = 1;
                } else {
                    i = 2;
                }
                TextView textView = this.LLLIIL;
                if (textView != null) {
                    textView.setText(C497740JfY.LJIIL(2131755864, i, Integer.valueOf(i)));
                }
            }
            if (this.LLLF) {
                View view2 = this.LLLI;
                if (view2 != null) {
                    C12ES.LJIILL(0, view2);
                }
                View view3 = this.LLLIIIIL;
                if (view3 != null) {
                    C12ES.LJIILL(0, view3);
                }
                View view4 = this.LLLII;
                if (view4 != null) {
                    C12ES.LJIILL(0, view4);
                }
                View view5 = this.LLLIIII;
                if (view5 != null) {
                    C439101nJ.LJI(view5);
                }
                C16FS c16fs = this.LLLIIIL;
                if (c16fs != null) {
                    C12ES.LJIILL(0, c16fs);
                }
                if (multiGuestGuestShowdownRemainTaskSetting.isRemainTaskOpenExcludeMinGuestCount()) {
                    View view6 = this.LLLII;
                    if ((view6 instanceof LiveIconView) && (liveIconView = (LiveIconView) view6) != null) {
                        liveIconView.setIconAttr(R.attr.cqr);
                    }
                }
            } else {
                View view7 = this.LLLI;
                if (view7 != null) {
                    C439101nJ.LJI(view7);
                }
                View view8 = this.LLLIIIIL;
                if (view8 != null) {
                    C439101nJ.LJI(view8);
                }
                View view9 = this.LLLII;
                if (view9 != null) {
                    C439101nJ.LJI(view9);
                }
                C16FS c16fs2 = this.LLLIIIL;
                if (c16fs2 != null) {
                    C439101nJ.LJI(c16fs2);
                }
                View view10 = this.LLLIIII;
                if (view10 != null) {
                    C12ES.LJIILL(0, view10);
                }
            }
            View view11 = getView();
            if (view11 != null) {
                HandlerHook.viewPost(view11, new RunnableC514801zW(this, 152));
            }
            if (C497740JfY.LJJ()) {
                View view12 = this.LLLII;
                if (view12 != null) {
                    C786410Ut5.Ob(view12, -1.0f);
                }
                View view13 = this.LLLIIII;
                if (view13 != null) {
                    C786410Ut5.Ob(view13, -1.0f);
                }
            } else {
                View view14 = this.LLLII;
                if (view14 != null) {
                    C786410Ut5.Ob(view14, 1.0f);
                }
                View view15 = this.LLLIIII;
                if (view15 != null) {
                    C786410Ut5.Ob(view15, 1.0f);
                }
            }
        }
        View view16 = this.LLLI;
        if (view16 != null) {
            C500260Jjc.LJLIIIL(500L, view16, new C5183020f(this, 259));
        }
        View view17 = this.LLLII;
        if (view17 != null) {
            C500260Jjc.LJLIIIL(500L, view17, new C5183020f(this, 260));
        }
        C16FS c16fs3 = this.LLLIIIL;
        if (c16fs3 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs3, new C5183020f(this, 261));
        }
        View view18 = this.LLLIIII;
        if (view18 != null) {
            C500260Jjc.LJLIIIL(500L, view18, new C5183020f(this, 262));
        }
        C01UR c01ur = this.LLLFF;
        if (c01ur != null) {
            wS(c01ur.LIZLLL());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("guest_showdown_party_ranking_page_end");
        return super.dS(layoutInflater, viewGroup, bundle);
    }

    public GuestShowdownEndDialog(DataChannel dataChannel, GuestShowdownContent guestShowdownContent, boolean z, C304801Gc c304801Gc, C334801Rq c334801Rq) {
        super(dataChannel);
        this.LLL = guestShowdownContent;
        this.LLLF = z;
        this.LLLFF = c304801Gc;
        this.LLLFFI = c334801Rq;
        this.LLLIILIL = System.currentTimeMillis();
    }
}
