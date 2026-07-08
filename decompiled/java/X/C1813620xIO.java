package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsData;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsTab;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsTabInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel$getLiveReplySettings$1", f = "LiveReplySettingViewModel.kt", l = {52}, m = "invokeSuspend")
public final class C1813620xIO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplySettingViewModel LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813620xIO(LiveReplySettingViewModel liveReplySettingViewModel, Integer num, InterfaceC1364105Vn<? super C1813620xIO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplySettingViewModel;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813620xIO c1813620xIO = new C1813620xIO(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1813620xIO.LLILLJJLI = obj;
        return c1813620xIO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Integer numValueOf;
        AnchorReplaySettingsTab next;
        boolean z;
        C1C7U.LIZ("LiveReplySettingViewModel@8dc8.getLiveReplySettings$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                LiveReplySettingViewModel liveReplySettingViewModel = this.LLILLL;
                Integer num = this.LLILZ;
                C1813680xIU c1813680xIU = liveReplySettingViewModel.LL.LLILLJJLI;
                this.LL = 1;
                obj = ((LiveReplySettingApi) c1813680xIU.LL.LL.getValue()).getLiveReplySettings(num, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.getLiveReplySettings$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveReplySettingViewModel liveReplySettingViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            AnchorReplaySettingsData anchorReplaySettingsData = (AnchorReplaySettingsData) ((BaseResponse) c098200Yq).data;
            liveReplySettingViewModel2.getClass();
            liveReplySettingViewModel2.setState(new AwS606S0100000_27(anchorReplaySettingsData, 564));
            Iterator<AnchorReplaySettingsTab> it2 = anchorReplaySettingsData.tabs.iterator();
            while (true) {
                numValueOf = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.type == 11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorReplaySettingsTab anchorReplaySettingsTab = next;
            if (anchorReplaySettingsTab != null) {
                C1813450xI7 c1813450xI7 = EnumC1813530xIF.Companion;
                AnchorReplaySettingsTabInfo anchorReplaySettingsTabInfo = anchorReplaySettingsTab.info;
                if (anchorReplaySettingsTabInfo != null) {
                    numValueOf = Integer.valueOf(anchorReplaySettingsTabInfo.afterLiveVisibility);
                }
                c1813450xI7.getClass();
                EnumC1813530xIF enumC1813530xIFLIZ = C1813450xI7.LIZ(numValueOf);
                liveReplySettingViewModel2.LLILLJJLI = enumC1813530xIFLIZ;
                liveReplySettingViewModel2.setState(new AwS606S0100000_27(enumC1813530xIFLIZ, 565));
                liveReplySettingViewModel2.setState(new AwS606S0100000_27(anchorReplaySettingsTab, 566));
            }
        }
        LiveReplySettingViewModel liveReplySettingViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            liveReplySettingViewModel3.getClass();
            liveReplySettingViewModel3.setState(new AwS606S0100000_27(thM5exceptionOrNullimpl, 563));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.getLiveReplySettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
