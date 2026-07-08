package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0whI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790620whI implements InterfaceC390401fS {
    public static final C1790620whI LIZ = new C1790620whI();
    public static C1790630whJ LIZIZ;
    public static C1780220wQW LIZJ;
    public static C1ADU LIZLLL;

    public static Map LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C516900KOy.LIZ(linkedHashMap);
        C1ADU c1adu = LIZLLL;
        linkedHashMap.put("fps", c1adu != null ? Float.valueOf(c1adu.LIZJ(15)) : null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        return linkedHashMap3;
    }

    public static void LJII() {
        C1790630whJ c1790630whJ = LIZIZ;
        if (c1790630whJ == null || c1790630whJ.LJI != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1790630whJ c1790630whJ2 = LIZIZ;
            if (c1790630whJ2 != null) {
                c1790630whJ2.LJIIJ += jCurrentTimeMillis - c1790630whJ2.LJI;
                c1790630whJ2.LJII = jCurrentTimeMillis;
            }
        }
    }

    public static void LJIIIZ() {
        C1790630whJ c1790630whJ = LIZIZ;
        if (c1790630whJ == null || c1790630whJ.LJIIJJI == -1) {
            return;
        }
        c1790630whJ.LJIIL = System.currentTimeMillis();
    }

    public static final void LJIIJ() {
        C1ADU c1adu = LIZLLL;
        if (c1adu != null) {
            c1adu.stop();
        }
        LIZLLL = null;
        LIZIZ = null;
        LIZJ = null;
    }

    public static void LJIIJJI() {
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW != null) {
            if (c1780220wQW.LIZ != 0) {
                Long lLIZ = AbstractC1780830wRV.LIZ(c1780220wQW.LJ, c1780220wQW.LJFF);
                long j = c1780220wQW.LJIIIZ;
                Long lLIZ2 = AbstractC1780830wRV.LIZ(c1780220wQW.LIZLLL, c1780220wQW.LJ);
                Long lLIZ3 = AbstractC1780830wRV.LIZ(c1780220wQW.LJFF, c1780220wQW.LJI);
                Long lLIZ4 = AbstractC1780830wRV.LIZ(c1780220wQW.LIZLLL, c1780220wQW.LJI);
                long jLongValue = (lLIZ4 != null ? lLIZ4.longValue() : 0L) + c1780220wQW.LJIIIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_application_perf");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(Long.valueOf(c1780220wQW.LIZ), "board_id");
                c474500IjALIZ.LJJII(Integer.valueOf(c1780220wQW.LIZIZ), "board_version");
                c474500IjALIZ.LJJII(Integer.valueOf(c1780220wQW.LIZJ), "board_application_type");
                c474500IjALIZ.LJJII(lLIZ, "board_excl_duration");
                c474500IjALIZ.LJJII(Long.valueOf(j), "board_fetch_duration");
                c474500IjALIZ.LJJII(lLIZ2, "board_cancel_duration");
                c474500IjALIZ.LJJII(lLIZ3, "board_apply_duration");
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "board_complete_duration");
                c474500IjALIZ.LJJII(c1780220wQW.LJIIIIZZ, "board_error_code");
                c474500IjALIZ.LJJII(c1780220wQW.LJII, "board_apply_error_str");
                c474500IjALIZ.LJJIIZI(LJFF());
                c474500IjALIZ.LIZ();
            }
        }
        LIZJ = null;
    }

    public static void LJIIL() {
        C1790630whJ c1790630whJ = LIZIZ;
        if (c1790630whJ != null) {
            Long lLIZ = AbstractC1780830wRV.LIZ(c1790630whJ.LIZJ, c1790630whJ.LIZLLL);
            Long lLIZ2 = AbstractC1780830wRV.LIZ(c1790630whJ.LJ, c1790630whJ.LJFF);
            long j = c1790630whJ.LJIIJ;
            int i = c1790630whJ.LJIIIZ;
            Long lValueOf = (j <= 0 || i <= 0) ? null : Long.valueOf(j / ((long) i));
            Long lLIZ3 = AbstractC1780830wRV.LIZ(c1790630whJ.LJIIJJI, c1790630whJ.LJIIL);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_edit_process_perf");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(c1790630whJ.LIZ), "board_id");
            c474500IjALIZ.LJJII(Integer.valueOf(c1790630whJ.LIZIZ), "board_version");
            c474500IjALIZ.LJJII(lLIZ, "board_initial_preview_ready_duration");
            c474500IjALIZ.LJJII(lLIZ2, "board_edit_item_ready_duration");
            c474500IjALIZ.LJJII(lValueOf, "board_item_upsert_duration");
            c474500IjALIZ.LJJII(lLIZ3, "board_upsert_duration");
            c474500IjALIZ.LJJIIZI(LJFF());
            c474500IjALIZ.LIZ();
        }
        LIZIZ = null;
    }

    @Override // X.InterfaceC390401fS
    public final void LIZJ() {
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW != null) {
            c1780220wQW.LJ = System.currentTimeMillis();
        }
        C1780220wQW c1780220wQW2 = LIZJ;
        if (c1780220wQW2 == null || c1780220wQW2.LIZJ != EnumC1779720wPi.USER_CANCEL_BOARD.getValue()) {
            return;
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC390401fS
    public final void LJ() {
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW == null || c1780220wQW.LJFF != -1) {
            return;
        }
        c1780220wQW.LJFF = System.currentTimeMillis();
    }

    public static void LJIIIIZZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1790630whJ c1790630whJ = LIZIZ;
        if (c1790630whJ == null || c1790630whJ.LIZJ == -1) {
            return;
        }
        if (c1790630whJ.LIZLLL == -1) {
            c1790630whJ.LIZLLL = jCurrentTimeMillis;
        } else {
            if (c1790630whJ.LJI == -1) {
                return;
            }
            c1790630whJ.LJIIIIZZ = jCurrentTimeMillis;
            c1790630whJ.LJI = -1L;
        }
    }

    public static void LJI(String str) {
        if (LIZIZ == null) {
            LIZIZ = new C1790630whJ(0);
        }
        C1790630whJ c1790630whJ = LIZIZ;
        if (c1790630whJ != null) {
            c1790630whJ.LJIILIIL = str;
        }
        LJIIL();
    }

    @Override // X.InterfaceC390401fS
    public final void LIZ(long j) {
        int i = C1154400g98.LIZ[EnumC1154390g97.BOARD_APPLY.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ = new C1780220wQW(0);
            } else {
                throw new C1954807lC();
            }
        } else {
            LIZIZ = new C1790630whJ(0);
        }
        if (LIZLLL == null) {
            LIZLLL = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).wC();
        }
        C1ADU c1adu = LIZLLL;
        if (c1adu != null) {
            c1adu.start();
        }
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW != null) {
            c1780220wQW.LIZLLL = System.currentTimeMillis();
        }
        C1780220wQW c1780220wQW2 = LIZJ;
        if (c1780220wQW2 != null) {
            c1780220wQW2.LJIIIZ = j;
        }
    }

    @Override // X.InterfaceC390401fS
    public final void LIZLLL(EnumC1779720wPi enumC1779720wPi) {
        C1103280eog c1103280eogLJ;
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW != null) {
            c1780220wQW.LIZJ = enumC1779720wPi.getValue();
        }
        if (enumC1779720wPi == EnumC1779720wPi.USER_CANCEL_BOARD && (c1103280eogLJ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJ()) != null) {
            c1103280eogLJ.LJII("", false);
        }
    }

    public static final void LJIILIIL(EnumC1154390g97 enumC1154390g97, long j) {
        AbstractC1780830wRV abstractC1780830wRV;
        C1103280eog c1103280eogLJ;
        int i = C1154400g98.LIZ[enumC1154390g97.ordinal()];
        if (i != 1) {
            if (i == 2) {
                abstractC1780830wRV = LIZJ;
            } else {
                throw new C1954807lC();
            }
        } else {
            abstractC1780830wRV = LIZIZ;
        }
        if (abstractC1780830wRV != null) {
            abstractC1780830wRV.LIZ = j;
            abstractC1780830wRV.LIZIZ = 2;
        }
        if (enumC1154390g97 == EnumC1154390g97.BOARD_APPLY && (c1103280eogLJ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJ()) != null) {
            c1103280eogLJ.LJII(String.valueOf(j), true);
        }
    }

    @Override // X.InterfaceC390401fS
    public final void LIZIZ(int i, String str) {
        if (str == null) {
            return;
        }
        if (LIZJ == null) {
            LIZJ = new C1780220wQW(0);
        }
        C1780220wQW c1780220wQW = LIZJ;
        if (c1780220wQW != null) {
            c1780220wQW.LJIIIIZZ = Integer.valueOf(i);
        }
        C1780220wQW c1780220wQW2 = LIZJ;
        if (c1780220wQW2 != null) {
            c1780220wQW2.LJII = str;
        }
        LJIIJJI();
    }
}
