package X;

import com.bytedance.android.livesdk.chatroom.model.UpdateStatusReqMessage;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorWsSwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1DgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262001DgE implements C0UZK {
    public final Room LIZ;
    public InterfaceC2262041DgI LIZIZ;
    public InterfaceC774450UZn LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;
    public LiveMode LJI;
    public InterfaceC1274090jGB LJIIIIZZ;
    public final C2262011DgF LJIIJJI;
    public boolean LJII = true;
    public Long LJIIIZ = 0L;
    public final HashMap<String, UpdateStatusReqMessage> LJIIJ = new HashMap<>();

    public static String LJIIIZ(int i, int i2) {
        if (i2 == 2 && i == 2) {
            return "app_resume";
        }
        if (i2 == 3) {
            if (i == 2) {
                return "continue_resume";
            }
            return null;
        }
        if (i2 == 2) {
            if (i == 3) {
                return "app_pause";
            }
            return null;
        }
        if (i2 == 1) {
            if (i == 2) {
                return "anchor_resume";
            }
        } else if (i2 != 1) {
            return null;
        }
        if (i == 3) {
            return "anchor_pause";
        }
        return null;
    }

    @Override // X.C0UZK
    public final void LIZIZ() {
        if (!LiveAnchorPingAnchorWsSwitch.INSTANCE.isEnable() || this.LJIIJJI == null) {
            return;
        }
        C0UC2 liveHostWsManager = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager();
        C2262011DgF c2262011DgF = this.LJIIJJI;
        liveHostWsManager.getClass();
        CopyOnWriteArrayList<InterfaceC1528310psD<? extends Object>> copyOnWriteArrayList = C1528270ps9.LLILLL;
        if (copyOnWriteArrayList.contains(c2262011DgF)) {
            copyOnWriteArrayList.remove(c2262011DgF);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1DgF, java.lang.Object] */
    public C2262001DgE(Room room) {
        this.LJIIJJI = null;
        this.LIZ = room;
        if (LiveAnchorPingAnchorWsSwitch.INSTANCE.isEnable()) {
            ?? r4 = new InterfaceC1528310psD<UpdateStatusResponse>() { // from class: X.1DgF
                @Override // X.InterfaceC1528310psD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1528310psD
                public final boolean LIZLLL(int i, int i2) {
                    if (i == 134217839) {
                        return i2 == 1 || i2 == 2;
                    }
                    return false;
                }

                @Override // X.InterfaceC1528310psD
                public final Class<UpdateStatusResponse> LIZIZ() {
                    return UpdateStatusResponse.class;
                }

                @Override // X.InterfaceC1528310psD
                public final void LIZJ(int i, Object obj, Map map) {
                    UpdateStatusResponse updateStatusResponse = (UpdateStatusResponse) obj;
                    if (LiveAnchorPingAnchorWsSwitch.INSTANCE.isEnable()) {
                        UpdateStatusReqMessage updateStatusReqMessage = this.LIZ.LJIIJ.get(((HashMap) map).get("livesdk_ws_up_msg_id"));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("status: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", extra: ");
                        sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), map));
                        sbLIZ.append(", resp: ");
                        sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), updateStatusResponse));
                        sbLIZ.append(", req: ");
                        sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), updateStatusReqMessage));
                        C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ));
                        if (updateStatusReqMessage == null) {
                            updateStatusReqMessage = new UpdateStatusReqMessage();
                        }
                        boolean z = true;
                        if (i == 0) {
                            InterfaceC2262041DgI interfaceC2262041DgI = this.LIZ.LIZIZ;
                            if (interfaceC2262041DgI != null) {
                                if ((r8 = (int) updateStatusReqMessage.status) == 1) {
                                    z = false;
                                    interfaceC2262041DgI.Ze(0, "ping_anchor", z);
                                } else {
                                    z = false;
                                    interfaceC2262041DgI.Ze(0, "ping_anchor", z);
                                }
                            }
                            if (updateStatusReqMessage.status == 2) {
                                this.LIZ.LJII = false;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("status: ");
                            sbLIZ2.append(i);
                            C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ2));
                            ((C0UZ9) this.LIZ.LIZJ).LJFF((int) updateStatusReqMessage.status);
                            this.LIZ.LJFF = System.currentTimeMillis() - this.LIZ.LJ;
                            return;
                        }
                        C2262001DgE c2262001DgE = this.LIZ;
                        InterfaceC2262041DgI interfaceC2262041DgI2 = c2262001DgE.LIZIZ;
                        if (interfaceC2262041DgI2 != null && !c2262001DgE.LIZLLL) {
                            interfaceC2262041DgI2.Ze(i, "ping_anchor", false);
                            if (i == 30001 || i == 50002 || i == 30003 || i == 30003001) {
                                this.LIZ.LIZLLL = true;
                            }
                        }
                        C2262001DgE.LJIIJ(this.LIZ.LJFF, updateStatusReqMessage.source, i, (int) updateStatusReqMessage.reasonNo, 0, false);
                    }
                }
            };
            this.LJIIJJI = r4;
            ((C1528270ps9) ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager()).LIZJ();
            HashMap map = new HashMap();
            map.put("room_id", String.valueOf(room.getId()));
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager().getClass();
            C1528270ps9.LLILZLL = map;
            ArrayList<C773510UVx> arrayList = new ArrayList();
            arrayList.add(new C773510UVx(134217839, 1));
            arrayList.add(new C773510UVx(134217839, 2));
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager().getClass();
            CopyOnWriteArrayList<InterfaceC1528310psD<? extends Object>> copyOnWriteArrayList = C1528270ps9.LLILLL;
            if (!copyOnWriteArrayList.contains(r4)) {
                copyOnWriteArrayList.add((InterfaceC1528310psD<? extends Object>) r4);
                for (C773510UVx c773510UVx : arrayList) {
                    Set<C773510UVx> set = C1528270ps9.LLILZIL;
                    if (!set.contains(c773510UVx)) {
                        set.add(c773510UVx);
                        C2203431BLp.LIZIZ.LJI(c773510UVx.LIZ, c773510UVx.LIZIZ, C1528270ps9.LLJIJIL);
                    }
                }
            }
        }
    }

    public static float LJI(String str) {
        try {
            return CastFloatProtector.parseFloat(LJIIIIZZ(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    public static long LJII(String str) {
        try {
            return CastLongProtector.parseLong(LJIIIIZZ(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static String LJIIIIZZ(String str) {
        InterfaceC474510IjB interfaceC474510IjB;
        String strLJIIZILJ;
        C1276840jKc.LIZ.getClass();
        C474500IjA c474500IjA = C1276840jKc.LJIJI;
        if (c474500IjA == null || (interfaceC474510IjB = c474500IjA.LIZ) == null || (strLJIIZILJ = interfaceC474510IjB.LJIIZILJ(str)) == null) {
            return "";
        }
        return strLJIIZILJ;
    }

    @Override // X.C0UZK
    public final void LIZ(C775220Ub2 c775220Ub2) {
        this.LIZIZ = c775220Ub2;
    }

    @Override // X.C0UZK
    public final void LIZJ(InterfaceC774450UZn interfaceC774450UZn) {
        this.LIZJ = interfaceC774450UZn;
    }

    @Override // X.C0UZK
    public final void LIZLLL(LiveMode liveMode) {
        this.LJI = liveMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJFF(int i, C470590Icr c470590Icr) {
        T t;
        UpdateStatusResponse.Data data;
        if (i == 1) {
            if (c470590Icr != null && (t = c470590Icr.data) != 0 && (data = ((UpdateStatusResponse) t).data) != null && data.statusNotMatch == 1) {
                return true;
            }
            return false;
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static void LJIIJ(long j, String str, int i, int i2, int i3, boolean z) {
        int i4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_ping_anchor_result");
        c474500IjALIZ.LJIL();
        if (z) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_first_ping_start");
        c474500IjALIZ.LJJII(Long.valueOf(j), "ping_time");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "retry_count");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "state");
        c474500IjALIZ.LJJII(str, "source");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "reason");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x044f  */
    @Override // X.C0UZK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final boolean r45, boolean r46, boolean r47, final int r48, final int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2262001DgE.LJ(boolean, boolean, boolean, int, int, int):void");
    }
}
