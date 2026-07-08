package X;

import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.BaseUplinkData;
import com.bytedance.android.livesdk.signaling.model.ExtraT;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0J66, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0J66<STATE, CALLBACK_MODEL extends BaseDownlinkData> {
    public final String LIZ;
    public final STATE LIZIZ;
    public final List<String> LIZJ;
    public final Set<Pair<WeakReference<C0CW2<CALLBACK_MODEL>>, List<String>>> LIZLLL = new HashSet();

    public boolean LIZJ(UplinkModel<?> uplinkModel) {
        return false;
    }

    public List<UplinkModel<?>> LJ() {
        return null;
    }

    public List<UplinkModel<?>> LJFF(STATE state) {
        return null;
    }

    public abstract Class<CALLBACK_MODEL> LJIIIIZZ();

    public boolean LJIIIZ() {
        return this instanceof MultiTopLiveRoomMatchScene;
    }

    public List<UplinkModel<?>> LJIIJJI() {
        return null;
    }

    public long LIZLLL() {
        return LiveSignalingSystemSetting.INSTANCE.timerInterval();
    }

    public final void LJII(C0CW2<CALLBACK_MODEL> c0cw2) {
        C19719612Di.LJJIII(this.LIZLLL, new AwS586S0100000_7((C0CW2) c0cw2, 2), true);
    }

    public final void LJIIJ(STATE state) {
        List<UplinkModel<?>> listLJFF = LJFF(state);
        if (listLJFF == null) {
            return;
        }
        for (UplinkModel<?> uplinkModel : listLJFF) {
            C0J65 c0j65 = C0J65.LL;
            c0j65.getClass();
            if (Intrinsics.LJFF(C0J65.LLILLL, Boolean.TRUE)) {
                c0j65.LJIIIIZZ(uplinkModel);
                C0J67.LIZLLL(true, uplinkModel);
            } else {
                T t = uplinkModel.data;
                if (t != 0 && t.getNeedResp() && LIZJ(uplinkModel)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("executeHTTPRequestDirectlyWhenWsNotConnected: ");
                    sbLIZ.append(uplinkModel.subType);
                    C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0J65.LJ(C1697810uHb.LJIILJJIL(uplinkModel));
                }
                if (!LJIIIZ()) {
                    ((CopyOnWriteArrayList) C0J65.LLILZLL).add(uplinkModel);
                    C0J65.LIZLLL("enqueueUplinkMessageByHttp");
                }
            }
        }
    }

    public final void LIZ(C0CW2<CALLBACK_MODEL> c0cw2, List<String> list) {
        if (((HashSet) this.LIZLLL).isEmpty() && (this instanceof C0J60)) {
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (!c2203431BLp.isConnected()) {
                c2203431BLp.LJ("live_preview");
            }
        }
        C19719612Di.LJJIII(this.LIZLLL, new C0J68(), true);
        ((HashSet) this.LIZLLL).add(new Pair(new WeakReference(c0cw2), list));
    }

    public final void LJI(UplinkMessageResponse uplinkMessageResponse, boolean z) {
        String canonicalName;
        if (((HashSet) this.LIZLLL).isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbsSignalingScene.dispatchMessage: noDispatch: empty callback list. biz_type=");
            sbLIZ.append(uplinkMessageResponse.bizType);
            sbLIZ.append(", sub_type=");
            sbLIZ.append(uplinkMessageResponse.subType);
            C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
            C0J67.LIZIZ(z, uplinkMessageResponse, null, true);
            return;
        }
        try {
            BaseDownlinkData baseDownlinkData = (BaseDownlinkData) C19748512Ol.LIZJ.LJII(uplinkMessageResponse.data, LJIIIIZZ());
            if (baseDownlinkData != null) {
                boolean z2 = false;
                for (Pair pair : (HashSet) this.LIZLLL) {
                    List list = (List) pair.getSecond();
                    if (list == null || list.contains(uplinkMessageResponse.subType)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AbsSignalingScene.dispatchMessage: success dispatch to ");
                        Object obj = ((Reference) pair.getFirst()).get();
                        if (obj != null) {
                            canonicalName = obj.getClass().getCanonicalName();
                        } else {
                            canonicalName = null;
                        }
                        sbLIZ2.append(canonicalName);
                        sbLIZ2.append(" biz_type=");
                        sbLIZ2.append(uplinkMessageResponse.bizType);
                        sbLIZ2.append(", sub_type=");
                        sbLIZ2.append(uplinkMessageResponse.subType);
                        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ2));
                        C0CW2 c0cw2 = (C0CW2) ((Reference) pair.getFirst()).get();
                        if (c0cw2 != null) {
                            c0cw2.LJII(baseDownlinkData, uplinkMessageResponse, new AwS125S0110000_7(z, uplinkMessageResponse, baseDownlinkData, 0));
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    C0J67.LIZIZ(z, uplinkMessageResponse, baseDownlinkData, false);
                } else {
                    C0J67.LIZIZ(z, uplinkMessageResponse, baseDownlinkData, true);
                }
                C19719612Di.LJJIII(this.LIZLLL, AFwS232S0000000_4.get$arr$(0), true);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("AbsSignalingScene.dispatchMessage: noDispatch: error decode model. biz_type=");
        sbLIZ3.append(uplinkMessageResponse.bizType);
        sbLIZ3.append(", sub_type=");
        sbLIZ3.append(uplinkMessageResponse.subType);
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ3));
        C0J67.LIZIZ(z, uplinkMessageResponse, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0J66(Object obj, String str, List list) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = list;
    }

    public static UplinkModel LIZIZ(C0J66 c0j66, String str, String str2, BaseUplinkData baseUplinkData) {
        c0j66.getClass();
        UplinkModel uplinkModel = new UplinkModel(str, str2, baseUplinkData, null);
        ExtraT extraT = new ExtraT();
        extraT.uniqId = C1017903yT.LIZ();
        boolean z = true;
        if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, LiveSignalingSystemSetting.INSTANCE.sendMonitorSampling())) != 1) {
            z = false;
        }
        extraT.needReport = z;
        uplinkModel.extra = extraT;
        return uplinkModel;
    }
}
