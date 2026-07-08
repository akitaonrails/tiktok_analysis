package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common;

import X.C01EI;
import X.C01GW;
import X.C01HZ;
import X.C01N8;
import X.C08CX;
import X.C1083530eIp;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1AZW;
import X.C20374514nv;
import X.C20441214yg;
import X.C356901a3;
import X.C452501pT;
import X.C499301x1;
import X.C499701x5;
import X.C500260Jjc;
import X.C513601zK;
import X.C5182020e;
import X.C5183020f;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C915900ZwS;
import X.C941700ac4;
import X.C956690b0F;
import X.C978360bZC;
import X.EnumC20429914wr;
import X.EnumC499801x6;
import X.InterfaceC926960aEI;
import X.InterfaceC941870acL;
import X.InterfaceC986020blY;
import X.RunnableC514501zT;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookLifecycleSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlaybookService<VM extends BasePlaybookViewModel> implements LifecycleOwner, DefaultLifecycleObserver, InterfaceC941870acL, GenericLifecycleObserver {
    public final DataChannel LL;
    public VM LLILLJJLI;
    public PlaybookEditorDialog LLILZIL;
    public final LifecycleRegistry LLILLL = new LifecycleRegistry(this);
    public final C01GW LLILZ = C452501pT.LIZIZ(new C5182020e((BasePlaybookService) this, 47));
    public final boolean LLILZLL = C500260Jjc.LJJIL();
    public final ConcurrentHashMap<String, Function2<String, Map<String, ? extends Object>, Map<String, String>>> LLIZ = new ConcurrentHashMap<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C5182020e((BasePlaybookService) this, 46));
    public final C513601zK LLJ = new C513601zK(this, 8);

    public abstract String LJJIJIIJI();

    public LiveData<List<PlaybookTagAggregation>> LJJIJIL() {
        return null;
    }

    public abstract String LJJIJLIJ();

    public abstract void LJJIL();

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "playbook";
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C499301x1 LJJIJ() {
        return (C499301x1) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        ActivePlaybook activePlaybook;
        VM vm = this.LLILLJJLI;
        return (vm == null || (activePlaybook = vm.wQ2().LJIIIZ) == null || activePlaybook.playStatus != 1) ? false : true;
    }

    public void LJJJIL() {
        C1AZW.LJIIJ(12, C01EI.LIZ(185, LJJIJLIJ()), "toDestroy", null, null);
        if (!LinkMicPlaybookLifecycleSwitchSetting.INSTANCE.isEnable()) {
            this.LLILLL.setCurrentState(Lifecycle.State.DESTROYED);
        } else if (this.LLILLL.getCurrentState() != Lifecycle.State.INITIALIZED && this.LLILLL.getCurrentState() != Lifecycle.State.DESTROYED) {
            this.LLILLL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        if (this.LLILZLL) {
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.LJIIIIZZ(this);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final /* bridge */ /* synthetic */ Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public BasePlaybookService(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final boolean LJJIIZ(String str) {
        Boolean boolValueOf;
        VM vm = this.LLILLJJLI;
        if (vm != null) {
            boolValueOf = Boolean.valueOf(vm.wQ2().LJIJJLI());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            C1AZW.LJFF(C01EI.LIZ(202, LJJIJLIJ()), "checkSymphonyEngineAndToast false", null, null);
            C766270U4b.LIZLLL(2131855311);
            LJJIZ(str, false);
            return false;
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(207, LJJIJLIJ()), "checkSymphonyEngineAndToast true", null, null);
        LJJIZ(str, true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJJIIZI(boolean r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService.LJJIIZI(boolean):org.json.JSONObject");
    }

    public void onCreate(LifecycleOwner lifecycleOwner) {
        C01HZ c01hzKi1;
        C356901a3.LIZ(this, lifecycleOwner);
        C1AZW.LJIIJ(12, C01EI.LIZ(134, LJJIJLIJ()), "onCreate", null, null);
        this.LLILLL.setCurrentState(Lifecycle.State.CREATED);
        LJJIL();
        VM vm = this.LLILLJJLI;
        if (vm != null) {
            vm.onInit();
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514501zT(vm, this, 2));
        }
        C499301x1 c499301x1LJJIJ = LJJIJ();
        if (c499301x1LJJIJ != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookBannerHelper"), "registerBanner", null, null);
            C1548820qPI.LIZLLL("playbook_banner_ready", c499301x1LJJIJ.LJFF);
            C1548820qPI.LIZLLL("playbook_banner_common_event", c499301x1LJJIJ.LJFF);
        }
        if (((String) this.LLILZ.getValue()).length() > 0 && (c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1()) != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.ALL, C915900ZwS.LIZIZ((String) this.LLILZ.getValue()), null);
        }
        if (!this.LLILZLL) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ != null) {
                interfaceC926960aEILIZJ.LIZIZ(this);
            }
        }
    }

    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LJJJIL();
        C499301x1 c499301x1LJJIJ = LJJIJ();
        if (c499301x1LJJIJ != null) {
            c499301x1LJJIJ.LIZIZ("toDestroy", LJJIIZI(true));
        }
        C499301x1 c499301x1LJJIJ2 = LJJIJ();
        if (c499301x1LJJIJ2 != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookBannerHelper"), "unregisterBanner", null, null);
            C1548820qPI.LJIIIIZZ("playbook_banner_ready", c499301x1LJJIJ2.LJFF);
            C1548820qPI.LJIIIIZZ("playbook_banner_common_event", c499301x1LJJIJ2.LJFF);
        }
        this.LL.zW(ActivePlaybookChannel.class, new C499701x5(C08CX.INSTANCE, null));
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.ALL, C915900ZwS.LIZIZ((String) this.LLILZ.getValue()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        C1AZW.LJIIJ(12, C01EI.LIZ(163, LJJIJLIJ()), "onPause", null, null);
        this.LLILLL.setCurrentState(Lifecycle.State.STARTED);
        C499301x1 c499301x1LJJIJ = LJJIJ();
        if (c499301x1LJJIJ != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookBannerHelper"), "onBackground", null, null);
            c499301x1LJJIJ.LJ = true;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C1AZW.LJIIJ(12, C01EI.LIZ(155, LJJIJLIJ()), "onResume", null, null);
        this.LLILLL.setCurrentState(Lifecycle.State.RESUMED);
        C499301x1 c499301x1LJJIJ = LJJIJ();
        if (c499301x1LJJIJ != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookBannerHelper"), "onForeground", null, null);
            if (c499301x1LJJIJ.LJ && C500260Jjc.LJJJI(Boolean.valueOf(c499301x1LJJIJ.LIZIZ.LIZJ()))) {
                c499301x1LJJIJ.LIZ("onForeground");
                c499301x1LJJIJ.LIZIZ.LIZIZ(new C5183020f(c499301x1LJJIJ, 208));
            }
            c499301x1LJJIJ.LJ = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
        C1AZW.LJIIJ(12, C01EI.LIZ(148, LJJIJLIJ()), "onStart", null, null);
        this.LLILLL.setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
        C1AZW.LJIIJ(12, C01EI.LIZ(171, LJJIJLIJ()), "onStop", null, null);
        this.LLILLL.setCurrentState(Lifecycle.State.CREATED);
    }

    public static void LJJIZ(String str, boolean z) {
        String str2;
        String str3;
        int i;
        if (C500260Jjc.LJJIL()) {
            str2 = "preview_page_to_playbook_detail";
        } else {
            str2 = "live_room_to_playbook_detail";
        }
        if (z) {
            str3 = "";
            i = 0;
        } else {
            str3 = "so_fail";
            i = -2;
        }
        C01N8.LIZ(i, str2, str, 0L, "anchor", str3, "");
    }

    public final Map<String, String> LJJIJIIJIL(String str, Map<String, ? extends Object> map) {
        if (this.LLIZ.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Function2<String, Map<String, ? extends Object>, Map<String, String>>>> it2 = this.LLIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map<String, String> mapInvoke = it2.next().getValue().invoke(str, map);
            if (mapInvoke != null) {
                linkedHashMap.putAll(mapInvoke);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJ(LiveSheetFragment liveSheetFragment, DataChannel dataChannel, Playbook playbook, FragmentManager fragmentManager, String str, C915190ZvJ c915190ZvJ) {
        if (!PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            return;
        }
        boolean zBooleanValue = false;
        if (str.length() > 0) {
            InterfaceC986020blY interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
            if (interfaceC986020blYMb0 != null) {
                interfaceC986020blYMb0.LIZIZ(EnumC20429914wr.ENTRANCE, EnumC499801x6.PLAYBOOK, str);
            }
            C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
            if (c01hzKi1 != null) {
                c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(str), null);
            }
        }
        C20441214yg.LIZIZ(LJJIJLIJ(), "showEditorDialog");
        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
        C978360bZC.LJJIJ(c915190ZvJ);
        if (LJJIIZ("editor_page")) {
            PlaybookEditorDialog playbookEditorDialog = this.LLILZIL;
            if (playbookEditorDialog != null) {
                playbookEditorDialog.close(1);
            }
            String str2 = PlaybookEditorDialog._pnsPageId;
            C5182020e c5182020e = new C5182020e((BasePlaybookService) this, 48);
            PlaybookEditorDialog playbookEditorDialog2 = new PlaybookEditorDialog();
            playbookEditorDialog2.LLLIIIL = dataChannel;
            playbookEditorDialog2.LLLIIL = this;
            playbookEditorDialog2.LLLIILIL = playbook;
            playbookEditorDialog2.LLLIL = c5182020e;
            Boolean bool = (Boolean) dataChannel.gg0(C1083530eIp.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            playbookEditorDialog2.LLLILZ = zBooleanValue;
            Boolean bool2 = (Boolean) dataChannel.gg0(C956690b0F.class);
            if (bool2 != null) {
                bool2.booleanValue();
            }
            this.LLILZIL = playbookEditorDialog2;
            if (fragmentManager != null) {
                C20374514nv.LJIIIZ(fragmentManager, playbookEditorDialog2, "PlaybookEditorDialog");
            } else {
                if (liveSheetFragment == null) {
                    return;
                }
                C20374514nv.LJIIJ(liveSheetFragment, playbookEditorDialog2, "PlaybookEditorDialog");
            }
        }
    }
}
