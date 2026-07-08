package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui;

import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C513601zK;
import X.InterfaceC941870acL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTextHeaderWidget<VM extends BaseTextHeaderViewModel> extends LiveWidget implements InterfaceC941870acL {
    public VM LL;
    public final C513601zK LLILLJJLI = new C513601zK(this, 29);
    public final C513601zK LLILLL = new C513601zK(this, 30);
    public final C513601zK LLILZ = new C513601zK(this, 31);
    public final C513601zK LLILZIL = new C513601zK(this, 32);

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "header";
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract String x1();

    public abstract void y1();

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        VM vm = this.LL;
        return C500260Jjc.LJJJI(vm != null ? Boolean.valueOf(vm.DQ2()) : null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        C20441214yg.LIZIZ(x1(), "onCreate");
        y1();
        VM vm = this.LL;
        if (vm != null) {
            vm.onInit();
            vm.LLILZ.observe(this, this.LLILLJJLI);
            vm.LLILZLL.observe(this, this.LLILLL);
            vm.LLIZLLLIL.observe(this, this.LLILZ);
            vm.LLIZ.observe(this, this.LLILZIL);
            Object value = vm.LLILZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRunningRecordInfoChange recordInfo:");
            sbLIZ.append(value);
            C20441214yg.LIZIZ(x1(), C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        C20441214yg.LJIIIZ(x1(), "onDestroy");
        C20441214yg.LIZIZ(x1(), "clearCache");
        VM vm = this.LL;
        if (vm != null) {
            vm.wQ2().LIZJ.clear();
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            vm2.onDestroy();
        }
    }
}
