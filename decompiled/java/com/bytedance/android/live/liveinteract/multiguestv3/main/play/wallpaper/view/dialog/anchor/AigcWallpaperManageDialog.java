package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor;

import X.C0J8P;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1117360fBO;
import X.C16FS;
import X.C16FV;
import X.C20744116Fj;
import X.C23250099c;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C942310ad3;
import X.C942320ad4;
import X.C942340ad6;
import X.C942750adl;
import X.InterfaceC1813060xHU;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperManageDialog extends AbsAigcBottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiPi4/JDUtOSohZjMlLDh9LCwtJSA0ZiQiKic8OmsNICgwHyQgJT8yOCA+BC49KSIpDSYyJCor";
    public C16FV LLILLJJLI;
    public C1117360fBO LLILLL;
    public C20744116Fj LLILZ;
    public ViewOnClickListenerC1836610xtT LLILZIL;
    public AigcWallpaperAnchorViewModel LLILZLL;
    public AigcAnchorWidget LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    public AigcWallpaperManageDialog() {
        super(true);
        this.LLIZLLLIL = true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final int getLayoutId() {
        return R.layout.hc4;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void MR() {
        MutableLiveData mutableLiveData;
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILZLL;
        if (aigcWallpaperAnchorViewModel != null && (mutableLiveData = aigcWallpaperAnchorViewModel.LLILZIL) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 129));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C942750adl(this, null), 3);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void initData() {
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLILZLL;
        if (aigcWallpaperAnchorViewModel != null) {
            aigcWallpaperAnchorViewModel.GQ2();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void NR(View view) {
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.nyq);
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0ad7
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LIZ.LLILZLL;
                    if (aigcWallpaperAnchorViewModel != null) {
                        aigcWallpaperAnchorViewModel.GQ2();
                    }
                }
            });
            viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0ad8
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LIZ.LLILZLL;
                    if (aigcWallpaperAnchorViewModel != null) {
                        aigcWallpaperAnchorViewModel.GQ2();
                    }
                }
            });
            viewOnClickListenerC1836610xtT.LJI();
        } else {
            viewOnClickListenerC1836610xtT = null;
        }
        this.LLILZIL = viewOnClickListenerC1836610xtT;
        this.LLILLJJLI = (C16FV) view.findViewById(R.id.ata);
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.tul);
        runnableC781530UlD.setLayoutManager(new SSLinearLayoutManager(runnableC781530UlD.getContext()));
        runnableC781530UlD.LIZLLL();
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(C942320ad4.class, new C0J8P<C942320ad4, C942340ad6>() { // from class: X.0ad5
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C942320ad4 c942320ad4) {
                C942340ad6 c942340ad6 = (C942340ad6) viewHolder;
                if (c942320ad4.LIZ == 1) {
                    ((TextView) c942340ad6.LL.getValue()).setText(2131842498);
                }
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C942340ad6(viewGroup);
            }
        });
        final DataChannel dataChannel = this.dataChannel;
        c1117360fBO.LLLI(WallpaperContext.class, new C0J8P<WallpaperContext, C942310ad3>(this, dataChannel) { // from class: X.0ad2
            public final AigcWallpaperManageDialog LIZIZ;
            public final DataChannel LIZJ;

            {
                this.LIZIZ = this;
                this.LIZJ = dataChannel;
            }

            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, WallpaperContext wallpaperContext) {
                List urls;
                C942310ad3 c942310ad3 = (C942310ad3) viewHolder;
                WallpaperContext wallpaperContext2 = wallpaperContext;
                if (wallpaperContext2.LIZ && c942310ad3.getLayoutPosition() == 0) {
                    c942310ad3.itemView.setSelected(true);
                    C12ES.LJIILL(0, (View) c942310ad3.LLILLJJLI.getValue());
                    C1143920fsE c1143920fsE = new C1143920fsE();
                    c1143920fsE.LIZ = (C1322110kVd) c942310ad3.LLILLJJLI.getValue();
                    c1143920fsE.LIZIZ = "tiktok_live_liveshow_resource_demand";
                    c1143920fsE.LIZJ = "live_show_showing_indicator.webp";
                    c1143920fsE.LJFF = true;
                    c1143920fsE.LJIIJJI = true;
                    c1143920fsE.LJI = Integer.MAX_VALUE;
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                    C439101nJ.LJI((View) c942310ad3.LL.getValue());
                } else {
                    c942310ad3.itemView.setSelected(false);
                    C439101nJ.LJI((View) c942310ad3.LLILLJJLI.getValue());
                    C12ES.LJIILL(0, (View) c942310ad3.LL.getValue());
                    ((TextView) c942310ad3.LL.getValue()).setText(String.valueOf(wallpaperContext2.LIZIZ));
                }
                ImageModel imageModel = wallpaperContext2.avatarThumb;
                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urls);
                    c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
                    c1324610kZfLIZJ.LJJI((View) c942310ad3.LLILLL.getValue());
                } else {
                    ((C1322110kVd) c942310ad3.LLILLL.getValue()).setActualImageResource(R.drawable.ela);
                }
                ((TextView) c942310ad3.LLILZ.getValue()).setMaxWidth(C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(190.0f)));
                ((TextView) c942310ad3.LLILZ.getValue()).setText(wallpaperContext2.nickname);
                if (wallpaperContext2.LIZ) {
                    C500260Jjc.LLFFF((View) c942310ad3.LLILZIL.getValue());
                    C500260Jjc.LLFFF(c942310ad3.I5());
                    if (c942310ad3.getLayoutPosition() == 0) {
                        C939000aXi c939000aXi = C939000aXi.LIZ;
                        long j = wallpaperContext2.wallpaperStartTime;
                        c939000aXi.getClass();
                        c942310ad3.I5().setText(C01HA.LJII(C939000aXi.LIZJ(j)));
                        c942310ad3.I5().setTextColor(C497740JfY.LIZLLL(R.attr.ewy, c942310ad3.itemView.getContext()));
                        DataChannel dataChannel2 = this.LIZJ;
                        if (dataChannel2 != null) {
                            dataChannel2.BQ2(this.LIZIZ, AigcWallpaperCountDownEvent.class, new AwS594S0100000_15(c942310ad3, 1175));
                            return;
                        }
                        return;
                    }
                    c942310ad3.I5().setText(C01HA.LJII(300L));
                    c942310ad3.I5().setTextColor(C497740JfY.LIZLLL(R.attr.ex7, c942310ad3.itemView.getContext()));
                    return;
                }
                C500260Jjc.LJIILIIL((View) c942310ad3.LLILZIL.getValue());
                C500260Jjc.LJIILIIL(c942310ad3.I5());
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C942310ad3(viewGroup);
            }
        });
        this.LLILLL = c1117360fBO;
        runnableC781530UlD.setAdapter(c1117360fBO);
        view.findViewById(R.id.fsx);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.at0), new ACListenerS150S0100000_15(this, 90));
        View viewFindViewById = view.findViewById(R.id.at_);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS594S0100000_15(this, 410));
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at9), new ACListenerS150S0100000_15(this, 91));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at1), new ACListenerS150S0100000_15(this, 92));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.atb), new ACListenerS150S0100000_15(this, 93));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/wallpaper/view/dialog/anchor/AigcWallpaperManageDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpnq5tO+U5XTzG6bOLLV/oB3bWXvmcRn2MDnACuxhDgZoe8/5FcBYaCEL30hMTA3F8AJL49Lcl", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        this.LLIZLLLIL = !z;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setCancelable(true);
    }
}
