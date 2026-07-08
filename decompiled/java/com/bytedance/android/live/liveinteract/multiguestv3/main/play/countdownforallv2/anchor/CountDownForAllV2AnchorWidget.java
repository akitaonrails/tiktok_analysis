package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor;

import X.C01FV;
import X.C01GW;
import X.C01JA;
import X.C01K8;
import X.C0PEM;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C23250099c;
import X.C303401Fo;
import X.C311101In;
import X.C452501pT;
import X.C5182020e;
import X.C5183020f;
import X.InterfaceC1097170eep;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllUpdatePlaySettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2AnchorWidget extends BaseCountDownForAllV2Widget<CountDownForAllV2AnchorViewModel> {
    public CountDownForAllV2SettingsDialog LLIZ;
    public final C311101In LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C303401Fo LLJIJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final String A1() {
        return "CountDownForAllV2AnchorWidget";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.AbstractCountDownForAllWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final void B1() {
        Fragment fragment;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        final DataChannel dataChannel = this.dataChannel;
        ViewModelProvider.Factory factory = new ViewModelProvider.Factory(dataChannel) { // from class: X.01O5
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(CountDownForAllV2AnchorViewModel.class)) {
                    return new CountDownForAllV2AnchorViewModel(this.LIZ);
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        };
        if (!fragment.isAdded() || fragment.isRemoving() || fragment.isDetached() || fragment.getView() == null) {
            return;
        }
        this.LL = (VM) ViewModelProviders.of(fragment, factory).get(CountDownForAllV2AnchorViewModel.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, X.InterfaceC941870acL
    public final void end() {
        C20441214yg.LIZIZ("CountDownForAllV2AnchorWidget", "ILinkMicAbility#end");
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LL;
        if (countDownForAllV2AnchorViewModel != null) {
            countDownForAllV2AnchorViewModel.FQ2();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CountDownForAllEntryClickEvent.class, new C5183020f(this, 30));
            dataChannel.BQ2(this, CountDownForAllUpdatePlaySettingEvent.class, new C5183020f(this, 31));
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C01JA(this, null), 2);
        this.LLJIJIL.LIZ(new C5183020f(this, 32));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLJIJIL.LIZIZ();
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = this.LLIZ;
        if (countDownForAllV2SettingsDialog != null) {
            countDownForAllV2SettingsDialog.close(1);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    public final C01K8 y1() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01In] */
    public CountDownForAllV2AnchorWidget(ViewGroup viewGroup) {
        super(viewGroup);
        this.LLIZLLLIL = new C01K8() { // from class: X.01In
            @Override // X.C01K8
            public final void LIZJ() {
                CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) this.LIZ.LL;
                if (countDownForAllV2AnchorViewModel != null) {
                    countDownForAllV2AnchorViewModel.FQ2();
                }
            }

            @Override // X.C01K8
            public final void LIZLLL() {
                CountdownForAllConfig countdownForAllConfig;
                CountdownForAllContent countdownForAllContentWQ2;
                List<LinkUser> listLIZLLL;
                CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = this.LIZ;
                if (countDownForAllV2AnchorWidget.dataChannel != null) {
                    CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = countDownForAllV2AnchorWidget.LLIZ;
                    if (C500260Jjc.LJJJI(countDownForAllV2SettingsDialog != null ? Boolean.valueOf(countDownForAllV2SettingsDialog.isVisible()) : null)) {
                        return;
                    }
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() <= 1) {
                        C766270U4b.LIZLLL(2131854064);
                    }
                    DataChannel dataChannel = countDownForAllV2AnchorWidget.dataChannel;
                    VM vm = countDownForAllV2AnchorWidget.LL;
                    if (vm == 0 || (countdownForAllContentWQ2 = vm.wQ2()) == null || (countdownForAllConfig = countdownForAllContentWQ2.playConfig) == null) {
                        countdownForAllConfig = new CountdownForAllConfig();
                    }
                    CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog2 = new CountDownForAllV2SettingsDialog(dataChannel, 2, "playbook_entity", C01JD.LIZ(countdownForAllConfig), (C309801Ia) countDownForAllV2AnchorWidget.LLJ.getValue(), null);
                    countDownForAllV2SettingsDialog2.LLJZIJLIL = new C5183020f(countDownForAllV2AnchorWidget, 29);
                    InterfaceC1097170eep interfaceC1097170eep = countDownForAllV2AnchorWidget.widgetCallback;
                    countDownForAllV2SettingsDialog2.wS(interfaceC1097170eep != null ? interfaceC1097170eep.getFragment() : null, null, "CountDownForAllV2SettingsDialog");
                    countDownForAllV2AnchorWidget.LLIZ = countDownForAllV2SettingsDialog2;
                }
            }

            @Override // X.C01K8
            public final void onDismiss() {
                CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = this.LIZ.LLIZ;
                if (countDownForAllV2SettingsDialog != null) {
                    countDownForAllV2SettingsDialog.close(1);
                }
            }
        };
        this.LLJ = C452501pT.LIZIZ(new C5182020e(this, 35));
        this.LLJI = C452501pT.LIZIZ(new C5182020e(this, 34));
        this.LLJIJIL = new C303401Fo(C01FV.ANCHOR);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget.C1(int, int):void");
    }
}
