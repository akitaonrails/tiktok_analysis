package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;

/* JADX INFO: renamed from: X.0Zri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912960Zri {
    public static DMNavArg LIZIZ(Intent intent) {
        int iIntValue;
        long jLongValue;
        String strLIZ;
        int iIntValue2;
        Integer numLJIIJJI;
        int iIntValue3;
        String strLIZ2;
        int iIntValue4;
        Integer numLJIIJJI2;
        String strDecode;
        Long lLJIILIIL;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        Long lLJIILIIL2;
        Integer numLJIIJJI5;
        Long lLJIILIIL3;
        Integer numLJIIJJI6;
        String strLIZ3 = LIZ(intent, "enter_from");
        String strLIZ4 = LIZ(intent, "enter_method");
        String strLIZ5 = LIZ(intent, "message_cnt");
        int iIntValue5 = 0;
        if (strLIZ5 != null && (numLJIIJJI6 = C2095008Iq.LJIIJJI(strLIZ5)) != null) {
            iIntValue = numLJIIJJI6.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        String strLIZ6 = LIZ(intent, "notice_type");
        String strLIZ7 = LIZ(intent, "im_group_invite_id");
        String strLIZ8 = LIZ(intent, "conv_id");
        Long lLJIILIIL4 = null;
        if (strLIZ8 == null || strLIZ8.length() <= 0) {
            strLIZ8 = LIZ(intent, "conversation_id");
        }
        String strLIZ9 = LIZ(intent, "msg_id");
        if (strLIZ9 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(strLIZ9)) != null) {
            jLongValue = lLJIILIIL3.longValue();
        } else {
            jLongValue = 0;
        }
        String strLIZ10 = LIZ(intent, "is_mem");
        if ((strLIZ10 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ10)) != null) || ((strLIZ = LIZ(intent, "is_member_request")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ)) != null)) {
            iIntValue2 = numLJIIJJI.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        String strLIZ11 = LIZ(intent, "chat_type");
        if (strLIZ11 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(strLIZ11)) != null) {
            iIntValue3 = numLJIIJJI5.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer numValueOf3 = Integer.valueOf(iIntValue3);
        String strLIZ12 = LIZ(intent, "preview");
        if ((strLIZ12 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZ12)) != null) || ((strLIZ2 = LIZ(intent, "message_preview_enabled")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZ2)) != null)) {
            iIntValue4 = numLJIIJJI2.intValue();
        } else {
            iIntValue4 = 0;
        }
        Integer numValueOf4 = Integer.valueOf(iIntValue4);
        String strLIZ13 = LIZ(intent, "content");
        if (strLIZ13 == null || (strDecode = Uri.decode(strLIZ13)) == null) {
            String strLIZ14 = LIZ(intent, "reply_to_message_content");
            if (strLIZ14 != null) {
                strDecode = Uri.decode(strLIZ14);
            } else {
                strDecode = null;
            }
        }
        String strLIZ15 = LIZ(intent, "msg_id");
        if (strLIZ15 == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ15)) == null) {
            String strLIZ16 = LIZ(intent, "reply_to_message_server_id");
            if (strLIZ16 != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ16);
            } else {
                lLJIILIIL = null;
            }
        }
        String strLIZ17 = LIZ(intent, "msg_type");
        if (strLIZ17 == null || (numLJIIJJI3 = C2095008Iq.LJIIJJI(strLIZ17)) == null) {
            String strLIZ18 = LIZ(intent, "reply_to_message_type");
            if (strLIZ18 != null) {
                numLJIIJJI3 = C2095008Iq.LJIIJJI(strLIZ18);
            } else {
                numLJIIJJI3 = null;
            }
        }
        String strLIZ19 = LIZ(intent, "from");
        if (strLIZ19 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strLIZ19)) != null) {
            lLJIILIIL4 = lLJIILIIL2;
        } else {
            String strLIZ20 = LIZ(intent, "reply_to_message_from_uid");
            if (strLIZ20 != null) {
                lLJIILIIL4 = C2095008Iq.LJIILIIL(strLIZ20);
            }
        }
        String strLIZ21 = LIZ(intent, "route_from");
        String strLIZ22 = LIZ(intent, "route_to");
        String strLIZ23 = LIZ(intent, "gd_label");
        String strLIZ24 = LIZ(intent, "open_panel_type");
        String strLIZ25 = LIZ(intent, "showKeyboardByDefault");
        if (strLIZ25 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(strLIZ25)) != null) {
            iIntValue5 = numLJIIJJI4.intValue();
        }
        return new DMNavArg(strLIZ3, strLIZ4, numValueOf, strLIZ6, strLIZ7, strLIZ8, jLongValue, numValueOf2, numValueOf3, numValueOf4, strDecode, lLJIILIIL, numLJIIJJI3, lLJIILIIL4, strLIZ21, strLIZ22, strLIZ23, strLIZ24, Integer.valueOf(iIntValue5), null, LIZ(intent, "source_btm_token"));
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
