package X;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W5Z implements InterfaceC815000Vy6 {
    public final C01GW LIZ = C452501pT.LIZIZ(new C814590VxR());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C805860VjM());

    @Override // X.InterfaceC815000Vy6
    public final void LIZ() {
        IOutAppPushDmCompensationManager iOutAppPushDmCompensationManager = (IOutAppPushDmCompensationManager) this.LIZIZ.getValue();
        if (iOutAppPushDmCompensationManager != null) {
            iOutAppPushDmCompensationManager.LIZIZ();
        }
    }

    @Override // X.InterfaceC815000Vy6
    public final void LIZIZ() {
        IOutAppPushDmCompensationManager iOutAppPushDmCompensationManager = (IOutAppPushDmCompensationManager) this.LIZIZ.getValue();
        if (iOutAppPushDmCompensationManager != null) {
            iOutAppPushDmCompensationManager.LJIIJ();
        }
    }

    @Override // X.InterfaceC815000Vy6
    public final boolean LJFF() {
        return ((Boolean) C271570Akd.LIZ.getValue()).booleanValue();
    }

    public static String LJIIIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String[] strArr = (String[]) it2.next();
            String str = strArr[0];
            String str2 = strArr[2];
            if (Intrinsics.LJFF(str, "push_button_reply")) {
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "msg_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        return "";
                    }
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getMsgType() error: ");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC815000Vy6
    public final boolean LJI(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        if (!LJFF() || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "conv_id")) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "index")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
            return false;
        }
        try {
            long j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (c0y8tLJIL != null && j <= c0y8tLJIL.getReadIndex()) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_type");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                }
                Object value = this.LIZ.getValue();
                C0I0B.LJFF.LIZIZ();
                value.getClass();
                C20684815ws.LJIILLIIL("dm_push_message_intercepted", C2097608Jq.LJIIIIZZ(new Pair("conversation_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), new Pair("chat_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3), new Pair("message_type", str), new Pair("message_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4), new Pair(Scene.SCENE_SERVICE, "message_has_read")));
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    @Override // X.InterfaceC815000Vy6
    public final void LJII(List<? extends C869590Y9l> list) {
        IOutAppPushDmCompensationManager iOutAppPushDmCompensationManager = (IOutAppPushDmCompensationManager) this.LIZIZ.getValue();
        if (iOutAppPushDmCompensationManager != null) {
            iOutAppPushDmCompensationManager.LJIIJJI(list);
        }
    }

    @Override // X.InterfaceC815000Vy6
    public final C892090Yz9 LJIIIIZZ(String str) {
        String strLIZIZ = C461720I8s.LIZIZ();
        return new C892090Yz9(C817480W5a.LIZ().getLong(C817480W5a.LIZIZ(strLIZIZ, str, "_create_time"), -1L), C817480W5a.LIZ().getLong(C817480W5a.LIZIZ(strLIZIZ, str, "_push_rec_time"), -1L), C817480W5a.LIZ().getString(C817480W5a.LIZIZ(strLIZIZ, str, "_msg_type"), ""), C817480W5a.LIZ().getString(C817480W5a.LIZIZ(strLIZIZ, str, "_to_uid"), ""), C817480W5a.LIZ().getString(C817480W5a.LIZIZ(strLIZIZ, str, "_gd_label"), ""));
    }

    @Override // X.InterfaceC815000Vy6
    public final void LIZJ(String str, boolean z) {
        IOutAppPushDmCompensationManager iOutAppPushDmCompensationManager;
        if (z && (iOutAppPushDmCompensationManager = (IOutAppPushDmCompensationManager) this.LIZIZ.getValue()) != null) {
            iOutAppPushDmCompensationManager.LJIIL(str);
        }
    }

    public static void LJIIJ(int i, String str, String str2) {
        Long lLJIILIIL;
        if (str2.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("msg_body");
            if (strOptString == null) {
                return;
            }
            String strOptString2 = jSONObject.optString("region");
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            if (strOptString.length() != 0) {
                try {
                    byte[] bArrDecode = Base64.decode(strOptString, 0);
                    if (bArrDecode != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                        C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIIJ(new C869520Y9e(lLJIILIIL.longValue(), bArrDecode, strOptString2, 13, i, "outer_push", jCurrentTimeMillis));
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("decode message PB string error: ");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("storeMsgFromOutPush() error: ");
            sbLIZ2.append(e2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.InterfaceC815000Vy6
    public final void LIZLLL(Uri uri, List<String[]> list, String str) {
        long j;
        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chat_type") != null) {
            int i = 0;
            C1336205Ku.LIZ(false).getImChatService().LJJIII();
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_id");
                String str2 = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "to");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = LJIIIZ(list);
                }
                try {
                    j = CastLongProtector.parseLong(new JSONObject(str).optString("msg_create_time", "-1"));
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getMsgCreateTime() error: ");
                    sbLIZ.append(e);
                    C2188811AlT.LIZIZ(sbLIZ);
                    j = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                C817480W5a.LIZJ(j, System.currentTimeMillis(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, str2);
                if (((Boolean) C271090Ajr.LIZ.getValue()).booleanValue()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "inbox_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                        i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                    }
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.LAUNCH_FROM_OUT_PUSH);
                    LJIIJ(i, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMOutAppPushServiceImpl.notifyDMOutAppPushShow() error: ");
                sbLIZ2.append(e2);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }

    @Override // X.InterfaceC815000Vy6
    public final void LJ(Context context, String str, int i, String str2) {
        if (str.length() != 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C813800VwA(context, str, i, this, str2, null), 3);
        }
    }
}
