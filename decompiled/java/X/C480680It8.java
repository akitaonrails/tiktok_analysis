package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveReusePlayerStopSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0It8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480680It8 {
    public static final C480680It8 LJ = new C480680It8();
    public volatile InterfaceC480510Isr LIZIZ;
    public Boolean LIZJ;
    public volatile ConcurrentHashMap<String, InterfaceC480510Isr> LIZ = new ConcurrentHashMap<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(5));

    public final boolean LIZLLL() {
        Boolean bool = this.LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(LiveMultiPlayerEnableSetting.INSTANCE.getValue());
        this.LIZJ = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public final InterfaceC480510Isr LIZ(String str) {
        if (this.LIZ.containsKey(str)) {
            return this.LIZ.get(str);
        }
        return null;
    }

    public final InterfaceC480510Isr LIZIZ(String str) {
        if (LIZLLL()) {
            Integer numValueOf = null;
            if (str == null) {
                return null;
            }
            InterfaceC480510Isr interfaceC480510IsrLIZ = LIZ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("  getPlayerController from cache: ");
            if (interfaceC480510IsrLIZ != null) {
                numValueOf = Integer.valueOf(interfaceC480510IsrLIZ.hashCode());
            }
            sbLIZ.append(numValueOf);
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
            return interfaceC480510IsrLIZ;
        }
        C465160ILy.LIZ().getClass();
        return (InterfaceC480510Isr) C1APP.LIZIZ(InterfaceC480510Isr.class);
    }

    public final void LJ(Context context) {
        String key;
        if (LIZLLL()) {
            Iterator<Map.Entry<String, InterfaceC480510Isr>> it2 = this.LIZ.entrySet().iterator();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseAllMultiPlayer()，count=");
            sbLIZ.append(this.LIZ.size());
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
            while (it2.hasNext()) {
                Map.Entry<String, InterfaceC480510Isr> next = it2.next();
                InterfaceC480510Isr value = next.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("releaseAllMultiPlayer() try to delete ");
                sbLIZ2.append(next.getKey());
                sbLIZ2.append("  , force release?=");
                sbLIZ2.append(false);
                C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (next.getKey() == null || (key = next.getKey()) == null || !a0.LJJIIZI(key, "preview", false)) {
                    if (value.LJJJJLI(context)) {
                        it2.remove();
                    }
                }
            }
            this.LIZIZ = null;
            ((C480740ItE) this.LIZLLL.getValue()).LIZ();
            return;
        }
        C465160ILy.LIZ().getClass();
        ((InterfaceC480520Iss) C1APP.LIZIZ(InterfaceC480510Isr.class)).LJJJJLI(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
        this.LIZIZ = null;
    }

    public final void LJFF(String str) {
        int iHashCode;
        if (LIZLLL() && str != null && LIZ(str) != null) {
            InterfaceC480510Isr interfaceC480510IsrRemove = this.LIZ.remove(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear player=");
            if (interfaceC480510IsrRemove != null) {
                iHashCode = interfaceC480510IsrRemove.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(" from cache");
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJII(String str) {
        InterfaceC480510Isr interfaceC480510IsrLIZ;
        if (LIZLLL()) {
            if (str != null && (interfaceC480510IsrLIZ = LIZ(str)) != null) {
                this.LIZIZ = interfaceC480510IsrLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set current player ");
                sbLIZ.append(str);
                sbLIZ.append(" --> ");
                sbLIZ.append(interfaceC480510IsrLIZ.hashCode());
                C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
                interfaceC480510IsrLIZ.t0(str, "multi-player selected!", false);
                if (this.LIZIZ instanceof InterfaceC469080IaQ) {
                    DataChannelGlobal.LLILZ.JQ2(C1148390fzR.class, this.LIZIZ);
                    return;
                }
                return;
            }
            return;
        }
        C465160ILy.LIZ().getClass();
        this.LIZIZ = (InterfaceC480510Isr) C1APP.LIZIZ(InterfaceC480510Isr.class);
    }

    public final void LJIIIIZZ(String str) {
        InterfaceC480510Isr interfaceC480510IsrLIZ;
        if (LIZLLL() && str != null && (interfaceC480510IsrLIZ = LIZ(str)) != null) {
            interfaceC480510IsrLIZ.t0(str, "", true);
            interfaceC480510IsrLIZ.stop(str);
            if (LiveReusePlayerStopSetting.INSTANCE.getValue()) {
                interfaceC480510IsrLIZ.LIZIZ("stopPrePullStream");
            }
            InterfaceC480510Isr interfaceC480510IsrRemove = this.LIZ.remove(str);
            if (interfaceC480510IsrRemove != null) {
                ((C480740ItE) this.LIZLLL.getValue()).LIZJ(interfaceC480510IsrRemove);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove ");
            sbLIZ.append(str);
            sbLIZ.append(" from cache");
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIJ(String str) {
        InterfaceC480510Isr interfaceC480510IsrRemove;
        if (!LIZLLL() || str == null || (interfaceC480510IsrRemove = this.LIZ.remove(str)) == null || interfaceC480510IsrRemove.getIfPreviewUsingPlayer()) {
            return;
        }
        interfaceC480510IsrRemove.LJJIJLIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Isr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Isr] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.1APH, java.lang.Object] */
    public final InterfaceC480510Isr LIZJ(String str, boolean z) {
        ?? r1;
        InterfaceC480510Isr interfaceC480510Isr;
        InterfaceC480510Isr interfaceC480510IsrPop;
        if (LIZLLL()) {
            Integer numValueOf = null;
            if (str == null) {
                return null;
            }
            ?? LIZ = LIZ(str);
            if (LIZ == 0) {
                synchronized (this) {
                    if (a0.LJJIIZI(str, "preview_", false)) {
                        Iterator it2 = Collections.synchronizedSet(this.LIZ.entrySet()).iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            String str2 = (String) entry.getKey();
                            InterfaceC480510Isr interfaceC480510Isr2 = (InterfaceC480510Isr) entry.getValue();
                            if (str2 != null && a0.LJJIIZI(str2, "preview", false) && !interfaceC480510Isr2.b0()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("popPreviewPlayerCache() tag=");
                                sbLIZ.append(str2);
                                sbLIZ.append(" ---> controller=");
                                sbLIZ.append(interfaceC480510Isr2.hashCode());
                                C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
                                it2.remove();
                                interfaceC480510Isr = interfaceC480510Isr2;
                                break;
                            }
                        }
                        interfaceC480510Isr = null;
                    } else {
                        interfaceC480510Isr = null;
                    }
                }
                if (interfaceC480510Isr != null) {
                    this.LIZ.put(str, interfaceC480510Isr);
                    r1 = interfaceC480510Isr;
                } else {
                    LinkedList<InterfaceC480510Isr> linkedList = ((C480740ItE) this.LIZLLL.getValue()).LIZ;
                    if (linkedList.size() > 0 && (interfaceC480510IsrPop = linkedList.pop()) != null) {
                        this.LIZ.put(str, interfaceC480510IsrPop);
                        r1 = interfaceC480510IsrPop;
                    } else {
                        if (z) {
                            LIZ = new C1APH(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), new C1491070ou9());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("create playController -> player: ");
                            sbLIZ2.append(LIZ.hashCode());
                            sbLIZ2.append(", cache size = ");
                            sbLIZ2.append(this.LIZ.size() + 1);
                            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ2));
                            LIZ.LLJZ = str;
                            this.LIZ.put(str, (InterfaceC480510Isr) LIZ);
                        }
                        r1 = LIZ;
                    }
                }
            } else {
                r1 = LIZ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(" matches ---> LivePlayController: ");
            if (r1 != 0) {
                numValueOf = Integer.valueOf(r1.hashCode());
            }
            sbLIZ3.append(numValueOf);
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ3));
            return r1;
        }
        C465160ILy.LIZ().getClass();
        return (InterfaceC480510Isr) C1APP.LIZIZ(InterfaceC480510Isr.class);
    }

    public final void LJI(String str, String str2) {
        if (LIZLLL()) {
            InterfaceC480510Isr interfaceC480510IsrLIZ = LIZ(str);
            if (interfaceC480510IsrLIZ != null) {
                this.LIZ.remove(str);
                this.LIZ.put(str2, interfaceC480510IsrLIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reuse playController -> replace reusePlayerTag: ");
            sbLIZ.append(str);
            sbLIZ.append("  into roomPlayerTag: ");
            sbLIZ.append(str2);
            C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIIZ(InterfaceC480510Isr interfaceC480510Isr, String str) {
        if (LIZLLL() && str != null) {
            InterfaceC480510Isr interfaceC480510IsrLIZ = LIZ(str);
            C480740ItE c480740ItE = (C480740ItE) this.LIZLLL.getValue();
            Iterator<InterfaceC480510Isr> it2 = c480740ItE.LIZ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int i2 = i + 1;
                if (Intrinsics.LJFF(it2.next(), interfaceC480510Isr)) {
                    if (i != -1) {
                        c480740ItE.LIZ.remove(interfaceC480510Isr);
                    }
                } else {
                    i = i2;
                }
            }
            if (interfaceC480510IsrLIZ == null) {
                this.LIZ.put(str, interfaceC480510Isr);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reuse player -> cache PlayerTag : ");
                sbLIZ.append(str);
                sbLIZ.append(" into newLivePlayController: ");
                sbLIZ.append(interfaceC480510Isr.hashCode());
                C827750WdZ.LIZ("LivePlayControllerManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
