package X;

import Y.ACListenerS49S0400000_12;
import Y.AObserverS125S0300000_12;
import Y.AObserverS177S0200000_12;
import Y.AObserverS216S0100000_12;
import Y.AObserverS78S0400000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Uqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785000Uqo implements InterfaceViewOnClickListenerC1102800enu, InterfaceC1123890fLv {
    public static final List<C785010Uqp> LLJJIII;
    public final LifecycleOwner LL;
    public final Context LLILLJJLI;
    public InterfaceC770540UKm LLILLL;
    public C1295960jpS LLILZ;
    public InterfaceC1103130eoR LLILZIL;
    public LiveIconView LLILZLL;
    public View LLIZ;
    public TextView LLIZLLLIL;
    public ImageView LLJ;
    public IIconSlot.SlotViewModel LLJI;
    public C16F5 LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public DataChannel LLJJ;
    public C447180HgC LLJJI;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ void LJJL(IIconSlot.SlotViewModel slotViewModel) {
    }

    @Override // X.InterfaceC1123890fLv
    public final /* synthetic */ View LJLLI() {
        return null;
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
    public final /* synthetic */ boolean f1() {
        return false;
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

    static {
        ArrayList arrayList = new ArrayList();
        LLJJIII = arrayList;
        arrayList.add(new C785010Uqp((int) C497740JfY.LIZIZ(30.0f), (int) C497740JfY.LIZIZ(30.0f), 0, 255));
        arrayList.add(new C785010Uqp((int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(6.0f), 204));
        arrayList.add(new C785010Uqp((int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(12.0f), 102));
    }

    public final void LIZ() {
        C786410Ut5.LJZI(8, this.LLJ);
        C786410Ut5.LLIL(this.LLIZLLLIL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLIZ);
    }

    public C785000Uqo(Context context, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = context;
        this.LL = lifecycleOwner;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        AnonymousClass0956 anonymousClass0956;
        C0IK5.LIZLLL(this);
        IIconSlot.SlotViewModel slotViewModel = this.LLJI;
        if (slotViewModel != null) {
            slotViewModel.vQ2(this.LL);
        }
        if (dataChannel != null) {
            dataChannel.zW(EcLiveBarrageEnable.class, Boolean.TRUE);
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLILLL;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.onDestroy();
            this.LL.getLifecycle().removeObserver(this.LLILLL);
        }
        C447180HgC c447180HgC = this.LLJJI;
        if (c447180HgC != null && (anonymousClass0956 = c447180HgC.LIZIZ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLJILLL = SystemClock.uptimeMillis();
        this.LLJILJIL = Boolean.TRUE.equals(dataChannel.gg0(C780690Ujr.class));
        this.LLILZIL = interfaceC1103130eoR;
        this.LLILZLL = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y7j);
        this.LLIZLLLIL = (TextView) interfaceC1103130eoR.findViewById(R.id.y78);
        this.LLJ = (ImageView) interfaceC1103130eoR.findViewById(R.id.y76);
        this.LLIZ = interfaceC1103130eoR.findViewById(R.id.y7f);
        this.LLILZ = (C1295960jpS) interfaceC1103130eoR.findViewById(R.id.y79);
        this.LLJJ = dataChannel;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enableStrategy(EnumC1102740eno.AUDIENCE_SLOT.name())) {
            LIZ();
            ImageView imageView = this.LLJ;
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            LiveIconView liveIconView = this.LLILZLL;
            if (liveIconView != null) {
                liveIconView.setImageDrawable(null);
            }
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                c16f5.setText((CharSequence) null);
            }
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
        }
        this.LLILZIL.setVisibility(8);
        if (this.LLJILJIL) {
            this.LLJIJIL = (C16F5) interfaceC1103130eoR.findViewById(R.id.y7s);
        }
        C486790J7d.LIZ.post(new ARunnableS81S0200000_12(dataChannel, this, 81), this);
    }

    @Override // X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        IIconSlot iIconSlot = (IIconSlot) interfaceC1124060fMC.LLILZLL();
        this.LLJI = slotViewModel;
        if (slotViewModel != null && this.LLILZIL != null) {
            slotViewModel.LL.setValue(Boolean.TRUE);
            slotViewModel.LLILZ.observe(this.LL, new AObserverS177S0200000_12(interfaceC1124060fMC, this, 32));
            slotViewModel.LLJILJIL.observe(this.LL, new AObserverS216S0100000_12(this, 70));
            slotViewModel.LLIZ.observe(this.LL, new AObserverS177S0200000_12(slotViewModel, this, 33));
            slotViewModel.LLILZLL.observe(this.LL, new AObserverS177S0200000_12(slotViewModel, this, 34));
            slotViewModel.LLJ.observe(this.LL, new AObserverS177S0200000_12(slotViewModel, this, 35));
            slotViewModel.LLJI.observe(this.LL, new AObserverS177S0200000_12(slotViewModel, this, 36));
            if (this.LLJILJIL) {
                slotViewModel.LLJILJILJ.observe(this.LL, new AObserverS216S0100000_12(this, 68));
            }
            slotViewModel.LLJJ.observe(this.LL, new AObserverS177S0200000_12(slotViewModel, this, 37));
            slotViewModel.LLJJIJI.observe(this.LL, new AObserverS78S0400000_12(slotViewModel, iIconSlot, interfaceC1124060fMC, this, 1));
            slotViewModel.LLJJJJ.observe(this.LL, new AObserverS216S0100000_12(this, 69));
            slotViewModel.LLJJIII.observe(this.LL, new AObserverS125S0300000_12(slotViewModel, this, interfaceC1124060fMC, 14));
            this.LLILZIL.setOnClickListener(new ACListenerS49S0400000_12(slotViewModel, iIconSlot, interfaceC1124060fMC, this, 0));
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void v1(C1123980fM4 c1123980fM4, IIconSlot.SlotViewModel slotViewModel) {
        t1(c1123980fM4.LIZIZ, slotViewModel);
    }
}
