package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C0U5V;
import X.C0U60;
import X.C0UA6;
import X.C0UAP;
import X.C0UBC;
import X.C0UBH;
import X.C0UC4;
import X.C0UD4;
import X.C1888650zFP;
import X.C19YU;
import X.C20441214yg;
import X.C767820UAa;
import X.C786410Ut5;
import X.InterfaceC1268640j7O;
import X.InterfaceC1883670z7N;
import X.InterfaceC766480U4w;
import X.InterfaceC769000UEo;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.MultiGuestStickerSelectedEvent;
import com.bytedance.android.live.effect.api.MultiGuestStickerFullPanelHiddenStateChangedEvent;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerDialogView;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerChangeEvent;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerRemoveEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestStickerDialogView extends BaseMultiGuestStickerView implements C0U5V {
    public final int LLJILJIL;
    public final C767820UAa LLJILJILJ;
    public final C19YU LLJILLL;
    public final ViewPager LLJJ;
    public final C0UAP LLJJI;
    public C1888650zFP LLJJIII;
    public final List<C0UBH> LLJJIJI;
    public final List<C0UBH> LLJJIJIIJIL;

    @Override // X.C0U5V
    public final void LIZIZ() {
    }

    @Override // X.C0U5V
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.C0U5V
    public final void LIZLLL(DialogFragment dialogFragment) {
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final String LJI() {
        return "more";
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onDialogForeground();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onDialogBackground();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final View LJFF() {
        return C786410Ut5.Sd(this.LLJILJIL == 2 ? R.layout.gea : R.layout.geb, C786410Ut5.ne(this.LL.getContext()), this.LLJILJILJ.LIZJ);
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJIIJ() {
        C0UAP c0uap = this.LLJJI;
        if (c0uap != null) {
            c0uap.LJJIJL();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJIIJJI() {
        C0UAP c0uap = this.LLJJI;
        if (c0uap != null) {
            c0uap.LJJIL();
        }
    }

    @Override // X.C0U5V
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onDialogBackground() {
        C20441214yg.LIZIZ("EffectMonitor#guest", "onDialogBackground");
        C0UAP c0uap = this.LLJJI;
        if (c0uap != null) {
            c0uap.LJJIJL();
        }
    }

    @Override // X.C0U5V
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onDialogForeground() {
        C0UAP c0uap;
        C20441214yg.LIZIZ("EffectMonitor#guest", "onDialogForeGround $");
        BaseMultiGuestStickerView.LLJIJIL = true;
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIL(this.LLILZLL, true);
        C0UAP c0uap2 = this.LLJJI;
        if (c0uap2 != null) {
            c0uap2.LJJIL();
        }
        C1888650zFP c1888650zFP = this.LLJJIII;
        if (c1888650zFP != null && (c0uap = this.LLJJI) != null) {
            c0uap.LJJIZ(c1888650zFP.LIZLLL);
        }
        this.LLJ.LJIIJJI(C0UD4.LJ);
        this.LLJ.LJIILL(this.LLILZ);
    }

    @Override // X.C0U5V
    public final View getView() {
        return LJII();
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        super.onDestroy();
        BaseMultiGuestStickerView.LLJIJIL = false;
        C0UAP c0uap = this.LLJJI;
        if (c0uap != null) {
            c0uap.LJJIJLIJ();
        }
        this.LL.getLifecycle().removeObserver(this);
    }

    public MultiGuestStickerDialogView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, final InterfaceC769000UEo interfaceC769000UEo, C767820UAa c767820UAa) {
        C0UAP c0uap;
        super(fragment, interfaceC1268640j7O, interfaceC769000UEo, viewGroup, c767820UAa.LIZIZ, c767820UAa.LIZ);
        this.LLJILJIL = i;
        this.LLJILJILJ = c767820UAa;
        C19YU c19yu = (C19YU) LJII().findViewById(R.id.wz1);
        this.LLJILLL = c19yu;
        ViewPager viewPager = (ViewPager) LJII().findViewById(R.id.w6p);
        this.LLJJ = viewPager;
        C0UBC c0ubc = new C0UBC(c19yu, viewPager, -1);
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        if (fragment.getContext() != null) {
            c0uap = new C0UAP(this.LLILZLL, C0UD4.LJ, interfaceC769000UEo, stickerEffectViewModelLIZ);
        } else {
            c0uap = null;
        }
        this.LLJJI = c0uap;
        ArrayList arrayList = new ArrayList();
        this.LLJJIJI = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LLJJIJIIJIL = arrayList2;
        LJIIIZ();
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 59), LJII().findViewById(R.id.cko));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 60), LJII().findViewById(R.id.ckm));
        if (c0uap != null) {
            c0uap.LLIZ = new C0UA6() { // from class: X.0U97
                @Override // X.C0UA6
                public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                    InterfaceC769000UEo interfaceC769000UEo2;
                    if (liveEffect2 == null) {
                        if (liveEffect != null) {
                            InterfaceC769000UEo interfaceC769000UEo3 = interfaceC769000UEo;
                            if (interfaceC769000UEo3 != null) {
                                interfaceC769000UEo3.lr(C0UD4.LJ);
                            }
                            this.LLJ.LJIILJJIL(liveEffect);
                        }
                    } else {
                        C0UC4 c0uc4 = C0UC4.LIZ;
                        DataChannel dataChannel = this.LLILZLL;
                        String str = C0UD4.LJ;
                        C0UC4.LJJIII(dataChannel, true, liveEffect2, str);
                        if (C767250U7v.LIZLLL(liveEffect) && (interfaceC769000UEo2 = interfaceC769000UEo) != null) {
                            interfaceC769000UEo2.lr(str);
                        }
                        this.LLJ.getClass();
                        InterfaceC769000UEo interfaceC769000UEo4 = interfaceC769000UEo;
                        if (interfaceC769000UEo4 != null) {
                            interfaceC769000UEo4.Gr(str, liveEffect, liveEffect2);
                        }
                        this.LLJ.LJFF(liveEffect2);
                    }
                    this.getClass();
                    DataChannel dataChannel2 = this.LLILZLL;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(MultiGuestStickerSelectedEvent.class, new C0U95(liveEffect2));
                    }
                }
            };
        }
        viewPager.setAdapter(c0uap);
        viewPager.setOffscreenPageLimit(3);
        this.LLJILLL.LJIILLIIL(this.LLJJ, false, false);
        c19yu.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0UAR
            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                Object obj;
                C0UBH c0ubh;
                String str;
                String str2 = null;
                if (c1888650zFP != null) {
                    obj = c1888650zFP.LIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C0UBH) {
                    c0ubh = (C0UBH) obj;
                } else {
                    c0ubh = null;
                }
                MultiGuestStickerDialogView multiGuestStickerDialogView = this.LIZ;
                int i2 = 1;
                if (multiGuestStickerDialogView.LLJJIII != null) {
                    C0U98 c0u98 = multiGuestStickerDialogView.LLJ;
                    if (c0ubh != null) {
                        str = c0ubh.LIZ;
                        str2 = c0ubh.LIZIZ;
                    } else {
                        str = null;
                    }
                    c0u98.LJIIZILJ(str, str2);
                }
                MultiGuestStickerDialogView multiGuestStickerDialogView2 = this.LIZ;
                multiGuestStickerDialogView2.LLJJIII = c1888650zFP;
                C0UAP c0uap2 = multiGuestStickerDialogView2.LLJJI;
                if (c0uap2 != null) {
                    if (c1888650zFP != null) {
                        i2 = c1888650zFP.LIZLLL;
                    }
                    c0uap2.LJJIZ(i2);
                }
            }
        });
        List<C0UBH> value = ((MultiGuestStickerViewModel) this.LLIZ.getValue()).LLILZ.getValue();
        if (value != null) {
            arrayList2.clear();
            arrayList2.addAll(value);
            arrayList.clear();
            arrayList.add(new C0UBH("favorite", "favorite", false));
            arrayList.addAll(arrayList2);
            if (c0uap != null) {
                c0uap.setData(arrayList);
            }
            c0ubc.LIZJ = 1;
            c0ubc.LIZIZ(arrayList);
            if (c0uap != null) {
                C1888650zFP c1888650zFP = this.LLJJIII;
                c0uap.LJJIZ(c1888650zFP != null ? c1888650zFP.LIZLLL : 1);
            }
        }
        InterfaceC766480U4w.LJJIIJZLJL.LJFF(Boolean.TRUE);
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, MultiGuestStickerFullPanelHiddenStateChangedEvent.class, new AwS591S0100000_12(this, 105));
            dataChannel.BQ2(fragment, GuestManagePanelStickerChangeEvent.class, new AwS591S0100000_12(this, 106));
            dataChannel.BQ2(fragment, GuestManagePanelStickerRemoveEvent.class, new AwS591S0100000_12(this, 107));
        }
        fragment.getLifecycle().addObserver(this);
    }
}
