package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0awc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954440awc implements InterfaceC965500bES {
    public static final C954440awc LIZ = new C954440awc();
    public static Map<String, ? extends Object> LIZIZ;
    public static Map<String, ? extends Object> LIZJ;

    public static C955540ayO LJJIII(int i) {
        return C915200ZvK.LIZ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC965500bES
    public final void LJFF(C954610awt c954610awt) {
        Object obj;
        long jLongValue;
        Object obj2;
        boolean zBooleanValue;
        Boolean bool;
        Long l;
        Map<String, ? extends Object> map = LIZJ;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, ? extends Object> map2 = LIZJ;
        if (map2 != null) {
            obj2 = map2.get("is_turn_off");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        int i = c954610awt.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - jLongValue), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "turn_off_this_live", Boolean.valueOf(zBooleanValue), true);
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_apply_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJI(C954730ax5 c954730ax5) {
        C955440ayE c955440ayE = new C955440ayE();
        String str = c954730ax5.LJFF;
        if (str == null) {
            str = "";
        }
        String str2 = c954730ax5.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZJ, "duration", Long.valueOf(SystemClock.uptimeMillis() - C954660awy.LIZLLL), true);
        c955440ayE.LJIIL(Integer.valueOf(C955440ayE.LJJIJIIJI(str)), "reason", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "not_suggest_uid", "", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "source", str2, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "leave_source", str, true);
        c955440ayE.LJIJJLI("leave_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIJ(C954590awr c954590awr) {
        boolean z;
        Object obj;
        int iIntValue;
        Object obj2;
        Integer num;
        HashMap map;
        long j = c954590awr.LIZIZ;
        String strLIZJ = C955410ayB.LIZJ(LJJIII(c954590awr.LJFF.sourceType));
        Map<String, Object> map2 = c954590awr.LJIIIIZZ;
        if (map2 == null) {
            z = true;
        } else {
            z = map2 instanceof HashMap;
        }
        Object obj3 = null;
        if (z && (map2 instanceof HashMap) && (map = (HashMap) map2) != null) {
            map.put("request_timestamp", Long.valueOf(C158B.LIZ()));
        }
        Map<String, Object> map3 = c954590awr.LJIIIIZZ;
        if (map3 != null) {
            obj = map3.get("cohost_layout_mode");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, Object> map4 = c954590awr.LJIIIIZZ;
        if (map4 != null) {
            obj2 = map4.get("source_type");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Integer) {
            obj3 = obj2;
        }
        C955440ayE c955440ayE = new C955440ayE();
        Integer numValueOf = Integer.valueOf(iIntValue);
        long j2 = c954590awr.LIZ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        String strLJI = C915980Zwa.LJI().LIZ().LJI(j2);
        if (strLJI == null) {
            strLJI = C954660awy.LJFF;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "client_log_id", strLJI, true);
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        if (obj3 != null) {
            c955440ayE.LJIIL(obj3, "invite_type", true);
        }
        c955440ayE.LJIL();
        c955440ayE.LJIJJLI("apply_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIILIIL(C954620awu c954620awu) {
        Object obj;
        long jLongValue;
        Object obj2;
        boolean zBooleanValue;
        Boolean bool;
        Long l;
        Map<String, ? extends Object> map = LIZIZ;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, ? extends Object> map2 = LIZIZ;
        if (map2 != null) {
            obj2 = map2.get("is_turn_off");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954620awu.LIZIZ;
        int i = c954620awu.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - jLongValue), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "turn_off_this_live", Boolean.valueOf(zBooleanValue), true);
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_invite_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIILL(C501470JlZ c501470JlZ) {
        C955440ayE c955440ayE = new C955440ayE();
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIJJLI("leave_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIJ(C954600aws c954600aws) {
        Object obj;
        Object obj2;
        Object obj3;
        int iIntValue;
        Object obj4;
        HashMap map;
        Integer num;
        long j = c954600aws.LIZIZ;
        C955540ayO c955540ayOLJJIII = LJJIII(c954600aws.LJFF.sourceType);
        String strLIZJ = C955410ayB.LIZJ(c955540ayOLJJIII);
        Map<String, Object> map2 = c954600aws.LJIIIIZZ;
        if (map2 != null) {
            obj = map2.get("session_id");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj5 = "";
        if (obj == null) {
            obj = "";
        }
        Map<String, Object> map3 = c954600aws.LJIIIIZZ;
        if (map3 != null) {
            obj2 = map3.get("match_id");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && obj2 != null) {
            obj5 = obj2;
        }
        Map<String, Object> map4 = c954600aws.LJIIIIZZ;
        if (map4 != null) {
            obj3 = map4.get("cohost_layout_mode");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, Object> map5 = c954600aws.LJIIIIZZ;
        if (map5 != null) {
            obj4 = map5.get("is_appended_item");
        } else {
            obj4 = null;
        }
        if (!(obj4 instanceof String) || obj4 == null) {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, Object> map6 = c954600aws.LJIIIIZZ;
        if ((map6 == null || (map6 instanceof HashMap)) && (map6 instanceof HashMap) && (map = (HashMap) map6) != null) {
            map.put("request_timestamp", Long.valueOf(C158B.LIZ()));
        }
        C955440ayE c955440ayE = new C955440ayE();
        int i = c955540ayOLJJIII.LIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        long j2 = c954600aws.LIZ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "is_new_arch", 1, true);
        String strLJI = C915980Zwa.LJI().LIZ().LJI(j2);
        if (strLJI == null) {
            strLJI = C954660awy.LJFF;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "client_log_id", strLJI, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "session_id", obj, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "match_id", obj5, true);
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIIL(Integer.valueOf(i), "invite_type", true);
        c955440ayE.LJIIL(obj4, "is_appended_item", true);
        c955440ayE.LJJJJJ(i);
        c955440ayE.LJJI();
        c955440ayE.LJIJJLI("invite_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIJJ(C954610awt c954610awt) {
        Object obj;
        long jLongValue;
        Object obj2;
        int iIntValue;
        String str;
        Integer num;
        Long l;
        Map<String, ? extends Object> map = LIZJ;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, ? extends Object> map2 = LIZJ;
        if (map2 != null) {
            obj2 = map2.get("cohost_layout_mode");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - jLongValue), true);
        if (C915980Zwa.LJI().LIZ().LLIZLLLIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "is_quick_pairing_waiting", str, true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_apply_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIL(C954620awu c954620awu) {
        Object obj;
        long jLongValue;
        Object obj2;
        String str;
        Integer num;
        Long l;
        Map<String, ? extends Object> map = LIZIZ;
        if (map != null) {
            obj = map.get("show_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, ? extends Object> map2 = LIZIZ;
        if (map2 != null) {
            obj2 = map2.get("cohost_layout_mode");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
            num.intValue();
        }
        C955440ayE c955440ayE = new C955440ayE();
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(c954620awu.LIZIZ), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - jLongValue), true);
        if (C915980Zwa.LJI().LIZ().LLIZLLLIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "is_quick_pairing_waiting", str, true);
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_invite_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJJI(C954670awz c954670awz) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954670awz.LIZIZ;
        String str = c954670awz.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(str, "request_source", true);
        c955440ayE.LJJIFFI(str);
        c955440ayE.LJIJJLI("cancel_invite_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LJJIFFI(C954800axC c954800axC) {
        long j = c954800axC.LIZIZ;
        C955440ayE c955440ayE = new C955440ayE();
        String str = c954800axC.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(str, "request_source", true);
        c955440ayE.LJJIFFI(str);
        c955440ayE.LJIJJLI("cancel_apply_request");
    }

    @Override // X.InterfaceC965500bES
    public final void LIZIZ(C954610awt c954610awt, String str) {
        Object obj;
        int iIntValue;
        Integer num;
        Map<String, ? extends Object> map = LIZJ;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_apply_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LIZJ(C954730ax5 c954730ax5, String str) {
        C955440ayE c955440ayE = new C955440ayE();
        String str2 = c954730ax5.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = c954730ax5.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZJ, "duration", Long.valueOf(SystemClock.uptimeMillis() - C954660awy.LIZLLL), true);
        c955440ayE.LJIIL(Integer.valueOf(C955440ayE.LJJIJIIJI(str2)), "reason", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "source", str3, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "leave_source", str2, true);
        c955440ayE.LJIJJLI("leave_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LIZLLL(C954610awt c954610awt, C501470JlZ c501470JlZ) {
        Object obj;
        int iIntValue;
        Integer num;
        Map<String, ? extends Object> map = LIZJ;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_apply_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJ(C954800axC c954800axC, C501470JlZ c501470JlZ) {
        long j = c954800axC.LIZIZ;
        C955440ayE c955440ayE = new C955440ayE();
        String str = c954800axC.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIIL(str, "request_source", true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIJJLI("cancel_apply_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJII(C954600aws c954600aws, C501470JlZ c501470JlZ) {
        int iIntValue;
        Integer num;
        long j = c954600aws.LIZIZ;
        C955540ayO c955540ayOLJJIII = LJJIII(c954600aws.LJFF.sourceType);
        String strLIZJ = C955410ayB.LIZJ(c955540ayOLJJIII);
        Map<String, Object> map = c954600aws.LJIIIIZZ;
        Object obj = null;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C955440ayE c955440ayE = new C955440ayE();
        int i = c955540ayOLJJIII.LIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJJJJJ(i);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "invite_message_failed_cost", 0L, true);
        c955440ayE.LJIJJLI("invite_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIIIZZ(C954670awz c954670awz, String str) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954670awz.LIZIZ;
        String str2 = c954670awz.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIIL(str2, "request_source", true);
        c955440ayE.LJJIFFI(str2);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIJJLI("cancel_invite_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIIZ(C954620awu c954620awu, C501470JlZ c501470JlZ) {
        Object obj;
        Integer num;
        Map<String, ? extends Object> map = LIZIZ;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            num.intValue();
        }
        C955440ayE c955440ayE = new C955440ayE();
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(c954620awu.LIZIZ), true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_invite_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIJJI(C954610awt c954610awt, C501470JlZ c501470JlZ) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        int i = c954610awt.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_apply_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIL(C954800axC c954800axC, String str) {
        long j = c954800axC.LIZIZ;
        C955440ayE c955440ayE = new C955440ayE();
        String str2 = c954800axC.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIIL(str2, "request_source", true);
        c955440ayE.LJJIFFI(str2);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIJJLI("cancel_apply_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIILLIIL(C954610awt c954610awt, String str) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954610awt.LIZIZ;
        int i = c954610awt.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_apply_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIIZILJ(C954620awu c954620awu, String str) {
        Object obj;
        int i;
        Integer num;
        Map<String, ? extends Object> map = LIZIZ;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            num.intValue();
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954620awu.LIZIZ;
        if (C954660awy.LJIILL == EnumC950120ape.Received) {
            i = 1;
        } else {
            i = 0;
        }
        c955440ayE.LJIIL(Integer.valueOf(i), "is_single_accept", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("accept_invite_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIJI(C954620awu c954620awu, String str) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954620awu.LIZIZ;
        int i = c954620awu.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_invite_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIJJLI(C954590awr c954590awr, C501470JlZ c501470JlZ) {
        int iIntValue;
        Integer num;
        String strLIZJ = C955410ayB.LIZJ(LJJIII(c954590awr.LJFF.sourceType));
        Map<String, Object> map = c954590awr.LJIIIIZZ;
        Object obj = null;
        if (map != null) {
            obj = map.get("cohost_layout_mode");
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954590awr.LIZIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIJJLI("apply_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJJ(C954670awz c954670awz, C501470JlZ c501470JlZ) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954670awz.LIZIZ;
        String str = c954670awz.LJ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIIL(str, "request_source", true);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIJJLI("cancel_invite_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJJII(C954620awu c954620awu, C501470JlZ c501470JlZ) {
        C955440ayE c955440ayE = new C955440ayE();
        long j = c954620awu.LIZIZ;
        int i = c954620awu.LJFF.replyStatus;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        c955440ayE.LJIIL(Integer.valueOf(i), "reply_status", true);
        c955440ayE.LJIIJJI(c501470JlZ);
        c955440ayE.LJIILIIL();
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("decline_invite_failed");
    }

    @Override // X.InterfaceC965500bES
    public final void LIZ(C954590awr c954590awr, String str, long j) {
        Object obj;
        long jLongValue;
        Object obj2;
        long jLongValue2;
        Object obj3;
        int iIntValue;
        Object obj4;
        Integer num;
        Long l;
        Long l2;
        long j2 = c954590awr.LIZIZ;
        String strLIZJ = C955410ayB.LIZJ(LJJIII(c954590awr.LJFF.sourceType));
        Map<String, Object> map = c954590awr.LJIIIIZZ;
        Object obj5 = null;
        if (map != null) {
            obj = map.get("click_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l2 = (Long) obj) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, Object> map2 = c954590awr.LJIIIIZZ;
        if (map2 != null) {
            obj2 = map2.get("request_timestamp");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            jLongValue2 = l.longValue();
        } else {
            jLongValue2 = 0;
        }
        Map<String, Object> map3 = c954590awr.LJIIIIZZ;
        if (map3 != null) {
            obj3 = map3.get("cohost_layout_mode");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, Object> map4 = c954590awr.LJIIIIZZ;
        if (map4 != null) {
            obj4 = map4.get("source_type");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof Integer) {
            obj5 = obj4;
        }
        C955440ayE c955440ayE = new C955440ayE();
        Integer numValueOf = Integer.valueOf(iIntValue);
        long j3 = c954590awr.LIZ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j2), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        String strLJI = C915980Zwa.LJI().LIZ().LJI(j3);
        if (strLJI == null) {
            strLJI = C954660awy.LJFF;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "client_log_id", strLJI, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "apply_click_start_time", Long.valueOf(jLongValue), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "apply_request_time", Long.valueOf(jLongValue2), true);
        if (C915980Zwa.LJII().LLILZLL(true).size() == 2) {
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_group_channel_id", Long.valueOf(j), true);
        } else if (j != 0) {
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "channel_id", Long.valueOf(j), true);
            c955440ayE.LJIIL(Long.valueOf(j), "group_channel_id", true);
        }
        c955440ayE.LJIILIIL();
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        if (obj5 != null) {
            c955440ayE.LJIIL(obj5, "invite_type", true);
        }
        c955440ayE.LJIL();
        c955440ayE.LJIJJLI("apply_succeed");
    }

    @Override // X.InterfaceC965500bES
    public final void LJIILJJIL(C954600aws c954600aws, String str, long j) {
        Object obj;
        long jLongValue;
        Object obj2;
        long jLongValue2;
        Object obj3;
        Object obj4;
        Object obj5;
        int iIntValue;
        Object obj6;
        Integer num;
        Long l;
        Long l2;
        long j2 = c954600aws.LIZIZ;
        C955540ayO c955540ayOLJJIII = LJJIII(c954600aws.LJFF.sourceType);
        String strLIZJ = C955410ayB.LIZJ(c955540ayOLJJIII);
        Map<String, Object> map = c954600aws.LJIIIIZZ;
        if (map != null) {
            obj = map.get("click_timestamp");
        } else {
            obj = null;
        }
        if ((obj instanceof Long) && (l2 = (Long) obj) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        Map<String, Object> map2 = c954600aws.LJIIIIZZ;
        if (map2 != null) {
            obj2 = map2.get("request_timestamp");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            jLongValue2 = l.longValue();
        } else {
            jLongValue2 = 0;
        }
        Map<String, Object> map3 = c954600aws.LJIIIIZZ;
        if (map3 != null) {
            obj3 = map3.get("session_id");
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        Object obj7 = "";
        if (obj3 == null) {
            obj3 = "";
        }
        Map<String, Object> map4 = c954600aws.LJIIIIZZ;
        if (map4 != null) {
            obj4 = map4.get("match_id");
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof String) && obj4 != null) {
            obj7 = obj4;
        }
        Map<String, Object> map5 = c954600aws.LJIIIIZZ;
        if (map5 != null) {
            obj5 = map5.get("cohost_layout_mode");
        } else {
            obj5 = null;
        }
        if ((obj5 instanceof Integer) && (num = (Integer) obj5) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, Object> map6 = c954600aws.LJIIIIZZ;
        if (map6 != null) {
            obj6 = map6.get("is_appended_item");
        } else {
            obj6 = null;
        }
        if (!(obj6 instanceof String) || obj6 == null) {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        C955440ayE c955440ayE = new C955440ayE();
        int i = c955540ayOLJJIII.LIZ;
        Integer numValueOf = Integer.valueOf(iIntValue);
        long j3 = c954600aws.LIZ;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j2), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "log_id", str, true);
        String strLJI = C915980Zwa.LJI().LIZ().LJI(j3);
        if (strLJI == null) {
            strLJI = C954660awy.LJFF;
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "client_log_id", strLJI, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "invite_click_start_time", Long.valueOf(jLongValue), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "invite_request_time", Long.valueOf(jLongValue2), true);
        if (j != 0) {
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "channel_id", Long.valueOf(j), true);
            c955440ayE.LJIIL(Long.valueOf(j), "group_channel_id", true);
        }
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "session_id", obj3, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "match_id", obj7, true);
        c955440ayE.LJJJJJ(i);
        c955440ayE.LJIILIIL();
        c955440ayE.LJIIL(strLIZJ, "source", true);
        c955440ayE.LJIIL(numValueOf, "cohost_layout_mode", true);
        c955440ayE.LJIIL(Integer.valueOf(i), "invite_type", true);
        c955440ayE.LJIIL(obj6, "is_appended_item", true);
        C955440ayE.LJII.put(Long.valueOf(j2), (String) obj6);
        c955440ayE.LJJI();
        c955440ayE.LJIJJLI("invite_succeed");
    }
}
