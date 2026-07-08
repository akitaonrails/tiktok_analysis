package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.020G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020G extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020G c020g) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> showSetting;
        DataChannel dataChannel;
        C946060aj6<ShowConfig> c946060aj6J1;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6<ShowConfig> c946060aj6J12;
        ShowConfig showConfigLIZ;
        MutableLiveData<ShowConfig> mutableLiveData;
        LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c020g.l1;
        String str = c020g.s0;
        liveShowAnchorWidget.LLJJL = (C334801Rq) c020g.l2;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) liveShowAnchorWidget.LLILLJJLI;
        if (liveShowAnchorViewModel != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveShowAnchorViewModel.LLJJIJIL;
            liveShowAnchorViewModel.LQ2(false);
        }
        DataChannel dataChannel2 = liveShowAnchorWidget.dataChannel;
        if (dataChannel2 != null && (c946060aj6J12 = liveShowAnchorWidget.J1(dataChannel2)) != null && (showConfigLIZ = c946060aj6J12.LIZ()) != null) {
            liveShowAnchorWidget.LLJJJJJIL = false;
            T t = liveShowAnchorWidget.LLILLJJLI;
            if (t != 0 && (mutableLiveData = t.LLILZ) != null) {
                mutableLiveData.setValue(showConfigLIZ);
            }
        } else {
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null && interfaceC302601FgLIZ2.LJIIL() == 0 && liveShowAnchorWidget.LLJJJJJIL) {
                liveShowAnchorWidget.LLJJJJJIL = false;
                LiveShowAnchorViewModel liveShowAnchorViewModel2 = (LiveShowAnchorViewModel) liveShowAnchorWidget.LLILLJJLI;
                if (liveShowAnchorViewModel2 != null && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && (showSetting = interfaceC302601FgLIZ.getShowSetting(new GetShowSettingsParams())) != null) {
                    liveShowAnchorViewModel2.EQ2().LIZ(showSetting.LJFF(new C0UO0()).LJJIIZ(new C516201zk(liveShowAnchorViewModel2, 158), new C09JN() { // from class: X.00RN
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("LiveShowAnchorViewModel@f562.getShowSetting$2");
                            C20441214yg.LIZIZ("LiveShowAnchorViewModel", "get show setting failed");
                            C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.getShowSetting$2");
                        }
                    }));
                }
            }
        }
        if (C937280aUw.LIZ(str) && (dataChannel = liveShowAnchorWidget.dataChannel) != null && (c946060aj6J1 = liveShowAnchorWidget.J1(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6J1.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
        liveShowAnchorWidget.N1();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020G c020g) {
        CopyOnWriteArrayList<InterfaceC110100bL> copyOnWriteArrayList = C1514440pVq.LIZ;
        String str = c020g.s0;
        Map<String, ? extends Object> map = (Map) c020g.l1;
        Map<String, Long> map2 = (Map) c020g.l2;
        for (InterfaceC110100bL interfaceC110100bL : copyOnWriteArrayList) {
            CopyOnWriteArrayList<InterfaceC110100bL> copyOnWriteArrayList2 = C1514440pVq.LIZ;
            try {
                interfaceC110100bL.LIZ(str, map, map2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020G c020g) {
        ((Function2) c020g.l1).invoke(c020g.s0, (LiveEffect) c020g.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020G c020g) {
        CopyOnWriteArrayList<InterfaceC110100bL> copyOnWriteArrayList = C1208460hYK.LIZ;
        String str = c020g.s0;
        Map<String, ? extends Object> map = (Map) c020g.l1;
        Map<String, Long> map2 = (Map) c020g.l2;
        for (InterfaceC110100bL interfaceC110100bL : copyOnWriteArrayList) {
            CopyOnWriteArrayList<InterfaceC110100bL> copyOnWriteArrayList2 = C1208460hYK.LIZ;
            try {
                interfaceC110100bL.LIZ(str, map, map2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C020G c020g) {
        ((Function2) c020g.l1).invoke(c020g.s0, (LiveEffect) c020g.l2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C020G c020g) {
        List listLIZ;
        ImageModel imageModel;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c020g.l1;
        String str = c020g.s0;
        RoomSticker roomSticker = (RoomSticker) c020g.l2;
        if (roomSticker == null || (imageModel = roomSticker.image) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        interfaceC1631620sYq.invoke(str, "", listLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020G c020g) {
        C20441214yg.LJIIIZ("NoticeboardController", "updateRealImage");
        C953610avH c953610avH = (C953610avH) c020g.l1;
        C953620avI.LJIIJ(c953610avH.LIZ, c953610avH.LIZLLL, new C486901v1((C953610avH) c020g.l1), (C953600avG) c020g.l2, 3, c020g.s0, new C5184020g((C953610avH) c020g.l1, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020G(C953600avG c953600avG, C953610avH c953610avH, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c953610avH;
        this.l2 = c953600avG;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020G(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit> interfaceC1631620sYq2, String str, RoomSticker roomSticker) {
        super(0);
        this.$t = roomSticker;
        this.l1 = interfaceC1631620sYq;
        this.s0 = interfaceC1631620sYq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020G(LiveShowAnchorWidget liveShowAnchorWidget, String str, C334801Rq c334801Rq, int i) {
        super(0);
        this.$t = i;
        this.l1 = liveShowAnchorWidget;
        this.s0 = str;
        this.l2 = c334801Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020G(LiveEffect liveEffect, String str, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l1 = function2;
        this.s0 = str;
        this.l2 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020G(String str, String str2, Map<String, ? extends Object> map, Map<String, Long> map2) {
        super(0);
        this.$t = map2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = map;
    }
}
