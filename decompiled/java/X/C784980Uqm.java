package X;

import Y.ACListenerS79S0300000_12;
import Y.AObserverS177S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Uqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784980Uqm implements InterfaceViewOnClickListenerC1102800enu, InterfaceC1123890fLv {
    public final LifecycleOwner LL;
    public final Context LLILLJJLI;
    public InterfaceC770540UKm LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public LiveIconView LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public ImageView LLIZLLLIL;
    public IIconSlot.SlotViewModel LLJ;
    public C16F5 LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public DataChannel LLJILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void LJJL(IIconSlot.SlotViewModel slotViewModel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void P0(Boolean bool) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceC1123890fLv
    public final void g(EnumC785140Ur2 enumC785140Ur2) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final void LIZ() {
        C786410Ut5.LJZI(8, this.LLIZLLLIL);
        C786410Ut5.LLIL(this.LLIZ, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZLL);
    }

    @Override // X.InterfaceC1123890fLv
    public final View LJLLI() {
        return this.LLILZIL;
    }

    public C784980Uqm(Context context, BaseFragment baseFragment) {
        this.LLILLJJLI = context;
        this.LL = baseFragment;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.LLJ;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this.LL);
        }
        this.LLJILLL = null;
        InterfaceC770540UKm interfaceC770540UKm = this.LLILLL;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.onDestroy();
            this.LL.getLifecycle().removeObserver(this.LLILLL);
        }
    }

    public final void LIZIZ(Drawable drawable, Drawable drawable2) {
        if (this.LLJIJIL && drawable2 != null) {
            this.LLILZIL.setIcon(drawable2);
            if (drawable2 instanceof C20743516Fd) {
                drawable2.setTint(C446980Hfs.LIZ(this.LLILZIL.getContext(), R.color.aaj));
                return;
            }
            return;
        }
        this.LLILZIL.setIcon(drawable);
        if (!(drawable instanceof C20743516Fd)) {
            return;
        }
        C20743516Fd c20743516Fd = (C20743516Fd) drawable;
        c20743516Fd.setTint(C446980Hfs.LIZ(this.LLILZIL.getContext(), R.color.aaj));
        int iLIZ = C446980Hfs.LIZ(this.LLILZIL.getContext(), R.color.a6j);
        if (iLIZ == 0) {
            c20743516Fd.LIZLLL(null);
        } else {
            c20743516Fd.LIZLLL(new ColorDrawable(iLIZ));
        }
        C21537819Qq c21537819Qq = c20743516Fd.LLJJI.LL;
        if (!c21537819Qq.LLILLJJLI) {
            c21537819Qq.LLILLJJLI = true;
            c21537819Qq.LJII();
            c21537819Qq.LLJJJIL.invalidate();
        }
        c20743516Fd.LJ(0.6666667f);
        if (c20743516Fd.LLJJIJI == 0.6666667f) {
            return;
        }
        c20743516Fd.LLJJIJI = 0.6666667f;
        c20743516Fd.LJII();
        c20743516Fd.invalidateSelf();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLJILJILJ = SystemClock.uptimeMillis();
        this.LLJIJIL = Boolean.TRUE.equals(dataChannel.gg0(C780690Ujr.class));
        this.LLILZ = interfaceC1103130eoR;
        this.LLILZIL = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y7j);
        this.LLIZ = (TextView) interfaceC1103130eoR.findViewById(R.id.y78);
        this.LLIZLLLIL = (ImageView) interfaceC1103130eoR.findViewById(R.id.y76);
        this.LLILZLL = interfaceC1103130eoR.findViewById(R.id.y7f);
        this.LLILZ.setVisibility(8);
        this.LLJILLL = dataChannel;
        if (this.LLJIJIL) {
            this.LLJI = (C16F5) interfaceC1103130eoR.findViewById(R.id.y7s);
        }
        C486790J7d.LIZ.post(new ARunnableS81S0200000_12(dataChannel, this, 79), dataChannel);
    }

    @Override // X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        this.LLJ = slotViewModel;
        if (slotViewModel != null && this.LLILZ != null) {
            slotViewModel.LL.setValue(Boolean.TRUE);
            slotViewModel.LLILZ.observe(this.LL, new AObserverS177S0200000_12(interfaceC1124060fMC, this, 26));
            slotViewModel.LLJILJIL.observe(this.LL, new AObserverS216S0100000_12(this, 65));
            slotViewModel.LLIZ.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 27));
            slotViewModel.LLILZLL.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 28));
            slotViewModel.LLJ.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 29));
            slotViewModel.LLJI.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 30));
            if (this.LLJIJIL) {
                slotViewModel.LLJILJILJ.observe(this.LL, new AObserverS216S0100000_12(this, 63));
            }
            slotViewModel.LLJJ.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 31));
            slotViewModel.LLJJJ.observe(this.LL, new AObserverS177S0200000_12(this, slotViewModel, 25));
            slotViewModel.LLJJJJ.observe(this.LL, new AObserverS216S0100000_12(this, 64));
            this.LLILZ.setOnClickListener(new ACListenerS79S0300000_12(interfaceC1124060fMC, slotViewModel, this, 13));
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void v1(C1123980fM4 c1123980fM4, IIconSlot.SlotViewModel slotViewModel) {
        t1(c1123980fM4.LIZIZ, slotViewModel);
    }
}
