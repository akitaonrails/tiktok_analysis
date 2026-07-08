package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0enn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102730enn {
    public final DataChannel LIZ;
    public final ViewGroup LIZIZ;
    public final List<EnumC1102750enp> LIZJ;
    public final EnumC1088900eRU LIZLLL;
    public final ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> LJ;
    public final List<EnumC1102750enp> LJFF;
    public final Map<EnumC1102750enp, InterfaceC1103130eoR> LJI = new EnumMap(EnumC1102750enp.class);
    public final LinkedList<EnumC1102750enp> LJII = new LinkedList<>();
    public final Map<EnumC1102750enp, Boolean> LJIIIIZZ = new EnumMap(EnumC1102750enp.class);

    public final void LIZJ() {
        ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null) {
            for (Map.Entry<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> entry : concurrentHashMap.entrySet()) {
                LJ(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LJI() {
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        for (EnumC1102750enp enumC1102750enp : this.LJII) {
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) this.LJI).get(enumC1102750enp);
            if (interfaceC1103130eoR != null) {
                ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = this.LJ;
                if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                    interfaceViewOnClickListenerC1102800enu.Fe(interfaceC1103130eoR, this.LIZ);
                }
                C786410Ut5.LJJJLZIJ(interfaceC1103130eoR.LJ(), this.LIZIZ);
                ((EnumMap) this.LJI).remove(enumC1102750enp);
            }
        }
        this.LJII.clear();
    }

    public final void LIZIZ(EnumC1102750enp enumC1102750enp) {
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) entry.getValue();
            if (enumC1102750enp == key) {
                interfaceC1103130eoR.setVisibility(8);
                return;
            }
        }
    }

    public final boolean LIZLLL(EnumC1102750enp enumC1102750enp) {
        View viewFindViewById;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) this.LJI).get(enumC1102750enp);
        if (interfaceC1103130eoR == null || (viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7r)) == null || viewFindViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIZ(EnumC1102750enp enumC1102750enp) {
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) entry.getValue();
            if (enumC1102750enp == key) {
                if (interfaceC1103130eoR.LJFF()) {
                    interfaceC1103130eoR.setVisibility(0);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ(EnumC1102750enp enumC1102750enp) {
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) this.LJI).get(enumC1102750enp);
        if (interfaceC1103130eoR == null) {
            return;
        }
        ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = this.LJ;
        if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
            interfaceViewOnClickListenerC1102800enu.Fe(interfaceC1103130eoR, this.LIZ);
        }
        interfaceC1103130eoR.LIZLLL();
        C786410Ut5.LJJJLZIJ(interfaceC1103130eoR.LJ(), this.LIZIZ);
        this.LJII.remove(enumC1102750enp);
        ((EnumMap) this.LJI).remove(enumC1102750enp);
    }

    public final void LIZ(View view, Integer num) {
        Room roomLIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C0UFE.Companion.getClass();
            if (C0UFF.LIZ(iIntValue) == C0UFE.OFF && (roomLIZ = C162100jj.LIZ(this.LIZ)) != null && roomLIZ.cppVersion == 2) {
                C16FV c16fv = (C16FV) view.findViewById(R.id.y6y);
                C16FV c16fv2 = (C16FV) view.findViewById(R.id.y6z);
                C16FV c16fv3 = (C16FV) view.findViewById(R.id.y70);
                if (c16fv != null) {
                    C1143680frq.LJI(c16fv, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"), null, true);
                    C786410Ut5.LLJJJJJIL(c16fv, 0);
                }
                if (c16fv2 != null) {
                    C1143680frq.LJI(c16fv2, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v2.png"), null, true);
                    C786410Ut5.LLJJJJJIL(c16fv2, 0);
                }
                if (c16fv3 != null) {
                    C1143680frq.LJI(c16fv3, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v3.png"), null, true);
                    C786410Ut5.LLJJJJJIL(c16fv3, 0);
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x01b0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:210:0x045f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.EnumC1102750enp r16, final X.InterfaceViewOnClickListenerC1102800enu r17) {
        /*
            Method dump skipped, instruction units count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102730enn.LJ(X.0enp, X.0enu):void");
    }

    public final void LJFF(EnumC1102750enp enumC1102750enp, boolean z) {
        Object objLLFF;
        Object obj;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_click");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            objLLFF = C500260Jjc.LLFF(dataChannel);
        } else {
            objLLFF = null;
        }
        c474500IjALIZ.LJJII(objLLFF, "user_type");
        c474500IjALIZ.LJJII(enumC1102750enp.getIdentifier(), "button_name");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_false_trigger");
        if (C497740JfY.LJIL()) {
            obj = "portrait";
        } else {
            obj = "landscape";
        }
        c474500IjALIZ.LJJII(obj, "room_orientation");
        c474500IjALIZ.LIZ();
    }

    public final void LJII(EnumC1102750enp enumC1102750enp, boolean z) {
        for (Map.Entry entry : ((EnumMap) this.LJI).entrySet()) {
            Object key = entry.getKey();
            InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) entry.getValue();
            if (enumC1102750enp == key) {
                interfaceC1103130eoR.LIZ(z);
            }
        }
    }

    public final void LJIIIIZZ(EnumC1102750enp enumC1102750enp, boolean z) {
        View viewFindViewById;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) this.LJI).get(enumC1102750enp);
        if (interfaceC1103130eoR != null && (viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7r)) != null) {
            C500260Jjc.LJLJLJ(viewFindViewById, z);
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = this.LJ;
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                interfaceViewOnClickListenerC1102800enu.qG(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1102730enn(DataChannel dataChannel, ViewGroup viewGroup, List<? extends EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU, ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap) {
        this.LIZ = dataChannel;
        this.LIZIZ = viewGroup;
        this.LIZJ = list;
        this.LIZLLL = enumC1088900eRU;
        this.LJ = concurrentHashMap;
        this.LJFF = new ArrayList(list);
    }
}
