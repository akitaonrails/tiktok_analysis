package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest;

import X.C0GYK;
import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12ES;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C417600GZa;
import X.C439101nJ;
import X.C782110Um9;
import X.C786410Ut5;
import X.C943080aeI;
import X.C943120aeM;
import X.C945870ain;
import X.C945940aiu;
import X.InterfaceC1813060xHU;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS150S0100000_15;
import Y.AcS111S1100000_15;
import Y.AcS48S1000000_15;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperSwitchPageEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest.AigcWallpaperGuestCreateDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperGuestResultFragment extends AbsAigcWallpaperFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiHELIOSPi4/JDUtOSohZjMlLDh9LjctLiI2JjFiLjo2OzFiCCY0KxItJSMjKTUpOwgmLTY4GyogPSk4Dz0yLygpJzs=";
    public C0GYK LLILLJJLI;
    public C16F5 LLILLL;
    public C1324720kZq LLILZ;
    public C16FS LLILZIL;
    public C16FS LLILZLL;
    public ViewOnClickListenerC1836610xtT LLIZ;
    public AigcWallpaperGuestViewModel LLIZLLLIL;
    public AigcWallpaperGuestCreateDialog LLJ;
    public C417600GZa LLJI;
    public String LLJIJIL = "";
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final int getLayoutId() {
        return R.layout.hc_;
    }

    public final void UR() {
        C0GYK c0gyk = this.LLILLJJLI;
        if (c0gyk != null) {
            c0gyk.LIZ();
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(AigcWallpaperSwitchPageEvent.class, new C945940aiu(0, 14, (Long) null, (String) null));
        }
        C16FS c16fs = this.LLILZIL;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        C16FS c16fs2 = this.LLILZLL;
        if (c16fs2 != null) {
            c16fs2.setEnabled(false);
        }
        C16FS c16fs3 = this.LLILZLL;
        if (c16fs3 != null) {
            c16fs3.j0(R.style.a7g);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void NR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C945870ain(this, null), 3);
    }

    public final void SR() {
        MutableLiveData<Integer> mutableLiveData;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJILLL = arguments.getString("key_edit_prompt", "");
            this.LLJILJILJ = arguments.getString("key_context_prompt", "");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJILJILJ);
            sbLIZ.append(this.LLJILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LLJIJIL = strLIZIZ;
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(strLIZIZ);
            }
            String str = this.LLJILLL;
            if (str != null) {
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLIZLLLIL;
                if (aigcWallpaperGuestViewModel != null) {
                    aigcWallpaperGuestViewModel.LLJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel), C0PEM.LIZJ, null, new C943080aeI(aigcWallpaperGuestViewModel, str, this.LLJILJILJ, arguments.getLong("key_ai_style", 1L), null), 2);
                }
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = this.LLIZLLLIL;
                if (aigcWallpaperGuestViewModel2 != null && (mutableLiveData = aigcWallpaperGuestViewModel2.LLJJJJ) != null) {
                    mutableLiveData.setValue(mutableLiveData.getValue() != null ? Integer.valueOf(r0.intValue() - 1) : null);
                }
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel3 = this.LLIZLLLIL;
                if (aigcWallpaperGuestViewModel3 != null) {
                    aigcWallpaperGuestViewModel3.LLIZLLLIL.LIZIZ();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void initData() {
        SR();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void OR(View view) {
        C0GYK c0gyk = (C0GYK) view.findViewById(R.id.atl);
        this.LLILLJJLI = c0gyk;
        if (c0gyk != null) {
            C12ES.LJIILL(0, c0gyk);
        }
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.z98);
        this.LLILLL = c16f5;
        if (c16f5 != null) {
            c16f5.setText(this.LLJIJIL);
        }
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.l88);
        this.LLILZ = c1324720kZq;
        if (c1324720kZq != null) {
            C439101nJ.LJI(c1324720kZq);
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.ckj);
        C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 112));
        this.LLILZIL = c16fs;
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.ckk);
        C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 113));
        this.LLILZLL = c16fs2;
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.asu), new ACListenerS150S0100000_15(this, 114));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at9), new ACListenerS150S0100000_15(this, 115));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at1), new ACListenerS150S0100000_15(this, 116));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.atb), new ACListenerS150S0100000_15(this, 117));
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w06);
        viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0aix
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                this.LIZ.UR();
            }
        });
        viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0aiy
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                this.LIZ.UR();
            }
        });
        viewOnClickListenerC1836610xtT.LIZLLL();
        this.LLIZ = viewOnClickListenerC1836610xtT;
        this.LLJI = (C417600GZa) view.findViewById(R.id.lxv);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.xxy), new ACListenerS150S0100000_15(this, 118));
    }

    public final void VR(Boolean bool) {
        String str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "guest_skip_turn";
        } else {
            str = "guest_quit_game";
        }
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LIZIZ = this;
        c782110Um9.LJIIZILJ(2131842461);
        c782110Um9.LJII(2131842459);
        c782110Um9.LJIILIIL(2131842460, new AcS111S1100000_15(this, str, 0));
        c782110Um9.LJIIJ(2131842458, new AcS48S1000000_15(str, 0));
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C943120aeM.LJIIJJI(str, "show", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        Object obj;
        MutableLiveData<Integer> mutableLiveData2 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/wallpaper/view/fragment/guest/AigcWallpaperGuestResultFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpnq5tO+U5XTzG6bOLLV/oBW1eC+nCNZTuX3JbYmKwh6fsFRI4QG0A4raEMZdrx5RZlfTwdJYWL6tEQC6Ldfc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C16FS c16fs = this.LLILZIL;
            if (c16fs != null) {
                c16fs.setEnabled(false);
            }
            C16FS c16fs2 = this.LLILZLL;
            if (c16fs2 != null) {
                c16fs2.setEnabled(false);
            }
            C16FS c16fs3 = this.LLILZLL;
            if (c16fs3 != null) {
                c16fs3.j0(R.style.a7g);
            }
            SR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aigcViewModel?.createCount = ");
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLIZLLLIL;
            if (aigcWallpaperGuestViewModel != null) {
                mutableLiveData2 = aigcWallpaperGuestViewModel.LLJJJJ;
            }
            sbLIZ.append(mutableLiveData2);
            C20441214yg.LIZIZ("AigcWallpaperLog", C2188811AlT.LIZIZ(sbLIZ));
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = this.LLIZLLLIL;
            if (aigcWallpaperGuestViewModel2 != null && (mutableLiveData = aigcWallpaperGuestViewModel2.LLJJJJ) != null && (value = mutableLiveData.getValue()) != null && value.intValue() > 0) {
                C16FS c16fs4 = this.LLILZIL;
                if (c16fs4 != null) {
                    c16fs4.setText(getText(2131842417));
                }
            } else {
                C16FS c16fs5 = this.LLILZIL;
                if (c16fs5 != null) {
                    c16fs5.setText(getText(2131842460));
                }
            }
            C0GYK c0gyk = this.LLILLJJLI;
            if (c0gyk != null) {
                c0gyk.LIZ();
            }
        }
    }
}
