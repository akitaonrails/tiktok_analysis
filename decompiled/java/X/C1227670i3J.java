package X;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227670i3J extends C1227690i3L implements InterfaceC1224480hyA {
    public static final C1227670i3J LIZIZ = new C1227670i3J();
    public static final Map<EnumC1227660i3I, Long> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC1224480hyA
    public final void LIZ() {
        if (C1227690i3L.LIZ.LIZ.length() == 0 || C1227690i3L.LIZ.LIZIZ.length() == 0) {
            return;
        }
        C1227700i3M c1227700i3M = C1227690i3L.LIZ;
        EnumC1227710i3N enumC1227710i3N = EnumC1227710i3N.CREATE_PANEL_OPENED;
        C1227700i3M c1227700i3M2 = C1227690i3L.LIZ;
        c1227700i3M2.LIZJ = enumC1227710i3N;
        Map<String, String> mapLIZ = C1227640i3G.LIZ(LIZIZ);
        Map<String, String> map = c1227700i3M.LJIIIIZZ.get("group_chat_create_panel_show");
        if (map != null) {
            mapLIZ.putAll(map);
        }
        C1227690i3L.LJIIIZ("group_chat_create_panel_show", c1227700i3M2, mapLIZ);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LIZJ() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_LOAD_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJ() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_RENDER_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJFF() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_RENDER_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJI() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_CREATE_PANEL);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJII() {
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.FINISH_LOAD_DATA);
    }

    @Override // X.InterfaceC1224480hyA
    public final void LJIIIIZZ() {
        C1227690i3L.LIZ.LIZLLL = true;
    }

    @Override // X.InterfaceC1224480hyA
    public final Map<EnumC1227660i3I, Long> LIZIZ() {
        return LIZJ;
    }

    @Override // X.InterfaceC1224480hyA
    public final void LIZLLL(InterfaceC1224270hxp interfaceC1224270hxp) {
        ((LinkedHashMap) LIZIZ()).clear();
        C1227640i3G.LIZIZ(this, EnumC1227660i3I.READY_TO_CREATE_PANEL);
    }

    public static void LJIIL(C1227680i3K c1227680i3K, C1227700i3M c1227700i3M, boolean z) {
        EnumC1227710i3N enumC1227710i3N;
        int i;
        if (c1227700i3M == null) {
            c1227700i3M = C1227690i3L.LIZ;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("from_contact_panel", C1529305yl.LIZ(Boolean.valueOf(c1227700i3M.LJ))), new Pair("chat_type", c1227680i3K.LIZIZ), new Pair("group_type", c1227680i3K.LIZJ), new Pair("member_num", String.valueOf(c1227680i3K.LIZLLL)), new Pair("network_duration", String.valueOf(c1227680i3K.LJ)), new Pair("process_duration", String.valueOf(c1227680i3K.LJFF)), new Pair("result_status", String.valueOf(c1227680i3K.LJII.getValue())), new Pair("is_first", C1529305yl.LIZ(Boolean.valueOf(c1227700i3M.LJFF))), new Pair("is_auto_retry", C1529305yl.LIZ(Boolean.valueOf(z))), new Pair("conversation_id", String.valueOf(c1227680i3K.LIZ)));
        if (c1227680i3K.LJII == C0ZBV.SUCCESS) {
            enumC1227710i3N = EnumC1227710i3N.SUCCESS;
        } else {
            enumC1227710i3N = EnumC1227710i3N.FAIL;
        }
        int i2 = c1227680i3K.LJI;
        if (i2 > 0) {
            mapLJIIJ.put("success_member_num", String.valueOf(i2));
        }
        if (c1227700i3M.LJI > 0) {
            mapLJIIJ.put("total_duration", String.valueOf(System.currentTimeMillis() - c1227700i3M.LJI));
        }
        Integer num = c1227680i3K.LJIIIIZZ;
        if (num != null && num.intValue() != 0) {
            mapLJIIJ.put("error_code", String.valueOf(c1227680i3K.LJIIIIZZ));
        }
        if (c1227680i3K.LJIIIZ.length() > 0) {
            mapLJIIJ.put("error_msg", c1227680i3K.LJIIIZ);
        }
        long j = c1227700i3M.LJII;
        if (j != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j));
            calendar.set(11, 23);
            calendar.set(13, 59);
            calendar.set(12, 59);
            calendar.set(14, 999);
            long timeInMillis = calendar.getTimeInMillis();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - c1227700i3M.LJII;
            long j3 = jCurrentTimeMillis - timeInMillis;
            long millis = TimeUnit.DAYS.toMillis(1L);
            if (j3 <= 0) {
                i = 0;
            } else {
                i = ((int) (j3 / millis)) + 1;
            }
            mapLJIIJ.put("days_from_group_fake_write", String.valueOf(i));
            mapLJIIJ.put("duration_from_group_fake_write", String.valueOf(j2));
        }
        c1227700i3M.LJFF = false;
        C1227690i3L.LJIIIZ("group_chat_create_result", c1227700i3M, mapLJIIJ);
        if (!z) {
            C1227690i3L.LIZ.LIZJ = enumC1227710i3N;
            if (!c1227700i3M.LJ || enumC1227710i3N == EnumC1227710i3N.SUCCESS) {
                C1227690i3L.LIZ = new C1227700i3M(null);
                ((LinkedHashMap) LIZJ).clear();
            }
        }
    }

    public static void LJIIJJI(C742250T9r c742250T9r, Integer num, String str, String str2) {
        if (c742250T9r == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c742250T9r.LIZ());
        linkedHashMap.put("error_code", String.valueOf(num));
        linkedHashMap.put("chat_type", str);
        linkedHashMap.put("group_type", str2);
        C0Z6P.LIZIZ.LIZ.getClass();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("imsdk_group_chat_create", linkedHashMap);
    }
}
